package generatedParser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SLLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
		Equal=49, NotEqual=50, Identifier=51, DigitSequence=52, Constant=53, StringLiteral=54;
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
		"SChar"
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
		"DigitSequence", "Constant", "StringLiteral"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01c8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\7\64\u014e\n\64\f\64\16\64\u0151\13\64"+
		"\3\65\6\65\u0154\n\65\r\65\16\65\u0155\3\66\3\66\5\66\u015a\n\66\3\67"+
		"\3\67\38\38\78\u0160\n8\f8\168\u0163\138\39\39\3:\3:\3;\3;\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0181\n<\3"+
		"=\6=\u0184\n=\r=\16=\u0185\3>\3>\5>\u018a\n>\3?\3?\3?\5?\u018f\n?\3@\3"+
		"@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u019f\nA\3B\3B\3B\3B\6B\u01a5"+
		"\nB\rB\16B\u01a6\3C\3C\3D\3D\3E\5E\u01ae\nE\3E\3E\5E\u01b2\nE\3E\3E\3"+
		"F\3F\3F\5F\u01b9\nF\3G\6G\u01bc\nG\rG\16G\u01bd\3H\3H\3H\3H\3H\3H\3H\5"+
		"H\u01c7\nH\2\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2"+
		"\u0087\2\u00898\u008b\2\u008d\2\u008f\2\3\2\13\5\2C\\aac|\3\2\62;\3\2"+
		"\63;\6\2\f\f\17\17))^^\f\2$$))AA^^cdhhppttvvxx\3\2\629\5\2\62;CHch\5\2"+
		"NNWWww\6\2\f\f\17\17$$^^\2\u01cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2\u0089\3\2\2\2\3\u0091\3\2\2\2\5\u009a\3\2\2\2"+
		"\7\u00a2\3\2\2\2\t\u00a8\3\2\2\2\13\u00ae\3\2\2\2\r\u00b3\3\2\2\2\17\u00b8"+
		"\3\2\2\2\21\u00c1\3\2\2\2\23\u00c9\3\2\2\2\25\u00cc\3\2\2\2\27\u00d1\3"+
		"\2\2\2\31\u00d5\3\2\2\2\33\u00d8\3\2\2\2\35\u00dc\3\2\2\2\37\u00e1\3\2"+
		"\2\2!\u00e8\3\2\2\2#\u00ee\3\2\2\2%\u00f5\3\2\2\2\'\u00fa\3\2\2\2)\u0100"+
		"\3\2\2\2+\u0102\3\2\2\2-\u0104\3\2\2\2/\u0106\3\2\2\2\61\u0108\3\2\2\2"+
		"\63\u010a\3\2\2\2\65\u010c\3\2\2\2\67\u010e\3\2\2\29\u0111\3\2\2\2;\u0113"+
		"\3\2\2\2=\u0116\3\2\2\2?\u0118\3\2\2\2A\u011b\3\2\2\2C\u011d\3\2\2\2E"+
		"\u0120\3\2\2\2G\u0122\3\2\2\2I\u0124\3\2\2\2K\u0126\3\2\2\2M\u0129\3\2"+
		"\2\2O\u012c\3\2\2\2Q\u012e\3\2\2\2S\u0130\3\2\2\2U\u0132\3\2\2\2W\u0134"+
		"\3\2\2\2Y\u0136\3\2\2\2[\u0138\3\2\2\2]\u013b\3\2\2\2_\u013e\3\2\2\2a"+
		"\u0141\3\2\2\2c\u0144\3\2\2\2e\u0147\3\2\2\2g\u014a\3\2\2\2i\u0153\3\2"+
		"\2\2k\u0159\3\2\2\2m\u015b\3\2\2\2o\u015d\3\2\2\2q\u0164\3\2\2\2s\u0166"+
		"\3\2\2\2u\u0168\3\2\2\2w\u0180\3\2\2\2y\u0183\3\2\2\2{\u0189\3\2\2\2}"+
		"\u018e\3\2\2\2\177\u0190\3\2\2\2\u0081\u019e\3\2\2\2\u0083\u01a0\3\2\2"+
		"\2\u0085\u01a8\3\2\2\2\u0087\u01aa\3\2\2\2\u0089\u01ad\3\2\2\2\u008b\u01b8"+
		"\3\2\2\2\u008d\u01bb\3\2\2\2\u008f\u01c6\3\2\2\2\u0091\u0092\7h\2\2\u0092"+
		"\u0093\7w\2\2\u0093\u0094\7p\2\2\u0094\u0095\7e\2\2\u0095\u0096\7v\2\2"+
		"\u0096\u0097\7k\2\2\u0097\u0098\7q\2\2\u0098\u0099\7p\2\2\u0099\4\3\2"+
		"\2\2\u009a\u009b\7d\2\2\u009b\u009c\7q\2\2\u009c\u009d\7q\2\2\u009d\u009e"+
		"\7n\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7p\2\2\u00a1"+
		"\6\3\2\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\u00a6\7k\2\2\u00a6\u00a7\7n\2\2\u00a7\b\3\2\2\2\u00a8\u00a9\7d\2\2\u00a9"+
		"\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7m\2\2"+
		"\u00ad\n\3\2\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7u"+
		"\2\2\u00b1\u00b2\7g\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5"+
		"\7j\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7t\2\2\u00b7\16\3\2\2\2\u00b8\u00b9"+
		"\7e\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7v\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7g\2\2"+
		"\u00c0\20\3\2\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7"+
		"h\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8"+
		"\7v\2\2\u00c8\22\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7q\2\2\u00cb\24"+
		"\3\2\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7u\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\26\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7t\2\2\u00d4\30\3\2\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7h\2\2\u00d7"+
		"\32\3\2\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7v\2\2\u00db"+
		"\34\3\2\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7p\2\2\u00df"+
		"\u00e0\7i\2\2\u00e0\36\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7g\2\2\u00e3"+
		"\u00e4\7v\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7p\2\2"+
		"\u00e7 \3\2\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7j\2\2\u00ea\u00eb\7q\2"+
		"\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7v\2\2\u00ed\"\3\2\2\2\u00ee\u00ef\7"+
		"u\2\2\u00ef\u00f0\7y\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3"+
		"\7e\2\2\u00f3\u00f4\7j\2\2\u00f4$\3\2\2\2\u00f5\u00f6\7x\2\2\u00f6\u00f7"+
		"\7q\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7f\2\2\u00f9&\3\2\2\2\u00fa\u00fb"+
		"\7y\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7n\2\2\u00fe"+
		"\u00ff\7g\2\2\u00ff(\3\2\2\2\u0100\u0101\7*\2\2\u0101*\3\2\2\2\u0102\u0103"+
		"\7+\2\2\u0103,\3\2\2\2\u0104\u0105\7]\2\2\u0105.\3\2\2\2\u0106\u0107\7"+
		"_\2\2\u0107\60\3\2\2\2\u0108\u0109\7}\2\2\u0109\62\3\2\2\2\u010a\u010b"+
		"\7\177\2\2\u010b\64\3\2\2\2\u010c\u010d\7>\2\2\u010d\66\3\2\2\2\u010e"+
		"\u010f\7>\2\2\u010f\u0110\7?\2\2\u01108\3\2\2\2\u0111\u0112\7@\2\2\u0112"+
		":\3\2\2\2\u0113\u0114\7@\2\2\u0114\u0115\7?\2\2\u0115<\3\2\2\2\u0116\u0117"+
		"\7-\2\2\u0117>\3\2\2\2\u0118\u0119\7-\2\2\u0119\u011a\7-\2\2\u011a@\3"+
		"\2\2\2\u011b\u011c\7/\2\2\u011cB\3\2\2\2\u011d\u011e\7/\2\2\u011e\u011f"+
		"\7/\2\2\u011fD\3\2\2\2\u0120\u0121\7,\2\2\u0121F\3\2\2\2\u0122\u0123\7"+
		"\61\2\2\u0123H\3\2\2\2\u0124\u0125\7\'\2\2\u0125J\3\2\2\2\u0126\u0127"+
		"\7(\2\2\u0127\u0128\7(\2\2\u0128L\3\2\2\2\u0129\u012a\7~\2\2\u012a\u012b"+
		"\7~\2\2\u012bN\3\2\2\2\u012c\u012d\7#\2\2\u012dP\3\2\2\2\u012e\u012f\7"+
		"A\2\2\u012fR\3\2\2\2\u0130\u0131\7<\2\2\u0131T\3\2\2\2\u0132\u0133\7="+
		"\2\2\u0133V\3\2\2\2\u0134\u0135\7.\2\2\u0135X\3\2\2\2\u0136\u0137\7?\2"+
		"\2\u0137Z\3\2\2\2\u0138\u0139\7\61\2\2\u0139\u013a\7?\2\2\u013a\\\3\2"+
		"\2\2\u013b\u013c\7\'\2\2\u013c\u013d\7?\2\2\u013d^\3\2\2\2\u013e\u013f"+
		"\7-\2\2\u013f\u0140\7?\2\2\u0140`\3\2\2\2\u0141\u0142\7/\2\2\u0142\u0143"+
		"\7?\2\2\u0143b\3\2\2\2\u0144\u0145\7?\2\2\u0145\u0146\7?\2\2\u0146d\3"+
		"\2\2\2\u0147\u0148\7#\2\2\u0148\u0149\7?\2\2\u0149f\3\2\2\2\u014a\u014f"+
		"\5q9\2\u014b\u014e\5q9\2\u014c\u014e\5s:\2\u014d\u014b\3\2\2\2\u014d\u014c"+
		"\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"h\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\5s:\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156j\3\2\2\2"+
		"\u0157\u015a\5m\67\2\u0158\u015a\5w<\2\u0159\u0157\3\2\2\2\u0159\u0158"+
		"\3\2\2\2\u015al\3\2\2\2\u015b\u015c\5o8\2\u015cn\3\2\2\2\u015d\u0161\5"+
		"u;\2\u015e\u0160\5s:\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162p\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0165\t\2\2\2\u0165r\3\2\2\2\u0166\u0167\t\3\2\2\u0167t\3\2\2\2\u0168"+
		"\u0169\t\4\2\2\u0169v\3\2\2\2\u016a\u016b\7)\2\2\u016b\u016c\5y=\2\u016c"+
		"\u016d\7)\2\2\u016d\u0181\3\2\2\2\u016e\u016f\7N\2\2\u016f\u0170\7)\2"+
		"\2\u0170\u0171\3\2\2\2\u0171\u0172\5y=\2\u0172\u0173\7)\2\2\u0173\u0181"+
		"\3\2\2\2\u0174\u0175\7w\2\2\u0175\u0176\7)\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0178\5y=\2\u0178\u0179\7)\2\2\u0179\u0181\3\2\2\2\u017a\u017b\7W\2\2"+
		"\u017b\u017c\7)\2\2\u017c\u017d\3\2\2\2\u017d\u017e\5y=\2\u017e\u017f"+
		"\7)\2\2\u017f\u0181\3\2\2\2\u0180\u016a\3\2\2\2\u0180\u016e\3\2\2\2\u0180"+
		"\u0174\3\2\2\2\u0180\u017a\3\2\2\2\u0181x\3\2\2\2\u0182\u0184\5{>\2\u0183"+
		"\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186z\3\2\2\2\u0187\u018a\n\5\2\2\u0188\u018a\5}?\2\u0189\u0187"+
		"\3\2\2\2\u0189\u0188\3\2\2\2\u018a|\3\2\2\2\u018b\u018f\5\177@\2\u018c"+
		"\u018f\5\u0081A\2\u018d\u018f\5\u0083B\2\u018e\u018b\3\2\2\2\u018e\u018c"+
		"\3\2\2\2\u018e\u018d\3\2\2\2\u018f~\3\2\2\2\u0190\u0191\7^\2\2\u0191\u0192"+
		"\t\6\2\2\u0192\u0080\3\2\2\2\u0193\u0194\7^\2\2\u0194\u019f\5\u0085C\2"+
		"\u0195\u0196\7^\2\2\u0196\u0197\5\u0085C\2\u0197\u0198\5\u0085C\2\u0198"+
		"\u019f\3\2\2\2\u0199\u019a\7^\2\2\u019a\u019b\5\u0085C\2\u019b\u019c\5"+
		"\u0085C\2\u019c\u019d\5\u0085C\2\u019d\u019f\3\2\2\2\u019e\u0193\3\2\2"+
		"\2\u019e\u0195\3\2\2\2\u019e\u0199\3\2\2\2\u019f\u0082\3\2\2\2\u01a0\u01a1"+
		"\7^\2\2\u01a1\u01a2\7z\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a5\5\u0087D\2"+
		"\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u0084\3\2\2\2\u01a8\u01a9\t\7\2\2\u01a9\u0086\3\2\2\2\u01aa"+
		"\u01ab\t\b\2\2\u01ab\u0088\3\2\2\2\u01ac\u01ae\5\u008bF\2\u01ad\u01ac"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\7$\2\2\u01b0"+
		"\u01b2\5\u008dG\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b4\7$\2\2\u01b4\u008a\3\2\2\2\u01b5\u01b6\7w\2\2\u01b6"+
		"\u01b9\7:\2\2\u01b7\u01b9\t\t\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b7\3\2"+
		"\2\2\u01b9\u008c\3\2\2\2\u01ba\u01bc\5\u008fH\2\u01bb\u01ba\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u008e\3\2"+
		"\2\2\u01bf\u01c7\n\n\2\2\u01c0\u01c7\5}?\2\u01c1\u01c2\7^\2\2\u01c2\u01c7"+
		"\7\f\2\2\u01c3\u01c4\7^\2\2\u01c4\u01c5\7\17\2\2\u01c5\u01c7\7\f\2\2\u01c6"+
		"\u01bf\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c3\3\2"+
		"\2\2\u01c7\u0090\3\2\2\2\23\2\u014d\u014f\u0155\u0159\u0161\u0180\u0185"+
		"\u0189\u018e\u019e\u01a6\u01ad\u01b1\u01b8\u01bd\u01c6\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}