package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class BreakersTranslate extends SimpleAssigmentTranslate{

    public void doBreak(SLLanguageParser.JumpStatementContext ctx) {

        EInstructionSet.doInstruction(EInstructionSet.JUMP, -1);

    }

    public void doContinue(SLLanguageParser.JumpStatementContext ctx) {
        EInstructionSet.doInstruction(EInstructionSet.JUMP, SLLanguageMainListener.getAddressWithoutRemove());
    }

    public void doReturn(SLLanguageParser.JumpStatementContext ctx, String functionType) {
        super.handleAssigment(functionType, ctx, false, ctx.expression().getText(), ctx.expression(), RETURN_NAME);
        EInstructionSet.storeInstruction(RETURN_NAME);
        EInstructionSet.doInstruction(EInstructionSet.RETURN, 0, 0);
    }


}