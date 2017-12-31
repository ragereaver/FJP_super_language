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
public class UntilTranslate extends WhileTranslate{

    public void runUntil(SLLanguageParser.CycleContext ctx) {
        SLLanguageMainListener.addAddress(TableOfCodes.getTableOfMainCode().size());
        doCondition(ctx.expression(), ctx.getStart()); // teoreticky by to melo byt stejne, navratova hodnota je obracene jen
        doBody(ctx.compoundStatement()); // melo by byt stejne
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, -1); //zatim je to while, dokud nebudem umět negaci
    }

    public void exitUntil(SLLanguageParser.CycleContext ctx) {
        EInstructionSet.doInstruction(EInstructionSet.JUMP, SLLanguageMainListener.getAddress()); //prepsat adresu na začátek until, před podmínku
        TableOfCodes.updateJumpCompare(TableOfSymbols.getObjectID(), String.valueOf(TableOfCodes.getTableOfMainCode().size()));
    }
}
