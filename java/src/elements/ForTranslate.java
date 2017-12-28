package elements;

import Convertor.Validators;
import enums.EInstructionSet;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.Token;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class ForTranslate extends WhileTranslate{

    public void runFor(SLLanguageParser.CycleContext ctx) {

        doCondition(ctx.forCondition(), ctx.getStart());
        doBody(ctx.compoundStatement(0));
    }

    @Override
    public void doCondition(ParseTree condition, Token token) {
        DeclarationTranslate declaration = new DeclarationTranslate();
        //deklarace proměnné na začátku cyklu
        declaration.doDeclarationInner(condition.getChild(0).getChild(0).getText(), condition.getChild(0).getChild(1), true);

        resolveMathProblems(condition.getChild(2), token, 0, Validators.VARIABLE_TYPE_BOOLEAN);
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP,23); //přepsat adresu, pro skok za for, další instrukce za JMP
        //TODO: urcite jine zpracovani podminky
    }

    public void exitFor(SLLanguageParser.CycleContext ctx) {
        //udělat inkrementaci
        SimpleAssigmentTranslate assigment = new SimpleAssigmentTranslate();
        assigment.doAssigmentTranslate((ParserRuleContext)ctx.getChild(2).getChild(4).getChild(0));

        EInstructionSet.doInstruction(EInstructionSet.JUMP, 14); //přepsat adresu na začátek for, po deklaraci proměnné
    }
}
