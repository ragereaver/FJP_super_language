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
public class WhileTranslate extends IfTranslate{

    public void runWhile(SLLanguageParser.CycleContext ctx) {

        SLLanguageMainListener.addAddress(TableOfCodes.getTableOfMainCode().size());
        doCondition(ctx.expression(), ctx.getStart()); // teoreticky by to melo byt stejne
        doBody(ctx.compoundStatement());
        //momentalně se body překládá po while
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, -1); //přepsat adresu na dalsi instrukci po while
    }

    public void doBody(ParseTree body) {

        //TODO: telo cyklu
    }

    public void exitWhile(SLLanguageParser.CycleContext ctx) {
        EInstructionSet.doInstruction(EInstructionSet.JUMP, SLLanguageMainListener.getAddress()); //přepsat adresu na začátek while
        TableOfCodes.updateJumpCompare(TableOfSymbols.getObjectID(), String.valueOf(TableOfCodes.getTableOfMainCode().size()));
    }
}
