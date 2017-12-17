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
public class superLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, 
		LBRACK=39, RBRACK=40, SEMI=41, COMMA=42, ASSIGN=43, GT=44, LT=45, BANG=46, 
		COLON=47, EQUAL=48, LE=49, GE=50, NOTEQUAL=51, AND=52, OR=53, INC=54, 
		DEC=55, ADD=56, SUB=57, MUL=58, DIV=59, BITAND=60, BITOR=61, CARET=62, 
		MOD=63, Identifier=64, StringLiteral=65, CharacterLiteral=66, BooleanLiteral=67, 
		IntegerLiteral=68, NullLiteral=69;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "ASSIGN", "GT", "LT", "BANG", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
		"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
		"CARET", "MOD", "Identifier", "JavaLetter", "JavaLetterOrDigit", "StringLiteral", 
		"StringCharacters", "StringCharacter", "EscapeSequence", "ZeroToThree", 
		"UnicodeEscape", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
		"HexDigitOrUnderscore", "CharacterLiteral", "SingleCharacter", "BooleanLiteral", 
		"IntegerLiteral", "DecimalIntegerLiteral", "DecimalNumeral", "Digits", 
		"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
		"Underscores", "IntegerTypeSuffix", "NullLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'*='", 
		"'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", 
		"'|='", "'if'", "'else'", "'switch'", "'case'", "'default'", "'while'", 
		"'do'", "'for'", "'break'", "'continue'", "'return'", "'.'", "'class'", 
		"'this'", "'super'", "'new'", "'?'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", "'='", "'>'", "'<'", "'!'", "':'", "'=='", "'<='", 
		"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", 
		"'&'", "'|'", "'^'", "'%'", null, null, null, null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "ASSIGN", 
		"GT", "LT", "BANG", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", 
		"INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "Identifier", "StringLiteral", "CharacterLiteral", "BooleanLiteral", 
		"IntegerLiteral", "NullLiteral"
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


	public superLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "superLanguage.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u0226\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%"+
		"\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:\3;\3;\3"+
		"<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\7A\u019c\nA\fA\16A\u019f\13A\3B\3B"+
		"\3C\3C\3D\3D\5D\u01a7\nD\3D\3D\3E\6E\u01ac\nE\rE\16E\u01ad\3F\3F\5F\u01b2"+
		"\nF\3G\3G\3G\5G\u01b7\nG\3H\3H\3I\3I\6I\u01bd\nI\rI\16I\u01be\3I\3I\3"+
		"I\3I\3I\3J\3J\3J\3J\3K\3K\5K\u01cc\nK\3K\5K\u01cf\nK\3L\3L\3M\6M\u01d4"+
		"\nM\rM\16M\u01d5\3N\3N\5N\u01da\nN\3O\3O\3O\3O\3O\3O\3O\3O\5O\u01e4\n"+
		"O\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u01f1\nQ\3R\3R\3S\3S\5S\u01f7\n"+
		"S\3T\3T\3T\5T\u01fc\nT\3T\3T\3T\5T\u0201\nT\5T\u0203\nT\3U\3U\5U\u0207"+
		"\nU\3U\5U\u020a\nU\3V\3V\5V\u020e\nV\3W\3W\3X\6X\u0213\nX\rX\16X\u0214"+
		"\3Y\3Y\5Y\u0219\nY\3Z\6Z\u021c\nZ\rZ\16Z\u021d\3[\3[\3\\\3\\\3\\\3\\\3"+
		"\\\2\2]\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083\2\u0085\2\u0087C\u0089\2\u008b"+
		"\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d"+
		"D\u009f\2\u00a1E\u00a3F\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af"+
		"\2\u00b1\2\u00b3\2\u00b5\2\u00b7G\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\6\2"+
		"\f\f\17\17$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\4\2ZZzz\5\2\62;CHch\6\2\f"+
		"\f\17\17))^^\3\2\63;\4\2NNnn\2\u0225\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0087\3\2\2\2\2\u009d\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00b7\3\2\2\2\3\u00b9\3\2\2\2\5\u00c1\3\2\2\2\7\u00c6\3\2\2"+
		"\2\t\u00cc\3\2\2\2\13\u00d0\3\2\2\2\r\u00d5\3\2\2\2\17\u00da\3\2\2\2\21"+
		"\u00dd\3\2\2\2\23\u00e0\3\2\2\2\25\u00e3\3\2\2\2\27\u00e6\3\2\2\2\31\u00e9"+
		"\3\2\2\2\33\u00ed\3\2\2\2\35\u00f1\3\2\2\2\37\u00f6\3\2\2\2!\u00f9\3\2"+
		"\2\2#\u00fc\3\2\2\2%\u00ff\3\2\2\2\'\u0102\3\2\2\2)\u0107\3\2\2\2+\u010e"+
		"\3\2\2\2-\u0113\3\2\2\2/\u011b\3\2\2\2\61\u0121\3\2\2\2\63\u0124\3\2\2"+
		"\2\65\u0128\3\2\2\2\67\u012e\3\2\2\29\u0137\3\2\2\2;\u013e\3\2\2\2=\u0140"+
		"\3\2\2\2?\u0146\3\2\2\2A\u014b\3\2\2\2C\u0151\3\2\2\2E\u0155\3\2\2\2G"+
		"\u0157\3\2\2\2I\u0159\3\2\2\2K\u015b\3\2\2\2M\u015d\3\2\2\2O\u015f\3\2"+
		"\2\2Q\u0161\3\2\2\2S\u0163\3\2\2\2U\u0165\3\2\2\2W\u0167\3\2\2\2Y\u0169"+
		"\3\2\2\2[\u016b\3\2\2\2]\u016d\3\2\2\2_\u016f\3\2\2\2a\u0171\3\2\2\2c"+
		"\u0174\3\2\2\2e\u0177\3\2\2\2g\u017a\3\2\2\2i\u017d\3\2\2\2k\u0180\3\2"+
		"\2\2m\u0183\3\2\2\2o\u0186\3\2\2\2q\u0189\3\2\2\2s\u018b\3\2\2\2u\u018d"+
		"\3\2\2\2w\u018f\3\2\2\2y\u0191\3\2\2\2{\u0193\3\2\2\2}\u0195\3\2\2\2\177"+
		"\u0197\3\2\2\2\u0081\u0199\3\2\2\2\u0083\u01a0\3\2\2\2\u0085\u01a2\3\2"+
		"\2\2\u0087\u01a4\3\2\2\2\u0089\u01ab\3\2\2\2\u008b\u01b1\3\2\2\2\u008d"+
		"\u01b6\3\2\2\2\u008f\u01b8\3\2\2\2\u0091\u01ba\3\2\2\2\u0093\u01c5\3\2"+
		"\2\2\u0095\u01c9\3\2\2\2\u0097\u01d0\3\2\2\2\u0099\u01d3\3\2\2\2\u009b"+
		"\u01d9\3\2\2\2\u009d\u01e3\3\2\2\2\u009f\u01e5\3\2\2\2\u00a1\u01f0\3\2"+
		"\2\2\u00a3\u01f2\3\2\2\2\u00a5\u01f4\3\2\2\2\u00a7\u0202\3\2\2\2\u00a9"+
		"\u0204\3\2\2\2\u00ab\u020d\3\2\2\2\u00ad\u020f\3\2\2\2\u00af\u0212\3\2"+
		"\2\2\u00b1\u0218\3\2\2\2\u00b3\u021b\3\2\2\2\u00b5\u021f\3\2\2\2\u00b7"+
		"\u0221\3\2\2\2\u00b9\u00ba\7d\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7q\2"+
		"\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0"+
		"\7p\2\2\u00c0\4\3\2\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3\7{\2\2\u00c3\u00c4"+
		"\7v\2\2\u00c4\u00c5\7g\2\2\u00c5\6\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8"+
		"\7j\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7v\2\2\u00cb"+
		"\b\3\2\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"\n\3\2\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"\u00d4\7i\2\2\u00d4\f\3\2\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7j\2\2\u00d7"+
		"\u00d8\7c\2\2\u00d8\u00d9\7t\2\2\u00d9\16\3\2\2\2\u00da\u00db\7,\2\2\u00db"+
		"\u00dc\7?\2\2\u00dc\20\3\2\2\2\u00dd\u00de\7\61\2\2\u00de\u00df\7?\2\2"+
		"\u00df\22\3\2\2\2\u00e0\u00e1\7\'\2\2\u00e1\u00e2\7?\2\2\u00e2\24\3\2"+
		"\2\2\u00e3\u00e4\7-\2\2\u00e4\u00e5\7?\2\2\u00e5\26\3\2\2\2\u00e6\u00e7"+
		"\7/\2\2\u00e7\u00e8\7?\2\2\u00e8\30\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea\u00eb"+
		"\7>\2\2\u00eb\u00ec\7?\2\2\u00ec\32\3\2\2\2\u00ed\u00ee\7@\2\2\u00ee\u00ef"+
		"\7@\2\2\u00ef\u00f0\7?\2\2\u00f0\34\3\2\2\2\u00f1\u00f2\7@\2\2\u00f2\u00f3"+
		"\7@\2\2\u00f3\u00f4\7@\2\2\u00f4\u00f5\7?\2\2\u00f5\36\3\2\2\2\u00f6\u00f7"+
		"\7(\2\2\u00f7\u00f8\7?\2\2\u00f8 \3\2\2\2\u00f9\u00fa\7`\2\2\u00fa\u00fb"+
		"\7?\2\2\u00fb\"\3\2\2\2\u00fc\u00fd\7~\2\2\u00fd\u00fe\7?\2\2\u00fe$\3"+
		"\2\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7h\2\2\u0101&\3\2\2\2\u0102\u0103"+
		"\7g\2\2\u0103\u0104\7n\2\2\u0104\u0105\7u\2\2\u0105\u0106\7g\2\2\u0106"+
		"(\3\2\2\2\u0107\u0108\7u\2\2\u0108\u0109\7y\2\2\u0109\u010a\7k\2\2\u010a"+
		"\u010b\7v\2\2\u010b\u010c\7e\2\2\u010c\u010d\7j\2\2\u010d*\3\2\2\2\u010e"+
		"\u010f\7e\2\2\u010f\u0110\7c\2\2\u0110\u0111\7u\2\2\u0111\u0112\7g\2\2"+
		"\u0112,\3\2\2\2\u0113\u0114\7f\2\2\u0114\u0115\7g\2\2\u0115\u0116\7h\2"+
		"\2\u0116\u0117\7c\2\2\u0117\u0118\7w\2\2\u0118\u0119\7n\2\2\u0119\u011a"+
		"\7v\2\2\u011a.\3\2\2\2\u011b\u011c\7y\2\2\u011c\u011d\7j\2\2\u011d\u011e"+
		"\7k\2\2\u011e\u011f\7n\2\2\u011f\u0120\7g\2\2\u0120\60\3\2\2\2\u0121\u0122"+
		"\7f\2\2\u0122\u0123\7q\2\2\u0123\62\3\2\2\2\u0124\u0125\7h\2\2\u0125\u0126"+
		"\7q\2\2\u0126\u0127\7t\2\2\u0127\64\3\2\2\2\u0128\u0129\7d\2\2\u0129\u012a"+
		"\7t\2\2\u012a\u012b\7g\2\2\u012b\u012c\7c\2\2\u012c\u012d\7m\2\2\u012d"+
		"\66\3\2\2\2\u012e\u012f\7e\2\2\u012f\u0130\7q\2\2\u0130\u0131\7p\2\2\u0131"+
		"\u0132\7v\2\2\u0132\u0133\7k\2\2\u0133\u0134\7p\2\2\u0134\u0135\7w\2\2"+
		"\u0135\u0136\7g\2\2\u01368\3\2\2\2\u0137\u0138\7t\2\2\u0138\u0139\7g\2"+
		"\2\u0139\u013a\7v\2\2\u013a\u013b\7w\2\2\u013b\u013c\7t\2\2\u013c\u013d"+
		"\7p\2\2\u013d:\3\2\2\2\u013e\u013f\7\60\2\2\u013f<\3\2\2\2\u0140\u0141"+
		"\7e\2\2\u0141\u0142\7n\2\2\u0142\u0143\7c\2\2\u0143\u0144\7u\2\2\u0144"+
		"\u0145\7u\2\2\u0145>\3\2\2\2\u0146\u0147\7v\2\2\u0147\u0148\7j\2\2\u0148"+
		"\u0149\7k\2\2\u0149\u014a\7u\2\2\u014a@\3\2\2\2\u014b\u014c\7u\2\2\u014c"+
		"\u014d\7w\2\2\u014d\u014e\7r\2\2\u014e\u014f\7g\2\2\u014f\u0150\7t\2\2"+
		"\u0150B\3\2\2\2\u0151\u0152\7p\2\2\u0152\u0153\7g\2\2\u0153\u0154\7y\2"+
		"\2\u0154D\3\2\2\2\u0155\u0156\7A\2\2\u0156F\3\2\2\2\u0157\u0158\7*\2\2"+
		"\u0158H\3\2\2\2\u0159\u015a\7+\2\2\u015aJ\3\2\2\2\u015b\u015c\7}\2\2\u015c"+
		"L\3\2\2\2\u015d\u015e\7\177\2\2\u015eN\3\2\2\2\u015f\u0160\7]\2\2\u0160"+
		"P\3\2\2\2\u0161\u0162\7_\2\2\u0162R\3\2\2\2\u0163\u0164\7=\2\2\u0164T"+
		"\3\2\2\2\u0165\u0166\7.\2\2\u0166V\3\2\2\2\u0167\u0168\7?\2\2\u0168X\3"+
		"\2\2\2\u0169\u016a\7@\2\2\u016aZ\3\2\2\2\u016b\u016c\7>\2\2\u016c\\\3"+
		"\2\2\2\u016d\u016e\7#\2\2\u016e^\3\2\2\2\u016f\u0170\7<\2\2\u0170`\3\2"+
		"\2\2\u0171\u0172\7?\2\2\u0172\u0173\7?\2\2\u0173b\3\2\2\2\u0174\u0175"+
		"\7>\2\2\u0175\u0176\7?\2\2\u0176d\3\2\2\2\u0177\u0178\7@\2\2\u0178\u0179"+
		"\7?\2\2\u0179f\3\2\2\2\u017a\u017b\7#\2\2\u017b\u017c\7?\2\2\u017ch\3"+
		"\2\2\2\u017d\u017e\7(\2\2\u017e\u017f\7(\2\2\u017fj\3\2\2\2\u0180\u0181"+
		"\7~\2\2\u0181\u0182\7~\2\2\u0182l\3\2\2\2\u0183\u0184\7-\2\2\u0184\u0185"+
		"\7-\2\2\u0185n\3\2\2\2\u0186\u0187\7/\2\2\u0187\u0188\7/\2\2\u0188p\3"+
		"\2\2\2\u0189\u018a\7-\2\2\u018ar\3\2\2\2\u018b\u018c\7/\2\2\u018ct\3\2"+
		"\2\2\u018d\u018e\7,\2\2\u018ev\3\2\2\2\u018f\u0190\7\61\2\2\u0190x\3\2"+
		"\2\2\u0191\u0192\7(\2\2\u0192z\3\2\2\2\u0193\u0194\7~\2\2\u0194|\3\2\2"+
		"\2\u0195\u0196\7`\2\2\u0196~\3\2\2\2\u0197\u0198\7\'\2\2\u0198\u0080\3"+
		"\2\2\2\u0199\u019d\5\u0083B\2\u019a\u019c\5\u0085C\2\u019b\u019a\3\2\2"+
		"\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u0082"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\t\2\2\2\u01a1\u0084\3\2\2\2\u01a2"+
		"\u01a3\t\3\2\2\u01a3\u0086\3\2\2\2\u01a4\u01a6\7$\2\2\u01a5\u01a7\5\u0089"+
		"E\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01a9\7$\2\2\u01a9\u0088\3\2\2\2\u01aa\u01ac\5\u008bF\2\u01ab\u01aa\3"+
		"\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u008a\3\2\2\2\u01af\u01b2\n\4\2\2\u01b0\u01b2\5\u008dG\2\u01b1\u01af"+
		"\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2\u008c\3\2\2\2\u01b3\u01b4\7^\2\2\u01b4"+
		"\u01b7\t\5\2\2\u01b5\u01b7\5\u0091I\2\u01b6\u01b3\3\2\2\2\u01b6\u01b5"+
		"\3\2\2\2\u01b7\u008e\3\2\2\2\u01b8\u01b9\t\6\2\2\u01b9\u0090\3\2\2\2\u01ba"+
		"\u01bc\7^\2\2\u01bb\u01bd\7w\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01be\3\2\2"+
		"\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1"+
		"\5\u0097L\2\u01c1\u01c2\5\u0097L\2\u01c2\u01c3\5\u0097L\2\u01c3\u01c4"+
		"\5\u0097L\2\u01c4\u0092\3\2\2\2\u01c5\u01c6\7\62\2\2\u01c6\u01c7\t\7\2"+
		"\2\u01c7\u01c8\5\u0095K\2\u01c8\u0094\3\2\2\2\u01c9\u01ce\5\u0097L\2\u01ca"+
		"\u01cc\5\u0099M\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd"+
		"\3\2\2\2\u01cd\u01cf\5\u0097L\2\u01ce\u01cb\3\2\2\2\u01ce\u01cf\3\2\2"+
		"\2\u01cf\u0096\3\2\2\2\u01d0\u01d1\t\b\2\2\u01d1\u0098\3\2\2\2\u01d2\u01d4"+
		"\5\u009bN\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d3\3\2\2"+
		"\2\u01d5\u01d6\3\2\2\2\u01d6\u009a\3\2\2\2\u01d7\u01da\5\u0097L\2\u01d8"+
		"\u01da\7a\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da\u009c\3\2"+
		"\2\2\u01db\u01dc\7)\2\2\u01dc\u01dd\5\u009fP\2\u01dd\u01de\7)\2\2\u01de"+
		"\u01e4\3\2\2\2\u01df\u01e0\7)\2\2\u01e0\u01e1\5\u008dG\2\u01e1\u01e2\7"+
		")\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01db\3\2\2\2\u01e3\u01df\3\2\2\2\u01e4"+
		"\u009e\3\2\2\2\u01e5\u01e6\n\t\2\2\u01e6\u00a0\3\2\2\2\u01e7\u01e8\7v"+
		"\2\2\u01e8\u01e9\7t\2\2\u01e9\u01ea\7w\2\2\u01ea\u01f1\7g\2\2\u01eb\u01ec"+
		"\7h\2\2\u01ec\u01ed\7c\2\2\u01ed\u01ee\7n\2\2\u01ee\u01ef\7u\2\2\u01ef"+
		"\u01f1\7g\2\2\u01f0\u01e7\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f1\u00a2\3\2"+
		"\2\2\u01f2\u01f3\5\u00a5S\2\u01f3\u00a4\3\2\2\2\u01f4\u01f6\5\u00a7T\2"+
		"\u01f5\u01f7\5\u00b5[\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u00a6\3\2\2\2\u01f8\u0203\7\62\2\2\u01f9\u0200\5\u00adW\2\u01fa\u01fc"+
		"\5\u00a9U\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0201\3\2\2"+
		"\2\u01fd\u01fe\5\u00b3Z\2\u01fe\u01ff\5\u00a9U\2\u01ff\u0201\3\2\2\2\u0200"+
		"\u01fb\3\2\2\2\u0200\u01fd\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u01f8\3\2"+
		"\2\2\u0202\u01f9\3\2\2\2\u0203\u00a8\3\2\2\2\u0204\u0209\5\u00abV\2\u0205"+
		"\u0207\5\u00afX\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208"+
		"\3\2\2\2\u0208\u020a\5\u00abV\2\u0209\u0206\3\2\2\2\u0209\u020a\3\2\2"+
		"\2\u020a\u00aa\3\2\2\2\u020b\u020e\7\62\2\2\u020c\u020e\5\u00adW\2\u020d"+
		"\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020e\u00ac\3\2\2\2\u020f\u0210\t\n"+
		"\2\2\u0210\u00ae\3\2\2\2\u0211\u0213\5\u00b1Y\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u00b0\3\2"+
		"\2\2\u0216\u0219\5\u00abV\2\u0217\u0219\7a\2\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0217\3\2\2\2\u0219\u00b2\3\2\2\2\u021a\u021c\7a\2\2\u021b\u021a\3\2"+
		"\2\2\u021c\u021d\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u00b4\3\2\2\2\u021f\u0220\t\13\2\2\u0220\u00b6\3\2\2\2\u0221\u0222\7"+
		"p\2\2\u0222\u0223\7w\2\2\u0223\u0224\7n\2\2\u0224\u0225\7n\2\2\u0225\u00b8"+
		"\3\2\2\2\31\2\u019d\u01a6\u01ad\u01b1\u01b6\u01be\u01cb\u01ce\u01d5\u01d9"+
		"\u01e3\u01f0\u01f6\u01fb\u0200\u0202\u0206\u0209\u020d\u0214\u0218\u021d"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}