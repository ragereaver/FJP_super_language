package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class DoTranslate extends WhileTranslate {

    public void runDo(SLLanguageParser.CycleContext ctx) {
        SLLanguageMainListener.addAddress(TableOfCodes.getTableOfMainCode().size());
    }

    public void exitDo(SLLanguageParser.CycleContext ctx) {
        doCondition(ctx.logicalOrExpression(), ctx.getStart());
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, -1); //přepsat adresu na konec
        EInstructionSet.doInstruction(EInstructionSet.JUMP, SLLanguageMainListener.getAddress()); //přepsat adresu na začátek do
        String endAdress = String.valueOf(TableOfCodes.getTableOfMainCode().size());
        TableOfCodes.updateJumpCompare(TableOfSymbols.getObjectID(), endAdress);
        TableOfCodes.updateJump(TableOfSymbols.getObjectID(), endAdress);
    }
}
