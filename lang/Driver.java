package lang;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.HelloBaseListener;
import antlr.HelloLexer;
import antlr.HelloParser;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		String fileName = "input.txt";
		ArrayList<String> equations = new ArrayList<String>();
		equations = ReadFile.read(fileName);
		
		for (String s : equations) {
			ANTLRInputStream input = new ANTLRInputStream(s);
			
	        //Get lexer
			HelloLexer lexer = new HelloLexer(input);
			
			//Get a list of matched tokens
	        CommonTokenStream tokens = new CommonTokenStream(lexer);

	        //Pass the tokens to the parser
	        HelloParser parser = new HelloParser(tokens);
	        
	        parser.setBuildParseTree(true);
	        parser.addParseListener(new HelloBaseListener());
	        ParseTree tree = parser.s();
		}
	}

}
