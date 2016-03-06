package lang;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
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
		
		for (String s : equations) {
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
	        parser.s();
		}
	}
}
