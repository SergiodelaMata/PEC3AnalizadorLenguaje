import java.util.*;


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

    public void printHashMap()
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

    public String createDot()
    {
        String dot = "digraph Llamadas\n{\n";
        Enumeration e = symbolTable.keys();
        String key;
        ArrayList<String> value;
        ArrayList<String> nodos = new ArrayList<String>();
        while(e.hasMoreElements()) //añado los nodos claves
        {
            key = (String) e.nextElement();
            dot += nodos.size() + " [label=\"" + key + "\"];\n"; //pongo nombre a los nodos
            nodos.add(key);
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
                    dot += nodos.size() + " [label=\"" + value.get(i) + "\"];\n"; //pongo nombre a los nodos
                    nodos.add(value.get(i)); //añado el nodo
                }
                System.out.print(value.get(i) + " ");;
            }
            System.out.println();
        }
        Enumeration e3 = symbolTable.keys();
        while (e3.hasMoreElements()) //se crean las relaciones
        {
            key = (String) e3.nextElement();
            value = symbolTable.get(key);
            for (int i=0; i<value.size(); i++) //en este for se crean las relaciones entre los nodos creados antes
            {
                int posNodoClave = getPosicion(nodos, key);
                int posNodo = getPosicion(nodos, value.get(i));
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