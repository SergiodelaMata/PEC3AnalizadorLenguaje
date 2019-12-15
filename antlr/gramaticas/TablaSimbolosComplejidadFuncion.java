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
}
