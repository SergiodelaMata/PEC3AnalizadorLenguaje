import java.util.ArrayList;
import java.lang.Math;
import java.lang.reflect.Array;

public class VisitorBasico extends Pl2compilerParserBaseVisitor
{
    private Funcion visitedFunction;
    private File file;
    private long numFunctionPoints;

    public VisitorBasico()
    {
        this.numFunctionPoints = 0;
        this.file = File.getInstance(); //Contains the symbol table
        this.visitedFunction = new Funcion();
    }

    @Override
    public Long visitProg(Pl2compilerParser.ProgContext ctx)
    {
      ArrayList<Pl2compilerParser.CrearfuncionContext> listaCrearFuncion = new ArrayList<Pl2compilerParser.CrearfuncionContext>(ctx.crearfuncion());
      if(listaCrearFuncion.size() != 0)
      {
        for(int i = 0; i < listaCrearFuncion.size(); i++)
        {
          visit(listaCrearFuncion.get(i));
        }
      }
      return null;
    }

    @Override
    public Long visitCrearfuncion(Pl2compilerParser.CrearfuncionContext ctx)
    {
        visitedFunction = new Funcion();
        long numFunctionPoints = 0;
        numFunctionPoints = (Long) visit(ctx.cabecerafuncion());
        if (ctx.cuerpo() != null)
        {
          numFunctionPoints += (Long) visit(ctx.cuerpo());
        }
        visitedFunction.setFunctionPoints(numFunctionPoints);
        file.addFunction(visitedFunction);
        return numFunctionPoints;
    }

    @Override
    public Long visitCabecerafuncion(Pl2compilerParser.CabecerafuncionContext ctx)
    {
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

        long puntosCabecera = 0;
        if(ctx.parametros() != null)
        {
          ArrayList<Pl2compilerParser.ParametroContext> listaParametros = new ArrayList<Pl2compilerParser.ParametroContext>(ctx.parametros().parametro());
          visitedFunction.addParameter(listaParametros.size());
          visitedFunction.addDeclaration(listaParametros.size()); //los parametros de la funcion son declaraciones
          ArrayList<String> listaNombreVariables = new ArrayList<String>();
          for(int i=0; i < listaParametros.size();i++)
          {
            if(listaParametros.get(i).expr().nombrevariable() != null)
            {
              listaNombreVariables.add(listaParametros.get(i).expr().nombrevariable().get(0).ID().getText());
            }
          }
          if(listaNombreVariables.size() != 0)
          {
            for(int j=0; j < listaNombreVariables.size(); j++)
            {
              if(j != 0)
              {
                visitedFunction.concatenateName(",");
              }
              visitedFunction.concatenateName(listaNombreVariables.get(j));
            }
            puntosCabecera += listaParametros.size() * 2; //suma 2 puntos por parametro recibido
          }
        }
        visitedFunction.concatenateName("):");
        if(ctx.retorno() != null)
        {
          visit(ctx.retorno());
        }
        return puntosCabecera;
    }

    @Override
    public Long visitParametros(Pl2compilerParser.ParametrosContext ctx)
    {
        ArrayList<Pl2compilerParser.ParametroContext> listaParametros = new ArrayList<Pl2compilerParser.ParametroContext>(ctx.parametro());
        long puntosParametros = 0;
        for(int i = 0; i < listaParametros.size(); i++)
        {
          puntosParametros += (Long) visit(listaParametros.get(i));
        }
        return puntosParametros;
    }

    @Override public Long visitExpr(Pl2compilerParser.ExprContext ctx)
    {
      long puntosExpr = 0;
      if (ctx.llamadafuncion() != null) puntosExpr += (Long) visit(ctx.llamadafuncion());
      else if (ctx.operadoraritmeticosuma() != null)
      {
        ArrayList<Pl2compilerParser.ExprContext> listaExpresiones = new ArrayList<Pl2compilerParser.ExprContext>(ctx.expr());
        if(listaExpresiones.size() == 2)
        {
          puntosExpr += (Long) (visit(listaExpresiones.get(0))) + 1 + (Long) (visit(listaExpresiones.get(1))); //puntosExpr + 1 del operador + puntos Expr
          visitedFunction.addSimpleOperator(1);
        }
        else if(listaExpresiones.size() == 1)
        {
          puntosExpr += 1 + (Long) (visit(listaExpresiones.get(0))); //puntosExpr + 1 del operador + puntos Expr
          visitedFunction.addSimpleOperator(1);
        }
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
      else if((ctx.operadoraperturaparentesis() != null) && (ctx.expr(0) != null)) puntosExpr += (Long) visit(ctx.expr(0));
      return puntosExpr;
    }

    @Override
    public Long visitParametro(Pl2compilerParser.ParametroContext ctx)
    {
      Long puntosParametro = (Long) visit(ctx.expr());
      return puntosParametro;
    }

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
      return null;
     }

    @Override
    public Long visitCuerpo(Pl2compilerParser.CuerpoContext ctx)
    {
      long numFunctionPoints = 0;
      if(ctx.codigo() != null)
      {
        numFunctionPoints += (Long) visit(ctx.codigo());
      }
      return numFunctionPoints;
    }

    @Override
    public Long visitCuerpo2(Pl2compilerParser.Cuerpo2Context ctx)
    {
      long puntosCuerpo = 0;

      ArrayList<Pl2compilerParser.LlamarfuncionContext> listaLlamada = new ArrayList<Pl2compilerParser.LlamarfuncionContext>(ctx.llamarfuncion()); //puede haber mas de 1 codigo
      ArrayList<Pl2compilerParser.AsignacionContext> listaAsignacion = new ArrayList<Pl2compilerParser.AsignacionContext>(ctx.asignacion()); //puede haber mas de 1 codigo
      if (ctx.llamarfuncion() != null)
      {
        for (int i=0; i<listaLlamada.size(); i++)
        {
          puntosCuerpo += (Long) visit(ctx.llamarfuncion(i));
        }
      }
      else if (ctx.asignacion() != null)
      {
        for (int i=0; i<listaAsignacion.size(); i++)
        {
          puntosCuerpo += (Long) visit(ctx.asignacion(i));
        }
      }
      return puntosCuerpo;
    }

    @Override
    public Long visitCuerpo3(Pl2compilerParser.Cuerpo3Context ctx)
    {
      long puntosCuerpo = 0;

      ArrayList<Pl2compilerParser.LlamarfuncionContext> listaLlamada = new ArrayList<Pl2compilerParser.LlamarfuncionContext>(ctx.llamarfuncion()); //puede haber mas de 1 codigo
      ArrayList<Pl2compilerParser.AsignacionContext> listaAsignacion = new ArrayList<Pl2compilerParser.AsignacionContext>(ctx.asignacion()); //puede haber mas de 1 codigo
      if (ctx.llamarfuncion() != null)
      {
        for (int i=0; i<listaLlamada.size(); i++)
        {
          puntosCuerpo += (Long) visit(ctx.llamarfuncion(i));
        }
      }
      else if (ctx.asignacion() != null)
      {
        for (int i=0; i<listaAsignacion.size(); i++)
        {
          puntosCuerpo += (Long) visit(ctx.asignacion(i));
        }
      }
      return puntosCuerpo;
    }

    @Override
    public Long visitCodigo(Pl2compilerParser.CodigoContext ctx)
    {
      long numHijos = ctx.getChildCount();
      long numFunctionPoints = 0;
      for (int i=0; i<numHijos; i++)
      {
        numFunctionPoints += (Long) visit(ctx.getChild(i));
      }
      return numFunctionPoints;
     }

    @Override
    public Long visitFuncionwhile(Pl2compilerParser.FuncionwhileContext ctx)
    {
      long puntosWhile = 0;
      visitedFunction.addEfectiveLine(1); //linea de cabecera (condicion)
      if (ctx.expr() != null) puntosWhile += (Long)visit(ctx.expr());
      else if (ctx.expresionlogica() != null) puntosWhile += (Long)visit(ctx.expresionlogica());
      if(ctx.cuerpo() != null) puntosWhile += (Long)visit(ctx.cuerpo());
      else if(ctx.cuerpo2() != null) puntosWhile += (Long)visit(ctx.cuerpo2());
      else if(ctx.cuerpo3() != null) puntosWhile += (Long)visit(ctx.cuerpo3());
      puntosWhile = (int) Math.pow(puntosWhile, 2);
      return puntosWhile;
    }

    @Override public Long visitFuncionfor(Pl2compilerParser.FuncionforContext ctx)
    {
      long puntosFor = 2; //declaracion y asignacion variable
      visitedFunction.addEfectiveLine(3); //cabecera for + if + asignacion iteraciones
      visitedFunction.addDeclaration(1); //declaracion variable
      visitedFunction.addSimpleOperator(2); //condicion, incremento (iteraciones), 1 asignaciones (:=)
      long puntosCondicion = 1; //1 del operador basico de la condicon
      if(ctx.cuerpo() != null) puntosCondicion += (Long) visit(ctx.cuerpo());
      else if(ctx.cuerpo2() != null) puntosCondicion += (Long) visit(ctx.cuerpo2());
      else if(ctx.cuerpo3() != null) puntosCondicion += (Long) visit(ctx.cuerpo3());
      puntosCondicion = (long) Math.pow(puntosCondicion, 2);
      puntosFor += puntosCondicion;
      puntosFor += 2; //2 por la asignacion de las iteraciones + el operador basico (++)
      return puntosFor;
    }

    @Override
    public Long visitAsignacion(Pl2compilerParser.AsignacionContext ctx)
    {
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
          visitedFunction.addSimpleOperator(1); //:=
          if (ctx.expr() != null) //hay que mirar lo que tiene dentro
          {
            puntosAsignacion += (Long) visit(ctx.expr());
            if (isLlamada(ctx.expr())) //si la asignacion acaba en llamada no se suma linea efectiva porque ya se suma en la propia llamada
            {
              visitedFunction.removeEfectiveLine(1);
            }
          }
        }
      return puntosAsignacion;
    }

    public Boolean isLlamada(Pl2compilerParser.ExprContext contexto) //comprueba si el ultimo elemento de la expresion es una llamada (true)
    {
      Boolean isllamada = false;
      ArrayList<Pl2compilerParser.ExprContext> exprs = new ArrayList<Pl2compilerParser.ExprContext>();
      exprs.add(contexto);
      while (exprs.size() != 0)
      {
        contexto = exprs.get(0);
        exprs.remove(0);
        if (contexto.llamadafuncion() != null)
        {
          isllamada = true;
        }
        else
        {
          isllamada = false;
        }
        ArrayList<Pl2compilerParser.ExprContext> exprsHijas = new ArrayList<Pl2compilerParser.ExprContext>(contexto.expr());
        for (int i=0; i<exprsHijas.size(); i++)
        {
          exprs.add(exprsHijas.get(i));
        }
      }
      return isllamada;
    }

    @Override
    public Long visitLlamarfuncion(Pl2compilerParser.LlamarfuncionContext ctx)
    {
      long puntosLlamada = 0;
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
      return puntosLlamada; 
    }

    @Override
    public Long visitLlamadafuncion(Pl2compilerParser.LlamadafuncionContext ctx)
    {
      if (ctx.separadoroperaciones() != null) //solo cuenta como linea efectiva si se acaba la linea (si no esta dentro de otra)
      {
        visitedFunction.addEfectiveLine(1);
      }
      long puntosLlamada = 0;

      visitedFunction.addFunctionCall(1); //suma 1 llamada de funcion
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
      long puntosCondicional = 0;

      ArrayList<Pl2compilerParser.OperadorcondicionalpuertalogicaContext> listaOperadores = new ArrayList<Pl2compilerParser.OperadorcondicionalpuertalogicaContext>(ctx.operadorcondicionalpuertalogica());
      ArrayList<Pl2compilerParser.CondicionContext> listaCondiciones = new ArrayList<Pl2compilerParser.CondicionContext>(ctx.condicion());
      puntosCondicional += listaOperadores.size(); //suma 1 por operacion simple
      visitedFunction.addEfectiveLine(1); //cabecera if
      if(listaCondiciones.size() != 0)
      {
        for (int i=0; i<listaCondiciones.size(); i++)
        {
          puntosCondicional += (Long) visit(listaCondiciones.get(i));
        }
      }
      if(ctx.cuerpo() != null)
      {
        puntosCondicional += (Long) visit(ctx.cuerpo());
      }
      else if(ctx.cuerpo2() != null)
      {
        puntosCondicional += (Long) visit(ctx.cuerpo2());
      }
      else if(ctx.cuerpo3() != null)
      {
        puntosCondicional += (Long) visit(ctx.cuerpo3());
      }
      puntosCondicional = (long) Math.pow(puntosCondicional, 2);
      return puntosCondicional;
    }

    @Override public Long visitCondicionalelse(Pl2compilerParser.CondicionalelseContext ctx)
    {
      long puntosCondicional = 0;

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
      return puntosCondicional;
    }

    @Override public Long visitCondicionales(Pl2compilerParser.CondicionalesContext ctx)
    {
      long puntosCondicionales = 0;
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

    @Override
    public Long visitDevolver(Pl2compilerParser.DevolverContext ctx)
    {
      long puntosDevolver = 0;
      visitedFunction.addEfectiveLine(1);

      if(ctx.llamadafuncion() != null) puntosDevolver += (Long)visit(ctx.llamadafuncion());
      else if(ctx.expr() != null) puntosDevolver += (Long)visit(ctx.expr());

      return puntosDevolver;
    }

    @Override
    public Long visitExpresionlogica(Pl2compilerParser.ExpresionlogicaContext ctx)
    {
      long puntosExprLogica = 0;
      int numHijos = ctx.getChildCount();
      if (numHijos > 1) //si es una expresion compleja
      {
        long numOps = (numHijos - 1) / 2; //numero de expresiones - 1
        puntosExprLogica += numOps; //suma 1 por operador (operacion simple)
        visitedFunction.addSimpleOperator(numOps);
        for (int i=0; i<=numHijos; i+=2) //recorre todas las expresiones (en orden) saltando los operadores
        {
          puntosExprLogica += (Long)visit(ctx.getChild(i));
        }
      }
      else 
      {
        ArrayList<Pl2compilerParser.ExprContext> listaExprs = new ArrayList<Pl2compilerParser.ExprContext>(ctx.expr());
        for (int i=0; i<listaExprs.size(); i++)
        {
          visit(listaExprs.get(i));
        }
        ArrayList<Pl2compilerParser.PalabraclavebooleanoContext> listaBooleanos = new ArrayList<Pl2compilerParser.PalabraclavebooleanoContext>(ctx.palabraclavebooleano());
        for (int i=0; i<listaBooleanos.size(); i++)
        {
          visit(listaBooleanos.get(i));
        }
      }
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
  }