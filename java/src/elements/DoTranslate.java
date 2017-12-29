package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageParser;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class DoTranslate extends WhileTranslate {

    public void runDo(SLLanguageParser.CycleContext ctx) {

        doBody(ctx.compoundStatement(0));
    }

    public void exitDo(SLLanguageParser.CycleContext ctx) {
        doCondition(ctx.expression(), ctx.getStart());
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, 15); //přepsat adresu na konec
        EInstructionSet.doInstruction(EInstructionSet.JUMP, 6); //přepsat adresu na začátek do
    }
}
