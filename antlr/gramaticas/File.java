import java.util.*;
import java.io.Serializable;

public class File implements Serializable{
    private static File instance;
    TablaSimbolos symbolTable = new TablaSimbolos();

    public static File getInstance()
    {
        if(instance == null)
        {
            instance = new File();
        }
        return instance;
    }

    private File()
    {
        this.symbolTable = new TablaSimbolos();
    }

    public void printSymbolTable()
    {
        symbolTable.printHashMap();
    }

    public void addFunction(Funcion function) //Introduce a new function into the symbol table
    {
        symbolTable.addFunction(function);
    }

}
