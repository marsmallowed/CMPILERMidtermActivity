package antlr;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CustomErrorListener extends BaseErrorListener
{
	//public static final CustomErrorListener INSTANCE = new CustomErrorListener();
	
	private List<String> items;
	
	public CustomErrorListener()
    {
        this.items = new ArrayList<String>();
    }
	
	public boolean hasErrors()
    {
        return this.items.size() > 0;
    }
	
	public String getError()
	{
		return this.items.toString();
	}
	
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
    {
    	if(msg.contains("token recognition error"))
    	{
    		items.add("@Lexical Error\n\t" + "[" + line + ":" + charPositionInLine + "] " + msg + "\n");
    	}
    	else
    	{
			items.add("@Syntax Error\n\t" + "[" + line + ":" + charPositionInLine + "] " + msg + "\n");
    	}
    }
}