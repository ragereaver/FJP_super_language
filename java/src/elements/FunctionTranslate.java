package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageBaseListener;
import generatedParser.SLLanguageParser;
import javafx.scene.control.Tab;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.TableOfSymbols;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class FunctionTranslate extends SLLanguageBaseListener{
    private boolean hasToReturn;
    public FunctionTranslate () {
        hasToReturn = false;
    }

    private String createReturnableName(String name){
            return "*return_int";
    }

    public void doFunctionDefinition(SLLanguageParser.FunctionDefinitionContext ctx) {
        String type = ctx.typeSpecifier().getText();
        String name = ctx.Identifier().getText();
        SLLanguageParser.InitListContext variables = ctx.initList();

        boolean success = TableOfSymbols.addSymbolFunction(ctx.getStart(), name, type);
        if (!success) {
            return;
        }
        TableOfSymbols.setLevel(true);


        if (!type.equals("void")) {
            hasToReturn = true;
        }

        if (variables != null) {
            createVariables(variables);
        }
    }


    private void createVariables(SLLanguageParser.InitListContext variables) {
        String type;
        String name;
        ParseTree child = variables;
        ArrayList <String> params = new ArrayList<>();
        ArrayList <String> types = new ArrayList<>();

        while (child != null) {
            if (child.getChildCount() > 2) {
                type = child.getChild(0).getText();
                name = child.getChild(1).getText();
                child = variables.getChild(3);
            }else {
                type = child.getChild(0).getText();
                name = child.getChild(1).getText();
                child = null;
            }

            types.add(type);
            params.add(name);

            TableOfSymbols.addSymbolVariable(variables.getStart(), name, type, 0);
        }

        TableOfSymbols.updateFunction(params, types);

    }
}
