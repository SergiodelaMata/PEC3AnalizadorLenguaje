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

    /* Deberíamos tener esto en cuenta
– LaoperaciónInsertarnodebesobrescribirdeclaracionesanteriores. 
– La operación Buscar debe encontrar siempre la declaración más reciente. 
– La operación Eliminar sólo elimina la declaración más reciente de un nombre
    */
    
}