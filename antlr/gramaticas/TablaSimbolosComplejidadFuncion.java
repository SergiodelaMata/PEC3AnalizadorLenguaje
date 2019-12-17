import java.util.*;
import java.util.ArrayList;

public class TablaSimbolosComplejidadFuncion
{
    private String completeFunctionName;
    private String functionName;
    private int numberParameters;
    private Hashtable<Integer, ArrayList<Integer>> symbolTable;
    private ArrayList<Integer> listNode;

    public TablaSimbolosComplejidadFuncion()
    {
        this.functionName = "";
        this.completeFunctionName = "";
        this.numberParameters = 0;
        this.symbolTable = new Hashtable<Integer, ArrayList<Integer>>();
        this.listNode = new ArrayList<Integer>();
    }

    public void addNode(int numNode, ArrayList<Integer> listNumNodes)
    {
        if(!symbolTable.containsKey(numNode))
        {
            symbolTable.put(numNode, listNumNodes);
        }
        else
        {
            ArrayList<Integer> listpos = symbolTable.get(numNode);
            for(int i = 0; i < listNumNodes.size();i++)
            {
                if(!listpos.contains(listNumNodes.get(i)))
                {
                    listpos.add(listNumNodes.get(i));
                }
            }
            symbolTable.put(numNode, listpos);
        }
    }

    public String getCompleteFunctionName()
    {
        return this.completeFunctionName;
    }

    public void setCompleteFunctionName(String name)
    {
        this.completeFunctionName = name;
    }

    public String getFunctionName()
    {
        return this.functionName;
    }

    public void setFunctionName(String name)
    {
        this.functionName = name;
    }

    public int getNumberParameters()
    {
        return this.numberParameters;
    }

    public void setNumberParameters(int numParameters)
    {
        this.numberParameters = numParameters;
    }

    public int size()
    {
        return symbolTable.size();
    }

    public ArrayList<Integer> get(int position)
    {
        return symbolTable.get(position);
    }

    public ArrayList<Integer> getListNode()
    {
      return this.listNode;
    }
    public void setListNode(ArrayList<Integer> listNode)
    {
      this.listNode = listNode;
    }

    //Se proporcionan el número de nodos que se han usado para la creación del grafo
    public int getNumNodosGrafo(){
        return listNode.size();
    }

    //Se proporciona el número de aristas entre los nodos del grafo a partir de las listas de valores guardadas como hijos de algún nodo del grafo
    public int getNumAristasGrafo(){
        int numeroAristas = 0;
        ArrayList<Integer> listaNodos;
        Enumeration enumeration = symbolTable.keys();
        while(enumeration.hasMoreElements())
        {
          listaNodos = symbolTable.get(enumeration.nextElement());
          numeroAristas += listaNodos.size();
        }
        return numeroAristas;
    }

    //Calculo de la complejidad ciclomática: Complejidad ciclomática = Aristas - Nodos + 2
    public int calcularComplejidadCiclomaticaFuncion(){

        int nodosGrafo = getNumNodosGrafo();
        int numeroAristas = getNumAristasGrafo();
        int complejidadCiclomatica = numeroAristas - nodosGrafo + 2;
        return complejidadCiclomatica;
    }

}
