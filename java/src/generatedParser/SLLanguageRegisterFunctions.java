package generatedParser;

import createFilePL0.CreateFile;
import elements.*;
import enums.EInstructionSet;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

/**
 * This class provides an empty implementation of {@link SLLanguageListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class SLLanguageRegisterFunctions extends SLLanguageBaseListener {

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunctionDefinition(SLLanguageParser.FunctionDefinitionContext ctx) {

		System.out.println("zacatek funkce");

		TableOfSymbols.setObject(true);
		FunctionTranslate functionTranslate = new FunctionTranslate();
		functionTranslate.registerFunction(ctx);
		System.out.println(ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunctionDefinition(SLLanguageParser.FunctionDefinitionContext ctx) {
		TableOfSymbols.setLevel(false);
		TableOfSymbols.setObject(false);
		System.out.println("konec funkce");
	}

}