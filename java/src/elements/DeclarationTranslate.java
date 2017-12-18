package elements;

import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 18.12.2017.
 */
public class DeclarationTranslate {
    private String type;
    private ArrayList<String> variables = new ArrayList<>();
    private ArrayList<String> values = new ArrayList<>();

    public void doDeclaration(SLLanguageParser.DeclarationContext ctx){
        for (int i = 0; i <= ctx.getChildCount(); i++) {
            type = ctx.getChild(0).getText();
            System.out.println(ctx.getChildCount());
            doDeclarationInner(ctx.getChild(1), 1);
        }
    }

    private void doDeclarationInner(ParseTree children, int depth){
        System.out.println(children.getText());
    }
}
