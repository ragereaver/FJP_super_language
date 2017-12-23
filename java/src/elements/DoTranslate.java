package elements;

import generatedParser.SLLanguageParser;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class DoTranslate extends WhileTranslate {

    public void runDo(SLLanguageParser.CycleContext ctx) {
        doCondition(ctx, ctx.expression());
        doBody(ctx.compoundStatement(0));
    }
}
