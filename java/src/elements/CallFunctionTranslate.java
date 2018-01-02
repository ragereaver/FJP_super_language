package elements;

import Convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;
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
        prepareCalling(name, values, null);
    }

    public void prepareCalling( String identifier, ParserRuleContext values, String type){
        storeValues(values);

        if (!TableOfSymbols.functionExist(identifier, types)) {
            ErrorHandle.addError(EErrorCodes.FUNCTION_NOT_EXIST,
                    values.getStart().getLine(), values.getStart().getCharPositionInLine());
        }else {
            TableOfCodes.addCall("-1", types, identifier);
            TableOfSymbols.Symbol function = TableOfSymbols.findFunction(identifier, types);
            if (type != null && !TableOfSymbols.validFunctionType(identifier, types, type)) {
                ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH,
                        values.getStart().getLine(), values.getStart().getCharPositionInLine());
            }

            if (function != null) {
                TableOfCodes.updateCall(types, identifier, String.valueOf(function.getAddress()));
            }
        }
    }

    private void storeValues(ParserRuleContext values){
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
            System.out.println("---------" + value + "      " + Validators.getType(value));
            types.add(Validators.getType(value));
            varibles.add(value);
        }
    }
}
