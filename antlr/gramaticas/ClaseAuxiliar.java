import java.util.*;

public class ClaseAuxiliar
{
    HashMap<String, String> ultimosNodos;
    String dot;
    public ClaseAuxiliar()
    {
        this.ultimosNodos = new HashMap<String, String>();
        this.dot = "";
    }

    public void setDot(String dot)
    {
        this.dot = dot;
    }
    
    public String getDot()
    {
        return this.dot;
    }

    public void setUltimosNodos(HashMap<String, String> ultimosNodos)
    {
        this.ultimosNodos = ultimosNodos;
    }

    public HashMap<String, String> getUltimosNodos()
    {
        return this.ultimosNodos;
    }


} 