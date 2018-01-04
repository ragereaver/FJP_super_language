package elements;

import enums.EErrorCodes;
import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.ErrorHandle;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class ForTranslate extends WhileTranslate{

    public void runFor(SLLanguageParser.CycleContext ctx) {
        doCondition(ctx.forCondition(), ctx.getStart());

    }

    @Override
    public void doCondition(ParseTree condition, Token token) {
        DeclarationTranslate declaration = new DeclarationTranslate();
        //deklarace proměnné na začátku cyklu
        if(condition.getChild(0).getChildCount() < 2){
            ErrorHandle.addError(EErrorCodes.MISSING_DECLARATION_STATEMENT, token);
            return;
        }

        declaration.doDeclarationInner(condition.getChild(0).getChild(0).getText(), condition.getChild(0).getChild(1), true);


        if(condition.getChildCount() < 3){
            ErrorHandle.addError(EErrorCodes.BAD_SYNTAX, token);
            return;
        }
        SLLanguageMainListener.addAddress(TableOfCodes.getTableOfMainCode().size());

        super.doCondition(condition.getChild(2), token);
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP,-1); //přepsat adresu, pro skok za for, další instrukce za JMP
    }

    public void exitFor(SLLanguageParser.CycleContext ctx) {
        //udělat inkrementaci
        SimpleAssigmentTranslate assigment = new SimpleAssigmentTranslate();
        if(ctx.getChildCount() < 3 || ctx.getChild(2).getChildCount() < 5){
            ErrorHandle.addError(EErrorCodes.BAD_SYNTAX, ctx);
            return;
        }
        assigment.doAssigmentTranslate((ParserRuleContext)ctx.getChild(2).getChild(4).getChild(0));

        EInstructionSet.doInstruction(EInstructionSet.JUMP, SLLanguageMainListener.getAddress()); //přepsat adresu na začátek for, po deklaraci proměnné
        TableOfCodes.updateJumpCompare(TableOfSymbols.getObjectID(), String.valueOf(TableOfCodes.getTableOfMainCode().size()));
    }
}
