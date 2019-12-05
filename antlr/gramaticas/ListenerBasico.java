import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class ListenerBasico extends Pl2compilerParserBaseListener
{
    Fichero fichero = Fichero.getInstance();

	@Override public void enterEveryRule(ParserRuleContext ctx)
	{
		fichero.introducirDatoActual(Pl2compilerParser.ruleNames[ctx.getRuleIndex()]);
		System.out.println();
	}
	@Override public void exitEveryRule(ParserRuleContext ctx) 
	{ 
		fichero.eliminarUltimoElementoIncluido();
	}
	
	@Override public void visitTerminal(TerminalNode node)
	{
		
		fichero.introducirDatoActual(fichero.getUltimoElementoIncluido() + ": " + node.getText());
		fichero.eliminarUltimoElementoIncluido();
		System.out.println();
	}
}