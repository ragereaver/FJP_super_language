package elements;

import convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import enums.EOperationCodes;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.Token;
import tableClasses.ErrorHandle;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

public class CaseTranslate {

    public void doCase(SLLanguageParser.LabeledStatementContext ctx, Token variable){

        if(EInstructionSet.loadIntegerVariable(variable.getText(), variable, Validators.VARIABLE_TYPE_INT)){
            if(1 < ctx.getChildCount() && EInstructionSet.loadIntegerVariable(ctx.getChild(1).getText(), ctx.start, Validators.VARIABLE_TYPE_INT)){
                EOperationCodes.doOperation("==");


                EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, -1); //skok na začátek další case
            }
            else{
                ErrorHandle.addError(EErrorCodes.BAD_SYNTAX, ctx);
            }
        }
    }

    public void exitLabel(SLLanguageParser.LabeledStatementContext ctx){
        EInstructionSet.doInstruction(EInstructionSet.JUMP, -1); // skok na konec switch (současná větev se provedla)
        TableOfCodes.updateJumpCompare(TableOfSymbols.getObjectID(), String.valueOf(TableOfCodes.getTableOfMainCode().size()));
    }
}
