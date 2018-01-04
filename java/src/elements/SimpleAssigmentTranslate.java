package elements;

import Convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;
import tableClasses.ErrorHandle;
import tableClasses.Symbol;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 23.12.2017.
 */
public class SimpleAssigmentTranslate extends DeclarationTranslate{

    public void doAssigmentTranslate(ParserRuleContext ctx) {
        boolean isAssign = Validators.isAssignmentHere(ctx.getText());
        boolean isArray = false;
        SLLanguageParser.PostfixExpressionContext array = null;
        String index = "";
        if (!isAssign) {
            return;
        }

        String identifier = ctx.getChild(0).getText();
        if (Validators.isArrayHere(identifier)) {
            array = (SLLanguageParser.PostfixExpressionContext) ctx.getChild(0).getChild(0);
            identifier = array.postfixExpression().getText();
            index = array.expression().getText();
            isArray = true;
        }

        Symbol symbol = TableOfSymbols.findByNameAllLevels(identifier, true);
        if (symbol == null) {
            ErrorHandle.addError(EErrorCodes.VARIABLE_TO_ASSIGNMENT_NOT_EXIST, ctx);
            return;
        }


        prepareForDeclaration(symbol.getVariableType(), ctx);

        if (!isArray) {
            EInstructionSet.storeInstruction(identifier);
        }else {
            int level = TableOfSymbols.getActualLevel() - symbol.getLevel();
            if (level != 0) {
                EInstructionSet.doInstruction(EInstructionSet.LITERAL, level);
            }


            String type = symbol.getVariableType().substring(0, symbol.getVariableType().length() - 2);
            handleAssigment(type, false, index, array.expression(), identifier);
            EInstructionSet.storeToArrayInstruction(identifier, level);
        }

    }

    public void prepareForDeclaration(String type, ParserRuleContext ctx){
        if (ctx.getChild(2).getChildCount() > 1) {
            ParserRuleContext newTree = new ParserRuleContext();
            newTree.addChild((ParserRuleContext)ctx.getChild(2));
            super.doDeclarationInner(type, newTree, false);
        }else {

            super.doDeclarationInner(type, ctx.getParent(), false);
        }
    }
}
