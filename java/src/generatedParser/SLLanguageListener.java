// Generated from D:/projekty/FJP_super_language\SLLanguage.g4 by ANTLR 4.7
package generatedParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SLLanguageParser}.
 */
public interface SLLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(SLLanguageParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(SLLanguageParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(SLLanguageParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(SLLanguageParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#allCode}.
	 * @param ctx the parse tree
	 */
	void enterAllCode(SLLanguageParser.AllCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#allCode}.
	 * @param ctx the parse tree
	 */
	void exitAllCode(SLLanguageParser.AllCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(SLLanguageParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(SLLanguageParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(SLLanguageParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(SLLanguageParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(SLLanguageParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(SLLanguageParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#initList}.
	 * @param ctx the parse tree
	 */
	void enterInitList(SLLanguageParser.InitListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#initList}.
	 * @param ctx the parse tree
	 */
	void exitInitList(SLLanguageParser.InitListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(SLLanguageParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(SLLanguageParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#stringSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStringSpecifier(SLLanguageParser.StringSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#stringSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStringSpecifier(SLLanguageParser.StringSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#emptySpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEmptySpecifier(SLLanguageParser.EmptySpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#emptySpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEmptySpecifier(SLLanguageParser.EmptySpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#cycle}.
	 * @param ctx the parse tree
	 */
	void enterCycle(SLLanguageParser.CycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#cycle}.
	 * @param ctx the parse tree
	 */
	void exitCycle(SLLanguageParser.CycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SLLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SLLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(SLLanguageParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(SLLanguageParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(SLLanguageParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(SLLanguageParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SLLanguageParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SLLanguageParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(SLLanguageParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(SLLanguageParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(SLLanguageParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(SLLanguageParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SLLanguageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SLLanguageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(SLLanguageParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(SLLanguageParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(SLLanguageParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(SLLanguageParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(SLLanguageParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(SLLanguageParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SLLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SLLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(SLLanguageParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(SLLanguageParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(SLLanguageParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(SLLanguageParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SLLanguageParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SLLanguageParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#functionValues}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValues(SLLanguageParser.FunctionValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#functionValues}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValues(SLLanguageParser.FunctionValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(SLLanguageParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(SLLanguageParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(SLLanguageParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(SLLanguageParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(SLLanguageParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(SLLanguageParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(SLLanguageParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(SLLanguageParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#stringEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringEqualityExpression(SLLanguageParser.StringEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#stringEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringEqualityExpression(SLLanguageParser.StringEqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(SLLanguageParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(SLLanguageParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SLLanguageParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SLLanguageParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SLLanguageParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SLLanguageParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(SLLanguageParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(SLLanguageParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SLLanguageParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SLLanguageParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(SLLanguageParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(SLLanguageParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(SLLanguageParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(SLLanguageParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SLLanguageParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SLLanguageParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(SLLanguageParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(SLLanguageParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(SLLanguageParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(SLLanguageParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(SLLanguageParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(SLLanguageParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SLLanguageParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(SLLanguageParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SLLanguageParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(SLLanguageParser.ForExpressionContext ctx);
}