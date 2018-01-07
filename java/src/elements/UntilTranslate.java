package elements;

import convertor.Validators;
import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class UntilTranslate extends WhileTranslate{

    public void runUntil(SLLanguageParser.CycleContext ctx) {
        SLLanguageMainListener.addAddress(TableOfCodes.getTableOfMainCode().size());
        doCondition(ctx.logicalOrExpression(), ctx.getStart()); // teoreticky by to melo byt stejne, navratova hodnota je obracene jen

        negate(Validators.VARIABLE_TYPE_BOOLEAN, ctx.getStart());
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, -1); //zatim je to while, dokud nebudem umět negaci
    }

    public void exitUntil(SLLanguageParser.CycleContext ctx) {
        EInstructionSet.doInstruction(EInstructionSet.JUMP, SLLanguageMainListener.getAddress()); //prepsat adresu na začátek until, před podmínku
        String endAdress = String.valueOf(TableOfCodes.getTableOfMainCode().size());
        TableOfCodes.updateJumpCompare(TableOfSymbols.getObjectID(), endAdress);
        TableOfCodes.updateJump(TableOfSymbols.getObjectID(), endAdress);
    }
}
