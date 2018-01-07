package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class WhileTranslate extends IfTranslate{

    public void runWhile(SLLanguageParser.CycleContext ctx) {

        SLLanguageMainListener.addAddress(TableOfCodes.getTableOfMainCode().size());
        doCondition(ctx.logicalOrExpression(), ctx.getStart()); // teoreticky by to melo byt stejne
        //momentalně se body překládá po while
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, -1); //přepsat adresu na dalsi instrukci po while
    }


    public void exitWhile(SLLanguageParser.CycleContext ctx) {
        EInstructionSet.doInstruction(EInstructionSet.JUMP, SLLanguageMainListener.getAddress()); //přepsat adresu na začátek while
        String endAdress = String.valueOf(TableOfCodes.getTableOfMainCode().size());
        TableOfCodes.updateJumpCompare(TableOfSymbols.getObjectID(), endAdress);
        TableOfCodes.updateJump(TableOfSymbols.getObjectID(), endAdress);
    }
}
