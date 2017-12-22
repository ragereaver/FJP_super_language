package elements;

import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class UntilTranslate extends WhileTranslate{

    public void runUntil(SLLanguageParser.CycleContext ctx) {

        doCondition(ctx.expression()); // teoreticky by to melo byt stejne, navratova hodnota je obracene jen
        doBody(ctx.compoundStatement(0)); // melo by byt stejne
    }

}
