package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.TableOfCodes;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class WhileTranslate extends IfTranslate{

    public void runWhile(SLLanguageParser.CycleContext ctx) {


        doCondition(ctx.expression(), ctx.getStart()); // teoreticky by to melo byt stejne
        doBody(ctx.compoundStatement(0));
        //momentalně se body překládá po while
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, 25); //přepsat adresu na dalsi instrukci po while
    }

    public void doBody(ParseTree body) {

        //TODO: telo cyklu
    }

    public void exitWhile(SLLanguageParser.CycleContext ctx) {
        EInstructionSet.doInstruction(EInstructionSet.JUMP, 18); //přepsat adresu na začátek while
    }
}
