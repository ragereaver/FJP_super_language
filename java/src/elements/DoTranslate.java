package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageParser;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class DoTranslate extends WhileTranslate {

    public void runDo(SLLanguageParser.CycleContext ctx) {
        doCondition(ctx.expression(), ctx.getStart());
        doBody(ctx.compoundStatement(0));
    }

    public void exitDo(SLLanguageParser.CycleContext ctx) {
       // EInstructionSet.doInstruction(EInstructionSet.JUMP, 18); //přepsat adresu na začátek do
    }
}
