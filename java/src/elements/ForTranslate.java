package elements;

import enums.EInstructionSet;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class ForTranslate extends WhileTranslate{

    public void runFor(SLLanguageParser.CycleContext ctx) {
        SLLanguageParser.ForConditionContext condition = ctx.forCondition();

        if (condition.forDeclaration() != null) {
            DeclarationTranslate declaration = new DeclarationTranslate();
            String type = condition.forDeclaration().typeSpecifier().getText();
            declaration.doDeclarationInner(type, condition.forDeclaration().initDeclaratorList(), true);
        }else {
            if (condition.forInit() != null){
                SimpleAssigmentTranslate assigmentTranslate = new SimpleAssigmentTranslate();
                SLLanguageParser.ForExpressionContext init = condition.forInit().forExpression();
                while (init != null) {
                    assigmentTranslate.doAssigmentTranslate(init.assignmentExpression(), false);
                    init = init.forExpression();
                }

            }
        }

        if (condition.logicalOrExpression() != null) {
            doCondition(ctx.forCondition().logicalOrExpression(), condition.getStart());
        }else {
            SLLanguageMainListener.addAddress(TableOfCodes.getTableOfMainCode().size());
        }


    }

    @Override
    public void doCondition(ParseTree condition, Token token) {

        SLLanguageMainListener.addAddress(TableOfCodes.getTableOfMainCode().size());

        super.doCondition(condition, token);
        EInstructionSet.doInstruction(EInstructionSet.JUMP_COMP,-1); //přepsat adresu, pro skok za for, další instrukce za JMP
    }

    public void exitFor(SLLanguageParser.CycleContext ctx) {
        //udělat inkrementaci
        if(ctx.forCondition().forExpression() != null){
            SimpleAssigmentTranslate assigment = new SimpleAssigmentTranslate();
            SLLanguageParser.ForExpressionContext init = ctx.forCondition().forExpression();
            while (init != null) {
                assigment.doAssigmentTranslate(init.assignmentExpression(), false);
                init = init.forExpression();
            }
        }


        EInstructionSet.doInstruction(EInstructionSet.JUMP, SLLanguageMainListener.getAddress()); //přepsat adresu na začátek for, po deklaraci proměnné

        String endAdress = String.valueOf(TableOfCodes.getTableOfMainCode().size());
        TableOfCodes.updateJumpCompare(TableOfSymbols.getObjectID(), endAdress);
        TableOfCodes.updateJump(TableOfSymbols.getObjectID(), endAdress);
    }
}
