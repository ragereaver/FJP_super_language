package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class SwitchTranslate extends WhileTranslate{

    public void runSwitch(SLLanguageParser.CycleContext ctx) {
        for(int i = 0; i < ctx.labeledStatement().size(); i++){
            System.out.println(ctx.labeledStatement(i).getChild(1).getText());

            EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, 5); //skok na další case;
        }
        //doCondition(ctx.expression(), ctx.getStart()); // asi bude potreba vlastni metoda
        System.out.println(ctx.labeledStatement(0).getText());
        ctx.labeledStatement().forEach(labeledStatementContext -> doLabeledStatements(labeledStatementContext));

    }

    public void doLabeledStatements(SLLanguageParser.LabeledStatementContext statement){

        //TODO: rozdelat cases
        //switch mame jen pro cisla
    }

    public void exitSwitch(SLLanguageParser.CycleContext ctx) {
        EInstructionSet.doInstruction(EInstructionSet.JUMP, 13); //přepsat adresu na konec case?
    }
}
