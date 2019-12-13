import java.util.ArrayList;
import java.lang.Math;

public class VisitorComplejidad extends Pl2compilerParserBaseVisitor
{
    private File file = File.getInstance(); //Contains the symbol table
    private TablaSimbolosComplejidadFuncion symbolTable; // = new TablaSimbolosComplejidadFuncion();
    private String completeNameFunction;
    private String nameFunction;
    private int numParametersFunction;

    public VisitorComplejidad()
    {
        this.completeNameFunction = "";
        this.nameFunction = "";
        this.numParametersFunction = 0;
    }

    @Override
    public Integer visitProg(Pl2compilerParser.ProgContext ctx)
    {
        ArrayList<Pl2compilerParser.CrearfuncionContext> listaCrearFuncion = new ArrayList<Pl2compilerParser.CrearfuncionContext>(ctx.crearfuncion());
        if(listaCrearFuncion.size() != 0)
        {
            for(int i = 0; i < listaCrearFuncion.size(); i++)
            {
                symbolTable = new TablaSimbolosComplejidadFuncion();
                visit(listaCrearFuncion.get(i));
                System.out.println(completeNameFunction);
                System.out.println(nameFunction);
                System.out.println(numParametersFunction);
                this.completeNameFunction = "";         //Para tener el nombre completo de la función con los nombres de sus parámetros
                this.nameFunction = "";                 //Función sin parámetros
                this.numParametersFunction = 0;         //Nº de parámetros
            }
        }
        return 1; //no seria 0 (realmente da igual)?
    }
    @Override
    public Integer visitCrearfuncion(Pl2compilerParser.CrearfuncionContext ctx)
    {
        visit(ctx.cabecerafuncion());
        visit(ctx.cuerpo());
        return 1;
    }
    @Override
    public Integer visitCabecerafuncion(Pl2compilerParser.CabecerafuncionContext ctx)
    {
        completeNameFunction += ctx.palabraclavecreacionfuncion().FUNCTION().getText() + " ";
        if(ctx.nombrefuncion() != null)
        {
            completeNameFunction += ctx.nombrefuncion().ID().getText() + "(";
        }
        else if(ctx.palabraclavefuncionmain() != null)
        {
            completeNameFunction += ctx.palabraclavefuncionmain().MAIN().getText() + "(";
        }
        nameFunction = completeNameFunction + ")";
        if(ctx.parametros() != null)
        {
          ArrayList<Pl2compilerParser.ParametroContext> listaParametros = new ArrayList<Pl2compilerParser.ParametroContext>(ctx.parametros().parametro());
          numParametersFunction = listaParametros.size();
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
                completeNameFunction += ",";
              }
              completeNameFunction += listaNombreVariables.get(j);
            }
          }
        }
        completeNameFunction += ")";
        symbolTable.setFunctionName(completeNameFunction);
        return 1;
    }
    @Override
    public Integer visitCuerpo(Pl2compilerParser.CuerpoContext ctx)
    {
        visit(ctx.cabecerafuncion());
        visit(ctx.cuerpo());
        return 1;
    }

}