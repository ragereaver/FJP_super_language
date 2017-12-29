package elements;

import enums.EInstructionSet;
import enums.EOperationCodes;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.Token;
import tableClasses.TableOfSymbols;
import tableClasses.TableOfSymbols.Symbol;

public class CaseTranslate {

    public void doCase(SLLanguageParser.LabeledStatementContext ctx, Token variable){
        if(EInstructionSet.loadIntegerVariable(variable.getText(), variable, "int")){
            if(EInstructionSet.loadIntegerVariable(ctx.getChild(1).getText(), ctx.start, "int")){
                EOperationCodes.doOperation("==");
                EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, 7); //skok na začátek další case
            }
            else{
                //error
            }
        }
        else{
            //error
        }
    }

    public void exitLabel(SLLanguageParser.LabeledStatementContext ctx){
        EInstructionSet.doInstruction(EInstructionSet.JUMP, 11); // skok na konec switch (současná větev se provedla)
    }
}
