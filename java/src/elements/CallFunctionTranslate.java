package elements;

import Convertor.TypeConvertor;
import Convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.*;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 23.12.2017.
 */
public class CallFunctionTranslate {

    private ArrayList <String> types = new ArrayList<>();
    private ArrayList <String> varibles = new ArrayList<>();
    private int size = 0;
    private int address = 0;

    public void doFunctionCalling(SLLanguageParser.FunctionCallContext ctx) {
        String name = ctx.Identifier().getText();

        ParserRuleContext values = ctx.expression();
        prepareCalling(name, ctx, values, null);
    }

    public String prepareCalling( String identifier, ParserRuleContext ctx, ParserRuleContext values, String type){
        if (values != null) {
            storeValues(values);
        }


        if (!RegisteredFunction.functionExist(identifier, types)) {
            ErrorHandle.addError(EErrorCodes.FUNCTION_NOT_EXIST, ctx);
            return Validators.UNKNOWN_TYPE;
        }

        if (Validators.UNKNOWN_TYPE.equals(type)) {
            type = RegisteredFunction.getFunctionType(identifier, types);
        }

        TableOfCodes.addCall("-1", types, identifier);
        Symbol function = TableOfSymbols.findFunction(identifier, types);
        if (type != null && !RegisteredFunction.validFunctionType(identifier, types, type)) {
            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH, ctx);
        }

        if (function != null) {
            TableOfCodes.updateCall(types, identifier, String.valueOf(function.getAddress()));
        }

        TableOfSymbols.updateReturnType(type);
        return type;
    }

    private void storeValues(ParserRuleContext values){
        DeclarationTranslate declaration = new DeclarationTranslate();
        resolveAllParams(values, declaration, false);

        if (size > address) {
            Symbol params = TableOfSymbols.findByNameAllLevels(RegisteredFunction.PARAMS_NAME, true);
            if (params == null) {
                ErrorHandle.addError(EErrorCodes.FUNCTION_NOT_EXIST, values);
                return;
            }

            address = params.getAddress();
            resolveAllParams(values, declaration, true);
        }else {
            resolveAllParams(values, declaration, true);
        }

    }


    private void resolveAllParams(ParseTree child, DeclarationTranslate declaration, boolean isSolving) {

        if (child.getChildCount() != 1) {

            String left = child.getChild(0).getText();
            String right = child.getChild(2).getText();

            if (Validators.isCommaHere(left) && !Validators.isMethodHere(left)){
                resolveAllParams(child.getChild(0), declaration, isSolving);
            }else {

                resolveParameter(left, child.getChild(0), isSolving, declaration);
                saveToAddress();
            }

            if (Validators.isCommaHere(right) && !Validators.isMethodHere(right)){
                resolveAllParams(child.getChild(2), declaration, isSolving);
            }else {

                resolveParameter(right, child.getChild(2), isSolving, declaration);
                saveToAddress();
            }
        }else {
            resolveParameter(child.getText(), child.getChild(0), isSolving, declaration);
            saveToAddress();
        }
    }

    private void saveToAddress(){
        if (address > 2) {
            EInstructionSet.doInstruction(EInstructionSet.STORE, address++);
        }

    }

    private void resolveParameter(String value, ParseTree child, boolean isSolving, DeclarationTranslate declaration) {

        ParserRuleContext ctx;
        if (child.getChildCount() == 0){
            ctx = (ParserRuleContext) child.getParent();
        }else {
            ctx = (ParserRuleContext) child;
        }

        if (Validators.isAssignmentHere(value)) {
            ErrorHandle.addError(EErrorCodes.BAD_SYNTAX, ctx);
            return;
        }

        if (isSolving){
            declaration.handleAssigment(Validators.getType(value),value, ctx, value );
            types.add(TypeConvertor.convertArrayTypesToSimple(declaration.getLastType()));

        }else {
            size++;
        }
    }
}
