import java.util.*;
import java.io.Serializable;

public class File implements Serializable{
    private static File instance;
    TablaSimbolos symbolTable;
    TablaSimbolosComplejidad complexSymbolTable;
    TablaLlamadas tablaLlamadas;
    UnionGrafos unionGrafos;
    FuncionLlamada funcionLlamada;

    public static File getInstance()
    {
        if(instance == null)
        {
            instance = new File();
        }
        return instance;
    }

    private File()
    {
        this.symbolTable = new TablaSimbolos();
        this.complexSymbolTable = new TablaSimbolosComplejidad();
        this.tablaLlamadas = new TablaLlamadas();
        this.unionGrafos = new UnionGrafos();
        this.funcionLlamada = new FuncionLlamada();
    }

    public void printSymbolTable()
    {
        symbolTable.printHashMap();
    }

    public void addFunction(Funcion function) //Introduce a new function into the symbol table
    {
        symbolTable.addFunction(function);
    }

    public void addEntradaTabla(String nombreFuncion, ArrayList<String> llamadas)
    {
        tablaLlamadas.addFuncion(nombreFuncion, llamadas);
    }

    public TablaLlamadas getTablaLlamadas()
    {
        return this.tablaLlamadas;
    }

    public TablaSimbolos getTablaSimbolos()
    {
        return this.symbolTable;
    }

    public TablaSimbolosComplejidad getTablaSimbolosComplejidad()
    {
      return this.complexSymbolTable;
    }

    public UnionGrafos getUnionGrafos()
    {
        return this.unionGrafos;
    }

    public void setFuncionLlamada(FuncionLlamada funcionLlamada)
    {
        this.funcionLlamada = funcionLlamada;
    }

    public FuncionLlamada getFuncionLlamada()
    {
        return this.funcionLlamada;
    }

    /*public void setLlamada(String funcion, String funcionLlamada, Integer nodo)
    {
        unionGrafos.setLlamada(funcion, funcionLlamada, nodo);
    }*/

    /*public void printComplexSymbol()
    {
        complexSymbolTable.printHashMap();
    }*/
}
