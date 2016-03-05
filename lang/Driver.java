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
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		String fileName = "input.txt";
		ArrayList<String> equations = new ArrayList<String>();
		equations = ReadFile.read(fileName);
		
		for (String s : equations) {
			ANTLRInputStream input = new ANTLRInputStream(s);

	        HelloLexer lexer = new HelloLexer(input);

	        CommonTokenStream tokens = new CommonTokenStream(lexer);

	        HelloParser parser = new HelloParser(tokens);
	        parser.setBuildParseTree(true);
	        HelloBaseListener solve = new HelloBaseListener(); 
	        parser.addParseListener(solve);
	        ParseTree tree = parser.s();
	        output.add(solve.stack.pop());
		}
		
		System.out.println("ANSWERS:");
		for (Integer i : output) {
			System.out.println(i);
		}
	}

}
