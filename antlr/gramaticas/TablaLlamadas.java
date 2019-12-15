import java.util.*;
import java.io.*;

public class TablaLlamadas
{
    private Hashtable<String, ArrayList<String>> symbolTable; //almacena el nombre de la funcion como clave y un array con las funciones llamadas como valor

    public TablaLlamadas()
    {
        this.symbolTable = new Hashtable<String, ArrayList<String>>();
    }

    public void addFuncion(String funcion, ArrayList<String> llamadas) //añade una funcion con sus llamadas a la tabla
    {
        symbolTable.put(funcion, llamadas);
    }

    public Hashtable<String, ArrayList<String>> getTabla()
    {
        return this.symbolTable;
    }

    public void printHashMap() //BORRAR ANTES DE ENTREGAR
    {
        Enumeration e = symbolTable.keys();
        String key;
        ArrayList<String> value;
        while(e.hasMoreElements())
        {
            key = (String) e.nextElement();
            value = symbolTable.get(key);
            System.out.print(key + " -> ");
            for (int i=0; i<value.size(); i++)
            {
                System.out.print(value.get(i) + " ");;
            }
            System.out.println();
        }
    }


    public void crearGrafo(String funcionInicio)
    {
        if (isValida(funcionInicio)) //comprueba si la funcion existe
        {
            String dot = createDot(funcionInicio);
            try
            {
                FileWriter filewriter = new FileWriter("grafoLlamadas.dot"); //archivo donde se va a crear
                PrintWriter printw = new PrintWriter(filewriter);                
                Runtime.getRuntime().exec("dot -Tsvg grafoLlamadas.dot -o grafoLlamadas.svg");
                printw.println(dot);
                printw.close();
            } catch(IOException io)
            {
                System.out.println("Error al crear la pagina web");
            }
        }
        else
        {
            System.out.println("La funcion introducida no es valida");
        }
    }

    public Boolean isValida(String funcion) //comprueba si una funcion (nombrefuncion(parametros))esta en el programa
    {
        boolean isValida = false;
        Object[] keys = symbolTable.keySet().toArray();
        for (int i=0; i<keys.length; i++)
        {
            if (keys[i].equals(funcion))
            {
                isValida = true;
            }
        }
        return isValida;
    }

    public String createDot(String funcionInicio)
    {
        String dot = "digraph Llamadas\n{\n";
        Enumeration e = symbolTable.keys();
        String key;
        ArrayList<String> value;
        ArrayList<String> nodos = new ArrayList<String>();
        dot += 0 + " [label=\"\"style=filled, fillcolor=red];\n"; //pongo nombre a los nodos
        while(e.hasMoreElements()) //añado los nodos claves
        {
            key = (String) e.nextElement();
            nodos.add(key);
            dot += nodos.size() + " [label=\"" + key + "\"];\n"; //pongo nombre a los nodos
            value = symbolTable.get(key);
        }
        Enumeration e2 = symbolTable.keys();
        while (e2.hasMoreElements()) //añado los nodos valor (sin repeticiones)
        {
            key = (String) e2.nextElement();
            value = symbolTable.get(key);
            System.out.print(key + " -> ");
            for (int i=0; i<value.size(); i++)
            {
                if (!existe(nodos, value.get(i))) //si el nodo no esta ya creado (evitar repeticiones)
                {
                    nodos.add(value.get(i)); //añado el nodo
                    dot += nodos.size() + " [label=\"" + value.get(i) + "\"];\n"; //pongo nombre a los nodos
                }
                System.out.print(value.get(i) + " ");;
            }
            System.out.println();
        }
        dot += "0->" + (getPosicion(nodos, funcionInicio) + 1) + ";\n";
        Enumeration e3 = symbolTable.keys();
        while (e3.hasMoreElements()) //se crean las relaciones
        {
            key = (String) e3.nextElement();
            value = symbolTable.get(key);
            for (int i=0; i<value.size(); i++) //en este for se crean las relaciones entre los nodos creados antes
            {
                int posNodoClave = getPosicion(nodos, key) + 1;
                int posNodo = getPosicion(nodos, value.get(i)) + 1;
                dot += posNodoClave + "->" + posNodo + ";\n";
            }
        }
        dot += "}";
        return dot;
    }

    public Boolean existe(ArrayList<String> nodos, String nodo) //comprueba si existe un nodo (si esta en el array)
    {
        //no he tenido en cuenta que haya dos funciones con el mismo nombre y distintos parametros
        boolean existe = false;
        for (int i=0; i<nodos.size(); i++)
        {
            //if (nodo.equals(nodos.get(i)))
            if (nodos.get(i).substring(0, nodos.get(i).indexOf("(") + 1).equals(nodo.substring(0, nodo.indexOf("(") + 1))) //si en nodos ya esta el nodo (compruenba todo el nombre menos los parametros)
            {
                existe = true;
            }
        }
        return existe;
    }

    public int getPosicion(ArrayList<String> nodos, String nodo) //Obtiene la posicion de un nodo en la lista de nodos
    {
        int posicion = -1; //en principio no puede darse el caso de que retorne esto, si se diera habrai que crear una excepcion
        for (int i=0; i<nodos.size(); i++) //recorre lso nodos para enontrar el nodo pasado por parametro
        {
            if (nodos.get(i).substring(0, nodos.get(i).indexOf("(") + 1).equals(nodo.substring(0, nodo.indexOf("(") + 1))) //si es el nodo buscado
            {
                posicion = i;
            }
        }
        return posicion;
    }      
}