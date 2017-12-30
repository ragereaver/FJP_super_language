package elements;

import Convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import enums.EOperationCodes;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.Token;
import tableClasses.ErrorHandle;
import tableClasses.TableOfSymbols;
import tableClasses.TableOfSymbols.Symbol;

public class CaseTranslate {

    public void doCase(SLLanguageParser.LabeledStatementContext ctx, Token variable){

        if(EInstructionSet.loadIntegerVariable(variable.getText(), variable, "int")){
            if(1 < ctx.getChildCount() && EInstructionSet.loadIntegerVariable(ctx.getChild(1).getText(), ctx.start, "int")){
                EOperationCodes.doOperation("==");
                EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, 7); //skok na začátek další case
            }
            else{
                ErrorHandle.addError(EErrorCodes.BAD_SYNTAX, ctx.start.getLine(), ctx.start.getCharPositionInLine());
            }
        }
    }

    public void exitLabel(SLLanguageParser.LabeledStatementContext ctx){
        EInstructionSet.doInstruction(EInstructionSet.JUMP, 11); // skok na konec switch (současná větev se provedla)
    }
}
