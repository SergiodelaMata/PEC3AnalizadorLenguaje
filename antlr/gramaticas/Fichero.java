import java.util.*;
import java.io.Serializable;

public class Fichero implements Serializable{
    private static Fichero instance;
    private List<String> tramosrama;

    //Nombres de los campos
    //List<String> nombreCampos;

    //Dato temporal a estudiar
    private ArrayList<String> datosActuales;

    public static Fichero getInstance()
    {
        if(instance == null)
        {
            instance = new Fichero();
        }
        return instance;
    }

    public Fichero()
    {
        this.tramosrama = new ArrayList<String>();
        this.datosActuales = new ArrayList<String>();
    }

    public void introducirDatoActual(String datoActual)
    {
        ArrayList<String> elementosFichero = new ArrayList<String>();
        elementosFichero.addAll(tramosrama);
        this.datosActuales.add(datoActual);
        elementosFichero.add(generarString(datosActuales));
        tramosrama = elementosFichero;
    }

    private String generarString(ArrayList<String> elementosActuales)
    {
        String elementosconcatenados = "";
        for(String elemento: elementosActuales)
        {
            elementosconcatenados += "/" + elemento;
        }
        System.out.println(elementosconcatenados);
        return elementosconcatenados;
    }

    public String getUltimoElementoIncluido()
    {
        String ultimoDatoIntroducido = "";
        if(datosActuales.size() != 0)
        {
            ultimoDatoIntroducido = datosActuales.get(datosActuales.size()-1);
        }
        return ultimoDatoIntroducido;
    }

    public void eliminarUltimoElementoIncluido()
    {
        if(datosActuales.size() != 0)
        {
            datosActuales.remove(datosActuales.size()-1);
        }
        
    }

    public List<String> getTramosrama() {
        return tramosrama;
    }

    public void setTramosrama(List<String> tramosrama) {
        this.tramosrama = tramosrama;
    }

    

}