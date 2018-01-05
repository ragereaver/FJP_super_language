package elements;

import Convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import enums.EOperationCodes;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.ErrorHandle;
import tableClasses.RegisteredFunction;
import tableClasses.Symbol;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 18.12.2017.
 */
public class SolveProblem {

    protected String lastType;
    protected final String NEGATE_SIGN = "!";
    protected final String BEGIN_DIM = "(";
    protected final String ASSIGN = "=";
    protected final String EMPTY_ANSWER = "";

    public SolveProblem() {
        lastType = "";
    }

    public String getLastType() {
        return lastType;
    }

    protected void callFunction(Token token, ParserRuleContext assignmentExpCtx, String type){
        CallFunctionTranslate callFunction = new CallFunctionTranslate();
        ParserRuleContext arguments = listToEndChild(assignmentExpCtx);
        String identifier = arguments.getChild(0).getText();

        if (arguments.getChildCount() > 3) {
            arguments = (ParserRuleContext) arguments.getChild(2);
        }else {
            arguments = null;
        }

        lastType = callFunction.prepareCalling(identifier, arguments, type);
        EInstructionSet.loadVariableName(RegisteredFunction.RETURN_NAME, token, lastType);
    }

    private ParserRuleContext listToEndChild(ParseTree ctx){
        while (ctx.getChildCount() == 1) {
            ctx = ctx.getChild(0);
        }

        return (ParserRuleContext) ctx;
    }


    public void getValue(String value, String type, ParseTree assignmentExpCtx, Token token, String identifier ) {
        if (Validators.isDimHere(value)
                || Validators.isArrayHere(value)
                || Validators.isSignHere(value)) { // reseni zavorkovych vyrazu
            resolveMathProblems(assignmentExpCtx, token, type, identifier);
        }else {
            boolean negate = false;
            if (Validators.isNegateSignHere(value)){
                value = value.substring(1);
                negate = true;
            }

            lastType = type;
            EInstructionSet.handleVariables(value, token, type, identifier);

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
        EOperationCodes.doOperation(EOperationCodes.NOT_EQUAL);

    }

    /**
     * resi problem se zavorkami (zatim jen cisla)
     * @param nextChild
     * @param ctx
     * @return
     */
    public String resolveMathProblems(ParseTree nextChild, Token ctx, String defType, String identifier ){
        for(int i = 0; i < 100; i++) {

            if (nextChild.getChildCount() == 1) {
                nextChild = nextChild.getChild(0);
                if (nextChild.getChild(0) == null) {
                    return nextChild.getText();
                }

            }else {

                if (nextChild.getChild(0).getText().equals(BEGIN_DIM)){
                    nextChild = nextChild.getChild(1);
                }else {

                    if (Validators.isMethodHere(nextChild.getText())) {
                        callFunction(ctx, (ParserRuleContext) nextChild, defType);
                        return EMPTY_ANSWER;
                    }


                    if (nextChild.getChild(0) instanceof SLLanguageParser.UnaryOperatorContext) {
                        return solveUnaryMinus(nextChild, ctx, defType, identifier);
                    }

                    String left = resolveMathProblems(nextChild.getChild(0), ctx, defType, identifier);
                    if (left.equals(NEGATE_SIGN)) {
                        String mid = nextChild.getChild(1).getText();
                        if (Validators.isDimHere(mid)
                                || Validators.isArrayHere(mid)
                                || Validators.isSignHere(mid)) {
                            resolveMathProblems(nextChild.getChild(1), ctx, defType, identifier);
                        }else {
                            String type = Validators.getType(mid);
                            EInstructionSet.handleVariables(mid, ctx, type, identifier );
                            lastType = type;
                        }

                        negate(lastType, ctx);

                    } else {
                        innerResolveMath(left, nextChild, ctx, defType, identifier);
                    }

                    return EMPTY_ANSWER;
                }
            }
        }

        return EMPTY_ANSWER;
    }

    private String solveUnaryMinus (ParseTree nextChild, Token token, String defType, String identifier){
        String sign = nextChild.getChild(0).getText();
        String number = nextChild.getChild(1).getText();

        //lze jen pro minus
        if (EOperationCodes.MINUS.getOperationSign().equals(sign)) {
            String typ = Validators.getType(token, number);

            // zjisti zda je funkce nebo promenna a nacti hodnotu
            if (Validators.isMethodHere(number)) {
                callFunction(token, (ParserRuleContext) nextChild.getChild(1), defType);
                typ = lastType;
            }else {
                if (Validators.isArrayHere(number)) {
                    ParseTree array = listToEndChild(nextChild.getChild(1));
                    number = array.getChild(0).getText();
                    if (array.getChild(2) == null) {
                        ErrorHandle.addError(EErrorCodes.BAD_SYNTAX, token);
                        return EMPTY_ANSWER;
                    }


                    String index = array.getChild(2).getText();
                    loadValueFromArray(number, (ParserRuleContext) array.getChild(2), index, defType + "[]");
                    typ = defType;
                }else {
                    loadValue(number, token, typ, identifier);
                }

            }

            // zjisti vysledny typ operace
            String resultTyp = Validators.validateAction(typ, typ, EOperationCodes.UNARY_MINUS.getOperationSign());
            if (resultTyp != null) {
                lastType = resultTyp;
                EOperationCodes.doOperation(EOperationCodes.UNARY_MINUS);
            }else {
                ErrorHandle.addError(EErrorCodes.INVALID_ACTION, token);
            }

            return EMPTY_ANSWER;
        }

        return number;
    }

    private void innerResolveMath(String left, ParseTree nextChild, Token ctx, String defType, String identifier) {
        String sign = nextChild.getChild(1).getText();


        if (Validators.isArrayHere(sign)){
            loadValueFromArray(left, (ParserRuleContext) nextChild.getChild(2) , nextChild.getChild(2).getText(), defType);
            lastType = defType;

        }else {
            String right = resolveMathProblems(nextChild.getChild(2), ctx, defType, identifier);

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

                loadValue(left, ctx, leftType, identifier);
                loadValue(right, ctx, leftType, identifier);
                EOperationCodes.doOperation(sign);

            }else {
                ErrorHandle.addError(EErrorCodes.INVALID_ACTION, ctx);
            }
        }
    }

    private void loadValue(String value, Token token, String type, String identifer){
        if (!value.isEmpty()) {
            EInstructionSet.handleVariables(value, token, type, identifer);
        }
    }

    private void loadValueFromArray(String value, ParserRuleContext ctx, String index, String defType){
        if (!value.isEmpty()) {
            if (!loadIndexForArray(value, index, ctx)){
                if(defType.contains(Validators.VARIABLE_TYPE_BOOLEAN)) {
                    EInstructionSet.loadArrayVariable(value, ctx.getStart(), index, Validators.VARIABLE_TYPE_ARRAY_BOOLEAN);
                }else {
                    EInstructionSet.loadArrayVariable(value, ctx.getStart(), index, Validators.VARIABLE_TYPE_ARRAY_INT);
                }

            }
        }
    }

    private boolean loadIndexForArray(String value, String index, ParserRuleContext ctx){
        if (Validators.isSignHere(index)
                || Validators.isArrayHere(index)
                || Validators.isMethodHere(index)) {

            Symbol array = TableOfSymbols.findByNameAllLevels(value, true);
            if (array == null) {
                return true;
            }
            int level = TableOfSymbols.getActualLevel() - array.getLevel();
            if (level != 0) {
                EInstructionSet.doInstruction(EInstructionSet.LITERAL, 0, level);
            }

            //pocitam index
            DeclarationTranslate declarationTranslate = new DeclarationTranslate();
            declarationTranslate.handleAssigment(Validators.VARIABLE_TYPE_INT, index, ctx, index);
            EInstructionSet.justLoadArrayVariable(array);

            return true;
        }

        return false;
    }
}
