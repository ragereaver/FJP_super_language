package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;
import Convertor.Validators;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class IfTranslate extends DeclarationTranslate {
    public void doTernalIf (ParseTree condition, ParseTree trueSide, ParseTree falseSide) {

    }

    public void runIf(SLLanguageParser.CycleContext ctx) {
        System.out.println("IF ------- " + ctx.getText());
        doCondition(ctx, ctx.logicalOrExpression());
        doBodyIf(ctx.compoundStatement(0));
        if (ctx.compoundStatement().size() > 1) {
            doBodyElse(ctx.compoundStatement(1));
        }
    }

    public void doCondition(SLLanguageParser.CycleContext ctx, ParseTree condition){
        SLLanguageMainListener.isInCycleHeader = true; // musi byt vsude zatim
        //TODO: zpracovani podminky
        resolveMathProblems(condition.getChild(0), ctx.getStart(), ctx.depth(), Validators.VARIABLE_TYPE_BOOLEAN);
        //EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, 1); //přepsat adresu

        SLLanguageMainListener.isInCycleHeader = false;
    }

    public void doBodyIf(ParseTree body) {

        //TODO: pravdive vetve
    }
    public void doBodyElse(ParseTree body) {
        //TODO: else vetve
        //TODO: otestovat zda se nevykona sama jiz v jinych listenerech
    }
}
