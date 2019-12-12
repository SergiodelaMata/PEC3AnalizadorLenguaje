// Generated from Pl2compilerLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Pl2compilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CASE=1, BREAK=2, DEFAULT=3, BOOLEAN=4, FALSO=5, VERDADERO=6, IF=7, ELSE=8, 
		THEN=9, ENDIF=10, BEGIN=11, END=12, INCLUDE=13, FUNCTION=14, VOID=15, 
		STRING=16, WHILE=17, FOR=18, ENDFOR=19, FROM=20, STEP=21, TO=22, DO=23, 
		NUMERO=24, DEVOLVER=25, MAIN=26, PC=27, PL=28, PR=29, DOSPUNTOS=30, PUNTO=31, 
		COMA=32, INCREMENTOEN1=33, DECREMENTOEN1=34, ADD=35, MINUS=36, PRODUCT=37, 
		DIVISION=38, ASIGN=39, PORCENTAJE=40, MENORQUE=41, MAYORQUE=42, IGUALQUE=43, 
		DISTINTOQUE=44, PUERTALOGICAAND=45, PUERTALOGICAOR=46, DIGITO=47, FLOTANTE=48, 
		NEWLINE=49, ARRAY=50, ID=51, NOMBREPAQUETE=52, CADENA=53, COMENTARIO_LINEA=54, 
		COMENTARIO_LINEA2=55, COMENTARIO_BLOQUE=56, COMENTARIO_DOCUMENTACION=57, 
		WS=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CASE", "BREAK", "DEFAULT", "BOOLEAN", "FALSO", "VERDADERO", "IF", "ELSE", 
			"THEN", "ENDIF", "BEGIN", "END", "INCLUDE", "FUNCTION", "VOID", "STRING", 
			"WHILE", "FOR", "ENDFOR", "FROM", "STEP", "TO", "DO", "NUMERO", "DEVOLVER", 
			"MAIN", "PC", "PL", "PR", "DOSPUNTOS", "PUNTO", "COMA", "INCREMENTOEN1", 
			"DECREMENTOEN1", "ADD", "MINUS", "PRODUCT", "DIVISION", "ASIGN", "PORCENTAJE", 
			"MENORQUE", "MAYORQUE", "IGUALQUE", "DISTINTOQUE", "PUERTALOGICAAND", 
			"PUERTALOGICAOR", "DIGITO", "FLOTANTE", "NEWLINE", "ARRAY", "ID", "NOMBREPAQUETE", 
			"CADENA", "ESC", "COMENTARIO_LINEA", "COMENTARIO_LINEA2", "COMENTARIO_BLOQUE", 
			"COMENTARIO_DOCUMENTACION", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'case'", "'break'", "'default'", null, null, null, "'if'", "'else'", 
			"'then'", "'endif'", "'begin'", "'end'", "'include'", "'function'", "'void'", 
			"'cadena'", "'while'", "'for'", "'enddo'", "'from'", "'step'", "'to'", 
			"'do'", "'numero'", "'devolver'", "'main'", "';'", "'('", "')'", "':'", 
			"'.'", "','", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "':='", "'%'", 
			"'<'", "'>'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CASE", "BREAK", "DEFAULT", "BOOLEAN", "FALSO", "VERDADERO", "IF", 
			"ELSE", "THEN", "ENDIF", "BEGIN", "END", "INCLUDE", "FUNCTION", "VOID", 
			"STRING", "WHILE", "FOR", "ENDFOR", "FROM", "STEP", "TO", "DO", "NUMERO", 
			"DEVOLVER", "MAIN", "PC", "PL", "PR", "DOSPUNTOS", "PUNTO", "COMA", "INCREMENTOEN1", 
			"DECREMENTOEN1", "ADD", "MINUS", "PRODUCT", "DIVISION", "ASIGN", "PORCENTAJE", 
			"MENORQUE", "MAYORQUE", "IGUALQUE", "DISTINTOQUE", "PUERTALOGICAAND", 
			"PUERTALOGICAOR", "DIGITO", "FLOTANTE", "NEWLINE", "ARRAY", "ID", "NOMBREPAQUETE", 
			"CADENA", "COMENTARIO_LINEA", "COMENTARIO_LINEA2", "COMENTARIO_BLOQUE", 
			"COMENTARIO_DOCUMENTACION", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public Pl2compilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pl2compilerLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 52:
			CADENA_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void CADENA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01d3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\5\5\u008f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009b"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a7\n\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\5.\u0146\n.\3/\3/\3"+
		"/\3/\5/\u014c\n/\3\60\5\60\u014f\n\60\3\60\6\60\u0152\n\60\r\60\16\60"+
		"\u0153\3\61\6\61\u0157\n\61\r\61\16\61\u0158\3\61\3\61\6\61\u015d\n\61"+
		"\r\61\16\61\u015e\3\62\6\62\u0162\n\62\r\62\16\62\u0163\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\6\64\u016e\n\64\r\64\16\64\u016f\3\65\3\65\3"+
		"\65\3\65\7\65\u0176\n\65\f\65\16\65\u0179\13\65\3\66\3\66\3\66\7\66\u017e"+
		"\n\66\f\66\16\66\u0181\13\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\3"+
		"8\78\u018d\n8\f8\168\u0190\138\38\38\38\38\39\39\39\39\79\u019a\n9\f9"+
		"\169\u019d\139\39\39\39\39\39\3:\3:\3:\3:\3:\7:\u01a9\n:\f:\16:\u01ac"+
		"\13:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\7;\u01ba\n;\f;\16;\u01bd\13;"+
		"\3;\3;\3;\3;\3;\3;\3;\3<\6<\u01c7\n<\r<\16<\u01c8\3<\6<\u01cc\n<\r<\16"+
		"<\u01cd\5<\u01d0\n<\3<\3<\7\u017f\u018e\u019b\u01aa\u01bb\2=\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m\2o8q9s:u;"+
		"w<\3\2\6\3\2\62;\4\2\13\f\17\17\6\2\62;C\\aac|\b\2$$^^ddppttvv\2\u01e6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5~\3\2\2\2\7"+
		"\u0084\3\2\2\2\t\u008e\3\2\2\2\13\u009a\3\2\2\2\r\u00a6\3\2\2\2\17\u00a8"+
		"\3\2\2\2\21\u00ab\3\2\2\2\23\u00b0\3\2\2\2\25\u00b5\3\2\2\2\27\u00bb\3"+
		"\2\2\2\31\u00c1\3\2\2\2\33\u00c5\3\2\2\2\35\u00cd\3\2\2\2\37\u00d6\3\2"+
		"\2\2!\u00db\3\2\2\2#\u00e2\3\2\2\2%\u00e8\3\2\2\2\'\u00ec\3\2\2\2)\u00f2"+
		"\3\2\2\2+\u00f7\3\2\2\2-\u00fc\3\2\2\2/\u00ff\3\2\2\2\61\u0102\3\2\2\2"+
		"\63\u0109\3\2\2\2\65\u0112\3\2\2\2\67\u0117\3\2\2\29\u0119\3\2\2\2;\u011b"+
		"\3\2\2\2=\u011d\3\2\2\2?\u011f\3\2\2\2A\u0121\3\2\2\2C\u0123\3\2\2\2E"+
		"\u0126\3\2\2\2G\u0129\3\2\2\2I\u012b\3\2\2\2K\u012d\3\2\2\2M\u012f\3\2"+
		"\2\2O\u0131\3\2\2\2Q\u0134\3\2\2\2S\u0136\3\2\2\2U\u0138\3\2\2\2W\u013a"+
		"\3\2\2\2Y\u013d\3\2\2\2[\u0145\3\2\2\2]\u014b\3\2\2\2_\u014e\3\2\2\2a"+
		"\u0156\3\2\2\2c\u0161\3\2\2\2e\u0167\3\2\2\2g\u016d\3\2\2\2i\u0171\3\2"+
		"\2\2k\u017a\3\2\2\2m\u0185\3\2\2\2o\u0188\3\2\2\2q\u0195\3\2\2\2s\u01a3"+
		"\3\2\2\2u\u01b3\3\2\2\2w\u01cf\3\2\2\2yz\7e\2\2z{\7c\2\2{|\7u\2\2|}\7"+
		"g\2\2}\4\3\2\2\2~\177\7d\2\2\177\u0080\7t\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0082\7c\2\2\u0082\u0083\7m\2\2\u0083\6\3\2\2\2\u0084\u0085\7f\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7h\2\2\u0087\u0088\7c\2\2\u0088\u0089\7w\2\2"+
		"\u0089\u008a\7n\2\2\u008a\u008b\7v\2\2\u008b\b\3\2\2\2\u008c\u008f\5\13"+
		"\6\2\u008d\u008f\5\r\7\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\n\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092\7c\2\2\u0092\u0093\7n\2\2\u0093"+
		"\u0094\7u\2\2\u0094\u009b\7g\2\2\u0095\u0096\7#\2\2\u0096\u0097\7v\2\2"+
		"\u0097\u0098\7t\2\2\u0098\u0099\7w\2\2\u0099\u009b\7g\2\2\u009a\u0090"+
		"\3\2\2\2\u009a\u0095\3\2\2\2\u009b\f\3\2\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7t\2\2\u009e\u009f\7w\2\2\u009f\u00a7\7g\2\2\u00a0\u00a1\7#\2\2"+
		"\u00a1\u00a2\7h\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5"+
		"\7u\2\2\u00a5\u00a7\7g\2\2\u00a6\u009c\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a7"+
		"\16\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7h\2\2\u00aa\20\3\2\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2"+
		"\u00af\22\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7"+
		"g\2\2\u00b3\u00b4\7p\2\2\u00b4\24\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7"+
		"\7p\2\2\u00b7\u00b8\7f\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7h\2\2\u00ba"+
		"\26\3\2\2\2\u00bb\u00bc\7d\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7i\2\2\u00be"+
		"\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\30\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\u00c3\7p\2\2\u00c3\u00c4\7f\2\2\u00c4\32\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6"+
		"\u00c7\7p\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7w\2\2"+
		"\u00ca\u00cb\7f\2\2\u00cb\u00cc\7g\2\2\u00cc\34\3\2\2\2\u00cd\u00ce\7"+
		"h\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2"+
		"\7v\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7p\2\2\u00d5"+
		"\36\3\2\2\2\u00d6\u00d7\7x\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7k\2\2\u00d9"+
		"\u00da\7f\2\2\u00da \3\2\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7c\2\2\u00dd"+
		"\u00de\7f\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7c\2\2"+
		"\u00e1\"\3\2\2\2\u00e2\u00e3\7y\2\2\u00e3\u00e4\7j\2\2\u00e4\u00e5\7k"+
		"\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7g\2\2\u00e7$\3\2\2\2\u00e8\u00e9"+
		"\7h\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7t\2\2\u00eb&\3\2\2\2\u00ec\u00ed"+
		"\7g\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7f\2\2\u00f0"+
		"\u00f1\7q\2\2\u00f1(\3\2\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7t\2\2\u00f4"+
		"\u00f5\7q\2\2\u00f5\u00f6\7o\2\2\u00f6*\3\2\2\2\u00f7\u00f8\7u\2\2\u00f8"+
		"\u00f9\7v\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7r\2\2\u00fb,\3\2\2\2\u00fc"+
		"\u00fd\7v\2\2\u00fd\u00fe\7q\2\2\u00fe.\3\2\2\2\u00ff\u0100\7f\2\2\u0100"+
		"\u0101\7q\2\2\u0101\60\3\2\2\2\u0102\u0103\7p\2\2\u0103\u0104\7w\2\2\u0104"+
		"\u0105\7o\2\2\u0105\u0106\7g\2\2\u0106\u0107\7t\2\2\u0107\u0108\7q\2\2"+
		"\u0108\62\3\2\2\2\u0109\u010a\7f\2\2\u010a\u010b\7g\2\2\u010b\u010c\7"+
		"x\2\2\u010c\u010d\7q\2\2\u010d\u010e\7n\2\2\u010e\u010f\7x\2\2\u010f\u0110"+
		"\7g\2\2\u0110\u0111\7t\2\2\u0111\64\3\2\2\2\u0112\u0113\7o\2\2\u0113\u0114"+
		"\7c\2\2\u0114\u0115\7k\2\2\u0115\u0116\7p\2\2\u0116\66\3\2\2\2\u0117\u0118"+
		"\7=\2\2\u01188\3\2\2\2\u0119\u011a\7*\2\2\u011a:\3\2\2\2\u011b\u011c\7"+
		"+\2\2\u011c<\3\2\2\2\u011d\u011e\7<\2\2\u011e>\3\2\2\2\u011f\u0120\7\60"+
		"\2\2\u0120@\3\2\2\2\u0121\u0122\7.\2\2\u0122B\3\2\2\2\u0123\u0124\7-\2"+
		"\2\u0124\u0125\7-\2\2\u0125D\3\2\2\2\u0126\u0127\7/\2\2\u0127\u0128\7"+
		"/\2\2\u0128F\3\2\2\2\u0129\u012a\7-\2\2\u012aH\3\2\2\2\u012b\u012c\7/"+
		"\2\2\u012cJ\3\2\2\2\u012d\u012e\7,\2\2\u012eL\3\2\2\2\u012f\u0130\7\61"+
		"\2\2\u0130N\3\2\2\2\u0131\u0132\7<\2\2\u0132\u0133\7?\2\2\u0133P\3\2\2"+
		"\2\u0134\u0135\7\'\2\2\u0135R\3\2\2\2\u0136\u0137\7>\2\2\u0137T\3\2\2"+
		"\2\u0138\u0139\7@\2\2\u0139V\3\2\2\2\u013a\u013b\7?\2\2\u013b\u013c\7"+
		"?\2\2\u013cX\3\2\2\2\u013d\u013e\7#\2\2\u013e\u013f\7?\2\2\u013fZ\3\2"+
		"\2\2\u0140\u0141\7c\2\2\u0141\u0142\7p\2\2\u0142\u0146\7f\2\2\u0143\u0144"+
		"\7(\2\2\u0144\u0146\7(\2\2\u0145\u0140\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\\\3\2\2\2\u0147\u0148\7q\2\2\u0148\u014c\7t\2\2\u0149\u014a\7~\2\2\u014a"+
		"\u014c\7~\2\2\u014b\u0147\3\2\2\2\u014b\u0149\3\2\2\2\u014c^\3\2\2\2\u014d"+
		"\u014f\7/\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2"+
		"\2\2\u0150\u0152\t\2\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154`\3\2\2\2\u0155\u0157\5_\60\2"+
		"\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\5? \2\u015b\u015d\5_\60\2\u015c"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015fb\3\2\2\2\u0160\u0162\t\3\2\2\u0161\u0160\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\b\62\2\2\u0166d\3\2\2\2\u0167\u0168\5g\64\2\u0168\u0169\7]\2\2"+
		"\u0169\u016a\5_\60\2\u016a\u016b\7_\2\2\u016bf\3\2\2\2\u016c\u016e\t\4"+
		"\2\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170h\3\2\2\2\u0171\u0177\5g\64\2\u0172\u0173\5? \2\u0173"+
		"\u0174\5g\64\2\u0174\u0176\3\2\2\2\u0175\u0172\3\2\2\2\u0176\u0179\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178j\3\2\2\2\u0179\u0177"+
		"\3\2\2\2\u017a\u017f\7$\2\2\u017b\u017e\5m\67\2\u017c\u017e\13\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0183\7$\2\2\u0183\u0184\b\66\3\2\u0184l\3\2\2\2\u0185\u0186\7^\2\2\u0186"+
		"\u0187\t\5\2\2\u0187n\3\2\2\2\u0188\u0189\7\61\2\2\u0189\u018a\7\61\2"+
		"\2\u018a\u018e\3\2\2\2\u018b\u018d\13\2\2\2\u018c\u018b\3\2\2\2\u018d"+
		"\u0190\3\2\2\2\u018e\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\3\2"+
		"\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7\f\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\b8\2\2\u0194p\3\2\2\2\u0195\u0196\7\61\2\2\u0196\u0197\7,\2\2\u0197"+
		"\u019b\3\2\2\2\u0198\u019a\13\2\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3"+
		"\2\2\2\u019b\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019e\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019e\u019f\7,\2\2\u019f\u01a0\7\61\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a2\b9\2\2\u01a2r\3\2\2\2\u01a3\u01a4\7\61\2\2\u01a4\u01a5"+
		"\7,\2\2\u01a5\u01a6\7,\2\2\u01a6\u01aa\3\2\2\2\u01a7\u01a9\13\2\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01ab\3\2\2\2\u01aa\u01a8\3\2"+
		"\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7,\2\2\u01ae"+
		"\u01af\7,\2\2\u01af\u01b0\7\61\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\b:"+
		"\2\2\u01b2t\3\2\2\2\u01b3\u01b4\7\61\2\2\u01b4\u01b5\7,\2\2\u01b5\u01b6"+
		"\7,\2\2\u01b6\u01b7\7,\2\2\u01b7\u01bb\3\2\2\2\u01b8\u01ba\13\2\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7,\2\2\u01bf"+
		"\u01c0\7,\2\2\u01c0\u01c1\7,\2\2\u01c1\u01c2\7\61\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c4\b;\2\2\u01c4v\3\2\2\2\u01c5\u01c7\t\3\2\2\u01c6\u01c5"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01d0\3\2\2\2\u01ca\u01cc\7\"\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf"+
		"\u01c6\3\2\2\2\u01cf\u01cb\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\b<"+
		"\2\2\u01d2x\3\2\2\2\30\2\u008e\u009a\u00a6\u0145\u014b\u014e\u0153\u0158"+
		"\u015e\u0163\u016f\u0177\u017d\u017f\u018e\u019b\u01aa\u01bb\u01c8\u01cd"+
		"\u01cf\4\b\2\2\3\66\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}