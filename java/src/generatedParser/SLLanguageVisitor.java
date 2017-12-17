// Generated from D:/projekty/FJP_super_language\SLLanguage.g4 by ANTLR 4.7
package generatedParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SLLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SLLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(SLLanguageParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(SLLanguageParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(SLLanguageParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#initList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitList(SLLanguageParser.InitListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(SLLanguageParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle(SLLanguageParser.CycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SLLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(SLLanguageParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(SLLanguageParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SLLanguageParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(SLLanguageParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(SLLanguageParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SLLanguageParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(SLLanguageParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(SLLanguageParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(SLLanguageParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SLLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(SLLanguageParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(SLLanguageParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(SLLanguageParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(SLLanguageParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(SLLanguageParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(SLLanguageParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(SLLanguageParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(SLLanguageParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(SLLanguageParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(SLLanguageParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(SLLanguageParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(SLLanguageParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(SLLanguageParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(SLLanguageParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(SLLanguageParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(SLLanguageParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(SLLanguageParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SLLanguageParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(SLLanguageParser.ForExpressionContext ctx);
}