import java.util.*;

public class FuncionLlamada
{
    private HashMap<String, HashMap<String, ArrayList<Integer>>> funcionesLlamadas;

    public FuncionLlamada()
    {
        this.funcionesLlamadas =new HashMap<String, HashMap<String, ArrayList<Integer>>>();
    }

    private HashMap<String, ArrayList<Integer>> addNode(HashMap<String, ArrayList<Integer>> listaLlamadas,  String nombreLlamada, int numNode)
    {
        ArrayList<Integer> listaNodos = new ArrayList<Integer>();

        if(!listaLlamadas.containsKey(nombreLlamada))
        {
            listaNodos.add(numNode);
            listaLlamadas.put(nombreLlamada, listaNodos);
        }
        else
        {
            listaNodos = listaLlamadas.get(nombreLlamada);
            listaNodos.add(numNode);
            listaLlamadas.put(nombreLlamada, listaNodos);
        }
        return listaLlamadas;
    }

    public void addNodeFunction(String nombreFuncion, String nombreLlamada, int nodo)
    {
        System.out.println("LLAMADA: " + nombreFuncion + " " + nombreLlamada + " " + nodo);
        nombreFuncion = nombreFuncion.substring(9, nombreFuncion.indexOf("("));
        HashMap<String, ArrayList<Integer>> listaLlamadas = new HashMap<String, ArrayList<Integer>>();
        ArrayList<Integer> listaNodos = new ArrayList<Integer>();

        if(!funcionesLlamadas.containsKey(nombreFuncion)) 
        {
            listaNodos.add(nodo);
            listaLlamadas.put(nombreLlamada, listaNodos);
            funcionesLlamadas.put(nombreFuncion, listaLlamadas);
        }
        else
        {
            listaLlamadas = funcionesLlamadas.get(nombreFuncion); //Para cogerla
            listaLlamadas = addNode(listaLlamadas, nombreLlamada, nodo); //Tabla actualizada
            funcionesLlamadas.put(nombreFuncion, listaLlamadas);
        }
    }

    public HashMap<String, HashMap<String, ArrayList<Integer>>> getHash()
    {
        return this.funcionesLlamadas;
    }
}