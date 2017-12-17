// Generated from D:/projekty/FJP_super_language\SLLanguage.g4 by ANTLR 4.7
package generatedParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Break=4, Case=5, Char=6, Continue=7, Default=8, 
		Do=9, Else=10, For=11, If=12, Int=13, Long=14, Return=15, Short=16, Switch=17, 
		Void=18, While=19, LeftParen=20, RightParen=21, LeftBracket=22, RightBracket=23, 
		LeftBrace=24, RightBrace=25, Less=26, LessEqual=27, Greater=28, GreaterEqual=29, 
		Plus=30, PlusPlus=31, Minus=32, MinusMinus=33, Star=34, Div=35, Mod=36, 
		AndAnd=37, OrOr=38, Not=39, Question=40, Colon=41, Semi=42, Comma=43, 
		Assign=44, DivAssign=45, ModAssign=46, PlusAssign=47, MinusAssign=48, 
		Equal=49, NotEqual=50, Identifier=51, DigitSequence=52, Constant=53, StringLiteral=54, 
		LineAfterPreprocessing=55, LineDirective=56, PragmaDirective=57, Whitespace=58, 
		Newline=59, BlockComment=60, LineComment=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "Break", "Case", "Char", "Continue", "Default", 
		"Do", "Else", "For", "If", "Int", "Long", "Return", "Short", "Switch", 
		"Void", "While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
		"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "AndAnd", 
		"OrOr", "Not", "Question", "Colon", "Semi", "Comma", "Assign", "DivAssign", 
		"ModAssign", "PlusAssign", "MinusAssign", "Equal", "NotEqual", "Identifier", 
		"DigitSequence", "Constant", "IntegerConstant", "DecimalConstant", "Nondigit", 
		"Digit", "NonzeroDigit", "CharacterConstant", "CCharSequence", "CChar", 
		"EscapeSequence", "SimpleEscapeSequence", "OctalEscapeSequence", "HexadecimalEscapeSequence", 
		"OctalDigit", "HexadecimalDigit", "StringLiteral", "EncodingPrefix", "SCharSequence", 
		"SChar", "LineAfterPreprocessing", "LineDirective", "PragmaDirective", 
		"Whitespace", "Newline", "BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'boolean'", "'until'", "'break'", "'case'", "'char'", 
		"'continue'", "'default'", "'do'", "'else'", "'for'", "'if'", "'int'", 
		"'long'", "'return'", "'short'", "'switch'", "'void'", "'while'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'+'", 
		"'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'?'", 
		"':'", "';'", "','", "'='", "'/='", "'%='", "'+='", "'-='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "Break", "Case", "Char", "Continue", "Default", 
		"Do", "Else", "For", "If", "Int", "Long", "Return", "Short", "Switch", 
		"Void", "While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
		"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "AndAnd", 
		"OrOr", "Not", "Question", "Colon", "Semi", "Comma", "Assign", "DivAssign", 
		"ModAssign", "PlusAssign", "MinusAssign", "Equal", "NotEqual", "Identifier", 
		"DigitSequence", "Constant", "StringLiteral", "LineAfterPreprocessing", 
		"LineDirective", "PragmaDirective", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
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


	public SLLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SLLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u0238\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\7\64\u015c\n\64\f\64\16\64\u015f\13\64\3\65\6\65\u0162\n\65\r\65"+
		"\16\65\u0163\3\66\3\66\5\66\u0168\n\66\3\67\3\67\38\38\78\u016e\n8\f8"+
		"\168\u0171\138\39\39\3:\3:\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u018f\n<\3=\6=\u0192\n=\r=\16=\u0193\3"+
		">\3>\5>\u0198\n>\3?\3?\3?\5?\u019d\n?\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\5A\u01ad\nA\3B\3B\3B\3B\6B\u01b3\nB\rB\16B\u01b4\3C\3C\3D\3"+
		"D\3E\5E\u01bc\nE\3E\3E\5E\u01c0\nE\3E\3E\3F\3F\3F\5F\u01c7\nF\3G\6G\u01ca"+
		"\nG\rG\16G\u01cb\3H\3H\3H\3H\3H\3H\3H\5H\u01d5\nH\3I\3I\3I\3I\3I\3I\3"+
		"I\7I\u01de\nI\fI\16I\u01e1\13I\3I\7I\u01e4\nI\fI\16I\u01e7\13I\3I\3I\3"+
		"J\3J\5J\u01ed\nJ\3J\3J\5J\u01f1\nJ\3J\3J\7J\u01f5\nJ\fJ\16J\u01f8\13J"+
		"\3J\3J\3K\3K\5K\u01fe\nK\3K\3K\3K\3K\3K\3K\3K\3K\3K\7K\u0209\nK\fK\16"+
		"K\u020c\13K\3K\3K\3L\6L\u0211\nL\rL\16L\u0212\3L\3L\3M\3M\5M\u0219\nM"+
		"\3M\5M\u021c\nM\3M\3M\3N\3N\3N\3N\7N\u0224\nN\fN\16N\u0227\13N\3N\3N\3"+
		"N\3N\3N\3O\3O\3O\3O\7O\u0232\nO\fO\16O\u0235\13O\3O\3O\3\u0225\2P\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m\2o\2q"+
		"\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u00898\u008b"+
		"\2\u008d\2\u008f\2\u00919\u0093:\u0095;\u0097<\u0099=\u009b>\u009d?\3"+
		"\2\r\5\2C\\aac|\3\2\62;\3\2\63;\6\2\f\f\17\17))^^\f\2$$))AA^^cdhhpptt"+
		"vvxx\3\2\629\5\2\62;CHch\5\2NNWWww\6\2\f\f\17\17$$^^\4\2\f\f\17\17\4\2"+
		"\13\13\"\"\2\u0248\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\3\u009f"+
		"\3\2\2\2\5\u00a8\3\2\2\2\7\u00b0\3\2\2\2\t\u00b6\3\2\2\2\13\u00bc\3\2"+
		"\2\2\r\u00c1\3\2\2\2\17\u00c6\3\2\2\2\21\u00cf\3\2\2\2\23\u00d7\3\2\2"+
		"\2\25\u00da\3\2\2\2\27\u00df\3\2\2\2\31\u00e3\3\2\2\2\33\u00e6\3\2\2\2"+
		"\35\u00ea\3\2\2\2\37\u00ef\3\2\2\2!\u00f6\3\2\2\2#\u00fc\3\2\2\2%\u0103"+
		"\3\2\2\2\'\u0108\3\2\2\2)\u010e\3\2\2\2+\u0110\3\2\2\2-\u0112\3\2\2\2"+
		"/\u0114\3\2\2\2\61\u0116\3\2\2\2\63\u0118\3\2\2\2\65\u011a\3\2\2\2\67"+
		"\u011c\3\2\2\29\u011f\3\2\2\2;\u0121\3\2\2\2=\u0124\3\2\2\2?\u0126\3\2"+
		"\2\2A\u0129\3\2\2\2C\u012b\3\2\2\2E\u012e\3\2\2\2G\u0130\3\2\2\2I\u0132"+
		"\3\2\2\2K\u0134\3\2\2\2M\u0137\3\2\2\2O\u013a\3\2\2\2Q\u013c\3\2\2\2S"+
		"\u013e\3\2\2\2U\u0140\3\2\2\2W\u0142\3\2\2\2Y\u0144\3\2\2\2[\u0146\3\2"+
		"\2\2]\u0149\3\2\2\2_\u014c\3\2\2\2a\u014f\3\2\2\2c\u0152\3\2\2\2e\u0155"+
		"\3\2\2\2g\u0158\3\2\2\2i\u0161\3\2\2\2k\u0167\3\2\2\2m\u0169\3\2\2\2o"+
		"\u016b\3\2\2\2q\u0172\3\2\2\2s\u0174\3\2\2\2u\u0176\3\2\2\2w\u018e\3\2"+
		"\2\2y\u0191\3\2\2\2{\u0197\3\2\2\2}\u019c\3\2\2\2\177\u019e\3\2\2\2\u0081"+
		"\u01ac\3\2\2\2\u0083\u01ae\3\2\2\2\u0085\u01b6\3\2\2\2\u0087\u01b8\3\2"+
		"\2\2\u0089\u01bb\3\2\2\2\u008b\u01c6\3\2\2\2\u008d\u01c9\3\2\2\2\u008f"+
		"\u01d4\3\2\2\2\u0091\u01d6\3\2\2\2\u0093\u01ea\3\2\2\2\u0095\u01fb\3\2"+
		"\2\2\u0097\u0210\3\2\2\2\u0099\u021b\3\2\2\2\u009b\u021f\3\2\2\2\u009d"+
		"\u022d\3\2\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7p\2"+
		"\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6"+
		"\7q\2\2\u00a6\u00a7\7p\2\2\u00a7\4\3\2\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa"+
		"\7q\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7c\2\2\u00ae\u00af\7p\2\2\u00af\6\3\2\2\2\u00b0\u00b1\7w\2\2\u00b1"+
		"\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7n\2\2"+
		"\u00b5\b\3\2\2\2\u00b6\u00b7\7d\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7g"+
		"\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7m\2\2\u00bb\n\3\2\2\2\u00bc\u00bd"+
		"\7e\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7g\2\2\u00c0"+
		"\f\3\2\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7c\2\2\u00c4"+
		"\u00c5\7t\2\2\u00c5\16\3\2\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7q\2\2\u00c8"+
		"\u00c9\7p\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2"+
		"\u00cc\u00cd\7w\2\2\u00cd\u00ce\7g\2\2\u00ce\20\3\2\2\2\u00cf\u00d0\7"+
		"f\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4"+
		"\7w\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7v\2\2\u00d6\22\3\2\2\2\u00d7\u00d8"+
		"\7f\2\2\u00d8\u00d9\7q\2\2\u00d9\24\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc"+
		"\7n\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7g\2\2\u00de\26\3\2\2\2\u00df\u00e0"+
		"\7h\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7t\2\2\u00e2\30\3\2\2\2\u00e3\u00e4"+
		"\7k\2\2\u00e4\u00e5\7h\2\2\u00e5\32\3\2\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8"+
		"\7p\2\2\u00e8\u00e9\7v\2\2\u00e9\34\3\2\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec"+
		"\7q\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7i\2\2\u00ee\36\3\2\2\2\u00ef\u00f0"+
		"\7t\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7w\2\2\u00f3"+
		"\u00f4\7t\2\2\u00f4\u00f5\7p\2\2\u00f5 \3\2\2\2\u00f6\u00f7\7u\2\2\u00f7"+
		"\u00f8\7j\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7v\2\2"+
		"\u00fb\"\3\2\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7y\2\2\u00fe\u00ff\7k"+
		"\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7e\2\2\u0101\u0102\7j\2\2\u0102$\3"+
		"\2\2\2\u0103\u0104\7x\2\2\u0104\u0105\7q\2\2\u0105\u0106\7k\2\2\u0106"+
		"\u0107\7f\2\2\u0107&\3\2\2\2\u0108\u0109\7y\2\2\u0109\u010a\7j\2\2\u010a"+
		"\u010b\7k\2\2\u010b\u010c\7n\2\2\u010c\u010d\7g\2\2\u010d(\3\2\2\2\u010e"+
		"\u010f\7*\2\2\u010f*\3\2\2\2\u0110\u0111\7+\2\2\u0111,\3\2\2\2\u0112\u0113"+
		"\7]\2\2\u0113.\3\2\2\2\u0114\u0115\7_\2\2\u0115\60\3\2\2\2\u0116\u0117"+
		"\7}\2\2\u0117\62\3\2\2\2\u0118\u0119\7\177\2\2\u0119\64\3\2\2\2\u011a"+
		"\u011b\7>\2\2\u011b\66\3\2\2\2\u011c\u011d\7>\2\2\u011d\u011e\7?\2\2\u011e"+
		"8\3\2\2\2\u011f\u0120\7@\2\2\u0120:\3\2\2\2\u0121\u0122\7@\2\2\u0122\u0123"+
		"\7?\2\2\u0123<\3\2\2\2\u0124\u0125\7-\2\2\u0125>\3\2\2\2\u0126\u0127\7"+
		"-\2\2\u0127\u0128\7-\2\2\u0128@\3\2\2\2\u0129\u012a\7/\2\2\u012aB\3\2"+
		"\2\2\u012b\u012c\7/\2\2\u012c\u012d\7/\2\2\u012dD\3\2\2\2\u012e\u012f"+
		"\7,\2\2\u012fF\3\2\2\2\u0130\u0131\7\61\2\2\u0131H\3\2\2\2\u0132\u0133"+
		"\7\'\2\2\u0133J\3\2\2\2\u0134\u0135\7(\2\2\u0135\u0136\7(\2\2\u0136L\3"+
		"\2\2\2\u0137\u0138\7~\2\2\u0138\u0139\7~\2\2\u0139N\3\2\2\2\u013a\u013b"+
		"\7#\2\2\u013bP\3\2\2\2\u013c\u013d\7A\2\2\u013dR\3\2\2\2\u013e\u013f\7"+
		"<\2\2\u013fT\3\2\2\2\u0140\u0141\7=\2\2\u0141V\3\2\2\2\u0142\u0143\7."+
		"\2\2\u0143X\3\2\2\2\u0144\u0145\7?\2\2\u0145Z\3\2\2\2\u0146\u0147\7\61"+
		"\2\2\u0147\u0148\7?\2\2\u0148\\\3\2\2\2\u0149\u014a\7\'\2\2\u014a\u014b"+
		"\7?\2\2\u014b^\3\2\2\2\u014c\u014d\7-\2\2\u014d\u014e\7?\2\2\u014e`\3"+
		"\2\2\2\u014f\u0150\7/\2\2\u0150\u0151\7?\2\2\u0151b\3\2\2\2\u0152\u0153"+
		"\7?\2\2\u0153\u0154\7?\2\2\u0154d\3\2\2\2\u0155\u0156\7#\2\2\u0156\u0157"+
		"\7?\2\2\u0157f\3\2\2\2\u0158\u015d\5q9\2\u0159\u015c\5q9\2\u015a\u015c"+
		"\5s:\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015eh\3\2\2\2\u015f\u015d\3\2\2\2"+
		"\u0160\u0162\5s:\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164j\3\2\2\2\u0165\u0168\5m\67\2\u0166"+
		"\u0168\5w<\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168l\3\2\2\2\u0169"+
		"\u016a\5o8\2\u016an\3\2\2\2\u016b\u016f\5u;\2\u016c\u016e\5s:\2\u016d"+
		"\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170p\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\t\2\2\2\u0173r\3\2"+
		"\2\2\u0174\u0175\t\3\2\2\u0175t\3\2\2\2\u0176\u0177\t\4\2\2\u0177v\3\2"+
		"\2\2\u0178\u0179\7)\2\2\u0179\u017a\5y=\2\u017a\u017b\7)\2\2\u017b\u018f"+
		"\3\2\2\2\u017c\u017d\7N\2\2\u017d\u017e\7)\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0180\5y=\2\u0180\u0181\7)\2\2\u0181\u018f\3\2\2\2\u0182\u0183\7w\2\2"+
		"\u0183\u0184\7)\2\2\u0184\u0185\3\2\2\2\u0185\u0186\5y=\2\u0186\u0187"+
		"\7)\2\2\u0187\u018f\3\2\2\2\u0188\u0189\7W\2\2\u0189\u018a\7)\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\5y=\2\u018c\u018d\7)\2\2\u018d\u018f\3\2\2"+
		"\2\u018e\u0178\3\2\2\2\u018e\u017c\3\2\2\2\u018e\u0182\3\2\2\2\u018e\u0188"+
		"\3\2\2\2\u018fx\3\2\2\2\u0190\u0192\5{>\2\u0191\u0190\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194z\3\2\2\2\u0195"+
		"\u0198\n\5\2\2\u0196\u0198\5}?\2\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2"+
		"\2\u0198|\3\2\2\2\u0199\u019d\5\177@\2\u019a\u019d\5\u0081A\2\u019b\u019d"+
		"\5\u0083B\2\u019c\u0199\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2"+
		"\2\u019d~\3\2\2\2\u019e\u019f\7^\2\2\u019f\u01a0\t\6\2\2\u01a0\u0080\3"+
		"\2\2\2\u01a1\u01a2\7^\2\2\u01a2\u01ad\5\u0085C\2\u01a3\u01a4\7^\2\2\u01a4"+
		"\u01a5\5\u0085C\2\u01a5\u01a6\5\u0085C\2\u01a6\u01ad\3\2\2\2\u01a7\u01a8"+
		"\7^\2\2\u01a8\u01a9\5\u0085C\2\u01a9\u01aa\5\u0085C\2\u01aa\u01ab\5\u0085"+
		"C\2\u01ab\u01ad\3\2\2\2\u01ac\u01a1\3\2\2\2\u01ac\u01a3\3\2\2\2\u01ac"+
		"\u01a7\3\2\2\2\u01ad\u0082\3\2\2\2\u01ae\u01af\7^\2\2\u01af\u01b0\7z\2"+
		"\2\u01b0\u01b2\3\2\2\2\u01b1\u01b3\5\u0087D\2\u01b2\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u0084\3\2"+
		"\2\2\u01b6\u01b7\t\7\2\2\u01b7\u0086\3\2\2\2\u01b8\u01b9\t\b\2\2\u01b9"+
		"\u0088\3\2\2\2\u01ba\u01bc\5\u008bF\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\7$\2\2\u01be\u01c0\5\u008dG\2"+
		"\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2"+
		"\7$\2\2\u01c2\u008a\3\2\2\2\u01c3\u01c4\7w\2\2\u01c4\u01c7\7:\2\2\u01c5"+
		"\u01c7\t\t\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\u008c\3\2"+
		"\2\2\u01c8\u01ca\5\u008fH\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u008e\3\2\2\2\u01cd\u01d5\n\n"+
		"\2\2\u01ce\u01d5\5}?\2\u01cf\u01d0\7^\2\2\u01d0\u01d5\7\f\2\2\u01d1\u01d2"+
		"\7^\2\2\u01d2\u01d3\7\17\2\2\u01d3\u01d5\7\f\2\2\u01d4\u01cd\3\2\2\2\u01d4"+
		"\u01ce\3\2\2\2\u01d4\u01cf\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d5\u0090\3\2"+
		"\2\2\u01d6\u01d7\7%\2\2\u01d7\u01d8\7n\2\2\u01d8\u01d9\7k\2\2\u01d9\u01da"+
		"\7p\2\2\u01da\u01db\7g\2\2\u01db\u01df\3\2\2\2\u01dc\u01de\5\u0097L\2"+
		"\u01dd\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e5\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e4\n\13\2\2"+
		"\u01e3\u01e2\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6"+
		"\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\bI\2\2\u01e9"+
		"\u0092\3\2\2\2\u01ea\u01ec\7%\2\2\u01eb\u01ed\5\u0097L\2\u01ec\u01eb\3"+
		"\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\5o8\2\u01ef"+
		"\u01f1\5\u0097L\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f6\5\u0089E\2\u01f3\u01f5\n\13\2\2\u01f4\u01f3\3\2\2"+
		"\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9"+
		"\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\bJ\2\2\u01fa\u0094\3\2\2\2\u01fb"+
		"\u01fd\7%\2\2\u01fc\u01fe\5\u0097L\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3"+
		"\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7r\2\2\u0200\u0201\7t\2\2\u0201"+
		"\u0202\7c\2\2\u0202\u0203\7i\2\2\u0203\u0204\7o\2\2\u0204\u0205\7c\2\2"+
		"\u0205\u0206\3\2\2\2\u0206\u020a\5\u0097L\2\u0207\u0209\n\13\2\2\u0208"+
		"\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020e\bK\2\2\u020e"+
		"\u0096\3\2\2\2\u020f\u0211\t\f\2\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0215\bL\2\2\u0215\u0098\3\2\2\2\u0216\u0218\7\17\2\2\u0217\u0219\7\f"+
		"\2\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021c\3\2\2\2\u021a"+
		"\u021c\7\f\2\2\u021b\u0216\3\2\2\2\u021b\u021a\3\2\2\2\u021c\u021d\3\2"+
		"\2\2\u021d\u021e\bM\2\2\u021e\u009a\3\2\2\2\u021f\u0220\7\61\2\2\u0220"+
		"\u0221\7,\2\2\u0221\u0225\3\2\2\2\u0222\u0224\13\2\2\2\u0223\u0222\3\2"+
		"\2\2\u0224\u0227\3\2\2\2\u0225\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226"+
		"\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0229\7,\2\2\u0229\u022a\7\61"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\u022c\bN\2\2\u022c\u009c\3\2\2\2\u022d"+
		"\u022e\7\61\2\2\u022e\u022f\7\61\2\2\u022f\u0233\3\2\2\2\u0230\u0232\n"+
		"\13\2\2\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237\bO"+
		"\2\2\u0237\u009e\3\2\2\2\37\2\u015b\u015d\u0163\u0167\u016f\u018e\u0193"+
		"\u0197\u019c\u01ac\u01b4\u01bb\u01bf\u01c6\u01cb\u01d4\u01df\u01e5\u01ec"+
		"\u01f0\u01f6\u01fd\u020a\u0212\u0218\u021b\u0225\u0233\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}