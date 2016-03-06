package antlr;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CustomErrorListener extends BaseErrorListener
{
	public static final CustomErrorListener INSTANCE = new CustomErrorListener();
	
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
    {
    	if(msg.contains("token recognition error"))
    	{
    		System.out.printf("@Lexical Error\n\t" + "[" + line + ":" + charPositionInLine + "] " + msg + "\n");
    	}
    	else
    	{
    		System.out.printf("@Syntax Error\n\t" + "[" + line + ":" + charPositionInLine + "] " + msg + "\n");
    	}
    }
}