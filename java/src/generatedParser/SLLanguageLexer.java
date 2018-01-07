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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Break=9, 
		Case=10, Char=11, Continue=12, Default=13, Do=14, Else=15, For=16, If=17, 
		Int=18, Return=19, Switch=20, Void=21, While=22, LeftParen=23, RightParen=24, 
		LeftBracket=25, RightBracket=26, LeftBrace=27, RightBrace=28, Less=29, 
		LessEqual=30, Greater=31, GreaterEqual=32, Plus=33, Minus=34, Star=35, 
		Div=36, Mod=37, AndAnd=38, OrOr=39, Not=40, Question=41, Colon=42, Semi=43, 
		Comma=44, Assign=45, Equal=46, NotEqual=47, Identifier=48, DigitSequence=49, 
		Constant=50, Whitespace=51, Newline=52, BlockComment=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Break", 
		"Case", "Char", "Continue", "Default", "Do", "Else", "For", "If", "Int", 
		"Return", "Switch", "Void", "While", "LeftParen", "RightParen", "LeftBracket", 
		"RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", 
		"GreaterEqual", "Plus", "Minus", "Star", "Div", "Mod", "AndAnd", "OrOr", 
		"Not", "Question", "Colon", "Semi", "Comma", "Assign", "Equal", "NotEqual", 
		"Identifier", "DigitSequence", "Constant", "IntegerConstant", "DecimalConstant", 
		"Nondigit", "Digit", "NonzeroDigit", "Whitespace", "Newline", "BlockComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u016b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'"+
		"\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\7\61\u0133\n\61\f\61\16\61\u0136\13\61\3\62\6\62\u0139"+
		"\n\62\r\62\16\62\u013a\3\63\3\63\3\64\3\64\3\65\3\65\7\65\u0143\n\65\f"+
		"\65\16\65\u0146\13\65\3\66\3\66\3\67\3\67\38\38\39\69\u014f\n9\r9\169"+
		"\u0150\39\39\3:\3:\5:\u0157\n:\3:\5:\u015a\n:\3:\3:\3;\3;\3;\3;\7;\u0162"+
		"\n;\f;\16;\u0165\13;\3;\3;\3;\3;\3;\3\u0163\2<\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2k\2m\2o\2q\65s\66u\67\3\2\6\5\2"+
		"C\\aac|\3\2\62;\3\2\63;\4\2\13\13\"\"\2\u016d\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5}\3\2\2\2\7\u0082\3"+
		"\2\2\2\t\u0088\3\2\2\2\13\u008c\3\2\2\2\r\u0095\3\2\2\2\17\u009d\3\2\2"+
		"\2\21\u00a3\3\2\2\2\23\u00aa\3\2\2\2\25\u00b0\3\2\2\2\27\u00b5\3\2\2\2"+
		"\31\u00ba\3\2\2\2\33\u00c3\3\2\2\2\35\u00cb\3\2\2\2\37\u00ce\3\2\2\2!"+
		"\u00d3\3\2\2\2#\u00d7\3\2\2\2%\u00da\3\2\2\2\'\u00de\3\2\2\2)\u00e5\3"+
		"\2\2\2+\u00ec\3\2\2\2-\u00f1\3\2\2\2/\u00f7\3\2\2\2\61\u00f9\3\2\2\2\63"+
		"\u00fb\3\2\2\2\65\u00fd\3\2\2\2\67\u00ff\3\2\2\29\u0101\3\2\2\2;\u0103"+
		"\3\2\2\2=\u0105\3\2\2\2?\u0108\3\2\2\2A\u010a\3\2\2\2C\u010d\3\2\2\2E"+
		"\u010f\3\2\2\2G\u0111\3\2\2\2I\u0113\3\2\2\2K\u0115\3\2\2\2M\u0117\3\2"+
		"\2\2O\u011a\3\2\2\2Q\u011d\3\2\2\2S\u011f\3\2\2\2U\u0121\3\2\2\2W\u0123"+
		"\3\2\2\2Y\u0125\3\2\2\2[\u0127\3\2\2\2]\u0129\3\2\2\2_\u012c\3\2\2\2a"+
		"\u012f\3\2\2\2c\u0138\3\2\2\2e\u013c\3\2\2\2g\u013e\3\2\2\2i\u0140\3\2"+
		"\2\2k\u0147\3\2\2\2m\u0149\3\2\2\2o\u014b\3\2\2\2q\u014e\3\2\2\2s\u0159"+
		"\3\2\2\2u\u015d\3\2\2\2wx\7e\2\2xy\7q\2\2yz\7p\2\2z{\7u\2\2{|\7v\2\2|"+
		"\4\3\2\2\2}~\7v\2\2~\177\7t\2\2\177\u0080\7w\2\2\u0080\u0081\7g\2\2\u0081"+
		"\6\3\2\2\2\u0082\u0083\7h\2\2\u0083\u0084\7c\2\2\u0084\u0085\7n\2\2\u0085"+
		"\u0086\7u\2\2\u0086\u0087\7g\2\2\u0087\b\3\2\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7g\2\2\u008a\u008b\7y\2\2\u008b\n\3\2\2\2\u008c\u008d\7h\2\2\u008d"+
		"\u008e\7w\2\2\u008e\u008f\7p\2\2\u008f\u0090\7e\2\2\u0090\u0091\7v\2\2"+
		"\u0091\u0092\7k\2\2\u0092\u0093\7q\2\2\u0093\u0094\7p\2\2\u0094\f\3\2"+
		"\2\2\u0095\u0096\7d\2\2\u0096\u0097\7q\2\2\u0097\u0098\7q\2\2\u0098\u0099"+
		"\7n\2\2\u0099\u009a\7g\2\2\u009a\u009b\7c\2\2\u009b\u009c\7p\2\2\u009c"+
		"\16\3\2\2\2\u009d\u009e\7w\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0"+
		"\u00a1\7k\2\2\u00a1\u00a2\7n\2\2\u00a2\20\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7c\2\2"+
		"\u00a8\u00a9\7v\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7d\2\2\u00ab\u00ac\7"+
		"t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7m\2\2\u00af\24"+
		"\3\2\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7u\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7j\2\2\u00b7"+
		"\u00b8\7c\2\2\u00b8\u00b9\7t\2\2\u00b9\30\3\2\2\2\u00ba\u00bb\7e\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7k\2\2"+
		"\u00bf\u00c0\7p\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7g\2\2\u00c2\32\3\2"+
		"\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7"+
		"\7c\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7v\2\2\u00ca"+
		"\34\3\2\2\2\u00cb\u00cc\7f\2\2\u00cc\u00cd\7q\2\2\u00cd\36\3\2\2\2\u00ce"+
		"\u00cf\7g\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7g\2\2"+
		"\u00d2 \3\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7t\2"+
		"\2\u00d6\"\3\2\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7h\2\2\u00d9$\3\2\2"+
		"\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7v\2\2\u00dd&\3\2"+
		"\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2"+
		"\7w\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7p\2\2\u00e4(\3\2\2\2\u00e5\u00e6"+
		"\7u\2\2\u00e6\u00e7\7y\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7v\2\2\u00e9"+
		"\u00ea\7e\2\2\u00ea\u00eb\7j\2\2\u00eb*\3\2\2\2\u00ec\u00ed\7x\2\2\u00ed"+
		"\u00ee\7q\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7f\2\2\u00f0,\3\2\2\2\u00f1"+
		"\u00f2\7y\2\2\u00f2\u00f3\7j\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7n\2\2"+
		"\u00f5\u00f6\7g\2\2\u00f6.\3\2\2\2\u00f7\u00f8\7*\2\2\u00f8\60\3\2\2\2"+
		"\u00f9\u00fa\7+\2\2\u00fa\62\3\2\2\2\u00fb\u00fc\7]\2\2\u00fc\64\3\2\2"+
		"\2\u00fd\u00fe\7_\2\2\u00fe\66\3\2\2\2\u00ff\u0100\7}\2\2\u01008\3\2\2"+
		"\2\u0101\u0102\7\177\2\2\u0102:\3\2\2\2\u0103\u0104\7>\2\2\u0104<\3\2"+
		"\2\2\u0105\u0106\7>\2\2\u0106\u0107\7?\2\2\u0107>\3\2\2\2\u0108\u0109"+
		"\7@\2\2\u0109@\3\2\2\2\u010a\u010b\7@\2\2\u010b\u010c\7?\2\2\u010cB\3"+
		"\2\2\2\u010d\u010e\7-\2\2\u010eD\3\2\2\2\u010f\u0110\7/\2\2\u0110F\3\2"+
		"\2\2\u0111\u0112\7,\2\2\u0112H\3\2\2\2\u0113\u0114\7\61\2\2\u0114J\3\2"+
		"\2\2\u0115\u0116\7\'\2\2\u0116L\3\2\2\2\u0117\u0118\7(\2\2\u0118\u0119"+
		"\7(\2\2\u0119N\3\2\2\2\u011a\u011b\7~\2\2\u011b\u011c\7~\2\2\u011cP\3"+
		"\2\2\2\u011d\u011e\7#\2\2\u011eR\3\2\2\2\u011f\u0120\7A\2\2\u0120T\3\2"+
		"\2\2\u0121\u0122\7<\2\2\u0122V\3\2\2\2\u0123\u0124\7=\2\2\u0124X\3\2\2"+
		"\2\u0125\u0126\7.\2\2\u0126Z\3\2\2\2\u0127\u0128\7?\2\2\u0128\\\3\2\2"+
		"\2\u0129\u012a\7?\2\2\u012a\u012b\7?\2\2\u012b^\3\2\2\2\u012c\u012d\7"+
		"#\2\2\u012d\u012e\7?\2\2\u012e`\3\2\2\2\u012f\u0134\5k\66\2\u0130\u0133"+
		"\5k\66\2\u0131\u0133\5m\67\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135b\3\2\2\2"+
		"\u0136\u0134\3\2\2\2\u0137\u0139\5m\67\2\u0138\u0137\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bd\3\2\2\2\u013c"+
		"\u013d\5g\64\2\u013df\3\2\2\2\u013e\u013f\5i\65\2\u013fh\3\2\2\2\u0140"+
		"\u0144\5o8\2\u0141\u0143\5m\67\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2"+
		"\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145j\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0147\u0148\t\2\2\2\u0148l\3\2\2\2\u0149\u014a\t\3\2\2\u014a"+
		"n\3\2\2\2\u014b\u014c\t\4\2\2\u014cp\3\2\2\2\u014d\u014f\t\5\2\2\u014e"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\b9\2\2\u0153r\3\2\2\2\u0154\u0156"+
		"\7\17\2\2\u0155\u0157\7\f\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2"+
		"\u0157\u015a\3\2\2\2\u0158\u015a\7\f\2\2\u0159\u0154\3\2\2\2\u0159\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b:\2\2\u015ct\3\2\2\2\u015d\u015e"+
		"\7\61\2\2\u015e\u015f\7,\2\2\u015f\u0163\3\2\2\2\u0160\u0162\13\2\2\2"+
		"\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0164\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7,\2\2\u0167"+
		"\u0168\7\61\2\2\u0168\u0169\3\2\2\2\u0169\u016a\b;\2\2\u016av\3\2\2\2"+
		"\13\2\u0132\u0134\u013a\u0144\u0150\u0156\u0159\u0163\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}