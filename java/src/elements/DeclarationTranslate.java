package elements;

import Convertor.TypeConvertor;
import Convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import enums.EOperationCodes;
import generatedParser.SLLanguageParser.InitDeclaratorListContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.ErrorHandle;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

import java.util.ArrayList;

import static generatedParser.SLLanguageParser.*;

/**
 * Created by BobrZlosyn on 18.12.2017.
 */
public class DeclarationTranslate {
    private String type;
    private ArrayList<String> variables = new ArrayList<>();
    private ArrayList values = new ArrayList<>();

    /**
     * zpracovava normalni deklarace ( vse krome pole)
     * @param ctx
     * @return
     */
    public void doStandardDeclaration(DeclarationContext ctx){
        System.out.println(ctx.getText());

        // preskoceni deklarace poli
        if (ctx.getChildCount() > 1) {
            String type = ctx.typeSpecifier().getText();

            String value = doDeclarationInner(type, ctx.getChild(1), 1);

        }else {

        }
    }

    /**
     * vraci hodnotu
     * @param type
     * @param children
     * @param depth
     * @return
     */
    private String doDeclarationInner(String type, ParseTree children, int depth){

        InitDeclaratorListContext ctx = (InitDeclaratorListContext) children;
        if (children.getChildCount() == 1) {
            singleAssignment(type, ctx);

        }else {
            innerMultipleAssigment(ctx, ctx.getStart(), type);
        }

        System.out.println("konec \n");
        return "";
    }


    public void singleAssignment (String type, InitDeclaratorListContext ctx) {
        String identifier;
        String value;
        identifier = ctx.initDeclarator().Identifier().getText();

        AssignmentExpressionContext assignmentExpCtx = ctx.initDeclarator().assignmentExpression();
        if (assignmentExpCtx != null) {
            value = assignmentExpCtx.getText();

            if (type.equals(Validators.VARIABLE_TYPE_BOOLEAN)) {
                if (Validators.isTernalIfHere(value)) {
                    // obstara se jinde - trida IfTranslate
                    return;
                }
            }

            if(Validators.isDimHere(value)) { // reseni zavorkovych vyrazu
                resolveMathProblems(assignmentExpCtx, ctx.getStart(), 0);
                TableOfSymbols.addSymbol(ctx.getStart(), identifier, true, type, 0, false);

            }else {
                if (Validators.isArrayHere(value)) {// reseni prirazeni pole
                    //TODO: dosazeni promenne v poli

                }else {// reseni prirazeni pole
                    if (Validators.validateType(type, value)) {
                        EInstructionSet.handleVariables(value, ctx.getStart(), type);
                        TableOfSymbols.addSymbol(ctx.getStart(), identifier, true, type, 0, false);
                    }
                }
            }


        }else {
            TableOfSymbols.addSymbol(ctx.getStart(), identifier, true, type, 0, false, true);
        }

    }

    private void innerMultipleAssigment(ParseTree child, Token token, String type) {
        if (child.getChildCount() != 1) {
            if (child.getChild(1).getText().equals("=")) {
                String left = child.getChild(0).getText();
                String right = child.getChild(2).getText();

                if (child.getChildCount() > 1) {
                    resolveMathProblems(child.getChild(2), token, 0);
                    TableOfSymbols.addSymbol(token, left, true, type, 0, false);

                }else {
                    EInstructionSet.handleVariables(right, token, type);
                    TableOfSymbols.addSymbol(token, left, true, type, 0, false);
                }

            }else {
                innerMultipleAssigment(child.getChild(0), token, type);
                innerMultipleAssigment(child.getChild(2), token, type);
            }
        }else {
            String identifier = child.getText();
            TableOfSymbols.addSymbol(token, identifier, true, type, 0, false, true);
        }
    }

    /**
     * resi problem se zavorkami (zatim jen cisla)
     * @param nextChild
     * @param ctx
     * @param depth
     * @return
     */
    private String resolveMathProblems(ParseTree nextChild, Token ctx, int depth ){
        String res = "";
        for(int i = 0; i < 100; i++) {
            if (nextChild.getChildCount() == 1) {
                nextChild = nextChild.getChild(0);
                if (nextChild.getChild(0) == null) {
                    return nextChild.getText();
                }

            }else {
                if (nextChild.getChild(0).getText().equals("(")){
                    nextChild = nextChild.getChild(1);
                }else {

                    String left = resolveMathProblems(nextChild.getChild(0), ctx, depth + 1);
                    String sign = nextChild.getChild(1).getText();
                    String right = resolveMathProblems(nextChild.getChild(2), ctx, depth + 1);
                    System.out.println(left + "------------" + sign + "-----------" + right);
                    loadValue(left, ctx);
                    loadValue(right, ctx);

                    EOperationCodes.doOperation(sign);

                    return res;
                }
            }

        }

        return res;
    }

    private void loadValue(String value, Token token){
        if (!value.equals("")) {
            EInstructionSet.loadIntegerVariable(value, token);
        }
    }


}
