import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Ejecutable2{
    public static void main(String[] args) throws Exception {
        String inputFile = "Pl2-fibonacci.prog";
        File file = File.getInstance();

        //ObjectOutputStream oos;
        InputStream is = System.in;
        if(inputFile!=null)
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
        System.out.println("Visitado árbol");
        file.printSymbolTable();
        //ListenerBasico LB = new ListenerBasico();
        //ParseTreeWalker walker = new ParseTreeWalker();
        //walker.walk(LB, tree);

/*        try{
            PrintWriter outputStream = new PrintWriter("prueba.txt");
            List<String> informacionArchivo = fichero.getTramosrama();
            for(int i = 0; i < informacionArchivo.size(); i++)
            {
                outputStream.println(informacionArchivo.get(i));
            }
            outputStream.flush();
            outputStream.close();
        }
        catch(IOException e){
        }*/
    }
}
