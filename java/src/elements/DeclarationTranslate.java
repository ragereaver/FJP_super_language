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
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;


import java.util.ArrayList;

import static generatedParser.SLLanguageParser.*;

/**
 * Created by BobrZlosyn on 18.12.2017.
 */
public class DeclarationTranslate {

    private String lastType;
    protected final String RETURN_NAME = "*return";


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

            handleAssigment(type, ctx, isDeclaration, value, assignmentExpCtx, identifier);
        }

        if (isDeclaration) {
            TableOfSymbols.addSymbol(ctx.getStart(), identifier, isVariable, type, 0, isConst, isEmpty);
        }
    }

    public void handleAssigment(String type, ParserRuleContext ctx, boolean isDeclaration, String value, ParserRuleContext assignmentExpCtx, String identifier){

        if (Validators.isTernalIfHere(value)) {
            TernalIfTranslate ternalIfTranslate = new TernalIfTranslate();
            ternalIfTranslate.doTernalIf(assignmentExpCtx, ctx.getStart(), type, true);
            if (isDeclaration) {
                TableOfSymbols.addSymbolVariable(ctx.getStart(), identifier, type, 0);
            }
            return;
        }

        if (Validators.isAssignmentHere(assignmentExpCtx.getText())){
            multipleValueAssigment(assignmentExpCtx, assignmentExpCtx.getStart(), type, isDeclaration, identifier);
            if (!isDeclaration) {
                EInstructionSet.handleVariables(identifier, assignmentExpCtx.getStart(), type);
            }
            return;
        }

        if (Validators.isMethodHere(assignmentExpCtx.getText())) {
            callFunction(ctx.getStart(), assignmentExpCtx, type);
            return;
        }

        getValue(value, type, assignmentExpCtx, ctx.getStart());
    }

    private void callFunction(Token token, ParserRuleContext assignmentExpCtx, String type){
        TableOfSymbols.addSymbolVariable(token, RETURN_NAME, type, -1);
        CallFunctionTranslate callFunction = new CallFunctionTranslate();
        PostfixExpressionContext function = (PostfixExpressionContext) listToEndChild(assignmentExpCtx);
        callFunction.prepareCalling(function.Identifier().getText(), function.functionValues(), type);
        EInstructionSet.loadVariableName(RETURN_NAME, token, type);
    }

    private ParserRuleContext listToEndChild(ParseTree ctx){
        while (ctx.getChildCount() == 1) {
            ctx = ctx.getChild(0);
        }

        return (ParserRuleContext) ctx;
    }


    public void getValue(String value, String type, ParseTree assignmentExpCtx, Token token ) {
        if (Validators.isDimHere(value)
                || Validators.isArrayHere(value)
                || Validators.isSignHere(value)) { // reseni zavorkovych vyrazu
            resolveMathProblems(assignmentExpCtx, token, type);
        }else {
            boolean negate = false;
            if (Validators.isNegateSignHere(value)){
                value = value.substring(1);
                negate = true;
            }
            EInstructionSet.handleVariables(value, token, type);

            if (negate) {
                negate(type, token);
            }
        }
    }

    public void negate(String type, Token token) {
        if (!type.equals(Validators.VARIABLE_TYPE_BOOLEAN)) {
            ErrorHandle.addError(EErrorCodes.INVALID_ACTION, token);
            return;
        }

        EInstructionSet.doInstruction(EInstructionSet.LITERAL, 1);
        EOperationCodes.doOperation("%");

    }

    private void multipleValueAssigment (ParseTree child, Token token, String type, boolean isDeclaration, String identifier) {
        if (child.getChildCount() != 1) {
            if (child.getChild(1).getText().equals("=")) {
                String left = child.getChild(0).getText();

                if (child.getChildCount() > 1) {
                    multipleValueAssigment(child.getChild(2), token, type, false, left);
                }

                //nacteni hodnoty ktera ma byt prirazena
                if (Validators.validateType(type, left)) {
                    EInstructionSet.handleVariables(left, token, type);
                }

                //prirazeni do dalsi promenne
                if (isDeclaration) {
                    TableOfSymbols.addSymbolVariable(token, identifier, type, 0);

                }else {
                    if (Validators.validateType(type, identifier)) {
                        EInstructionSet.storeInstruction(identifier);
                    }
                }
            }
        }else {
            getValue(child.getText(), type, child, token);

            if (Validators.validateType(type, identifier)) {
                EInstructionSet.storeInstruction(identifier);
            }
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
                    resolveMathProblems(child.getChild(2), token, type);
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
     * @return
     */
    public String resolveMathProblems(ParseTree nextChild, Token ctx, String defType ){
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

                    if (Validators.isMethodHere(nextChild.getText())) {
                        callFunction(ctx, (ParserRuleContext) nextChild, defType);
                        lastType = defType;
                        return res;
                    }

                    String left = resolveMathProblems(nextChild.getChild(0), ctx, defType);

                    if (left.equals("!")) {
                        String mid = nextChild.getChild(1).getText();
                        if (Validators.isDimHere(mid)
                                || Validators.isArrayHere(mid)
                                || Validators.isSignHere(mid)) {
                            resolveMathProblems(nextChild.getChild(1), ctx, defType);
                        }else {
                            String type = Validators.getType(mid);
                            EInstructionSet.handleVariables(mid, ctx, type);
                            lastType = type;
                        }

                        negate(lastType, ctx);

                    } else {
                        innerResolveMath(left, nextChild, ctx, defType);
                    }

                    return res;
                }
            }
        }

        return res;
    }

    private void innerResolveMath(String left, ParseTree nextChild, Token ctx, String defType) {
        String sign = nextChild.getChild(1).getText();
        String right = resolveMathProblems(nextChild.getChild(2), ctx, defType);

        if (Validators.isArrayHere(sign)){
            loadValueFromArray(left, ctx, right, defType + "[]");
            lastType = defType;

        }else {
            String leftType = Validators.getType(ctx, left);
            String rightType = Validators.getType(ctx, right);


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
                ErrorHandle.addError(EErrorCodes.INVALID_ACTION, ctx);
            }
        }
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
