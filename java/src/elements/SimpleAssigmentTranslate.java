package elements;

import Convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.ErrorHandle;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 23.12.2017.
 */
public class SimpleAssigmentTranslate extends DeclarationTranslate{

    public void doAssigmentTranslate(ParserRuleContext ctx) {
        boolean isAssign = Validators.isAssignmentHere(ctx.getText());

        if (!isAssign) {
            return;
        }

        String identifier = ctx.getChild(0).getText();
        TableOfSymbols.Symbol symbol = TableOfSymbols.findByNameAllLevels(identifier, true);


        if (symbol == null) {
            ErrorHandle.addError(EErrorCodes.VARIABLE_TO_ASSIGNMENT_NOT_EXIST, ctx);
            return;
        }


        prepareForDeclaration(symbol.getVariableType(), ctx);

        EInstructionSet.storeInstruction(identifier);
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
