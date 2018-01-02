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
    private ArrayList <String> types;
    private ArrayList <String> variables;

    public FunctionTranslate () {
        hasToReturn = false;
        types = new ArrayList<>();
        variables = new ArrayList<>();
    }

    private String createReturnableName(String name){
            return "*return_int";
    }

    public boolean doFunctionDefinition(SLLanguageParser.FunctionDefinitionContext ctx) {
        String type = ctx.typeSpecifier().getText();
        String name = ctx.Identifier().getText();
        SLLanguageParser.InitListContext list = ctx.initList();

        //TableOfSymbols.setLevel(true);


        if (!type.equals("void")) {
            hasToReturn = true;
        }

        if (variables != null) {
            createVariables(list);
        }

        TableOfSymbols.addSymbolFunction(ctx.getStart(), name, type, types, variables);
        return hasToReturn;
    }


    private void createVariables(SLLanguageParser.InitListContext list) {
        String type;
        String name;
        ParseTree child = list;

        while (child != null) {
            if (child.getChildCount() > 2) {
                type = child.getChild(0).getText();
                name = child.getChild(1).getText();
                child = child.getChild(3);
            }else {
                type = child.getChild(0).getText();
                name = child.getChild(1).getText();
                child = null;
            }

            types.add(type);
            variables.add(name);

            TableOfSymbols.addSymbolVariable(list.getStart(), name, type, 0);
        }

    }

    public void registerFunction(SLLanguageParser.FunctionDefinitionContext ctx) {
        String type = ctx.typeSpecifier().getText();
        String name = ctx.Identifier().getText();
        SLLanguageParser.InitListContext variables = ctx.initList();

        TableOfSymbols.setLevel(true);

        if (variables != null) {
            getVariables(variables, name, type);
        }else {
            TableOfSymbols.registerFunction(ctx.getStart(), name, type, new ArrayList<>(), new ArrayList<>());
        }
    }


    private void getVariables(SLLanguageParser.InitListContext variables, String nameFunction, String typeFunction) {
        String type;
        String name;
        ParseTree child = variables;
        ArrayList <String> params = new ArrayList<>();
        ArrayList <String> types = new ArrayList<>();

        while (child != null) {
            if (child.getChildCount() > 2) {
                type = child.getChild(0).getText();
                name = child.getChild(1).getText();
                child = child.getChild(3);
            }else {
                type = child.getChild(0).getText();
                name = child.getChild(1).getText();
                child = null;
            }

            types.add(type);
            params.add(name);
        }

        TableOfSymbols.registerFunction(variables.getStart(), nameFunction, typeFunction, types, params);

    }

}
