import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Ejecutable2{
    public static void main(String[] args) throws Exception {
        File file = File.getInstance();
        TablaSimbolos tabla_simbolos = new TablaSimbolos();
        int total_puntos;
        String inputFile = null;
        
        
        if(args.length > 0){
            inputFile=args[0];
        }
        
        InputStream is = System.in;

        if(inputFile != null)
        {
            is = new FileInputStream(inputFile);
        }

        CharStream input = CharStreams.fromStream(is);
        Pl2compilerLexer lexer = new Pl2compilerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Pl2compilerParser parser = new Pl2compilerParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.prog();

        VisitorBasico basicVisitor = new VisitorBasico();
        basicVisitor.visit(tree);
        System.out.println("Visitando árbol");
        file.printSymbolTable();
        tabla_simbolos.printHashMap();
        System.out.println("FIN");        
    }
}
