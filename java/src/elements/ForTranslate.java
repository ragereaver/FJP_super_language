package elements;

import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class ForTranslate extends WhileTranslate{
    public void runFor(SLLanguageParser.CycleContext ctx) {

        doCondition(ctx, ctx.forCondition());
        doBody(ctx.compoundStatement(0));
    }

    @Override
    public void doCondition(SLLanguageParser.CycleContext ctx, ParseTree condition) {
        //TODO: urcite jine zpracovani podminky
    }
}
