package elements;

import Convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.ErrorHandle;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 23.12.2017.
 */
public class CallFunctionTranslate {

    private ArrayList <String> types = new ArrayList<>();
    private ArrayList <String> varibles = new ArrayList<>();

    public void doFunctionCalling(SLLanguageParser.FunctionCallContext ctx) {
        String name = ctx.Identifier().getText();

        //TODO prepracovani vyhledavani pro funkce - zavislost na poctu a typu parametru
        SLLanguageParser.FunctionValuesContext values = ctx.functionValues();
        storeValues(values);

        if (!TableOfSymbols.functionExist(name, types)) {
            ErrorHandle.addError(EErrorCodes.FUNCTION_NOT_EXIST,
                    ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        }else {
            TableOfCodes.addCall("-1", types, name);

            TableOfSymbols.Symbol function = TableOfSymbols.findFunction(name, types);
            if (function != null) {
                TableOfCodes.updateCall(types, name, String.valueOf(function.getAddress()));
            }
        }
    }

    private void storeValues(SLLanguageParser.FunctionValuesContext values){
        String value;
        ParseTree child = values;

        while (child != null) {
            if (child.getChildCount() > 1) {
                value = child.getChild(0).getText();
                child = child.getChild(2);
            }else {
                value = child.getChild(0).getText();
                child = null;
            }

            types.add(Validators.getType(value));
            varibles.add(value);
        }
    }
}
