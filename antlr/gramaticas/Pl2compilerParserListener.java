// Generated from Pl2compilerParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Pl2compilerParser}.
 */
public interface Pl2compilerParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Pl2compilerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Pl2compilerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#libreria}.
	 * @param ctx the parse tree
	 */
	void enterLibreria(Pl2compilerParser.LibreriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#libreria}.
	 * @param ctx the parse tree
	 */
	void exitLibreria(Pl2compilerParser.LibreriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(Pl2compilerParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(Pl2compilerParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Pl2compilerParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Pl2compilerParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(Pl2compilerParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(Pl2compilerParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#operacionswitch}.
	 * @param ctx the parse tree
	 */
	void enterOperacionswitch(Pl2compilerParser.OperacionswitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#operacionswitch}.
	 * @param ctx the parse tree
	 */
	void exitOperacionswitch(Pl2compilerParser.OperacionswitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#cabeceraswitch}.
	 * @param ctx the parse tree
	 */
	void enterCabeceraswitch(Pl2compilerParser.CabeceraswitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#cabeceraswitch}.
	 * @param ctx the parse tree
	 */
	void exitCabeceraswitch(Pl2compilerParser.CabeceraswitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#cuerposwitch}.
	 * @param ctx the parse tree
	 */
	void enterCuerposwitch(Pl2compilerParser.CuerposwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#cuerposwitch}.
	 * @param ctx the parse tree
	 */
	void exitCuerposwitch(Pl2compilerParser.CuerposwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterCondicionales(Pl2compilerParser.CondicionalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitCondicionales(Pl2compilerParser.CondicionalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#funcionwhile}.
	 * @param ctx the parse tree
	 */
	void enterFuncionwhile(Pl2compilerParser.FuncionwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#funcionwhile}.
	 * @param ctx the parse tree
	 */
	void exitFuncionwhile(Pl2compilerParser.FuncionwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#funcionfor}.
	 * @param ctx the parse tree
	 */
	void enterFuncionfor(Pl2compilerParser.FuncionforContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#funcionfor}.
	 * @param ctx the parse tree
	 */
	void exitFuncionfor(Pl2compilerParser.FuncionforContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(Pl2compilerParser.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(Pl2compilerParser.CuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#cuerpo2}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo2(Pl2compilerParser.Cuerpo2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#cuerpo2}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo2(Pl2compilerParser.Cuerpo2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#cuerpo3}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo3(Pl2compilerParser.Cuerpo3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#cuerpo3}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo3(Pl2compilerParser.Cuerpo3Context ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#llamarfuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamarfuncion(Pl2compilerParser.LlamarfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#llamarfuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamarfuncion(Pl2compilerParser.LlamarfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(Pl2compilerParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(Pl2compilerParser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#crearfuncion}.
	 * @param ctx the parse tree
	 */
	void enterCrearfuncion(Pl2compilerParser.CrearfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#crearfuncion}.
	 * @param ctx the parse tree
	 */
	void exitCrearfuncion(Pl2compilerParser.CrearfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#devolver}.
	 * @param ctx the parse tree
	 */
	void enterDevolver(Pl2compilerParser.DevolverContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#devolver}.
	 * @param ctx the parse tree
	 */
	void exitDevolver(Pl2compilerParser.DevolverContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(Pl2compilerParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(Pl2compilerParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#cabecerafuncion}.
	 * @param ctx the parse tree
	 */
	void enterCabecerafuncion(Pl2compilerParser.CabecerafuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#cabecerafuncion}.
	 * @param ctx the parse tree
	 */
	void exitCabecerafuncion(Pl2compilerParser.CabecerafuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Pl2compilerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Pl2compilerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#expresionlogica}.
	 * @param ctx the parse tree
	 */
	void enterExpresionlogica(Pl2compilerParser.ExpresionlogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#expresionlogica}.
	 * @param ctx the parse tree
	 */
	void exitExpresionlogica(Pl2compilerParser.ExpresionlogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#nombrefuncion}.
	 * @param ctx the parse tree
	 */
	void enterNombrefuncion(Pl2compilerParser.NombrefuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#nombrefuncion}.
	 * @param ctx the parse tree
	 */
	void exitNombrefuncion(Pl2compilerParser.NombrefuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#nombrevariable}.
	 * @param ctx the parse tree
	 */
	void enterNombrevariable(Pl2compilerParser.NombrevariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#nombrevariable}.
	 * @param ctx the parse tree
	 */
	void exitNombrevariable(Pl2compilerParser.NombrevariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#nombrepaquete}.
	 * @param ctx the parse tree
	 */
	void enterNombrepaquete(Pl2compilerParser.NombrepaqueteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#nombrepaquete}.
	 * @param ctx the parse tree
	 */
	void exitNombrepaquete(Pl2compilerParser.NombrepaqueteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#operadorasignacion}.
	 * @param ctx the parse tree
	 */
	void enterOperadorasignacion(Pl2compilerParser.OperadorasignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#operadorasignacion}.
	 * @param ctx the parse tree
	 */
	void exitOperadorasignacion(Pl2compilerParser.OperadorasignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(Pl2compilerParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(Pl2compilerParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(Pl2compilerParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(Pl2compilerParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#operadoraritmeticoproducto}.
	 * @param ctx the parse tree
	 */
	void enterOperadoraritmeticoproducto(Pl2compilerParser.OperadoraritmeticoproductoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#operadoraritmeticoproducto}.
	 * @param ctx the parse tree
	 */
	void exitOperadoraritmeticoproducto(Pl2compilerParser.OperadoraritmeticoproductoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#operadoraritmeticodivision}.
	 * @param ctx the parse tree
	 */
	void enterOperadoraritmeticodivision(Pl2compilerParser.OperadoraritmeticodivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#operadoraritmeticodivision}.
	 * @param ctx the parse tree
	 */
	void exitOperadoraritmeticodivision(Pl2compilerParser.OperadoraritmeticodivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#operadoraritmeticosuma}.
	 * @param ctx the parse tree
	 */
	void enterOperadoraritmeticosuma(Pl2compilerParser.OperadoraritmeticosumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#operadoraritmeticosuma}.
	 * @param ctx the parse tree
	 */
	void exitOperadoraritmeticosuma(Pl2compilerParser.OperadoraritmeticosumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#operadoraritmeticoresta}.
	 * @param ctx the parse tree
	 */
	void enterOperadoraritmeticoresta(Pl2compilerParser.OperadoraritmeticorestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#operadoraritmeticoresta}.
	 * @param ctx the parse tree
	 */
	void exitOperadoraritmeticoresta(Pl2compilerParser.OperadoraritmeticorestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#operadoraritmeticosuma1}.
	 * @param ctx the parse tree
	 */
	void enterOperadoraritmeticosuma1(Pl2compilerParser.Operadoraritmeticosuma1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#operadoraritmeticosuma1}.
	 * @param ctx the parse tree
	 */
	void exitOperadoraritmeticosuma1(Pl2compilerParser.Operadoraritmeticosuma1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#operadoraritmeticoresta1}.
	 * @param ctx the parse tree
	 */
	void enterOperadoraritmeticoresta1(Pl2compilerParser.Operadoraritmeticoresta1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#operadoraritmeticoresta1}.
	 * @param ctx the parse tree
	 */
	void exitOperadoraritmeticoresta1(Pl2compilerParser.Operadoraritmeticoresta1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#operadorlogico}.
	 * @param ctx the parse tree
	 */
	void enterOperadorlogico(Pl2compilerParser.OperadorlogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#operadorlogico}.
	 * @param ctx the parse tree
	 */
	void exitOperadorlogico(Pl2compilerParser.OperadorlogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#operadorcondicionalpuertalogica}.
	 * @param ctx the parse tree
	 */
	void enterOperadorcondicionalpuertalogica(Pl2compilerParser.OperadorcondicionalpuertalogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#operadorcondicionalpuertalogica}.
	 * @param ctx the parse tree
	 */
	void exitOperadorcondicionalpuertalogica(Pl2compilerParser.OperadorcondicionalpuertalogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(Pl2compilerParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(Pl2compilerParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#separadoroperaciones}.
	 * @param ctx the parse tree
	 */
	void enterSeparadoroperaciones(Pl2compilerParser.SeparadoroperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#separadoroperaciones}.
	 * @param ctx the parse tree
	 */
	void exitSeparadoroperaciones(Pl2compilerParser.SeparadoroperacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#separadoroperadores}.
	 * @param ctx the parse tree
	 */
	void enterSeparadoroperadores(Pl2compilerParser.SeparadoroperadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#separadoroperadores}.
	 * @param ctx the parse tree
	 */
	void exitSeparadoroperadores(Pl2compilerParser.SeparadoroperadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#separadordospuntos}.
	 * @param ctx the parse tree
	 */
	void enterSeparadordospuntos(Pl2compilerParser.SeparadordospuntosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#separadordospuntos}.
	 * @param ctx the parse tree
	 */
	void exitSeparadordospuntos(Pl2compilerParser.SeparadordospuntosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#operadoraperturaparentesis}.
	 * @param ctx the parse tree
	 */
	void enterOperadoraperturaparentesis(Pl2compilerParser.OperadoraperturaparentesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#operadoraperturaparentesis}.
	 * @param ctx the parse tree
	 */
	void exitOperadoraperturaparentesis(Pl2compilerParser.OperadoraperturaparentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#operadorcierreparentesis}.
	 * @param ctx the parse tree
	 */
	void enterOperadorcierreparentesis(Pl2compilerParser.OperadorcierreparentesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#operadorcierreparentesis}.
	 * @param ctx the parse tree
	 */
	void exitOperadorcierreparentesis(Pl2compilerParser.OperadorcierreparentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#tipovariable}.
	 * @param ctx the parse tree
	 */
	void enterTipovariable(Pl2compilerParser.TipovariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#tipovariable}.
	 * @param ctx the parse tree
	 */
	void exitTipovariable(Pl2compilerParser.TipovariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#comentarios}.
	 * @param ctx the parse tree
	 */
	void enterComentarios(Pl2compilerParser.ComentariosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#comentarios}.
	 * @param ctx the parse tree
	 */
	void exitComentarios(Pl2compilerParser.ComentariosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(Pl2compilerParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(Pl2compilerParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#flotante}.
	 * @param ctx the parse tree
	 */
	void enterFlotante(Pl2compilerParser.FlotanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#flotante}.
	 * @param ctx the parse tree
	 */
	void exitFlotante(Pl2compilerParser.FlotanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#numeros}.
	 * @param ctx the parse tree
	 */
	void enterNumeros(Pl2compilerParser.NumerosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#numeros}.
	 * @param ctx the parse tree
	 */
	void exitNumeros(Pl2compilerParser.NumerosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclavebooleano}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclavebooleano(Pl2compilerParser.PalabraclavebooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclavebooleano}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclavebooleano(Pl2compilerParser.PalabraclavebooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclavebuclefor}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclavebuclefor(Pl2compilerParser.PalabraclavebucleforContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclavebuclefor}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclavebuclefor(Pl2compilerParser.PalabraclavebucleforContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclaveendbuclefor}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclaveendbuclefor(Pl2compilerParser.PalabraclaveendbucleforContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclaveendbuclefor}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclaveendbuclefor(Pl2compilerParser.PalabraclaveendbucleforContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclaveinciovalorfor}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclaveinciovalorfor(Pl2compilerParser.PalabraclaveinciovalorforContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclaveinciovalorfor}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclaveinciovalorfor(Pl2compilerParser.PalabraclaveinciovalorforContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclavesaltoelementofor}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclavesaltoelementofor(Pl2compilerParser.PalabraclavesaltoelementoforContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclavesaltoelementofor}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclavesaltoelementofor(Pl2compilerParser.PalabraclavesaltoelementoforContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclavefinvalorfor}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclavefinvalorfor(Pl2compilerParser.PalabraclavefinvalorforContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclavefinvalorfor}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclavefinvalorfor(Pl2compilerParser.PalabraclavefinvalorforContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclavehacerfor}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclavehacerfor(Pl2compilerParser.PalabraclavehacerforContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclavehacerfor}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclavehacerfor(Pl2compilerParser.PalabraclavehacerforContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclavebuclewhile}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclavebuclewhile(Pl2compilerParser.PalabraclavebuclewhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclavebuclewhile}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclavebuclewhile(Pl2compilerParser.PalabraclavebuclewhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabrareservadaaperturaswitch}.
	 * @param ctx the parse tree
	 */
	void enterPalabrareservadaaperturaswitch(Pl2compilerParser.PalabrareservadaaperturaswitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabrareservadaaperturaswitch}.
	 * @param ctx the parse tree
	 */
	void exitPalabrareservadaaperturaswitch(Pl2compilerParser.PalabrareservadaaperturaswitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabrareservadacierrewitch}.
	 * @param ctx the parse tree
	 */
	void enterPalabrareservadacierrewitch(Pl2compilerParser.PalabrareservadacierrewitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabrareservadacierrewitch}.
	 * @param ctx the parse tree
	 */
	void exitPalabrareservadacierrewitch(Pl2compilerParser.PalabrareservadacierrewitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabrareservadacase}.
	 * @param ctx the parse tree
	 */
	void enterPalabrareservadacase(Pl2compilerParser.PalabrareservadacaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabrareservadacase}.
	 * @param ctx the parse tree
	 */
	void exitPalabrareservadacase(Pl2compilerParser.PalabrareservadacaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabrareservadabreak}.
	 * @param ctx the parse tree
	 */
	void enterPalabrareservadabreak(Pl2compilerParser.PalabrareservadabreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabrareservadabreak}.
	 * @param ctx the parse tree
	 */
	void exitPalabrareservadabreak(Pl2compilerParser.PalabrareservadabreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabrareservadadefault}.
	 * @param ctx the parse tree
	 */
	void enterPalabrareservadadefault(Pl2compilerParser.PalabrareservadadefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabrareservadadefault}.
	 * @param ctx the parse tree
	 */
	void exitPalabrareservadadefault(Pl2compilerParser.PalabrareservadadefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclavecondiciones}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclavecondiciones(Pl2compilerParser.PalabraclavecondicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclavecondiciones}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclavecondiciones(Pl2compilerParser.PalabraclavecondicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclavethen}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclavethen(Pl2compilerParser.PalabraclavethenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclavethen}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclavethen(Pl2compilerParser.PalabraclavethenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclaveendif}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclaveendif(Pl2compilerParser.PalabraclaveendifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclaveendif}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclaveendif(Pl2compilerParser.PalabraclaveendifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclaveincluirlibreria}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclaveincluirlibreria(Pl2compilerParser.PalabraclaveincluirlibreriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclaveincluirlibreria}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclaveincluirlibreria(Pl2compilerParser.PalabraclaveincluirlibreriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclavecreacionfuncion}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclavecreacionfuncion(Pl2compilerParser.PalabraclavecreacionfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclavecreacionfuncion}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclavecreacionfuncion(Pl2compilerParser.PalabraclavecreacionfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclavefuncionmain}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclavefuncionmain(Pl2compilerParser.PalabraclavefuncionmainContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclavefuncionmain}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclavefuncionmain(Pl2compilerParser.PalabraclavefuncionmainContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclavefunciondevolver}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclavefunciondevolver(Pl2compilerParser.PalabraclavefunciondevolverContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclavefunciondevolver}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclavefunciondevolver(Pl2compilerParser.PalabraclavefunciondevolverContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclaveinicio}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclaveinicio(Pl2compilerParser.PalabraclaveinicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclaveinicio}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclaveinicio(Pl2compilerParser.PalabraclaveinicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link Pl2compilerParser#palabraclavefin}.
	 * @param ctx the parse tree
	 */
	void enterPalabraclavefin(Pl2compilerParser.PalabraclavefinContext ctx);
	/**
	 * Exit a parse tree produced by {@link Pl2compilerParser#palabraclavefin}.
	 * @param ctx the parse tree
	 */
	void exitPalabraclavefin(Pl2compilerParser.PalabraclavefinContext ctx);
}