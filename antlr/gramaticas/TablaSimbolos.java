import java.util.*;

public class TablaSimbolos
{
    private Hashtable<String, Funcion> symbolTable;

    public TablaSimbolos()
    {
        this.symbolTable = new Hashtable<String, Funcion>();
    }

    public void addFunction(Funcion function)
    {
        symbolTable.put(function.getName(), function);
    }

    public void printHashMap()
    {
        for (Funcion function : symbolTable.values())
        {
            function.printAttributes();
            System.out.println();
        }
    }

    public void removeFunction(Funcion function)
    {
        symbolTable.remove(function.getName(), function);
    }

    public Hashtable<String, Funcion> getTable()
    {
        return this.symbolTable;
    }
}
