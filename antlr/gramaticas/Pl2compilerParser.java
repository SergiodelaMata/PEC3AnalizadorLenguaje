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
		DIGITO=50, FLOTANTE=51, NEWLINE=52, ARRAY=53, ID=54, NOMBREPAQUETE=55, 
		CADENA=56, COMENTARIO_LINEA=57, COMENTARIO_LINEA2=58, COMENTARIO_BLOQUE=59, 
		COMENTARIO_DOCUMENTACION=60, WS=61;
	public static final int
		RULE_prog = 0, RULE_libreria = 1, RULE_asignacion = 2, RULE_condicion = 3, 
		RULE_operacionswitch = 4, RULE_cabeceraswitch = 5, RULE_cuerposwitch = 6, 
		RULE_condicional = 7, RULE_condicionales = 8, RULE_funcionwhile = 9, RULE_funcionfor = 10, 
		RULE_cuerpo = 11, RULE_cuerpo2 = 12, RULE_cuerpo3 = 13, RULE_cuerpo4 = 14, 
		RULE_llamarfuncion = 15, RULE_codigo = 16, RULE_crearfuncion = 17, RULE_devolver = 18, 
		RULE_retorno = 19, RULE_cabecerafuncion = 20, RULE_expr = 21, RULE_expresionlogica = 22, 
		RULE_nombrefuncion = 23, RULE_nombrevariable = 24, RULE_nombrepaquete = 25, 
		RULE_operadorasignacion = 26, RULE_parametros = 27, RULE_parametro = 28, 
		RULE_operadoraritmeticoproducto = 29, RULE_operadoraritmeticodivision = 30, 
		RULE_operadoraritmeticosuma = 31, RULE_operadoraritmeticoresta = 32, RULE_operadoraritmeticosuma1 = 33, 
		RULE_operadoraritmeticoresta1 = 34, RULE_operadorlogico = 35, RULE_operadorcondicionalpuertalogica = 36, 
		RULE_cadena = 37, RULE_separadoroperaciones = 38, RULE_separadoroperadores = 39, 
		RULE_separadordospuntos = 40, RULE_operadoraperturaparentesis = 41, RULE_operadorcierreparentesis = 42, 
		RULE_tipovariable = 43, RULE_comentarios = 44, RULE_entero = 45, RULE_flotante = 46, 
		RULE_numeros = 47, RULE_palabraclavebooleano = 48, RULE_palabraclavebuclefor = 49, 
		RULE_palabraclaveendbuclefor = 50, RULE_palabraclaveinciovalorfor = 51, 
		RULE_palabraclavesaltoelementofor = 52, RULE_palabraclavefinvalorfor = 53, 
		RULE_palabraclavehacerfor = 54, RULE_palabraclavebuclewhile = 55, RULE_palabrareservadaaperturaswitch = 56, 
		RULE_palabrareservadacierrewitch = 57, RULE_palabrareservadacase = 58, 
		RULE_palabrareservadabreak = 59, RULE_palabrareservadadefault = 60, RULE_palabraclavecondiciones = 61, 
		RULE_palabraclavethen = 62, RULE_palabraclaveendif = 63, RULE_palabraclaveincluirlibreria = 64, 
		RULE_palabraclavecreacionfuncion = 65, RULE_palabraclavefuncionmain = 66, 
		RULE_palabraclavefunciondevolver = 67, RULE_palabraclaveinicio = 68, RULE_palabraclavefin = 69;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "libreria", "asignacion", "condicion", "operacionswitch", "cabeceraswitch", 
			"cuerposwitch", "condicional", "condicionales", "funcionwhile", "funcionfor", 
			"cuerpo", "cuerpo2", "cuerpo3", "cuerpo4", "llamarfuncion", "codigo", 
			"crearfuncion", "devolver", "retorno", "cabecerafuncion", "expr", "expresionlogica", 
			"nombrefuncion", "nombrevariable", "nombrepaquete", "operadorasignacion", 
			"parametros", "parametro", "operadoraritmeticoproducto", "operadoraritmeticodivision", 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(140);
					libreria();
					}
					break;
				case 2:
					{
					setState(141);
					expr(0);
					}
					break;
				case 3:
					{
					setState(142);
					asignacion();
					}
					break;
				case 4:
					{
					setState(143);
					crearfuncion();
					}
					break;
				}
				}
				setState(146); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitLibreria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibreriaContext libreria() throws RecognitionException {
		LibreriaContext _localctx = new LibreriaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_libreria);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(148);
					palabraclaveincluirlibreria();
					setState(149);
					nombrepaquete();
					setState(150);
					separadoroperaciones();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154); 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << STRING) | (1L << NUMERO))) != 0)) {
					{
					setState(156);
					tipovariable();
					}
				}

				setState(159);
				nombrevariable();
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(160);
					operadorasignacion();
					setState(161);
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
				setState(165);
				tipovariable();
				setState(166);
				nombrevariable();
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(167);
						separadoroperadores();
						setState(168);
						nombrevariable();
						}
						} 
					}
					setState(174);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				}
				break;
			}
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(177);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			operadoraperturaparentesis();
			setState(181);
			expresionlogica();
			setState(182);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitOperacionswitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionswitchContext operacionswitch() throws RecognitionException {
		OperacionswitchContext _localctx = new OperacionswitchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operacionswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			cabeceraswitch();
			setState(185);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCabeceraswitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabeceraswitchContext cabeceraswitch() throws RecognitionException {
		CabeceraswitchContext _localctx = new CabeceraswitchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cabeceraswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			palabrareservadaaperturaswitch();
			setState(188);
			operadoraperturaparentesis();
			setState(189);
			expr(0);
			setState(190);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCuerposwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerposwitchContext cuerposwitch() throws RecognitionException {
		CuerposwitchContext _localctx = new CuerposwitchContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cuerposwitch);
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
				setState(192);
				palabrareservadacase();
				setState(193);
				expr(0);
				setState(194);
				separadordospuntos();
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(195);
					cuerpo3();
					}
					break;
				case 2:
					{
					setState(196);
					cuerpo();
					}
					break;
				}
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(210);
				cuerpo3();
				}
				break;
			case 2:
				{
				setState(211);
				cuerpo();
				}
				break;
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(214);
				palabrareservadabreak();
				setState(215);
				separadoroperaciones();
				}
			}

			}
			setState(219);
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

	public static class CondicionalContext extends ParserRuleContext {
		public PalabraclavecondicionesContext palabraclavecondiciones() {
			return getRuleContext(PalabraclavecondicionesContext.class,0);
		}
		public Cuerpo3Context cuerpo3() {
			return getRuleContext(Cuerpo3Context.class,0);
		}
		public Cuerpo4Context cuerpo4() {
			return getRuleContext(Cuerpo4Context.class,0);
		}
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public PalabraclavethenContext palabraclavethen() {
			return getRuleContext(PalabraclavethenContext.class,0);
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
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221);
			palabraclavecondiciones();
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				{
				setState(222);
				condicion();
				}
				}
				break;
			case 2:
				{
				{
				setState(223);
				condicion();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUERTALOGICAAND || _la==PUERTALOGICAOR) {
					{
					{
					setState(224);
					operadorcondicionalpuertalogica();
					setState(225);
					condicion();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(234);
				palabraclavethen();
				}
			}

			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(237);
				cuerpo3();
				}
				break;
			case 2:
				{
				setState(238);
				cuerpo4();
				}
				break;
			case 3:
				{
				setState(239);
				cuerpo();
				}
				break;
			}
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

	public static class CondicionalesContext extends ParserRuleContext {
		public PalabraclaveendifContext palabraclaveendif() {
			return getRuleContext(PalabraclaveendifContext.class,0);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public CondicionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionales; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCondicionales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalesContext condicionales() throws RecognitionException {
		CondicionalesContext _localctx = new CondicionalesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicionales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				condicional();
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONDICIONES );
			setState(247);
			palabraclaveendif();
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
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public Cuerpo3Context cuerpo3() {
			return getRuleContext(Cuerpo3Context.class,0);
		}
		public Cuerpo4Context cuerpo4() {
			return getRuleContext(Cuerpo4Context.class,0);
		}
		public FuncionwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionwhile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitFuncionwhile(this);
			else return visitor.visitChildren(this);
		}
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
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
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
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(256);
				cuerpo();
				}
				break;
			case 2:
				{
				setState(257);
				cuerpo3();
				}
				break;
			case 3:
				{
				setState(258);
				cuerpo4();
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
		public PalabraclaveendbucleforContext palabraclaveendbuclefor() {
			return getRuleContext(PalabraclaveendbucleforContext.class,0);
		}
		public List<NumerosContext> numeros() {
			return getRuleContexts(NumerosContext.class);
		}
		public NumerosContext numeros(int i) {
			return getRuleContext(NumerosContext.class,i);
		}
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public Cuerpo3Context cuerpo3() {
			return getRuleContext(Cuerpo3Context.class,0);
		}
		public Cuerpo4Context cuerpo4() {
			return getRuleContext(Cuerpo4Context.class,0);
		}
		public PalabraclavesaltoelementoforContext palabraclavesaltoelementofor() {
			return getRuleContext(PalabraclavesaltoelementoforContext.class,0);
		}
		public FuncionforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionfor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitFuncionfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionforContext funcionfor() throws RecognitionException {
		FuncionforContext _localctx = new FuncionforContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcionfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			palabraclavebuclefor();
			setState(262);
			nombrevariable();
			setState(263);
			palabraclaveinciovalorfor();
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case ARRAY:
			case ID:
				{
				setState(264);
				nombrevariable();
				}
				break;
			case DIGITO:
			case FLOTANTE:
				{
				setState(265);
				numeros();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(268);
			palabraclavefinvalorfor();
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case ARRAY:
			case ID:
				{
				setState(269);
				nombrevariable();
				}
				break;
			case DIGITO:
			case FLOTANTE:
				{
				setState(270);
				numeros();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(273);
				palabraclavesaltoelementofor();
				setState(276);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
				case ARRAY:
				case ID:
					{
					setState(274);
					nombrevariable();
					}
					break;
				case DIGITO:
				case FLOTANTE:
					{
					setState(275);
					numeros();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(280);
			palabraclavehacerfor();
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(281);
				cuerpo();
				}
				break;
			case 2:
				{
				setState(282);
				cuerpo3();
				}
				break;
			case 3:
				{
				setState(283);
				cuerpo4();
				}
				break;
			}
			setState(286);
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
		public PalabraclaveinicioContext palabraclaveinicio() {
			return getRuleContext(PalabraclaveinicioContext.class,0);
		}
		public PalabraclavefinContext palabraclavefin() {
			return getRuleContext(PalabraclavefinContext.class,0);
		}
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCuerpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(288);
			palabraclaveinicio();
			setState(290); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(289);
				codigo();
				}
				}
				setState(292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << BEGIN) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << DEVOLVER) | (1L << ARRAY) | (1L << ID))) != 0) );
			setState(294);
			palabraclavefin();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCuerpo2(this);
			else return visitor.visitChildren(this);
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
			setState(305); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(296);
					palabraclaveinicio();
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << BEGIN) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << DEVOLVER) | (1L << ARRAY) | (1L << ID))) != 0)) {
						{
						{
						setState(297);
						codigo();
						}
						}
						setState(302);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(303);
					palabraclavefin();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(307); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCuerpo3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cuerpo3Context cuerpo3() throws RecognitionException {
		Cuerpo3Context _localctx = new Cuerpo3Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_cuerpo3);
		int _la;
		try {
			setState(322);
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
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(309);
					asignacion();
					}
					break;
				case 2:
					{
					setState(310);
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
				setState(313);
				palabraclaveinicio();
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(314);
						asignacion();
						}
						break;
					case 2:
						{
						setState(315);
						llamarfuncion();
						}
						break;
					}
					}
					setState(318); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << ARRAY) | (1L << ID))) != 0) );
				setState(320);
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

	public static class Cuerpo4Context extends ParserRuleContext {
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
		public PalabraclaveinicioContext palabraclaveinicio() {
			return getRuleContext(PalabraclaveinicioContext.class,0);
		}
		public PalabraclavefinContext palabraclavefin() {
			return getRuleContext(PalabraclavefinContext.class,0);
		}
		public Cuerpo4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCuerpo4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cuerpo4Context cuerpo4() throws RecognitionException {
		Cuerpo4Context _localctx = new Cuerpo4Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_cuerpo4);
		int _la;
		try {
			int _alt;
			setState(339);
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
				setState(326); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(326);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(324);
							asignacion();
							}
							break;
						case 2:
							{
							setState(325);
							llamarfuncion();
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
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(330);
				palabraclaveinicio();
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(333);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(331);
						asignacion();
						}
						break;
					case 2:
						{
						setState(332);
						llamarfuncion();
						}
						break;
					}
					}
					setState(335); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << ARRAY) | (1L << ID))) != 0) );
				setState(337);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitLlamarfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamarfuncionContext llamarfuncion() throws RecognitionException {
		LlamarfuncionContext _localctx = new LlamarfuncionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_llamarfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(341);
				nombrefuncion();
				setState(342);
				operadoraperturaparentesis();
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << PL) | (1L << DIGITO) | (1L << FLOTANTE) | (1L << ARRAY) | (1L << ID) | (1L << CADENA))) != 0)) {
					{
					setState(343);
					parametros();
					}
				}

				setState(346);
				operadorcierreparentesis();
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(347);
					separadoroperaciones();
					}
					break;
				}
				}
				}
				break;
			case FOR:
				{
				setState(350);
				funcionfor();
				}
				break;
			case WHILE:
				{
				setState(351);
				funcionwhile();
				}
				break;
			case CONDICIONES:
				{
				setState(352);
				condicionales();
				}
				break;
			case SWITCH:
				{
				setState(353);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_codigo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(363);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(356);
						funcionwhile();
						}
						break;
					case 2:
						{
						setState(357);
						funcionfor();
						}
						break;
					case 3:
						{
						setState(358);
						operacionswitch();
						}
						break;
					case 4:
						{
						setState(359);
						asignacion();
						}
						break;
					case 5:
						{
						setState(360);
						llamarfuncion();
						}
						break;
					case 6:
						{
						setState(361);
						devolver();
						}
						break;
					case 7:
						{
						setState(362);
						cuerpo2();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(365); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCrearfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrearfuncionContext crearfuncion() throws RecognitionException {
		CrearfuncionContext _localctx = new CrearfuncionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_crearfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			cabecerafuncion();
			setState(368);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitDevolver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DevolverContext devolver() throws RecognitionException {
		DevolverContext _localctx = new DevolverContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_devolver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			palabraclavefunciondevolver();
			setState(371);
			operadoraperturaparentesis();
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(372);
				llamarfuncion();
				}
				break;
			case 2:
				{
				setState(373);
				expr(0);
				}
				break;
			}
			setState(376);
			operadorcierreparentesis();
			setState(377);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCabecerafuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabecerafuncionContext cabecerafuncion() throws RecognitionException {
		CabecerafuncionContext _localctx = new CabecerafuncionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cabecerafuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			palabraclavecreacionfuncion();
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(382);
				nombrefuncion();
				}
				break;
			case MAIN:
				{
				setState(383);
				palabraclavefuncionmain();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(386);
			operadoraperturaparentesis();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << PL) | (1L << DIGITO) | (1L << FLOTANTE) | (1L << ARRAY) | (1L << ID) | (1L << CADENA))) != 0)) {
				{
				setState(387);
				parametros();
				}
			}

			setState(390);
			operadorcierreparentesis();
			setState(391);
			separadordospuntos();
			setState(392);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(395);
				llamarfuncion();
				}
				break;
			case 2:
				{
				setState(396);
				numeros();
				}
				break;
			case 3:
				{
				setState(397);
				nombrevariable();
				}
				break;
			case 4:
				{
				setState(398);
				operadoraperturaparentesis();
				setState(401);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
				case ARRAY:
				case ID:
					{
					setState(399);
					nombrevariable();
					}
					break;
				case DIGITO:
				case FLOTANTE:
					{
					setState(400);
					numeros();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(403);
					separadoroperadores();
					setState(406);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CASE:
					case ARRAY:
					case ID:
						{
						setState(404);
						nombrevariable();
						}
						break;
					case DIGITO:
					case FLOTANTE:
						{
						setState(405);
						numeros();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(413);
				operadorcierreparentesis();
				}
				break;
			case 5:
				{
				setState(415);
				cadena();
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(416);
						operadoraritmeticosuma();
						setState(417);
						expr(0);
						}
						} 
					}
					setState(423);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				}
				break;
			case 6:
				{
				setState(424);
				operadoraperturaparentesis();
				setState(425);
				expr(0);
				setState(426);
				operadorcierreparentesis();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(444);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(430);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(433);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PRODUCT:
							{
							setState(431);
							operadoraritmeticoproducto();
							}
							break;
						case DIVISION:
							{
							setState(432);
							operadoraritmeticodivision();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(435);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(437);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(440);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ADD:
							{
							setState(438);
							operadoraritmeticosuma();
							}
							break;
						case MINUS:
							{
							setState(439);
							operadoraritmeticoresta();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(442);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitExpresionlogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionlogicaContext expresionlogica() throws RecognitionException {
		ExpresionlogicaContext _localctx = new ExpresionlogicaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expresionlogica);
		try {
			int _alt;
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
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
					setState(449);
					expr(0);
					}
					break;
				case BOOLEAN:
					{
					setState(450);
					palabraclavebooleano();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(462); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(455);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MENORQUE:
						case MAYORQUE:
						case IGUALQUE:
						case DISTINTOQUE:
							{
							setState(453);
							operadorlogico();
							}
							break;
						case PUERTALOGICAAND:
						case PUERTALOGICAOR:
							{
							setState(454);
							operadorcondicionalpuertalogica();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(460);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
						case 1:
							{
							setState(457);
							expr(0);
							}
							break;
						case 2:
							{
							setState(458);
							palabraclavebooleano();
							}
							break;
						case 3:
							{
							setState(459);
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
					setState(464); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitNombrefuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombrefuncionContext nombrefuncion() throws RecognitionException {
		NombrefuncionContext _localctx = new NombrefuncionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nombrefuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitNombrevariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombrevariableContext nombrevariable() throws RecognitionException {
		NombrevariableContext _localctx = new NombrevariableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_nombrevariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitNombrepaquete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombrepaqueteContext nombrepaquete() throws RecognitionException {
		NombrepaqueteContext _localctx = new NombrepaqueteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nombrepaquete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitOperadorasignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorasignacionContext operadorasignacion() throws RecognitionException {
		OperadorasignacionContext _localctx = new OperadorasignacionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operadorasignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			parametro();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(478);
				separadoroperadores();
				setState(479);
				parametro();
				}
				}
				setState(485);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << STRING) | (1L << NUMERO))) != 0)) {
				{
				setState(486);
				tipovariable();
				}
			}

			setState(489);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitOperadoraritmeticoproducto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoraritmeticoproductoContext operadoraritmeticoproducto() throws RecognitionException {
		OperadoraritmeticoproductoContext _localctx = new OperadoraritmeticoproductoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operadoraritmeticoproducto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitOperadoraritmeticodivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoraritmeticodivisionContext operadoraritmeticodivision() throws RecognitionException {
		OperadoraritmeticodivisionContext _localctx = new OperadoraritmeticodivisionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operadoraritmeticodivision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitOperadoraritmeticosuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoraritmeticosumaContext operadoraritmeticosuma() throws RecognitionException {
		OperadoraritmeticosumaContext _localctx = new OperadoraritmeticosumaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operadoraritmeticosuma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitOperadoraritmeticoresta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoraritmeticorestaContext operadoraritmeticoresta() throws RecognitionException {
		OperadoraritmeticorestaContext _localctx = new OperadoraritmeticorestaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operadoraritmeticoresta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitOperadoraritmeticosuma1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operadoraritmeticosuma1Context operadoraritmeticosuma1() throws RecognitionException {
		Operadoraritmeticosuma1Context _localctx = new Operadoraritmeticosuma1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_operadoraritmeticosuma1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitOperadoraritmeticoresta1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operadoraritmeticoresta1Context operadoraritmeticoresta1() throws RecognitionException {
		Operadoraritmeticoresta1Context _localctx = new Operadoraritmeticoresta1Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_operadoraritmeticoresta1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitOperadorlogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorlogicoContext operadorlogico() throws RecognitionException {
		OperadorlogicoContext _localctx = new OperadorlogicoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operadorlogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitOperadorcondicionalpuertalogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorcondicionalpuertalogicaContext operadorcondicionalpuertalogica() throws RecognitionException {
		OperadorcondicionalpuertalogicaContext _localctx = new OperadorcondicionalpuertalogicaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operadorcondicionalpuertalogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitSeparadoroperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeparadoroperacionesContext separadoroperaciones() throws RecognitionException {
		SeparadoroperacionesContext _localctx = new SeparadoroperacionesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_separadoroperaciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitSeparadoroperadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeparadoroperadoresContext separadoroperadores() throws RecognitionException {
		SeparadoroperadoresContext _localctx = new SeparadoroperadoresContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_separadoroperadores);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitSeparadordospuntos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeparadordospuntosContext separadordospuntos() throws RecognitionException {
		SeparadordospuntosContext _localctx = new SeparadordospuntosContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_separadordospuntos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitOperadoraperturaparentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoraperturaparentesisContext operadoraperturaparentesis() throws RecognitionException {
		OperadoraperturaparentesisContext _localctx = new OperadoraperturaparentesisContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operadoraperturaparentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitOperadorcierreparentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorcierreparentesisContext operadorcierreparentesis() throws RecognitionException {
		OperadorcierreparentesisContext _localctx = new OperadorcierreparentesisContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operadorcierreparentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitTipovariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipovariableContext tipovariable() throws RecognitionException {
		TipovariableContext _localctx = new TipovariableContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tipovariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitComentarios(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentariosContext comentarios() throws RecognitionException {
		ComentariosContext _localctx = new ComentariosContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_comentarios);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_entero);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(524); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(523);
					match(DIGITO);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(526); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitFlotante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlotanteContext flotante() throws RecognitionException {
		FlotanteContext _localctx = new FlotanteContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_flotante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitNumeros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumerosContext numeros() throws RecognitionException {
		NumerosContext _localctx = new NumerosContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_numeros);
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITO:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				entero();
				}
				break;
			case FLOTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclavebooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclavebooleanoContext palabraclavebooleano() throws RecognitionException {
		PalabraclavebooleanoContext _localctx = new PalabraclavebooleanoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_palabraclavebooleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclavebuclefor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclavebucleforContext palabraclavebuclefor() throws RecognitionException {
		PalabraclavebucleforContext _localctx = new PalabraclavebucleforContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_palabraclavebuclefor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclaveendbuclefor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclaveendbucleforContext palabraclaveendbuclefor() throws RecognitionException {
		PalabraclaveendbucleforContext _localctx = new PalabraclaveendbucleforContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_palabraclaveendbuclefor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclaveinciovalorfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclaveinciovalorforContext palabraclaveinciovalorfor() throws RecognitionException {
		PalabraclaveinciovalorforContext _localctx = new PalabraclaveinciovalorforContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_palabraclaveinciovalorfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclavesaltoelementofor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclavesaltoelementoforContext palabraclavesaltoelementofor() throws RecognitionException {
		PalabraclavesaltoelementoforContext _localctx = new PalabraclavesaltoelementoforContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_palabraclavesaltoelementofor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclavefinvalorfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclavefinvalorforContext palabraclavefinvalorfor() throws RecognitionException {
		PalabraclavefinvalorforContext _localctx = new PalabraclavefinvalorforContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_palabraclavefinvalorfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclavehacerfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclavehacerforContext palabraclavehacerfor() throws RecognitionException {
		PalabraclavehacerforContext _localctx = new PalabraclavehacerforContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_palabraclavehacerfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclavebuclewhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclavebuclewhileContext palabraclavebuclewhile() throws RecognitionException {
		PalabraclavebuclewhileContext _localctx = new PalabraclavebuclewhileContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_palabraclavebuclewhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabrareservadaaperturaswitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabrareservadaaperturaswitchContext palabrareservadaaperturaswitch() throws RecognitionException {
		PalabrareservadaaperturaswitchContext _localctx = new PalabrareservadaaperturaswitchContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_palabrareservadaaperturaswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabrareservadacierrewitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabrareservadacierrewitchContext palabrareservadacierrewitch() throws RecognitionException {
		PalabrareservadacierrewitchContext _localctx = new PalabrareservadacierrewitchContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_palabrareservadacierrewitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabrareservadacase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabrareservadacaseContext palabrareservadacase() throws RecognitionException {
		PalabrareservadacaseContext _localctx = new PalabrareservadacaseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_palabrareservadacase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabrareservadabreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabrareservadabreakContext palabrareservadabreak() throws RecognitionException {
		PalabrareservadabreakContext _localctx = new PalabrareservadabreakContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_palabrareservadabreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabrareservadadefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabrareservadadefaultContext palabrareservadadefault() throws RecognitionException {
		PalabrareservadadefaultContext _localctx = new PalabrareservadadefaultContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_palabrareservadadefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclavecondiciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclavecondicionesContext palabraclavecondiciones() throws RecognitionException {
		PalabraclavecondicionesContext _localctx = new PalabraclavecondicionesContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_palabraclavecondiciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclavethen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclavethenContext palabraclavethen() throws RecognitionException {
		PalabraclavethenContext _localctx = new PalabraclavethenContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_palabraclavethen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclaveendif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclaveendifContext palabraclaveendif() throws RecognitionException {
		PalabraclaveendifContext _localctx = new PalabraclaveendifContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_palabraclaveendif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclaveincluirlibreria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclaveincluirlibreriaContext palabraclaveincluirlibreria() throws RecognitionException {
		PalabraclaveincluirlibreriaContext _localctx = new PalabraclaveincluirlibreriaContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_palabraclaveincluirlibreria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclavecreacionfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclavecreacionfuncionContext palabraclavecreacionfuncion() throws RecognitionException {
		PalabraclavecreacionfuncionContext _localctx = new PalabraclavecreacionfuncionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_palabraclavecreacionfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclavefuncionmain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclavefuncionmainContext palabraclavefuncionmain() throws RecognitionException {
		PalabraclavefuncionmainContext _localctx = new PalabraclavefuncionmainContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_palabraclavefuncionmain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclavefunciondevolver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclavefunciondevolverContext palabraclavefunciondevolver() throws RecognitionException {
		PalabraclavefunciondevolverContext _localctx = new PalabraclavefunciondevolverContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_palabraclavefunciondevolver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclaveinicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclaveinicioContext palabraclaveinicio() throws RecognitionException {
		PalabraclaveinicioContext _localctx = new PalabraclaveinicioContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_palabraclaveinicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitPalabraclavefin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabraclavefinContext palabraclavefin() throws RecognitionException {
		PalabraclavefinContext _localctx = new PalabraclavefinContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_palabraclavefin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
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
		case 21:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0245\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\6\2\u0093\n\2\r\2\16\2\u0094\3\3\3\3\3\3\3\3\6\3\u009b\n\3\r\3"+
		"\16\3\u009c\3\4\5\4\u00a0\n\4\3\4\3\4\3\4\3\4\5\4\u00a6\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4\u00ad\n\4\f\4\16\4\u00b0\13\4\5\4\u00b2\n\4\3\4\5\4\u00b5"+
		"\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u00c8\n\b\3\b\3\b\3\b\5\b\u00cd\n\b\6\b\u00cf\n\b\r\b\16\b\u00d0"+
		"\3\b\3\b\3\b\3\b\5\b\u00d7\n\b\3\b\3\b\3\b\5\b\u00dc\n\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00e6\n\t\f\t\16\t\u00e9\13\t\5\t\u00eb\n\t\3\t"+
		"\5\t\u00ee\n\t\3\t\3\t\3\t\5\t\u00f3\n\t\3\n\6\n\u00f6\n\n\r\n\16\n\u00f7"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0100\n\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0106\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u010d\n\f\3\f\3\f\3\f\5\f\u0112\n"+
		"\f\3\f\3\f\3\f\5\f\u0117\n\f\5\f\u0119\n\f\3\f\3\f\3\f\3\f\5\f\u011f\n"+
		"\f\3\f\3\f\3\r\3\r\6\r\u0125\n\r\r\r\16\r\u0126\3\r\3\r\3\16\3\16\7\16"+
		"\u012d\n\16\f\16\16\16\u0130\13\16\3\16\3\16\6\16\u0134\n\16\r\16\16\16"+
		"\u0135\3\17\3\17\5\17\u013a\n\17\3\17\3\17\3\17\6\17\u013f\n\17\r\17\16"+
		"\17\u0140\3\17\3\17\5\17\u0145\n\17\3\20\3\20\6\20\u0149\n\20\r\20\16"+
		"\20\u014a\3\20\3\20\3\20\6\20\u0150\n\20\r\20\16\20\u0151\3\20\3\20\5"+
		"\20\u0156\n\20\3\21\3\21\3\21\5\21\u015b\n\21\3\21\3\21\5\21\u015f\n\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0165\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\6\22\u016e\n\22\r\22\16\22\u016f\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5"+
		"\24\u0179\n\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\5\26\u0183\n\26"+
		"\3\26\3\26\5\26\u0187\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0194\n\27\3\27\3\27\3\27\5\27\u0199\n\27\7\27\u019b\n"+
		"\27\f\27\16\27\u019e\13\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01a6\n"+
		"\27\f\27\16\27\u01a9\13\27\3\27\3\27\3\27\3\27\5\27\u01af\n\27\3\27\3"+
		"\27\3\27\5\27\u01b4\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u01bb\n\27\3\27"+
		"\3\27\7\27\u01bf\n\27\f\27\16\27\u01c2\13\27\3\30\3\30\5\30\u01c6\n\30"+
		"\3\30\3\30\5\30\u01ca\n\30\3\30\3\30\3\30\5\30\u01cf\n\30\6\30\u01d1\n"+
		"\30\r\30\16\30\u01d2\3\30\5\30\u01d6\n\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u01e4\n\35\f\35\16\35\u01e7\13\35"+
		"\3\36\5\36\u01ea\n\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/"+
		"\6/\u020f\n/\r/\16/\u0210\3\60\3\60\3\61\3\61\5\61\u0217\n\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\3G\2\3,H\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\2\7\4\2\6\6\678\3\2.\61\3\2\62\63\4\2\24\25\35\35\3\2;>\2"+
		"\u0251\2\u0092\3\2\2\2\4\u009a\3\2\2\2\6\u00b1\3\2\2\2\b\u00b6\3\2\2\2"+
		"\n\u00ba\3\2\2\2\f\u00bd\3\2\2\2\16\u00ce\3\2\2\2\20\u00df\3\2\2\2\22"+
		"\u00f5\3\2\2\2\24\u00fb\3\2\2\2\26\u0107\3\2\2\2\30\u0122\3\2\2\2\32\u0133"+
		"\3\2\2\2\34\u0144\3\2\2\2\36\u0155\3\2\2\2 \u0164\3\2\2\2\"\u016d\3\2"+
		"\2\2$\u0171\3\2\2\2&\u0174\3\2\2\2(\u017d\3\2\2\2*\u017f\3\2\2\2,\u01ae"+
		"\3\2\2\2.\u01d5\3\2\2\2\60\u01d7\3\2\2\2\62\u01d9\3\2\2\2\64\u01db\3\2"+
		"\2\2\66\u01dd\3\2\2\28\u01df\3\2\2\2:\u01e9\3\2\2\2<\u01ed\3\2\2\2>\u01ef"+
		"\3\2\2\2@\u01f1\3\2\2\2B\u01f3\3\2\2\2D\u01f5\3\2\2\2F\u01f7\3\2\2\2H"+
		"\u01f9\3\2\2\2J\u01fb\3\2\2\2L\u01fd\3\2\2\2N\u01ff\3\2\2\2P\u0201\3\2"+
		"\2\2R\u0203\3\2\2\2T\u0205\3\2\2\2V\u0207\3\2\2\2X\u0209\3\2\2\2Z\u020b"+
		"\3\2\2\2\\\u020e\3\2\2\2^\u0212\3\2\2\2`\u0216\3\2\2\2b\u0218\3\2\2\2"+
		"d\u021a\3\2\2\2f\u021c\3\2\2\2h\u021e\3\2\2\2j\u0220\3\2\2\2l\u0222\3"+
		"\2\2\2n\u0224\3\2\2\2p\u0226\3\2\2\2r\u0228\3\2\2\2t\u022a\3\2\2\2v\u022c"+
		"\3\2\2\2x\u022e\3\2\2\2z\u0230\3\2\2\2|\u0232\3\2\2\2~\u0234\3\2\2\2\u0080"+
		"\u0236\3\2\2\2\u0082\u0238\3\2\2\2\u0084\u023a\3\2\2\2\u0086\u023c\3\2"+
		"\2\2\u0088\u023e\3\2\2\2\u008a\u0240\3\2\2\2\u008c\u0242\3\2\2\2\u008e"+
		"\u0093\5\4\3\2\u008f\u0093\5,\27\2\u0090\u0093\5\6\4\2\u0091\u0093\5$"+
		"\23\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\3\3\2\2\2\u0096\u0097\5\u0082B\2\u0097\u0098\5\64\33\2\u0098"+
		"\u0099\5N(\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009b\u009c\3\2\2"+
		"\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\5\3\2\2\2\u009e\u00a0"+
		"\5X-\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a5\5\62\32\2\u00a2\u00a3\5\66\34\2\u00a3\u00a4\5,\27\2\u00a4\u00a6"+
		"\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00b2\3\2\2\2\u00a7"+
		"\u00a8\5X-\2\u00a8\u00ae\5\62\32\2\u00a9\u00aa\5P)\2\u00aa\u00ab\5\62"+
		"\32\2\u00ab\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u009f\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b5\5N(\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\7\3\2\2\2\u00b6"+
		"\u00b7\5T+\2\u00b7\u00b8\5.\30\2\u00b8\u00b9\5V,\2\u00b9\t\3\2\2\2\u00ba"+
		"\u00bb\5\f\7\2\u00bb\u00bc\5\16\b\2\u00bc\13\3\2\2\2\u00bd\u00be\5r:\2"+
		"\u00be\u00bf\5T+\2\u00bf\u00c0\5,\27\2\u00c0\u00c1\5V,\2\u00c1\r\3\2\2"+
		"\2\u00c2\u00c3\5v<\2\u00c3\u00c4\5,\27\2\u00c4\u00c7\5R*\2\u00c5\u00c8"+
		"\5\34\17\2\u00c6\u00c8\5\30\r\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2"+
		"\2\u00c8\u00cc\3\2\2\2\u00c9\u00ca\5x=\2\u00ca\u00cb\5N(\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00c2\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\5z>\2\u00d3\u00d6\5R*\2\u00d4\u00d7"+
		"\5\34\17\2\u00d5\u00d7\5\30\r\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2"+
		"\2\u00d7\u00db\3\2\2\2\u00d8\u00d9\5x=\2\u00d9\u00da\5N(\2\u00da\u00dc"+
		"\3\2\2\2\u00db\u00d8\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\5t;\2\u00de\17\3\2\2\2\u00df\u00ea\5|?\2\u00e0\u00eb\5\b\5\2\u00e1"+
		"\u00e7\5\b\5\2\u00e2\u00e3\5J&\2\u00e3\u00e4\5\b\5\2\u00e4\u00e6\3\2\2"+
		"\2\u00e5\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00e0\3\2\2\2\u00ea"+
		"\u00e1\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ee\5~"+
		"@\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f2\3\2\2\2\u00ef"+
		"\u00f3\5\34\17\2\u00f0\u00f3\5\36\20\2\u00f1\u00f3\5\30\r\2\u00f2\u00ef"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\21\3\2\2\2\u00f4"+
		"\u00f6\5\20\t\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\5\u0080A\2"+
		"\u00fa\23\3\2\2\2\u00fb\u00fc\5p9\2\u00fc\u00ff\5T+\2\u00fd\u0100\5,\27"+
		"\2\u00fe\u0100\5.\30\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0105\5V,\2\u0102\u0106\5\30\r\2\u0103\u0106\5\34\17\2"+
		"\u0104\u0106\5\36\20\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104"+
		"\3\2\2\2\u0106\25\3\2\2\2\u0107\u0108\5d\63\2\u0108\u0109\5\62\32\2\u0109"+
		"\u010c\5h\65\2\u010a\u010d\5\62\32\2\u010b\u010d\5`\61\2\u010c\u010a\3"+
		"\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\5l\67\2\u010f"+
		"\u0112\5\62\32\2\u0110\u0112\5`\61\2\u0111\u010f\3\2\2\2\u0111\u0110\3"+
		"\2\2\2\u0112\u0118\3\2\2\2\u0113\u0116\5j\66\2\u0114\u0117\5\62\32\2\u0115"+
		"\u0117\5`\61\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0119\3\2"+
		"\2\2\u0118\u0113\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011e\5n8\2\u011b\u011f\5\30\r\2\u011c\u011f\5\34\17\2\u011d\u011f\5"+
		"\36\20\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\5f\64\2\u0121\27\3\2\2\2\u0122\u0124\5\u008a"+
		"F\2\u0123\u0125\5\"\22\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5\u008c"+
		"G\2\u0129\31\3\2\2\2\u012a\u012e\5\u008aF\2\u012b\u012d\5\"\22\2\u012c"+
		"\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\5\u008cG\2\u0132"+
		"\u0134\3\2\2\2\u0133\u012a\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\33\3\2\2\2\u0137\u013a\5\6\4\2\u0138\u013a"+
		"\5 \21\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u0145\3\2\2\2\u013b"+
		"\u013e\5\u008aF\2\u013c\u013f\5\6\4\2\u013d\u013f\5 \21\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\5\u008cG\2\u0143\u0145"+
		"\3\2\2\2\u0144\u0139\3\2\2\2\u0144\u013b\3\2\2\2\u0145\35\3\2\2\2\u0146"+
		"\u0149\5\6\4\2\u0147\u0149\5 \21\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u0156\3\2\2\2\u014c\u014f\5\u008aF\2\u014d\u0150\5\6\4\2\u014e\u0150"+
		"\5 \21\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\5\u008c"+
		"G\2\u0154\u0156\3\2\2\2\u0155\u0148\3\2\2\2\u0155\u014c\3\2\2\2\u0156"+
		"\37\3\2\2\2\u0157\u0158\5\60\31\2\u0158\u015a\5T+\2\u0159\u015b\58\35"+
		"\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e"+
		"\5V,\2\u015d\u015f\5N(\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0165\3\2\2\2\u0160\u0165\5\26\f\2\u0161\u0165\5\24\13\2\u0162\u0165"+
		"\5\22\n\2\u0163\u0165\5\n\6\2\u0164\u0157\3\2\2\2\u0164\u0160\3\2\2\2"+
		"\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165!\3"+
		"\2\2\2\u0166\u016e\5\24\13\2\u0167\u016e\5\26\f\2\u0168\u016e\5\n\6\2"+
		"\u0169\u016e\5\6\4\2\u016a\u016e\5 \21\2\u016b\u016e\5&\24\2\u016c\u016e"+
		"\5\32\16\2\u016d\u0166\3\2\2\2\u016d\u0167\3\2\2\2\u016d\u0168\3\2\2\2"+
		"\u016d\u0169\3\2\2\2\u016d\u016a\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016c"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"#\3\2\2\2\u0171\u0172\5*\26\2\u0172\u0173\5\30\r\2\u0173%\3\2\2\2\u0174"+
		"\u0175\5\u0088E\2\u0175\u0178\5T+\2\u0176\u0179\5 \21\2\u0177\u0179\5"+
		",\27\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017b\5V,\2\u017b\u017c\5N(\2\u017c\'\3\2\2\2\u017d"+
		"\u017e\5X-\2\u017e)\3\2\2\2\u017f\u0182\5\u0084C\2\u0180\u0183\5\60\31"+
		"\2\u0181\u0183\5\u0086D\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0186\5T+\2\u0185\u0187\58\35\2\u0186\u0185\3\2\2"+
		"\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\5V,\2\u0189\u018a"+
		"\5R*\2\u018a\u018b\5(\25\2\u018b+\3\2\2\2\u018c\u018d\b\27\1\2\u018d\u01af"+
		"\5 \21\2\u018e\u01af\5`\61\2\u018f\u01af\5\62\32\2\u0190\u0193\5T+\2\u0191"+
		"\u0194\5\62\32\2\u0192\u0194\5`\61\2\u0193\u0191\3\2\2\2\u0193\u0192\3"+
		"\2\2\2\u0194\u019c\3\2\2\2\u0195\u0198\5P)\2\u0196\u0199\5\62\32\2\u0197"+
		"\u0199\5`\61\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199\u019b\3\2"+
		"\2\2\u019a\u0195\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\5V"+
		",\2\u01a0\u01af\3\2\2\2\u01a1\u01a7\5L\'\2\u01a2\u01a3\5@!\2\u01a3\u01a4"+
		"\5,\27\2\u01a4\u01a6\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01af\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01aa\u01ab\5T+\2\u01ab\u01ac\5,\27\2\u01ac\u01ad\5V,\2\u01ad\u01af"+
		"\3\2\2\2\u01ae\u018c\3\2\2\2\u01ae\u018e\3\2\2\2\u01ae\u018f\3\2\2\2\u01ae"+
		"\u0190\3\2\2\2\u01ae\u01a1\3\2\2\2\u01ae\u01aa\3\2\2\2\u01af\u01c0\3\2"+
		"\2\2\u01b0\u01b3\f\n\2\2\u01b1\u01b4\5<\37\2\u01b2\u01b4\5> \2\u01b3\u01b1"+
		"\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\5,\27\13"+
		"\u01b6\u01bf\3\2\2\2\u01b7\u01ba\f\t\2\2\u01b8\u01bb\5@!\2\u01b9\u01bb"+
		"\5B\"\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\5,\27\n\u01bd\u01bf\3\2\2\2\u01be\u01b0\3\2\2\2\u01be\u01b7\3\2"+
		"\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"-\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\5,\27\2\u01c4\u01c6\5b\62\2"+
		"\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01d0\3\2\2\2\u01c7\u01ca"+
		"\5H%\2\u01c8\u01ca\5J&\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca"+
		"\u01ce\3\2\2\2\u01cb\u01cf\5,\27\2\u01cc\u01cf\5b\62\2\u01cd\u01cf\5."+
		"\30\2\u01ce\u01cb\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf"+
		"\u01d1\3\2\2\2\u01d0\u01c9\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0\3\2"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d6\5b\62\2\u01d5"+
		"\u01c5\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6/\3\2\2\2\u01d7\u01d8\78\2\2\u01d8"+
		"\61\3\2\2\2\u01d9\u01da\t\2\2\2\u01da\63\3\2\2\2\u01db\u01dc\78\2\2\u01dc"+
		"\65\3\2\2\2\u01dd\u01de\7,\2\2\u01de\67\3\2\2\2\u01df\u01e5\5:\36\2\u01e0"+
		"\u01e1\5P)\2\u01e1\u01e2\5:\36\2\u01e2\u01e4\3\2\2\2\u01e3\u01e0\3\2\2"+
		"\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e69"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01ea\5X-\2\u01e9\u01e8\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\5,\27\2\u01ec;\3\2\2\2"+
		"\u01ed\u01ee\7*\2\2\u01ee=\3\2\2\2\u01ef\u01f0\7+\2\2\u01f0?\3\2\2\2\u01f1"+
		"\u01f2\7(\2\2\u01f2A\3\2\2\2\u01f3\u01f4\7)\2\2\u01f4C\3\2\2\2\u01f5\u01f6"+
		"\7&\2\2\u01f6E\3\2\2\2\u01f7\u01f8\7\'\2\2\u01f8G\3\2\2\2\u01f9\u01fa"+
		"\t\3\2\2\u01faI\3\2\2\2\u01fb\u01fc\t\4\2\2\u01fcK\3\2\2\2\u01fd\u01fe"+
		"\7:\2\2\u01feM\3\2\2\2\u01ff\u0200\7 \2\2\u0200O\3\2\2\2\u0201\u0202\7"+
		"%\2\2\u0202Q\3\2\2\2\u0203\u0204\7#\2\2\u0204S\3\2\2\2\u0205\u0206\7!"+
		"\2\2\u0206U\3\2\2\2\u0207\u0208\7\"\2\2\u0208W\3\2\2\2\u0209\u020a\t\5"+
		"\2\2\u020aY\3\2\2\2\u020b\u020c\t\6\2\2\u020c[\3\2\2\2\u020d\u020f\7\64"+
		"\2\2\u020e\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211]\3\2\2\2\u0212\u0213\7\65\2\2\u0213_\3\2\2\2\u0214"+
		"\u0217\5\\/\2\u0215\u0217\5^\60\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2"+
		"\2\2\u0217a\3\2\2\2\u0218\u0219\7\t\2\2\u0219c\3\2\2\2\u021a\u021b\7\27"+
		"\2\2\u021be\3\2\2\2\u021c\u021d\7\30\2\2\u021dg\3\2\2\2\u021e\u021f\7"+
		"\31\2\2\u021fi\3\2\2\2\u0220\u0221\7\32\2\2\u0221k\3\2\2\2\u0222\u0223"+
		"\7\33\2\2\u0223m\3\2\2\2\u0224\u0225\7\34\2\2\u0225o\3\2\2\2\u0226\u0227"+
		"\7\26\2\2\u0227q\3\2\2\2\u0228\u0229\7\4\2\2\u0229s\3\2\2\2\u022a\u022b"+
		"\7\5\2\2\u022bu\3\2\2\2\u022c\u022d\7\6\2\2\u022dw\3\2\2\2\u022e\u022f"+
		"\7\7\2\2\u022fy\3\2\2\2\u0230\u0231\7\b\2\2\u0231{\3\2\2\2\u0232\u0233"+
		"\7\3\2\2\u0233}\3\2\2\2\u0234\u0235\7\16\2\2\u0235\177\3\2\2\2\u0236\u0237"+
		"\7\17\2\2\u0237\u0081\3\2\2\2\u0238\u0239\7\22\2\2\u0239\u0083\3\2\2\2"+
		"\u023a\u023b\7\23\2\2\u023b\u0085\3\2\2\2\u023c\u023d\7\37\2\2\u023d\u0087"+
		"\3\2\2\2\u023e\u023f\7\36\2\2\u023f\u0089\3\2\2\2\u0240\u0241\7\20\2\2"+
		"\u0241\u008b\3\2\2\2\u0242\u0243\7\21\2\2\u0243\u008d\3\2\2\2A\u0092\u0094"+
		"\u009c\u009f\u00a5\u00ae\u00b1\u00b4\u00c7\u00cc\u00d0\u00d6\u00db\u00e7"+
		"\u00ea\u00ed\u00f2\u00f7\u00ff\u0105\u010c\u0111\u0116\u0118\u011e\u0126"+
		"\u012e\u0135\u0139\u013e\u0140\u0144\u0148\u014a\u014f\u0151\u0155\u015a"+
		"\u015e\u0164\u016d\u016f\u0178\u0182\u0186\u0193\u0198\u019c\u01a7\u01ae"+
		"\u01b3\u01ba\u01be\u01c0\u01c5\u01c9\u01ce\u01d2\u01d5\u01e5\u01e9\u0210"+
		"\u0216";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}