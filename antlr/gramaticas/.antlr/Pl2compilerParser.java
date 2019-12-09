// Generated from c:\Users\nuria\OneDrive - Universidad de Alcala\Documentos\github\PEC3AnalizadorLenguaje\antlr\gramaticas\Pl2compilerParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Pl2compilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_prog = 0, RULE_libreria = 1, RULE_asignacion = 2, RULE_variable = 3, 
		RULE_condicion = 4, RULE_operacionswitch = 5, RULE_cabeceraswitch = 6, 
		RULE_cuerposwitch = 7, RULE_condicionales = 8, RULE_funcionwhile = 9, 
		RULE_funcionfor = 10, RULE_cuerpo = 11, RULE_cuerpo2 = 12, RULE_cuerpo3 = 13, 
		RULE_llamarfuncion = 14, RULE_codigo = 15, RULE_crearfuncion = 16, RULE_devolver = 17, 
		RULE_retorno = 18, RULE_cabecerafuncion = 19, RULE_expr = 20, RULE_expresionlogica = 21, 
		RULE_nombrefuncion = 22, RULE_nombrevariable = 23, RULE_nombrepaquete = 24, 
		RULE_operadorasignacion = 25, RULE_parametros = 26, RULE_parametro = 27, 
		RULE_operadoraritmeticoproducto = 28, RULE_operadoraritmeticodivision = 29, 
		RULE_operadoraritmeticosuma = 30, RULE_operadoraritmeticoresta = 31, RULE_operadoraritmeticosuma1 = 32, 
		RULE_operadoraritmeticoresta1 = 33, RULE_operadorlogico = 34, RULE_operadorcondicionalpuertalogica = 35, 
		RULE_cadena = 36, RULE_separadoroperaciones = 37, RULE_separadoroperadores = 38, 
		RULE_separadordospuntos = 39, RULE_operadoraperturaparentesis = 40, RULE_operadorcierreparentesis = 41, 
		RULE_tipovariable = 42, RULE_comentarios = 43, RULE_entero = 44, RULE_flotante = 45, 
		RULE_numeros = 46, RULE_palabraclavebooleano = 47, RULE_palabraclavebuclefor = 48, 
		RULE_palabraclaveendbuclefor = 49, RULE_palabraclaveinciovalorfor = 50, 
		RULE_palabraclavesaltoelementofor = 51, RULE_palabraclavefinvalorfor = 52, 
		RULE_palabraclavehacerfor = 53, RULE_palabraclavebuclewhile = 54, RULE_palabrareservadaaperturaswitch = 55, 
		RULE_palabrareservadacierrewitch = 56, RULE_palabrareservadacase = 57, 
		RULE_palabrareservadabreak = 58, RULE_palabrareservadadefault = 59, RULE_palabraclavecondiciones = 60, 
		RULE_palabraclavethen = 61, RULE_palabraclaveendif = 62, RULE_palabraclaveincluirlibreria = 63, 
		RULE_palabraclavecreacionfuncion = 64, RULE_palabraclavefuncionmain = 65, 
		RULE_palabraclavefunciondevolver = 66, RULE_palabraclaveinicio = 67, RULE_palabraclavefin = 68;
	public static final String[] ruleNames = {
		"prog", "libreria", "asignacion", "variable", "condicion", "operacionswitch", 
		"cabeceraswitch", "cuerposwitch", "condicionales", "funcionwhile", "funcionfor", 
		"cuerpo", "cuerpo2", "cuerpo3", "llamarfuncion", "codigo", "crearfuncion", 
		"devolver", "retorno", "cabecerafuncion", "expr", "expresionlogica", "nombrefuncion", 
		"nombrevariable", "nombrepaquete", "operadorasignacion", "parametros", 
		"parametro", "operadoraritmeticoproducto", "operadoraritmeticodivision", 
		"operadoraritmeticosuma", "operadoraritmeticoresta", "operadoraritmeticosuma1", 
		"operadoraritmeticoresta1", "operadorlogico", "operadorcondicionalpuertalogica", 
		"cadena", "separadoroperaciones", "separadoroperadores", "separadordospuntos", 
		"operadoraperturaparentesis", "operadorcierreparentesis", "tipovariable", 
		"comentarios", "entero", "flotante", "numeros", "palabraclavebooleano", 
		"palabraclavebuclefor", "palabraclaveendbuclefor", "palabraclaveinciovalorfor", 
		"palabraclavesaltoelementofor", "palabraclavefinvalorfor", "palabraclavehacerfor", 
		"palabraclavebuclewhile", "palabrareservadaaperturaswitch", "palabrareservadacierrewitch", 
		"palabrareservadacase", "palabrareservadabreak", "palabrareservadadefault", 
		"palabraclavecondiciones", "palabraclavethen", "palabraclaveendif", "palabraclaveincluirlibreria", 
		"palabraclavecreacionfuncion", "palabraclavefuncionmain", "palabraclavefunciondevolver", 
		"palabraclaveinicio", "palabraclavefin"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'switch'", "'endswitch'", "'case'", "'break'", "'default'", 
		null, null, null, "'if'", "'else'", "'then'", "'endif'", "'begin'", "'end'", 
		"'include'", "'function'", "'void'", "'cadena'", "'while'", "'for'", "'enddo'", 
		"'from'", "'step'", "'to'", "'do'", "'numero'", "'devolver'", "'main'", 
		"';'", "'('", "')'", "':'", "'.'", "','", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "':='", "'%'", "'<'", "'>'", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
	public String getGrammarFileName() { return "Pl2compilerParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Pl2compilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<LibreriaContext> libreria() {
			return getRuleContexts(LibreriaContext.class);
		}
		public LibreriaContext libreria(int i) {
			return getRuleContext(LibreriaContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<CrearfuncionContext> crearfuncion() {
			return getRuleContexts(CrearfuncionContext.class);
		}
		public CrearfuncionContext crearfuncion(int i) {
			return getRuleContext(CrearfuncionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(138);
					libreria();
					}
					break;
				case 2:
					{
					setState(139);
					expr(0);
					}
					break;
				case 3:
					{
					setState(140);
					asignacion();
					}
					break;
				case 4:
					{
					setState(141);
					crearfuncion();
					}
					break;
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << INCLUDE) | (1L << FUNCTION) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << PL) | (1L << DIGITO) | (1L << FLOTANTE) | (1L << ARRAY) | (1L << ID) | (1L << CADENA))) != 0) );
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

	public static class LibreriaContext extends ParserRuleContext {
		public List<PalabraclaveincluirlibreriaContext> palabraclaveincluirlibreria() {
			return getRuleContexts(PalabraclaveincluirlibreriaContext.class);
		}
		public PalabraclaveincluirlibreriaContext palabraclaveincluirlibreria(int i) {
			return getRuleContext(PalabraclaveincluirlibreriaContext.class,i);
		}
		public List<NombrepaqueteContext> nombrepaquete() {
			return getRuleContexts(NombrepaqueteContext.class);
		}
		public NombrepaqueteContext nombrepaquete(int i) {
			return getRuleContext(NombrepaqueteContext.class,i);
		}
		public List<SeparadoroperacionesContext> separadoroperaciones() {
			return getRuleContexts(SeparadoroperacionesContext.class);
		}
		public SeparadoroperacionesContext separadoroperaciones(int i) {
			return getRuleContext(SeparadoroperacionesContext.class,i);
		}
		public LibreriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libreria; }
	}

	public final LibreriaContext libreria() throws RecognitionException {
		LibreriaContext _localctx = new LibreriaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_libreria);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(146);
					palabraclaveincluirlibreria();
					setState(147);
					nombrepaquete();
					setState(148);
					separadoroperaciones();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(152); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AsignacionContext extends ParserRuleContext {
		public SeparadoroperacionesContext separadoroperaciones() {
			return getRuleContext(SeparadoroperacionesContext.class,0);
		}
		public List<NombrevariableContext> nombrevariable() {
			return getRuleContexts(NombrevariableContext.class);
		}
		public NombrevariableContext nombrevariable(int i) {
			return getRuleContext(NombrevariableContext.class,i);
		}
		public TipovariableContext tipovariable() {
			return getRuleContext(TipovariableContext.class,0);
		}
		public OperadorasignacionContext operadorasignacion() {
			return getRuleContext(OperadorasignacionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SeparadoroperadoresContext> separadoroperadores() {
			return getRuleContexts(SeparadoroperadoresContext.class);
		}
		public SeparadoroperadoresContext separadoroperadores(int i) {
			return getRuleContext(SeparadoroperadoresContext.class,i);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asignacion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << STRING) | (1L << NUMERO))) != 0)) {
					{
					setState(154);
					tipovariable();
					}
				}

				setState(157);
				nombrevariable();
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(158);
					operadorasignacion();
					setState(159);
					expr(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(163);
				tipovariable();
				setState(164);
				nombrevariable();
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(165);
						separadoroperadores();
						setState(166);
						nombrevariable();
						}
						} 
					}
					setState(172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				}
				break;
			}
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(175);
				separadoroperaciones();
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

	public static class VariableContext extends ParserRuleContext {
		public NombrevariableContext nombrevariable() {
			return getRuleContext(NombrevariableContext.class,0);
		}
		public OperadorasignacionContext operadorasignacion() {
			return getRuleContext(OperadorasignacionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TipovariableContext tipovariable() {
			return getRuleContext(TipovariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << STRING) | (1L << NUMERO))) != 0)) {
				{
				setState(178);
				tipovariable();
				}
			}

			setState(181);
			nombrevariable();
			setState(182);
			operadorasignacion();
			setState(183);
			expr(0);
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

	public static class CondicionContext extends ParserRuleContext {
		public OperadoraperturaparentesisContext operadoraperturaparentesis() {
			return getRuleContext(OperadoraperturaparentesisContext.class,0);
		}
		public ExpresionlogicaContext expresionlogica() {
			return getRuleContext(ExpresionlogicaContext.class,0);
		}
		public OperadorcierreparentesisContext operadorcierreparentesis() {
			return getRuleContext(OperadorcierreparentesisContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			operadoraperturaparentesis();
			setState(186);
			expresionlogica();
			setState(187);
			operadorcierreparentesis();
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

	public static class OperacionswitchContext extends ParserRuleContext {
		public CabeceraswitchContext cabeceraswitch() {
			return getRuleContext(CabeceraswitchContext.class,0);
		}
		public CuerposwitchContext cuerposwitch() {
			return getRuleContext(CuerposwitchContext.class,0);
		}
		public OperacionswitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionswitch; }
	}

	public final OperacionswitchContext operacionswitch() throws RecognitionException {
		OperacionswitchContext _localctx = new OperacionswitchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operacionswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			cabeceraswitch();
			setState(190);
			cuerposwitch();
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

	public static class CabeceraswitchContext extends ParserRuleContext {
		public PalabrareservadaaperturaswitchContext palabrareservadaaperturaswitch() {
			return getRuleContext(PalabrareservadaaperturaswitchContext.class,0);
		}
		public OperadoraperturaparentesisContext operadoraperturaparentesis() {
			return getRuleContext(OperadoraperturaparentesisContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OperadorcierreparentesisContext operadorcierreparentesis() {
			return getRuleContext(OperadorcierreparentesisContext.class,0);
		}
		public CabeceraswitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabeceraswitch; }
	}

	public final CabeceraswitchContext cabeceraswitch() throws RecognitionException {
		CabeceraswitchContext _localctx = new CabeceraswitchContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cabeceraswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			palabrareservadaaperturaswitch();
			setState(193);
			operadoraperturaparentesis();
			setState(194);
			expr(0);
			setState(195);
			operadorcierreparentesis();
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

	public static class CuerposwitchContext extends ParserRuleContext {
		public PalabrareservadacierrewitchContext palabrareservadacierrewitch() {
			return getRuleContext(PalabrareservadacierrewitchContext.class,0);
		}
		public PalabrareservadadefaultContext palabrareservadadefault() {
			return getRuleContext(PalabrareservadadefaultContext.class,0);
		}
		public List<SeparadordospuntosContext> separadordospuntos() {
			return getRuleContexts(SeparadordospuntosContext.class);
		}
		public SeparadordospuntosContext separadordospuntos(int i) {
			return getRuleContext(SeparadordospuntosContext.class,i);
		}
		public List<PalabrareservadacaseContext> palabrareservadacase() {
			return getRuleContexts(PalabrareservadacaseContext.class);
		}
		public PalabrareservadacaseContext palabrareservadacase(int i) {
			return getRuleContext(PalabrareservadacaseContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Cuerpo3Context> cuerpo3() {
			return getRuleContexts(Cuerpo3Context.class);
		}
		public Cuerpo3Context cuerpo3(int i) {
			return getRuleContext(Cuerpo3Context.class,i);
		}
		public List<CuerpoContext> cuerpo() {
			return getRuleContexts(CuerpoContext.class);
		}
		public CuerpoContext cuerpo(int i) {
			return getRuleContext(CuerpoContext.class,i);
		}
		public List<PalabrareservadabreakContext> palabrareservadabreak() {
			return getRuleContexts(PalabrareservadabreakContext.class);
		}
		public PalabrareservadabreakContext palabrareservadabreak(int i) {
			return getRuleContext(PalabrareservadabreakContext.class,i);
		}
		public List<SeparadoroperacionesContext> separadoroperaciones() {
			return getRuleContexts(SeparadoroperacionesContext.class);
		}
		public SeparadoroperacionesContext separadoroperaciones(int i) {
			return getRuleContext(SeparadoroperacionesContext.class,i);
		}
		public CuerposwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerposwitch; }
	}

	public final CuerposwitchContext cuerposwitch() throws RecognitionException {
		CuerposwitchContext _localctx = new CuerposwitchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cuerposwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				palabrareservadacase();
				setState(198);
				expr(0);
				setState(199);
				separadordospuntos();
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(200);
					cuerpo3();
					}
					break;
				case 2:
					{
					setState(201);
					cuerpo();
					}
					break;
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(204);
					palabrareservadabreak();
					setState(205);
					separadoroperaciones();
					}
				}

				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			{
			setState(213);
			palabrareservadadefault();
			setState(214);
			separadordospuntos();
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(215);
				cuerpo3();
				}
				break;
			case 2:
				{
				setState(216);
				cuerpo();
				}
				break;
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(219);
				palabrareservadabreak();
				setState(220);
				separadoroperaciones();
				}
			}

			}
			setState(224);
			palabrareservadacierrewitch();
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

	public static class CondicionalesContext extends ParserRuleContext {
		public PalabraclavecondicionesContext palabraclavecondiciones() {
			return getRuleContext(PalabraclavecondicionesContext.class,0);
		}
		public Cuerpo3Context cuerpo3() {
			return getRuleContext(Cuerpo3Context.class,0);
		}
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public PalabraclavethenContext palabraclavethen() {
			return getRuleContext(PalabraclavethenContext.class,0);
		}
		public PalabraclaveendifContext palabraclaveendif() {
			return getRuleContext(PalabraclaveendifContext.class,0);
		}
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<OperadorcondicionalpuertalogicaContext> operadorcondicionalpuertalogica() {
			return getRuleContexts(OperadorcondicionalpuertalogicaContext.class);
		}
		public OperadorcondicionalpuertalogicaContext operadorcondicionalpuertalogica(int i) {
			return getRuleContext(OperadorcondicionalpuertalogicaContext.class,i);
		}
		public CondicionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionales; }
	}

	public final CondicionalesContext condicionales() throws RecognitionException {
		CondicionalesContext _localctx = new CondicionalesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicionales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			palabraclavecondiciones();
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(227);
				condicion();
				}
				}
				break;
			case 2:
				{
				{
				setState(228);
				condicion();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUERTALOGICAAND || _la==PUERTALOGICAOR) {
					{
					{
					setState(229);
					operadorcondicionalpuertalogica();
					setState(230);
					condicion();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(239);
				palabraclavethen();
				}
			}

			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(242);
				cuerpo3();
				}
				break;
			case 2:
				{
				setState(243);
				cuerpo();
				}
				break;
			}
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(246);
				palabraclaveendif();
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

	public static class FuncionwhileContext extends ParserRuleContext {
		public PalabraclavebuclewhileContext palabraclavebuclewhile() {
			return getRuleContext(PalabraclavebuclewhileContext.class,0);
		}
		public OperadoraperturaparentesisContext operadoraperturaparentesis() {
			return getRuleContext(OperadoraperturaparentesisContext.class,0);
		}
		public OperadorcierreparentesisContext operadorcierreparentesis() {
			return getRuleContext(OperadorcierreparentesisContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpresionlogicaContext expresionlogica() {
			return getRuleContext(ExpresionlogicaContext.class,0);
		}
		public Cuerpo3Context cuerpo3() {
			return getRuleContext(Cuerpo3Context.class,0);
		}
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public FuncionwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionwhile; }
	}

	public final FuncionwhileContext funcionwhile() throws RecognitionException {
		FuncionwhileContext _localctx = new FuncionwhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcionwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			palabraclavebuclewhile();
			setState(250);
			operadoraperturaparentesis();
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(251);
				expr(0);
				}
				break;
			case 2:
				{
				setState(252);
				expresionlogica();
				}
				break;
			}
			setState(255);
			operadorcierreparentesis();
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(256);
				cuerpo3();
				}
				break;
			case 2:
				{
				setState(257);
				cuerpo();
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

	public static class FuncionforContext extends ParserRuleContext {
		public PalabraclavebucleforContext palabraclavebuclefor() {
			return getRuleContext(PalabraclavebucleforContext.class,0);
		}
		public List<NombrevariableContext> nombrevariable() {
			return getRuleContexts(NombrevariableContext.class);
		}
		public NombrevariableContext nombrevariable(int i) {
			return getRuleContext(NombrevariableContext.class,i);
		}
		public PalabraclaveinciovalorforContext palabraclaveinciovalorfor() {
			return getRuleContext(PalabraclaveinciovalorforContext.class,0);
		}
		public PalabraclavefinvalorforContext palabraclavefinvalorfor() {
			return getRuleContext(PalabraclavefinvalorforContext.class,0);
		}
		public PalabraclavehacerforContext palabraclavehacerfor() {
			return getRuleContext(PalabraclavehacerforContext.class,0);
		}
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public PalabraclaveendbucleforContext palabraclaveendbuclefor() {
			return getRuleContext(PalabraclaveendbucleforContext.class,0);
		}
		public List<NumerosContext> numeros() {
			return getRuleContexts(NumerosContext.class);
		}
		public NumerosContext numeros(int i) {
			return getRuleContext(NumerosContext.class,i);
		}
		public PalabraclavesaltoelementoforContext palabraclavesaltoelementofor() {
			return getRuleContext(PalabraclavesaltoelementoforContext.class,0);
		}
		public FuncionforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionfor; }
	}

	public final FuncionforContext funcionfor() throws RecognitionException {
		FuncionforContext _localctx = new FuncionforContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcionfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			palabraclavebuclefor();
			setState(261);
			nombrevariable();
			setState(262);
			palabraclaveinciovalorfor();
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case ARRAY:
			case ID:
				{
				setState(263);
				nombrevariable();
				}
				break;
			case DIGITO:
			case FLOTANTE:
				{
				setState(264);
				numeros();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(267);
			palabraclavefinvalorfor();
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case ARRAY:
			case ID:
				{
				setState(268);
				nombrevariable();
				}
				break;
			case DIGITO:
			case FLOTANTE:
				{
				setState(269);
				numeros();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(272);
				palabraclavesaltoelementofor();
				setState(275);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
				case ARRAY:
				case ID:
					{
					setState(273);
					nombrevariable();
					}
					break;
				case DIGITO:
				case FLOTANTE:
					{
					setState(274);
					numeros();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(279);
			palabraclavehacerfor();
			setState(280);
			cuerpo();
			setState(281);
			palabraclaveendbuclefor();
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

	public static class CuerpoContext extends ParserRuleContext {
		public List<PalabraclaveinicioContext> palabraclaveinicio() {
			return getRuleContexts(PalabraclaveinicioContext.class);
		}
		public PalabraclaveinicioContext palabraclaveinicio(int i) {
			return getRuleContext(PalabraclaveinicioContext.class,i);
		}
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public List<PalabraclavefinContext> palabraclavefin() {
			return getRuleContexts(PalabraclavefinContext.class);
		}
		public PalabraclavefinContext palabraclavefin(int i) {
			return getRuleContext(PalabraclavefinContext.class,i);
		}
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cuerpo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(283);
							palabraclaveinicio();
							}
							} 
						}
						setState(288);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					}
					setState(290); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(289);
							codigo();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(292); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(297);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(294);
							palabraclavefin();
							}
							} 
						}
						setState(299);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(302); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Cuerpo2Context extends ParserRuleContext {
		public List<PalabraclaveinicioContext> palabraclaveinicio() {
			return getRuleContexts(PalabraclaveinicioContext.class);
		}
		public PalabraclaveinicioContext palabraclaveinicio(int i) {
			return getRuleContext(PalabraclaveinicioContext.class,i);
		}
		public List<PalabraclavefinContext> palabraclavefin() {
			return getRuleContexts(PalabraclavefinContext.class);
		}
		public PalabraclavefinContext palabraclavefin(int i) {
			return getRuleContext(PalabraclavefinContext.class,i);
		}
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public Cuerpo2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo2; }
	}

	public final Cuerpo2Context cuerpo2() throws RecognitionException {
		Cuerpo2Context _localctx = new Cuerpo2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_cuerpo2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(304);
					palabraclaveinicio();
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << BEGIN) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << DEVOLVER) | (1L << ARRAY) | (1L << ID))) != 0)) {
						{
						{
						setState(305);
						codigo();
						}
						}
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(311);
					palabraclavefin();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(315); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Cuerpo3Context extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public LlamarfuncionContext llamarfuncion() {
			return getRuleContext(LlamarfuncionContext.class,0);
		}
		public PalabraclaveinicioContext palabraclaveinicio() {
			return getRuleContext(PalabraclaveinicioContext.class,0);
		}
		public PalabraclavefinContext palabraclavefin() {
			return getRuleContext(PalabraclavefinContext.class,0);
		}
		public Cuerpo3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo3; }
	}

	public final Cuerpo3Context cuerpo3() throws RecognitionException {
		Cuerpo3Context _localctx = new Cuerpo3Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_cuerpo3);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONDICIONES:
			case SWITCH:
			case CASE:
			case VOID:
			case STRING:
			case WHILE:
			case FOR:
			case NUMERO:
			case ARRAY:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(317);
					asignacion();
					}
					break;
				case 2:
					{
					setState(318);
					llamarfuncion();
					}
					break;
				}
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(321);
				palabraclaveinicio();
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(322);
					asignacion();
					}
					break;
				case 2:
					{
					setState(323);
					llamarfuncion();
					}
					break;
				}
				setState(326);
				palabraclavefin();
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

	public static class LlamarfuncionContext extends ParserRuleContext {
		public FuncionforContext funcionfor() {
			return getRuleContext(FuncionforContext.class,0);
		}
		public FuncionwhileContext funcionwhile() {
			return getRuleContext(FuncionwhileContext.class,0);
		}
		public CondicionalesContext condicionales() {
			return getRuleContext(CondicionalesContext.class,0);
		}
		public OperacionswitchContext operacionswitch() {
			return getRuleContext(OperacionswitchContext.class,0);
		}
		public NombrefuncionContext nombrefuncion() {
			return getRuleContext(NombrefuncionContext.class,0);
		}
		public OperadoraperturaparentesisContext operadoraperturaparentesis() {
			return getRuleContext(OperadoraperturaparentesisContext.class,0);
		}
		public OperadorcierreparentesisContext operadorcierreparentesis() {
			return getRuleContext(OperadorcierreparentesisContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public SeparadoroperacionesContext separadoroperaciones() {
			return getRuleContext(SeparadoroperacionesContext.class,0);
		}
		public LlamarfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamarfuncion; }
	}

	public final LlamarfuncionContext llamarfuncion() throws RecognitionException {
		LlamarfuncionContext _localctx = new LlamarfuncionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_llamarfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(330);
				nombrefuncion();
				setState(331);
				operadoraperturaparentesis();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << PL) | (1L << DIGITO) | (1L << FLOTANTE) | (1L << ARRAY) | (1L << ID) | (1L << CADENA))) != 0)) {
					{
					setState(332);
					parametros();
					}
				}

				setState(335);
				operadorcierreparentesis();
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(336);
					separadoroperaciones();
					}
					break;
				}
				}
				}
				break;
			case FOR:
				{
				setState(339);
				funcionfor();
				}
				break;
			case WHILE:
				{
				setState(340);
				funcionwhile();
				}
				break;
			case CONDICIONES:
				{
				setState(341);
				condicionales();
				}
				break;
			case SWITCH:
				{
				setState(342);
				operacionswitch();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CodigoContext extends ParserRuleContext {
		public List<FuncionwhileContext> funcionwhile() {
			return getRuleContexts(FuncionwhileContext.class);
		}
		public FuncionwhileContext funcionwhile(int i) {
			return getRuleContext(FuncionwhileContext.class,i);
		}
		public List<FuncionforContext> funcionfor() {
			return getRuleContexts(FuncionforContext.class);
		}
		public FuncionforContext funcionfor(int i) {
			return getRuleContext(FuncionforContext.class,i);
		}
		public List<OperacionswitchContext> operacionswitch() {
			return getRuleContexts(OperacionswitchContext.class);
		}
		public OperacionswitchContext operacionswitch(int i) {
			return getRuleContext(OperacionswitchContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<LlamarfuncionContext> llamarfuncion() {
			return getRuleContexts(LlamarfuncionContext.class);
		}
		public LlamarfuncionContext llamarfuncion(int i) {
			return getRuleContext(LlamarfuncionContext.class,i);
		}
		public List<DevolverContext> devolver() {
			return getRuleContexts(DevolverContext.class);
		}
		public DevolverContext devolver(int i) {
			return getRuleContext(DevolverContext.class,i);
		}
		public List<Cuerpo2Context> cuerpo2() {
			return getRuleContexts(Cuerpo2Context.class);
		}
		public Cuerpo2Context cuerpo2(int i) {
			return getRuleContext(Cuerpo2Context.class,i);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_codigo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(352);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(345);
						funcionwhile();
						}
						break;
					case 2:
						{
						setState(346);
						funcionfor();
						}
						break;
					case 3:
						{
						setState(347);
						operacionswitch();
						}
						break;
					case 4:
						{
						setState(348);
						asignacion();
						}
						break;
					case 5:
						{
						setState(349);
						llamarfuncion();
						}
						break;
					case 6:
						{
						setState(350);
						devolver();
						}
						break;
					case 7:
						{
						setState(351);
						cuerpo2();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(354); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CrearfuncionContext extends ParserRuleContext {
		public CabecerafuncionContext cabecerafuncion() {
			return getRuleContext(CabecerafuncionContext.class,0);
		}
		public Cuerpo3Context cuerpo3() {
			return getRuleContext(Cuerpo3Context.class,0);
		}
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public CrearfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearfuncion; }
	}

	public final CrearfuncionContext crearfuncion() throws RecognitionException {
		CrearfuncionContext _localctx = new CrearfuncionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_crearfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			cabecerafuncion();
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(357);
				cuerpo3();
				}
				break;
			case 2:
				{
				setState(358);
				cuerpo();
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

	public static class DevolverContext extends ParserRuleContext {
		public PalabraclavefunciondevolverContext palabraclavefunciondevolver() {
			return getRuleContext(PalabraclavefunciondevolverContext.class,0);
		}
		public OperadoraperturaparentesisContext operadoraperturaparentesis() {
			return getRuleContext(OperadoraperturaparentesisContext.class,0);
		}
		public OperadorcierreparentesisContext operadorcierreparentesis() {
			return getRuleContext(OperadorcierreparentesisContext.class,0);
		}
		public SeparadoroperacionesContext separadoroperaciones() {
			return getRuleContext(SeparadoroperacionesContext.class,0);
		}
		public LlamarfuncionContext llamarfuncion() {
			return getRuleContext(LlamarfuncionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DevolverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_devolver; }
	}

	public final DevolverContext devolver() throws RecognitionException {
		DevolverContext _localctx = new DevolverContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_devolver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			palabraclavefunciondevolver();
			setState(362);
			operadoraperturaparentesis();
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(363);
				llamarfuncion();
				}
				break;
			case 2:
				{
				setState(364);
				expr(0);
				}
				break;
			}
			setState(367);
			operadorcierreparentesis();
			setState(368);
			separadoroperaciones();
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

	public static class RetornoContext extends ParserRuleContext {
		public TipovariableContext tipovariable() {
			return getRuleContext(TipovariableContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			tipovariable();
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

	public static class CabecerafuncionContext extends ParserRuleContext {
		public PalabraclavecreacionfuncionContext palabraclavecreacionfuncion() {
			return getRuleContext(PalabraclavecreacionfuncionContext.class,0);
		}
		public OperadoraperturaparentesisContext operadoraperturaparentesis() {
			return getRuleContext(OperadoraperturaparentesisContext.class,0);
		}
		public OperadorcierreparentesisContext operadorcierreparentesis() {
			return getRuleContext(OperadorcierreparentesisContext.class,0);
		}
		public SeparadordospuntosContext separadordospuntos() {
			return getRuleContext(SeparadordospuntosContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public NombrefuncionContext nombrefuncion() {
			return getRuleContext(NombrefuncionContext.class,0);
		}
		public PalabraclavefuncionmainContext palabraclavefuncionmain() {
			return getRuleContext(PalabraclavefuncionmainContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public CabecerafuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecerafuncion; }
	}

	public final CabecerafuncionContext cabecerafuncion() throws RecognitionException {
		CabecerafuncionContext _localctx = new CabecerafuncionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cabecerafuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			palabraclavecreacionfuncion();
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(373);
				nombrefuncion();
				}
				break;
			case MAIN:
				{
				setState(374);
				palabraclavefuncionmain();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(377);
			operadoraperturaparentesis();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << PL) | (1L << DIGITO) | (1L << FLOTANTE) | (1L << ARRAY) | (1L << ID) | (1L << CADENA))) != 0)) {
				{
				setState(378);
				parametros();
				}
			}

			setState(381);
			operadorcierreparentesis();
			setState(382);
			separadordospuntos();
			setState(383);
			retorno();
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

	public static class ExprContext extends ParserRuleContext {
		public LlamarfuncionContext llamarfuncion() {
			return getRuleContext(LlamarfuncionContext.class,0);
		}
		public List<NumerosContext> numeros() {
			return getRuleContexts(NumerosContext.class);
		}
		public NumerosContext numeros(int i) {
			return getRuleContext(NumerosContext.class,i);
		}
		public List<NombrevariableContext> nombrevariable() {
			return getRuleContexts(NombrevariableContext.class);
		}
		public NombrevariableContext nombrevariable(int i) {
			return getRuleContext(NombrevariableContext.class,i);
		}
		public OperadoraperturaparentesisContext operadoraperturaparentesis() {
			return getRuleContext(OperadoraperturaparentesisContext.class,0);
		}
		public OperadorcierreparentesisContext operadorcierreparentesis() {
			return getRuleContext(OperadorcierreparentesisContext.class,0);
		}
		public List<SeparadoroperadoresContext> separadoroperadores() {
			return getRuleContexts(SeparadoroperadoresContext.class);
		}
		public SeparadoroperadoresContext separadoroperadores(int i) {
			return getRuleContext(SeparadoroperadoresContext.class,i);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public List<OperadoraritmeticosumaContext> operadoraritmeticosuma() {
			return getRuleContexts(OperadoraritmeticosumaContext.class);
		}
		public OperadoraritmeticosumaContext operadoraritmeticosuma(int i) {
			return getRuleContext(OperadoraritmeticosumaContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperadoraritmeticoproductoContext operadoraritmeticoproducto() {
			return getRuleContext(OperadoraritmeticoproductoContext.class,0);
		}
		public OperadoraritmeticodivisionContext operadoraritmeticodivision() {
			return getRuleContext(OperadoraritmeticodivisionContext.class,0);
		}
		public OperadoraritmeticorestaContext operadoraritmeticoresta() {
			return getRuleContext(OperadoraritmeticorestaContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(386);
				llamarfuncion();
				}
				break;
			case 2:
				{
				setState(387);
				numeros();
				}
				break;
			case 3:
				{
				setState(388);
				nombrevariable();
				}
				break;
			case 4:
				{
				setState(389);
				operadoraperturaparentesis();
				setState(392);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
				case ARRAY:
				case ID:
					{
					setState(390);
					nombrevariable();
					}
					break;
				case DIGITO:
				case FLOTANTE:
					{
					setState(391);
					numeros();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(394);
					separadoroperadores();
					setState(397);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CASE:
					case ARRAY:
					case ID:
						{
						setState(395);
						nombrevariable();
						}
						break;
					case DIGITO:
					case FLOTANTE:
						{
						setState(396);
						numeros();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(404);
				operadorcierreparentesis();
				}
				break;
			case 5:
				{
				setState(406);
				cadena();
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(407);
						operadoraritmeticosuma();
						setState(408);
						expr(0);
						}
						} 
					}
					setState(414);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				}
				break;
			case 6:
				{
				setState(415);
				operadoraperturaparentesis();
				setState(416);
				expr(0);
				setState(417);
				operadorcierreparentesis();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(435);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(421);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(424);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PRODUCT:
							{
							setState(422);
							operadoraritmeticoproducto();
							}
							break;
						case DIVISION:
							{
							setState(423);
							operadoraritmeticodivision();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(426);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(428);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(431);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ADD:
							{
							setState(429);
							operadoraritmeticosuma();
							}
							break;
						case MINUS:
							{
							setState(430);
							operadoraritmeticoresta();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(433);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class ExpresionlogicaContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<PalabraclavebooleanoContext> palabraclavebooleano() {
			return getRuleContexts(PalabraclavebooleanoContext.class);
		}
		public PalabraclavebooleanoContext palabraclavebooleano(int i) {
			return getRuleContext(PalabraclavebooleanoContext.class,i);
		}
		public List<OperadorlogicoContext> operadorlogico() {
			return getRuleContexts(OperadorlogicoContext.class);
		}
		public OperadorlogicoContext operadorlogico(int i) {
			return getRuleContext(OperadorlogicoContext.class,i);
		}
		public List<OperadorcondicionalpuertalogicaContext> operadorcondicionalpuertalogica() {
			return getRuleContexts(OperadorcondicionalpuertalogicaContext.class);
		}
		public OperadorcondicionalpuertalogicaContext operadorcondicionalpuertalogica(int i) {
			return getRuleContext(OperadorcondicionalpuertalogicaContext.class,i);
		}
		public List<ExpresionlogicaContext> expresionlogica() {
			return getRuleContexts(ExpresionlogicaContext.class);
		}
		public ExpresionlogicaContext expresionlogica(int i) {
			return getRuleContext(ExpresionlogicaContext.class,i);
		}
		public ExpresionlogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionlogica; }
	}

	public final ExpresionlogicaContext expresionlogica() throws RecognitionException {
		ExpresionlogicaContext _localctx = new ExpresionlogicaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expresionlogica);
		try {
			int _alt;
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONDICIONES:
				case SWITCH:
				case CASE:
				case WHILE:
				case FOR:
				case PL:
				case DIGITO:
				case FLOTANTE:
				case ARRAY:
				case ID:
				case CADENA:
					{
					setState(440);
					expr(0);
					}
					break;
				case BOOLEAN:
					{
					setState(441);
					palabraclavebooleano();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(453); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(446);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MENORQUE:
						case MAYORQUE:
						case IGUALQUE:
						case DISTINTOQUE:
							{
							setState(444);
							operadorlogico();
							}
							break;
						case PUERTALOGICAAND:
						case PUERTALOGICAOR:
							{
							setState(445);
							operadorcondicionalpuertalogica();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(451);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
						case 1:
							{
							setState(448);
							expr(0);
							}
							break;
						case 2:
							{
							setState(449);
							palabraclavebooleano();
							}
							break;
						case 3:
							{
							setState(450);
							expresionlogica();
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(455); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				palabraclavebooleano();
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

	public static class NombrefuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Pl2compilerParser.ID, 0); }
		public NombrefuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombrefuncion; }
	}

	public final NombrefuncionContext nombrefuncion() throws RecognitionException {
		NombrefuncionContext _localctx = new NombrefuncionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nombrefuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(ID);
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

	public static class NombrevariableContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(Pl2compilerParser.ARRAY, 0); }
		public TerminalNode ID() { return getToken(Pl2compilerParser.ID, 0); }
		public TerminalNode CASE() { return getToken(Pl2compilerParser.CASE, 0); }
		public NombrevariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombrevariable; }
	}

	public final NombrevariableContext nombrevariable() throws RecognitionException {
		NombrevariableContext _localctx = new NombrevariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nombrevariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << ARRAY) | (1L << ID))) != 0)) ) {
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

	public static class NombrepaqueteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Pl2compilerParser.ID, 0); }
		public NombrepaqueteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombrepaquete; }
	}

	public final NombrepaqueteContext nombrepaquete() throws RecognitionException {
		NombrepaqueteContext _localctx = new NombrepaqueteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_nombrepaquete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(ID);
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

	public static class OperadorasignacionContext extends ParserRuleContext {
		public TerminalNode ASIGN() { return getToken(Pl2compilerParser.ASIGN, 0); }
		public OperadorasignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorasignacion; }
	}

	public final OperadorasignacionContext operadorasignacion() throws RecognitionException {
		OperadorasignacionContext _localctx = new OperadorasignacionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operadorasignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(ASIGN);
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<SeparadoroperadoresContext> separadoroperadores() {
			return getRuleContexts(SeparadoroperadoresContext.class);
		}
		public SeparadoroperadoresContext separadoroperadores(int i) {
			return getRuleContext(SeparadoroperadoresContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			parametro();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(469);
				separadoroperadores();
				setState(470);
				parametro();
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParametroContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TipovariableContext tipovariable() {
			return getRuleContext(TipovariableContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << STRING) | (1L << NUMERO))) != 0)) {
				{
				setState(477);
				tipovariable();
				}
			}

			setState(480);
			expr(0);
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

	public static class OperadoraritmeticoproductoContext extends ParserRuleContext {
		public TerminalNode PRODUCT() { return getToken(Pl2compilerParser.PRODUCT, 0); }
		public OperadoraritmeticoproductoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoraritmeticoproducto; }
	}

	public final OperadoraritmeticoproductoContext operadoraritmeticoproducto() throws RecognitionException {
		OperadoraritmeticoproductoContext _localctx = new OperadoraritmeticoproductoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operadoraritmeticoproducto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(PRODUCT);
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

	public static class OperadoraritmeticodivisionContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(Pl2compilerParser.DIVISION, 0); }
		public OperadoraritmeticodivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoraritmeticodivision; }
	}

	public final OperadoraritmeticodivisionContext operadoraritmeticodivision() throws RecognitionException {
		OperadoraritmeticodivisionContext _localctx = new OperadoraritmeticodivisionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operadoraritmeticodivision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(DIVISION);
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

	public static class OperadoraritmeticosumaContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(Pl2compilerParser.ADD, 0); }
		public OperadoraritmeticosumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoraritmeticosuma; }
	}

	public final OperadoraritmeticosumaContext operadoraritmeticosuma() throws RecognitionException {
		OperadoraritmeticosumaContext _localctx = new OperadoraritmeticosumaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operadoraritmeticosuma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(ADD);
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

	public static class OperadoraritmeticorestaContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(Pl2compilerParser.MINUS, 0); }
		public OperadoraritmeticorestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoraritmeticoresta; }
	}

	public final OperadoraritmeticorestaContext operadoraritmeticoresta() throws RecognitionException {
		OperadoraritmeticorestaContext _localctx = new OperadoraritmeticorestaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operadoraritmeticoresta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(MINUS);
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

	public static class Operadoraritmeticosuma1Context extends ParserRuleContext {
		public TerminalNode INCREMENTOEN1() { return getToken(Pl2compilerParser.INCREMENTOEN1, 0); }
		public Operadoraritmeticosuma1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoraritmeticosuma1; }
	}

	public final Operadoraritmeticosuma1Context operadoraritmeticosuma1() throws RecognitionException {
		Operadoraritmeticosuma1Context _localctx = new Operadoraritmeticosuma1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_operadoraritmeticosuma1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(INCREMENTOEN1);
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

	public static class Operadoraritmeticoresta1Context extends ParserRuleContext {
		public TerminalNode DECREMENTOEN1() { return getToken(Pl2compilerParser.DECREMENTOEN1, 0); }
		public Operadoraritmeticoresta1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoraritmeticoresta1; }
	}

	public final Operadoraritmeticoresta1Context operadoraritmeticoresta1() throws RecognitionException {
		Operadoraritmeticoresta1Context _localctx = new Operadoraritmeticoresta1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_operadoraritmeticoresta1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(DECREMENTOEN1);
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

	public static class OperadorlogicoContext extends ParserRuleContext {
		public TerminalNode MENORQUE() { return getToken(Pl2compilerParser.MENORQUE, 0); }
		public TerminalNode MAYORQUE() { return getToken(Pl2compilerParser.MAYORQUE, 0); }
		public TerminalNode IGUALQUE() { return getToken(Pl2compilerParser.IGUALQUE, 0); }
		public TerminalNode DISTINTOQUE() { return getToken(Pl2compilerParser.DISTINTOQUE, 0); }
		public OperadorlogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorlogico; }
	}

	public final OperadorlogicoContext operadorlogico() throws RecognitionException {
		OperadorlogicoContext _localctx = new OperadorlogicoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operadorlogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENORQUE) | (1L << MAYORQUE) | (1L << IGUALQUE) | (1L << DISTINTOQUE))) != 0)) ) {
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

	public static class OperadorcondicionalpuertalogicaContext extends ParserRuleContext {
		public TerminalNode PUERTALOGICAAND() { return getToken(Pl2compilerParser.PUERTALOGICAAND, 0); }
		public TerminalNode PUERTALOGICAOR() { return getToken(Pl2compilerParser.PUERTALOGICAOR, 0); }
		public OperadorcondicionalpuertalogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorcondicionalpuertalogica; }
	}

	public final OperadorcondicionalpuertalogicaContext operadorcondicionalpuertalogica() throws RecognitionException {
		OperadorcondicionalpuertalogicaContext _localctx = new OperadorcondicionalpuertalogicaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operadorcondicionalpuertalogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_la = _input.LA(1);
			if ( !(_la==PUERTALOGICAAND || _la==PUERTALOGICAOR) ) {
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

	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(Pl2compilerParser.CADENA, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(CADENA);
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

	public static class SeparadoroperacionesContext extends ParserRuleContext {
		public TerminalNode PC() { return getToken(Pl2compilerParser.PC, 0); }
		public SeparadoroperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separadoroperaciones; }
	}

	public final SeparadoroperacionesContext separadoroperaciones() throws RecognitionException {
		SeparadoroperacionesContext _localctx = new SeparadoroperacionesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_separadoroperaciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(PC);
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

	public static class SeparadoroperadoresContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(Pl2compilerParser.COMA, 0); }
		public SeparadoroperadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separadoroperadores; }
	}

	public final SeparadoroperadoresContext separadoroperadores() throws RecognitionException {
		SeparadoroperadoresContext _localctx = new SeparadoroperadoresContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_separadoroperadores);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(COMA);
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

	public static class SeparadordospuntosContext extends ParserRuleContext {
		public TerminalNode DOSPUNTOS() { return getToken(Pl2compilerParser.DOSPUNTOS, 0); }
		public SeparadordospuntosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separadordospuntos; }
	}

	public final SeparadordospuntosContext separadordospuntos() throws RecognitionException {
		SeparadordospuntosContext _localctx = new SeparadordospuntosContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_separadordospuntos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(DOSPUNTOS);
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

	public static class OperadoraperturaparentesisContext extends ParserRuleContext {
		public TerminalNode PL() { return getToken(Pl2compilerParser.PL, 0); }
		public OperadoraperturaparentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoraperturaparentesis; }
	}

	public final OperadoraperturaparentesisContext operadoraperturaparentesis() throws RecognitionException {
		OperadoraperturaparentesisContext _localctx = new OperadoraperturaparentesisContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operadoraperturaparentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(PL);
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

	public static class OperadorcierreparentesisContext extends ParserRuleContext {
		public TerminalNode PR() { return getToken(Pl2compilerParser.PR, 0); }
		public OperadorcierreparentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorcierreparentesis; }
	}

	public final OperadorcierreparentesisContext operadorcierreparentesis() throws RecognitionException {
		OperadorcierreparentesisContext _localctx = new OperadorcierreparentesisContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operadorcierreparentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(PR);
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

	public static class TipovariableContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(Pl2compilerParser.STRING, 0); }
		public TerminalNode NUMERO() { return getToken(Pl2compilerParser.NUMERO, 0); }
		public TerminalNode VOID() { return getToken(Pl2compilerParser.VOID, 0); }
		public TipovariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipovariable; }
	}

	public final TipovariableContext tipovariable() throws RecognitionException {
		TipovariableContext _localctx = new TipovariableContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tipovariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << STRING) | (1L << NUMERO))) != 0)) ) {
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

	public static class ComentariosContext extends ParserRuleContext {
		public TerminalNode COMENTARIO_LINEA() { return getToken(Pl2compilerParser.COMENTARIO_LINEA, 0); }
		public TerminalNode COMENTARIO_LINEA2() { return getToken(Pl2compilerParser.COMENTARIO_LINEA2, 0); }
		public TerminalNode COMENTARIO_BLOQUE() { return getToken(Pl2compilerParser.COMENTARIO_BLOQUE, 0); }
		public TerminalNode COMENTARIO_DOCUMENTACION() { return getToken(Pl2compilerParser.COMENTARIO_DOCUMENTACION, 0); }
		public ComentariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentarios; }
	}

	public final ComentariosContext comentarios() throws RecognitionException {
		ComentariosContext _localctx = new ComentariosContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_comentarios);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIO_LINEA) | (1L << COMENTARIO_LINEA2) | (1L << COMENTARIO_BLOQUE) | (1L << COMENTARIO_DOCUMENTACION))) != 0)) ) {
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

	public static class EnteroContext extends ParserRuleContext {
		public List<TerminalNode> DIGITO() { return getTokens(Pl2compilerParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(Pl2compilerParser.DIGITO, i);
		}
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_entero);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(514);
					match(DIGITO);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(517); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FlotanteContext extends ParserRuleContext {
		public TerminalNode FLOTANTE() { return getToken(Pl2compilerParser.FLOTANTE, 0); }
		public FlotanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flotante; }
	}

	public final FlotanteContext flotante() throws RecognitionException {
		FlotanteContext _localctx = new FlotanteContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_flotante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(FLOTANTE);
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

	public static class NumerosContext extends ParserRuleContext {
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public FlotanteContext flotante() {
			return getRuleContext(FlotanteContext.class,0);
		}
		public NumerosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeros; }
	}

	public final NumerosContext numeros() throws RecognitionException {
		NumerosContext _localctx = new NumerosContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_numeros);
		try {
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITO:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				entero();
				}
				break;
			case FLOTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				flotante();
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

	public static class PalabraclavebooleanoContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(Pl2compilerParser.BOOLEAN, 0); }
		public PalabraclavebooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclavebooleano; }
	}

	public final PalabraclavebooleanoContext palabraclavebooleano() throws RecognitionException {
		PalabraclavebooleanoContext _localctx = new PalabraclavebooleanoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_palabraclavebooleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(BOOLEAN);
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

	public static class PalabraclavebucleforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Pl2compilerParser.FOR, 0); }
		public PalabraclavebucleforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclavebuclefor; }
	}

	public final PalabraclavebucleforContext palabraclavebuclefor() throws RecognitionException {
		PalabraclavebucleforContext _localctx = new PalabraclavebucleforContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_palabraclavebuclefor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(FOR);
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

	public static class PalabraclaveendbucleforContext extends ParserRuleContext {
		public TerminalNode ENDFOR() { return getToken(Pl2compilerParser.ENDFOR, 0); }
		public PalabraclaveendbucleforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclaveendbuclefor; }
	}

	public final PalabraclaveendbucleforContext palabraclaveendbuclefor() throws RecognitionException {
		PalabraclaveendbucleforContext _localctx = new PalabraclaveendbucleforContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_palabraclaveendbuclefor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(ENDFOR);
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

	public static class PalabraclaveinciovalorforContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(Pl2compilerParser.FROM, 0); }
		public PalabraclaveinciovalorforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclaveinciovalorfor; }
	}

	public final PalabraclaveinciovalorforContext palabraclaveinciovalorfor() throws RecognitionException {
		PalabraclaveinciovalorforContext _localctx = new PalabraclaveinciovalorforContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_palabraclaveinciovalorfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(FROM);
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

	public static class PalabraclavesaltoelementoforContext extends ParserRuleContext {
		public TerminalNode STEP() { return getToken(Pl2compilerParser.STEP, 0); }
		public PalabraclavesaltoelementoforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclavesaltoelementofor; }
	}

	public final PalabraclavesaltoelementoforContext palabraclavesaltoelementofor() throws RecognitionException {
		PalabraclavesaltoelementoforContext _localctx = new PalabraclavesaltoelementoforContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_palabraclavesaltoelementofor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(STEP);
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

	public static class PalabraclavefinvalorforContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(Pl2compilerParser.TO, 0); }
		public PalabraclavefinvalorforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclavefinvalorfor; }
	}

	public final PalabraclavefinvalorforContext palabraclavefinvalorfor() throws RecognitionException {
		PalabraclavefinvalorforContext _localctx = new PalabraclavefinvalorforContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_palabraclavefinvalorfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(TO);
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

	public static class PalabraclavehacerforContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(Pl2compilerParser.DO, 0); }
		public PalabraclavehacerforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclavehacerfor; }
	}

	public final PalabraclavehacerforContext palabraclavehacerfor() throws RecognitionException {
		PalabraclavehacerforContext _localctx = new PalabraclavehacerforContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_palabraclavehacerfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(DO);
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

	public static class PalabraclavebuclewhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Pl2compilerParser.WHILE, 0); }
		public PalabraclavebuclewhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclavebuclewhile; }
	}

	public final PalabraclavebuclewhileContext palabraclavebuclewhile() throws RecognitionException {
		PalabraclavebuclewhileContext _localctx = new PalabraclavebuclewhileContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_palabraclavebuclewhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(WHILE);
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

	public static class PalabrareservadaaperturaswitchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(Pl2compilerParser.SWITCH, 0); }
		public PalabrareservadaaperturaswitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabrareservadaaperturaswitch; }
	}

	public final PalabrareservadaaperturaswitchContext palabrareservadaaperturaswitch() throws RecognitionException {
		PalabrareservadaaperturaswitchContext _localctx = new PalabrareservadaaperturaswitchContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_palabrareservadaaperturaswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(SWITCH);
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

	public static class PalabrareservadacierrewitchContext extends ParserRuleContext {
		public TerminalNode ENDSWITCH() { return getToken(Pl2compilerParser.ENDSWITCH, 0); }
		public PalabrareservadacierrewitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabrareservadacierrewitch; }
	}

	public final PalabrareservadacierrewitchContext palabrareservadacierrewitch() throws RecognitionException {
		PalabrareservadacierrewitchContext _localctx = new PalabrareservadacierrewitchContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_palabrareservadacierrewitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(ENDSWITCH);
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

	public static class PalabrareservadacaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Pl2compilerParser.CASE, 0); }
		public PalabrareservadacaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabrareservadacase; }
	}

	public final PalabrareservadacaseContext palabrareservadacase() throws RecognitionException {
		PalabrareservadacaseContext _localctx = new PalabrareservadacaseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_palabrareservadacase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(CASE);
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

	public static class PalabrareservadabreakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(Pl2compilerParser.BREAK, 0); }
		public PalabrareservadabreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabrareservadabreak; }
	}

	public final PalabrareservadabreakContext palabrareservadabreak() throws RecognitionException {
		PalabrareservadabreakContext _localctx = new PalabrareservadabreakContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_palabrareservadabreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(BREAK);
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

	public static class PalabrareservadadefaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(Pl2compilerParser.DEFAULT, 0); }
		public PalabrareservadadefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabrareservadadefault; }
	}

	public final PalabrareservadadefaultContext palabrareservadadefault() throws RecognitionException {
		PalabrareservadadefaultContext _localctx = new PalabrareservadadefaultContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_palabrareservadadefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(DEFAULT);
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

	public static class PalabraclavecondicionesContext extends ParserRuleContext {
		public TerminalNode CONDICIONES() { return getToken(Pl2compilerParser.CONDICIONES, 0); }
		public PalabraclavecondicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclavecondiciones; }
	}

	public final PalabraclavecondicionesContext palabraclavecondiciones() throws RecognitionException {
		PalabraclavecondicionesContext _localctx = new PalabraclavecondicionesContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_palabraclavecondiciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(CONDICIONES);
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

	public static class PalabraclavethenContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(Pl2compilerParser.THEN, 0); }
		public PalabraclavethenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclavethen; }
	}

	public final PalabraclavethenContext palabraclavethen() throws RecognitionException {
		PalabraclavethenContext _localctx = new PalabraclavethenContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_palabraclavethen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(THEN);
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

	public static class PalabraclaveendifContext extends ParserRuleContext {
		public TerminalNode ENDIF() { return getToken(Pl2compilerParser.ENDIF, 0); }
		public PalabraclaveendifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclaveendif; }
	}

	public final PalabraclaveendifContext palabraclaveendif() throws RecognitionException {
		PalabraclaveendifContext _localctx = new PalabraclaveendifContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_palabraclaveendif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(ENDIF);
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

	public static class PalabraclaveincluirlibreriaContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(Pl2compilerParser.INCLUDE, 0); }
		public PalabraclaveincluirlibreriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclaveincluirlibreria; }
	}

	public final PalabraclaveincluirlibreriaContext palabraclaveincluirlibreria() throws RecognitionException {
		PalabraclaveincluirlibreriaContext _localctx = new PalabraclaveincluirlibreriaContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_palabraclaveincluirlibreria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(INCLUDE);
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

	public static class PalabraclavecreacionfuncionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(Pl2compilerParser.FUNCTION, 0); }
		public PalabraclavecreacionfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclavecreacionfuncion; }
	}

	public final PalabraclavecreacionfuncionContext palabraclavecreacionfuncion() throws RecognitionException {
		PalabraclavecreacionfuncionContext _localctx = new PalabraclavecreacionfuncionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_palabraclavecreacionfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(FUNCTION);
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

	public static class PalabraclavefuncionmainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(Pl2compilerParser.MAIN, 0); }
		public PalabraclavefuncionmainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclavefuncionmain; }
	}

	public final PalabraclavefuncionmainContext palabraclavefuncionmain() throws RecognitionException {
		PalabraclavefuncionmainContext _localctx = new PalabraclavefuncionmainContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_palabraclavefuncionmain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(MAIN);
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

	public static class PalabraclavefunciondevolverContext extends ParserRuleContext {
		public TerminalNode DEVOLVER() { return getToken(Pl2compilerParser.DEVOLVER, 0); }
		public PalabraclavefunciondevolverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclavefunciondevolver; }
	}

	public final PalabraclavefunciondevolverContext palabraclavefunciondevolver() throws RecognitionException {
		PalabraclavefunciondevolverContext _localctx = new PalabraclavefunciondevolverContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_palabraclavefunciondevolver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(DEVOLVER);
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

	public static class PalabraclaveinicioContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(Pl2compilerParser.BEGIN, 0); }
		public PalabraclaveinicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclaveinicio; }
	}

	public final PalabraclaveinicioContext palabraclaveinicio() throws RecognitionException {
		PalabraclaveinicioContext _localctx = new PalabraclaveinicioContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_palabraclaveinicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(BEGIN);
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

	public static class PalabraclavefinContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(Pl2compilerParser.END, 0); }
		public PalabraclavefinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabraclavefin; }
	}

	public final PalabraclavefinContext palabraclavefin() throws RecognitionException {
		PalabraclavefinContext _localctx = new PalabraclavefinContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_palabraclavefin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(END);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u023c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\6\2\u0091\n\2\r\2\16\2\u0092\3\3\3\3\3\3\3\3\6\3\u0099\n\3\r\3\16\3\u009a"+
		"\3\4\5\4\u009e\n\4\3\4\3\4\3\4\3\4\5\4\u00a4\n\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4\u00ab\n\4\f\4\16\4\u00ae\13\4\5\4\u00b0\n\4\3\4\5\4\u00b3\n\4\3\5\5"+
		"\5\u00b6\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00cd\n\t\3\t\3\t\3\t\5\t\u00d2\n\t\6\t"+
		"\u00d4\n\t\r\t\16\t\u00d5\3\t\3\t\3\t\3\t\5\t\u00dc\n\t\3\t\3\t\3\t\5"+
		"\t\u00e1\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00eb\n\n\f\n\16\n\u00ee"+
		"\13\n\5\n\u00f0\n\n\3\n\5\n\u00f3\n\n\3\n\3\n\5\n\u00f7\n\n\3\n\5\n\u00fa"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u0100\n\13\3\13\3\13\3\13\5\13\u0105\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u010c\n\f\3\f\3\f\3\f\5\f\u0111\n\f\3\f\3\f\3"+
		"\f\5\f\u0116\n\f\5\f\u0118\n\f\3\f\3\f\3\f\3\f\3\r\7\r\u011f\n\r\f\r\16"+
		"\r\u0122\13\r\3\r\6\r\u0125\n\r\r\r\16\r\u0126\3\r\7\r\u012a\n\r\f\r\16"+
		"\r\u012d\13\r\6\r\u012f\n\r\r\r\16\r\u0130\3\16\3\16\7\16\u0135\n\16\f"+
		"\16\16\16\u0138\13\16\3\16\3\16\6\16\u013c\n\16\r\16\16\16\u013d\3\17"+
		"\3\17\5\17\u0142\n\17\3\17\3\17\3\17\5\17\u0147\n\17\3\17\3\17\5\17\u014b"+
		"\n\17\3\20\3\20\3\20\5\20\u0150\n\20\3\20\3\20\5\20\u0154\n\20\3\20\3"+
		"\20\3\20\3\20\5\20\u015a\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21"+
		"\u0163\n\21\r\21\16\21\u0164\3\22\3\22\3\22\5\22\u016a\n\22\3\23\3\23"+
		"\3\23\3\23\5\23\u0170\n\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25"+
		"\u017a\n\25\3\25\3\25\5\25\u017e\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u018b\n\26\3\26\3\26\3\26\5\26\u0190\n\26"+
		"\7\26\u0192\n\26\f\26\16\26\u0195\13\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u019d\n\26\f\26\16\26\u01a0\13\26\3\26\3\26\3\26\3\26\5\26\u01a6"+
		"\n\26\3\26\3\26\3\26\5\26\u01ab\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u01b2"+
		"\n\26\3\26\3\26\7\26\u01b6\n\26\f\26\16\26\u01b9\13\26\3\27\3\27\5\27"+
		"\u01bd\n\27\3\27\3\27\5\27\u01c1\n\27\3\27\3\27\3\27\5\27\u01c6\n\27\6"+
		"\27\u01c8\n\27\r\27\16\27\u01c9\3\27\5\27\u01cd\n\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u01db\n\34\f\34\16\34"+
		"\u01de\13\34\3\35\5\35\u01e1\n\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\6.\u0206\n.\r.\16.\u0207\3/\3/\3\60\3\60\5\60\u020e\n"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3"+
		"\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B"+
		"\3C\3C\3D\3D\3E\3E\3F\3F\3F\2\3*G\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\2\7\4\2\6\6\678\3\2.\61\3\2\62\63\4\2\24\25\35"+
		"\35\3\2;>\2\u0244\2\u0090\3\2\2\2\4\u0098\3\2\2\2\6\u00af\3\2\2\2\b\u00b5"+
		"\3\2\2\2\n\u00bb\3\2\2\2\f\u00bf\3\2\2\2\16\u00c2\3\2\2\2\20\u00d3\3\2"+
		"\2\2\22\u00e4\3\2\2\2\24\u00fb\3\2\2\2\26\u0106\3\2\2\2\30\u012e\3\2\2"+
		"\2\32\u013b\3\2\2\2\34\u014a\3\2\2\2\36\u0159\3\2\2\2 \u0162\3\2\2\2\""+
		"\u0166\3\2\2\2$\u016b\3\2\2\2&\u0174\3\2\2\2(\u0176\3\2\2\2*\u01a5\3\2"+
		"\2\2,\u01cc\3\2\2\2.\u01ce\3\2\2\2\60\u01d0\3\2\2\2\62\u01d2\3\2\2\2\64"+
		"\u01d4\3\2\2\2\66\u01d6\3\2\2\28\u01e0\3\2\2\2:\u01e4\3\2\2\2<\u01e6\3"+
		"\2\2\2>\u01e8\3\2\2\2@\u01ea\3\2\2\2B\u01ec\3\2\2\2D\u01ee\3\2\2\2F\u01f0"+
		"\3\2\2\2H\u01f2\3\2\2\2J\u01f4\3\2\2\2L\u01f6\3\2\2\2N\u01f8\3\2\2\2P"+
		"\u01fa\3\2\2\2R\u01fc\3\2\2\2T\u01fe\3\2\2\2V\u0200\3\2\2\2X\u0202\3\2"+
		"\2\2Z\u0205\3\2\2\2\\\u0209\3\2\2\2^\u020d\3\2\2\2`\u020f\3\2\2\2b\u0211"+
		"\3\2\2\2d\u0213\3\2\2\2f\u0215\3\2\2\2h\u0217\3\2\2\2j\u0219\3\2\2\2l"+
		"\u021b\3\2\2\2n\u021d\3\2\2\2p\u021f\3\2\2\2r\u0221\3\2\2\2t\u0223\3\2"+
		"\2\2v\u0225\3\2\2\2x\u0227\3\2\2\2z\u0229\3\2\2\2|\u022b\3\2\2\2~\u022d"+
		"\3\2\2\2\u0080\u022f\3\2\2\2\u0082\u0231\3\2\2\2\u0084\u0233\3\2\2\2\u0086"+
		"\u0235\3\2\2\2\u0088\u0237\3\2\2\2\u008a\u0239\3\2\2\2\u008c\u0091\5\4"+
		"\3\2\u008d\u0091\5*\26\2\u008e\u0091\5\6\4\2\u008f\u0091\5\"\22\2\u0090"+
		"\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\3\3\2\2\2\u0094\u0095\5\u0080A\2\u0095\u0096\5\62\32\2\u0096\u0097\5"+
		"L\'\2\u0097\u0099\3\2\2\2\u0098\u0094\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\5\3\2\2\2\u009c\u009e\5V,\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\5\60"+
		"\31\2\u00a0\u00a1\5\64\33\2\u00a1\u00a2\5*\26\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a0\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00b0\3\2\2\2\u00a5\u00a6\5V"+
		",\2\u00a6\u00ac\5\60\31\2\u00a7\u00a8\5N(\2\u00a8\u00a9\5\60\31\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u009d\3\2\2\2\u00af\u00a5\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3\5L"+
		"\'\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\7\3\2\2\2\u00b4\u00b6"+
		"\5V,\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\5\60\31\2\u00b8\u00b9\5\64\33\2\u00b9\u00ba\5*\26\2\u00ba\t\3\2"+
		"\2\2\u00bb\u00bc\5R*\2\u00bc\u00bd\5,\27\2\u00bd\u00be\5T+\2\u00be\13"+
		"\3\2\2\2\u00bf\u00c0\5\16\b\2\u00c0\u00c1\5\20\t\2\u00c1\r\3\2\2\2\u00c2"+
		"\u00c3\5p9\2\u00c3\u00c4\5R*\2\u00c4\u00c5\5*\26\2\u00c5\u00c6\5T+\2\u00c6"+
		"\17\3\2\2\2\u00c7\u00c8\5t;\2\u00c8\u00c9\5*\26\2\u00c9\u00cc\5P)\2\u00ca"+
		"\u00cd\5\34\17\2\u00cb\u00cd\5\30\r\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00cf\5v<\2\u00cf\u00d0\5L\'\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00c7\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\5x=\2\u00d8\u00db\5P)\2"+
		"\u00d9\u00dc\5\34\17\2\u00da\u00dc\5\30\r\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00de\5v<\2\u00de\u00df\5L\'"+
		"\2\u00df\u00e1\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e3\5r:\2\u00e3\21\3\2\2\2\u00e4\u00ef\5z>\2\u00e5\u00f0"+
		"\5\n\6\2\u00e6\u00ec\5\n\6\2\u00e7\u00e8\5H%\2\u00e8\u00e9\5\n\6\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00e5\3\2\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00f3\5|?\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6"+
		"\3\2\2\2\u00f4\u00f7\5\34\17\2\u00f5\u00f7\5\30\r\2\u00f6\u00f4\3\2\2"+
		"\2\u00f6\u00f5\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00fa\5~@\2\u00f9\u00f8"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\23\3\2\2\2\u00fb\u00fc\5n8\2\u00fc"+
		"\u00ff\5R*\2\u00fd\u0100\5*\26\2\u00fe\u0100\5,\27\2\u00ff\u00fd\3\2\2"+
		"\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0104\5T+\2\u0102\u0105"+
		"\5\34\17\2\u0103\u0105\5\30\r\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2"+
		"\2\u0105\25\3\2\2\2\u0106\u0107\5b\62\2\u0107\u0108\5\60\31\2\u0108\u010b"+
		"\5f\64\2\u0109\u010c\5\60\31\2\u010a\u010c\5^\60\2\u010b\u0109\3\2\2\2"+
		"\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0110\5j\66\2\u010e\u0111"+
		"\5\60\31\2\u010f\u0111\5^\60\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2"+
		"\u0111\u0117\3\2\2\2\u0112\u0115\5h\65\2\u0113\u0116\5\60\31\2\u0114\u0116"+
		"\5^\60\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0112\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\5l"+
		"\67\2\u011a\u011b\5\30\r\2\u011b\u011c\5d\63\2\u011c\27\3\2\2\2\u011d"+
		"\u011f\5\u0088E\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0125\5 \21\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u012b\3\2\2\2\u0128\u012a\5\u008aF\2\u0129"+
		"\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0120\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\31\3\2\2"+
		"\2\u0132\u0136\5\u0088E\2\u0133\u0135\5 \21\2\u0134\u0133\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139\u013a\5\u008aF\2\u013a\u013c\3\2\2\2\u013b"+
		"\u0132\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\33\3\2\2\2\u013f\u0142\5\6\4\2\u0140\u0142\5\36\20\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\u014b\3\2\2\2\u0143\u0146\5\u0088"+
		"E\2\u0144\u0147\5\6\4\2\u0145\u0147\5\36\20\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\5\u008aF\2\u0149\u014b"+
		"\3\2\2\2\u014a\u0141\3\2\2\2\u014a\u0143\3\2\2\2\u014b\35\3\2\2\2\u014c"+
		"\u014d\5.\30\2\u014d\u014f\5R*\2\u014e\u0150\5\66\34\2\u014f\u014e\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\5T+\2\u0152\u0154"+
		"\5L\'\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u015a\3\2\2\2\u0155"+
		"\u015a\5\26\f\2\u0156\u015a\5\24\13\2\u0157\u015a\5\22\n\2\u0158\u015a"+
		"\5\f\7\2\u0159\u014c\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\37\3\2\2\2\u015b\u0163\5\24\13"+
		"\2\u015c\u0163\5\26\f\2\u015d\u0163\5\f\7\2\u015e\u0163\5\6\4\2\u015f"+
		"\u0163\5\36\20\2\u0160\u0163\5$\23\2\u0161\u0163\5\32\16\2\u0162\u015b"+
		"\3\2\2\2\u0162\u015c\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0162"+
		"\u015f\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165!\3\2\2\2\u0166\u0169"+
		"\5(\25\2\u0167\u016a\5\34\17\2\u0168\u016a\5\30\r\2\u0169\u0167\3\2\2"+
		"\2\u0169\u0168\3\2\2\2\u016a#\3\2\2\2\u016b\u016c\5\u0086D\2\u016c\u016f"+
		"\5R*\2\u016d\u0170\5\36\20\2\u016e\u0170\5*\26\2\u016f\u016d\3\2\2\2\u016f"+
		"\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\5T"+
		"+\2\u0172\u0173\5L\'\2\u0173%\3\2\2\2\u0174\u0175\5V,\2\u0175\'\3\2\2"+
		"\2\u0176\u0179\5\u0082B\2\u0177\u017a\5.\30\2\u0178\u017a\5\u0084C\2\u0179"+
		"\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\5R"+
		"*\2\u017c\u017e\5\66\34\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\5T+\2\u0180\u0181\5P)\2\u0181\u0182\5&\24\2"+
		"\u0182)\3\2\2\2\u0183\u0184\b\26\1\2\u0184\u01a6\5\36\20\2\u0185\u01a6"+
		"\5^\60\2\u0186\u01a6\5\60\31\2\u0187\u018a\5R*\2\u0188\u018b\5\60\31\2"+
		"\u0189\u018b\5^\60\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b\u0193"+
		"\3\2\2\2\u018c\u018f\5N(\2\u018d\u0190\5\60\31\2\u018e\u0190\5^\60\2\u018f"+
		"\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018c\3\2"+
		"\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\5T+\2\u0197\u01a6\3\2\2"+
		"\2\u0198\u019e\5J&\2\u0199\u019a\5> \2\u019a\u019b\5*\26\2\u019b\u019d"+
		"\3\2\2\2\u019c\u0199\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a6\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\5R"+
		"*\2\u01a2\u01a3\5*\26\2\u01a3\u01a4\5T+\2\u01a4\u01a6\3\2\2\2\u01a5\u0183"+
		"\3\2\2\2\u01a5\u0185\3\2\2\2\u01a5\u0186\3\2\2\2\u01a5\u0187\3\2\2\2\u01a5"+
		"\u0198\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a6\u01b7\3\2\2\2\u01a7\u01aa\f\n"+
		"\2\2\u01a8\u01ab\5:\36\2\u01a9\u01ab\5<\37\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\5*\26\13\u01ad\u01b6\3"+
		"\2\2\2\u01ae\u01b1\f\t\2\2\u01af\u01b2\5> \2\u01b0\u01b2\5@!\2\u01b1\u01af"+
		"\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\5*\26\n\u01b4"+
		"\u01b6\3\2\2\2\u01b5\u01a7\3\2\2\2\u01b5\u01ae\3\2\2\2\u01b6\u01b9\3\2"+
		"\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8+\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01ba\u01bd\5*\26\2\u01bb\u01bd\5`\61\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bd\u01c7\3\2\2\2\u01be\u01c1\5F$\2\u01bf\u01c1\5H%\2"+
		"\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c5\3\2\2\2\u01c2\u01c6"+
		"\5*\26\2\u01c3\u01c6\5`\61\2\u01c4\u01c6\5,\27\2\u01c5\u01c2\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c0\3\2"+
		"\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01cd\3\2\2\2\u01cb\u01cd\5`\61\2\u01cc\u01bc\3\2\2\2\u01cc\u01cb\3\2"+
		"\2\2\u01cd-\3\2\2\2\u01ce\u01cf\78\2\2\u01cf/\3\2\2\2\u01d0\u01d1\t\2"+
		"\2\2\u01d1\61\3\2\2\2\u01d2\u01d3\78\2\2\u01d3\63\3\2\2\2\u01d4\u01d5"+
		"\7,\2\2\u01d5\65\3\2\2\2\u01d6\u01dc\58\35\2\u01d7\u01d8\5N(\2\u01d8\u01d9"+
		"\58\35\2\u01d9\u01db\3\2\2\2\u01da\u01d7\3\2\2\2\u01db\u01de\3\2\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\67\3\2\2\2\u01de\u01dc\3\2\2"+
		"\2\u01df\u01e1\5V,\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e3\5*\26\2\u01e39\3\2\2\2\u01e4\u01e5\7*\2\2\u01e5;"+
		"\3\2\2\2\u01e6\u01e7\7+\2\2\u01e7=\3\2\2\2\u01e8\u01e9\7(\2\2\u01e9?\3"+
		"\2\2\2\u01ea\u01eb\7)\2\2\u01ebA\3\2\2\2\u01ec\u01ed\7&\2\2\u01edC\3\2"+
		"\2\2\u01ee\u01ef\7\'\2\2\u01efE\3\2\2\2\u01f0\u01f1\t\3\2\2\u01f1G\3\2"+
		"\2\2\u01f2\u01f3\t\4\2\2\u01f3I\3\2\2\2\u01f4\u01f5\7:\2\2\u01f5K\3\2"+
		"\2\2\u01f6\u01f7\7 \2\2\u01f7M\3\2\2\2\u01f8\u01f9\7%\2\2\u01f9O\3\2\2"+
		"\2\u01fa\u01fb\7#\2\2\u01fbQ\3\2\2\2\u01fc\u01fd\7!\2\2\u01fdS\3\2\2\2"+
		"\u01fe\u01ff\7\"\2\2\u01ffU\3\2\2\2\u0200\u0201\t\5\2\2\u0201W\3\2\2\2"+
		"\u0202\u0203\t\6\2\2\u0203Y\3\2\2\2\u0204\u0206\7\64\2\2\u0205\u0204\3"+
		"\2\2\2\u0206\u0207\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"[\3\2\2\2\u0209\u020a\7\65\2\2\u020a]\3\2\2\2\u020b\u020e\5Z.\2\u020c"+
		"\u020e\5\\/\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020e_\3\2\2\2\u020f"+
		"\u0210\7\t\2\2\u0210a\3\2\2\2\u0211\u0212\7\27\2\2\u0212c\3\2\2\2\u0213"+
		"\u0214\7\30\2\2\u0214e\3\2\2\2\u0215\u0216\7\31\2\2\u0216g\3\2\2\2\u0217"+
		"\u0218\7\32\2\2\u0218i\3\2\2\2\u0219\u021a\7\33\2\2\u021ak\3\2\2\2\u021b"+
		"\u021c\7\34\2\2\u021cm\3\2\2\2\u021d\u021e\7\26\2\2\u021eo\3\2\2\2\u021f"+
		"\u0220\7\4\2\2\u0220q\3\2\2\2\u0221\u0222\7\5\2\2\u0222s\3\2\2\2\u0223"+
		"\u0224\7\6\2\2\u0224u\3\2\2\2\u0225\u0226\7\7\2\2\u0226w\3\2\2\2\u0227"+
		"\u0228\7\b\2\2\u0228y\3\2\2\2\u0229\u022a\7\3\2\2\u022a{\3\2\2\2\u022b"+
		"\u022c\7\16\2\2\u022c}\3\2\2\2\u022d\u022e\7\17\2\2\u022e\177\3\2\2\2"+
		"\u022f\u0230\7\22\2\2\u0230\u0081\3\2\2\2\u0231\u0232\7\23\2\2\u0232\u0083"+
		"\3\2\2\2\u0233\u0234\7\37\2\2\u0234\u0085\3\2\2\2\u0235\u0236\7\36\2\2"+
		"\u0236\u0087\3\2\2\2\u0237\u0238\7\20\2\2\u0238\u0089\3\2\2\2\u0239\u023a"+
		"\7\21\2\2\u023a\u008b\3\2\2\2?\u0090\u0092\u009a\u009d\u00a3\u00ac\u00af"+
		"\u00b2\u00b5\u00cc\u00d1\u00d5\u00db\u00e0\u00ec\u00ef\u00f2\u00f6\u00f9"+
		"\u00ff\u0104\u010b\u0110\u0115\u0117\u0120\u0126\u012b\u0130\u0136\u013d"+
		"\u0141\u0146\u014a\u014f\u0153\u0159\u0162\u0164\u0169\u016f\u0179\u017d"+
		"\u018a\u018f\u0193\u019e\u01a5\u01aa\u01b1\u01b5\u01b7\u01bc\u01c0\u01c5"+
		"\u01c9\u01cc\u01dc\u01e0\u0207\u020d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}