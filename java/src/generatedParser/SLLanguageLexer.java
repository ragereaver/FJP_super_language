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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Break=6, Case=7, Char=8, Continue=9, 
		Default=10, Do=11, Else=12, For=13, If=14, Int=15, Long=16, Return=17, 
		Short=18, Switch=19, Void=20, While=21, LeftParen=22, RightParen=23, LeftBracket=24, 
		RightBracket=25, LeftBrace=26, RightBrace=27, Less=28, LessEqual=29, Greater=30, 
		GreaterEqual=31, Plus=32, PlusPlus=33, Minus=34, MinusMinus=35, Star=36, 
		Div=37, Mod=38, AndAnd=39, OrOr=40, Not=41, Question=42, Colon=43, Semi=44, 
		Comma=45, Assign=46, DivAssign=47, ModAssign=48, PlusAssign=49, MinusAssign=50, 
		Equal=51, NotEqual=52, Identifier=53, DigitSequence=54, Constant=55, StringLiteral=56, 
		LineAfterPreprocessing=57, LineDirective=58, PragmaDirective=59, Whitespace=60, 
		Newline=61, BlockComment=62, LineComment=63;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "Break", "Case", "Char", "Continue", 
		"Default", "Do", "Else", "For", "If", "Int", "Long", "Return", "Short", 
		"Switch", "Void", "While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
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
		null, "'const'", "'new'", "'function'", "'boolean'", "'until'", "'break'", 
		"'case'", "'char'", "'continue'", "'default'", "'do'", "'else'", "'for'", 
		"'if'", "'int'", "'long'", "'return'", "'short'", "'switch'", "'void'", 
		"'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", 
		"'>='", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&&'", "'||'", 
		"'!'", "'?'", "':'", "';'", "','", "'='", "'/='", "'%='", "'+='", "'-='", 
		"'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "Break", "Case", "Char", "Continue", 
		"Default", "Do", "Else", "For", "If", "Int", "Long", "Return", "Short", 
		"Switch", "Void", "While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u0246\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*"+
		"\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\7"+
		"\66\u016a\n\66\f\66\16\66\u016d\13\66\3\67\6\67\u0170\n\67\r\67\16\67"+
		"\u0171\38\38\58\u0176\n8\39\39\3:\3:\7:\u017c\n:\f:\16:\u017f\13:\3;\3"+
		";\3<\3<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\5>\u019d\n>\3?\6?\u01a0\n?\r?\16?\u01a1\3@\3@\5@\u01a6\n@\3"+
		"A\3A\3A\5A\u01ab\nA\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u01bb"+
		"\nC\3D\3D\3D\3D\6D\u01c1\nD\rD\16D\u01c2\3E\3E\3F\3F\3G\5G\u01ca\nG\3"+
		"G\3G\5G\u01ce\nG\3G\3G\3H\3H\3H\5H\u01d5\nH\3I\6I\u01d8\nI\rI\16I\u01d9"+
		"\3J\3J\3J\3J\3J\3J\3J\5J\u01e3\nJ\3K\3K\3K\3K\3K\3K\3K\7K\u01ec\nK\fK"+
		"\16K\u01ef\13K\3K\7K\u01f2\nK\fK\16K\u01f5\13K\3K\3K\3L\3L\5L\u01fb\n"+
		"L\3L\3L\5L\u01ff\nL\3L\3L\7L\u0203\nL\fL\16L\u0206\13L\3L\3L\3M\3M\5M"+
		"\u020c\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\7M\u0217\nM\fM\16M\u021a\13M\3M\3"+
		"M\3N\6N\u021f\nN\rN\16N\u0220\3N\3N\3O\3O\5O\u0227\nO\3O\5O\u022a\nO\3"+
		"O\3O\3P\3P\3P\3P\7P\u0232\nP\fP\16P\u0235\13P\3P\3P\3P\3P\3P\3Q\3Q\3Q"+
		"\3Q\7Q\u0240\nQ\fQ\16Q\u0243\13Q\3Q\3Q\3\u0233\2R\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q\2s\2u\2w\2y\2{\2}\2"+
		"\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d:\u008f\2"+
		"\u0091\2\u0093\2\u0095;\u0097<\u0099=\u009b>\u009d?\u009f@\u00a1A\3\2"+
		"\r\5\2C\\aac|\3\2\62;\3\2\63;\6\2\f\f\17\17))^^\f\2$$))AA^^cdhhppttvv"+
		"xx\3\2\629\5\2\62;CHch\5\2NNWWww\6\2\f\f\17\17$$^^\4\2\f\f\17\17\4\2\13"+
		"\13\"\"\2\u0256\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2\u008d\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3"+
		"\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2"+
		"\2\u00a1\3\2\2\2\3\u00a3\3\2\2\2\5\u00a9\3\2\2\2\7\u00ad\3\2\2\2\t\u00b6"+
		"\3\2\2\2\13\u00be\3\2\2\2\r\u00c4\3\2\2\2\17\u00ca\3\2\2\2\21\u00cf\3"+
		"\2\2\2\23\u00d4\3\2\2\2\25\u00dd\3\2\2\2\27\u00e5\3\2\2\2\31\u00e8\3\2"+
		"\2\2\33\u00ed\3\2\2\2\35\u00f1\3\2\2\2\37\u00f4\3\2\2\2!\u00f8\3\2\2\2"+
		"#\u00fd\3\2\2\2%\u0104\3\2\2\2\'\u010a\3\2\2\2)\u0111\3\2\2\2+\u0116\3"+
		"\2\2\2-\u011c\3\2\2\2/\u011e\3\2\2\2\61\u0120\3\2\2\2\63\u0122\3\2\2\2"+
		"\65\u0124\3\2\2\2\67\u0126\3\2\2\29\u0128\3\2\2\2;\u012a\3\2\2\2=\u012d"+
		"\3\2\2\2?\u012f\3\2\2\2A\u0132\3\2\2\2C\u0134\3\2\2\2E\u0137\3\2\2\2G"+
		"\u0139\3\2\2\2I\u013c\3\2\2\2K\u013e\3\2\2\2M\u0140\3\2\2\2O\u0142\3\2"+
		"\2\2Q\u0145\3\2\2\2S\u0148\3\2\2\2U\u014a\3\2\2\2W\u014c\3\2\2\2Y\u014e"+
		"\3\2\2\2[\u0150\3\2\2\2]\u0152\3\2\2\2_\u0154\3\2\2\2a\u0157\3\2\2\2c"+
		"\u015a\3\2\2\2e\u015d\3\2\2\2g\u0160\3\2\2\2i\u0163\3\2\2\2k\u0166\3\2"+
		"\2\2m\u016f\3\2\2\2o\u0175\3\2\2\2q\u0177\3\2\2\2s\u0179\3\2\2\2u\u0180"+
		"\3\2\2\2w\u0182\3\2\2\2y\u0184\3\2\2\2{\u019c\3\2\2\2}\u019f\3\2\2\2\177"+
		"\u01a5\3\2\2\2\u0081\u01aa\3\2\2\2\u0083\u01ac\3\2\2\2\u0085\u01ba\3\2"+
		"\2\2\u0087\u01bc\3\2\2\2\u0089\u01c4\3\2\2\2\u008b\u01c6\3\2\2\2\u008d"+
		"\u01c9\3\2\2\2\u008f\u01d4\3\2\2\2\u0091\u01d7\3\2\2\2\u0093\u01e2\3\2"+
		"\2\2\u0095\u01e4\3\2\2\2\u0097\u01f8\3\2\2\2\u0099\u0209\3\2\2\2\u009b"+
		"\u021e\3\2\2\2\u009d\u0229\3\2\2\2\u009f\u022d\3\2\2\2\u00a1\u023b\3\2"+
		"\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7"+
		"\7u\2\2\u00a7\u00a8\7v\2\2\u00a8\4\3\2\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab\u00ac\7y\2\2\u00ac\6\3\2\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af"+
		"\7w\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\u00b3\7k\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7p\2\2\u00b5\b\3\2\2\2\u00b6"+
		"\u00b7\7d\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7n\2\2"+
		"\u00ba\u00bb\7g\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7p\2\2\u00bd\n\3\2"+
		"\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2"+
		"\7k\2\2\u00c2\u00c3\7n\2\2\u00c3\f\3\2\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6"+
		"\7t\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7m\2\2\u00c9"+
		"\16\3\2\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7u\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\20\3\2\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7j\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3\22\3\2\2\2\u00d4\u00d5\7e\2\2\u00d5"+
		"\u00d6\7q\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7k\2\2"+
		"\u00d9\u00da\7p\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7g\2\2\u00dc\24\3\2"+
		"\2\2\u00dd\u00de\7f\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1"+
		"\7c\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7v\2\2\u00e4"+
		"\26\3\2\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7q\2\2\u00e7\30\3\2\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7g\2\2"+
		"\u00ec\32\3\2\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7"+
		"t\2\2\u00f0\34\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7h\2\2\u00f3\36"+
		"\3\2\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7v\2\2\u00f7"+
		" \3\2\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7p\2\2\u00fb"+
		"\u00fc\7i\2\2\u00fc\"\3\2\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\7v\2\2\u0100\u0101\7w\2\2\u0101\u0102\7t\2\2\u0102\u0103\7p\2\2"+
		"\u0103$\3\2\2\2\u0104\u0105\7u\2\2\u0105\u0106\7j\2\2\u0106\u0107\7q\2"+
		"\2\u0107\u0108\7t\2\2\u0108\u0109\7v\2\2\u0109&\3\2\2\2\u010a\u010b\7"+
		"u\2\2\u010b\u010c\7y\2\2\u010c\u010d\7k\2\2\u010d\u010e\7v\2\2\u010e\u010f"+
		"\7e\2\2\u010f\u0110\7j\2\2\u0110(\3\2\2\2\u0111\u0112\7x\2\2\u0112\u0113"+
		"\7q\2\2\u0113\u0114\7k\2\2\u0114\u0115\7f\2\2\u0115*\3\2\2\2\u0116\u0117"+
		"\7y\2\2\u0117\u0118\7j\2\2\u0118\u0119\7k\2\2\u0119\u011a\7n\2\2\u011a"+
		"\u011b\7g\2\2\u011b,\3\2\2\2\u011c\u011d\7*\2\2\u011d.\3\2\2\2\u011e\u011f"+
		"\7+\2\2\u011f\60\3\2\2\2\u0120\u0121\7]\2\2\u0121\62\3\2\2\2\u0122\u0123"+
		"\7_\2\2\u0123\64\3\2\2\2\u0124\u0125\7}\2\2\u0125\66\3\2\2\2\u0126\u0127"+
		"\7\177\2\2\u01278\3\2\2\2\u0128\u0129\7>\2\2\u0129:\3\2\2\2\u012a\u012b"+
		"\7>\2\2\u012b\u012c\7?\2\2\u012c<\3\2\2\2\u012d\u012e\7@\2\2\u012e>\3"+
		"\2\2\2\u012f\u0130\7@\2\2\u0130\u0131\7?\2\2\u0131@\3\2\2\2\u0132\u0133"+
		"\7-\2\2\u0133B\3\2\2\2\u0134\u0135\7-\2\2\u0135\u0136\7-\2\2\u0136D\3"+
		"\2\2\2\u0137\u0138\7/\2\2\u0138F\3\2\2\2\u0139\u013a\7/\2\2\u013a\u013b"+
		"\7/\2\2\u013bH\3\2\2\2\u013c\u013d\7,\2\2\u013dJ\3\2\2\2\u013e\u013f\7"+
		"\61\2\2\u013fL\3\2\2\2\u0140\u0141\7\'\2\2\u0141N\3\2\2\2\u0142\u0143"+
		"\7(\2\2\u0143\u0144\7(\2\2\u0144P\3\2\2\2\u0145\u0146\7~\2\2\u0146\u0147"+
		"\7~\2\2\u0147R\3\2\2\2\u0148\u0149\7#\2\2\u0149T\3\2\2\2\u014a\u014b\7"+
		"A\2\2\u014bV\3\2\2\2\u014c\u014d\7<\2\2\u014dX\3\2\2\2\u014e\u014f\7="+
		"\2\2\u014fZ\3\2\2\2\u0150\u0151\7.\2\2\u0151\\\3\2\2\2\u0152\u0153\7?"+
		"\2\2\u0153^\3\2\2\2\u0154\u0155\7\61\2\2\u0155\u0156\7?\2\2\u0156`\3\2"+
		"\2\2\u0157\u0158\7\'\2\2\u0158\u0159\7?\2\2\u0159b\3\2\2\2\u015a\u015b"+
		"\7-\2\2\u015b\u015c\7?\2\2\u015cd\3\2\2\2\u015d\u015e\7/\2\2\u015e\u015f"+
		"\7?\2\2\u015ff\3\2\2\2\u0160\u0161\7?\2\2\u0161\u0162\7?\2\2\u0162h\3"+
		"\2\2\2\u0163\u0164\7#\2\2\u0164\u0165\7?\2\2\u0165j\3\2\2\2\u0166\u016b"+
		"\5u;\2\u0167\u016a\5u;\2\u0168\u016a\5w<\2\u0169\u0167\3\2\2\2\u0169\u0168"+
		"\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"l\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\5w<\2\u016f\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172n\3\2\2\2"+
		"\u0173\u0176\5q9\2\u0174\u0176\5{>\2\u0175\u0173\3\2\2\2\u0175\u0174\3"+
		"\2\2\2\u0176p\3\2\2\2\u0177\u0178\5s:\2\u0178r\3\2\2\2\u0179\u017d\5y"+
		"=\2\u017a\u017c\5w<\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017et\3\2\2\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0181\t\2\2\2\u0181v\3\2\2\2\u0182\u0183\t\3\2\2\u0183x\3\2\2\2\u0184"+
		"\u0185\t\4\2\2\u0185z\3\2\2\2\u0186\u0187\7)\2\2\u0187\u0188\5}?\2\u0188"+
		"\u0189\7)\2\2\u0189\u019d\3\2\2\2\u018a\u018b\7N\2\2\u018b\u018c\7)\2"+
		"\2\u018c\u018d\3\2\2\2\u018d\u018e\5}?\2\u018e\u018f\7)\2\2\u018f\u019d"+
		"\3\2\2\2\u0190\u0191\7w\2\2\u0191\u0192\7)\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\5}?\2\u0194\u0195\7)\2\2\u0195\u019d\3\2\2\2\u0196\u0197\7W\2\2"+
		"\u0197\u0198\7)\2\2\u0198\u0199\3\2\2\2\u0199\u019a\5}?\2\u019a\u019b"+
		"\7)\2\2\u019b\u019d\3\2\2\2\u019c\u0186\3\2\2\2\u019c\u018a\3\2\2\2\u019c"+
		"\u0190\3\2\2\2\u019c\u0196\3\2\2\2\u019d|\3\2\2\2\u019e\u01a0\5\177@\2"+
		"\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2~\3\2\2\2\u01a3\u01a6\n\5\2\2\u01a4\u01a6\5\u0081A\2\u01a5"+
		"\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u0080\3\2\2\2\u01a7\u01ab\5\u0083"+
		"B\2\u01a8\u01ab\5\u0085C\2\u01a9\u01ab\5\u0087D\2\u01aa\u01a7\3\2\2\2"+
		"\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u0082\3\2\2\2\u01ac\u01ad"+
		"\7^\2\2\u01ad\u01ae\t\6\2\2\u01ae\u0084\3\2\2\2\u01af\u01b0\7^\2\2\u01b0"+
		"\u01bb\5\u0089E\2\u01b1\u01b2\7^\2\2\u01b2\u01b3\5\u0089E\2\u01b3\u01b4"+
		"\5\u0089E\2\u01b4\u01bb\3\2\2\2\u01b5\u01b6\7^\2\2\u01b6\u01b7\5\u0089"+
		"E\2\u01b7\u01b8\5\u0089E\2\u01b8\u01b9\5\u0089E\2\u01b9\u01bb\3\2\2\2"+
		"\u01ba\u01af\3\2\2\2\u01ba\u01b1\3\2\2\2\u01ba\u01b5\3\2\2\2\u01bb\u0086"+
		"\3\2\2\2\u01bc\u01bd\7^\2\2\u01bd\u01be\7z\2\2\u01be\u01c0\3\2\2\2\u01bf"+
		"\u01c1\5\u008bF\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c0"+
		"\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u0088\3\2\2\2\u01c4\u01c5\t\7\2\2\u01c5"+
		"\u008a\3\2\2\2\u01c6\u01c7\t\b\2\2\u01c7\u008c\3\2\2\2\u01c8\u01ca\5\u008f"+
		"H\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01cd\7$\2\2\u01cc\u01ce\5\u0091I\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3"+
		"\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\7$\2\2\u01d0\u008e\3\2\2\2\u01d1"+
		"\u01d2\7w\2\2\u01d2\u01d5\7:\2\2\u01d3\u01d5\t\t\2\2\u01d4\u01d1\3\2\2"+
		"\2\u01d4\u01d3\3\2\2\2\u01d5\u0090\3\2\2\2\u01d6\u01d8\5\u0093J\2\u01d7"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u0092\3\2\2\2\u01db\u01e3\n\n\2\2\u01dc\u01e3\5\u0081A\2\u01dd"+
		"\u01de\7^\2\2\u01de\u01e3\7\f\2\2\u01df\u01e0\7^\2\2\u01e0\u01e1\7\17"+
		"\2\2\u01e1\u01e3\7\f\2\2\u01e2\u01db\3\2\2\2\u01e2\u01dc\3\2\2\2\u01e2"+
		"\u01dd\3\2\2\2\u01e2\u01df\3\2\2\2\u01e3\u0094\3\2\2\2\u01e4\u01e5\7%"+
		"\2\2\u01e5\u01e6\7n\2\2\u01e6\u01e7\7k\2\2\u01e7\u01e8\7p\2\2\u01e8\u01e9"+
		"\7g\2\2\u01e9\u01ed\3\2\2\2\u01ea\u01ec\5\u009bN\2\u01eb\u01ea\3\2\2\2"+
		"\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f3"+
		"\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f2\n\13\2\2\u01f1\u01f0\3\2\2\2"+
		"\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6"+
		"\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\bK\2\2\u01f7\u0096\3\2\2\2\u01f8"+
		"\u01fa\7%\2\2\u01f9\u01fb\5\u009bN\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3"+
		"\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\5s:\2\u01fd\u01ff\5\u009bN\2\u01fe"+
		"\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0204\5\u008d"+
		"G\2\u0201\u0203\n\13\2\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0207\u0208\bL\2\2\u0208\u0098\3\2\2\2\u0209\u020b\7%\2\2\u020a\u020c"+
		"\5\u009bN\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2"+
		"\2\u020d\u020e\7r\2\2\u020e\u020f\7t\2\2\u020f\u0210\7c\2\2\u0210\u0211"+
		"\7i\2\2\u0211\u0212\7o\2\2\u0212\u0213\7c\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0218\5\u009bN\2\u0215\u0217\n\13\2\2\u0216\u0215\3\2\2\2\u0217\u021a"+
		"\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021b\u021c\bM\2\2\u021c\u009a\3\2\2\2\u021d\u021f\t\f"+
		"\2\2\u021e\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u021e\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\bN\2\2\u0223\u009c\3\2"+
		"\2\2\u0224\u0226\7\17\2\2\u0225\u0227\7\f\2\2\u0226\u0225\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u022a\7\f\2\2\u0229\u0224\3\2"+
		"\2\2\u0229\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\bO\2\2\u022c"+
		"\u009e\3\2\2\2\u022d\u022e\7\61\2\2\u022e\u022f\7,\2\2\u022f\u0233\3\2"+
		"\2\2\u0230\u0232\13\2\2\2\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0233\3\2"+
		"\2\2\u0236\u0237\7,\2\2\u0237\u0238\7\61\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u023a\bP\2\2\u023a\u00a0\3\2\2\2\u023b\u023c\7\61\2\2\u023c\u023d\7\61"+
		"\2\2\u023d\u0241\3\2\2\2\u023e\u0240\n\13\2\2\u023f\u023e\3\2\2\2\u0240"+
		"\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2"+
		"\2\2\u0243\u0241\3\2\2\2\u0244\u0245\bQ\2\2\u0245\u00a2\3\2\2\2\37\2\u0169"+
		"\u016b\u0171\u0175\u017d\u019c\u01a1\u01a5\u01aa\u01ba\u01c2\u01c9\u01cd"+
		"\u01d4\u01d9\u01e2\u01ed\u01f3\u01fa\u01fe\u0204\u020b\u0218\u0220\u0226"+
		"\u0229\u0233\u0241\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}