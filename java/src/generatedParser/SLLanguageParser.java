// Generated from D:/projekty/FJP_super_language\SLLanguage.g4 by ANTLR 4.7
package generatedParser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Break=9, 
		Case=10, Char=11, Continue=12, Default=13, Do=14, Else=15, For=16, If=17, 
		Int=18, Return=19, Switch=20, Void=21, While=22, LeftParen=23, RightParen=24, 
		LeftBracket=25, RightBracket=26, LeftBrace=27, RightBrace=28, Less=29, 
		LessEqual=30, Greater=31, GreaterEqual=32, Plus=33, Minus=34, Star=35, 
		Div=36, Mod=37, AndAnd=38, OrOr=39, Not=40, Question=41, Colon=42, Semi=43, 
		Comma=44, Assign=45, Equal=46, NotEqual=47, Identifier=48, DigitSequence=49, 
		Constant=50, Whitespace=51, Newline=52, BlockComment=53;
	public static final int
		RULE_compilationUnit = 0, RULE_translationUnit = 1, RULE_allCode = 2, 
		RULE_constDeclaration = 3, RULE_constValues = 4, RULE_arrayDeclaration = 5, 
		RULE_functionDefinition = 6, RULE_initList = 7, RULE_typeSpecifier = 8, 
		RULE_emptySpecifier = 9, RULE_cycle = 10, RULE_elseStatement = 11, RULE_statement = 12, 
		RULE_labeledStatement = 13, RULE_compoundStatement = 14, RULE_expressionStatement = 15, 
		RULE_blockItemList = 16, RULE_blockItem = 17, RULE_declaration = 18, RULE_initDeclaratorList = 19, 
		RULE_initDeclarator = 20, RULE_jumpStatement = 21, RULE_expression = 22, 
		RULE_conditionalExpression = 23, RULE_assignmentOperator = 24, RULE_functionCall = 25, 
		RULE_functionValues = 26, RULE_logicalOrExpression = 27, RULE_logicalAndExpression = 28, 
		RULE_assignmentExpression = 29, RULE_equalityExpression = 30, RULE_relationalExpression = 31, 
		RULE_additiveExpression = 32, RULE_multiplicativeExpression = 33, RULE_castExpression = 34, 
		RULE_unaryExpression = 35, RULE_unaryOperator = 36, RULE_postfixExpression = 37, 
		RULE_primaryExpression = 38, RULE_forCondition = 39, RULE_forDeclaration = 40, 
		RULE_forInit = 41, RULE_forExpression = 42;
	public static final String[] ruleNames = {
		"compilationUnit", "translationUnit", "allCode", "constDeclaration", "constValues", 
		"arrayDeclaration", "functionDefinition", "initList", "typeSpecifier", 
		"emptySpecifier", "cycle", "elseStatement", "statement", "labeledStatement", 
		"compoundStatement", "expressionStatement", "blockItemList", "blockItem", 
		"declaration", "initDeclaratorList", "initDeclarator", "jumpStatement", 
		"expression", "conditionalExpression", "assignmentOperator", "functionCall", 
		"functionValues", "logicalOrExpression", "logicalAndExpression", "assignmentExpression", 
		"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
		"castExpression", "unaryExpression", "unaryOperator", "postfixExpression", 
		"primaryExpression", "forCondition", "forDeclaration", "forInit", "forExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'const'", "'true'", "'false'", "'new'", "'function'", "'boolean'", 
		"'until'", "'repeat'", "'break'", "'case'", "'char'", "'continue'", "'default'", 
		"'do'", "'else'", "'for'", "'if'", "'int'", "'return'", "'switch'", "'void'", 
		"'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", 
		"'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'?'", 
		"':'", "';'", "','", "'='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "Break", "Case", 
		"Char", "Continue", "Default", "Do", "Else", "For", "If", "Int", "Return", 
		"Switch", "Void", "While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
		"Plus", "Minus", "Star", "Div", "Mod", "AndAnd", "OrOr", "Not", "Question", 
		"Colon", "Semi", "Comma", "Assign", "Equal", "NotEqual", "Identifier", 
		"DigitSequence", "Constant", "Whitespace", "Newline", "BlockComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SLLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SLLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SLLanguageParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Do) | (1L << For) | (1L << If) | (1L << Int) | (1L << Switch) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Not) | (1L << Identifier) | (1L << DigitSequence) | (1L << Constant))) != 0)) {
				{
				setState(86);
				translationUnit();
				}
			}

			setState(89);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public AllCodeContext allCode() {
			return getRuleContext(AllCodeContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_translationUnit);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				allCode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				allCode();
				setState(93);
				translationUnit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllCodeContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AllCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterAllCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitAllCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitAllCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllCodeContext allCode() throws RecognitionException {
		AllCodeContext _localctx = new AllCodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_allCode);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				cycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				functionCall();
				setState(101);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				constDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				assignmentExpression();
				setState(105);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SLLanguageParser.Identifier, 0); }
		public ConstValuesContext constValues() {
			return getRuleContext(ConstValuesContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__0);
			setState(110);
			typeSpecifier();
			setState(111);
			match(Identifier);
			setState(112);
			match(Assign);
			setState(113);
			constValues();
			setState(114);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstValuesContext extends ParserRuleContext {
		public TerminalNode DigitSequence() { return getToken(SLLanguageParser.DigitSequence, 0); }
		public ConstValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterConstValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitConstValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitConstValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstValuesContext constValues() throws RecognitionException {
		ConstValuesContext _localctx = new ConstValuesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << DigitSequence))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(SLLanguageParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SLLanguageParser.Identifier, i);
		}
		public TerminalNode DigitSequence() { return getToken(SLLanguageParser.DigitSequence, 0); }
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			typeSpecifier();
			setState(119);
			match(LeftBracket);
			setState(120);
			match(RightBracket);
			setState(121);
			match(Identifier);
			setState(122);
			match(Assign);
			setState(123);
			match(T__3);
			setState(124);
			typeSpecifier();
			setState(125);
			match(LeftBracket);
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==DigitSequence) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			match(RightBracket);
			setState(128);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SLLanguageParser.Identifier, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public EmptySpecifierContext emptySpecifier() {
			return getRuleContext(EmptySpecifierContext.class,0);
		}
		public InitListContext initList() {
			return getRuleContext(InitListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case Int:
				{
				setState(130);
				typeSpecifier();
				}
				break;
			case Void:
				{
				setState(131);
				emptySpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(134);
			match(T__4);
			setState(135);
			match(Identifier);
			setState(136);
			match(LeftParen);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==Int) {
				{
				setState(137);
				initList();
				}
			}

			setState(140);
			match(RightParen);
			setState(141);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SLLanguageParser.Identifier, 0); }
		public InitListContext initList() {
			return getRuleContext(InitListContext.class,0);
		}
		public InitListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterInitList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitInitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitInitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitListContext initList() throws RecognitionException {
		InitListContext _localctx = new InitListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initList);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				typeSpecifier();
				setState(144);
				match(Identifier);
				setState(145);
				match(Comma);
				setState(146);
				initList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				typeSpecifier();
				setState(149);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==Int) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptySpecifierContext extends ParserRuleContext {
		public EmptySpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptySpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterEmptySpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitEmptySpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitEmptySpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptySpecifierContext emptySpecifier() throws RecognitionException {
		EmptySpecifierContext _localctx = new EmptySpecifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_emptySpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(Void);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CycleContext extends ParserRuleContext {
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<LabeledStatementContext> labeledStatement() {
			return getRuleContexts(LabeledStatementContext.class);
		}
		public LabeledStatementContext labeledStatement(int i) {
			return getRuleContext(LabeledStatementContext.class,i);
		}
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cycle);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case For:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(For);
				setState(158);
				match(LeftParen);
				setState(159);
				forCondition();
				setState(160);
				match(RightParen);
				setState(161);
				compoundStatement();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(While);
				setState(164);
				match(LeftParen);
				setState(165);
				logicalOrExpression(0);
				setState(166);
				match(RightParen);
				setState(167);
				compoundStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(T__6);
				setState(170);
				match(LeftParen);
				setState(171);
				logicalOrExpression(0);
				setState(172);
				match(RightParen);
				setState(173);
				compoundStatement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				match(Do);
				setState(176);
				compoundStatement();
				setState(177);
				match(While);
				setState(178);
				match(LeftParen);
				setState(179);
				logicalOrExpression(0);
				setState(180);
				match(RightParen);
				setState(181);
				match(Semi);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(T__7);
				setState(184);
				compoundStatement();
				setState(185);
				match(T__6);
				setState(186);
				match(LeftParen);
				setState(187);
				logicalOrExpression(0);
				setState(188);
				match(RightParen);
				setState(189);
				match(Semi);
				}
				break;
			case If:
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				match(If);
				setState(192);
				match(LeftParen);
				setState(193);
				logicalOrExpression(0);
				setState(194);
				match(RightParen);
				setState(195);
				compoundStatement();
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(196);
					elseStatement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				match(Switch);
				setState(200);
				match(LeftParen);
				setState(201);
				expression(0);
				setState(202);
				match(RightParen);
				setState(203);
				match(LeftBrace);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(204);
					labeledStatement();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(Else);
			setState(215);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				functionCall();
				setState(220);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				cycle();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				jumpStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode DigitSequence() { return getToken(SLLanguageParser.DigitSequence, 0); }
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public List<JumpStatementContext> jumpStatement() {
			return getRuleContexts(JumpStatementContext.class);
		}
		public JumpStatementContext jumpStatement(int i) {
			return getRuleContext(JumpStatementContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_labeledStatement);
		try {
			int _alt;
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(Case);
				setState(228);
				match(DigitSequence);
				setState(229);
				match(Colon);
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(236);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
							{
							setState(230);
							compoundStatement();
							}
							break;
						case 2:
							{
							setState(231);
							expressionStatement();
							}
							break;
						case 3:
							{
							setState(232);
							jumpStatement();
							}
							break;
						case 4:
							{
							{
							setState(233);
							functionCall();
							setState(234);
							match(Semi);
							}
							}
							break;
						}
						} 
					}
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(Default);
				setState(242);
				match(Colon);
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(243);
					compoundStatement();
					}
					break;
				case 2:
					{
					setState(244);
					expressionStatement();
					}
					break;
				case 3:
					{
					setState(245);
					jumpStatement();
					}
					break;
				case 4:
					{
					{
					setState(246);
					functionCall();
					setState(247);
					match(Semi);
					}
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(LeftBrace);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Break) | (1L << Case) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << For) | (1L << If) | (1L << Int) | (1L << Return) | (1L << Switch) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Not) | (1L << Semi) | (1L << Identifier) | (1L << DigitSequence) | (1L << Constant))) != 0)) {
				{
				setState(254);
				blockItemList(0);
				}
			}

			setState(257);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Not) | (1L << Identifier) | (1L << DigitSequence) | (1L << Constant))) != 0)) {
				{
				setState(259);
				expression(0);
				}
			}

			setState(262);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitBlockItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(265);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(267);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(268);
					blockItem();
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockItem);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				declaration();
				}
				break;
			case T__1:
			case T__2:
			case T__6:
			case T__7:
			case Break:
			case Case:
			case Continue:
			case Default:
			case Do:
			case For:
			case If:
			case Return:
			case Switch:
			case While:
			case LeftParen:
			case LeftBrace:
			case Plus:
			case Minus:
			case Star:
			case Not:
			case Semi:
			case Identifier:
			case DigitSequence:
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaration);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				typeSpecifier();
				setState(279);
				initDeclaratorList(0);
				setState(280);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				arrayDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(286);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(288);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(289);
					match(Comma);
					setState(290);
					initDeclarator();
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SLLanguageParser.Identifier, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_initDeclarator);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(Identifier);
				setState(298);
				match(Assign);
				setState(299);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jumpStatement);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Continue:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(Continue);
				setState(303);
				match(Semi);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(Break);
				setState(305);
				match(Semi);
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(Return);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Not) | (1L << Identifier) | (1L << DigitSequence) | (1L << Constant))) != 0)) {
					{
					setState(307);
					expression(0);
					}
				}

				setState(310);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(314);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(316);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(317);
					match(Comma);
					setState(318);
					assignmentExpression();
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			logicalOrExpression(0);
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(325);
				match(Question);
				setState(326);
				expression(0);
				setState(329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(327);
					match(Colon);
					setState(328);
					expression(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SLLanguageParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(Identifier);
			setState(336);
			match(LeftParen);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Not) | (1L << Identifier) | (1L << DigitSequence) | (1L << Constant))) != 0)) {
				{
				setState(337);
				expression(0);
				}
			}

			setState(340);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionValuesContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SLLanguageParser.Identifier, 0); }
		public FunctionValuesContext functionValues() {
			return getRuleContext(FunctionValuesContext.class,0);
		}
		public TerminalNode Constant() { return getToken(SLLanguageParser.Constant, 0); }
		public TerminalNode DigitSequence() { return getToken(SLLanguageParser.DigitSequence, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterFunctionValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitFunctionValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitFunctionValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionValuesContext functionValues() throws RecognitionException {
		FunctionValuesContext _localctx = new FunctionValuesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionValues);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(Identifier);
				setState(344);
				match(Comma);
				setState(345);
				functionValues();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(Constant);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				match(Constant);
				setState(348);
				match(Comma);
				setState(349);
				functionValues();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				match(DigitSequence);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				match(DigitSequence);
				setState(352);
				match(Comma);
				setState(353);
				functionValues();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(354);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(355);
				match(T__2);
				setState(356);
				match(Comma);
				setState(357);
				functionValues();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(358);
				match(T__1);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(359);
				match(T__1);
				setState(360);
				match(Comma);
				setState(361);
				functionValues();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(362);
				functionCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(363);
				functionCall();
				setState(364);
				match(Comma);
				setState(365);
				functionValues();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(370);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(372);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(373);
					match(OrOr);
					setState(374);
					logicalAndExpression(0);
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(381);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(383);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(384);
					match(AndAnd);
					setState(385);
					equalityExpression(0);
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(SLLanguageParser.DigitSequence, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignmentExpression);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				unaryExpression();
				setState(393);
				assignmentOperator();
				setState(394);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				match(DigitSequence);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(400);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(408);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(402);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(403);
						match(Equal);
						setState(404);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(405);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(406);
						match(NotEqual);
						setState(407);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(414);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(416);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(417);
						match(Less);
						setState(418);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(419);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(420);
						match(Greater);
						setState(421);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(422);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(423);
						match(LessEqual);
						setState(424);
						additiveExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(425);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(426);
						match(GreaterEqual);
						setState(427);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(434);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(442);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(436);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(437);
						match(Plus);
						setState(438);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(439);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(440);
						match(Minus);
						setState(441);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(448);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(459);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(450);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(451);
						match(Star);
						setState(452);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(453);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(454);
						match(Div);
						setState(455);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(456);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(457);
						match(Mod);
						setState(458);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(SLLanguageParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_castExpression);
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case LeftParen:
			case Plus:
			case Minus:
			case Star:
			case Not:
			case Identifier:
			case Constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				unaryExpression();
				}
				break;
			case DigitSequence:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(DigitSequence);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unaryExpression);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case LeftParen:
			case Identifier:
			case Constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				postfixExpression(0);
				}
				break;
			case Plus:
			case Minus:
			case Star:
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				unaryOperator();
				setState(470);
				castExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Not))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SLLanguageParser.Identifier, 0); }
		public FunctionValuesContext functionValues() {
			return getRuleContext(FunctionValuesContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(477);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(478);
				match(Identifier);
				setState(479);
				match(LeftParen);
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Identifier) | (1L << DigitSequence) | (1L << Constant))) != 0)) {
					{
					setState(480);
					functionValues();
					}
				}

				setState(483);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PostfixExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
					setState(486);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(487);
					match(LeftBracket);
					setState(488);
					expression(0);
					setState(489);
					match(RightBracket);
					}
					} 
				}
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SLLanguageParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(SLLanguageParser.Constant, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_primaryExpression);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				match(Identifier);
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(Constant);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				match(LeftParen);
				setState(499);
				expression(0);
				setState(500);
				match(RightParen);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(503);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forCondition);
		int _la;
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				forDeclaration();
				setState(507);
				match(Semi);
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Not) | (1L << Identifier) | (1L << DigitSequence) | (1L << Constant))) != 0)) {
					{
					setState(508);
					logicalOrExpression(0);
					}
				}

				setState(511);
				match(Semi);
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Not) | (1L << Identifier) | (1L << DigitSequence) | (1L << Constant))) != 0)) {
					{
					setState(512);
					forExpression(0);
					}
				}

				}
				break;
			case T__1:
			case T__2:
			case LeftParen:
			case Plus:
			case Minus:
			case Star:
			case Not:
			case Semi:
			case Identifier:
			case DigitSequence:
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Not) | (1L << Identifier) | (1L << DigitSequence) | (1L << Constant))) != 0)) {
					{
					setState(515);
					forInit();
					}
				}

				setState(518);
				match(Semi);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Not) | (1L << Identifier) | (1L << DigitSequence) | (1L << Constant))) != 0)) {
					{
					setState(519);
					logicalOrExpression(0);
					}
				}

				setState(522);
				match(Semi);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Not) | (1L << Identifier) | (1L << DigitSequence) | (1L << Constant))) != 0)) {
					{
					setState(523);
					forExpression(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_forDeclaration);
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				typeSpecifier();
				setState(529);
				initDeclaratorList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				typeSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			forExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SLLanguageListener ) ((SLLanguageListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SLLanguageVisitor ) return ((SLLanguageVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		return forExpression(0);
	}

	private ForExpressionContext forExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, _parentState);
		ForExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_forExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(537);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ForExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_forExpression);
					setState(539);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(540);
					match(Comma);
					setState(541);
					assignmentExpression();
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 19:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 27:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 28:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 30:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 31:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 32:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 33:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 37:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 42:
			return forExpression_sempred((ForExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean forExpression_sempred(ForExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0226\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\5\2Z\n\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3b\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u0087\n\b\3\b"+
		"\3\b\3\b\3\b\5\b\u008d\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u009a\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c8\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u00d0\n\f\f\f\16\f\u00d3\13\f\3\f\3\f\5\f\u00d7"+
		"\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e4\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ef\n\17\f\17"+
		"\16\17\u00f2\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fc"+
		"\n\17\5\17\u00fe\n\17\3\20\3\20\5\20\u0102\n\20\3\20\3\20\3\21\5\21\u0107"+
		"\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u0110\n\22\f\22\16\22\u0113"+
		"\13\22\3\23\3\23\5\23\u0117\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u011e\n"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0126\n\25\f\25\16\25\u0129\13"+
		"\25\3\26\3\26\3\26\3\26\5\26\u012f\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0137\n\27\3\27\5\27\u013a\n\27\3\30\3\30\3\30\3\30\3\30\3\30\7"+
		"\30\u0142\n\30\f\30\16\30\u0145\13\30\3\31\3\31\3\31\3\31\3\31\5\31\u014c"+
		"\n\31\5\31\u014e\n\31\3\32\3\32\3\33\3\33\3\33\5\33\u0155\n\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0172"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u017a\n\35\f\35\16\35\u017d\13"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0185\n\36\f\36\16\36\u0188\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0190\n\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \7 \u019b\n \f \16 \u019e\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\7!\u01af\n!\f!\16!\u01b2\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\7\"\u01bd\n\"\f\"\16\"\u01c0\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\7#\u01ce\n#\f#\16#\u01d1\13#\3$\3$\5$\u01d5\n$\3%\3%\3%\3%\5"+
		"%\u01db\n%\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u01e4\n\'\3\'\5\'\u01e7\n\'\3"+
		"\'\3\'\3\'\3\'\3\'\7\'\u01ee\n\'\f\'\16\'\u01f1\13\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\5(\u01fb\n(\3)\3)\3)\5)\u0200\n)\3)\3)\5)\u0204\n)\3)\5)\u0207"+
		"\n)\3)\3)\5)\u020b\n)\3)\3)\5)\u020f\n)\5)\u0211\n)\3*\3*\3*\3*\5*\u0217"+
		"\n*\3+\3+\3,\3,\3,\3,\3,\3,\7,\u0221\n,\f,\16,\u0224\13,\3,\2\r\"(.8:"+
		">@BDLV-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTV\2\6\4\2\4\5\63\63\3\2\62\63\4\2\b\b\24\24\4\2#%**\2\u0252"+
		"\2Y\3\2\2\2\4a\3\2\2\2\6m\3\2\2\2\bo\3\2\2\2\nv\3\2\2\2\fx\3\2\2\2\16"+
		"\u0086\3\2\2\2\20\u0099\3\2\2\2\22\u009b\3\2\2\2\24\u009d\3\2\2\2\26\u00d6"+
		"\3\2\2\2\30\u00d8\3\2\2\2\32\u00e3\3\2\2\2\34\u00fd\3\2\2\2\36\u00ff\3"+
		"\2\2\2 \u0106\3\2\2\2\"\u010a\3\2\2\2$\u0116\3\2\2\2&\u011d\3\2\2\2(\u011f"+
		"\3\2\2\2*\u012e\3\2\2\2,\u0139\3\2\2\2.\u013b\3\2\2\2\60\u0146\3\2\2\2"+
		"\62\u014f\3\2\2\2\64\u0151\3\2\2\2\66\u0171\3\2\2\28\u0173\3\2\2\2:\u017e"+
		"\3\2\2\2<\u018f\3\2\2\2>\u0191\3\2\2\2@\u019f\3\2\2\2B\u01b3\3\2\2\2D"+
		"\u01c1\3\2\2\2F\u01d4\3\2\2\2H\u01da\3\2\2\2J\u01dc\3\2\2\2L\u01e6\3\2"+
		"\2\2N\u01fa\3\2\2\2P\u0210\3\2\2\2R\u0216\3\2\2\2T\u0218\3\2\2\2V\u021a"+
		"\3\2\2\2XZ\5\4\3\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\2\2\3\\\3\3\2\2"+
		"\2]b\5\6\4\2^_\5\6\4\2_`\5\4\3\2`b\3\2\2\2a]\3\2\2\2a^\3\2\2\2b\5\3\2"+
		"\2\2cn\5\16\b\2dn\5&\24\2en\5\26\f\2fg\5\64\33\2gh\7-\2\2hn\3\2\2\2in"+
		"\5\b\5\2jk\5<\37\2kl\7-\2\2ln\3\2\2\2mc\3\2\2\2md\3\2\2\2me\3\2\2\2mf"+
		"\3\2\2\2mi\3\2\2\2mj\3\2\2\2n\7\3\2\2\2op\7\3\2\2pq\5\22\n\2qr\7\62\2"+
		"\2rs\7/\2\2st\5\n\6\2tu\7-\2\2u\t\3\2\2\2vw\t\2\2\2w\13\3\2\2\2xy\5\22"+
		"\n\2yz\7\33\2\2z{\7\34\2\2{|\7\62\2\2|}\7/\2\2}~\7\6\2\2~\177\5\22\n\2"+
		"\177\u0080\7\33\2\2\u0080\u0081\t\3\2\2\u0081\u0082\7\34\2\2\u0082\u0083"+
		"\7-\2\2\u0083\r\3\2\2\2\u0084\u0087\5\22\n\2\u0085\u0087\5\24\13\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\7"+
		"\2\2\u0089\u008a\7\62\2\2\u008a\u008c\7\31\2\2\u008b\u008d\5\20\t\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\32"+
		"\2\2\u008f\u0090\5\36\20\2\u0090\17\3\2\2\2\u0091\u0092\5\22\n\2\u0092"+
		"\u0093\7\62\2\2\u0093\u0094\7.\2\2\u0094\u0095\5\20\t\2\u0095\u009a\3"+
		"\2\2\2\u0096\u0097\5\22\n\2\u0097\u0098\7\62\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0091\3\2\2\2\u0099\u0096\3\2\2\2\u009a\21\3\2\2\2\u009b\u009c\t\4\2"+
		"\2\u009c\23\3\2\2\2\u009d\u009e\7\27\2\2\u009e\25\3\2\2\2\u009f\u00a0"+
		"\7\22\2\2\u00a0\u00a1\7\31\2\2\u00a1\u00a2\5P)\2\u00a2\u00a3\7\32\2\2"+
		"\u00a3\u00a4\5\36\20\2\u00a4\u00d7\3\2\2\2\u00a5\u00a6\7\30\2\2\u00a6"+
		"\u00a7\7\31\2\2\u00a7\u00a8\58\35\2\u00a8\u00a9\7\32\2\2\u00a9\u00aa\5"+
		"\36\20\2\u00aa\u00d7\3\2\2\2\u00ab\u00ac\7\t\2\2\u00ac\u00ad\7\31\2\2"+
		"\u00ad\u00ae\58\35\2\u00ae\u00af\7\32\2\2\u00af\u00b0\5\36\20\2\u00b0"+
		"\u00d7\3\2\2\2\u00b1\u00b2\7\20\2\2\u00b2\u00b3\5\36\20\2\u00b3\u00b4"+
		"\7\30\2\2\u00b4\u00b5\7\31\2\2\u00b5\u00b6\58\35\2\u00b6\u00b7\7\32\2"+
		"\2\u00b7\u00b8\7-\2\2\u00b8\u00d7\3\2\2\2\u00b9\u00ba\7\n\2\2\u00ba\u00bb"+
		"\5\36\20\2\u00bb\u00bc\7\t\2\2\u00bc\u00bd\7\31\2\2\u00bd\u00be\58\35"+
		"\2\u00be\u00bf\7\32\2\2\u00bf\u00c0\7-\2\2\u00c0\u00d7\3\2\2\2\u00c1\u00c2"+
		"\7\23\2\2\u00c2\u00c3\7\31\2\2\u00c3\u00c4\58\35\2\u00c4\u00c5\7\32\2"+
		"\2\u00c5\u00c7\5\36\20\2\u00c6\u00c8\5\30\r\2\u00c7\u00c6\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00d7\3\2\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00cb\7"+
		"\31\2\2\u00cb\u00cc\5.\30\2\u00cc\u00cd\7\32\2\2\u00cd\u00d1\7\35\2\2"+
		"\u00ce\u00d0\5\34\17\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\7\36\2\2\u00d5\u00d7\3\2\2\2\u00d6\u009f\3\2\2\2\u00d6\u00a5\3"+
		"\2\2\2\u00d6\u00ab\3\2\2\2\u00d6\u00b1\3\2\2\2\u00d6\u00b9\3\2\2\2\u00d6"+
		"\u00c1\3\2\2\2\u00d6\u00c9\3\2\2\2\u00d7\27\3\2\2\2\u00d8\u00d9\7\21\2"+
		"\2\u00d9\u00da\5\36\20\2\u00da\31\3\2\2\2\u00db\u00e4\5\34\17\2\u00dc"+
		"\u00e4\5\36\20\2\u00dd\u00de\5\64\33\2\u00de\u00df\7-\2\2\u00df\u00e4"+
		"\3\2\2\2\u00e0\u00e4\5 \21\2\u00e1\u00e4\5\26\f\2\u00e2\u00e4\5,\27\2"+
		"\u00e3\u00db\3\2\2\2\u00e3\u00dc\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00e0"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\33\3\2\2\2\u00e5"+
		"\u00e6\7\f\2\2\u00e6\u00e7\7\63\2\2\u00e7\u00f0\7,\2\2\u00e8\u00ef\5\36"+
		"\20\2\u00e9\u00ef\5 \21\2\u00ea\u00ef\5,\27\2\u00eb\u00ec\5\64\33\2\u00ec"+
		"\u00ed\7-\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00e9\3\2"+
		"\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00fe\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00f4\7\17\2\2\u00f4\u00fb\7,\2\2\u00f5\u00fc\5\36\20\2\u00f6"+
		"\u00fc\5 \21\2\u00f7\u00fc\5,\27\2\u00f8\u00f9\5\64\33\2\u00f9\u00fa\7"+
		"-\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fb"+
		"\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00e5\3\2"+
		"\2\2\u00fd\u00f3\3\2\2\2\u00fe\35\3\2\2\2\u00ff\u0101\7\35\2\2\u0100\u0102"+
		"\5\"\22\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2"+
		"\u0103\u0104\7\36\2\2\u0104\37\3\2\2\2\u0105\u0107\5.\30\2\u0106\u0105"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7-\2\2\u0109"+
		"!\3\2\2\2\u010a\u010b\b\22\1\2\u010b\u010c\5$\23\2\u010c\u0111\3\2\2\2"+
		"\u010d\u010e\f\3\2\2\u010e\u0110\5$\23\2\u010f\u010d\3\2\2\2\u0110\u0113"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112#\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0117\5&\24\2\u0115\u0117\5\32\16\2\u0116\u0114\3"+
		"\2\2\2\u0116\u0115\3\2\2\2\u0117%\3\2\2\2\u0118\u0119\5\22\n\2\u0119\u011a"+
		"\5(\25\2\u011a\u011b\7-\2\2\u011b\u011e\3\2\2\2\u011c\u011e\5\f\7\2\u011d"+
		"\u0118\3\2\2\2\u011d\u011c\3\2\2\2\u011e\'\3\2\2\2\u011f\u0120\b\25\1"+
		"\2\u0120\u0121\5*\26\2\u0121\u0127\3\2\2\2\u0122\u0123\f\3\2\2\u0123\u0124"+
		"\7.\2\2\u0124\u0126\5*\26\2\u0125\u0122\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128)\3\2\2\2\u0129\u0127\3\2\2\2"+
		"\u012a\u012f\7\62\2\2\u012b\u012c\7\62\2\2\u012c\u012d\7/\2\2\u012d\u012f"+
		"\5<\37\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012f+\3\2\2\2\u0130"+
		"\u0131\7\16\2\2\u0131\u013a\7-\2\2\u0132\u0133\7\13\2\2\u0133\u013a\7"+
		"-\2\2\u0134\u0136\7\25\2\2\u0135\u0137\5.\30\2\u0136\u0135\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\7-\2\2\u0139\u0130\3\2"+
		"\2\2\u0139\u0132\3\2\2\2\u0139\u0134\3\2\2\2\u013a-\3\2\2\2\u013b\u013c"+
		"\b\30\1\2\u013c\u013d\5<\37\2\u013d\u0143\3\2\2\2\u013e\u013f\f\3\2\2"+
		"\u013f\u0140\7.\2\2\u0140\u0142\5<\37\2\u0141\u013e\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144/\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u014d\58\35\2\u0147\u0148\7+\2\2\u0148\u014b\5.\30"+
		"\2\u0149\u014a\7,\2\2\u014a\u014c\5.\30\2\u014b\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u0147\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\61\3\2\2\2\u014f\u0150\7/\2\2\u0150\63\3\2\2\2\u0151\u0152\7\62\2\2\u0152"+
		"\u0154\7\31\2\2\u0153\u0155\5.\30\2\u0154\u0153\3\2\2\2\u0154\u0155\3"+
		"\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7\32\2\2\u0157\65\3\2\2\2\u0158"+
		"\u0172\7\62\2\2\u0159\u015a\7\62\2\2\u015a\u015b\7.\2\2\u015b\u0172\5"+
		"\66\34\2\u015c\u0172\7\64\2\2\u015d\u015e\7\64\2\2\u015e\u015f\7.\2\2"+
		"\u015f\u0172\5\66\34\2\u0160\u0172\7\63\2\2\u0161\u0162\7\63\2\2\u0162"+
		"\u0163\7.\2\2\u0163\u0172\5\66\34\2\u0164\u0172\7\5\2\2\u0165\u0166\7"+
		"\5\2\2\u0166\u0167\7.\2\2\u0167\u0172\5\66\34\2\u0168\u0172\7\4\2\2\u0169"+
		"\u016a\7\4\2\2\u016a\u016b\7.\2\2\u016b\u0172\5\66\34\2\u016c\u0172\5"+
		"\64\33\2\u016d\u016e\5\64\33\2\u016e\u016f\7.\2\2\u016f\u0170\5\66\34"+
		"\2\u0170\u0172\3\2\2\2\u0171\u0158\3\2\2\2\u0171\u0159\3\2\2\2\u0171\u015c"+
		"\3\2\2\2\u0171\u015d\3\2\2\2\u0171\u0160\3\2\2\2\u0171\u0161\3\2\2\2\u0171"+
		"\u0164\3\2\2\2\u0171\u0165\3\2\2\2\u0171\u0168\3\2\2\2\u0171\u0169\3\2"+
		"\2\2\u0171\u016c\3\2\2\2\u0171\u016d\3\2\2\2\u0172\67\3\2\2\2\u0173\u0174"+
		"\b\35\1\2\u0174\u0175\5:\36\2\u0175\u017b\3\2\2\2\u0176\u0177\f\3\2\2"+
		"\u0177\u0178\7)\2\2\u0178\u017a\5:\36\2\u0179\u0176\3\2\2\2\u017a\u017d"+
		"\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c9\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017e\u017f\b\36\1\2\u017f\u0180\5> \2\u0180\u0186\3\2"+
		"\2\2\u0181\u0182\f\3\2\2\u0182\u0183\7(\2\2\u0183\u0185\5> \2\u0184\u0181"+
		"\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		";\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u0190\5\60\31\2\u018a\u018b\5H%\2"+
		"\u018b\u018c\5\62\32\2\u018c\u018d\5<\37\2\u018d\u0190\3\2\2\2\u018e\u0190"+
		"\7\63\2\2\u018f\u0189\3\2\2\2\u018f\u018a\3\2\2\2\u018f\u018e\3\2\2\2"+
		"\u0190=\3\2\2\2\u0191\u0192\b \1\2\u0192\u0193\5@!\2\u0193\u019c\3\2\2"+
		"\2\u0194\u0195\f\4\2\2\u0195\u0196\7\60\2\2\u0196\u019b\5@!\2\u0197\u0198"+
		"\f\3\2\2\u0198\u0199\7\61\2\2\u0199\u019b\5@!\2\u019a\u0194\3\2\2\2\u019a"+
		"\u0197\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d?\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\b!\1\2\u01a0\u01a1"+
		"\5B\"\2\u01a1\u01b0\3\2\2\2\u01a2\u01a3\f\6\2\2\u01a3\u01a4\7\37\2\2\u01a4"+
		"\u01af\5B\"\2\u01a5\u01a6\f\5\2\2\u01a6\u01a7\7!\2\2\u01a7\u01af\5B\""+
		"\2\u01a8\u01a9\f\4\2\2\u01a9\u01aa\7 \2\2\u01aa\u01af\5B\"\2\u01ab\u01ac"+
		"\f\3\2\2\u01ac\u01ad\7\"\2\2\u01ad\u01af\5B\"\2\u01ae\u01a2\3\2\2\2\u01ae"+
		"\u01a5\3\2\2\2\u01ae\u01a8\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af\u01b2\3\2"+
		"\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1A\3\2\2\2\u01b2\u01b0"+
		"\3\2\2\2\u01b3\u01b4\b\"\1\2\u01b4\u01b5\5D#\2\u01b5\u01be\3\2\2\2\u01b6"+
		"\u01b7\f\4\2\2\u01b7\u01b8\7#\2\2\u01b8\u01bd\5D#\2\u01b9\u01ba\f\3\2"+
		"\2\u01ba\u01bb\7$\2\2\u01bb\u01bd\5D#\2\u01bc\u01b6\3\2\2\2\u01bc\u01b9"+
		"\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"C\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\b#\1\2\u01c2\u01c3\5F$\2\u01c3"+
		"\u01cf\3\2\2\2\u01c4\u01c5\f\5\2\2\u01c5\u01c6\7%\2\2\u01c6\u01ce\5F$"+
		"\2\u01c7\u01c8\f\4\2\2\u01c8\u01c9\7&\2\2\u01c9\u01ce\5F$\2\u01ca\u01cb"+
		"\f\3\2\2\u01cb\u01cc\7\'\2\2\u01cc\u01ce\5F$\2\u01cd\u01c4\3\2\2\2\u01cd"+
		"\u01c7\3\2\2\2\u01cd\u01ca\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2"+
		"\2\2\u01cf\u01d0\3\2\2\2\u01d0E\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5"+
		"\5H%\2\u01d3\u01d5\7\63\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5"+
		"G\3\2\2\2\u01d6\u01db\5L\'\2\u01d7\u01d8\5J&\2\u01d8\u01d9\5F$\2\u01d9"+
		"\u01db\3\2\2\2\u01da\u01d6\3\2\2\2\u01da\u01d7\3\2\2\2\u01dbI\3\2\2\2"+
		"\u01dc\u01dd\t\5\2\2\u01ddK\3\2\2\2\u01de\u01df\b\'\1\2\u01df\u01e7\5"+
		"N(\2\u01e0\u01e1\7\62\2\2\u01e1\u01e3\7\31\2\2\u01e2\u01e4\5\66\34\2\u01e3"+
		"\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\7\32"+
		"\2\2\u01e6\u01de\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e7\u01ef\3\2\2\2\u01e8"+
		"\u01e9\f\4\2\2\u01e9\u01ea\7\33\2\2\u01ea\u01eb\5.\30\2\u01eb\u01ec\7"+
		"\34\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01e8\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0M\3\2\2\2\u01f1\u01ef\3\2\2\2"+
		"\u01f2\u01fb\7\62\2\2\u01f3\u01fb\7\64\2\2\u01f4\u01f5\7\31\2\2\u01f5"+
		"\u01f6\5.\30\2\u01f6\u01f7\7\32\2\2\u01f7\u01fb\3\2\2\2\u01f8\u01fb\7"+
		"\4\2\2\u01f9\u01fb\7\5\2\2\u01fa\u01f2\3\2\2\2\u01fa\u01f3\3\2\2\2\u01fa"+
		"\u01f4\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fbO\3\2\2\2"+
		"\u01fc\u01fd\5R*\2\u01fd\u01ff\7-\2\2\u01fe\u0200\58\35\2\u01ff\u01fe"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\7-\2\2\u0202"+
		"\u0204\5V,\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0211\3\2\2"+
		"\2\u0205\u0207\5T+\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208"+
		"\3\2\2\2\u0208\u020a\7-\2\2\u0209\u020b\58\35\2\u020a\u0209\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\7-\2\2\u020d\u020f\5V,"+
		"\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u01fc"+
		"\3\2\2\2\u0210\u0206\3\2\2\2\u0211Q\3\2\2\2\u0212\u0213\5\22\n\2\u0213"+
		"\u0214\5(\25\2\u0214\u0217\3\2\2\2\u0215\u0217\5\22\n\2\u0216\u0212\3"+
		"\2\2\2\u0216\u0215\3\2\2\2\u0217S\3\2\2\2\u0218\u0219\5V,\2\u0219U\3\2"+
		"\2\2\u021a\u021b\b,\1\2\u021b\u021c\5<\37\2\u021c\u0222\3\2\2\2\u021d"+
		"\u021e\f\3\2\2\u021e\u021f\7.\2\2\u021f\u0221\5<\37\2\u0220\u021d\3\2"+
		"\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"W\3\2\2\2\u0224\u0222\3\2\2\2\67Yam\u0086\u008c\u0099\u00c7\u00d1\u00d6"+
		"\u00e3\u00ee\u00f0\u00fb\u00fd\u0101\u0106\u0111\u0116\u011d\u0127\u012e"+
		"\u0136\u0139\u0143\u014b\u014d\u0154\u0171\u017b\u0186\u018f\u019a\u019c"+
		"\u01ae\u01b0\u01bc\u01be\u01cd\u01cf\u01d4\u01da\u01e3\u01e6\u01ef\u01fa"+
		"\u01ff\u0203\u0206\u020a\u020e\u0210\u0216\u0222";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}