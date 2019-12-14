import java.util.*;


public class TablaSimbolosComplejidad
{
    private Hashtable<String, TablaSimbolosComplejidadFuncion> symbolTable;

    public TablaSimbolosComplejidad()
    {
        this.symbolTable = new Hashtable<String, TablaSimbolosComplejidadFuncion>();
    }

    public void putFunctionSymbolTable(TablaSimbolosComplejidadFuncion tablaSimbolosComplejidadFuncion)
    {
        symbolTable.put(tablaSimbolosComplejidadFuncion.getFunctionName(), tablaSimbolosComplejidadFuncion);
    }

    public TablaSimbolosComplejidadFuncion getTable(int position)
    {
        Enumeration enumeration = symbolTable.keys();
        TablaSimbolosComplejidadFuncion tablaSimbolos = new TablaSimbolosComplejidadFuncion();
        int counter = 0;
        while(position != counter && enumeration.hasMoreElements())
        {
            counter++;
            enumeration.nextElement();
        }
        if(counter == position)
        {
            tablaSimbolos = symbolTable.get(enumeration.nextElement());
        }
        return tablaSimbolos;
    }

    public void printHashMapFunction(int position) //Imprime el recorrido del grafo en una función
    {
        TablaSimbolosComplejidadFuncion tablaSimbolos = new TablaSimbolosComplejidadFuncion();
        //System.out.println("Hola soy Elmo");
        tablaSimbolos = getTable(position);
        System.out.println(tablaSimbolos.getFunctionName());
        Enumeration enumeration = symbolTable.keys();
        ArrayList<Integer> listNumNodes = new ArrayList<Integer>();
        for(int i = 0; i < tablaSimbolos.size(); i++)
        {
            listNumNodes = tablaSimbolos.get(i);
            for(int j = 0; j < listNumNodes.size(); j++)
            {
                if(j != 0)
                {
                    System.out.println(i + " -> " + listNumNodes.get(j));
                }
            }
        }

    }

    public void printHashMap()
    {
      //System.out.println(symbolTable.size());
        for(int i = 0; i < symbolTable.size(); i++)
        {
            printHashMapFunction(i);
        }
    }





}
