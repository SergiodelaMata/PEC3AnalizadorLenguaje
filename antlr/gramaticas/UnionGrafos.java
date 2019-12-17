import java.io.FileReader;
import java.util.*;
import java.io.*;

public class UnionGrafos
{
    private HashMap<String, ArrayList<String>> llamadas; //nombre funcion, nombres funciones llamadas
    private HashMap<String, HashMap<String, ArrayList<Integer>>> funcionesLlamadas;//almacena nombre funcion, nombrefuncion llamada, nodos desde donde se llama
    private HashMap<String, ArrayList<Integer>> nodosLlamada; //funcionllamada + nodo donde se llama(lo tengo que meter en funcionesLlamadas)

    public UnionGrafos()
    {
        this.funcionesLlamadas = new HashMap<String, HashMap<String, ArrayList<Integer>>>();
        this.nodosLlamada = new HashMap<String, ArrayList<Integer>>();
    }

    public void setFuncionesLlamadas(HashMap<String, HashMap<String, ArrayList<Integer>>> funcionesLlamadas)
    {
        this.funcionesLlamadas = funcionesLlamadas;
    }

    public Boolean existeEnProg(String nombre, Hashtable<String, ArrayList<String>> tablaLlamadas) //comprueba si el nombre esta en un array
    {
        boolean existe = false;
        ArrayList<String> nombreFunciones = new ArrayList<String>();
        Enumeration e = tablaLlamadas.keys();
        String key;
        while(e.hasMoreElements()) //añado los nombres de las funciones existentes en el programa
        {
            key = (String) e.nextElement();
            nombreFunciones.add(key.substring(0, key.indexOf("(")));
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

    public ClaseAuxiliar crearSubgrafo(HashMap<String, String> ultimosNodos, String funcion, String funcionInicial)
    {
        FileReader fr;
        BufferedReader br;
        String nombreFile;
        String dotSubgrafo = "";
        String line;
        String ultimoNodo = "0";
        dotSubgrafo = "subgraph " + funcion + "\n{\n";
        nombreFile = "grafo" + funcion + ".dot";
        try
        {
            fr = new FileReader(nombreFile);
            br = new BufferedReader(fr);
            line = br.readLine(); //ignora las 2 primeras lineas
            line = br.readLine();
            while((line = br.readLine()) != null)
            {
                if (!line.contains("}")) //ignora la ultima linea
                {
                    if (!funcion.equals(funcionInicial)) //si no es la funcion inicial
                    {
                        if (line.contains("style")) //quito el nodo inicio y fin (color rojo y azul)
                        {
                            dotSubgrafo += funcion + line.substring(0, line.indexOf("[")-1)  + "[label=\"\"];\n"; //nombre + linea
                            ultimoNodo = line.substring(0, line.indexOf("[")-1); //actualizo ultimo nodo para quedarme con el ultimo
                        }
                        else if (line.contains("[l")) //si es una linea de instanciar nodo
                        {
                            dotSubgrafo += funcion + line  + "\n"; //nombre + linea
                            ultimoNodo = line.substring(0, line.indexOf("[")-1); //actualizo ultimo nodo para quedarme con el ultimo
                        }
                        else //si es una linea de relacion
                        {
                            dotSubgrafo += funcion + line.substring(0, line.indexOf("-")+2) + funcion + line.substring(line.indexOf(">")+1, line.length()) + "\n"; //nombre + nodo-> + nombre + nodo (dir);
                        }
                    }
                    else
                    {
                        if (line.contains("[l")) //si es una linea de instanciar nodo
                        {
                            dotSubgrafo += funcion + line  + "\n"; //nombre + linea
                            ultimoNodo = line.substring(0, line.indexOf("[")-1); //actualizo ultimo nodo para quedarme con el ultimo
                        }
                        else //si es una linea de relacion
                        {
                            dotSubgrafo += funcion + line.substring(0, line.indexOf("-")+2) + funcion + line.substring(line.indexOf(">")+1, line.length()) + "\n"; //nombre + nodo-> + nombre + nodo (dir);
                        }
                    }
                }
            }
            ultimosNodos.put(funcion, ultimoNodo);
            fr.close();
        }
        catch (IOException io)
        {
            System.out.println("Error leyendo dot");
        }
        dotSubgrafo += "}\n"; 
        ClaseAuxiliar aux = new ClaseAuxiliar();
        aux.setDot(dotSubgrafo);
        aux.setUltimosNodos(ultimosNodos);
        return aux;   
    }

    public void crearGrafo(String funcionInicial) //funcionInicial = funcion elegida por el usuario como funcion inicial
    {
        String dot = "digraph Grafo\n{\n";
        Object[] funciones = funcionesLlamadas.keySet().toArray(); //nombres de las funciones existentes
        String dotSubgrafo;
        HashMap<String, String> ultimosNodos = new HashMap<String, String>();
        ArrayList<String> grafosCreados = new ArrayList<>();
        for (int i=0; i<funciones.length; i++) //creo los subgrafos
        {
            if (!grafosCreados.contains(funciones[i])) //solo se crean si no estan repetidos
            {
                grafosCreados.add((String) funciones[i]);
                ClaseAuxiliar aux = crearSubgrafo(ultimosNodos, (String) funciones[i], funcionInicial);
                dotSubgrafo = aux.getDot();
                ultimosNodos = aux.getUltimosNodos();
                dot += dotSubgrafo; //añado el subgrafo  
            }
            
            Object[] fLlamada = funcionesLlamadas.get(funciones[i]).keySet().toArray(); //cogo el nombre de las funciones llamadas
            for (int j=0; j<fLlamada.length; j++)
            {
                if (!grafosCreados.contains((String) fLlamada[j]))
                {
                    grafosCreados.add((String) fLlamada[j]);
                    ClaseAuxiliar aux = crearSubgrafo(ultimosNodos, (String) fLlamada[j], funcionInicial);
                    dotSubgrafo = aux.getDot();
                    ultimosNodos = aux.getUltimosNodos();
                    dot += dotSubgrafo; //añado el subgrafo  
                }
            }
        }
        //crear uniones
        HashMap<String, ArrayList<Integer>> nodosLlamados;
        //String funcion;
        Object[] nombresFuncionesLlamadas;
        ArrayList<Integer> nodos;
        String funcionLlamada;
        String relacionIda, relacionVuelta;
        Boolean recursividad = false;
        for (int i=0; i<funciones.length; i++) //recorro las funciones existentes en el programa
        {
            nodosLlamados = funcionesLlamadas.get(funciones[i]);
            nombresFuncionesLlamadas = nodosLlamados.keySet().toArray();
            for (int j=0; j<nombresFuncionesLlamadas.length; j++) //recorro las funciones llamadas
            {
                funcionLlamada = (String) nombresFuncionesLlamadas[j]; //funcion llamada
                nodos = nodosLlamados.get(nombresFuncionesLlamadas[j]); //nodos desde donde se llama
                if (funciones[i].equals(funcionLlamada)) //funcion = funcion llamada
                {
                    recursividad = true;
                }
                for (int k=0; k<nodos.size(); k++) //recorro los nodos donde se llama a las funciones
                {
                    if (recursividad)
                    {
                        dot += (String) funciones[i] + k + "->" + funciones[i] +ultimosNodos.get(funciones[i])  + "\n";
                    }
                    else
                    {
                        relacionIda = (String) funciones[i] + nodos.get(k) + "->" + funcionLlamada + "0;"; //desde el nodo k (nodo llamada) de la funcion hasta  el nodo 0 de la funcion llamada
                        relacionVuelta = funcionLlamada + ultimosNodos.get(funcionLlamada) + "->" + funciones[i] + nodos.get(k) + ";"; //desde el ultimo nodo de la funcion llamada hasta el nodo k (nodo llamada) de la funcion llamante
                        dot += relacionIda  + "\n";
                        dot += relacionVuelta  + "\n";
                    }
                }
            }
        }
        dot += "}";
        try
        {
            FileWriter filewriter = new FileWriter("grafoCompleto.dot"); //archivo donde se va a crear
            PrintWriter printw = new PrintWriter(filewriter);                
            Runtime.getRuntime().exec("dot -Tsvg grafoCompleto.dot -o grafoCompleto.svg");
            printw.println(dot);
            printw.close();
        } catch(IOException io)
        {
            System.out.println("Error al crear el grafo del programa completo");
        }
        System.out.println("GRAFO: \n" + dot);
    }
}
