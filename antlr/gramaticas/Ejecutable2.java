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
        String nombreFunPrin = ""; //nombre()
        String nombreHtml = "";


        if(args.length == 3)
        {
            inputFile = args[0];
            nombreFunPrin = args[1];
            nombreHtml = args[2];
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

            visitorLlamadas.visit(tree);
            System.out.println("Visitando el árbol de llamadas");
            file.getTablaLlamadas().crearGrafo(nombreFunPrin);

            complexVisitor.visit(tree);
            System.out.println("Visitando árbol de complejidad");
            file.getTablaSimbolosComplejidad().printHashMap();

            //file.getUnionGrafos().setLlamadasReales(file.getTablaLlamadas().getTabla());
            file.getUnionGrafos().setFuncionesLlamadas(file.getFuncionLlamada().getHash());
            file.getUnionGrafos().crearGrafo(nombreFunPrin);
            file.getUnionGrafos().printTODO();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            file.getFuncionLlamada().printTODO();

            PagWeb pag = new PagWeb(nombreHtml);
            pag.createHtml();
            System.out.println("fin");
        }
        else
        {
            System.out.println("Error al introducir el comando de ejecucion");
        }
    }
}
