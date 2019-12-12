import java.util.ArrayList;
import java.lang.Math;

/*
  VISITORS CREADOS PARA LOS PUNTOS:
  prog
  asignacion
  crearfuncion
  condicion
  operacionswitch
  cabeceraswitch
  cuerposwtich
  condicionales
  funcionwhile
  funcionfor
  cuerpo
  cuerpo2
  cuerpo3
  llamarfuncion
  codigo
  crearfuncion
  devolver
  cabecerafuncion
  expr
  expresionlogica
  parametros
  parametro
  palabraclavebooleano
  VISITORS EXTRA:
  cadena
  retorno
  
  no se si hay que crear el de libreria para que sume como operacion basica y para las lineas efectivas
  IMPORTANTE: falta contar la cabecera del for tanto para los puntos como para operaciones, etc
  IMPORTANTE: hay que cambiar la forma de contar las llamadas como lineas efectivas (no se pueden contar si esta en una asignacion)
*/


public class VisitorBasico extends Pl2compilerParserBaseVisitor
{
    //En principio los visitors de reglas que no suman punto ni hacen nada se pueden dejar sin hacer (si no funciona asi habria que crearlos retornando null o algo asi)
    private Funcion visitedFunction;                                                                //Si se devuelve un Long, hay que devolver 0 en todo caso, null da error
    private File file = File.getInstance(); //Contains the symbol table
    private long numFunctionPolongs;
    //private String nombreParametro;

    public VisitorBasico()
    {
        this.numFunctionPolongs = 0;
        //this.nombreParametro = "";
    }

    @Override
    public Long visitProg(Pl2compilerParser.ProgContext ctx)
    {
      ArrayList<Pl2compilerParser.CrearfuncionContext> listaCrearFuncion = new ArrayList<Pl2compilerParser.CrearfuncionContext>(ctx.crearfuncion());
      if(listaCrearFuncion.size() != 0)
      {
        for(long i = 0; i < listaCrearFuncion.size(); i++)
        {
          visit(listaCrearFuncion.get(i));
        }
      }
      //System.out.prlongln("HOLA");
      return 1; //no seria 0 (realmente da igual)?
    }

    @Override
    public Long visitCrearfuncion(Pl2compilerParser.CrearfuncionContext ctx)
    {
        visitedFunction = new Funcion();
        long numFunctionPolongs = 0;
        numFunctionPolongs = (Long) visit(ctx.cabecerafuncion());
        if (ctx.cuerpo() != null)
        {
          numFunctionPolongs += (Long) visit(ctx.cuerpo());
        }
        //System.out.prlongln("Hola nueva funcion");
        System.out.prlongln("PUNTOS FUNCION: "+ numFunctionPolongs);

        visitedFunction.setFunctionPolongs(numFunctionPolongs);
        file.addFunction(visitedFunction);
        return numFunctionPolongs;
    }

    @Override
    public Long visitCabecerafuncion(Pl2compilerParser.CabecerafuncionContext ctx)
    {
        //long numFunctionPolongs = 0;
        //long numParameters = 0;
        String nombre = ctx.palabraclavecreacionfuncion().FUNCTION().getText() + " ";
        if(ctx.nombrefuncion() != null)
        {
          nombre += ctx.nombrefuncion().ID().getText() + "(";
        }
        else if(ctx.palabraclavefuncionmain() != null)
        {
          nombre += ctx.palabraclavefuncionmain().MAIN().getText() + "(";
        }
        visitedFunction.concatenateName(nombre);

        Long puntosCabecera = 0;
        if(ctx.parametros() != null)
        {
          ArrayList<Pl2compilerParser.ParametroContext> listaParametros = new ArrayList<Pl2compilerParser.ParametroContext>(ctx.parametros().parametro());
          visitedFunction.addParameter(listaParametros.size());
          visitedFunction.addDeclaration(listaParametros.size()); //los parametros de la funcion son declaraciones
          ArrayList<String> listaNombreVariables = new ArrayList<String>();
          for(long i=0; i < listaParametros.size();i++)
          {
            if(listaParametros.get(i).expr().nombrevariable() != null)
            {
              listaNombreVariables.add(listaParametros.get(i).expr().nombrevariable().get(0).ID().getText());
            }
          }
          if(listaNombreVariables.size() != 0)
          {
            for(long j=0; j < listaNombreVariables.size(); j++)
            {
              if(j != 0)
              {
                visitedFunction.concatenateName(",");
              }
              visitedFunction.concatenateName(listaNombreVariables.get(j));
            }
            puntosCabecera += listaParametros.size() * 2; //suma 2 puntos por parametro recibido
          }
          //ArrayList<Pl2compilerParser.NombrevariableContext> listaNombreVariables = new ArrayList<Pl2compilerParser.NombrevariableContext>(ctx.parametros().parametro().expr().nombrevariable());
          //numParameters += (Long) ctx.visitParametros();
          //puntosCabecera += (Long) visit(ctx.parametros());
          //visitedFunction.concatenateName(listaNombreVariables.get(i).ID().getText());
          //ArrayList<Pl2compilerParser.ParametroContext> listaParametros = new ArrayList<Pl2compilerParser.ParametroContext>(ctx.parametros().parametro());
          //System.out.prlongln(nombre + " ");
        }
        visitedFunction.concatenateName("):");
        if(ctx.retorno() != null)
        {
          visit(ctx.retorno());
        }

        //numParameters += ctx.parametros();
        //falta añadir nombre funcion (hijo 1)
        /*for (long i=0; i<ctx.getChildCount(); i++)
        {
            numFunctionPolongs += (long) visit(ctx.getChild(i));
        }*/
        //cabecerafuncion:  palabraclavecreacionfuncion (nombrefuncion|palabraclavefuncionmain) operadoraperturaparentesis parametros? operadorcierreparentesis separadordospuntos retorno;
        //System.out.prlongln("puntos cabecera: " + puntosCabecera);
        //return visitedFunction.getFunctionPolongs();
        return puntosCabecera;
    }

    @Override
    public Long visitParametros(Pl2compilerParser.ParametrosContext ctx)
    {
        /*long numHijos = ctx.getChildCount();
        long numFunctionPolongs = 0;
        for (long i=0; i<numHijos; i++)
        {
            numFunctionPolongs += (long) visit(ctx.getChild(i));
        }
        return numFunctionPolongs;*/
        ArrayList<Pl2compilerParser.ParametroContext> listaParametros = new ArrayList<Pl2compilerParser.ParametroContext>(ctx.parametro());
        //visitedFunction.addParameter(listaParametros.size());
        //System.out.prlongln("Nº Parámetros: " + listaParametros.size());
        //visitedFunction.addParameter(listaParametros.size() * 2); //esto creo que sobra (esta en la linea de arriba)!!
        Long puntosParametros = 0;
        for(long i = 0; i < listaParametros.size(); i++)
        {
          puntosParametros += (Long) visit(listaParametros.get(i));
        }
        //System.out.prlongln("PUNTOS PARAMETROS: " + listaParametros.size() * 2);
        //return listaParametros.size() * 2; //los puntos por parametro los retorna en cabecerafuncion (+2) y en llamarfuncion (+1) segun lo que corresponda
        //System.out.prlongln("PUNTOS PARAMETROS: " + puntosParametros);
        return puntosParametros;
    }

    @Override public Long visitExpr(Pl2compilerParser.ExprContext ctx)
    {
      /*ArrayList<Pl2compilerParser.NombrevariableContext> listaNombreVariables = new ArrayList<Pl2compilerParser.NombrevariableContext>(ctx.nombrevariable());
      if(listaNombreVariables.size() != 0)
      {
        for(long i = 0; i < listaNombreVariables.size(); i++)
        {
          if(ctx.nombrevariable() != null)
          {
            if(listaNombreVariables.get(i).ID() != null)
            {
              //visitedFunction.concatenateName(listaNombreVariables.get(i).ID().getText());
            }
            else if(listaNombreVariables.get(i).ARRAY() != null)
            {
              //visitedFunction.concatenateName(listaNombreVariables.get(i).ARRAY().getText());
            }
            else if(listaNombreVariables.get(i).CASE() != null)
            {
              //visitedFunction.concatenateName(listaNombreVariables.get(i).CASE().getText());
            }
          }
        }
      }*/
      long puntosExpr = 0;
      if ((ctx.operadoraritmeticosuma() != null) && (ctx.expr(0) != null) && (ctx.expr(1) != null))
      {
        puntosExpr += (Long) (visit(ctx.expr(0))) + 1 + (Long) (visit(ctx.expr(1))); //puntosExpr + 1 del operador + puntos Expr
        visitedFunction.addSimpleOperator(1);
      } 
      else if (ctx.operadoraritmeticoresta() != null) 
      {
        puntosExpr += (Long) (visit(ctx.expr(0))) + 1 + (Long) (visit(ctx.expr(1)));
        visitedFunction.addSimpleOperator(1);
      }
      else if (ctx.operadoraritmeticoproducto() != null)
      {
        puntosExpr += (Long) (visit(ctx.expr(0))) + 1 + (Long) (visit(ctx.expr(1)));
        visitedFunction.addSimpleOperator(1);
      }
      else if (ctx.operadoraritmeticodivision() != null) 
      {
        puntosExpr += (Long) (visit(ctx.expr(0))) + 1 + (Long) (visit(ctx.expr(1)));
        visitedFunction.addSimpleOperator(1);
      }
      else if (ctx.llamarfuncion() != null) puntosExpr += (Long) visit(ctx.llamarfuncion());
      else if((ctx.operadoraperturaparentesis() != null) && (ctx.expr(0) != null)) puntosExpr += (Long) visit(ctx.expr(0));

      //System.out.prlongln(ctx.getText());
      //System.out.prlongln("puntos expr: " + puntosExpr);
      //falta este caso: operadoraperturaparentesis (nombrevariable|numeros) (separadoroperadores (nombrevariable|numeros))* operadorcierreparentesis, que no se si hace falta (creo que no)
      return puntosExpr;
    }

    @Override
    public Long visitCadena(Pl2compilerParser.CadenaContext ctx) //hecho para  que funciona la suma en visitExpr
    {
      return 0;
    }

    @Override
    public Long visitParametro(Pl2compilerParser.ParametroContext ctx)
    {
      Long puntosParametro = (Long) visit(ctx.expr());
      //System.out.prlongln("puntos parametro: " + puntosParametro);
      return puntosParametro;
    }


    /*@Override
    public String visitParametro()
    {
    }*/

    @Override
    public Long visitRetorno(Pl2compilerParser.RetornoContext ctx)
    {
      if(ctx.tipovariable().STRING() != null)
      {
        visitedFunction.concatenateName(ctx.tipovariable().STRING().getText());
      }
      else if(ctx.tipovariable().NUMERO() != null)
      {
        visitedFunction.concatenateName(ctx.tipovariable().NUMERO().getText());
      }
      else if(ctx.tipovariable().VOID() != null)
      {
        visitedFunction.concatenateName(ctx.tipovariable().VOID().getText());
      }
      return 0;
     }

     /*@Override
     public Long visitTipovariable(Pl2compilerParser.TipovariableContext ctx)
     {
       return 0;
     }*/

     //---------------------------------------------------------------------------------------------------------------------------------

     //"cuerpo" se divide en palabraclaveinicio, codigo y palabraclavefin. Hay tres cuerpos en el Parser ¿Cuál usamos? En principio uso "codigo"
    @Override
    public Long visitCuerpo(Pl2compilerParser.CuerpoContext ctx)
    {
      /*visitedFunction = new Funcion(); //no hay que ponerlo aqui creo
      long numFunctionPolongs = 0;
      numFunctionPolongs = (Long) visit(ctx.codigo()); //Da error aquí al ejecutar
      visitedFunction.setFunctionPolongs(numFunctionPolongs);
      file.addFunction(visitedFunction);
      return numFunctionPolongs;*/

      long numFunctionPolongs = 0;
      ArrayList<Pl2compilerParser.CodigoContext> listaCodigo = new ArrayList<Pl2compilerParser.CodigoContext>(ctx.codigo()); //puede haber mas de 1 codigo
      if(listaCodigo.size() != 0)
      {
        for (long i=0; i<listaCodigo.size(); i++)
        {
            numFunctionPolongs += (Long) visit(listaCodigo.get(i));
        }
      }
      //System.out.prlongln("PUNTOS CUERPO: " + numFunctionPolongs);

      return numFunctionPolongs;
    }

    @Override
    public Long visitCuerpo2(Pl2compilerParser.Cuerpo2Context ctx)
    {
      Long puntosCuerpo = 0;
      ArrayList<Pl2compilerParser.LlamarfuncionContext> listaLlamada = new ArrayList<Pl2compilerParser.LlamarfuncionContext>(ctx.llamarfuncion()); //puede haber mas de 1 codigo
      ArrayList<Pl2compilerParser.AsignacionContext> listaAsignacion = new ArrayList<Pl2compilerParser.AsignacionContext>(ctx.asignacion()); //puede haber mas de 1 codigo
      if (ctx.llamarfuncion() != null)
      {
        for (long i=0; i<listaLlamada.size(); i++)
        {
          puntosCuerpo += (Long) visit(ctx.llamarfuncion(i));
        }
      }
      else if (ctx.asignacion() != null)
      {
        for (long i=0; i<listaAsignacion.size(); i++)
        {
          puntosCuerpo += (Long) visit(ctx.asignacion(i));
        }
      }
      //System.out.prlongln("puntos cuerpo3: " + puntosCuerpo);
      return puntosCuerpo;
    }

    @Override
    public Long visitCuerpo3(Pl2compilerParser.Cuerpo3Context ctx)
    {
      Long puntosCuerpo = 0;
      ArrayList<Pl2compilerParser.LlamarfuncionContext> listaLlamada = new ArrayList<Pl2compilerParser.LlamarfuncionContext>(ctx.llamarfuncion()); //puede haber mas de 1 codigo
      ArrayList<Pl2compilerParser.AsignacionContext> listaAsignacion = new ArrayList<Pl2compilerParser.AsignacionContext>(ctx.asignacion()); //puede haber mas de 1 codigo
      if (ctx.llamarfuncion() != null)
      {
        for (long i=0; i<listaLlamada.size(); i++)
        {
          puntosCuerpo += (Long) visit(ctx.llamarfuncion(i));
        }
      }
      else if (ctx.asignacion() != null)
      {
        for (long i=0; i<listaAsignacion.size(); i++)
        {
          puntosCuerpo += (Long) visit(ctx.asignacion(i));
        }
      }
      //System.out.prlongln("puntos cuerpo4: " + puntosCuerpo);
      return puntosCuerpo;
    }


    //"codigo" se divide en (funcionwhile|funcionfor|operacionswitch|asignacion|llamarfuncion|devolver|cuerpo2)+
    //Hay que visitar a los hijos por lo que tienen que estar los que nos longeresen en el Visitor (en principio, si da error por cosas del Visitor pues todos)
    @Override
    public Long visitCodigo(Pl2compilerParser.CodigoContext ctx)
    {
      /*ArrayList<Pl2compilerParser.CodigoContext> listaCodigo = new ArrayList<Pl2compilerParser.CodigoContext>(ctx.codigo());
      if(listaCodigo.size() != 0)
      {
        for(long i = 0; i < listaCodigo.size(); i++)
        {
          visit(listaCodigo.get(i));
        }
      }
      return listaCodigo.size();//En realidad no sé qué retornar  */

      long numHijos = ctx.getChildCount();
      Long numFunctionPolongs = 0;
      for (long i=0; i<numHijos; i++) //en este caso se puede hacer asi porque va a visitar todos los hijos
      {
        numFunctionPolongs += (Long) visit(ctx.getChild(i));
      }
      //System.out.prlongln("puntos codigo: " + numFunctionPolongs);
      return numFunctionPolongs;
     }

    //While
    @Override
    public Long visitFuncionwhile(Pl2compilerParser.FuncionwhileContext ctx)
    {
      /*long puntosWhile = 0;
      if (ctx.expr() != null) puntosWhile += (long) Math.pow((Long)visit(ctx.expr()), 2);
      else if (ctx.expresionlogica() != null) puntosWhile += (long) Math.pow((Long)visit(ctx.expresionlogica()), 2);
      if(ctx.cuerpo() != null) puntosWhile += (Long)visit(ctx.cuerpo());
      else if(ctx.cuerpo3() != null) puntosWhile += (Long)visit(ctx.cuerpo3());
      puntosWhile = (long) Math.pow(puntosWhile, 2); //si hacemos aqui el ^2 no habria que quitarlo de arriba??
      return puntosWhile;*/
      long puntosWhile = 0;
      visitedFunction.addEfectiveLine(1); //linea de cabecera (condicion)
      if (ctx.expr() != null) puntosWhile += (Long)visit(ctx.expr());
      else if (ctx.expresionlogica() != null) puntosWhile += (Long)visit(ctx.expresionlogica());

      if(ctx.cuerpo() != null) puntosWhile += (long) Math.pow((Long)visit(ctx.cuerpo()) ,2);
      else if(ctx.cuerpo2() != null) puntosWhile += (long) Math.pow((Long)visit(ctx.cuerpo2()), 2);
      else if(ctx.cuerpo3() != null) puntosWhile += (long) Math.pow((Long)visit(ctx.cuerpo3()), 2);
      //System.out.prlongln("puntos while: " + puntosWhile);
      return puntosWhile;
    }

    //For
    @Override public Long visitFuncionfor(Pl2compilerParser.FuncionforContext ctx)  //hay que tener en cuenta los incremetos de i para sumarlos a operaciones basicas??
    {
      long puntosFor = 0;
      visitedFunction.addEfectiveLine(1); //cabecera for

      if(ctx.cuerpo() != null) puntosFor += (Long) visit(ctx.cuerpo());
      else if(ctx.cuerpo2() != null) puntosFor += (Long) visit(ctx.cuerpo2());
      else if(ctx.cuerpo3() != null) puntosFor += (Long) visit(ctx.cuerpo3());

      puntosFor = (long) Math.pow(puntosFor, 2);

      return puntosFor;
    }


    //Switch
    //tiene Operacionswitch, que se compone de "cabeceraswitch cuerposwitch"  No sé si solo con el cuerposwitch valdría
    /*@Override
    public Long visitOperacionswitch(Pl2compilerParser.OperacionswitchContext ctx)
    {
      long puntosSwitch = 0;
      puntosSwitch += (Long) visit(ctx.cabeceraswitch());
      puntosSwitch += (Long) visit(ctx.cuerposwitch()); //el ^2 iria aqui?????
      return puntosSwitch;
    }
    @Override
    public Long visitCabeceraswitch(Pl2compilerParser.CabeceraswitchContext ctx)
    {
      return (Long) visit(ctx.expr());
    }
    //Habría que tener en cuenta también "cuerpo3" o cambiarlo en el Parser (creo que la segunda opción es más fácil)
    @Override
    public Long visitCuerposwitch(Pl2compilerParser.CuerposwitchContext ctx)
    {
      //long puntosSwitch = 0;
      //puntosSwitch += (long) Math.pow((Long)visit(ctx.expr()), 2);
      //esto igual no sirve a la hora de hacer el grafo
      ArrayList<Pl2compilerParser.ExprContext> listaExpr = new ArrayList<Pl2compilerParser.ExprContext>(ctx.expr());
      long puntosSwitch = 0;
      if (listaExpr.size() != 0)
      {
        for (long i=0; i<listaExpr.size(); i++)
        {
          puntosSwitch += Math.pow((Long)visit(listaExpr.get(i)), 2);
        }
      }
      if(ctx.cuerpo() != null){
        ArrayList<Pl2compilerParser.CuerpoContext> codigo_bloques = new ArrayList<Pl2compilerParser.CuerpoContext>(ctx.cuerpo());
        for (Pl2compilerParser.CuerpoContext i: codigo_bloques){
          puntosSwitch += Math.pow((Long)visit(i), 2);
        }
      }
      return puntosSwitch;
    }*/
    //((tipovariable? nombrevariable (operadorasignacion expr)?) | (tipovariable nombrevariable (separadoroperadores nombrevariable)*)) separadoroperaciones?;
    @Override
    public Long visitAsignacion(Pl2compilerParser.AsignacionContext ctx)
    {
      /*long puntosAsignacion = 0;
      //puntosAsignacion = (Long)visit(ctx.expr()) + (Long)visit(ctx.); //Hay que mirar mejor el parser; no entiendo bien la asignacion en el parser
      return puntosAsignacion;*/

      /*asignacion: (tipo? nombre (:= expr)?) | (tipo nombre (, nombre)*) ;?
      long num := 3;
      long num;
      long num, num2;*/
      visitedFunction.addEfectiveLine(1);
      long puntosAsignacion = 0;
      ArrayList<Pl2compilerParser.NombrevariableContext> listaVariables = new ArrayList<Pl2compilerParser.NombrevariableContext>(ctx.nombrevariable());
      if (ctx.tipovariable() != null) //es una declaracion
      {
        visitedFunction.addDeclaration(listaVariables.size()); //suma 1 por declaracion
        puntosAsignacion += listaVariables.size(); //suma 1 por declaracion
      }
      if (ctx.operadorasignacion() != null) //es una asignacion
        {
          puntosAsignacion++; //suma 1 (operacion simple)
          if (ctx.expr() != null) //hay que mirar lo que tiene dentro
          {
            puntosAsignacion += (Long) visit(ctx.expr());
            //Pl2compilerParser.ExprContext contexto = ctx.expr();
            
            /*if (ctx.expr().llamarfuncion() != null) //si se asigna una llamadafuncion no se cuenta la linea efectiva (Se cuenta en la llamada)
            {
              ArrayList<Pl2compilerParser.LlamarfuncionContext> listaLlamadas = new ArrayList<Pl2compilerParser.LlamarfuncionContext>(ctx.expr().llamarfuncion());
              //pzArrayList<Pl2compilerParser.LlamarfuncionContext> listaLlamadas = new ArrayList<Pl2compilerParser.LlamarfuncionContext>(ctx.expr().llamarfuncion());
              //ArrayList<Pl2compilerParser.LlamarfuncionContext> listaLlamadas = new ArrayList<Pl2compilerParser.LlamarfuncionContext>(ctx.expr().llamarfuncion());
              visitedFunction.removeEfectiveLine(listaLlamadas.size());
            }*/
            if (isLlamada(ctx.expr())) //si la asignacion acaba en llamada no se suma linea efectiva porque ya se suma en la propia llamada
            {
              visitedFunction.removeEfectiveLine(1);
            }
            //visitedFunction.removeEfectiveLine(getNumLlamadas(ctx.expr())); //si la asignacion es una llamada a funcion se eliminan los puntos de cada llamada
          }
        }

      //System.out.prlongln("Puntos asignacion: " + puntosAsignacion);
      return puntosAsignacion; //Cada variable declarada es un punto, asumimos que sus hijos están
    }

    public Boolean isLlamada(Pl2compilerParser.ExprContext contexto) //comprueba si el ultimo elemento de la expresion es una llamada (true)
    {
      //tengo que recorrer todas y retorna true si la ULTIMA es llamada (la que afecta el ;)
      //long numllamadas = 0;
      Boolean isllamada = false;
      ArrayList<Pl2compilerParser.ExprContext> exprs = new ArrayList<Pl2compilerParser.ExprContext>();
      exprs.add(contexto);
      while (exprs.size() != 0)
      {
        contexto = exprs.get(0);
        exprs.remove(0);
        if (contexto.llamarfuncion() != null) //cambiar por llamadafuncion
        {
          //numllamadas++;
          isllamada = true;
        }
        else
        {
          isllamada = false;
        }
        ArrayList<Pl2compilerParser.ExprContext> exprsHijas = new ArrayList<Pl2compilerParser.ExprContext>(contexto.expr());
        for (long i=0; i<exprsHijas.size(); i++)
        {
          exprs.add(exprsHijas.get(i));
        }
        //contexto = exprs.get(0).expr();
        /*contexto = exprs.get(0);
        exprs.remove(0);*/
      }
      //visitedFunction.removeEfectiveLine(numllamadas);
      //return numllamadas;
      return isllamada;
    }

    //llamarfuncion: ((nombrefuncion operadoraperturaparentesis parametros? operadorcierreparentesis separadoroperaciones?) | funcionfor | funcionwhile | condicionales| operacionswitch);
    @Override
    public Long visitLlamarfuncion(Pl2compilerParser.LlamarfuncionContext ctx)
    {
      /*
      Usará visitParametros, pero hay un problema. En el return de visitParametros, según el enunciado sería:
      Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado. Tal y como está en visitParametros el return no funcionaria
      */
      //return 2;
      Long puntosLlamada= 0;
      if (ctx.llamadafuncion() != null)
      {
        puntosLlamada += (Long) visit(ctx.llamadafuncion());
      }
      else if(ctx.funcionfor() != null)
      {
        puntosLlamada = (Long) visit(ctx.funcionfor());
      }
      else if(ctx.funcionwhile() != null)
      {
        puntosLlamada = (Long) visit(ctx.funcionwhile());
      }
      else if(ctx.condicionales() != null)
      {
        puntosLlamada = (Long) visit(ctx.condicionales());
      }
      /*else if(ctx.operacionswitch() != null)
      {
        puntosLlamada = (Long) visit(ctx.operacionswitch());
      }*/
      //System.out.prlongln("Puntos llamar funcion: " + puntosLlamada);
      return puntosLlamada; //Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
    }

    @Override 
    public Long visitLlamadafuncion(Pl2compilerParser.LlamadafuncionContext ctx) 
    { 
      if (ctx.separadoroperaciones() != null) //solo cuenta como linea efectiva si se acaba la linea (si no eesta dentro de otra)
      {
        visitedFunction.addEfectiveLine(1); 
      }
      Long puntosLlamada= 0;
      visitedFunction.addFunctionCall(1); //suma 1 llamada de funcion
      //visitedFunction.addSimpleOperator(1);
      puntosLlamada = 2; //suma 2
      if (ctx.parametros() != null) //cada parametros suma 1
      {
        ArrayList<Pl2compilerParser.ParametroContext> listaParametros = new ArrayList<Pl2compilerParser.ParametroContext>(ctx.parametros().parametro());
        puntosLlamada += listaParametros.size(); //suma 1 por parametro
        puntosLlamada += (Long) visit(ctx.parametros());
      }
      return puntosLlamada;
    }
	

    @Override public Long visitCondicionalif(Pl2compilerParser.CondicionalifContext ctx)
    {
      Long puntosCondicional = 0;
      ArrayList<Pl2compilerParser.OperadorcondicionalpuertalogicaContext> listaOperadores = new ArrayList<Pl2compilerParser.OperadorcondicionalpuertalogicaContext>(ctx.operadorcondicionalpuertalogica());
      ArrayList<Pl2compilerParser.CondicionContext> listaCondiciones = new ArrayList<Pl2compilerParser.CondicionContext>(ctx.condicion());
      puntosCondicional += listaOperadores.size(); //suma 1 por operacion simple
      visitedFunction.addEfectiveLine(1); //cabecera if 
      if(listaCondiciones.size() != 0)
      {
        for (long i=0; i<listaCondiciones.size(); i++)
        {
          puntosCondicional += (Long) visit(listaCondiciones.get(i));
        }
      }
      if(ctx.cuerpo() != null)
      {
        puntosCondicional += (long) Math.pow((Long) visit(ctx.cuerpo()), 2);
      }
      else if(ctx.cuerpo2() != null)
      {
        puntosCondicional += (long) Math.pow((Long) visit(ctx.cuerpo2()), 2);
      }
      else if(ctx.cuerpo3() != null)
      {
        puntosCondicional += (long) Math.pow((Long) visit(ctx.cuerpo3()), 2);
      }
      //puntosCondicionales = (long) Math.pow(puntosCondicionales, 2);
      //System.out.prlongln("puntos condicional: " + puntosCondicional);
      return puntosCondicional;
    }

    @Override public Long visitCondicionalelse(Pl2compilerParser.CondicionalelseContext ctx)
    {
      Long puntosCondicional = 0;
      if(ctx.cuerpo() != null)
      {
        puntosCondicional += (long) Math.pow((Long) visit(ctx.cuerpo()), 2);
      }
      else if(ctx.cuerpo2() != null)
      {
        puntosCondicional += (long) Math.pow((Long) visit(ctx.cuerpo2()), 2);
      }
      else if(ctx.cuerpo3() != null)
      {
        puntosCondicional += (long) Math.pow((Long) visit(ctx.cuerpo3()), 2);
      }
      //puntosCondicionales = (long) Math.pow(puntosCondicionales, 2);
      //System.out.prlongln("puntos condicional: " + puntosCondicional);
      return puntosCondicional;
    }

    /*@Override public Long visitCondicional(Pl2compilerParser.CondicionalContext ctx)
    {
      Long puntosCondicional = 0;
      ArrayList<Pl2compilerParser.OperadorcondicionalpuertalogicaContext> listaOperadores = new ArrayList<Pl2compilerParser.OperadorcondicionalpuertalogicaContext>(ctx.operadorcondicionalpuertalogica());
      ArrayList<Pl2compilerParser.CondicionContext> listaCondiciones = new ArrayList<Pl2compilerParser.CondicionContext>(ctx.condicion());
      puntosCondicional += listaOperadores.size(); //suma 1 por operacion simple
      if(listaCondiciones.size() != 0)
      {
        for (long i=0; i<listaCondiciones.size(); i++)
        {
          puntosCondicional += (Long) visit(listaCondiciones.get(i));
        }
      }
      if(ctx.cuerpo() != null)
      {
        puntosCondicional += (long) Math.pow((Long) visit(ctx.cuerpo()), 2);
      }
      else if(ctx.cuerpo3() != null)
      {
        puntosCondicional += (long) Math.pow((Long) visit(ctx.cuerpo3()), 2);
      }
      else if(ctx.cuerpo4() != null)
      {
        puntosCondicional += (long) Math.pow((Long) visit(ctx.cuerpo4()), 2);
      }
      //puntosCondicionales = (long) Math.pow(puntosCondicionales, 2);
      //System.out.prlongln("puntos condicional: " + puntosCondicional);
      return puntosCondicional;
    }*/

    @Override public Long visitCondicionales(Pl2compilerParser.CondicionalesContext ctx)
    {
      Long puntosCondicionales = 0;
      /*ArrayList<Pl2compilerParser.CondicionalContext> listaCondiciones = new ArrayList<Pl2compilerParser.CondicionalContext>(ctx.condicional());
      for (long i=0; i<listaCondiciones.size(); i++) //no hace falta comprobar si la lista esta vacia porque es condicion+
      {
        puntosCondicionales += (Long) visit(listaCondiciones.get(i));
      }*/
      puntosCondicionales += (Long) visit(ctx.condicionalif());
      if (ctx.condicionalelse() != null)
      {
        puntosCondicionales += (Long) visit(ctx.condicionalelse());
      }
      return puntosCondicionales;
    }

    @Override
    public Long visitCondicion(Pl2compilerParser.CondicionContext ctx)
    {
      Long puntosCondicion = (Long) visit(ctx.expresionlogica());
      return puntosCondicion;
    }


    //(llamarfuncion|expr)?
    @Override
    public Long visitDevolver(Pl2compilerParser.DevolverContext ctx)
    {
      long puntosDevolver = 0;
      visitedFunction.addEfectiveLine(1);

      if(ctx.llamarfuncion() != null) puntosDevolver += (Long)visit(ctx.llamarfuncion());
      else if(ctx.expr() != null) puntosDevolver += (Long)visit(ctx.expr());

      return puntosDevolver;
    }

    //cuerpo2: (palabraclaveinicio codigo* palabraclavefin)+;
    /*@Override
    public Long visitCuerpo2(Pl2compilerParser.Cuerpo2Context ctx)
    {
      long numFunctionPolongs = 0;
      if (ctx.codigo() != null) //puede no tener codigo
      {
        ArrayList<Pl2compilerParser.CodigoContext> listaCodigo = new ArrayList<Pl2compilerParser.CodigoContext>(ctx.codigo()); //puede haber mas de 1 codigo
        if(listaCodigo.size() != 0)
        {
          for (long i=0; i<listaCodigo.size(); i++)
          {
              numFunctionPolongs += (Long) visit(listaCodigo.get(i));
          }
        }
      }
      //System.out.prlongln("PUNTOS CUERPO2: " + numFunctionPolongs);
      return numFunctionPolongs;
    }*/

    @Override
    public Long visitExpresionlogica(Pl2compilerParser.ExpresionlogicaContext ctx)
    {
      Long puntosExprLogica = 0;
      long numHijos = ctx.getChildCount();
      if (numHijos == 1) //si es un booleano simple
      {
        puntosExprLogica += (Long) visit(ctx.palabraclavebooleano(0)); //pongo 0 porque sino no va (no tiene sentido porque ctx.palabraclavebooleano().size = 1)
      }
      else //si es una expresion compleja
      {
        long numOps = (numHijos - 1) / 2; //numero de expresiones - 1
        puntosExprLogica += numOps; //suma 1 por operador (operacion simple)
        visitedFunction.addSimpleOperator(numOps);
        for (long i=0; i<=numHijos; i+=2) //recorre todas las expresiones (en orden) saltando los operadores
        {
          puntosExprLogica += (Long)visit(ctx.getChild(i));
        }
      }
      //System.out.prlongln("puntos expresion logica: " + puntosExprLogica);
      return puntosExprLogica;
    }

    @Override
    public Long visitPalabraclavebooleano(Pl2compilerParser.PalabraclavebooleanoContext ctx)
    {
      long puntosBooleano = 0;
      if (ctx.getText().equals("!true") || ctx.getText().equals("!false"))
      {
        puntosBooleano++;
        visitedFunction.addSimpleOperator(1);
      }
      return puntosBooleano;
    }



//---------------------------------------------------------------------------------------------------------------------------------

//No se por qué dan error todos cuando hago ctx.expr
/*
    @Override
    public Long visitOperadoraritmeticosuma(Pl2compilerParser.OperadoraritmeticosumaContext ctx){
      visitedFunction.addSimpleOperator(1);
      return 1 + ((Long)visit(ctx.expr(0)) + (Long)visit(ctx.expr(1)));
    }
    @Override
    public Long visitOperadoraritmeticoresta(Pl2compilerParser.OperadoraritmeticorestaContext ctx){
      visitedFunction.addSimpleOperator(1);
      return 1 + ((Long)visit(ctx.expr(0)) + (Long)visit(ctx.expr(1)));
    }
    @Override
    public Long visitOperadoraritmeticoproducto(Pl2compilerParser.OperadoraritmeticoproductoContext ctx){
      visitedFunction.addSimpleOperator(1);
      return 1 + ((Long)visit(ctx.expr(0)) + (Long)visit(ctx.expr(1)));
    }
    @Override
    public Long visitOperadoraritmeticodivision(Pl2compilerParser.OperadoraritmeticodivisionContext ctx){
      visitedFunction.addSimpleOperator(1);
      return 1 + ((Long)visit(ctx.expr(0)) + (Long)visit(ctx.expr(1)));
    }
*/

}