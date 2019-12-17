import java.util.*;

public class FuncionLlamada
{
    private HashMap<String, HashMap<String, ArrayList<Integer>>> funcionesLlamadas;

    public FuncionLlamada()
    {
        this.funcionesLlamadas =new HashMap<String, HashMap<String, ArrayList<Integer>>>();
    }


    public void printTODO()
    {
        Object[] funcionesReales = funcionesLlamadas.keySet().toArray();
        HashMap<String, ArrayList<Integer>> llamadas;
        Object[] fLlamadas;
        ArrayList<Integer> nodos;
        for (int i=0; i<funcionesReales.length; i++)
        {
            System.out.println("FUNCION REAL: " + funcionesReales[i]);
            llamadas = funcionesLlamadas.get(funcionesReales[i]);
            fLlamadas = llamadas.keySet().toArray();
            for (int j=0; j<fLlamadas.length; j++)
            {
                System.out.println("FUNCION LLAMADA: " + fLlamadas[j]);
                nodos = llamadas.get(fLlamadas[j]);
                for (int k=0; k<nodos.size(); k++)
                {
                    System.out.println("NODO: " + nodos.get(k));
                }
            }
            
        }
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