import java.util.ArrayList;
import java.io.*;

public class PagWeb
{
    public void createHtml()
    {  
        String html = "";
        html += "<!DOCTYPE html><head><title>Practica 3 Procesadores del Lenguaje</title></head><body>";
        //html += "<h1>Practica 3 Procesadores del Lenguaje</h1>";
        
        File file = File.getInstance();
        TablaSimbolos tablaSimbolos = file.getTablaSimbolos();
        
        int puntosFuncion = 0;
        int variablesDeclaradas = 0;
        int lineasEfectivas = 0;
        int numParametros = 0;
        int numLlamadas = 0;

        ArrayList<Funcion> funciones = new ArrayList<Funcion>();
        for (Funcion funcion : tablaSimbolos.getTable().values()) //recorre la tabla de simbolos
        {
            funciones.add(funcion);
        }
        for (int i=0; i<funciones.size(); i++)
        {
            html += "<h2>" + funciones.get(i).getName() + "</h2>";
            html += "<ul style=\"list-style-type:disc;\">";
            html += "<li>Complejidad ciclomática V(G): <strong>" + "FALTA EL VALOR" + "</strong></li>"; //añadir complejidad
            html += "<li>Puntos función: <strong>" + funciones.get(i).getFunctionPoints() + "</strong></li>";
            html += "<li>Resumen: <ul style=\"list-style-type:circle;\">";
            html += "<li>Variables declaradas: <strong>" + funciones.get(i).getNumDeclaraciones() + "</strong></li>";
            html += "<li>Líneas de código efectivas: <strong>" + funciones.get(i).getEfectiveLines() + "</strong></li>";
            html += "<li>Número de parámetros esperados: <strong>" + funciones.get(i).getNumParameters() + "</strong></li>";
            html += "<li>Número de llamadas a funciones: <strong>" + funciones.get(i).getNumFunctionCall() + "</strong></li>";
            html += "</ul></li>";
            html += "<li>Gráfico de complejidad ciclomática: " + "FALTA EL GRAFO (IMG)" + "</li>";//añadir grafo
            html += "</ul><hr>";
            //suma a los puntos de todo el programa
            puntosFuncion += funciones.get(i).getFunctionPoints();
            variablesDeclaradas += funciones.get(i).getNumDeclaraciones();
            lineasEfectivas += funciones.get(i).getEfectiveLines();
            numParametros += funciones.get(i).getNumParameters();
            numLlamadas += funciones.get(i).getNumFunctionCall();
        }
        html += "<h2>PUNTOS PROGRAMA COMPLETO</h2>";
        html += "<ul style='list-style-type:disc;'>";
        html += "<li>Complejidad ciclomática V(G): <strong>" + "FALTA EL VALOR" + "</strong></li>"; //añadir complejidad
        html += "<li>Puntos función: <strong>" + puntosFuncion + "</strong></li>";
        html += "<li>Resumen: <ul style='list-style-type:circle;'>";
        html += "<li>Variables declaradas: <strong>" + variablesDeclaradas + "</strong></li>";
        html += "<li>Líneas de código efectivas: <strong>" + lineasEfectivas + "</strong></li>";
        html += "<li>Número de parámetros esperados: <strong>" + numParametros + "</strong></li>";
        html += "<li>Número de llamadas a funciones: <strong>" + numLlamadas + "</strong></li>";
        html += "</ul></li>";
        html += "<li>Gráfico de complejidad ciclomática: " + "FALTA EL GRAFO (IMG)" + "</li>";//añadir grafo
        html += "</ul></body></html>";
        try
        {
            FileWriter filewriter = new FileWriter("PL3.html");//declarar el archivo
            PrintWriter printw = new PrintWriter(filewriter);//declarar un impresor
            printw.println(html);
            printw.close();
        } catch(IOException io)
        {
            System.out.println("Error al crear la pagina web");
        }
    }
}