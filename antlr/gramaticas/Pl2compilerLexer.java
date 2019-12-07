// Generated from .\Pl2compilerLexer.g4 by ANTLR 4.7.2
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
		CONDICIONES=1, SWITCH=2, ENDSWITCH=3, CASE=4, BREAK=5, DEFAULT=6, BOOLEAN=7, 
		FALSO=8, VERDADERO=9, IF=10, ELSE=11, THEN=12, ENDIF=13, BEGIN=14, END=15, 
		INCLUDE=16, FUNCTION=17, VOID=18, STRING=19, WHILE=20, FOR=21, ENDFOR=22, 
		FROM=23, STEP=24, TO=25, DO=26, NUMERO=27, DEVOLVER=28, MAIN=29, PC=30, 
		PL=31, PR=32, DOSPUNTOS=33, PUNTO=34, COMA=35, INCREMENTOEN1=36, DECREMENTOEN1=37, 
		ADD=38, MINUS=39, PRODUCT=40, DIVISION=41, ASIGN=42, PORCENTAJE=43, MENORQUE=44, 
		MAYORQUE=45, IGUALQUE=46, DISTINTOQUE=47, PUERTALOGICAAND=48, PUERTALOGICAOR=49, 
		DIGITO=50, FLOTANTE=51, NEWLINE=52, ARRAY=53, ID=54, NOMBREPAQUETE=55, 
		CADENA=56, COMENTARIO_LINEA=57, COMENTARIO_LINEA2=58, COMENTARIO_BLOQUE=59, 
		COMENTARIO_DOCUMENTACION=60, WS=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CONDICIONES", "SWITCH", "ENDSWITCH", "CASE", "BREAK", "DEFAULT", "BOOLEAN", 
			"FALSO", "VERDADERO", "IF", "ELSE", "THEN", "ENDIF", "BEGIN", "END", 
			"INCLUDE", "FUNCTION", "VOID", "STRING", "WHILE", "FOR", "ENDFOR", "FROM", 
			"STEP", "TO", "DO", "NUMERO", "DEVOLVER", "MAIN", "PC", "PL", "PR", "DOSPUNTOS", 
			"PUNTO", "COMA", "INCREMENTOEN1", "DECREMENTOEN1", "ADD", "MINUS", "PRODUCT", 
			"DIVISION", "ASIGN", "PORCENTAJE", "MENORQUE", "MAYORQUE", "IGUALQUE", 
			"DISTINTOQUE", "PUERTALOGICAAND", "PUERTALOGICAOR", "DIGITO", "FLOTANTE", 
			"NEWLINE", "ARRAY", "ID", "NOMBREPAQUETE", "CADENA", "ESC", "COMENTARIO_LINEA", 
			"COMENTARIO_LINEA2", "COMENTARIO_BLOQUE", "COMENTARIO_DOCUMENTACION", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'switch'", "'endswitch'", "'case'", "'break'", "'default'", 
			null, null, null, "'if'", "'else'", "'then'", "'endif'", "'begin'", "'end'", 
			"'include'", "'function'", "'void'", "'cadena'", "'while'", "'for'", 
			"'enddo'", "'from'", "'step'", "'to'", "'do'", "'numero'", "'devolver'", 
			"'main'", "';'", "'('", "')'", "':'", "'.'", "','", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "':='", "'%'", "'<'", "'>'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONDICIONES", "SWITCH", "ENDSWITCH", "CASE", "BREAK", "DEFAULT", 
			"BOOLEAN", "FALSO", "VERDADERO", "IF", "ELSE", "THEN", "ENDIF", "BEGIN", 
			"END", "INCLUDE", "FUNCTION", "VOID", "STRING", "WHILE", "FOR", "ENDFOR", 
			"FROM", "STEP", "TO", "DO", "NUMERO", "DEVOLVER", "MAIN", "PC", "PL", 
			"PR", "DOSPUNTOS", "PUNTO", "COMA", "INCREMENTOEN1", "DECREMENTOEN1", 
			"ADD", "MINUS", "PRODUCT", "DIVISION", "ASIGN", "PORCENTAJE", "MENORQUE", 
			"MAYORQUE", "IGUALQUE", "DISTINTOQUE", "PUERTALOGICAAND", "PUERTALOGICAOR", 
			"DIGITO", "FLOTANTE", "NEWLINE", "ARRAY", "ID", "NOMBREPAQUETE", "CADENA", 
			"COMENTARIO_LINEA", "COMENTARIO_LINEA2", "COMENTARIO_BLOQUE", "COMENTARIO_DOCUMENTACION", 
			"WS"
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
		case 55:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u01ee\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\5\2\u0082\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u00aa\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b6\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00c2\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\5\61\u0161\n\61\3\62\3\62\3\62"+
		"\3\62\5\62\u0167\n\62\3\63\5\63\u016a\n\63\3\63\6\63\u016d\n\63\r\63\16"+
		"\63\u016e\3\64\6\64\u0172\n\64\r\64\16\64\u0173\3\64\3\64\6\64\u0178\n"+
		"\64\r\64\16\64\u0179\3\65\6\65\u017d\n\65\r\65\16\65\u017e\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\6\67\u0189\n\67\r\67\16\67\u018a\38\38\3"+
		"8\38\78\u0191\n8\f8\168\u0194\138\39\39\39\79\u0199\n9\f9\169\u019c\13"+
		"9\39\39\39\3:\3:\3:\3;\3;\3;\3;\7;\u01a8\n;\f;\16;\u01ab\13;\3;\3;\3;"+
		"\3;\3<\3<\3<\3<\7<\u01b5\n<\f<\16<\u01b8\13<\3<\3<\3<\3<\3<\3=\3=\3=\3"+
		"=\3=\7=\u01c4\n=\f=\16=\u01c7\13=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>"+
		"\7>\u01d5\n>\f>\16>\u01d8\13>\3>\3>\3>\3>\3>\3>\3>\3?\6?\u01e2\n?\r?\16"+
		"?\u01e3\3?\6?\u01e7\n?\r?\16?\u01e8\5?\u01eb\n?\3?\3?\7\u019a\u01a9\u01b6"+
		"\u01c5\u01d6\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s\2u;w<y={>}?\3\2\6\3\2\62;\4\2\13\f\17\17\6\2\62;C"+
		"\\aac|\b\2$$^^ddppttvv\2\u0202\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2u\3\2\2\2\2w\3"+
		"\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\u0081\3\2\2\2\5\u0083\3\2\2"+
		"\2\7\u008a\3\2\2\2\t\u0094\3\2\2\2\13\u0099\3\2\2\2\r\u009f\3\2\2\2\17"+
		"\u00a9\3\2\2\2\21\u00b5\3\2\2\2\23\u00c1\3\2\2\2\25\u00c3\3\2\2\2\27\u00c6"+
		"\3\2\2\2\31\u00cb\3\2\2\2\33\u00d0\3\2\2\2\35\u00d6\3\2\2\2\37\u00dc\3"+
		"\2\2\2!\u00e0\3\2\2\2#\u00e8\3\2\2\2%\u00f1\3\2\2\2\'\u00f6\3\2\2\2)\u00fd"+
		"\3\2\2\2+\u0103\3\2\2\2-\u0107\3\2\2\2/\u010d\3\2\2\2\61\u0112\3\2\2\2"+
		"\63\u0117\3\2\2\2\65\u011a\3\2\2\2\67\u011d\3\2\2\29\u0124\3\2\2\2;\u012d"+
		"\3\2\2\2=\u0132\3\2\2\2?\u0134\3\2\2\2A\u0136\3\2\2\2C\u0138\3\2\2\2E"+
		"\u013a\3\2\2\2G\u013c\3\2\2\2I\u013e\3\2\2\2K\u0141\3\2\2\2M\u0144\3\2"+
		"\2\2O\u0146\3\2\2\2Q\u0148\3\2\2\2S\u014a\3\2\2\2U\u014c\3\2\2\2W\u014f"+
		"\3\2\2\2Y\u0151\3\2\2\2[\u0153\3\2\2\2]\u0155\3\2\2\2_\u0158\3\2\2\2a"+
		"\u0160\3\2\2\2c\u0166\3\2\2\2e\u0169\3\2\2\2g\u0171\3\2\2\2i\u017c\3\2"+
		"\2\2k\u0182\3\2\2\2m\u0188\3\2\2\2o\u018c\3\2\2\2q\u0195\3\2\2\2s\u01a0"+
		"\3\2\2\2u\u01a3\3\2\2\2w\u01b0\3\2\2\2y\u01be\3\2\2\2{\u01ce\3\2\2\2}"+
		"\u01ea\3\2\2\2\177\u0082\5\25\13\2\u0080\u0082\5\27\f\2\u0081\177\3\2"+
		"\2\2\u0081\u0080\3\2\2\2\u0082\4\3\2\2\2\u0083\u0084\7u\2\2\u0084\u0085"+
		"\7y\2\2\u0085\u0086\7k\2\2\u0086\u0087\7v\2\2\u0087\u0088\7e\2\2\u0088"+
		"\u0089\7j\2\2\u0089\6\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7p\2\2\u008c"+
		"\u008d\7f\2\2\u008d\u008e\7u\2\2\u008e\u008f\7y\2\2\u008f\u0090\7k\2\2"+
		"\u0090\u0091\7v\2\2\u0091\u0092\7e\2\2\u0092\u0093\7j\2\2\u0093\b\3\2"+
		"\2\2\u0094\u0095\7e\2\2\u0095\u0096\7c\2\2\u0096\u0097\7u\2\2\u0097\u0098"+
		"\7g\2\2\u0098\n\3\2\2\2\u0099\u009a\7d\2\2\u009a\u009b\7t\2\2\u009b\u009c"+
		"\7g\2\2\u009c\u009d\7c\2\2\u009d\u009e\7m\2\2\u009e\f\3\2\2\2\u009f\u00a0"+
		"\7f\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7w\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7v\2\2\u00a6\16\3\2\2\2\u00a7"+
		"\u00aa\5\21\t\2\u00a8\u00aa\5\23\n\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3"+
		"\2\2\2\u00aa\20\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae"+
		"\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00b6\7g\2\2\u00b0\u00b1\7#\2\2\u00b1"+
		"\u00b2\7v\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b6\7g\2\2"+
		"\u00b5\u00ab\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\22\3\2\2\2\u00b7\u00b8"+
		"\7v\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7w\2\2\u00ba\u00c2\7g\2\2\u00bb"+
		"\u00bc\7#\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7n\2\2"+
		"\u00bf\u00c0\7u\2\2\u00c0\u00c2\7g\2\2\u00c1\u00b7\3\2\2\2\u00c1\u00bb"+
		"\3\2\2\2\u00c2\24\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7h\2\2\u00c5"+
		"\26\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7u\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca\30\3\2\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7j\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\u00cf\7p\2\2\u00cf\32\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7p\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7h\2\2"+
		"\u00d5\34\3\2\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7"+
		"i\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\36\3\2\2\2\u00dc\u00dd"+
		"\7g\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7f\2\2\u00df \3\2\2\2\u00e0\u00e1"+
		"\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7n\2\2\u00e4"+
		"\u00e5\7w\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7g\2\2\u00e7\"\3\2\2\2\u00e8"+
		"\u00e9\7h\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7e\2\2"+
		"\u00ec\u00ed\7v\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0"+
		"\7p\2\2\u00f0$\3\2\2\2\u00f1\u00f2\7x\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4"+
		"\7k\2\2\u00f4\u00f5\7f\2\2\u00f5&\3\2\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8"+
		"\7c\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7p\2\2\u00fb"+
		"\u00fc\7c\2\2\u00fc(\3\2\2\2\u00fd\u00fe\7y\2\2\u00fe\u00ff\7j\2\2\u00ff"+
		"\u0100\7k\2\2\u0100\u0101\7n\2\2\u0101\u0102\7g\2\2\u0102*\3\2\2\2\u0103"+
		"\u0104\7h\2\2\u0104\u0105\7q\2\2\u0105\u0106\7t\2\2\u0106,\3\2\2\2\u0107"+
		"\u0108\7g\2\2\u0108\u0109\7p\2\2\u0109\u010a\7f\2\2\u010a\u010b\7f\2\2"+
		"\u010b\u010c\7q\2\2\u010c.\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f\7t\2"+
		"\2\u010f\u0110\7q\2\2\u0110\u0111\7o\2\2\u0111\60\3\2\2\2\u0112\u0113"+
		"\7u\2\2\u0113\u0114\7v\2\2\u0114\u0115\7g\2\2\u0115\u0116\7r\2\2\u0116"+
		"\62\3\2\2\2\u0117\u0118\7v\2\2\u0118\u0119\7q\2\2\u0119\64\3\2\2\2\u011a"+
		"\u011b\7f\2\2\u011b\u011c\7q\2\2\u011c\66\3\2\2\2\u011d\u011e\7p\2\2\u011e"+
		"\u011f\7w\2\2\u011f\u0120\7o\2\2\u0120\u0121\7g\2\2\u0121\u0122\7t\2\2"+
		"\u0122\u0123\7q\2\2\u01238\3\2\2\2\u0124\u0125\7f\2\2\u0125\u0126\7g\2"+
		"\2\u0126\u0127\7x\2\2\u0127\u0128\7q\2\2\u0128\u0129\7n\2\2\u0129\u012a"+
		"\7x\2\2\u012a\u012b\7g\2\2\u012b\u012c\7t\2\2\u012c:\3\2\2\2\u012d\u012e"+
		"\7o\2\2\u012e\u012f\7c\2\2\u012f\u0130\7k\2\2\u0130\u0131\7p\2\2\u0131"+
		"<\3\2\2\2\u0132\u0133\7=\2\2\u0133>\3\2\2\2\u0134\u0135\7*\2\2\u0135@"+
		"\3\2\2\2\u0136\u0137\7+\2\2\u0137B\3\2\2\2\u0138\u0139\7<\2\2\u0139D\3"+
		"\2\2\2\u013a\u013b\7\60\2\2\u013bF\3\2\2\2\u013c\u013d\7.\2\2\u013dH\3"+
		"\2\2\2\u013e\u013f\7-\2\2\u013f\u0140\7-\2\2\u0140J\3\2\2\2\u0141\u0142"+
		"\7/\2\2\u0142\u0143\7/\2\2\u0143L\3\2\2\2\u0144\u0145\7-\2\2\u0145N\3"+
		"\2\2\2\u0146\u0147\7/\2\2\u0147P\3\2\2\2\u0148\u0149\7,\2\2\u0149R\3\2"+
		"\2\2\u014a\u014b\7\61\2\2\u014bT\3\2\2\2\u014c\u014d\7<\2\2\u014d\u014e"+
		"\7?\2\2\u014eV\3\2\2\2\u014f\u0150\7\'\2\2\u0150X\3\2\2\2\u0151\u0152"+
		"\7>\2\2\u0152Z\3\2\2\2\u0153\u0154\7@\2\2\u0154\\\3\2\2\2\u0155\u0156"+
		"\7?\2\2\u0156\u0157\7?\2\2\u0157^\3\2\2\2\u0158\u0159\7#\2\2\u0159\u015a"+
		"\7?\2\2\u015a`\3\2\2\2\u015b\u015c\7c\2\2\u015c\u015d\7p\2\2\u015d\u0161"+
		"\7f\2\2\u015e\u015f\7(\2\2\u015f\u0161\7(\2\2\u0160\u015b\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161b\3\2\2\2\u0162\u0163\7q\2\2\u0163\u0167\7t\2\2\u0164"+
		"\u0165\7~\2\2\u0165\u0167\7~\2\2\u0166\u0162\3\2\2\2\u0166\u0164\3\2\2"+
		"\2\u0167d\3\2\2\2\u0168\u016a\7/\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3"+
		"\2\2\2\u016a\u016c\3\2\2\2\u016b\u016d\t\2\2\2\u016c\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016ff\3\2\2\2"+
		"\u0170\u0172\5e\63\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\5E#\2\u0176"+
		"\u0178\5e\63\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017ah\3\2\2\2\u017b\u017d\t\3\2\2\u017c\u017b"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0181\b\65\2\2\u0181j\3\2\2\2\u0182\u0183\5m\67\2"+
		"\u0183\u0184\7]\2\2\u0184\u0185\5e\63\2\u0185\u0186\7_\2\2\u0186l\3\2"+
		"\2\2\u0187\u0189\t\4\2\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018bn\3\2\2\2\u018c\u0192\5m\67\2"+
		"\u018d\u018e\5E#\2\u018e\u018f\5m\67\2\u018f\u0191\3\2\2\2\u0190\u018d"+
		"\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"p\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u019a\7$\2\2\u0196\u0199\5s:\2\u0197"+
		"\u0199\13\2\2\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3"+
		"\2\2\2\u019a\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019d\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u019e\7$\2\2\u019e\u019f\b9\3\2\u019fr\3\2\2\2\u01a0"+
		"\u01a1\7^\2\2\u01a1\u01a2\t\5\2\2\u01a2t\3\2\2\2\u01a3\u01a4\7\61\2\2"+
		"\u01a4\u01a5\7\61\2\2\u01a5\u01a9\3\2\2\2\u01a6\u01a8\13\2\2\2\u01a7\u01a6"+
		"\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7\f\2\2\u01ad\u01ae\3\2"+
		"\2\2\u01ae\u01af\b;\2\2\u01afv\3\2\2\2\u01b0\u01b1\7\61\2\2\u01b1\u01b2"+
		"\7,\2\2\u01b2\u01b6\3\2\2\2\u01b3\u01b5\13\2\2\2\u01b4\u01b3\3\2\2\2\u01b5"+
		"\u01b8\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b9\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7,\2\2\u01ba\u01bb\7\61\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\b<\2\2\u01bdx\3\2\2\2\u01be\u01bf\7\61\2\2"+
		"\u01bf\u01c0\7,\2\2\u01c0\u01c1\7,\2\2\u01c1\u01c5\3\2\2\2\u01c2\u01c4"+
		"\13\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c6\3\2\2\2"+
		"\u01c5\u01c3\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9"+
		"\7,\2\2\u01c9\u01ca\7,\2\2\u01ca\u01cb\7\61\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01cd\b=\2\2\u01cdz\3\2\2\2\u01ce\u01cf\7\61\2\2\u01cf\u01d0\7,\2\2\u01d0"+
		"\u01d1\7,\2\2\u01d1\u01d2\7,\2\2\u01d2\u01d6\3\2\2\2\u01d3\u01d5\13\2"+
		"\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\7,"+
		"\2\2\u01da\u01db\7,\2\2\u01db\u01dc\7,\2\2\u01dc\u01dd\7\61\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01df\b>\2\2\u01df|\3\2\2\2\u01e0\u01e2\t\3\2\2\u01e1"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01eb\3\2\2\2\u01e5\u01e7\7\"\2\2\u01e6\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2"+
		"\2\2\u01ea\u01e1\3\2\2\2\u01ea\u01e6\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ed\b?\2\2\u01ed~\3\2\2\2\31\2\u0081\u00a9\u00b5\u00c1\u0160\u0166"+
		"\u0169\u016e\u0173\u0179\u017e\u018a\u0192\u0198\u019a\u01a9\u01b6\u01c5"+
		"\u01d6\u01e3\u01e8\u01ea\4\b\2\2\39\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}