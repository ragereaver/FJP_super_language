package elements;

import enums.EErrorCodes;
import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.Token;
import Convertor.Validators;
import tableClasses.ErrorHandle;
import tableClasses.TableOfCodes;
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
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP,-1); //přepsat adresu, pro skok za if
        doBodyIf(ctx.compoundStatement());

    }

    public void doCondition(ParseTree condition, Token token){
        SLLanguageMainListener.isInCycleHeader = true; // musi byt vsude zatim
        //TODO: zpracovani podminky
        if(!resolveMathProblems(condition, token, 0, Validators.VARIABLE_TYPE_BOOLEAN).equals("")) {
            //proc program neskonci? :O
            ErrorHandle.addError(EErrorCodes.BAD_SYNTAX_CONDITION, token.getLine(), token.getCharPositionInLine());
            return;
        }

        SLLanguageMainListener.isInCycleHeader = false;
    }


    public void exitIf(SLLanguageParser.CycleContext ctx){
        TableOfCodes.updateJumpCompare(TableOfSymbols.getObjectID(), String.valueOf(TableOfCodes.getTableOfMainCode().size()));
       // EInstructionSet.doInstruction(EInstructionSet.JUMP, 10); // skok za else větev
    }

    public void doBodyIf(ParseTree body) {

        //TODO: pravdive vetve
    }

    public void doElse(SLLanguageParser.ElseStatementContext ctx) {
        EInstructionSet.doInstruction(EInstructionSet.JUMP, -1); //skok za else větev
    }

    public void exitElse(SLLanguageParser.ElseStatementContext ctx) {
        TableOfCodes.updateJump(TableOfSymbols.getObjectID(), String.valueOf(TableOfCodes.getTableOfMainCode().size()));
    }
}
