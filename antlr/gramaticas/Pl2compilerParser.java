// Generated from Pl2compilerParser.g4 by ANTLR 4.7.2
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
		DIGITO=50, FLOTANTE=51, NEWLINE=52, ID=53, NOMBREPAQUETE=54, CADENA=55, 
		COMENTARIO_LINEA=56, COMENTARIO_LINEA2=57, COMENTARIO_BLOQUE=58, COMENTARIO_DOCUMENTACION=59, 
		WS=60;
	public static final int
		RULE_prog = 0, RULE_libreria = 1, RULE_asignacion = 2, RULE_variable = 3, 
		RULE_condicion = 4, RULE_operacionswitch = 5, RULE_cabeceraswitch = 6, 
		RULE_cuerposwitch = 7, RULE_condicionales = 8, RULE_funcionwhile = 9, 
		RULE_funcionfor = 10, RULE_cuerpo = 11, RULE_cuerpo2 = 12, RULE_llamarfuncion = 13, 
		RULE_codigo = 14, RULE_crearfuncion = 15, RULE_devolver = 16, RULE_retorno = 17, 
		RULE_cabecerafuncion = 18, RULE_expr = 19, RULE_expresionlogica = 20, 
		RULE_nombrefuncion = 21, RULE_nombrevariable = 22, RULE_nombrepaquete = 23, 
		RULE_operadorasignacion = 24, RULE_parametros = 25, RULE_parametro = 26, 
		RULE_operadoraritmeticoproducto = 27, RULE_operadoraritmeticodivision = 28, 
		RULE_operadoraritmeticosuma = 29, RULE_operadoraritmeticoresta = 30, RULE_operadoraritmeticosuma1 = 31, 
		RULE_operadoraritmeticoresta1 = 32, RULE_operadorlogico = 33, RULE_operadorcondicionalpuertalogica = 34, 
		RULE_cadena = 35, RULE_separadoroperaciones = 36, RULE_separadoroperadores = 37, 
		RULE_separadordospuntos = 38, RULE_operadoraperturaparentesis = 39, RULE_operadorcierreparentesis = 40, 
		RULE_tipovariable = 41, RULE_comentarios = 42, RULE_entero = 43, RULE_flotante = 44, 
		RULE_numeros = 45, RULE_palabraclavebooleano = 46, RULE_palabraclavebuclefor = 47, 
		RULE_palabraclaveendbuclefor = 48, RULE_palabraclaveinciovalorfor = 49, 
		RULE_palabraclavesaltoelementofor = 50, RULE_palabraclavefinvalorfor = 51, 
		RULE_palabraclavehacerfor = 52, RULE_palabraclavebuclewhile = 53, RULE_palabrareservadaaperturaswitch = 54, 
		RULE_palabrareservadacierrewitch = 55, RULE_palabrareservadacase = 56, 
		RULE_palabrareservadabreak = 57, RULE_palabrareservadadefault = 58, RULE_palabraclavecondiciones = 59, 
		RULE_palabraclavethen = 60, RULE_palabraclaveendif = 61, RULE_palabraclaveincluirlibreria = 62, 
		RULE_palabraclavecreacionfuncion = 63, RULE_palabraclavefuncionmain = 64, 
		RULE_palabraclavefunciondevolver = 65, RULE_palabraclaveinicio = 66, RULE_palabraclavefin = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "libreria", "asignacion", "variable", "condicion", "operacionswitch", 
			"cabeceraswitch", "cuerposwitch", "condicionales", "funcionwhile", "funcionfor", 
			"cuerpo", "cuerpo2", "llamarfuncion", "codigo", "crearfuncion", "devolver", 
			"retorno", "cabecerafuncion", "expr", "expresionlogica", "nombrefuncion", 
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
			"DIGITO", "FLOTANTE", "NEWLINE", "ID", "NOMBREPAQUETE", "CADENA", "COMENTARIO_LINEA", 
			"COMENTARIO_LINEA2", "COMENTARIO_BLOQUE", "COMENTARIO_DOCUMENTACION", 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(136);
					libreria();
					}
					break;
				case 2:
					{
					setState(137);
					expr(0);
					}
					break;
				case 3:
					{
					setState(138);
					asignacion();
					}
					break;
				case 4:
					{
					setState(139);
					crearfuncion();
					}
					break;
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << INCLUDE) | (1L << FUNCTION) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << PL) | (1L << DIGITO) | (1L << FLOTANTE) | (1L << ID) | (1L << CADENA))) != 0) );
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterLibreria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitLibreria(this);
		}
	}

	public final LibreriaContext libreria() throws RecognitionException {
		LibreriaContext _localctx = new LibreriaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_libreria);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(144);
					palabraclaveincluirlibreria();
					setState(145);
					nombrepaquete();
					setState(146);
					separadoroperaciones();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asignacion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << STRING) | (1L << NUMERO))) != 0)) {
					{
					setState(152);
					tipovariable();
					}
				}

				setState(155);
				nombrevariable();
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(156);
					operadorasignacion();
					setState(157);
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
				setState(161);
				tipovariable();
				setState(162);
				nombrevariable();
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(163);
						separadoroperadores();
						setState(164);
						nombrevariable();
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				}
				break;
			}
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(173);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << STRING) | (1L << NUMERO))) != 0)) {
				{
				setState(176);
				tipovariable();
				}
			}

			setState(179);
			nombrevariable();
			setState(180);
			operadorasignacion();
			setState(181);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			operadoraperturaparentesis();
			setState(184);
			expresionlogica();
			setState(185);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterOperacionswitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitOperacionswitch(this);
		}
	}

	public final OperacionswitchContext operacionswitch() throws RecognitionException {
		OperacionswitchContext _localctx = new OperacionswitchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operacionswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			cabeceraswitch();
			setState(188);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterCabeceraswitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitCabeceraswitch(this);
		}
	}

	public final CabeceraswitchContext cabeceraswitch() throws RecognitionException {
		CabeceraswitchContext _localctx = new CabeceraswitchContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cabeceraswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			palabrareservadaaperturaswitch();
			setState(191);
			operadoraperturaparentesis();
			setState(192);
			expr(0);
			setState(193);
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
		public List<CuerpoContext> cuerpo() {
			return getRuleContexts(CuerpoContext.class);
		}
		public CuerpoContext cuerpo(int i) {
			return getRuleContext(CuerpoContext.class,i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterCuerposwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitCuerposwitch(this);
		}
	}

	public final CuerposwitchContext cuerposwitch() throws RecognitionException {
		CuerposwitchContext _localctx = new CuerposwitchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cuerposwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				palabrareservadacase();
				setState(196);
				expr(0);
				setState(197);
				separadordospuntos();
				setState(198);
				cuerpo();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(199);
					palabrareservadabreak();
					setState(200);
					separadoroperaciones();
					}
				}

				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			{
			setState(208);
			palabrareservadadefault();
			setState(209);
			separadordospuntos();
			setState(210);
			cuerpo();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(211);
				palabrareservadabreak();
				setState(212);
				separadoroperaciones();
				}
			}

			}
			setState(216);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterCondicionales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitCondicionales(this);
		}
	}

	public final CondicionalesContext condicionales() throws RecognitionException {
		CondicionalesContext _localctx = new CondicionalesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicionales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			palabraclavecondiciones();
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				{
				setState(219);
				condicion();
				}
				}
				break;
			case 2:
				{
				{
				setState(220);
				condicion();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUERTALOGICAAND || _la==PUERTALOGICAOR) {
					{
					{
					setState(221);
					operadorcondicionalpuertalogica();
					setState(222);
					condicion();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(231);
				palabraclavethen();
				}
			}

			setState(234);
			cuerpo();
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(235);
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
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpresionlogicaContext expresionlogica() {
			return getRuleContext(ExpresionlogicaContext.class,0);
		}
		public FuncionwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterFuncionwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitFuncionwhile(this);
		}
	}

	public final FuncionwhileContext funcionwhile() throws RecognitionException {
		FuncionwhileContext _localctx = new FuncionwhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcionwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			palabraclavebuclewhile();
			setState(239);
			operadoraperturaparentesis();
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(240);
				expr(0);
				}
				break;
			case 2:
				{
				setState(241);
				expresionlogica();
				}
				break;
			}
			setState(244);
			operadorcierreparentesis();
			setState(245);
			cuerpo();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterFuncionfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitFuncionfor(this);
		}
	}

	public final FuncionforContext funcionfor() throws RecognitionException {
		FuncionforContext _localctx = new FuncionforContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcionfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			palabraclavebuclefor();
			setState(248);
			nombrevariable();
			setState(249);
			palabraclaveinciovalorfor();
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case ID:
				{
				setState(250);
				nombrevariable();
				}
				break;
			case DIGITO:
			case FLOTANTE:
				{
				setState(251);
				numeros();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(254);
			palabraclavefinvalorfor();
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case ID:
				{
				setState(255);
				nombrevariable();
				}
				break;
			case DIGITO:
			case FLOTANTE:
				{
				setState(256);
				numeros();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(259);
				palabraclavesaltoelementofor();
				setState(262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
				case ID:
					{
					setState(260);
					nombrevariable();
					}
					break;
				case DIGITO:
				case FLOTANTE:
					{
					setState(261);
					numeros();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(266);
			palabraclavehacerfor();
			setState(267);
			cuerpo();
			setState(268);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterCuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitCuerpo(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cuerpo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(270);
							palabraclaveinicio();
							}
							} 
						}
						setState(275);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					setState(277); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(276);
							codigo();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(279); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(281);
							palabraclavefin();
							}
							} 
						}
						setState(286);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(289); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterCuerpo2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitCuerpo2(this);
		}
	}

	public final Cuerpo2Context cuerpo2() throws RecognitionException {
		Cuerpo2Context _localctx = new Cuerpo2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_cuerpo2);
		int _la;
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
					setState(291);
					palabraclaveinicio();
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << BEGIN) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << DEVOLVER) | (1L << ID))) != 0)) {
						{
						{
						setState(292);
						codigo();
						}
						}
						setState(297);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(298);
					palabraclavefin();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(302); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterLlamarfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitLlamarfuncion(this);
		}
	}

	public final LlamarfuncionContext llamarfuncion() throws RecognitionException {
		LlamarfuncionContext _localctx = new LlamarfuncionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_llamarfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(304);
				nombrefuncion();
				setState(305);
				operadoraperturaparentesis();
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << PL) | (1L << DIGITO) | (1L << FLOTANTE) | (1L << ID) | (1L << CADENA))) != 0)) {
					{
					setState(306);
					parametros();
					}
				}

				setState(309);
				operadorcierreparentesis();
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(310);
					separadoroperaciones();
					}
					break;
				}
				}
				}
				break;
			case FOR:
				{
				setState(313);
				funcionfor();
				}
				break;
			case WHILE:
				{
				setState(314);
				funcionwhile();
				}
				break;
			case CONDICIONES:
				{
				setState(315);
				condicionales();
				}
				break;
			case SWITCH:
				{
				setState(316);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitCodigo(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_codigo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(319);
						funcionwhile();
						}
						break;
					case 2:
						{
						setState(320);
						funcionfor();
						}
						break;
					case 3:
						{
						setState(321);
						operacionswitch();
						}
						break;
					case 4:
						{
						setState(322);
						asignacion();
						}
						break;
					case 5:
						{
						setState(323);
						llamarfuncion();
						}
						break;
					case 6:
						{
						setState(324);
						devolver();
						}
						break;
					case 7:
						{
						setState(325);
						cuerpo2();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(328); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public CrearfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterCrearfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitCrearfuncion(this);
		}
	}

	public final CrearfuncionContext crearfuncion() throws RecognitionException {
		CrearfuncionContext _localctx = new CrearfuncionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_crearfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			cabecerafuncion();
			setState(331);
			cuerpo();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterDevolver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitDevolver(this);
		}
	}

	public final DevolverContext devolver() throws RecognitionException {
		DevolverContext _localctx = new DevolverContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_devolver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			palabraclavefunciondevolver();
			setState(334);
			operadoraperturaparentesis();
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(335);
				llamarfuncion();
				}
				break;
			case 2:
				{
				setState(336);
				expr(0);
				}
				break;
			}
			setState(339);
			operadorcierreparentesis();
			setState(340);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterCabecerafuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitCabecerafuncion(this);
		}
	}

	public final CabecerafuncionContext cabecerafuncion() throws RecognitionException {
		CabecerafuncionContext _localctx = new CabecerafuncionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cabecerafuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			palabraclavecreacionfuncion();
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(345);
				nombrefuncion();
				}
				break;
			case MAIN:
				{
				setState(346);
				palabraclavefuncionmain();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(349);
			operadoraperturaparentesis();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << PL) | (1L << DIGITO) | (1L << FLOTANTE) | (1L << ID) | (1L << CADENA))) != 0)) {
				{
				setState(350);
				parametros();
				}
			}

			setState(353);
			operadorcierreparentesis();
			setState(354);
			separadordospuntos();
			setState(355);
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
		public NumerosContext numeros() {
			return getRuleContext(NumerosContext.class,0);
		}
		public NombrevariableContext nombrevariable() {
			return getRuleContext(NombrevariableContext.class,0);
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
		public OperadoraperturaparentesisContext operadoraperturaparentesis() {
			return getRuleContext(OperadoraperturaparentesisContext.class,0);
		}
		public OperadorcierreparentesisContext operadorcierreparentesis() {
			return getRuleContext(OperadorcierreparentesisContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(358);
				llamarfuncion();
				}
				break;
			case 2:
				{
				setState(359);
				numeros();
				}
				break;
			case 3:
				{
				setState(360);
				nombrevariable();
				}
				break;
			case 4:
				{
				setState(361);
				cadena();
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(362);
						operadoraritmeticosuma();
						setState(363);
						expr(0);
						}
						} 
					}
					setState(369);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
			case 5:
				{
				setState(370);
				operadoraperturaparentesis();
				setState(371);
				expr(0);
				setState(372);
				operadorcierreparentesis();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(390);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(376);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(379);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PRODUCT:
							{
							setState(377);
							operadoraritmeticoproducto();
							}
							break;
						case DIVISION:
							{
							setState(378);
							operadoraritmeticodivision();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(381);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(383);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(386);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ADD:
							{
							setState(384);
							operadoraritmeticosuma();
							}
							break;
						case MINUS:
							{
							setState(385);
							operadoraritmeticoresta();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(388);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterExpresionlogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitExpresionlogica(this);
		}
	}

	public final ExpresionlogicaContext expresionlogica() throws RecognitionException {
		ExpresionlogicaContext _localctx = new ExpresionlogicaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expresionlogica);
		try {
			int _alt;
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
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
				case ID:
				case CADENA:
					{
					setState(395);
					expr(0);
					}
					break;
				case BOOLEAN:
					{
					setState(396);
					palabraclavebooleano();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(408); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(401);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MENORQUE:
						case MAYORQUE:
						case IGUALQUE:
						case DISTINTOQUE:
							{
							setState(399);
							operadorlogico();
							}
							break;
						case PUERTALOGICAAND:
						case PUERTALOGICAOR:
							{
							setState(400);
							operadorcondicionalpuertalogica();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(406);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
						case 1:
							{
							setState(403);
							expr(0);
							}
							break;
						case 2:
							{
							setState(404);
							palabraclavebooleano();
							}
							break;
						case 3:
							{
							setState(405);
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
					setState(410); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterNombrefuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitNombrefuncion(this);
		}
	}

	public final NombrefuncionContext nombrefuncion() throws RecognitionException {
		NombrefuncionContext _localctx = new NombrefuncionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nombrefuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
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
		public TerminalNode ID() { return getToken(Pl2compilerParser.ID, 0); }
		public TerminalNode CASE() { return getToken(Pl2compilerParser.CASE, 0); }
		public NombrevariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombrevariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterNombrevariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitNombrevariable(this);
		}
	}

	public final NombrevariableContext nombrevariable() throws RecognitionException {
		NombrevariableContext _localctx = new NombrevariableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nombrevariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if ( !(_la==CASE || _la==ID) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterNombrepaquete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitNombrepaquete(this);
		}
	}

	public final NombrepaqueteContext nombrepaquete() throws RecognitionException {
		NombrepaqueteContext _localctx = new NombrepaqueteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nombrepaquete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterOperadorasignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitOperadorasignacion(this);
		}
	}

	public final OperadorasignacionContext operadorasignacion() throws RecognitionException {
		OperadorasignacionContext _localctx = new OperadorasignacionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operadorasignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			parametro();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(424);
				separadoroperadores();
				setState(425);
				parametro();
				}
				}
				setState(431);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << STRING) | (1L << NUMERO))) != 0)) {
				{
				setState(432);
				tipovariable();
				}
			}

			setState(435);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterOperadoraritmeticoproducto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitOperadoraritmeticoproducto(this);
		}
	}

	public final OperadoraritmeticoproductoContext operadoraritmeticoproducto() throws RecognitionException {
		OperadoraritmeticoproductoContext _localctx = new OperadoraritmeticoproductoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operadoraritmeticoproducto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterOperadoraritmeticodivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitOperadoraritmeticodivision(this);
		}
	}

	public final OperadoraritmeticodivisionContext operadoraritmeticodivision() throws RecognitionException {
		OperadoraritmeticodivisionContext _localctx = new OperadoraritmeticodivisionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operadoraritmeticodivision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterOperadoraritmeticosuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitOperadoraritmeticosuma(this);
		}
	}

	public final OperadoraritmeticosumaContext operadoraritmeticosuma() throws RecognitionException {
		OperadoraritmeticosumaContext _localctx = new OperadoraritmeticosumaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operadoraritmeticosuma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterOperadoraritmeticoresta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitOperadoraritmeticoresta(this);
		}
	}

	public final OperadoraritmeticorestaContext operadoraritmeticoresta() throws RecognitionException {
		OperadoraritmeticorestaContext _localctx = new OperadoraritmeticorestaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operadoraritmeticoresta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterOperadoraritmeticosuma1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitOperadoraritmeticosuma1(this);
		}
	}

	public final Operadoraritmeticosuma1Context operadoraritmeticosuma1() throws RecognitionException {
		Operadoraritmeticosuma1Context _localctx = new Operadoraritmeticosuma1Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_operadoraritmeticosuma1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterOperadoraritmeticoresta1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitOperadoraritmeticoresta1(this);
		}
	}

	public final Operadoraritmeticoresta1Context operadoraritmeticoresta1() throws RecognitionException {
		Operadoraritmeticoresta1Context _localctx = new Operadoraritmeticoresta1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_operadoraritmeticoresta1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterOperadorlogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitOperadorlogico(this);
		}
	}

	public final OperadorlogicoContext operadorlogico() throws RecognitionException {
		OperadorlogicoContext _localctx = new OperadorlogicoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operadorlogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterOperadorcondicionalpuertalogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitOperadorcondicionalpuertalogica(this);
		}
	}

	public final OperadorcondicionalpuertalogicaContext operadorcondicionalpuertalogica() throws RecognitionException {
		OperadorcondicionalpuertalogicaContext _localctx = new OperadorcondicionalpuertalogicaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operadorcondicionalpuertalogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitCadena(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterSeparadoroperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitSeparadoroperaciones(this);
		}
	}

	public final SeparadoroperacionesContext separadoroperaciones() throws RecognitionException {
		SeparadoroperacionesContext _localctx = new SeparadoroperacionesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_separadoroperaciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterSeparadoroperadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitSeparadoroperadores(this);
		}
	}

	public final SeparadoroperadoresContext separadoroperadores() throws RecognitionException {
		SeparadoroperadoresContext _localctx = new SeparadoroperadoresContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_separadoroperadores);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterSeparadordospuntos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitSeparadordospuntos(this);
		}
	}

	public final SeparadordospuntosContext separadordospuntos() throws RecognitionException {
		SeparadordospuntosContext _localctx = new SeparadordospuntosContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_separadordospuntos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterOperadoraperturaparentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitOperadoraperturaparentesis(this);
		}
	}

	public final OperadoraperturaparentesisContext operadoraperturaparentesis() throws RecognitionException {
		OperadoraperturaparentesisContext _localctx = new OperadoraperturaparentesisContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_operadoraperturaparentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterOperadorcierreparentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitOperadorcierreparentesis(this);
		}
	}

	public final OperadorcierreparentesisContext operadorcierreparentesis() throws RecognitionException {
		OperadorcierreparentesisContext _localctx = new OperadorcierreparentesisContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operadorcierreparentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterTipovariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitTipovariable(this);
		}
	}

	public final TipovariableContext tipovariable() throws RecognitionException {
		TipovariableContext _localctx = new TipovariableContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tipovariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterComentarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitComentarios(this);
		}
	}

	public final ComentariosContext comentarios() throws RecognitionException {
		ComentariosContext _localctx = new ComentariosContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_comentarios);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitEntero(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_entero);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(469);
					match(DIGITO);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(472); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterFlotante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitFlotante(this);
		}
	}

	public final FlotanteContext flotante() throws RecognitionException {
		FlotanteContext _localctx = new FlotanteContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_flotante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterNumeros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitNumeros(this);
		}
	}

	public final NumerosContext numeros() throws RecognitionException {
		NumerosContext _localctx = new NumerosContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_numeros);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITO:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				entero();
				}
				break;
			case FLOTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclavebooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclavebooleano(this);
		}
	}

	public final PalabraclavebooleanoContext palabraclavebooleano() throws RecognitionException {
		PalabraclavebooleanoContext _localctx = new PalabraclavebooleanoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_palabraclavebooleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclavebuclefor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclavebuclefor(this);
		}
	}

	public final PalabraclavebucleforContext palabraclavebuclefor() throws RecognitionException {
		PalabraclavebucleforContext _localctx = new PalabraclavebucleforContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_palabraclavebuclefor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclaveendbuclefor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclaveendbuclefor(this);
		}
	}

	public final PalabraclaveendbucleforContext palabraclaveendbuclefor() throws RecognitionException {
		PalabraclaveendbucleforContext _localctx = new PalabraclaveendbucleforContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_palabraclaveendbuclefor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclaveinciovalorfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclaveinciovalorfor(this);
		}
	}

	public final PalabraclaveinciovalorforContext palabraclaveinciovalorfor() throws RecognitionException {
		PalabraclaveinciovalorforContext _localctx = new PalabraclaveinciovalorforContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_palabraclaveinciovalorfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclavesaltoelementofor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclavesaltoelementofor(this);
		}
	}

	public final PalabraclavesaltoelementoforContext palabraclavesaltoelementofor() throws RecognitionException {
		PalabraclavesaltoelementoforContext _localctx = new PalabraclavesaltoelementoforContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_palabraclavesaltoelementofor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclavefinvalorfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclavefinvalorfor(this);
		}
	}

	public final PalabraclavefinvalorforContext palabraclavefinvalorfor() throws RecognitionException {
		PalabraclavefinvalorforContext _localctx = new PalabraclavefinvalorforContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_palabraclavefinvalorfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclavehacerfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclavehacerfor(this);
		}
	}

	public final PalabraclavehacerforContext palabraclavehacerfor() throws RecognitionException {
		PalabraclavehacerforContext _localctx = new PalabraclavehacerforContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_palabraclavehacerfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclavebuclewhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclavebuclewhile(this);
		}
	}

	public final PalabraclavebuclewhileContext palabraclavebuclewhile() throws RecognitionException {
		PalabraclavebuclewhileContext _localctx = new PalabraclavebuclewhileContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_palabraclavebuclewhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabrareservadaaperturaswitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabrareservadaaperturaswitch(this);
		}
	}

	public final PalabrareservadaaperturaswitchContext palabrareservadaaperturaswitch() throws RecognitionException {
		PalabrareservadaaperturaswitchContext _localctx = new PalabrareservadaaperturaswitchContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_palabrareservadaaperturaswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabrareservadacierrewitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabrareservadacierrewitch(this);
		}
	}

	public final PalabrareservadacierrewitchContext palabrareservadacierrewitch() throws RecognitionException {
		PalabrareservadacierrewitchContext _localctx = new PalabrareservadacierrewitchContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_palabrareservadacierrewitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabrareservadacase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabrareservadacase(this);
		}
	}

	public final PalabrareservadacaseContext palabrareservadacase() throws RecognitionException {
		PalabrareservadacaseContext _localctx = new PalabrareservadacaseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_palabrareservadacase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabrareservadabreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabrareservadabreak(this);
		}
	}

	public final PalabrareservadabreakContext palabrareservadabreak() throws RecognitionException {
		PalabrareservadabreakContext _localctx = new PalabrareservadabreakContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_palabrareservadabreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabrareservadadefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabrareservadadefault(this);
		}
	}

	public final PalabrareservadadefaultContext palabrareservadadefault() throws RecognitionException {
		PalabrareservadadefaultContext _localctx = new PalabrareservadadefaultContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_palabrareservadadefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclavecondiciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclavecondiciones(this);
		}
	}

	public final PalabraclavecondicionesContext palabraclavecondiciones() throws RecognitionException {
		PalabraclavecondicionesContext _localctx = new PalabraclavecondicionesContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_palabraclavecondiciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclavethen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclavethen(this);
		}
	}

	public final PalabraclavethenContext palabraclavethen() throws RecognitionException {
		PalabraclavethenContext _localctx = new PalabraclavethenContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_palabraclavethen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclaveendif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclaveendif(this);
		}
	}

	public final PalabraclaveendifContext palabraclaveendif() throws RecognitionException {
		PalabraclaveendifContext _localctx = new PalabraclaveendifContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_palabraclaveendif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclaveincluirlibreria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclaveincluirlibreria(this);
		}
	}

	public final PalabraclaveincluirlibreriaContext palabraclaveincluirlibreria() throws RecognitionException {
		PalabraclaveincluirlibreriaContext _localctx = new PalabraclaveincluirlibreriaContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_palabraclaveincluirlibreria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclavecreacionfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclavecreacionfuncion(this);
		}
	}

	public final PalabraclavecreacionfuncionContext palabraclavecreacionfuncion() throws RecognitionException {
		PalabraclavecreacionfuncionContext _localctx = new PalabraclavecreacionfuncionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_palabraclavecreacionfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclavefuncionmain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclavefuncionmain(this);
		}
	}

	public final PalabraclavefuncionmainContext palabraclavefuncionmain() throws RecognitionException {
		PalabraclavefuncionmainContext _localctx = new PalabraclavefuncionmainContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_palabraclavefuncionmain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclavefunciondevolver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclavefunciondevolver(this);
		}
	}

	public final PalabraclavefunciondevolverContext palabraclavefunciondevolver() throws RecognitionException {
		PalabraclavefunciondevolverContext _localctx = new PalabraclavefunciondevolverContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_palabraclavefunciondevolver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclaveinicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclaveinicio(this);
		}
	}

	public final PalabraclaveinicioContext palabraclaveinicio() throws RecognitionException {
		PalabraclaveinicioContext _localctx = new PalabraclaveinicioContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_palabraclaveinicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).enterPalabraclavefin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Pl2compilerParserListener ) ((Pl2compilerParserListener)listener).exitPalabraclavefin(this);
		}
	}

	public final PalabraclavefinContext palabraclavefin() throws RecognitionException {
		PalabraclavefinContext _localctx = new PalabraclavefinContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_palabraclavefin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
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
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u020f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\6\2\u008f"+
		"\n\2\r\2\16\2\u0090\3\3\3\3\3\3\3\3\6\3\u0097\n\3\r\3\16\3\u0098\3\4\5"+
		"\4\u009c\n\4\3\4\3\4\3\4\3\4\5\4\u00a2\n\4\3\4\3\4\3\4\3\4\3\4\7\4\u00a9"+
		"\n\4\f\4\16\4\u00ac\13\4\5\4\u00ae\n\4\3\4\5\4\u00b1\n\4\3\5\5\5\u00b4"+
		"\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cd\n\t\6\t\u00cf\n\t\r\t\16\t\u00d0"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d9\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u00e3\n\n\f\n\16\n\u00e6\13\n\5\n\u00e8\n\n\3\n\5\n\u00eb\n\n\3\n"+
		"\3\n\5\n\u00ef\n\n\3\13\3\13\3\13\3\13\5\13\u00f5\n\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00ff\n\f\3\f\3\f\3\f\5\f\u0104\n\f\3\f\3\f\3"+
		"\f\5\f\u0109\n\f\5\f\u010b\n\f\3\f\3\f\3\f\3\f\3\r\7\r\u0112\n\r\f\r\16"+
		"\r\u0115\13\r\3\r\6\r\u0118\n\r\r\r\16\r\u0119\3\r\7\r\u011d\n\r\f\r\16"+
		"\r\u0120\13\r\6\r\u0122\n\r\r\r\16\r\u0123\3\16\3\16\7\16\u0128\n\16\f"+
		"\16\16\16\u012b\13\16\3\16\3\16\6\16\u012f\n\16\r\16\16\16\u0130\3\17"+
		"\3\17\3\17\5\17\u0136\n\17\3\17\3\17\5\17\u013a\n\17\3\17\3\17\3\17\3"+
		"\17\5\17\u0140\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u0149\n\20"+
		"\r\20\16\20\u014a\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0154\n\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\5\24\u015e\n\24\3\24\3\24\5\24"+
		"\u0162\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u0170\n\25\f\25\16\25\u0173\13\25\3\25\3\25\3\25\3\25\5\25\u0179"+
		"\n\25\3\25\3\25\3\25\5\25\u017e\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u0185"+
		"\n\25\3\25\3\25\7\25\u0189\n\25\f\25\16\25\u018c\13\25\3\26\3\26\5\26"+
		"\u0190\n\26\3\26\3\26\5\26\u0194\n\26\3\26\3\26\3\26\5\26\u0199\n\26\6"+
		"\26\u019b\n\26\r\26\16\26\u019c\3\26\5\26\u01a0\n\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u01ae\n\33\f\33\16\33"+
		"\u01b1\13\33\3\34\5\34\u01b4\n\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\6-\u01d9\n-\r-\16-\u01da\3.\3.\3/\3/\5/\u01e1\n/\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3"+
		"B\3B\3C\3C\3D\3D\3E\3E\3E\2\3(F\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\2\7\4\2\6\6\67\67\3\2.\61\3\2\62\63\4\2\24\25\35\35"+
		"\3\2:=\2\u020c\2\u008e\3\2\2\2\4\u0096\3\2\2\2\6\u00ad\3\2\2\2\b\u00b3"+
		"\3\2\2\2\n\u00b9\3\2\2\2\f\u00bd\3\2\2\2\16\u00c0\3\2\2\2\20\u00ce\3\2"+
		"\2\2\22\u00dc\3\2\2\2\24\u00f0\3\2\2\2\26\u00f9\3\2\2\2\30\u0121\3\2\2"+
		"\2\32\u012e\3\2\2\2\34\u013f\3\2\2\2\36\u0148\3\2\2\2 \u014c\3\2\2\2\""+
		"\u014f\3\2\2\2$\u0158\3\2\2\2&\u015a\3\2\2\2(\u0178\3\2\2\2*\u019f\3\2"+
		"\2\2,\u01a1\3\2\2\2.\u01a3\3\2\2\2\60\u01a5\3\2\2\2\62\u01a7\3\2\2\2\64"+
		"\u01a9\3\2\2\2\66\u01b3\3\2\2\28\u01b7\3\2\2\2:\u01b9\3\2\2\2<\u01bb\3"+
		"\2\2\2>\u01bd\3\2\2\2@\u01bf\3\2\2\2B\u01c1\3\2\2\2D\u01c3\3\2\2\2F\u01c5"+
		"\3\2\2\2H\u01c7\3\2\2\2J\u01c9\3\2\2\2L\u01cb\3\2\2\2N\u01cd\3\2\2\2P"+
		"\u01cf\3\2\2\2R\u01d1\3\2\2\2T\u01d3\3\2\2\2V\u01d5\3\2\2\2X\u01d8\3\2"+
		"\2\2Z\u01dc\3\2\2\2\\\u01e0\3\2\2\2^\u01e2\3\2\2\2`\u01e4\3\2\2\2b\u01e6"+
		"\3\2\2\2d\u01e8\3\2\2\2f\u01ea\3\2\2\2h\u01ec\3\2\2\2j\u01ee\3\2\2\2l"+
		"\u01f0\3\2\2\2n\u01f2\3\2\2\2p\u01f4\3\2\2\2r\u01f6\3\2\2\2t\u01f8\3\2"+
		"\2\2v\u01fa\3\2\2\2x\u01fc\3\2\2\2z\u01fe\3\2\2\2|\u0200\3\2\2\2~\u0202"+
		"\3\2\2\2\u0080\u0204\3\2\2\2\u0082\u0206\3\2\2\2\u0084\u0208\3\2\2\2\u0086"+
		"\u020a\3\2\2\2\u0088\u020c\3\2\2\2\u008a\u008f\5\4\3\2\u008b\u008f\5("+
		"\25\2\u008c\u008f\5\6\4\2\u008d\u008f\5 \21\2\u008e\u008a\3\2\2\2\u008e"+
		"\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\3\3\2\2\2\u0092\u0093"+
		"\5~@\2\u0093\u0094\5\60\31\2\u0094\u0095\5J&\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0092\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\5\3\2\2\2\u009a\u009c\5T+\2\u009b\u009a\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a1\5.\30\2\u009e\u009f\5\62\32\2"+
		"\u009f\u00a0\5(\25\2\u00a0\u00a2\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00ae\3\2\2\2\u00a3\u00a4\5T+\2\u00a4\u00aa\5.\30\2\u00a5"+
		"\u00a6\5L\'\2\u00a6\u00a7\5.\30\2\u00a7\u00a9\3\2\2\2\u00a8\u00a5\3\2"+
		"\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u009b\3\2\2\2\u00ad\u00a3\3\2"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u00b1\5J&\2\u00b0\u00af\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\7\3\2\2\2\u00b2\u00b4\5T+\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\5.\30\2\u00b6\u00b7\5\62\32\2"+
		"\u00b7\u00b8\5(\25\2\u00b8\t\3\2\2\2\u00b9\u00ba\5P)\2\u00ba\u00bb\5*"+
		"\26\2\u00bb\u00bc\5R*\2\u00bc\13\3\2\2\2\u00bd\u00be\5\16\b\2\u00be\u00bf"+
		"\5\20\t\2\u00bf\r\3\2\2\2\u00c0\u00c1\5n8\2\u00c1\u00c2\5P)\2\u00c2\u00c3"+
		"\5(\25\2\u00c3\u00c4\5R*\2\u00c4\17\3\2\2\2\u00c5\u00c6\5r:\2\u00c6\u00c7"+
		"\5(\25\2\u00c7\u00c8\5N(\2\u00c8\u00cc\5\30\r\2\u00c9\u00ca\5t;\2\u00ca"+
		"\u00cb\5J&\2\u00cb\u00cd\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00cd\3\2\2"+
		"\2\u00cd\u00cf\3\2\2\2\u00ce\u00c5\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\5v<\2\u00d3"+
		"\u00d4\5N(\2\u00d4\u00d8\5\30\r\2\u00d5\u00d6\5t;\2\u00d6\u00d7\5J&\2"+
		"\u00d7\u00d9\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00db\5p9\2\u00db\21\3\2\2\2\u00dc\u00e7\5x=\2\u00dd\u00e8"+
		"\5\n\6\2\u00de\u00e4\5\n\6\2\u00df\u00e0\5F$\2\u00e0\u00e1\5\n\6\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00dd\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00eb\5z>\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ee\5\30\r\2\u00ed\u00ef\5|?\2\u00ee\u00ed\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\23\3\2\2\2\u00f0\u00f1\5l\67\2\u00f1\u00f4\5P)\2"+
		"\u00f2\u00f5\5(\25\2\u00f3\u00f5\5*\26\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\5R*\2\u00f7\u00f8\5\30\r\2\u00f8"+
		"\25\3\2\2\2\u00f9\u00fa\5`\61\2\u00fa\u00fb\5.\30\2\u00fb\u00fe\5d\63"+
		"\2\u00fc\u00ff\5.\30\2\u00fd\u00ff\5\\/\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\5h\65\2\u0101\u0104\5.\30\2\u0102"+
		"\u0104\5\\/\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u010a\3\2"+
		"\2\2\u0105\u0108\5f\64\2\u0106\u0109\5.\30\2\u0107\u0109\5\\/\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0105\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\5j\66\2\u010d"+
		"\u010e\5\30\r\2\u010e\u010f\5b\62\2\u010f\27\3\2\2\2\u0110\u0112\5\u0086"+
		"D\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\5\36"+
		"\20\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011e\3\2\2\2\u011b\u011d\5\u0088E\2\u011c\u011b"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0113\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\31\3\2\2\2\u0125\u0129"+
		"\5\u0086D\2\u0126\u0128\5\36\20\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\5\u0088E\2\u012d\u012f\3\2\2\2\u012e\u0125"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\33\3\2\2\2\u0132\u0133\5,\27\2\u0133\u0135\5P)\2\u0134\u0136\5\64\33"+
		"\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139"+
		"\5R*\2\u0138\u013a\5J&\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0140\3\2\2\2\u013b\u0140\5\26\f\2\u013c\u0140\5\24\13\2\u013d\u0140"+
		"\5\22\n\2\u013e\u0140\5\f\7\2\u013f\u0132\3\2\2\2\u013f\u013b\3\2\2\2"+
		"\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\35"+
		"\3\2\2\2\u0141\u0149\5\24\13\2\u0142\u0149\5\26\f\2\u0143\u0149\5\f\7"+
		"\2\u0144\u0149\5\6\4\2\u0145\u0149\5\34\17\2\u0146\u0149\5\"\22\2\u0147"+
		"\u0149\5\32\16\2\u0148\u0141\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0143\3"+
		"\2\2\2\u0148\u0144\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\37\3\2\2\2\u014c\u014d\5&\24\2\u014d\u014e\5\30\r\2\u014e!"+
		"\3\2\2\2\u014f\u0150\5\u0084C\2\u0150\u0153\5P)\2\u0151\u0154\5\34\17"+
		"\2\u0152\u0154\5(\25\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\5R*\2\u0156\u0157\5J&\2\u0157"+
		"#\3\2\2\2\u0158\u0159\5T+\2\u0159%\3\2\2\2\u015a\u015d\5\u0080A\2\u015b"+
		"\u015e\5,\27\2\u015c\u015e\5\u0082B\2\u015d\u015b\3\2\2\2\u015d\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\5P)\2\u0160\u0162\5\64\33\2\u0161"+
		"\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\5R"+
		"*\2\u0164\u0165\5N(\2\u0165\u0166\5$\23\2\u0166\'\3\2\2\2\u0167\u0168"+
		"\b\25\1\2\u0168\u0179\5\34\17\2\u0169\u0179\5\\/\2\u016a\u0179\5.\30\2"+
		"\u016b\u0171\5H%\2\u016c\u016d\5<\37\2\u016d\u016e\5(\25\2\u016e\u0170"+
		"\3\2\2\2\u016f\u016c\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0179\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\5P"+
		")\2\u0175\u0176\5(\25\2\u0176\u0177\5R*\2\u0177\u0179\3\2\2\2\u0178\u0167"+
		"\3\2\2\2\u0178\u0169\3\2\2\2\u0178\u016a\3\2\2\2\u0178\u016b\3\2\2\2\u0178"+
		"\u0174\3\2\2\2\u0179\u018a\3\2\2\2\u017a\u017d\f\t\2\2\u017b\u017e\58"+
		"\35\2\u017c\u017e\5:\36\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\5(\25\n\u0180\u0189\3\2\2\2\u0181\u0184\f\b"+
		"\2\2\u0182\u0185\5<\37\2\u0183\u0185\5> \2\u0184\u0182\3\2\2\2\u0184\u0183"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\5(\25\t\u0187\u0189\3\2\2\2\u0188"+
		"\u017a\3\2\2\2\u0188\u0181\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2"+
		"\2\2\u018a\u018b\3\2\2\2\u018b)\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0190"+
		"\5(\25\2\u018e\u0190\5^\60\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190"+
		"\u019a\3\2\2\2\u0191\u0194\5D#\2\u0192\u0194\5F$\2\u0193\u0191\3\2\2\2"+
		"\u0193\u0192\3\2\2\2\u0194\u0198\3\2\2\2\u0195\u0199\5(\25\2\u0196\u0199"+
		"\5^\60\2\u0197\u0199\5*\26\2\u0198\u0195\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0197\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0193\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a0\3\2\2\2\u019e"+
		"\u01a0\5^\60\2\u019f\u018f\3\2\2\2\u019f\u019e\3\2\2\2\u01a0+\3\2\2\2"+
		"\u01a1\u01a2\7\67\2\2\u01a2-\3\2\2\2\u01a3\u01a4\t\2\2\2\u01a4/\3\2\2"+
		"\2\u01a5\u01a6\7\67\2\2\u01a6\61\3\2\2\2\u01a7\u01a8\7,\2\2\u01a8\63\3"+
		"\2\2\2\u01a9\u01af\5\66\34\2\u01aa\u01ab\5L\'\2\u01ab\u01ac\5\66\34\2"+
		"\u01ac\u01ae\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\65\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2"+
		"\u01b4\5T+\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2"+
		"\2\u01b5\u01b6\5(\25\2\u01b6\67\3\2\2\2\u01b7\u01b8\7*\2\2\u01b89\3\2"+
		"\2\2\u01b9\u01ba\7+\2\2\u01ba;\3\2\2\2\u01bb\u01bc\7(\2\2\u01bc=\3\2\2"+
		"\2\u01bd\u01be\7)\2\2\u01be?\3\2\2\2\u01bf\u01c0\7&\2\2\u01c0A\3\2\2\2"+
		"\u01c1\u01c2\7\'\2\2\u01c2C\3\2\2\2\u01c3\u01c4\t\3\2\2\u01c4E\3\2\2\2"+
		"\u01c5\u01c6\t\4\2\2\u01c6G\3\2\2\2\u01c7\u01c8\79\2\2\u01c8I\3\2\2\2"+
		"\u01c9\u01ca\7 \2\2\u01caK\3\2\2\2\u01cb\u01cc\7%\2\2\u01ccM\3\2\2\2\u01cd"+
		"\u01ce\7#\2\2\u01ceO\3\2\2\2\u01cf\u01d0\7!\2\2\u01d0Q\3\2\2\2\u01d1\u01d2"+
		"\7\"\2\2\u01d2S\3\2\2\2\u01d3\u01d4\t\5\2\2\u01d4U\3\2\2\2\u01d5\u01d6"+
		"\t\6\2\2\u01d6W\3\2\2\2\u01d7\u01d9\7\64\2\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01dbY\3\2\2\2"+
		"\u01dc\u01dd\7\65\2\2\u01dd[\3\2\2\2\u01de\u01e1\5X-\2\u01df\u01e1\5Z"+
		".\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1]\3\2\2\2\u01e2\u01e3"+
		"\7\t\2\2\u01e3_\3\2\2\2\u01e4\u01e5\7\27\2\2\u01e5a\3\2\2\2\u01e6\u01e7"+
		"\7\30\2\2\u01e7c\3\2\2\2\u01e8\u01e9\7\31\2\2\u01e9e\3\2\2\2\u01ea\u01eb"+
		"\7\32\2\2\u01ebg\3\2\2\2\u01ec\u01ed\7\33\2\2\u01edi\3\2\2\2\u01ee\u01ef"+
		"\7\34\2\2\u01efk\3\2\2\2\u01f0\u01f1\7\26\2\2\u01f1m\3\2\2\2\u01f2\u01f3"+
		"\7\4\2\2\u01f3o\3\2\2\2\u01f4\u01f5\7\5\2\2\u01f5q\3\2\2\2\u01f6\u01f7"+
		"\7\6\2\2\u01f7s\3\2\2\2\u01f8\u01f9\7\7\2\2\u01f9u\3\2\2\2\u01fa\u01fb"+
		"\7\b\2\2\u01fbw\3\2\2\2\u01fc\u01fd\7\3\2\2\u01fdy\3\2\2\2\u01fe\u01ff"+
		"\7\16\2\2\u01ff{\3\2\2\2\u0200\u0201\7\17\2\2\u0201}\3\2\2\2\u0202\u0203"+
		"\7\22\2\2\u0203\177\3\2\2\2\u0204\u0205\7\23\2\2\u0205\u0081\3\2\2\2\u0206"+
		"\u0207\7\37\2\2\u0207\u0083\3\2\2\2\u0208\u0209\7\36\2\2\u0209\u0085\3"+
		"\2\2\2\u020a\u020b\7\20\2\2\u020b\u0087\3\2\2\2\u020c\u020d\7\21\2\2\u020d"+
		"\u0089\3\2\2\2\64\u008e\u0090\u0098\u009b\u00a1\u00aa\u00ad\u00b0\u00b3"+
		"\u00cc\u00d0\u00d8\u00e4\u00e7\u00ea\u00ee\u00f4\u00fe\u0103\u0108\u010a"+
		"\u0113\u0119\u011e\u0123\u0129\u0130\u0135\u0139\u013f\u0148\u014a\u0153"+
		"\u015d\u0161\u0171\u0178\u017d\u0184\u0188\u018a\u018f\u0193\u0198\u019c"+
		"\u019f\u01af\u01b3\u01da\u01e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}