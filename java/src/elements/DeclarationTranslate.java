package elements;

import Convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import enums.EOperationCodes;
import generatedParser.SLLanguageParser.InitDeclaratorListContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.ErrorHandle;
import tableClasses.TableOfSymbols;


import java.util.ArrayList;

import static generatedParser.SLLanguageParser.*;

/**
 * Created by BobrZlosyn on 18.12.2017.
 */
public class DeclarationTranslate {

    private String lastType;

    public DeclarationTranslate () {
        lastType = "";
    }

    /**
     * zpracovava normalni deklarace ( vse krome pole)
     * @param ctx
     * @return
     */
    public void doStandardDeclaration(DeclarationContext ctx){
        if (ctx.getChildCount() <= 1) {
            return; // preskoceni deklarace poli
        }

        String type = ctx.typeSpecifier().getText();
        doDeclarationInner(type, ctx.getChild(1), true);
    }

    /**
     * vraci hodnotu
     * @param type
     * @param children
     * @param isDeclaration
     * @return
     */
    public String doDeclarationInner(String type, ParseTree children, boolean isDeclaration){

        ParserRuleContext ctx = (ParserRuleContext) children;

        if (ctx.getChildCount() == 1) {
                singleAssignment(type, ctx, isDeclaration);

        }else {
            System.out.println("mnohhhooooooooooooo  " + ctx.getText());
            innerMultipleAssigment(ctx, ctx.getStart(), type, isDeclaration);
        }

        return "";
    }


    private void singleAssignment (String type, ParserRuleContext ctx, boolean isDeclaration) {
        String identifier;
        String value;
        identifier = ctx.getChild(0).getChild(0).getText();
        ParserRuleContext assignmentExpCtx = (ParserRuleContext) ctx.getChild(0).getChild(2);
        boolean isEmpty = true;
        boolean isConst = false;
        boolean isVariable = true;

        if (assignmentExpCtx != null) {
            value = assignmentExpCtx.getText();
            isEmpty = false;

            if (type.equals(Validators.VARIABLE_TYPE_BOOLEAN)) {
                if (Validators.isTernalIfHere(value)) {
                    // obstara se jinde - trida IfTranslate
                    System.out.println("-------- ternalni --------");
                    return;
                }
            }

            if (Validators.isDimHere(value)
                    || Validators.isArrayHere(value)
                    || Validators.isSignHere(value)) { // reseni zavorkovych vyrazu
                resolveMathProblems(assignmentExpCtx, ctx.getStart(), 0, type);

            }else {
                EInstructionSet.handleVariables(value, ctx.getStart(), type);
            }
        }

        if (isDeclaration) {
            TableOfSymbols.addSymbol(ctx.getStart(), identifier, isVariable, type, 0, isConst, isEmpty);
        }
    }


    /**
     * rekurzivni procházení listu deklarací
     * @param child
     * @param token
     * @param type
     */
    private void innerMultipleAssigment(ParseTree child, Token token, String type, boolean isDeclaration) {
        if (child.getChildCount() != 1) {
            if (child.getChild(1).getText().equals("=")) {
                String left = child.getChild(0).getText();
                String right = child.getChild(2).getText();

                if (child.getChildCount() > 1) {
                    resolveMathProblems(child.getChild(2), token, 0, type);
                }else {
                    EInstructionSet.handleVariables(right, token, type);
                }

                if (isDeclaration) {
                    TableOfSymbols.addSymbolVariable(token, left, type, 0);
                }


            }else {
                innerMultipleAssigment(child.getChild(0), token, type, isDeclaration);
                innerMultipleAssigment(child.getChild(2), token, type, isDeclaration);
            }
        }else {
            if (isDeclaration) {
                String identifier = child.getText();
                TableOfSymbols.addSymbol(token, identifier, true, type, 0, false, true);
            }
        }
    }

    private void innerMultipleValueAssignemnt(ParseTree child, Token token, String type, boolean isDeclaration) {
        if (child.getChildCount() != 1) {
            if (child.getChild(1).getText().equals("=")) {
                String left = child.getChild(0).getText();
                String right = child.getChild(2).getText();

                if (child.getChildCount() > 1) {
                    resolveMathProblems(child.getChild(2), token, 0, type);
                }else {
                    EInstructionSet.handleVariables(right, token, type);
                }

                if (isDeclaration) {
                    TableOfSymbols.addSymbolVariable(token, left, type, 0);
                }


            }else {
                innerMultipleAssigment(child.getChild(0), token, type, isDeclaration);
                innerMultipleAssigment(child.getChild(2), token, type, isDeclaration);
            }
        }else {
            if (isDeclaration) {
                String identifier = child.getText();
                TableOfSymbols.addSymbol(token, identifier, true, type, 0, false, true);
            }
        }
    }

    /**
     * resi problem se zavorkami (zatim jen cisla)
     * @param nextChild
     * @param ctx
     * @param depth
     * @return
     */
    public String resolveMathProblems(ParseTree nextChild, Token ctx, int depth, String defType ){
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
                    String left = resolveMathProblems(nextChild.getChild(0), ctx, depth + 1, defType);
                    String sign = nextChild.getChild(1).getText();
                    String right = resolveMathProblems(nextChild.getChild(2), ctx, depth + 1, defType);

                    if (Validators.isArrayHere(sign)){
                        loadValueFromArray(left, ctx, right, defType + "[]");
                        lastType = defType;

                    }else {
                        String leftType = Validators.getType(ctx, left);
                        String rightType = Validators.getType(ctx, right);

                        System.out.println("Ltype " + leftType + " value " + left);
                        System.out.println("Rtype " + rightType + " value " + right);
                        System.out.println("Lasttype " + lastType + " sign " + sign);
                        System.out.println("---------------------------------------");
                        if (leftType.isEmpty()) {
                            leftType = lastType;
                        }

                        if (rightType.isEmpty()) {
                            rightType = lastType;
                        }

                        String resultType = Validators.validateAction(leftType, rightType, sign);
                        if (resultType != null) {
                            lastType = resultType;

                            loadValue(left, ctx, leftType);
                            loadValue(right, ctx, leftType);
                            EOperationCodes.doOperation(sign);

                        }else {
                            ErrorHandle.addError(EErrorCodes.INVALID_ACTION, ctx.getLine(), ctx.getCharPositionInLine());
                        }


                    }

                    return res;
                }
            }
        }

        return res;
    }

    private void loadValue(String value, Token token, String type){
        if (!value.equals("")) {
            EInstructionSet.handleVariables(value, token, type);
        }
    }

    private void loadValueFromArray(String value, Token token, String index, String defType){
        if (!value.equals("")) {
            EInstructionSet.loadArrayVariable(value, token, index, defType);
        }
    }
}
