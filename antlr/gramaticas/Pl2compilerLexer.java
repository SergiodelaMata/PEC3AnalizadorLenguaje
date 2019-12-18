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
		NEWLINE=49, ARRAY=50, BOOLEANO=51, ID=52, NOMBREPAQUETE=53, CADENA=54, 
		COMENTARIO_LINEA=55, COMENTARIO_LINEA2=56, COMENTARIO_BLOQUE=57, COMENTARIO_DOCUMENTACION=58, 
		WS=59;
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
			"PUERTALOGICAOR", "DIGITO", "FLOTANTE", "NEWLINE", "ARRAY", "BOOLEANO", 
			"ID", "NOMBREPAQUETE", "CADENA", "ESC", "COMENTARIO_LINEA", "COMENTARIO_LINEA2", 
			"COMENTARIO_BLOQUE", "COMENTARIO_DOCUMENTACION", "WS"
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
			"'<'", "'>'", "'=='", "'!='", null, null, null, null, null, null, "'booleano'"
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
			"PUERTALOGICAOR", "DIGITO", "FLOTANTE", "NEWLINE", "ARRAY", "BOOLEANO", 
			"ID", "NOMBREPAQUETE", "CADENA", "COMENTARIO_LINEA", "COMENTARIO_LINEA2", 
			"COMENTARIO_BLOQUE", "COMENTARIO_DOCUMENTACION", "WS"
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
		case 53:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\5\5\u0091\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u009d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a9\n\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\5.\u0148\n"+
		".\3/\3/\3/\3/\5/\u014e\n/\3\60\5\60\u0151\n\60\3\60\6\60\u0154\n\60\r"+
		"\60\16\60\u0155\3\61\6\61\u0159\n\61\r\61\16\61\u015a\3\61\3\61\6\61\u015f"+
		"\n\61\r\61\16\61\u0160\3\62\6\62\u0164\n\62\r\62\16\62\u0165\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\6\65\u0179\n\65\r\65\16\65\u017a\3\66\3\66\3\66\3\66\7\66\u0181"+
		"\n\66\f\66\16\66\u0184\13\66\3\67\3\67\3\67\7\67\u0189\n\67\f\67\16\67"+
		"\u018c\13\67\3\67\3\67\3\67\38\38\38\39\39\39\39\79\u0198\n9\f9\169\u019b"+
		"\139\39\39\39\39\3:\3:\3:\3:\7:\u01a5\n:\f:\16:\u01a8\13:\3:\3:\3:\3:"+
		"\3:\3;\3;\3;\3;\3;\7;\u01b4\n;\f;\16;\u01b7\13;\3;\3;\3;\3;\3;\3;\3<\3"+
		"<\3<\3<\3<\3<\7<\u01c5\n<\f<\16<\u01c8\13<\3<\3<\3<\3<\3<\3<\3<\3=\6="+
		"\u01d2\n=\r=\16=\u01d3\3=\6=\u01d7\n=\r=\16=\u01d8\5=\u01db\n=\3=\3=\7"+
		"\u018a\u0199\u01a6\u01b5\u01c6\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o\2q9s:u;w<y=\3\2\6\3\2\62;\4\2\13\f\17"+
		"\17\6\2\62;C\\aac|\b\2$$^^ddppttvv\2\u01f1\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5\u0080\3\2\2\2\7\u0086\3\2"+
		"\2\2\t\u0090\3\2\2\2\13\u009c\3\2\2\2\r\u00a8\3\2\2\2\17\u00aa\3\2\2\2"+
		"\21\u00ad\3\2\2\2\23\u00b2\3\2\2\2\25\u00b7\3\2\2\2\27\u00bd\3\2\2\2\31"+
		"\u00c3\3\2\2\2\33\u00c7\3\2\2\2\35\u00cf\3\2\2\2\37\u00d8\3\2\2\2!\u00dd"+
		"\3\2\2\2#\u00e4\3\2\2\2%\u00ea\3\2\2\2\'\u00ee\3\2\2\2)\u00f4\3\2\2\2"+
		"+\u00f9\3\2\2\2-\u00fe\3\2\2\2/\u0101\3\2\2\2\61\u0104\3\2\2\2\63\u010b"+
		"\3\2\2\2\65\u0114\3\2\2\2\67\u0119\3\2\2\29\u011b\3\2\2\2;\u011d\3\2\2"+
		"\2=\u011f\3\2\2\2?\u0121\3\2\2\2A\u0123\3\2\2\2C\u0125\3\2\2\2E\u0128"+
		"\3\2\2\2G\u012b\3\2\2\2I\u012d\3\2\2\2K\u012f\3\2\2\2M\u0131\3\2\2\2O"+
		"\u0133\3\2\2\2Q\u0136\3\2\2\2S\u0138\3\2\2\2U\u013a\3\2\2\2W\u013c\3\2"+
		"\2\2Y\u013f\3\2\2\2[\u0147\3\2\2\2]\u014d\3\2\2\2_\u0150\3\2\2\2a\u0158"+
		"\3\2\2\2c\u0163\3\2\2\2e\u0169\3\2\2\2g\u016e\3\2\2\2i\u0178\3\2\2\2k"+
		"\u017c\3\2\2\2m\u0185\3\2\2\2o\u0190\3\2\2\2q\u0193\3\2\2\2s\u01a0\3\2"+
		"\2\2u\u01ae\3\2\2\2w\u01be\3\2\2\2y\u01da\3\2\2\2{|\7e\2\2|}\7c\2\2}~"+
		"\7u\2\2~\177\7g\2\2\177\4\3\2\2\2\u0080\u0081\7d\2\2\u0081\u0082\7t\2"+
		"\2\u0082\u0083\7g\2\2\u0083\u0084\7c\2\2\u0084\u0085\7m\2\2\u0085\6\3"+
		"\2\2\2\u0086\u0087\7f\2\2\u0087\u0088\7g\2\2\u0088\u0089\7h\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7w\2\2\u008b\u008c\7n\2\2\u008c\u008d\7v\2\2"+
		"\u008d\b\3\2\2\2\u008e\u0091\5\13\6\2\u008f\u0091\5\r\7\2\u0090\u008e"+
		"\3\2\2\2\u0090\u008f\3\2\2\2\u0091\n\3\2\2\2\u0092\u0093\7h\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7n\2\2\u0095\u0096\7u\2\2\u0096\u009d\7g\2\2"+
		"\u0097\u0098\7#\2\2\u0098\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a\u009b"+
		"\7w\2\2\u009b\u009d\7g\2\2\u009c\u0092\3\2\2\2\u009c\u0097\3\2\2\2\u009d"+
		"\f\3\2\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7w\2\2\u00a1"+
		"\u00a9\7g\2\2\u00a2\u00a3\7#\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7c\2\2"+
		"\u00a5\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a9\7g\2\2\u00a8\u009e"+
		"\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a9\16\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab"+
		"\u00ac\7h\2\2\u00ac\20\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7n\2\2\u00af"+
		"\u00b0\7u\2\2\u00b0\u00b1\7g\2\2\u00b1\22\3\2\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7j\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7p\2\2\u00b6\24\3\2\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7k\2\2"+
		"\u00bb\u00bc\7h\2\2\u00bc\26\3\2\2\2\u00bd\u00be\7d\2\2\u00be\u00bf\7"+
		"g\2\2\u00bf\u00c0\7i\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\30"+
		"\3\2\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7f\2\2\u00c6"+
		"\32\3\2\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7e\2\2\u00ca"+
		"\u00cb\7n\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7g\2\2"+
		"\u00ce\34\3\2\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7"+
		"p\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6"+
		"\7q\2\2\u00d6\u00d7\7p\2\2\u00d7\36\3\2\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da"+
		"\7q\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7f\2\2\u00dc \3\2\2\2\u00dd\u00de"+
		"\7e\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7g\2\2\u00e1"+
		"\u00e2\7p\2\2\u00e2\u00e3\7c\2\2\u00e3\"\3\2\2\2\u00e4\u00e5\7y\2\2\u00e5"+
		"\u00e6\7j\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7g\2\2"+
		"\u00e9$\3\2\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7t\2"+
		"\2\u00ed&\3\2\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7"+
		"f\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7q\2\2\u00f3(\3\2\2\2\u00f4\u00f5"+
		"\7h\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7o\2\2\u00f8"+
		"*\3\2\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7g\2\2\u00fc"+
		"\u00fd\7r\2\2\u00fd,\3\2\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7q\2\2\u0100"+
		".\3\2\2\2\u0101\u0102\7f\2\2\u0102\u0103\7q\2\2\u0103\60\3\2\2\2\u0104"+
		"\u0105\7p\2\2\u0105\u0106\7w\2\2\u0106\u0107\7o\2\2\u0107\u0108\7g\2\2"+
		"\u0108\u0109\7t\2\2\u0109\u010a\7q\2\2\u010a\62\3\2\2\2\u010b\u010c\7"+
		"f\2\2\u010c\u010d\7g\2\2\u010d\u010e\7x\2\2\u010e\u010f\7q\2\2\u010f\u0110"+
		"\7n\2\2\u0110\u0111\7x\2\2\u0111\u0112\7g\2\2\u0112\u0113\7t\2\2\u0113"+
		"\64\3\2\2\2\u0114\u0115\7o\2\2\u0115\u0116\7c\2\2\u0116\u0117\7k\2\2\u0117"+
		"\u0118\7p\2\2\u0118\66\3\2\2\2\u0119\u011a\7=\2\2\u011a8\3\2\2\2\u011b"+
		"\u011c\7*\2\2\u011c:\3\2\2\2\u011d\u011e\7+\2\2\u011e<\3\2\2\2\u011f\u0120"+
		"\7<\2\2\u0120>\3\2\2\2\u0121\u0122\7\60\2\2\u0122@\3\2\2\2\u0123\u0124"+
		"\7.\2\2\u0124B\3\2\2\2\u0125\u0126\7-\2\2\u0126\u0127\7-\2\2\u0127D\3"+
		"\2\2\2\u0128\u0129\7/\2\2\u0129\u012a\7/\2\2\u012aF\3\2\2\2\u012b\u012c"+
		"\7-\2\2\u012cH\3\2\2\2\u012d\u012e\7/\2\2\u012eJ\3\2\2\2\u012f\u0130\7"+
		",\2\2\u0130L\3\2\2\2\u0131\u0132\7\61\2\2\u0132N\3\2\2\2\u0133\u0134\7"+
		"<\2\2\u0134\u0135\7?\2\2\u0135P\3\2\2\2\u0136\u0137\7\'\2\2\u0137R\3\2"+
		"\2\2\u0138\u0139\7>\2\2\u0139T\3\2\2\2\u013a\u013b\7@\2\2\u013bV\3\2\2"+
		"\2\u013c\u013d\7?\2\2\u013d\u013e\7?\2\2\u013eX\3\2\2\2\u013f\u0140\7"+
		"#\2\2\u0140\u0141\7?\2\2\u0141Z\3\2\2\2\u0142\u0143\7c\2\2\u0143\u0144"+
		"\7p\2\2\u0144\u0148\7f\2\2\u0145\u0146\7(\2\2\u0146\u0148\7(\2\2\u0147"+
		"\u0142\3\2\2\2\u0147\u0145\3\2\2\2\u0148\\\3\2\2\2\u0149\u014a\7q\2\2"+
		"\u014a\u014e\7t\2\2\u014b\u014c\7~\2\2\u014c\u014e\7~\2\2\u014d\u0149"+
		"\3\2\2\2\u014d\u014b\3\2\2\2\u014e^\3\2\2\2\u014f\u0151\7/\2\2\u0150\u014f"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0154\t\2\2\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156`\3\2\2\2\u0157\u0159\5_\60\2\u0158\u0157\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015e\5? \2\u015d\u015f\5_\60\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2"+
		"\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161b\3\2\2\2\u0162\u0164"+
		"\t\3\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\b\62\2\2\u0168d\3\2\2\2"+
		"\u0169\u016a\5i\65\2\u016a\u016b\7]\2\2\u016b\u016c\5_\60\2\u016c\u016d"+
		"\7_\2\2\u016df\3\2\2\2\u016e\u016f\7d\2\2\u016f\u0170\7q\2\2\u0170\u0171"+
		"\7q\2\2\u0171\u0172\7n\2\2\u0172\u0173\7g\2\2\u0173\u0174\7c\2\2\u0174"+
		"\u0175\7p\2\2\u0175\u0176\7q\2\2\u0176h\3\2\2\2\u0177\u0179\t\4\2\2\u0178"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017bj\3\2\2\2\u017c\u0182\5i\65\2\u017d\u017e\5? \2\u017e\u017f"+
		"\5i\65\2\u017f\u0181\3\2\2\2\u0180\u017d\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183l\3\2\2\2\u0184\u0182\3\2\2\2"+
		"\u0185\u018a\7$\2\2\u0186\u0189\5o8\2\u0187\u0189\13\2\2\2\u0188\u0186"+
		"\3\2\2\2\u0188\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u018b\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7$"+
		"\2\2\u018e\u018f\b\67\3\2\u018fn\3\2\2\2\u0190\u0191\7^\2\2\u0191\u0192"+
		"\t\5\2\2\u0192p\3\2\2\2\u0193\u0194\7\61\2\2\u0194\u0195\7\61\2\2\u0195"+
		"\u0199\3\2\2\2\u0196\u0198\13\2\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3"+
		"\2\2\2\u0199\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019c\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019d\7\f\2\2\u019d\u019e\3\2\2\2\u019e\u019f\b9"+
		"\2\2\u019fr\3\2\2\2\u01a0\u01a1\7\61\2\2\u01a1\u01a2\7,\2\2\u01a2\u01a6"+
		"\3\2\2\2\u01a3\u01a5\13\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2"+
		"\u01a6\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a9\u01aa\7,\2\2\u01aa\u01ab\7\61\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\b:\2\2\u01adt\3\2\2\2\u01ae\u01af\7\61\2\2\u01af\u01b0\7,\2\2\u01b0"+
		"\u01b1\7,\2\2\u01b1\u01b5\3\2\2\2\u01b2\u01b4\13\2\2\2\u01b3\u01b2\3\2"+
		"\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7,\2\2\u01b9\u01ba\7,\2"+
		"\2\u01ba\u01bb\7\61\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\b;\2\2\u01bdv"+
		"\3\2\2\2\u01be\u01bf\7\61\2\2\u01bf\u01c0\7,\2\2\u01c0\u01c1\7,\2\2\u01c1"+
		"\u01c2\7,\2\2\u01c2\u01c6\3\2\2\2\u01c3\u01c5\13\2\2\2\u01c4\u01c3\3\2"+
		"\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7,\2\2\u01ca\u01cb\7,\2"+
		"\2\u01cb\u01cc\7,\2\2\u01cc\u01cd\7\61\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf"+
		"\b<\2\2\u01cfx\3\2\2\2\u01d0\u01d2\t\3\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01db\3\2\2\2\u01d5"+
		"\u01d7\7\"\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01d1\3\2\2\2\u01da"+
		"\u01d6\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\b=\2\2\u01ddz\3\2\2\2\30"+
		"\2\u0090\u009c\u00a8\u0147\u014d\u0150\u0155\u015a\u0160\u0165\u017a\u0182"+
		"\u0188\u018a\u0199\u01a6\u01b5\u01c6\u01d3\u01d8\u01da\4\b\2\2\3\67\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}