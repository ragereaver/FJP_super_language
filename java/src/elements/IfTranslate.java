package elements;

import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class IfTranslate {
    public void doTernalIf (ParseTree condition, ParseTree trueSide, ParseTree falseSide) {

    }

    public void runIf(SLLanguageParser.CycleContext ctx) {
        System.out.println("IF ------- " + ctx.getText());

        doCondition(ctx.logicalOrExpression());
        doBodyIf(ctx.compoundStatement(0));
        if (ctx.compoundStatement().size() > 1) {
            doBodyElse(ctx.compoundStatement(1));
        }
    }

    public void doCondition(ParseTree condition){
        SLLanguageMainListener.isInCycleHeader = true; // musi byt vsude zatim
        //TODO: zpracovani podminky

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
