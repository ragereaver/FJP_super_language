package elements;

import enums.EErrorCodes;
import generatedParser.SLLanguageParser;
import tableClasses.ErrorHandle;
import tableClasses.TableOfSymbols;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class ArrayDeclarationTranslate {
    private String type;
    private ArrayList<String> variables = new ArrayList<>();
    private ArrayList values = new ArrayList<>();
    /**
     * zpracovava deklaraci pole
     * @param ctx
     * @return
     */
    public boolean doArrayDeclaration(SLLanguageParser.ArrayDeclarationContext ctx) {

        int firstTypeIndex = 0;
        int secondTypeIndex = 1;

        type = ctx.typeSpecifier(firstTypeIndex).getText();
        if (!type.equals(ctx.typeSpecifier(secondTypeIndex).getText())){
            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH_ARRAY, ctx);
            return false;
        }

        String arrSize = ctx.DigitSequence().getText();

        values.add(Integer.parseInt(arrSize));
        variables.add(ctx.Identifier().toString().substring(1, ctx.Identifier().toString().length() - 1));
        type +=  "[]";

        return TableOfSymbols.addSymbolVariable(ctx.getStart(), variables.get(0), type, (int)values.get(0));
    }
}
