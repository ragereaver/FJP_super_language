package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import tableClasses.RegisteredFunction;

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
        super.handleAssigment(functionType, false, ctx.expression().getText(), ctx.expression(), RegisteredFunction.RETURN_NAME);
        EInstructionSet.storeInstruction(RegisteredFunction.RETURN_NAME);
        EInstructionSet.doInstruction(EInstructionSet.RETURN, 0, 0);
    }


}
