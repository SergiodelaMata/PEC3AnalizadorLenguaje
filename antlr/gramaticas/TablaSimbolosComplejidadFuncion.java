import java.util.*;
import java.util.ArrayList;

public class TablaSimbolosComplejidadFuncion
{
    private String functionName;
    private Hashtable<Integer, ArrayList<Integer>> symbolTable;
    private ArrayList<Integer> listNode;

    public TablaSimbolosComplejidadFuncion()
    {
        this.functionName = "";
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

    public void printSymbolTable()
    {
      for(int i = 0; i < symbolTable.size(); i++)
      {

      }
    }

    public String getFunctionName()
    {
        return this.functionName;
    }

    public void setFunctionName(String name)
    {
        this.functionName = name;
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

    //Se cogen las claves del hashtable y se suman
    public int getNumNodosGrafo(){
        
        int nodosGrafo = 0;
        nodosGrafo = size(); //El tamaño del hashmap (claves), es equivalente al número de nodos 
        return nodosGrafo;   //Si no, habría que recorrerlo cogiendo cada clave (contar claves)
    }

    //Se cogen las claves del hashtable, se suman, y luego se suman los valores de cada clave
    public int getNumAristasGrafo(){
        
        int numeroAristas = 0;
        ArrayList<Integer> arrayAux;

        Enumeration<ArrayList<Integer>> valoresHashtable = symbolTable.elements();
        while (valoresHashtable.hasMoreElements()) {
            arrayAux = valoresHashtable.nextElement(); //Es muy posible que de error, o no salga el resultado correto
            for (int i=0; i<arrayAux.size(); i++){
                numeroAristas = numeroAristas + i;
            }            
        }

        return numeroAristas;
    }

    //Simplemente usamos la fórmula para el cálculo de la complejidad ciclomática: Complejidad ciclomática = Aristas - Nodos + 2
    public int calcularComplejidadCiclomaticaFuncion(){
        
        int nodosGrafo = 0;
        int numeroAristas = 0;
        int complejidadCiclomatica = 0;
        nodosGrafo = getNumNodosGrafo();        
        numeroAristas = getNumAristasGrafo();
        complejidadCiclomatica = numeroAristas - nodosGrafo + 2;

        return complejidadCiclomatica;
    }

}

