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
		RULE_prog = 0, RULE_libreria = 1, RULE_asignacion = 2, RULE_variable = 3, 
		RULE_condicion = 4, RULE_operacionswitch = 5, RULE_cabeceraswitch = 6, 
		RULE_cuerposwitch = 7, RULE_condicional = 8, RULE_condicionales = 9, RULE_funcionwhile = 10, 
		RULE_funcionfor = 11, RULE_cuerpo = 12, RULE_cuerpo2 = 13, RULE_cuerpo3 = 14, 
		RULE_cuerpo4 = 15, RULE_llamarfuncion = 16, RULE_codigo = 17, RULE_crearfuncion = 18, 
		RULE_devolver = 19, RULE_retorno = 20, RULE_cabecerafuncion = 21, RULE_expr = 22, 
		RULE_expresionlogica = 23, RULE_nombrefuncion = 24, RULE_nombrevariable = 25, 
		RULE_nombrepaquete = 26, RULE_operadorasignacion = 27, RULE_parametros = 28, 
		RULE_parametro = 29, RULE_operadoraritmeticoproducto = 30, RULE_operadoraritmeticodivision = 31, 
		RULE_operadoraritmeticosuma = 32, RULE_operadoraritmeticoresta = 33, RULE_operadoraritmeticosuma1 = 34, 
		RULE_operadoraritmeticoresta1 = 35, RULE_operadorlogico = 36, RULE_operadorcondicionalpuertalogica = 37, 
		RULE_cadena = 38, RULE_separadoroperaciones = 39, RULE_separadoroperadores = 40, 
		RULE_separadordospuntos = 41, RULE_operadoraperturaparentesis = 42, RULE_operadorcierreparentesis = 43, 
		RULE_tipovariable = 44, RULE_comentarios = 45, RULE_entero = 46, RULE_flotante = 47, 
		RULE_numeros = 48, RULE_palabraclavebooleano = 49, RULE_palabraclavebuclefor = 50, 
		RULE_palabraclaveendbuclefor = 51, RULE_palabraclaveinciovalorfor = 52, 
		RULE_palabraclavesaltoelementofor = 53, RULE_palabraclavefinvalorfor = 54, 
		RULE_palabraclavehacerfor = 55, RULE_palabraclavebuclewhile = 56, RULE_palabrareservadaaperturaswitch = 57, 
		RULE_palabrareservadacierrewitch = 58, RULE_palabrareservadacase = 59, 
		RULE_palabrareservadabreak = 60, RULE_palabrareservadadefault = 61, RULE_palabraclavecondiciones = 62, 
		RULE_palabraclavethen = 63, RULE_palabraclaveendif = 64, RULE_palabraclaveincluirlibreria = 65, 
		RULE_palabraclavecreacionfuncion = 66, RULE_palabraclavefuncionmain = 67, 
		RULE_palabraclavefunciondevolver = 68, RULE_palabraclaveinicio = 69, RULE_palabraclavefin = 70;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "libreria", "asignacion", "variable", "condicion", "operacionswitch", 
			"cabeceraswitch", "cuerposwitch", "condicional", "condicionales", "funcionwhile", 
			"funcionfor", "cuerpo", "cuerpo2", "cuerpo3", "cuerpo4", "llamarfuncion", 
			"codigo", "crearfuncion", "devolver", "retorno", "cabecerafuncion", "expr", 
			"expresionlogica", "nombrefuncion", "nombrevariable", "nombrepaquete", 
			"operadorasignacion", "parametros", "parametro", "operadoraritmeticoproducto", 
			"operadoraritmeticodivision", "operadoraritmeticosuma", "operadoraritmeticoresta", 
			"operadoraritmeticosuma1", "operadoraritmeticoresta1", "operadorlogico", 
			"operadorcondicionalpuertalogica", "cadena", "separadoroperaciones", 
			"separadoroperadores", "separadordospuntos", "operadoraperturaparentesis", 
			"operadorcierreparentesis", "tipovariable", "comentarios", "entero", 
			"flotante", "numeros", "palabraclavebooleano", "palabraclavebuclefor", 
			"palabraclaveendbuclefor", "palabraclaveinciovalorfor", "palabraclavesaltoelementofor", 
			"palabraclavefinvalorfor", "palabraclavehacerfor", "palabraclavebuclewhile", 
			"palabrareservadaaperturaswitch", "palabrareservadacierrewitch", "palabrareservadacase", 
			"palabrareservadabreak", "palabrareservadadefault", "palabraclavecondiciones", 
			"palabraclavethen", "palabraclaveendif", "palabraclaveincluirlibreria", 
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
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(142);
					libreria();
					}
					break;
				case 2:
					{
					setState(143);
					expr(0);
					}
					break;
				case 3:
					{
					setState(144);
					asignacion();
					}
					break;
				case 4:
					{
					setState(145);
					crearfuncion();
					}
					break;
				}
				}
				setState(148); 
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
			setState(154); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(150);
					palabraclaveincluirlibreria();
					setState(151);
					nombrepaquete();
					setState(152);
					separadoroperaciones();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(156); 
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << STRING) | (1L << NUMERO))) != 0)) {
					{
					setState(158);
					tipovariable();
					}
				}

				setState(161);
				nombrevariable();
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(162);
					operadorasignacion();
					setState(163);
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
				setState(167);
				tipovariable();
				setState(168);
				nombrevariable();
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(169);
						separadoroperadores();
						setState(170);
						nombrevariable();
						}
						} 
					}
					setState(176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				}
				break;
			}
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(179);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << STRING) | (1L << NUMERO))) != 0)) {
				{
				setState(182);
				tipovariable();
				}
			}

			setState(185);
			nombrevariable();
			setState(186);
			operadorasignacion();
			setState(187);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Pl2compilerParserVisitor ) return ((Pl2compilerParserVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			operadoraperturaparentesis();
			setState(190);
			expresionlogica();
			setState(191);
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
		enterRule(_localctx, 10, RULE_operacionswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			cabeceraswitch();
			setState(194);
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
		enterRule(_localctx, 12, RULE_cabeceraswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			palabrareservadaaperturaswitch();
			setState(197);
			operadoraperturaparentesis();
			setState(198);
			expr(0);
			setState(199);
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
		enterRule(_localctx, 14, RULE_cuerposwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				palabrareservadacase();
				setState(202);
				expr(0);
				setState(203);
				separadordospuntos();
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(204);
					cuerpo3();
					}
					break;
				case 2:
					{
					setState(205);
					cuerpo();
					}
					break;
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(208);
					palabrareservadabreak();
					setState(209);
					separadoroperaciones();
					}
				}

				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			{
			setState(217);
			palabrareservadadefault();
			setState(218);
			separadordospuntos();
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(219);
				cuerpo3();
				}
				break;
			case 2:
				{
				setState(220);
				cuerpo();
				}
				break;
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(223);
				palabrareservadabreak();
				setState(224);
				separadoroperaciones();
				}
			}

			}
			setState(228);
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
		enterRule(_localctx, 16, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(230);
			palabraclavecondiciones();
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(231);
				condicion();
				}
				}
				break;
			case 2:
				{
				{
				setState(232);
				condicion();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUERTALOGICAAND || _la==PUERTALOGICAOR) {
					{
					{
					setState(233);
					operadorcondicionalpuertalogica();
					setState(234);
					condicion();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(243);
				palabraclavethen();
				}
			}

			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(246);
				cuerpo3();
				}
				break;
			case 2:
				{
				setState(247);
				cuerpo4();
				}
				break;
			case 3:
				{
				setState(248);
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
		enterRule(_localctx, 18, RULE_condicionales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				condicional();
				}
				}
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONDICIONES );
			setState(256);
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
		enterRule(_localctx, 20, RULE_funcionwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			palabraclavebuclewhile();
			setState(259);
			operadoraperturaparentesis();
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(260);
				expr(0);
				}
				break;
			case 2:
				{
				setState(261);
				expresionlogica();
				}
				break;
			}
			setState(264);
			operadorcierreparentesis();
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(265);
				cuerpo();
				}
				break;
			case 2:
				{
				setState(266);
				cuerpo3();
				}
				break;
			case 3:
				{
				setState(267);
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
		enterRule(_localctx, 22, RULE_funcionfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			palabraclavebuclefor();
			setState(271);
			nombrevariable();
			setState(272);
			palabraclaveinciovalorfor();
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
			setState(277);
			palabraclavefinvalorfor();
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case ARRAY:
			case ID:
				{
				setState(278);
				nombrevariable();
				}
				break;
			case DIGITO:
			case FLOTANTE:
				{
				setState(279);
				numeros();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(282);
				palabraclavesaltoelementofor();
				setState(285);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
				case ARRAY:
				case ID:
					{
					setState(283);
					nombrevariable();
					}
					break;
				case DIGITO:
				case FLOTANTE:
					{
					setState(284);
					numeros();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(289);
			palabraclavehacerfor();
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(290);
				cuerpo();
				}
				break;
			case 2:
				{
				setState(291);
				cuerpo3();
				}
				break;
			case 3:
				{
				setState(292);
				cuerpo4();
				}
				break;
			}
			setState(295);
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
		enterRule(_localctx, 24, RULE_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(297);
			palabraclaveinicio();
			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(298);
				codigo();
				}
				}
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << BEGIN) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << DEVOLVER) | (1L << ARRAY) | (1L << ID))) != 0) );
			setState(303);
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
		enterRule(_localctx, 26, RULE_cuerpo2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(305);
					palabraclaveinicio();
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << BEGIN) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << DEVOLVER) | (1L << ARRAY) | (1L << ID))) != 0)) {
						{
						{
						setState(306);
						codigo();
						}
						}
						setState(311);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(312);
					palabraclavefin();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(316); 
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
		enterRule(_localctx, 28, RULE_cuerpo3);
		int _la;
		try {
			setState(331);
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
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(318);
					asignacion();
					}
					break;
				case 2:
					{
					setState(319);
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
				setState(322);
				palabraclaveinicio();
				setState(325); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(323);
						asignacion();
						}
						break;
					case 2:
						{
						setState(324);
						llamarfuncion();
						}
						break;
					}
					}
					setState(327); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << ARRAY) | (1L << ID))) != 0) );
				setState(329);
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
		enterRule(_localctx, 30, RULE_cuerpo4);
		int _la;
		try {
			int _alt;
			setState(348);
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
				setState(335); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(335);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(333);
							asignacion();
							}
							break;
						case 2:
							{
							setState(334);
							llamarfuncion();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(337); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(339);
				palabraclaveinicio();
				setState(342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(340);
						asignacion();
						}
						break;
					case 2:
						{
						setState(341);
						llamarfuncion();
						}
						break;
					}
					}
					setState(344); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << ARRAY) | (1L << ID))) != 0) );
				setState(346);
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
		enterRule(_localctx, 32, RULE_llamarfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(350);
				nombrefuncion();
				setState(351);
				operadoraperturaparentesis();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << PL) | (1L << DIGITO) | (1L << FLOTANTE) | (1L << ARRAY) | (1L << ID) | (1L << CADENA))) != 0)) {
					{
					setState(352);
					parametros();
					}
				}

				setState(355);
				operadorcierreparentesis();
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(356);
					separadoroperaciones();
					}
					break;
				}
				}
				}
				break;
			case FOR:
				{
				setState(359);
				funcionfor();
				}
				break;
			case WHILE:
				{
				setState(360);
				funcionwhile();
				}
				break;
			case CONDICIONES:
				{
				setState(361);
				condicionales();
				}
				break;
			case SWITCH:
				{
				setState(362);
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
		enterRule(_localctx, 34, RULE_codigo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(365);
						funcionwhile();
						}
						break;
					case 2:
						{
						setState(366);
						funcionfor();
						}
						break;
					case 3:
						{
						setState(367);
						operacionswitch();
						}
						break;
					case 4:
						{
						setState(368);
						asignacion();
						}
						break;
					case 5:
						{
						setState(369);
						llamarfuncion();
						}
						break;
					case 6:
						{
						setState(370);
						devolver();
						}
						break;
					case 7:
						{
						setState(371);
						cuerpo2();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(374); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 36, RULE_crearfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			cabecerafuncion();
			setState(377);
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
		enterRule(_localctx, 38, RULE_devolver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			palabraclavefunciondevolver();
			setState(380);
			operadoraperturaparentesis();
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(381);
				llamarfuncion();
				}
				break;
			case 2:
				{
				setState(382);
				expr(0);
				}
				break;
			}
			setState(385);
			operadorcierreparentesis();
			setState(386);
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
		enterRule(_localctx, 40, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
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
		enterRule(_localctx, 42, RULE_cabecerafuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			palabraclavecreacionfuncion();
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(391);
				nombrefuncion();
				}
				break;
			case MAIN:
				{
				setState(392);
				palabraclavefuncionmain();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(395);
			operadoraperturaparentesis();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDICIONES) | (1L << SWITCH) | (1L << CASE) | (1L << VOID) | (1L << STRING) | (1L << WHILE) | (1L << FOR) | (1L << NUMERO) | (1L << PL) | (1L << DIGITO) | (1L << FLOTANTE) | (1L << ARRAY) | (1L << ID) | (1L << CADENA))) != 0)) {
				{
				setState(396);
				parametros();
				}
			}

			setState(399);
			operadorcierreparentesis();
			setState(400);
			separadordospuntos();
			setState(401);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(404);
				llamarfuncion();
				}
				break;
			case 2:
				{
				setState(405);
				numeros();
				}
				break;
			case 3:
				{
				setState(406);
				nombrevariable();
				}
				break;
			case 4:
				{
				setState(407);
				operadoraperturaparentesis();
				setState(410);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
				case ARRAY:
				case ID:
					{
					setState(408);
					nombrevariable();
					}
					break;
				case DIGITO:
				case FLOTANTE:
					{
					setState(409);
					numeros();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(412);
					separadoroperadores();
					setState(415);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CASE:
					case ARRAY:
					case ID:
						{
						setState(413);
						nombrevariable();
						}
						break;
					case DIGITO:
					case FLOTANTE:
						{
						setState(414);
						numeros();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(422);
				operadorcierreparentesis();
				}
				break;
			case 5:
				{
				setState(424);
				cadena();
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(425);
						operadoraritmeticosuma();
						setState(426);
						expr(0);
						}
						} 
					}
					setState(432);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
				break;
			case 6:
				{
				setState(433);
				operadoraperturaparentesis();
				setState(434);
				expr(0);
				setState(435);
				operadorcierreparentesis();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(453);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(439);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(442);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PRODUCT:
							{
							setState(440);
							operadoraritmeticoproducto();
							}
							break;
						case DIVISION:
							{
							setState(441);
							operadoraritmeticodivision();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(444);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(446);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(449);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ADD:
							{
							setState(447);
							operadoraritmeticosuma();
							}
							break;
						case MINUS:
							{
							setState(448);
							operadoraritmeticoresta();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(451);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		enterRule(_localctx, 46, RULE_expresionlogica);
		try {
			int _alt;
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
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
					setState(458);
					expr(0);
					}
					break;
				case BOOLEAN:
					{
					setState(459);
					palabraclavebooleano();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(471); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(464);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MENORQUE:
						case MAYORQUE:
						case IGUALQUE:
						case DISTINTOQUE:
							{
							setState(462);
							operadorlogico();
							}
							break;
						case PUERTALOGICAAND:
						case PUERTALOGICAOR:
							{
							setState(463);
							operadorcondicionalpuertalogica();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(469);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(466);
							expr(0);
							}
							break;
						case 2:
							{
							setState(467);
							palabraclavebooleano();
							}
							break;
						case 3:
							{
							setState(468);
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
					setState(473); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
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
		enterRule(_localctx, 48, RULE_nombrefuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
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
		enterRule(_localctx, 50, RULE_nombrevariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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
		enterRule(_localctx, 52, RULE_nombrepaquete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
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
		enterRule(_localctx, 54, RULE_operadorasignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
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
		enterRule(_localctx, 56, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			parametro();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(487);
				separadoroperadores();
				setState(488);
				parametro();
				}
				}
				setState(494);
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
		enterRule(_localctx, 58, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << STRING) | (1L << NUMERO))) != 0)) {
				{
				setState(495);
				tipovariable();
				}
			}

			setState(498);
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
		enterRule(_localctx, 60, RULE_operadoraritmeticoproducto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
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
		enterRule(_localctx, 62, RULE_operadoraritmeticodivision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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
		enterRule(_localctx, 64, RULE_operadoraritmeticosuma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
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
		enterRule(_localctx, 66, RULE_operadoraritmeticoresta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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
		enterRule(_localctx, 68, RULE_operadoraritmeticosuma1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
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
		enterRule(_localctx, 70, RULE_operadoraritmeticoresta1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
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
		enterRule(_localctx, 72, RULE_operadorlogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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
		enterRule(_localctx, 74, RULE_operadorcondicionalpuertalogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		enterRule(_localctx, 76, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
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
		enterRule(_localctx, 78, RULE_separadoroperaciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		enterRule(_localctx, 80, RULE_separadoroperadores);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
		enterRule(_localctx, 82, RULE_separadordospuntos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
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
		enterRule(_localctx, 84, RULE_operadoraperturaparentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
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
		enterRule(_localctx, 86, RULE_operadorcierreparentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		enterRule(_localctx, 88, RULE_tipovariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
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
		enterRule(_localctx, 90, RULE_comentarios);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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
		enterRule(_localctx, 92, RULE_entero);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(532);
					match(DIGITO);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(535); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
		enterRule(_localctx, 94, RULE_flotante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
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
		enterRule(_localctx, 96, RULE_numeros);
		try {
			setState(541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITO:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				entero();
				}
				break;
			case FLOTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
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
		enterRule(_localctx, 98, RULE_palabraclavebooleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		enterRule(_localctx, 100, RULE_palabraclavebuclefor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
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
		enterRule(_localctx, 102, RULE_palabraclaveendbuclefor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
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
		enterRule(_localctx, 104, RULE_palabraclaveinciovalorfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
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
		enterRule(_localctx, 106, RULE_palabraclavesaltoelementofor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
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
		enterRule(_localctx, 108, RULE_palabraclavefinvalorfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
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
		enterRule(_localctx, 110, RULE_palabraclavehacerfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
		enterRule(_localctx, 112, RULE_palabraclavebuclewhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
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
		enterRule(_localctx, 114, RULE_palabrareservadaaperturaswitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
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
		enterRule(_localctx, 116, RULE_palabrareservadacierrewitch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
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
		enterRule(_localctx, 118, RULE_palabrareservadacase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
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
		enterRule(_localctx, 120, RULE_palabrareservadabreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
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
		enterRule(_localctx, 122, RULE_palabrareservadadefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
		enterRule(_localctx, 124, RULE_palabraclavecondiciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
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
		enterRule(_localctx, 126, RULE_palabraclavethen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
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
		enterRule(_localctx, 128, RULE_palabraclaveendif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
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
		enterRule(_localctx, 130, RULE_palabraclaveincluirlibreria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
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
		enterRule(_localctx, 132, RULE_palabraclavecreacionfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
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
		enterRule(_localctx, 134, RULE_palabraclavefuncionmain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
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
		enterRule(_localctx, 136, RULE_palabraclavefunciondevolver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
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
		enterRule(_localctx, 138, RULE_palabraclaveinicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
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
		enterRule(_localctx, 140, RULE_palabraclavefin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
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
		case 22:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u024e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\6\2\u0095\n\2\r\2\16\2\u0096\3\3\3\3\3\3\3\3\6\3\u009d\n"+
		"\3\r\3\16\3\u009e\3\4\5\4\u00a2\n\4\3\4\3\4\3\4\3\4\5\4\u00a8\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4\u00af\n\4\f\4\16\4\u00b2\13\4\5\4\u00b4\n\4\3\4\5"+
		"\4\u00b7\n\4\3\5\5\5\u00ba\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00d1\n\t\3\t\3\t\3\t"+
		"\5\t\u00d6\n\t\6\t\u00d8\n\t\r\t\16\t\u00d9\3\t\3\t\3\t\3\t\5\t\u00e0"+
		"\n\t\3\t\3\t\3\t\5\t\u00e5\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ef"+
		"\n\n\f\n\16\n\u00f2\13\n\5\n\u00f4\n\n\3\n\5\n\u00f7\n\n\3\n\3\n\3\n\5"+
		"\n\u00fc\n\n\3\13\6\13\u00ff\n\13\r\13\16\13\u0100\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\5\f\u0109\n\f\3\f\3\f\3\f\3\f\5\f\u010f\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0116\n\r\3\r\3\r\3\r\5\r\u011b\n\r\3\r\3\r\3\r\5\r\u0120\n\r\5\r"+
		"\u0122\n\r\3\r\3\r\3\r\3\r\5\r\u0128\n\r\3\r\3\r\3\16\3\16\6\16\u012e"+
		"\n\16\r\16\16\16\u012f\3\16\3\16\3\17\3\17\7\17\u0136\n\17\f\17\16\17"+
		"\u0139\13\17\3\17\3\17\6\17\u013d\n\17\r\17\16\17\u013e\3\20\3\20\5\20"+
		"\u0143\n\20\3\20\3\20\3\20\6\20\u0148\n\20\r\20\16\20\u0149\3\20\3\20"+
		"\5\20\u014e\n\20\3\21\3\21\6\21\u0152\n\21\r\21\16\21\u0153\3\21\3\21"+
		"\3\21\6\21\u0159\n\21\r\21\16\21\u015a\3\21\3\21\5\21\u015f\n\21\3\22"+
		"\3\22\3\22\5\22\u0164\n\22\3\22\3\22\5\22\u0168\n\22\3\22\3\22\3\22\3"+
		"\22\5\22\u016e\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u0177\n\23"+
		"\r\23\16\23\u0178\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0182\n\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\5\27\u018c\n\27\3\27\3\27\5\27"+
		"\u0190\n\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u019d\n\30\3\30\3\30\3\30\5\30\u01a2\n\30\7\30\u01a4\n\30\f\30\16\30"+
		"\u01a7\13\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01af\n\30\f\30\16\30"+
		"\u01b2\13\30\3\30\3\30\3\30\3\30\5\30\u01b8\n\30\3\30\3\30\3\30\5\30\u01bd"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u01c4\n\30\3\30\3\30\7\30\u01c8\n"+
		"\30\f\30\16\30\u01cb\13\30\3\31\3\31\5\31\u01cf\n\31\3\31\3\31\5\31\u01d3"+
		"\n\31\3\31\3\31\3\31\5\31\u01d8\n\31\6\31\u01da\n\31\r\31\16\31\u01db"+
		"\3\31\5\31\u01df\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\7\36\u01ed\n\36\f\36\16\36\u01f0\13\36\3\37\5\37\u01f3\n\37"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\6\60\u0218\n\60\r\60\16"+
		"\60\u0219\3\61\3\61\3\62\3\62\5\62\u0220\n\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3"+
		"?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\2\3.I\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\2\7\4\2\6\6\678\3\2.\61\3\2\62\63\4\2\24\25\35\35\3\2;>\2\u025a\2\u0094"+
		"\3\2\2\2\4\u009c\3\2\2\2\6\u00b3\3\2\2\2\b\u00b9\3\2\2\2\n\u00bf\3\2\2"+
		"\2\f\u00c3\3\2\2\2\16\u00c6\3\2\2\2\20\u00d7\3\2\2\2\22\u00e8\3\2\2\2"+
		"\24\u00fe\3\2\2\2\26\u0104\3\2\2\2\30\u0110\3\2\2\2\32\u012b\3\2\2\2\34"+
		"\u013c\3\2\2\2\36\u014d\3\2\2\2 \u015e\3\2\2\2\"\u016d\3\2\2\2$\u0176"+
		"\3\2\2\2&\u017a\3\2\2\2(\u017d\3\2\2\2*\u0186\3\2\2\2,\u0188\3\2\2\2."+
		"\u01b7\3\2\2\2\60\u01de\3\2\2\2\62\u01e0\3\2\2\2\64\u01e2\3\2\2\2\66\u01e4"+
		"\3\2\2\28\u01e6\3\2\2\2:\u01e8\3\2\2\2<\u01f2\3\2\2\2>\u01f6\3\2\2\2@"+
		"\u01f8\3\2\2\2B\u01fa\3\2\2\2D\u01fc\3\2\2\2F\u01fe\3\2\2\2H\u0200\3\2"+
		"\2\2J\u0202\3\2\2\2L\u0204\3\2\2\2N\u0206\3\2\2\2P\u0208\3\2\2\2R\u020a"+
		"\3\2\2\2T\u020c\3\2\2\2V\u020e\3\2\2\2X\u0210\3\2\2\2Z\u0212\3\2\2\2\\"+
		"\u0214\3\2\2\2^\u0217\3\2\2\2`\u021b\3\2\2\2b\u021f\3\2\2\2d\u0221\3\2"+
		"\2\2f\u0223\3\2\2\2h\u0225\3\2\2\2j\u0227\3\2\2\2l\u0229\3\2\2\2n\u022b"+
		"\3\2\2\2p\u022d\3\2\2\2r\u022f\3\2\2\2t\u0231\3\2\2\2v\u0233\3\2\2\2x"+
		"\u0235\3\2\2\2z\u0237\3\2\2\2|\u0239\3\2\2\2~\u023b\3\2\2\2\u0080\u023d"+
		"\3\2\2\2\u0082\u023f\3\2\2\2\u0084\u0241\3\2\2\2\u0086\u0243\3\2\2\2\u0088"+
		"\u0245\3\2\2\2\u008a\u0247\3\2\2\2\u008c\u0249\3\2\2\2\u008e\u024b\3\2"+
		"\2\2\u0090\u0095\5\4\3\2\u0091\u0095\5.\30\2\u0092\u0095\5\6\4\2\u0093"+
		"\u0095\5&\24\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\3\3\2\2\2\u0098\u0099\5\u0084C\2\u0099\u009a\5\66"+
		"\34\2\u009a\u009b\5P)\2\u009b\u009d\3\2\2\2\u009c\u0098\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\5\3\2\2\2"+
		"\u00a0\u00a2\5Z.\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a7\5\64\33\2\u00a4\u00a5\58\35\2\u00a5\u00a6\5.\30\2"+
		"\u00a6\u00a8\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b4"+
		"\3\2\2\2\u00a9\u00aa\5Z.\2\u00aa\u00b0\5\64\33\2\u00ab\u00ac\5R*\2\u00ac"+
		"\u00ad\5\64\33\2\u00ad\u00af\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\u00b2\3"+
		"\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00a1\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00b7\5P)\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\7"+
		"\3\2\2\2\u00b8\u00ba\5Z.\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\5\64\33\2\u00bc\u00bd\58\35\2\u00bd\u00be\5"+
		".\30\2\u00be\t\3\2\2\2\u00bf\u00c0\5V,\2\u00c0\u00c1\5\60\31\2\u00c1\u00c2"+
		"\5X-\2\u00c2\13\3\2\2\2\u00c3\u00c4\5\16\b\2\u00c4\u00c5\5\20\t\2\u00c5"+
		"\r\3\2\2\2\u00c6\u00c7\5t;\2\u00c7\u00c8\5V,\2\u00c8\u00c9\5.\30\2\u00c9"+
		"\u00ca\5X-\2\u00ca\17\3\2\2\2\u00cb\u00cc\5x=\2\u00cc\u00cd\5.\30\2\u00cd"+
		"\u00d0\5T+\2\u00ce\u00d1\5\36\20\2\u00cf\u00d1\5\32\16\2\u00d0\u00ce\3"+
		"\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d5\3\2\2\2\u00d2\u00d3\5z>\2\u00d3"+
		"\u00d4\5P)\2\u00d4\u00d6\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d6\3\2\2"+
		"\2\u00d6\u00d8\3\2\2\2\u00d7\u00cb\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\5|?\2\u00dc"+
		"\u00df\5T+\2\u00dd\u00e0\5\36\20\2\u00de\u00e0\5\32\16\2\u00df\u00dd\3"+
		"\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e2\5z>\2\u00e2"+
		"\u00e3\5P)\2\u00e3\u00e5\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e5\3\2\2"+
		"\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\5v<\2\u00e7\21\3\2\2\2\u00e8\u00f3"+
		"\5~@\2\u00e9\u00f4\5\n\6\2\u00ea\u00f0\5\n\6\2\u00eb\u00ec\5L\'\2\u00ec"+
		"\u00ed\5\n\6\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f3\u00ea\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f7\5\u0080A\2\u00f6\u00f5\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00fb\3\2\2\2\u00f8\u00fc\5\36\20\2\u00f9\u00fc\5"+
		" \21\2\u00fa\u00fc\5\32\16\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\23\3\2\2\2\u00fd\u00ff\5\22\n\2\u00fe\u00fd\3\2\2"+
		"\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0103\5\u0082B\2\u0103\25\3\2\2\2\u0104\u0105\5r:\2\u0105"+
		"\u0108\5V,\2\u0106\u0109\5.\30\2\u0107\u0109\5\60\31\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010e\5X-\2\u010b\u010f"+
		"\5\32\16\2\u010c\u010f\5\36\20\2\u010d\u010f\5 \21\2\u010e\u010b\3\2\2"+
		"\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\27\3\2\2\2\u0110\u0111"+
		"\5f\64\2\u0111\u0112\5\64\33\2\u0112\u0115\5j\66\2\u0113\u0116\5\64\33"+
		"\2\u0114\u0116\5b\62\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u011a\5n8\2\u0118\u011b\5\64\33\2\u0119\u011b\5b\62\2\u011a"+
		"\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u0121\3\2\2\2\u011c\u011f\5l"+
		"\67\2\u011d\u0120\5\64\33\2\u011e\u0120\5b\62\2\u011f\u011d\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0127\5p9\2\u0124\u0128\5\32\16\2\u0125"+
		"\u0128\5\36\20\2\u0126\u0128\5 \21\2\u0127\u0124\3\2\2\2\u0127\u0125\3"+
		"\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\5h\65\2\u012a"+
		"\31\3\2\2\2\u012b\u012d\5\u008cG\2\u012c\u012e\5$\23\2\u012d\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\5\u008eH\2\u0132\33\3\2\2\2\u0133\u0137\5\u008c"+
		"G\2\u0134\u0136\5$\23\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u013a\u013b\5\u008eH\2\u013b\u013d\3\2\2\2\u013c\u0133\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\35\3\2\2"+
		"\2\u0140\u0143\5\6\4\2\u0141\u0143\5\"\22\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0141\3\2\2\2\u0143\u014e\3\2\2\2\u0144\u0147\5\u008cG\2\u0145\u0148"+
		"\5\6\4\2\u0146\u0148\5\"\22\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2"+
		"\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\5\u008eH\2\u014c\u014e\3\2\2\2\u014d\u0142\3\2\2"+
		"\2\u014d\u0144\3\2\2\2\u014e\37\3\2\2\2\u014f\u0152\5\6\4\2\u0150\u0152"+
		"\5\"\22\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2"+
		"\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u015f\3\2\2\2\u0155\u0158"+
		"\5\u008cG\2\u0156\u0159\5\6\4\2\u0157\u0159\5\"\22\2\u0158\u0156\3\2\2"+
		"\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\5\u008eH\2\u015d\u015f\3\2\2"+
		"\2\u015e\u0151\3\2\2\2\u015e\u0155\3\2\2\2\u015f!\3\2\2\2\u0160\u0161"+
		"\5\62\32\2\u0161\u0163\5V,\2\u0162\u0164\5:\36\2\u0163\u0162\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\5X-\2\u0166\u0168\5P)\2"+
		"\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016e\3\2\2\2\u0169\u016e"+
		"\5\30\r\2\u016a\u016e\5\26\f\2\u016b\u016e\5\24\13\2\u016c\u016e\5\f\7"+
		"\2\u016d\u0160\3\2\2\2\u016d\u0169\3\2\2\2\u016d\u016a\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016c\3\2\2\2\u016e#\3\2\2\2\u016f\u0177\5\26\f\2\u0170"+
		"\u0177\5\30\r\2\u0171\u0177\5\f\7\2\u0172\u0177\5\6\4\2\u0173\u0177\5"+
		"\"\22\2\u0174\u0177\5(\25\2\u0175\u0177\5\34\17\2\u0176\u016f\3\2\2\2"+
		"\u0176\u0170\3\2\2\2\u0176\u0171\3\2\2\2\u0176\u0172\3\2\2\2\u0176\u0173"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179%\3\2\2\2\u017a\u017b\5,\27\2"+
		"\u017b\u017c\5\32\16\2\u017c\'\3\2\2\2\u017d\u017e\5\u008aF\2\u017e\u0181"+
		"\5V,\2\u017f\u0182\5\"\22\2\u0180\u0182\5.\30\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\5X"+
		"-\2\u0184\u0185\5P)\2\u0185)\3\2\2\2\u0186\u0187\5Z.\2\u0187+\3\2\2\2"+
		"\u0188\u018b\5\u0086D\2\u0189\u018c\5\62\32\2\u018a\u018c\5\u0088E\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\5V"+
		",\2\u018e\u0190\5:\36\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0192\5X-\2\u0192\u0193\5T+\2\u0193\u0194\5*\26\2"+
		"\u0194-\3\2\2\2\u0195\u0196\b\30\1\2\u0196\u01b8\5\"\22\2\u0197\u01b8"+
		"\5b\62\2\u0198\u01b8\5\64\33\2\u0199\u019c\5V,\2\u019a\u019d\5\64\33\2"+
		"\u019b\u019d\5b\62\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u01a5"+
		"\3\2\2\2\u019e\u01a1\5R*\2\u019f\u01a2\5\64\33\2\u01a0\u01a2\5b\62\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019e\3\2"+
		"\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\5X-\2\u01a9\u01b8\3\2\2"+
		"\2\u01aa\u01b0\5N(\2\u01ab\u01ac\5B\"\2\u01ac\u01ad\5.\30\2\u01ad\u01af"+
		"\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b8\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\5V"+
		",\2\u01b4\u01b5\5.\30\2\u01b5\u01b6\5X-\2\u01b6\u01b8\3\2\2\2\u01b7\u0195"+
		"\3\2\2\2\u01b7\u0197\3\2\2\2\u01b7\u0198\3\2\2\2\u01b7\u0199\3\2\2\2\u01b7"+
		"\u01aa\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b8\u01c9\3\2\2\2\u01b9\u01bc\f\n"+
		"\2\2\u01ba\u01bd\5> \2\u01bb\u01bd\5@!\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5.\30\13\u01bf\u01c8\3\2\2\2"+
		"\u01c0\u01c3\f\t\2\2\u01c1\u01c4\5B\"\2\u01c2\u01c4\5D#\2\u01c3\u01c1"+
		"\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\5.\30\n\u01c6"+
		"\u01c8\3\2\2\2\u01c7\u01b9\3\2\2\2\u01c7\u01c0\3\2\2\2\u01c8\u01cb\3\2"+
		"\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca/\3\2\2\2\u01cb\u01c9"+
		"\3\2\2\2\u01cc\u01cf\5.\30\2\u01cd\u01cf\5d\63\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf\u01d9\3\2\2\2\u01d0\u01d3\5J&\2\u01d1\u01d3\5L\'"+
		"\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d7\3\2\2\2\u01d4\u01d8"+
		"\5.\30\2\u01d5\u01d8\5d\63\2\u01d6\u01d8\5\60\31\2\u01d7\u01d4\3\2\2\2"+
		"\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d2"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01df\3\2\2\2\u01dd\u01df\5d\63\2\u01de\u01ce\3\2\2\2\u01de\u01dd\3\2"+
		"\2\2\u01df\61\3\2\2\2\u01e0\u01e1\78\2\2\u01e1\63\3\2\2\2\u01e2\u01e3"+
		"\t\2\2\2\u01e3\65\3\2\2\2\u01e4\u01e5\78\2\2\u01e5\67\3\2\2\2\u01e6\u01e7"+
		"\7,\2\2\u01e79\3\2\2\2\u01e8\u01ee\5<\37\2\u01e9\u01ea\5R*\2\u01ea\u01eb"+
		"\5<\37\2\u01eb\u01ed\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef;\3\2\2\2\u01f0\u01ee\3\2\2\2"+
		"\u01f1\u01f3\5Z.\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4"+
		"\3\2\2\2\u01f4\u01f5\5.\30\2\u01f5=\3\2\2\2\u01f6\u01f7\7*\2\2\u01f7?"+
		"\3\2\2\2\u01f8\u01f9\7+\2\2\u01f9A\3\2\2\2\u01fa\u01fb\7(\2\2\u01fbC\3"+
		"\2\2\2\u01fc\u01fd\7)\2\2\u01fdE\3\2\2\2\u01fe\u01ff\7&\2\2\u01ffG\3\2"+
		"\2\2\u0200\u0201\7\'\2\2\u0201I\3\2\2\2\u0202\u0203\t\3\2\2\u0203K\3\2"+
		"\2\2\u0204\u0205\t\4\2\2\u0205M\3\2\2\2\u0206\u0207\7:\2\2\u0207O\3\2"+
		"\2\2\u0208\u0209\7 \2\2\u0209Q\3\2\2\2\u020a\u020b\7%\2\2\u020bS\3\2\2"+
		"\2\u020c\u020d\7#\2\2\u020dU\3\2\2\2\u020e\u020f\7!\2\2\u020fW\3\2\2\2"+
		"\u0210\u0211\7\"\2\2\u0211Y\3\2\2\2\u0212\u0213\t\5\2\2\u0213[\3\2\2\2"+
		"\u0214\u0215\t\6\2\2\u0215]\3\2\2\2\u0216\u0218\7\64\2\2\u0217\u0216\3"+
		"\2\2\2\u0218\u0219\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"_\3\2\2\2\u021b\u021c\7\65\2\2\u021ca\3\2\2\2\u021d\u0220\5^\60\2\u021e"+
		"\u0220\5`\61\2\u021f\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u0220c\3\2\2\2"+
		"\u0221\u0222\7\t\2\2\u0222e\3\2\2\2\u0223\u0224\7\27\2\2\u0224g\3\2\2"+
		"\2\u0225\u0226\7\30\2\2\u0226i\3\2\2\2\u0227\u0228\7\31\2\2\u0228k\3\2"+
		"\2\2\u0229\u022a\7\32\2\2\u022am\3\2\2\2\u022b\u022c\7\33\2\2\u022co\3"+
		"\2\2\2\u022d\u022e\7\34\2\2\u022eq\3\2\2\2\u022f\u0230\7\26\2\2\u0230"+
		"s\3\2\2\2\u0231\u0232\7\4\2\2\u0232u\3\2\2\2\u0233\u0234\7\5\2\2\u0234"+
		"w\3\2\2\2\u0235\u0236\7\6\2\2\u0236y\3\2\2\2\u0237\u0238\7\7\2\2\u0238"+
		"{\3\2\2\2\u0239\u023a\7\b\2\2\u023a}\3\2\2\2\u023b\u023c\7\3\2\2\u023c"+
		"\177\3\2\2\2\u023d\u023e\7\16\2\2\u023e\u0081\3\2\2\2\u023f\u0240\7\17"+
		"\2\2\u0240\u0083\3\2\2\2\u0241\u0242\7\22\2\2\u0242\u0085\3\2\2\2\u0243"+
		"\u0244\7\23\2\2\u0244\u0087\3\2\2\2\u0245\u0246\7\37\2\2\u0246\u0089\3"+
		"\2\2\2\u0247\u0248\7\36\2\2\u0248\u008b\3\2\2\2\u0249\u024a\7\20\2\2\u024a"+
		"\u008d\3\2\2\2\u024b\u024c\7\21\2\2\u024c\u008f\3\2\2\2B\u0094\u0096\u009e"+
		"\u00a1\u00a7\u00b0\u00b3\u00b6\u00b9\u00d0\u00d5\u00d9\u00df\u00e4\u00f0"+
		"\u00f3\u00f6\u00fb\u0100\u0108\u010e\u0115\u011a\u011f\u0121\u0127\u012f"+
		"\u0137\u013e\u0142\u0147\u0149\u014d\u0151\u0153\u0158\u015a\u015e\u0163"+
		"\u0167\u016d\u0176\u0178\u0181\u018b\u018f\u019c\u01a1\u01a5\u01b0\u01b7"+
		"\u01bc\u01c3\u01c7\u01c9\u01ce\u01d2\u01d7\u01db\u01de\u01ee\u01f2\u0219"+
		"\u021f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}