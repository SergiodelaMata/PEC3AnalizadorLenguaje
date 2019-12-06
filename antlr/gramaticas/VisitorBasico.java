public class VisitorBasico extends Pl2compilerParserBaseVisitor
{
    //En principio los visitors de reglas que no suman punto ni hacen nada se pueden dejar sin hacer (si no funciona asi habria que crearlos retornando null o algo asi)
    private Funcion visitedFunction;
    private File file = File.getInstance(); //Contains the symbol table
    private int numFunctionPoints;

    public VisitorBasico()
    {
        this.numFunctionPoints = 0;
    }

    @Override
    public void visitProg(Pl2compilerParser.ProgContext ctx)
    {
        for (int i=0; i<ctx.getChildCount(); i++) //Se visitan todos los hijos
        {
            visit(ctx.getChild(i));
            System.out.println("HOLA");
        }
    }

    @Override
    public void visitCrearfuncion(Pl2compilerParser.CrearfuncionContext ctx)
    {
        visitedFunction = new Funcion();
        numFunctionPoints = (Integer) visit(ctx.cabecerafuncion()) + (Integer)visit(ctx.cuerpo());

        System.out.println(numFunctionPoints);

        visitedFunction.setFunctionPoints(numFunctionPoints);
        file.addFunction(visitedFunction);
        //return numFunctionPoints;
    }

    @Override
    public Integer visitCabecerafuncion(Pl2compilerParser.CabecerafuncionContext ctx)
    {
        int numFunctionPoints = 0;
        //int numParameters = 0;
        String nombre = ctx.palabraclavecreacionfuncion().FUNCTION().getText() + " ";
        if(ctx.nombrefuncion() != null)
        {
          nombre += ctx.nombrefuncion().ID().getText();
        }
        else if(ctx.palabraclavefuncionmain() != null)
        {
          nombre += ctx.palabraclavefuncionmain().ID().getText();
        }
        if(ctx.parametros() == null)
        {
          visitedFunction.addParameter(0);
        }
        else
        {
          //numParameters += (Integer) ctx.visitParametros();
          ctx.visit(ctx.parametros());
        }
        //numParameters += ctx.parametros();
        //falta añadir nombre funcion (hijo 1)
        /*for (int i=0; i<ctx.getChildCount(); i++)
        {
            numFunctionPoints += (int) visit(ctx.getChild(i));
        }*/
        //cabecerafuncion:  palabraclavecreacionfuncion (nombrefuncion|palabraclavefuncionmain) operadoraperturaparentesis parametros? operadorcierreparentesis separadordospuntos retorno;

        return numFunctionPoints;
    }

    @Override
    public Integer visitParametros(Pl2compilerParser.ParametrosContext ctx)
    {
        int numHijos = ctx.getChildCount();
        int numFunctionPoints = 0;
        for (int i=0; i<numHijos; i++)
        {
            numFunctionPoints += (int) visit(ctx.getChild(i));
        }
        return numFunctionPoints;
    }

    @Override
    public Integer visitCuerpo(Pl2compilerParser.CuerpoContext ctx)
    {
        return null;
    }

}
