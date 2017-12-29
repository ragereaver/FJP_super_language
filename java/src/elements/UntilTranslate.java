package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class UntilTranslate extends WhileTranslate{

    public void runUntil(SLLanguageParser.CycleContext ctx) {

        doCondition(ctx.expression(), ctx.getStart()); // teoreticky by to melo byt stejne, navratova hodnota je obracene jen
        doBody(ctx.compoundStatement()); // melo by byt stejne
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, 25); //zatim je to while, dokud nebudem umět negaci
    }

    public void exitUntil(SLLanguageParser.CycleContext ctx) {
        EInstructionSet.doInstruction(EInstructionSet.JUMP, 14); //prepsat adresu na začátek until, před podmínku
    }
}
