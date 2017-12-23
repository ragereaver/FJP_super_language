package elements;

import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class WhileTranslate extends IfTranslate{

    public void runWhile(SLLanguageParser.CycleContext ctx) {

        doCondition(ctx.expression(), ctx.getStart()); // teoreticky by to melo byt stejne
        doBody(ctx.compoundStatement(0));
    }

    public void doBody(ParseTree body) {
        //TODO: telo cyklu
    }
}
