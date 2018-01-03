package generatedParser;

import Convertor.Validators;
import createFilePL0.CreateFile;
import elements.*;
import enums.EErrorCodes;
import enums.EInstructionSet;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import tableClasses.ErrorHandle;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

/**
 * This class provides an empty implementation of {@link SLLanguageListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class SLLanguageRegisterFunctions extends SLLanguageBaseListener {

	@Override
	public void enterExpressionStatement(SLLanguageParser.ExpressionStatementContext ctx) {
		if (!Validators.isAssignmentHere(ctx.getText())
			|| Validators.isTernalIfHere(ctx.getText())){
			ErrorHandle.addError(EErrorCodes.BAD_SYNTAX, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunctionDefinition(SLLanguageParser.FunctionDefinitionContext ctx) {

		TableOfSymbols.setObject(true);
		FunctionTranslate functionTranslate = new FunctionTranslate();
		functionTranslate.registerFunction(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunctionDefinition(SLLanguageParser.FunctionDefinitionContext ctx) {
		TableOfSymbols.setLevel(false);
		TableOfSymbols.setObject(false);
	}

}