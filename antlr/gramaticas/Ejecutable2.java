import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Ejecutable2{
    public static void main(String[] args) throws Exception {
        File file = File.getInstance();
        //TablaSimbolos tabla_simbolos = new TablaSimbolos();
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
        VisitorComplejidad complexVisitor = new VisitorComplejidad();
        VisitorLlamadas visitorLlamadas = new VisitorLlamadas();
        basicVisitor.visit(tree);
        System.out.println("Visitando árbol para puntos función");
        file.printSymbolTable();
        //tabla_simbolos.printHashMap();
        file.getTablaSimbolos().printHashMap();
        complexVisitor.visit(tree);
        System.out.println("Visitando árbol de complejidad");
        visitorLlamadas.visit(tree);
        System.out.println("Visitando el árbol de llamadas");
        file.getTablaLlamadas().printHashMap();
        System.out.println(file.getTablaLlamadas().createDot()); //quitar de aqui cuando lo hagamos bien
        PagWeb pag = new PagWeb();
        pag.createHtml();
        System.out.println("fin"); 
    }
}