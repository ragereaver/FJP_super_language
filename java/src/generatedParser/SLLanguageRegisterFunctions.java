package generatedParser;

import Convertor.Validators;
import elements.FunctionTranslate;
import enums.EErrorCodes;
import tableClasses.ErrorHandle;
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
			&& !Validators.isTernalIfHere(ctx.getText())){
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