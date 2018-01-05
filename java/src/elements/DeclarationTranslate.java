package elements;

import Convertor.Validators;
import enums.EInstructionSet;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.TableOfSymbols;

import static generatedParser.SLLanguageParser.DeclarationContext;

/**
 * Created by BobrZlosyn on 18.12.2017.
 */
public class DeclarationTranslate extends SolveProblem {

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
             innerMultipleAssigment(ctx, ctx.getStart(), type, isDeclaration, children.getChild(0).getText() );
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
            handleAssigment(type, value, assignmentExpCtx, identifier);
        }

        if (isDeclaration) {
            TableOfSymbols.addSymbol(ctx.getStart(), identifier, isVariable, type, 0, isConst, isEmpty);
        }
    }

    public void handleAssigment(String type, String value, ParserRuleContext assignmentExpCtx, String identifier){

        lastType = Validators.UNKNOWN_TYPE;
        if (Validators.isTernalIfHere(value)) {
            TernalIfTranslate ternalIfTranslate = new TernalIfTranslate();
            ternalIfTranslate.doTernalIf(assignmentExpCtx, assignmentExpCtx.getStart(), type, true);
            return;
        }


        if (Validators.isAssignmentHere(assignmentExpCtx.getText())){
            multipleValueAssigment(assignmentExpCtx, assignmentExpCtx.getStart(), type, identifier, 0);
            return;
        }

        if (Validators.isMethodHere(assignmentExpCtx.getText())) {
            callFunction(assignmentExpCtx.getStart(), assignmentExpCtx, type);
            return;
        }
        getValue(value, type, assignmentExpCtx, assignmentExpCtx.getStart(), identifier);
    }



    private void multipleValueAssigment (ParseTree child, Token token, String type, String identifier, int depth) {
        if (child.getChildCount() != 1) {
            if (child.getChild(1).getText().equals(ASSIGN)) {
                String left = child.getChild(0).getText();

                if (child.getChildCount() > 1) {
                    multipleValueAssigment(child.getChild(2), token, type, left, depth + 1);
                }

                //nacteni hodnoty ktera ma byt prirazena
                if (Validators.validateType(type, left)) {
                    EInstructionSet.handleVariables(left, token, type, identifier, type);
                }


                //prirazeni do dalsi promenne
                if (depth == 0) {
                    return;
                }

                if (Validators.validateType(type, identifier)) {
                    EInstructionSet.storeInstruction(identifier, token);
                }

            }
        }else {

            getValue(child.getText(), type, child, token, identifier);

            if (Validators.validateType(type, identifier)) {
                EInstructionSet.storeInstruction(identifier, token);
            }
        }
    }
    /**
     * rekurzivni procházení listu deklarací
     * @param child
     * @param token
     * @param type
     */
    private void innerMultipleAssigment(ParseTree child, Token token, String type, boolean isDeclaration, String identifier) {
        if (child.getChildCount() != 1) {
            if (child.getChild(1).getText().equals(ASSIGN)) {
                String left = child.getChild(0).getText();
                String right = child.getChild(2).getText();

                if (child.getChildCount() > 1) {
                    resolveMathProblems(child.getChild(2), token, type, identifier);
                }else {
                    EInstructionSet.handleVariables(right, token, type, right, type);
                }

                if (isDeclaration) {
                    TableOfSymbols.addSymbolVariable(token, left, type, 0);
                }


            }else {
                innerMultipleAssigment(child.getChild(0), token, type, isDeclaration, identifier);
                innerMultipleAssigment(child.getChild(2), token, type, isDeclaration, identifier);
            }
        }else {
            if (isDeclaration) {
                identifier = child.getText();
                TableOfSymbols.addSymbol(token, identifier, true, type, 0, false, true);
            }
        }
    }

}
