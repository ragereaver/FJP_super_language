package elements;

import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.xml.sax.ErrorHandler;
import tableClasses.ErrorHandle;
import tableClasses.TableOfSymbols;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 18.12.2017.
 */
public class DeclarationTranslate {
    private String type;
    private ArrayList<String> variables = new ArrayList<>();
    private ArrayList values = new ArrayList<>();

    public void doStandardDeclaration(SLLanguageParser.DeclarationContext ctx){
        for (int i = 0; i <= ctx.getChildCount(); i++) {
            type = ctx.getChild(0).getText();
            System.out.println(ctx.getChildCount());
            doDeclarationInner(ctx.getChild(1), 1);
        }
    }

    private void doDeclarationInner(ParseTree children, int depth){
        System.out.println(children.getText());
    }

    public boolean doArrayDeclaration(SLLanguageParser.ArrayDeclarationContext ctx) {

        int firstTypeIndex = 0;
        int secondTypeIndex = 1;

        type = ctx.typeSpecifier(firstTypeIndex).getText();
        if (!type.equals(ctx.typeSpecifier(secondTypeIndex).getText())){
            ErrorHandle.addError(ErrorHandle.TYPE_MISMATCH_ARRAY, ctx.getRuleContext().getAltNumber());
            return false;
        }

        String arrSize = ctx.DigitSequence().getText();

        values.add(Integer.parseInt(arrSize));
        variables.add(ctx.Identifier().toString().substring(1, ctx.Identifier().toString().length() - 1));

        if (!TableOfSymbols.addSymbol(variables.get(0), true, 0, type, (int)values.get(0), false)) {
            ErrorHandle.addError(ErrorHandle.VARIABLE_EXISTS, ctx.getRuleContext().getAltNumber());
            return false;
        }

        return true;
    }
}
