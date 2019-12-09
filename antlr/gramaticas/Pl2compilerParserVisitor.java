// Generated from ./Pl2compilerParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Pl2compilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Pl2compilerParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Pl2compilerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#libreria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibreria(Pl2compilerParser.LibreriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(Pl2compilerParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Pl2compilerParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(Pl2compilerParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#operacionswitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacionswitch(Pl2compilerParser.OperacionswitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#cabeceraswitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabeceraswitch(Pl2compilerParser.CabeceraswitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#cuerposwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerposwitch(Pl2compilerParser.CuerposwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#condicionales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionales(Pl2compilerParser.CondicionalesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#funcionwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionwhile(Pl2compilerParser.FuncionwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#funcionfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionfor(Pl2compilerParser.FuncionforContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(Pl2compilerParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#cuerpo2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo2(Pl2compilerParser.Cuerpo2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#cuerpo3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo3(Pl2compilerParser.Cuerpo3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#llamarfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamarfuncion(Pl2compilerParser.LlamarfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(Pl2compilerParser.CodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#crearfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrearfuncion(Pl2compilerParser.CrearfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#devolver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevolver(Pl2compilerParser.DevolverContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(Pl2compilerParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#cabecerafuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecerafuncion(Pl2compilerParser.CabecerafuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Pl2compilerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#expresionlogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionlogica(Pl2compilerParser.ExpresionlogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#nombrefuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombrefuncion(Pl2compilerParser.NombrefuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#nombrevariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombrevariable(Pl2compilerParser.NombrevariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#nombrepaquete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombrepaquete(Pl2compilerParser.NombrepaqueteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#operadorasignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorasignacion(Pl2compilerParser.OperadorasignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(Pl2compilerParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(Pl2compilerParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#operadoraritmeticoproducto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadoraritmeticoproducto(Pl2compilerParser.OperadoraritmeticoproductoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#operadoraritmeticodivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadoraritmeticodivision(Pl2compilerParser.OperadoraritmeticodivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#operadoraritmeticosuma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadoraritmeticosuma(Pl2compilerParser.OperadoraritmeticosumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#operadoraritmeticoresta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadoraritmeticoresta(Pl2compilerParser.OperadoraritmeticorestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#operadoraritmeticosuma1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadoraritmeticosuma1(Pl2compilerParser.Operadoraritmeticosuma1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#operadoraritmeticoresta1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadoraritmeticoresta1(Pl2compilerParser.Operadoraritmeticoresta1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#operadorlogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorlogico(Pl2compilerParser.OperadorlogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#operadorcondicionalpuertalogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorcondicionalpuertalogica(Pl2compilerParser.OperadorcondicionalpuertalogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(Pl2compilerParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#separadoroperaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparadoroperaciones(Pl2compilerParser.SeparadoroperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#separadoroperadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparadoroperadores(Pl2compilerParser.SeparadoroperadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#separadordospuntos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparadordospuntos(Pl2compilerParser.SeparadordospuntosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#operadoraperturaparentesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadoraperturaparentesis(Pl2compilerParser.OperadoraperturaparentesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#operadorcierreparentesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorcierreparentesis(Pl2compilerParser.OperadorcierreparentesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#tipovariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipovariable(Pl2compilerParser.TipovariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#comentarios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentarios(Pl2compilerParser.ComentariosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(Pl2compilerParser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#flotante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlotante(Pl2compilerParser.FlotanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#numeros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeros(Pl2compilerParser.NumerosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclavebooleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclavebooleano(Pl2compilerParser.PalabraclavebooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclavebuclefor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclavebuclefor(Pl2compilerParser.PalabraclavebucleforContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclaveendbuclefor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclaveendbuclefor(Pl2compilerParser.PalabraclaveendbucleforContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclaveinciovalorfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclaveinciovalorfor(Pl2compilerParser.PalabraclaveinciovalorforContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclavesaltoelementofor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclavesaltoelementofor(Pl2compilerParser.PalabraclavesaltoelementoforContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclavefinvalorfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclavefinvalorfor(Pl2compilerParser.PalabraclavefinvalorforContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclavehacerfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclavehacerfor(Pl2compilerParser.PalabraclavehacerforContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclavebuclewhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclavebuclewhile(Pl2compilerParser.PalabraclavebuclewhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabrareservadaaperturaswitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabrareservadaaperturaswitch(Pl2compilerParser.PalabrareservadaaperturaswitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabrareservadacierrewitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabrareservadacierrewitch(Pl2compilerParser.PalabrareservadacierrewitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabrareservadacase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabrareservadacase(Pl2compilerParser.PalabrareservadacaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabrareservadabreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabrareservadabreak(Pl2compilerParser.PalabrareservadabreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabrareservadadefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabrareservadadefault(Pl2compilerParser.PalabrareservadadefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclavecondiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclavecondiciones(Pl2compilerParser.PalabraclavecondicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclavethen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclavethen(Pl2compilerParser.PalabraclavethenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclaveendif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclaveendif(Pl2compilerParser.PalabraclaveendifContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclaveincluirlibreria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclaveincluirlibreria(Pl2compilerParser.PalabraclaveincluirlibreriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclavecreacionfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclavecreacionfuncion(Pl2compilerParser.PalabraclavecreacionfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclavefuncionmain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclavefuncionmain(Pl2compilerParser.PalabraclavefuncionmainContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclavefunciondevolver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclavefunciondevolver(Pl2compilerParser.PalabraclavefunciondevolverContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclaveinicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclaveinicio(Pl2compilerParser.PalabraclaveinicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link Pl2compilerParser#palabraclavefin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabraclavefin(Pl2compilerParser.PalabraclavefinContext ctx);
}