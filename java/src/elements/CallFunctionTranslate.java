package elements;

import Convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.ErrorHandle;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 23.12.2017.
 */
public class CallFunctionTranslate {

    public void doFunctionCalling(SLLanguageParser.FunctionCallContext ctx) {
        System.out.println("aaaaaaaaaaaaaa " + ctx.getText());
        String name = ctx.Identifier().getText();
        TableOfSymbols.Symbol symbol = TableOfSymbols.findFunction(name, 0, null);

        if (symbol == null) {
            System.out.println(name);
            ErrorHandle.addError(EErrorCodes.FUNCTION_NOT_EXIST, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
            return;
        }

        //TODO prepracovani vyhledavani pro funkce - zavislost na poctu a typu parametru
        SLLanguageParser.FunctionValuesContext values = ctx.functionValues();
        if (storeValues(symbol, values)) {
            EInstructionSet.doInstruction(EInstructionSet.CALL, symbol.getAddress());
        }
    }

    private boolean storeValues( TableOfSymbols.Symbol symbol, SLLanguageParser.FunctionValuesContext values){
        String value;
        String type, name;
        int index = 0;
        ParseTree child = values;

        while (child != null) {
            if (child.getChildCount() > 1) {
                value = child.getChild(0).getText();
                child = child.getChild(2);
            }else {
                value = child.getChild(0).getText();
                child = null;
            }
            if (index >= symbol.getCountParam()){
                ErrorHandle.addError(EErrorCodes.FUNCTION_NOT_EXIST,
                        values.getStart().getLine(),
                        values.getStart().getCharPositionInLine());

                return false;
            }

            type = symbol.getTypeAtIndex(index);
            name = symbol.getParamAtIndex(index);
            System.out.println(type + "    " + name);
            if (Validators.validateType(type, value)){
                //TODO> doplneni promennych
            }else {
                return false;
            }

            index++;
        }
        return true;
    }
}
