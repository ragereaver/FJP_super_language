// Generated from D:/projekty/FJP_super_language\SLLanguage.g4 by ANTLR 4.7
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
		"Nondigit", "Digit", "NonzeroDigit", "CharacterConstant", "CCharSequence", 
		"CChar", "EscapeSequence", "SimpleEscapeSequence", "OctalEscapeSequence", 
		"HexadecimalEscapeSequence", "OctalDigit", "HexadecimalDigit", "EncodingPrefix", 
		"SCharSequence", "SChar", "Whitespace", "Newline", "BlockComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01da\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\7\61\u014b\n\61\f\61\16\61\u014e\13\61\3\62\6"+
		"\62\u0151\n\62\r\62\16\62\u0152\3\63\3\63\5\63\u0157\n\63\3\64\3\64\3"+
		"\65\3\65\7\65\u015d\n\65\f\65\16\65\u0160\13\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\59\u017e\n9\3:\6:\u0181\n:\r:\16:\u0182\3;\3;\5;\u0187\n;\3<\3<\3<\5"+
		"<\u018c\n<\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u019c\n>\3?\3"+
		"?\3?\3?\6?\u01a2\n?\r?\16?\u01a3\3@\3@\3A\3A\3B\3B\3B\5B\u01ad\nB\3C\6"+
		"C\u01b0\nC\rC\16C\u01b1\3D\3D\3D\3D\3D\3D\3D\5D\u01bb\nD\3E\6E\u01be\n"+
		"E\rE\16E\u01bf\3E\3E\3F\3F\5F\u01c6\nF\3F\5F\u01c9\nF\3F\3F\3G\3G\3G\3"+
		"G\7G\u01d1\nG\fG\16G\u01d4\13G\3G\3G\3G\3G\3G\3\u01d2\2H\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2k\2m\2o\2q\2s\2u\2w\2"+
		"y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\65\u008b\66\u008d"+
		"\67\3\2\f\5\2C\\aac|\3\2\62;\3\2\63;\6\2\f\f\17\17))^^\f\2$$))AA^^cdh"+
		"hppttvvxx\3\2\629\5\2\62;CHch\5\2NNWWww\6\2\f\f\17\17$$^^\4\2\13\13\""+
		"\"\2\u01e0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0095\3\2\2\2\7\u009a\3\2\2\2\t\u00a0"+
		"\3\2\2\2\13\u00a4\3\2\2\2\r\u00ad\3\2\2\2\17\u00b5\3\2\2\2\21\u00bb\3"+
		"\2\2\2\23\u00c2\3\2\2\2\25\u00c8\3\2\2\2\27\u00cd\3\2\2\2\31\u00d2\3\2"+
		"\2\2\33\u00db\3\2\2\2\35\u00e3\3\2\2\2\37\u00e6\3\2\2\2!\u00eb\3\2\2\2"+
		"#\u00ef\3\2\2\2%\u00f2\3\2\2\2\'\u00f6\3\2\2\2)\u00fd\3\2\2\2+\u0104\3"+
		"\2\2\2-\u0109\3\2\2\2/\u010f\3\2\2\2\61\u0111\3\2\2\2\63\u0113\3\2\2\2"+
		"\65\u0115\3\2\2\2\67\u0117\3\2\2\29\u0119\3\2\2\2;\u011b\3\2\2\2=\u011d"+
		"\3\2\2\2?\u0120\3\2\2\2A\u0122\3\2\2\2C\u0125\3\2\2\2E\u0127\3\2\2\2G"+
		"\u0129\3\2\2\2I\u012b\3\2\2\2K\u012d\3\2\2\2M\u012f\3\2\2\2O\u0132\3\2"+
		"\2\2Q\u0135\3\2\2\2S\u0137\3\2\2\2U\u0139\3\2\2\2W\u013b\3\2\2\2Y\u013d"+
		"\3\2\2\2[\u013f\3\2\2\2]\u0141\3\2\2\2_\u0144\3\2\2\2a\u0147\3\2\2\2c"+
		"\u0150\3\2\2\2e\u0156\3\2\2\2g\u0158\3\2\2\2i\u015a\3\2\2\2k\u0161\3\2"+
		"\2\2m\u0163\3\2\2\2o\u0165\3\2\2\2q\u017d\3\2\2\2s\u0180\3\2\2\2u\u0186"+
		"\3\2\2\2w\u018b\3\2\2\2y\u018d\3\2\2\2{\u019b\3\2\2\2}\u019d\3\2\2\2\177"+
		"\u01a5\3\2\2\2\u0081\u01a7\3\2\2\2\u0083\u01ac\3\2\2\2\u0085\u01af\3\2"+
		"\2\2\u0087\u01ba\3\2\2\2\u0089\u01bd\3\2\2\2\u008b\u01c8\3\2\2\2\u008d"+
		"\u01cc\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7q\2\2\u0091\u0092\7p\2"+
		"\2\u0092\u0093\7u\2\2\u0093\u0094\7v\2\2\u0094\4\3\2\2\2\u0095\u0096\7"+
		"v\2\2\u0096\u0097\7t\2\2\u0097\u0098\7w\2\2\u0098\u0099\7g\2\2\u0099\6"+
		"\3\2\2\2\u009a\u009b\7h\2\2\u009b\u009c\7c\2\2\u009c\u009d\7n\2\2\u009d"+
		"\u009e\7u\2\2\u009e\u009f\7g\2\2\u009f\b\3\2\2\2\u00a0\u00a1\7p\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7y\2\2\u00a3\n\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5"+
		"\u00a6\7w\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7v\2\2"+
		"\u00a9\u00aa\7k\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7p\2\2\u00ac\f\3\2"+
		"\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1"+
		"\7n\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7p\2\2\u00b4"+
		"\16\3\2\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7v\2\2\u00b8"+
		"\u00b9\7k\2\2\u00b9\u00ba\7n\2\2\u00ba\20\3\2\2\2\u00bb\u00bc\7t\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7c\2\2"+
		"\u00c0\u00c1\7v\2\2\u00c1\22\3\2\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4\7"+
		"t\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7m\2\2\u00c7\24"+
		"\3\2\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7u\2\2\u00cb"+
		"\u00cc\7g\2\2\u00cc\26\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7j\2\2\u00cf"+
		"\u00d0\7c\2\2\u00d0\u00d1\7t\2\2\u00d1\30\3\2\2\2\u00d2\u00d3\7e\2\2\u00d3"+
		"\u00d4\7q\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7k\2\2"+
		"\u00d7\u00d8\7p\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7g\2\2\u00da\32\3\2"+
		"\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7h\2\2\u00de\u00df"+
		"\7c\2\2\u00df\u00e0\7w\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7v\2\2\u00e2"+
		"\34\3\2\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5\7q\2\2\u00e5\36\3\2\2\2\u00e6"+
		"\u00e7\7g\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7g\2\2"+
		"\u00ea \3\2\2\2\u00eb\u00ec\7h\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7t\2"+
		"\2\u00ee\"\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7h\2\2\u00f1$\3\2\2"+
		"\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2\u00f5&\3\2"+
		"\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa"+
		"\7w\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7p\2\2\u00fc(\3\2\2\2\u00fd\u00fe"+
		"\7u\2\2\u00fe\u00ff\7y\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7v\2\2\u0101"+
		"\u0102\7e\2\2\u0102\u0103\7j\2\2\u0103*\3\2\2\2\u0104\u0105\7x\2\2\u0105"+
		"\u0106\7q\2\2\u0106\u0107\7k\2\2\u0107\u0108\7f\2\2\u0108,\3\2\2\2\u0109"+
		"\u010a\7y\2\2\u010a\u010b\7j\2\2\u010b\u010c\7k\2\2\u010c\u010d\7n\2\2"+
		"\u010d\u010e\7g\2\2\u010e.\3\2\2\2\u010f\u0110\7*\2\2\u0110\60\3\2\2\2"+
		"\u0111\u0112\7+\2\2\u0112\62\3\2\2\2\u0113\u0114\7]\2\2\u0114\64\3\2\2"+
		"\2\u0115\u0116\7_\2\2\u0116\66\3\2\2\2\u0117\u0118\7}\2\2\u01188\3\2\2"+
		"\2\u0119\u011a\7\177\2\2\u011a:\3\2\2\2\u011b\u011c\7>\2\2\u011c<\3\2"+
		"\2\2\u011d\u011e\7>\2\2\u011e\u011f\7?\2\2\u011f>\3\2\2\2\u0120\u0121"+
		"\7@\2\2\u0121@\3\2\2\2\u0122\u0123\7@\2\2\u0123\u0124\7?\2\2\u0124B\3"+
		"\2\2\2\u0125\u0126\7-\2\2\u0126D\3\2\2\2\u0127\u0128\7/\2\2\u0128F\3\2"+
		"\2\2\u0129\u012a\7,\2\2\u012aH\3\2\2\2\u012b\u012c\7\61\2\2\u012cJ\3\2"+
		"\2\2\u012d\u012e\7\'\2\2\u012eL\3\2\2\2\u012f\u0130\7(\2\2\u0130\u0131"+
		"\7(\2\2\u0131N\3\2\2\2\u0132\u0133\7~\2\2\u0133\u0134\7~\2\2\u0134P\3"+
		"\2\2\2\u0135\u0136\7#\2\2\u0136R\3\2\2\2\u0137\u0138\7A\2\2\u0138T\3\2"+
		"\2\2\u0139\u013a\7<\2\2\u013aV\3\2\2\2\u013b\u013c\7=\2\2\u013cX\3\2\2"+
		"\2\u013d\u013e\7.\2\2\u013eZ\3\2\2\2\u013f\u0140\7?\2\2\u0140\\\3\2\2"+
		"\2\u0141\u0142\7?\2\2\u0142\u0143\7?\2\2\u0143^\3\2\2\2\u0144\u0145\7"+
		"#\2\2\u0145\u0146\7?\2\2\u0146`\3\2\2\2\u0147\u014c\5k\66\2\u0148\u014b"+
		"\5k\66\2\u0149\u014b\5m\67\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014db\3\2\2\2"+
		"\u014e\u014c\3\2\2\2\u014f\u0151\5m\67\2\u0150\u014f\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153d\3\2\2\2\u0154"+
		"\u0157\5g\64\2\u0155\u0157\5q9\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2"+
		"\2\u0157f\3\2\2\2\u0158\u0159\5i\65\2\u0159h\3\2\2\2\u015a\u015e\5o8\2"+
		"\u015b\u015d\5m\67\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015fj\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0162\t\2\2\2\u0162l\3\2\2\2\u0163\u0164\t\3\2\2\u0164n\3\2\2\2\u0165"+
		"\u0166\t\4\2\2\u0166p\3\2\2\2\u0167\u0168\7)\2\2\u0168\u0169\5s:\2\u0169"+
		"\u016a\7)\2\2\u016a\u017e\3\2\2\2\u016b\u016c\7N\2\2\u016c\u016d\7)\2"+
		"\2\u016d\u016e\3\2\2\2\u016e\u016f\5s:\2\u016f\u0170\7)\2\2\u0170\u017e"+
		"\3\2\2\2\u0171\u0172\7w\2\2\u0172\u0173\7)\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\5s:\2\u0175\u0176\7)\2\2\u0176\u017e\3\2\2\2\u0177\u0178\7W\2\2"+
		"\u0178\u0179\7)\2\2\u0179\u017a\3\2\2\2\u017a\u017b\5s:\2\u017b\u017c"+
		"\7)\2\2\u017c\u017e\3\2\2\2\u017d\u0167\3\2\2\2\u017d\u016b\3\2\2\2\u017d"+
		"\u0171\3\2\2\2\u017d\u0177\3\2\2\2\u017er\3\2\2\2\u017f\u0181\5u;\2\u0180"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183t\3\2\2\2\u0184\u0187\n\5\2\2\u0185\u0187\5w<\2\u0186\u0184"+
		"\3\2\2\2\u0186\u0185\3\2\2\2\u0187v\3\2\2\2\u0188\u018c\5y=\2\u0189\u018c"+
		"\5{>\2\u018a\u018c\5}?\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018a\3\2\2\2\u018cx\3\2\2\2\u018d\u018e\7^\2\2\u018e\u018f\t\6\2\2\u018f"+
		"z\3\2\2\2\u0190\u0191\7^\2\2\u0191\u019c\5\177@\2\u0192\u0193\7^\2\2\u0193"+
		"\u0194\5\177@\2\u0194\u0195\5\177@\2\u0195\u019c\3\2\2\2\u0196\u0197\7"+
		"^\2\2\u0197\u0198\5\177@\2\u0198\u0199\5\177@\2\u0199\u019a\5\177@\2\u019a"+
		"\u019c\3\2\2\2\u019b\u0190\3\2\2\2\u019b\u0192\3\2\2\2\u019b\u0196\3\2"+
		"\2\2\u019c|\3\2\2\2\u019d\u019e\7^\2\2\u019e\u019f\7z\2\2\u019f\u01a1"+
		"\3\2\2\2\u01a0\u01a2\5\u0081A\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2"+
		"\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4~\3\2\2\2\u01a5\u01a6"+
		"\t\7\2\2\u01a6\u0080\3\2\2\2\u01a7\u01a8\t\b\2\2\u01a8\u0082\3\2\2\2\u01a9"+
		"\u01aa\7w\2\2\u01aa\u01ad\7:\2\2\u01ab\u01ad\t\t\2\2\u01ac\u01a9\3\2\2"+
		"\2\u01ac\u01ab\3\2\2\2\u01ad\u0084\3\2\2\2\u01ae\u01b0\5\u0087D\2\u01af"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u0086\3\2\2\2\u01b3\u01bb\n\n\2\2\u01b4\u01bb\5w<\2\u01b5\u01b6"+
		"\7^\2\2\u01b6\u01bb\7\f\2\2\u01b7\u01b8\7^\2\2\u01b8\u01b9\7\17\2\2\u01b9"+
		"\u01bb\7\f\2\2\u01ba\u01b3\3\2\2\2\u01ba\u01b4\3\2\2\2\u01ba\u01b5\3\2"+
		"\2\2\u01ba\u01b7\3\2\2\2\u01bb\u0088\3\2\2\2\u01bc\u01be\t\13\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\bE\2\2\u01c2\u008a\3\2\2\2\u01c3"+
		"\u01c5\7\17\2\2\u01c4\u01c6\7\f\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3"+
		"\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c9\7\f\2\2\u01c8\u01c3\3\2\2\2\u01c8"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\bF\2\2\u01cb\u008c\3\2"+
		"\2\2\u01cc\u01cd\7\61\2\2\u01cd\u01ce\7,\2\2\u01ce\u01d2\3\2\2\2\u01cf"+
		"\u01d1\13\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d3\3"+
		"\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5"+
		"\u01d6\7,\2\2\u01d6\u01d7\7\61\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\bG"+
		"\2\2\u01d9\u008e\3\2\2\2\25\2\u014a\u014c\u0152\u0156\u015e\u017d\u0182"+
		"\u0186\u018b\u019b\u01a3\u01ac\u01b1\u01ba\u01bf\u01c5\u01c8\u01d2\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}