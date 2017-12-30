package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class SwitchTranslate extends WhileTranslate{

    public void runSwitch(SLLanguageParser.CycleContext ctx) {

        //doCondition(ctx.expression(), ctx.getStart()); // asi bude potreba vlastni metoda

        SLLanguageMainListener.variable = ctx.expression().start;

        ctx.labeledStatement().forEach(labeledStatementContext -> doLabeledStatements(labeledStatementContext));

    }

    public void doLabeledStatements(SLLanguageParser.LabeledStatementContext statement){

        //case ma vlastni translate
        //switch mame jen pro cisla
    }

    public void exitSwitch(SLLanguageParser.CycleContext ctx) {
        TableOfCodes.updateJump(TableOfSymbols.getObjectID(), String.valueOf(TableOfCodes.getTableOfMainCode().size()));
    }
}
