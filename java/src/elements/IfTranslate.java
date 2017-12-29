package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.Token;
import Convertor.Validators;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class IfTranslate extends DeclarationTranslate {
    public void doTernalIf (ParseTree condition, ParseTree trueSide, ParseTree falseSide, Token token) {
        resolveMathProblems(condition, token, 0, Validators.VARIABLE_TYPE_BOOLEAN);
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, 2); //skok na falseSide
        SimpleAssigmentTranslate assigment = new SimpleAssigmentTranslate();
        assigment.doAssigmentTranslate((ParserRuleContext) trueSide);   //prirazeni, nutno dodělat komu přiřadit
        EInstructionSet.doInstruction(EInstructionSet.JUMP, 3); //skok na další příkaz, preskoceni falseSide

        assigment.doAssigmentTranslate((ParserRuleContext) falseSide); //prirazeni, nutno dodělat komu přiřadit
    }

    public void runIf(SLLanguageParser.CycleContext ctx) {
        System.out.println("IF ------- " + ctx.getText());

        Token token = ctx.getStart();

        doCondition(ctx.logicalOrExpression(), token);
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP,1); //přepsat adresu, pro skok za IF, za další JUMP na konci IF (else větev)
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


    public void exitIf(SLLanguageParser.CycleContext ctx){
        EInstructionSet.doInstruction(EInstructionSet.JUMP, 10); // skok za else větev
    }

    public void doBodyIf(ParseTree body) {

        //TODO: pravdive vetve
    }
    public void doBodyElse(ParseTree body) {
        //TODO: else vetve
        //TODO: otestovat zda se nevykona sama jiz v jinych listenerech
    }
}
