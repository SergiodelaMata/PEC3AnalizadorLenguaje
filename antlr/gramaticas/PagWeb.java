import java.util.ArrayList;
import java.io.*;

public class PagWeb
{
    private String nombreHtml;

    public PagWeb(String nombreHtml)
    {
        this.nombreHtml = nombreHtml + ".html";
    }

    public void createHtml()
    {
        String html = "";
        html += "<!DOCTYPE html><head><title>Practica 3 Procesadores del Lenguaje</title></head><body>";

        File file = File.getInstance();
        TablaSimbolos tablaSimbolos = file.getTablaSimbolos();
        TablaSimbolosComplejidad tablaSimbolosComplejidad = file.getTablaSimbolosComplejidad();

        long puntosFuncion = 0;
        long variablesDeclaradas = 0;
        long lineasEfectivas = 0;
        long numParametros = 0;
        long numLlamadas = 0;
        long complejidad = tablaSimbolosComplejidad.complejidadTodasFunciones();

        ArrayList<Funcion> funciones = new ArrayList<Funcion>();
        for (Funcion funcion : tablaSimbolos.getTable().values()) //recorre la tabla de simbolos
        {
            funcion.setComplejidad(tablaSimbolosComplejidad.getComplejidadFuncion(funcion.getNameWithoutReturnType()));
            funciones.add(funcion);
        }
        for (int i=0; i<funciones.size(); i++)
        {
            html += "<h2>" + funciones.get(i).getName() + "</h2>";
            html += "<ul style=\"list-style-type:disc;\">";
            html += "<li>Complejidad ciclomática V(G): <strong>" + funciones.get(i).getComplejidad() + "</strong></li>";
            html += "<li>Puntos función: <strong>" + funciones.get(i).getFunctionPoints() + "</strong></li>";
            html += "<li>Resumen: <ul style=\"list-style-type:circle;\">";
            html += "<li>Variables declaradas: <strong>" + funciones.get(i).getNumDeclaraciones() + "</strong></li>";
            html += "<li>Líneas de código efectivas: <strong>" + funciones.get(i).getEfectiveLines() + "</strong></li>";
            html += "<li>Número de parámetros esperados: <strong>" + funciones.get(i).getNumParameters() + "</strong></li>";
            html += "<li>Número de llamadas a funciones: <strong>" + funciones.get(i).getNumFunctionCall() + "</strong></li>";
            html += "</ul></li>";
            html += "<li>Grafo de llamadas a funciones: " + "<p align=\"center\"><img src=\"grafo" + funciones.get(i).getName().substring(9, funciones.get(i).getName().indexOf("(")) + ".svg\"><p>" + "</li>";
            html += "</ul><hr>";
            //suma a los puntos de todo el programa
            puntosFuncion += funciones.get(i).getFunctionPoints();
            variablesDeclaradas += funciones.get(i).getNumDeclaraciones();
            lineasEfectivas += funciones.get(i).getEfectiveLines();
            numParametros += funciones.get(i).getNumParameters();
            numLlamadas += funciones.get(i).getNumFunctionCall();
            complejidad += funciones.get(i).getComplejidad();

        }
        html += "<h2>PUNTOS PROGRAMA COMPLETO</h2>";
        html += "<ul style='list-style-type:disc;'>";
        html += "<li>Complejidad ciclomática V(G): <strong>" + complejidad + "</strong></li>"; 
        html += "<li>Puntos función: <strong>" + puntosFuncion + "</strong></li>";
        html += "<li>Resumen: <ul style='list-style-type:circle;'>";
        html += "<li>Variables declaradas: <strong>" + variablesDeclaradas + "</strong></li>";
        html += "<li>Líneas de código efectivas: <strong>" + lineasEfectivas + "</strong></li>";
        html += "<li>Número de parámetros esperados: <strong>" + numParametros + "</strong></li>";
        html += "<li>Número de llamadas a funciones: <strong>" + numLlamadas + "</strong></li>";
        html += "</ul></li>";
        html += "<li>Grafo de complejidad ciclomática: <p align=\"center\"><img src=\"grafoCompleto.svg\"><p></li>";
        html += "<li>Grafo de llamadas a funciones: <p align=\"center\"><img src=\"grafoLlamadas.svg\"><p></li>";


        html += "</ul></body></html>";
        try
        {
            FileWriter filewriter = new FileWriter(nombreHtml); //archivo donde se va a crear
            PrintWriter printw = new PrintWriter(filewriter);
            printw.println(html);
            printw.close();
        } catch(IOException io)
        {
            System.out.println("Error al crear la pagina web");
        }
    }
}
