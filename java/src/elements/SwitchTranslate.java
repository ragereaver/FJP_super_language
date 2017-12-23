package elements;

import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class SwitchTranslate extends WhileTranslate{

    public void runSwitch(SLLanguageParser.CycleContext ctx) {
        doCondition(ctx, ctx.expression()); // asi bude potreba vlastni metoda
        ctx.labeledStatement().forEach(labeledStatementContext -> doLabeledStatements(labeledStatementContext));
    }

    public void doLabeledStatements(SLLanguageParser.LabeledStatementContext statement){
        //TODO: rozdelat cases
        //switch mame jen pro cisla
    }

}
