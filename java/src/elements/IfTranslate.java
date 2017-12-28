package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.Token;
import Convertor.Validators;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class IfTranslate extends DeclarationTranslate {
    public void doTernalIf (ParseTree condition, ParseTree trueSide, ParseTree falseSide) {

    }

    public void runIf(SLLanguageParser.CycleContext ctx) {
        System.out.println("IF ------- " + ctx.getText());

        Token token = ctx.getStart();

        doCondition(ctx.logicalOrExpression(), token);
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP,1); //přepsat adresu, pro skok za if
        doBodyIf(ctx.compoundStatement(0));
        if (ctx.compoundStatement().size() > 1) {
            doBodyElse(ctx.compoundStatement(1));
        }
    }

    public void doCondition(ParseTree condition, Token token){
        SLLanguageMainListener.isInCycleHeader = true; // musi byt vsude zatim
        //TODO: zpracovani podminky
        resolveMathProblems(condition, token, 0, Validators.VARIABLE_TYPE_BOOLEAN);

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
