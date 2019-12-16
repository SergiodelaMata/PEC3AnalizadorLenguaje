
import java.util.*;

public class Funcion
{
    private String name;
    private long numParameters;
    private long numDeclaraciones;
    private long numFunctionCall;
    private long numSimpleOperators;
    private long numEfectiveLines;
    private long numFunctionPoints; //puntosTotales
    private long complejidad;

    public Funcion()
    {
        this.name = "";
        this.numParameters = 0;
        this.numDeclaraciones = 0;
        this.numFunctionCall = 0;
        this.numSimpleOperators = 0;
        this.numEfectiveLines = 0;
        this.numFunctionPoints = 0; //puntosTotales
        this.complejidad = 0;
    }

    public void addParameter(long points)
    {
        this.numParameters += points;
    }

    public void addDeclaration(long points)
    {
        this.numDeclaraciones += points;
    }

    public void addFunctionCall(long points)
    {
        this.numFunctionCall += points;
    }

    public void addSimpleOperator(long points)
    {
        this.numSimpleOperators += points;
    }

    public void addEfectiveLine(long points)
    {
        this.numEfectiveLines += points;
    }

    public void removeEfectiveLine(long points)
    {
        this.numEfectiveLines -= points;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void concatenateName(String name)
    {
      this.name += name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setFunctionPoints(long points)
    {
        this.numFunctionPoints = points;
    }

    public long getFunctionPoints()
    {
      return this.numFunctionPoints;
    }

    public long getNumDeclaraciones()
    {
        return this.numDeclaraciones;
    }

    public long getEfectiveLines()
    {
        return this.numEfectiveLines;
    }

    public long getNumParameters()
    {
        return this.numParameters;
    }

    public long getNumFunctionCall()
    {
        return this.numFunctionCall;
    }

    public long getComplejidad()
    {
        return this.complejidad;
    }

    public void setComplejidad(long complejidad_nueva)
    {
        this.complejidad = complejidad_nueva;
    }

    public void printAttributes()
    {
        System.out.println("Nombre: " + this.name);
        System.out.println("Nº de parámetros: " + this.numParameters);
        System.out.println("Nº de declaraciones: " + this.numDeclaraciones);
        System.out.println("Nº de llamadas a función: " + this.numFunctionCall);
        System.out.println("Nº de operadores simples: " + this.numSimpleOperators);
        System.out.println("Nº puntos función: " + this.numFunctionPoints);
        System.out.println("Nº líneas efectivas: " + this.numEfectiveLines);
        System.out.println("Nombre: " + this.complejidad);
    }
}


