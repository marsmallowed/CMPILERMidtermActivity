package lang;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.RecognitionException;

import antlr.CustomErrorListener;
import antlr.HelloBaseListener;
import antlr.HelloLexer;
import antlr.HelloParser;

public class Driver
{
	public static void main(String[] args) throws IOException
	{
		String fileName = "input.txt";
		ArrayList<String> equations = new ArrayList<String>();
		equations = ReadFile.read(fileName);
		int i = 1;
		
		for (String s : equations) {
			System.out.print(i + ": ");
			i++;
			
			ANTLRInputStream input = new ANTLRInputStream(s);
			
	        //Get lexer
			HelloLexer lexer = new HelloLexer(input);
			
			//Remove the default error listener
			lexer.removeErrorListeners();
			//Add custom error listener below
			lexer.addErrorListener(CustomErrorListener.INSTANCE);
			
			//Get a list of matched tokens
	        CommonTokenStream tokens = new CommonTokenStream(lexer);

	        //Pass the tokens to the parser
	        HelloParser parser = new HelloParser(tokens);
	        
	        parser.removeErrorListeners();
			parser.addErrorListener(CustomErrorListener.INSTANCE);
	        
	        parser.setBuildParseTree(true);
	        parser.addParseListener(new HelloBaseListener());
	        ParseTree tree = parser.s();
		}
	}
}
