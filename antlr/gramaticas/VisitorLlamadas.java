import java.util.ArrayList;

public class VisitorLlamadas extends Pl2compilerParserBaseVisitor
{
    File file = File.getInstance();
    String nombreFuncion;
    ArrayList<String> llamadas;

    @Override 
    public Integer visitProg(Pl2compilerParser.ProgContext ctx) 
    { 
        ArrayList<Pl2compilerParser.CrearfuncionContext> listaFunciones = new ArrayList<Pl2compilerParser.CrearfuncionContext>(ctx.crearfuncion());
        for (int i=0; i<listaFunciones.size(); i++)
        {
            nombreFuncion = "";
            llamadas = new ArrayList<String>();
            visit(listaFunciones.get(i));
            //añadir nombre  y llamadas a la tabla
            file.addEntradaTabla(nombreFuncion, llamadas);
            //System.out.println(nombreFuncion + " " + llamadas);
        }
        return null; 
    }

    @Override 
    public Integer visitCrearfuncion(Pl2compilerParser.CrearfuncionContext ctx) 
    { 
        visit(ctx.cabecerafuncion());
        visit(ctx.cuerpo());
        return null; 
    }
    
    @Override
    public Integer visitCabecerafuncion(Pl2compilerParser.CabecerafuncionContext ctx)
    {
        if(ctx.nombrefuncion() != null)
        {
            nombreFuncion += ctx.nombrefuncion().ID().getText() + "(";
        }
        else if(ctx.palabraclavefuncionmain() != null)
        {
            nombreFuncion += ctx.palabraclavefuncionmain().MAIN().getText() + "(";
        }
        if(ctx.parametros() != null)
        {
          ArrayList<Pl2compilerParser.ParametroContext> listaParametros = new ArrayList<Pl2compilerParser.ParametroContext>(ctx.parametros().parametro());
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
                nombreFuncion += ",";
              }
              nombreFuncion += listaNombreVariables.get(j);
            }
          }
        }
        nombreFuncion += ")";
        //symbolTable.setFunctionName(completeNameFunction);
        return null;
    }
    
    @Override
    public Integer visitCuerpo(Pl2compilerParser.CuerpoContext ctx)
    {
        visit(ctx.codigo());
        return null;
    }

    @Override
    public Integer visitCuerpo2(Pl2compilerParser.Cuerpo2Context ctx)
    {
        ArrayList<Pl2compilerParser.AsignacionContext> listaAsignaciones = new ArrayList<Pl2compilerParser.AsignacionContext>(ctx.asignacion());
        ArrayList<Pl2compilerParser.LlamarfuncionContext> listaLlamadas = new ArrayList<Pl2compilerParser.LlamarfuncionContext>(ctx.llamarfuncion());
        for (int i=0; i<listaAsignaciones.size(); i++)
        {
            visit(listaAsignaciones.get(i));
        }
        for (int i=0; i<listaLlamadas.size(); i++)
        {
            visit(listaLlamadas.get(i));
        }
        return null;
    }

    @Override
    public Integer visitCuerpo3(Pl2compilerParser.Cuerpo3Context ctx)
    {
        ArrayList<Pl2compilerParser.AsignacionContext> listaAsignaciones = new ArrayList<Pl2compilerParser.AsignacionContext>(ctx.asignacion());
        ArrayList<Pl2compilerParser.LlamarfuncionContext> listaLlamadas = new ArrayList<Pl2compilerParser.LlamarfuncionContext>(ctx.llamarfuncion());
        for (int i=0; i<listaAsignaciones.size(); i++)
        {
            visit(listaAsignaciones.get(i));
        }
        for (int i=0; i<listaLlamadas.size(); i++)
        {
            visit(listaLlamadas.get(i));
        }
        return null;
    }

    @Override
    public Integer visitLlamarfuncion(Pl2compilerParser.LlamarfuncionContext ctx)
    {
        if(ctx.llamadafuncion() != null)
        {
            visit(ctx.llamadafuncion());
        }
        else if(ctx.condicionales() != null)
        {
            visit(ctx.condicionales());
        }
        else if(ctx.funcionwhile() != null)
        {
            visit(ctx.funcionwhile());
        }
        else if(ctx.funcionfor() != null)
        {
            visit(ctx.funcionfor());
        }
        return null;
    }

    @Override
    public Integer visitLlamadafuncion(Pl2compilerParser.LlamadafuncionContext ctx)
    {
        String llamada = ctx.nombrefuncion().ID().getText() + "()";
        llamadas.add(llamada);
        if (ctx.parametros() != null)
        {
            visit(ctx.parametros());
        }
        return null;
    }

    @Override 
    public Integer visitParametros(Pl2compilerParser.ParametrosContext ctx) 
    { 
        ArrayList<Pl2compilerParser.ParametroContext> listaParametros = new ArrayList<Pl2compilerParser.ParametroContext>(ctx.parametro());
        for(int i=0; i<listaParametros.size(); i++)
        {
            visit(listaParametros.get(i));
        }
        return null; 
    }
	

    @Override 
    public Integer visitParametro(Pl2compilerParser.ParametroContext ctx) 
    { 
        visit(ctx.expr());
        return null; 
    }

    @Override 
    public Integer visitAsignacion(Pl2compilerParser.AsignacionContext ctx) 
    { 
        if (ctx.expr() != null)
        {
            visit(ctx.expr());
        }
        return null;
    }

    @Override public Integer visitExpr(Pl2compilerParser.ExprContext ctx)
    {
        ArrayList<Pl2compilerParser.ExprContext> listaExprs = new ArrayList<Pl2compilerParser.ExprContext>(ctx.expr());
        if (ctx.llamadafuncion() != null) 
        {
            visit(ctx.llamadafuncion());
        }
        else if (listaExprs.size() != 0)
        {
            for (int i=0; i<listaExprs.size(); i++)
            {
                visit(listaExprs.get(i));
            }
        }
        return null; 
    }

    @Override
    public Integer visitExpresionlogica(Pl2compilerParser.ExpresionlogicaContext ctx)
    {
        ArrayList<Pl2compilerParser.ExprContext> listaExprs = new ArrayList<Pl2compilerParser.ExprContext>(ctx.expr());
        ArrayList<Pl2compilerParser.ExpresionlogicaContext> listaExpresionesLogicas = new ArrayList<Pl2compilerParser.ExpresionlogicaContext>(ctx.expresionlogica());
        if (listaExprs.size() != 0)
        {
            for (int i=0; i<listaExprs.size(); i++)
            {
                visit(listaExprs.get(i));
            }
        }
        if (listaExpresionesLogicas.size() != 0)
        {
            for (int i=0; i<listaExpresionesLogicas.size(); i++)
            {
                visit(listaExpresionesLogicas.get(i));
            }
        }
        return null;
    }

    @Override
    public Integer visitCondicionales(Pl2compilerParser.CondicionalesContext ctx)
    {
        visit(ctx.condicionalif());
        if (ctx.condicionalelse() != null)
        {
            visit(ctx.condicionalelse());
        }
        return null;
    }
    
    @Override
    public Integer visitCondicionalif(Pl2compilerParser.CondicionalifContext ctx)
    {
        ArrayList<Pl2compilerParser.CondicionContext> listaCondiciones = new ArrayList<Pl2compilerParser.CondicionContext>(ctx.condicion());
        for (int i=0; i<listaCondiciones.size(); i++)
        {
            visit(listaCondiciones.get(i));
        }
        if (ctx.cuerpo() != null)
        {
            visit(ctx.cuerpo());
        }
        else if (ctx.cuerpo2() != null)
        {
            visit(ctx.cuerpo2());
        }
        else if (ctx.cuerpo3() != null)
        {
            visit(ctx.cuerpo3());
        }
        return null;
    }

    @Override
    public Integer visitCondicionalelse(Pl2compilerParser.CondicionalelseContext ctx)
    {
        if (ctx.cuerpo() != null)
        {
            visit(ctx.cuerpo());
        }
        else if (ctx.cuerpo2() != null)
        {
            visit(ctx.cuerpo2());
        }
        else if (ctx.cuerpo3() != null)
        {
            visit(ctx.cuerpo3());
        }
        return null;
    }

    @Override 
    public Integer visitCondicion(Pl2compilerParser.CondicionContext ctx) 
    { 
        visit(ctx.expresionlogica());
        return null; 
    }
	

    @Override
    public Integer visitFuncionwhile(Pl2compilerParser.FuncionwhileContext ctx)
    {
        if (ctx.expr() != null)
        {
            visit(ctx.expr());
        }
        else if (ctx.expresionlogica() != null)
        {
            visit(ctx.expresionlogica());
        }
        if (ctx.cuerpo() != null)
        {
            visit(ctx.cuerpo());
        }
        else if (ctx.cuerpo2() != null)
        {
            visit(ctx.cuerpo2());
        }
        else if (ctx.cuerpo3() != null)
        {
            visit(ctx.cuerpo3());
        }
        return null;
    }
    @Override
    public Integer visitFuncionfor(Pl2compilerParser.FuncionforContext ctx)
    {
        if (ctx.cuerpo() != null)
        {
            visit(ctx.cuerpo());
        }
        else if (ctx.cuerpo2() != null)
        {
            visit(ctx.cuerpo2());
        }
        else if (ctx.cuerpo3() != null)
        {
            visit(ctx.cuerpo3());
        }
        return null;
    }

    @Override 
    public Integer visitDevolver(Pl2compilerParser.DevolverContext ctx) 
    { 
        llamadas.add("devolver()");
        if (ctx.llamadafuncion() != null)
        {
            visit(ctx.llamadafuncion());
        }
        else if (ctx.expr() != null)
        {
            visit(ctx.expr());
        }
        return null; 
    }
	
    @Override
    public Integer visitCodigo(Pl2compilerParser.CodigoContext ctx)
    {
        ArrayList<Pl2compilerParser.AsignacionContext> listaAsignaciones = new ArrayList<Pl2compilerParser.AsignacionContext>(ctx.asignacion());
        ArrayList<Pl2compilerParser.LlamarfuncionContext> listaLlamadas = new ArrayList<Pl2compilerParser.LlamarfuncionContext>(ctx.llamarfuncion());
        for (int i=0; i<listaAsignaciones.size(); i++)
        {
            visit(listaAsignaciones.get(i));
        }
        for (int i=0; i<listaLlamadas.size(); i++)
        {
            visit(listaLlamadas.get(i));
        }
        if (ctx.devolver() != null)
        {
            visit(ctx.devolver());
        }
        return null;
    }
	
}

