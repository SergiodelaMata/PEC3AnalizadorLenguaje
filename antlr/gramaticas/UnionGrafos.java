import java.io.FileReader;
import java.util.*;
import java.io.*;

public class UnionGrafos //NECESITO EL NODO DESDE EL QUE SE LLAMA!!!!!!
{
    private File file;
    //private TablaSimbolosComplejidad tablaComplejidad;
    private Hashtable<String, ArrayList<String>> tablaLlamadas;
    //private HashMap<String, ArrayList<String>> llamadas; //nombre funcion, nombres funciones llamadas
    private HashMap<String, HashMap<String, ArrayList<Integer>>> funcionesLlamadas;//almacena nombre funcion, nombrefuncion llamada, nodos desde donde se llama
    private HashMap<String, ArrayList<Integer>> nodosLlamada; //funcionllamada + nodo donde se llama(lo tengo que meter en funcionesLlamadas)

    public UnionGrafos()
    {
        this.file = File.getInstance();
        //this.tablaComplejidad = file.getTablaSimbolosComplejidad();
        this.tablaLlamadas = file.getTablaLlamadas().getTabla();;
        //this.llamadas = new HashMap<String, ArrayList<String>>();
        this.funcionesLlamadas = new HashMap<String, HashMap<String, ArrayList<Integer>>>();
        this.nodosLlamada = new HashMap<String, ArrayList<Integer>>();
        //setLlamadasReales();
    }

    public void setLlamada(String funcion, String funcionLlamada, Integer nodo)
    {
        //funcionesLlamadas.put(funcion, )
        funcion = funcion.substring(9, funcion.indexOf("("));
        funcionLlamada =funcionLlamada.substring(9, funcionLlamada.indexOf("("));
        Object[] fLlamadas = nodosLlamada.keySet().toArray();
        //introduzco las llamadas  y nodos a nodosLlamada
        for (int i=0; i<fLlamadas.length; i++) //recorre las funciones llamadas para ver si existe ya
        {
            ArrayList<Integer> nodos;
            if (fLlamadas[i].equals(funcionLlamada)) //ya esta en el hashmap
            {
                nodos = nodosLlamada.get(fLlamadas[i]);
                nodos.add(nodo);
                nodosLlamada.put((String) fLlamadas[i], nodos);
            }
            else
            {
                nodos = new ArrayList<Integer>();
                nodos.add(nodo);
                nodosLlamada.put((String) fLlamadas[i], nodos);
            }
        }
        //introduzco nodosLlamadas en funcionesllamadas
        Object[] funLlamadas = funcionesLlamadas.keySet().toArray();
        for (int i=0; i<funLlamadas.length; i++) //recorre las funciones llamadas para ver si existe ya
        {
            funcionesLlamadas.put(funcion, nodosLlamada);
        }
    }


    /*public void getLlamadasReales() //actualiza el hashmap llamadas para que tenga solo las llamada s funciones existentes en e progrma
    {
        ArrayList<String> funLlamadas;
        Enumeration e2 = tablaLlamadas.keys();
        String key2;
        ArrayList<String> value;
        int counter = 0;
        while(e2.hasMoreElements()) //añado las llamadas de las funciones existentes en el programa
        {
            key2 = (String) e2.nextElement();
            value = tablaLlamadas.get(key2);
            funLlamadas = new ArrayList<>();
            for (int i=0; i<value.size(); i++)
            {
                if (existeEnProg(value.get(counter))) //si la funcion existe realmente se añade a las llamadas
                {
                    funLlamadas.add(value.get(i));
                }
            }
            counter++;
            llamadas.put(key2, funLlamadas);
        }
        //puedo retornar el hashmap llamadas para cogerlo en VisitorComplejidad o lo ejecuto en el constructor y hago un get
        //si no retorno cambiar nombre por setLlamadasReales()
    }*/

    public Boolean existeEnProg(String nombre) //comprueba si el nombre esta en un array
    {
        boolean existe = false;
        ArrayList<String> nombreFunciones = new ArrayList<String>();
        Enumeration e = tablaLlamadas.keys();
        String key;
        while(e.hasMoreElements()) //añado los nombres de las funciones existentes en el programa
        {
            key = (String) e.nextElement();
            nombreFunciones.add(key.substring(9, key.indexOf("(")));
        }
        for (int i=0; i<nombreFunciones.size(); i++)
        {
            if (nombreFunciones.get(i).equals(nombre)) //compruebo si la funcion pasada existe en el programa
            {
                existe = true;
            }
        }
        return existe;
    }

    public void crearGrafo()
    {
        String dot = "digraph Grafo\n{\n";
        Object[] funLlamadas = funcionesLlamadas.keySet().toArray(); //nombres de las funciones existentes
        //crear subgrafos
        FileReader fr;
        BufferedReader br;
        String nombreFile;
        String dotSubgrafo;
        //String dotAux;
        String line;
        String ultimoNodo = "0";
        HashMap<String, String> ultimosNodos = new HashMap<String, String>();
        for (int i=0; i<funLlamadas.length; i++)
        {
            dotSubgrafo = "subgraph";
            //dotAux = "";
            nombreFile = "grafo" + funLlamadas[i] + ".dot";
            try
            {
                fr = new FileReader(nombreFile);
                br = new BufferedReader(fr);
                /*int valor=fr.read();
                while(valor!=-1)
                {
                    //System.out.print((char)valor);
                    dotAux += (char) valor;
                    valor=fr.read();
                }*/
                line = br.readLine(); //ignora las 2 primeras lineas
                dotSubgrafo += line;
                line = br.readLine();
                dotSubgrafo += line;
                while((line = br.readLine()) != null)
                {
                    if (!line.contains("}")) //ignora la ultima linea
                    {
                        if (line.contains("[")) //si es una linea de instaciar nodo
                        {
                            dotSubgrafo += funLlamadas[i] + line; //nombre + linea
                            ultimoNodo = line.substring(0, 1); //actualizo ultimo nodo para quedarme con el ultimo
                        }
                        else //si es una linea de relacion
                        {
                            dotSubgrafo += funLlamadas[i] + line.substring(0, 2) + funLlamadas[i] + line.substring(3, line.length()); //nombre + nodo-> + nombre + nodo (dir);
                        }
                    }
                }
                ultimosNodos.put((String) funLlamadas[i], ultimoNodo);
                fr.close();
            }
            catch (IOException io)
            {
                System.out.println("Error leyendo dot");
            }
            //dotAux.substring(6); //quita digraph
            dotSubgrafo += "}";   

            dot += dotSubgrafo; //añado el subgrafo         
        }

        //crear uniones
        HashMap<String, ArrayList<Integer>> nodosLlamados;
        //String funcion;
        Object[] nombresFunciones;
        ArrayList<Integer> nodos;
        String nodoLlamada;
        String funcionLlamada;
        String relacionIda, relacionVuelta;
        for (int i=0; i<funLlamadas.length; i++) //recorro las funciones existentes en el programa
        {
            nodosLlamados = funcionesLlamadas.get(funLlamadas[i]);
            nombresFunciones = nodosLlamados.keySet().toArray();
            for (int j=0; j<nombresFunciones.length; j++) //recorro las funciones llamadas
            {
                funcionLlamada = (String) nombresFunciones[i]; //funcion llamada
                nodos = nodosLlamados.get(nombresFunciones[i]); //nodos desde donde se llama
                for (int k=0; k<nodos.size(); k++) //recorro los nodos donde se llama a las funciones
                {
                    //k = nodo
                    nodoLlamada = (String) funLlamadas[i] + k; //nombre + numNodo
                    relacionIda = funLlamadas[i] + "0->" + funcionLlamada + nodoLlamada;
                    relacionVuelta = funcionLlamada + nodoLlamada + "->" + funLlamadas[i] + ultimosNodos.get(funLlamadas[i]);
                    dot += relacionIda;
                    dot += relacionVuelta;
                    //añadir las relaciones a  dot
                }
            }
        }

        dot = "}";
    }


/*
hacemos antes el visitorllamadas que el visitorcomplejidada y en e visitorComplejidad
cada vez que haya una llamada si esta en la lista hace Union grafos*/

    /*
        En visitLlamada se llama a existeEnProg (pasando por parametro la funcion llamada) y para las 
        funciones que existan hago setLlamada(funcion, funcion llamada, nodo llamada)
        Cuando acabe todo el visitorComplejidad  tendre en funcionesLlamadas todos los datos necesarios
        para unir los grafos y habra qeu llamar a la funcion unirGrafos
    */


}
