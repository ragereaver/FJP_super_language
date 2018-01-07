package elements;

import convertor.TypeConvertor;
import convertor.Validators;
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

    public void doAssigmentTranslate(ParserRuleContext ctx, boolean useParent) {
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
        if (symbol == null
                || isArray && !Validators.isArrayType(symbol.getVariableType())) {
            ErrorHandle.addError(EErrorCodes.VARIABLE_TO_ASSIGNMENT_NOT_EXIST, ctx);
            return;
        }


        String type;
        if (isArray) {
            type = TypeConvertor.convertArrayTypesToSimple(symbol.getVariableType());
        }else {
            type = symbol.getVariableType();
        }

        prepareForDeclaration(type, ctx, useParent);

        if (!isArray) {
            EInstructionSet.storeInstruction(identifier, ctx.getStart());
        }else {
            int level = TableOfSymbols.getActualLevel() - symbol.getLevel();
            EInstructionSet.doInstruction(EInstructionSet.LITERAL, level);

            handleAssigment(Validators.VARIABLE_TYPE_INT, index, array.expression(), identifier);
            EInstructionSet.storeToArrayInstruction(identifier);
        }

    }

    public void prepareForDeclaration(String type, ParserRuleContext ctx, boolean useParent){
        if (ctx.getChild(2).getChildCount() > 1) {
            ParserRuleContext newTree = new ParserRuleContext();
            newTree.addChild((ParserRuleContext)ctx.getChild(2));

            super.handleAssigment(type, ctx.getChild(2).getText(), (ParserRuleContext)ctx.getChild(2), ctx.getChild(0).getText());
        }else {
            if (useParent) {
                super.doDeclarationInner(type, ctx.getParent(), false);
            }else {
                super.doDeclarationInner(type, ctx, false);
            }

        }
    }
}
