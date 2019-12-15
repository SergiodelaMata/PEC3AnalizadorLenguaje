import java.util.*;
import java.io.*;


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
            System.out.println("AAAAAAAAAAAAAA " + enumeration.nextElement());
        }
        if(counter == position)
        {
            tablaSimbolos = symbolTable.get(enumeration.nextElement());
        }
        return tablaSimbolos;
    }

    public void crearGrafo(int posicion)
    {
        TablaSimbolosComplejidadFuncion tablaSimbolos = new TablaSimbolosComplejidadFuncion();
        String nombreFuncion = tablaSimbolos.getFunctionName();
        nombreFuncion = nombreFuncion.substring(0, nombreFuncion.indexOf("(") + 1);
        String dot = printHashMapFunction(posicion);
        try
        {
            //String nombreDot = "grafo" + nombreFuncion + ".dot";
            FileWriter filewriter = new FileWriter("grafo" + nombreFuncion + ".dot"); //archivo donde se va a crear
            PrintWriter printw = new PrintWriter(filewriter);     
            //String svg = "dot -Tsvg " + nombreDot + "-o grafo" + nombreFuncion +".svg";   
            //Runtime.getRuntime().exec(svg);
            Runtime.getRuntime().exec("dot -Tsvg grafo"+ nombreFuncion + ".dot -o grafo" + nombreFuncion +".svg");
            printw.println(dot);
            printw.close();
        } catch(IOException io)
        {
            System.out.println("Error al crear grafo");
        }
    }

    public String printHashMapFunction(int position) //Imprime el recorrido del grafo en una función
    {
        String dot = "digraph Grafo\n{\n";
        TablaSimbolosComplejidadFuncion tablaSimbolos = new TablaSimbolosComplejidadFuncion();
        tablaSimbolos = getTable(position);
        System.out.println(tablaSimbolos.getFunctionName());
        Enumeration enumeration = symbolTable.keys();
        ArrayList<Integer> listNumNodes = new ArrayList<Integer>();
        ArrayList<Integer> listaNodos = tablaSimbolos.getListNode();
        for (int i=0; i<listaNodos.size(); i++)
        {
            if (i == 0)
            {
               dot += "0 [label=\"\"style=filled, fillcolor=red]\n";
            }
            else if (i == listaNodos.size()-1)
            {
                dot += (listaNodos.size()-1) + " [label=\"\"style=filled, fillcolor=blue]\n";
            }
            else
            {
                dot += i + " [label=\"\"];\n";
            }
        }
        for(int i = 0; i < tablaSimbolos.size(); i++)
        {
            listNumNodes = tablaSimbolos.get(i);
            System.out.println ("YEAH " + i);
            if(listNumNodes != null)
            {
              for(int j = 0; j < listNumNodes.size(); j++)
              {
                  System.out.println(i + " -> " + listNumNodes.get(j));
                  dot += i + "->" + listNumNodes.get(j) + ";\n";
              }
            }
            else
            {
              System.out.print(i + " no tiene hijos.");
            }
        }
        dot += "}";
        System.out.println(dot);
        return dot;
    }

    public void printHashMap()
    {
      //System.out.println(symbolTable.size());
        for(int i = 0; i < symbolTable.size(); i++)
        {
            printHashMapFunction(i);
            crearGrafo(i);
        }
    }





}
