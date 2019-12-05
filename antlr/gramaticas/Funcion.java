import java.util.*;

public class Funcion
{
    private String name;
    private int numParameters;
    private int numDeclaraciones;
    private int numFunctionCall;
    private int numSimpleOperators;
    private int numEfectiveLines;
    private int numFunctionPoints;

    public Funcion()
    {
        this.name = "";
        this.numParameters = 0;
        this.numDeclaraciones = 0;
        this.numFunctionCall = 0;
        this.numSimpleOperators = 0;
        this.numEfectiveLines = 0;
        this.numFunctionPoints = 0; //puntosTotales
    }
    
    public void addParameter(int points)
    {
        this.numParameters += points;
    }

    public void addDeclaration(int points)
    {
        this.numDeclaraciones += points;
    }

    public void addFunctionCall(int points)
    {
        this.numFunctionCall += points;
    }

    public void addSimpleOperator(int points)
    {
        this.numSimpleOperators += points;
    }

    public void addEfectiveLine(int points)
    {
        this.numEfectiveLines += points;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setFunctionPoints(int points)
    {
        this.numFunctionPoints = points;
    }

    public void printAttributes()
    {
        System.out.println("Nombre: " + this.name);
        System.out.println("Nº de parámetros: " + this.numParameters);
        System.out.println("Nº de declaraciones: " + this.numDeclaraciones);
        System.out.println("Nº de llamadas a función: " + this.numFunctionCall);
        System.out.println("Nº de operadores simples: " + this.numSimpleOperators);
        System.out.println("Nº points función: " + this.numFunctionPoints);
        System.out.println("Nº líneas efectivas: " + this.numEfectiveLines);
    }
}