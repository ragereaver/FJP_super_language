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

    public void runIf(SLLanguageParser.CycleContext ctx) {
        Token token = ctx.getStart();

        doCondition(ctx.logicalOrExpression(), token);
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP, -1); //přepsat adresu, pro skok za if
        doBodyIf(ctx.compoundStatement());

    }

    public void doCondition(ParseTree condition, Token token) {
        SLLanguageMainListener.isInCycleHeader = true; // musi byt vsude zatim

        super.getValue(condition.getText(), Validators.VARIABLE_TYPE_BOOLEAN, condition, token);
        /*if (!resolveMathProblems(condition, token, Validators.VARIABLE_TYPE_BOOLEAN).equals("")) {
            ErrorHandle.addError(EErrorCodes.BAD_SYNTAX_CONDITION, token);
            return;
        }*/

        SLLanguageMainListener.isInCycleHeader = false;
    }


    public void exitIf(SLLanguageParser.CycleContext ctx) {
        TableOfCodes.updateJumpCompare(TableOfSymbols.getObjectID(), String.valueOf(TableOfCodes.getTableOfMainCode().size() - 1));
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