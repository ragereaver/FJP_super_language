package elements;

import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.Token;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class ForTranslate extends WhileTranslate{
    public void runFor(SLLanguageParser.CycleContext ctx) {

        doCondition(ctx.forCondition(), ctx.getStart());
        doBody(ctx.compoundStatement(0));
    }

    @Override
    public void doCondition(ParseTree condition, Token token) {
        //TODO: urcite jine zpracovani podminky
    }
}
