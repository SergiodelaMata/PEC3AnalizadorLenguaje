import java.util.ArrayList;

public class VisitorBasico extends Pl2compilerParserBaseVisitor
{
    //En principio los visitors de reglas que no suman punto ni hacen nada se pueden dejar sin hacer (si no funciona asi habria que crearlos retornando null o algo asi)
    private Funcion visitedFunction;                                                                //Si se devuelve un Integer, hay que devolver 0 en todo caso, null da error
    private File file = File.getInstance(); //Contains the symbol table
    private int numFunctionPoints;
    //private String nombreParametro;

    public VisitorBasico()
    {
        this.numFunctionPoints = 0;
        //this.nombreParametro = "";
    }

    @Override
    public Integer visitProg(Pl2compilerParser.ProgContext ctx)
    {
      ArrayList<Pl2compilerParser.CrearfuncionContext> listaCrearFuncion = new ArrayList<Pl2compilerParser.CrearfuncionContext>(ctx.crearfuncion());
      if(listaCrearFuncion.size() != 0)
      {
        for(int i = 0; i < listaCrearFuncion.size(); i++)
        {
          visit(listaCrearFuncion.get(i));
        }
      }
      System.out.println("HOLA");
      return 1;
    }

    @Override
    public Integer visitCrearfuncion(Pl2compilerParser.CrearfuncionContext ctx)
    {
        visitedFunction = new Funcion();
        int numFunctionPoints = 0;
        numFunctionPoints = (Integer) visit(ctx.cabecerafuncion());
        numFunctionPoints += (Integer) visit(ctx.cuerpo());

        System.out.println("Hola nueva funcion");
        //System.out.println(numFunctionPoints);

        visitedFunction.setFunctionPoints(numFunctionPoints);
        file.addFunction(visitedFunction);
        return numFunctionPoints;
    }

    @Override
    public Integer visitCabecerafuncion(Pl2compilerParser.CabecerafuncionContext ctx)
    {
        //int numFunctionPoints = 0;
        //int numParameters = 0;
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
        if(ctx.parametros() == null)
        {
          visitedFunction.addParameter(0);
          System.out.println(0);
          System.out.println(nombre + " ");
        }
        else
        {
          //numParameters += (Integer) ctx.visitParametros();
          visit(ctx.parametros());
          System.out.println(nombre + " ");
        }
        visitedFunction.concatenateName("):");
        if(ctx.retorno() != null)
        {
          visit(ctx.retorno());
        }
        //numParameters += ctx.parametros();
        //falta añadir nombre funcion (hijo 1)
        /*for (int i=0; i<ctx.getChildCount(); i++)
        {
            numFunctionPoints += (int) visit(ctx.getChild(i));
        }*/
        //cabecerafuncion:  palabraclavecreacionfuncion (nombrefuncion|palabraclavefuncionmain) operadoraperturaparentesis parametros? operadorcierreparentesis separadordospuntos retorno;

        return visitedFunction.getFunctionPoints();
    }

    @Override
    public Integer visitParametros(Pl2compilerParser.ParametrosContext ctx)
    {
        /*int numHijos = ctx.getChildCount();
        int numFunctionPoints = 0;
        for (int i=0; i<numHijos; i++)
        {
            numFunctionPoints += (int) visit(ctx.getChild(i));
        }
        return numFunctionPoints;*/
        ArrayList<Pl2compilerParser.ParametroContext> listaParametros = new ArrayList<Pl2compilerParser.ParametroContext>(ctx.parametro());
        visitedFunction.addParameter(listaParametros.size());
        System.out.println("Nº Parámetros: " + listaParametros.size());
        visitedFunction.addParameter(listaParametros.size() * 2);
        for(int i = 0; i < listaParametros.size(); i++)
        {
          if(i == 0)
          {
            visit(listaParametros.get(i));

          }
          else
          {
            visitedFunction.concatenateName(",");
            visit(listaParametros.get(i));
          }

        }
        return listaParametros.size() * 2;
    }

    @Override public Integer visitExpr(Pl2compilerParser.ExprContext ctx)
    {
      ArrayList<Pl2compilerParser.NombrevariableContext> listaNombreVariables = new ArrayList<Pl2compilerParser.NombrevariableContext>(ctx.nombrevariable());
      if(listaNombreVariables.size() != 0)
      {
        for(int i = 0; i < listaNombreVariables.size(); i++)
        {
          if(ctx.nombrevariable() != null)
          {
            if(listaNombreVariables.get(i).ID() != null)
            {
              visitedFunction.concatenateName(listaNombreVariables.get(i).ID().getText());
            }
            else if(listaNombreVariables.get(i).ARRAY() != null)
            {
              visitedFunction.concatenateName(listaNombreVariables.get(i).ARRAY().getText());
            }
            else if(listaNombreVariables.get(i).CASE() != null)
            {
              visitedFunction.concatenateName(listaNombreVariables.get(i).CASE().getText());
            }
          }
        }
      }

       return 1;

     }

    /*@Override
    public String visitParametro()
    {

    }*/

    @Override
    public Integer visitRetorno(Pl2compilerParser.RetornoContext ctx)
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
     public Integer visitTipovariable(Pl2compilerParser.TipovariableContext ctx)
     {



       return 0;
     }*/

     //"cuerpo" se divide en palabraclaveinicio, codigo y palabraclavefin. Hay tres cuerpos en el Parser ¿Cuál usamos? En principio uso "codigo"
    @Override
    public Integer visitCuerpo(Pl2compilerParser.CuerpoContext ctx)
    {
      visitedFunction = new Funcion();
      int numFunctionPoints = 0;
      numFunctionPoints = (Integer) visit(ctx.codigo());//Da error

      visitedFunction.setFunctionPoints(numFunctionPoints);
      file.addFunction(visitedFunction);
      return numFunctionPoints;
    }

    //"codigo" se divide en (funcionwhile|funcionfor|operacionswitch|asignacion|llamarfuncion|devolver|cuerpo2)+
    //Hay que visitarlos todos por lo que tienen que estar los que nos interesen (en principio, si da error por cosas del Visitor pues todos) en el Visitor
    @Override
    public Integer visitCodigo(Pl2compilerParser.CodigoContext ctx)
    {
      ArrayList<Pl2compilerParser.CodigoContext> listaCodigo = new ArrayList<Pl2compilerParser.CodigoContext>(ctx.codigo());
      if(listaCodigo.size() != 0)
      {
        for(int i = 0; i < listaCodigo.size(); i++)
        {
          visit(listaCodigo.get(i));
        }
      }      
      return listaCodigo.size();//En realidad no sé qué retornar               
    }

    public Integer visitFuncionwhile(Pl2compilerParser.FuncionwhileContext ctx){

    }

    public Integer visitFuncionfor(Pl2compilerParser.FuncionforContext ctx){

    }

    public Integer visitOperacionswitch(Pl2compilerParser.OperacionswitchContext ctx){

    }
    
    //((tipovariable? nombrevariable (operadorasignacion expr)?) | (tipovariable nombrevariable (separadoroperadores nombrevariable)*)) separadoroperaciones?;
    public Integer visitAsignacion(Pl2compilerParser.AsignacionContext ctx){      
      
      
      return 1; //Cada variable declarada es un punto, asumimos que sus hijos están, no habría que visitarlos en pricipio
    }

    
    public Integer visitLlamarfuncion(Pl2compilerParser.LlamarfuncionContext ctx){
      /*
      Usará visitParametros, pero hay un problema. En el return de visitParametros, según el enunciado sería:
      Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado. Tal y como está en visitParametros el return no funcionaria
      */
      return 2; //Cada función llamada: 2 puntos, +1 punto por cada parámetro pasado
    }


    public Integer visitDevolver(Pl2compilerParser.DevolverContext ctx){

    }

    public Integer visitCuerpo2(Pl2compilerParser.Cuerpo2Context ctx){

    }

}
