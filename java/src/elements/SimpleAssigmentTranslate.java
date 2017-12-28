package elements;

import Convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import org.antlr.v4.runtime.ParserRuleContext;
import tableClasses.ErrorHandle;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 23.12.2017.
 */
public class SimpleAssigmentTranslate extends DeclarationTranslate{

    public void doAssigmentTranslate(ParserRuleContext ctx) {

        if (!Validators.isAssignmentHere(ctx.getText())) {
            return;
        }

        String identifier = ctx.getChild(0).getText();
        TableOfSymbols.Symbol symbol = TableOfSymbols.findByNameAllLevels(identifier, true);
        if (symbol == null) {
            ErrorHandle.addError(EErrorCodes.VARIABLE_TO_ASSIGNMENT_NOT_EXIST,
                    ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine());
            return;
        }
        System.out.println("-------- bez deklarace prirayovani -------" + identifier + "   " + ctx.getChild(2).getText());

        super.doDeclarationInner(symbol.getVariableType(), ctx.getParent(), false);
        EInstructionSet.doInstruction(EInstructionSet.STORE, symbol.getAddress());

    }
}
