import java.util.*;

public class UnionGrafos //NECESITO EL NODO DESDE EL QUE SE LLAMA!!!!!!
{
    private File file;
    //private TablaSimbolosComplejidad tablaComplejidad;
    private Hashtable<String, ArrayList<String>> tablaLlamadas;
    private HashMap<String, ArrayList<String>> llamadas;

    public UnionGrafos()
    {
        this.file = File.getInstance();
        //this.tablaComplejidad = file.getTablaSimbolosComplejidad();
        this.tablaLlamadas = file.getTablaLlamadas().getTabla();;
        this.llamadas = new HashMap<String, ArrayList<String>>();
    }

    public void getFuncionesReales()
    {
        //Object[] nombresFunciones = tablaComplejidad.keySet().toArray();
        ArrayList<String> nombreFunciones = new ArrayList<String>();
        String nombreFuncion = "";
        ArrayList<String> funcionesLlamadas; 
        Enumeration e = tablaLlamadas.keys();
        String key;
        while(e.hasMoreElements()) //añado los nombres de las funciones existentes en el programa
        {
            key = (String) e.nextElement();
            nombreFunciones.add(key.substring(9, key.indexOf("(")));
        }          
        Enumeration e2 = tablaLlamadas.keys();
        String key2;
        ArrayList<String> value;
        int counter = 0;
        while(e2.hasMoreElements()) //añado las llamadas de las funciones existentes en el programa
        {
            key2 = (String) e2.nextElement();
            value = tablaLlamadas.get(key2);
            funcionesLlamadas = new ArrayList<>();
            for (int i=0; i<value.size(); i++)
            {
                if (existe(nombreFunciones, value.get(counter))) //si a funcion existe realmente se añade a las llamadas
                {
                    funcionesLlamadas.add(value.get(i));
                }
            }
            counter++;
            llamadas.add(key2, funcionesLlamadas);
        }
    }

    public Boolean existe(ArrayList<String> nombreFunciones, String nombre) //comprueba si el nombre esta en un array
    {
        boolean existe = false;
        for (int i=0; i<nombreFunciones.size(); i++)
        {
            if (nombreFunciones.get(i).equals(nombre))
            {
                existe = true;
            }
        }
        return existe;
    }

/*
hacemos antes el visitorllamadas que el visitorcomplejidada y en e visitorComplejidad 
cada vez que haya una llamada si esta en la lista hace Union grafos*/

}