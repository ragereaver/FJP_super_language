package generatedParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link superLanguageParser}.
 */
public interface superLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(superLanguageParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(superLanguageParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(superLanguageParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(superLanguageParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(superLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(superLanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(superLanguageParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(superLanguageParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(superLanguageParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(superLanguageParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(superLanguageParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(superLanguageParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(superLanguageParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(superLanguageParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(superLanguageParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(superLanguageParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(superLanguageParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(superLanguageParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#procedureOrVariableName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrVariableName(superLanguageParser.ProcedureOrVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#procedureOrVariableName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrVariableName(superLanguageParser.ProcedureOrVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(superLanguageParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(superLanguageParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(superLanguageParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(superLanguageParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(superLanguageParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(superLanguageParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(superLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(superLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(superLanguageParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(superLanguageParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(superLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(superLanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(superLanguageParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(superLanguageParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(superLanguageParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(superLanguageParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(superLanguageParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(superLanguageParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(superLanguageParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(superLanguageParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(superLanguageParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(superLanguageParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(superLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(superLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(superLanguageParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(superLanguageParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(superLanguageParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(superLanguageParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(superLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(superLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(superLanguageParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(superLanguageParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(superLanguageParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(superLanguageParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(superLanguageParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(superLanguageParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(superLanguageParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(superLanguageParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(superLanguageParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(superLanguageParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(superLanguageParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(superLanguageParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(superLanguageParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(superLanguageParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(superLanguageParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(superLanguageParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(superLanguageParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(superLanguageParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(superLanguageParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(superLanguageParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(superLanguageParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(superLanguageParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(superLanguageParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(superLanguageParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(superLanguageParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(superLanguageParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(superLanguageParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(superLanguageParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(superLanguageParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(superLanguageParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(superLanguageParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(superLanguageParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(superLanguageParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(superLanguageParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(superLanguageParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(superLanguageParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(superLanguageParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(superLanguageParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(superLanguageParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(superLanguageParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(superLanguageParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(superLanguageParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(superLanguageParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(superLanguageParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(superLanguageParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(superLanguageParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(superLanguageParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(superLanguageParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(superLanguageParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(superLanguageParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(superLanguageParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(superLanguageParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(superLanguageParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(superLanguageParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(superLanguageParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(superLanguageParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(superLanguageParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(superLanguageParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(superLanguageParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(superLanguageParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(superLanguageParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(superLanguageParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(superLanguageParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(superLanguageParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(superLanguageParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(superLanguageParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(superLanguageParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(superLanguageParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(superLanguageParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(superLanguageParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(superLanguageParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(superLanguageParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(superLanguageParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(superLanguageParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(superLanguageParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(superLanguageParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(superLanguageParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(superLanguageParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(superLanguageParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(superLanguageParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(superLanguageParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(superLanguageParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(superLanguageParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(superLanguageParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(superLanguageParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(superLanguageParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(superLanguageParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(superLanguageParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(superLanguageParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(superLanguageParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(superLanguageParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(superLanguageParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(superLanguageParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(superLanguageParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(superLanguageParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(superLanguageParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(superLanguageParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(superLanguageParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(superLanguageParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(superLanguageParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(superLanguageParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(superLanguageParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(superLanguageParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(superLanguageParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(superLanguageParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(superLanguageParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(superLanguageParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(superLanguageParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(superLanguageParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(superLanguageParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(superLanguageParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(superLanguageParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(superLanguageParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(superLanguageParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(superLanguageParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(superLanguageParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(superLanguageParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(superLanguageParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(superLanguageParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(superLanguageParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(superLanguageParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(superLanguageParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(superLanguageParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(superLanguageParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(superLanguageParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(superLanguageParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(superLanguageParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(superLanguageParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(superLanguageParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(superLanguageParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(superLanguageParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(superLanguageParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(superLanguageParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(superLanguageParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(superLanguageParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(superLanguageParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(superLanguageParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(superLanguageParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(superLanguageParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(superLanguageParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(superLanguageParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(superLanguageParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(superLanguageParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(superLanguageParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(superLanguageParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(superLanguageParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(superLanguageParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(superLanguageParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(superLanguageParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(superLanguageParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(superLanguageParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(superLanguageParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(superLanguageParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(superLanguageParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link superLanguageParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(superLanguageParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link superLanguageParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(superLanguageParser.CastExpressionContext ctx);
}