package elements;

import Convertor.Validators;
import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

public class RepeatTranslate extends UntilTranslate {

    public void runRepeat(SLLanguageParser.CycleContext ctx) {
        SLLanguageMainListener.addAddress(TableOfCodes.getTableOfMainCode().size());
    }

    public void exitRepeat(SLLanguageParser.CycleContext ctx) {
        doCondition(ctx.expression(), ctx.getStart());
        negate(Validators.VARIABLE_TYPE_BOOLEAN, ctx.getStart());
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, -1); //přepsat adresu na konec
        EInstructionSet.doInstruction(EInstructionSet.JUMP, SLLanguageMainListener.getAddress()); //přepsat adresu na začátek do
        TableOfCodes.updateJumpCompare(TableOfSymbols.getObjectID(), String.valueOf(TableOfCodes.getTableOfMainCode().size()));
    }

}
