// Generated from Hello.g4 by ANTLR 4.4

	package antlr;


import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.HelloParser;

/**
 * This class provides an empty implementation of {@link HelloListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class HelloBaseListener implements HelloListener {
	
	public Stack<Integer> stack = new Stack<Integer>();
	private String errorMessage = "Error: ";
	
	@Override public void enterNegaExpr(@NotNull HelloParser.NegaExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNegaExpr(@NotNull HelloParser.NegaExprContext ctx) 
	{ 
		Integer op1 = stack.pop();
		stack.push(-1 * op1);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	
	@Override public void enterS(@NotNull HelloParser.SContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitS(@NotNull HelloParser.SContext ctx) 
	{
		Integer ans;
		if (!stack.isEmpty()) {
			ans = stack.pop();
			System.out.println(ans);
		}
		else {
			System.out.print(errorMessage);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParenExpr(@NotNull HelloParser.ParenExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParenExpr(@NotNull HelloParser.ParenExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNegaUnit(@NotNull HelloParser.NegaUnitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNegaUnit(@NotNull HelloParser.NegaUnitContext ctx) 
	{
		int i;
		try {
	        i = Integer.parseInt(ctx.getText());
	        stack.push(i);
	    } catch (NumberFormatException e) {
	        errorMessage += "Integer out of range\n";
	    }
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMultDivMod(@NotNull HelloParser.MultDivModContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMultDivMod(@NotNull HelloParser.MultDivModContext ctx) 
	{
		Integer op1;
	    Integer op2;

	    if (!stack.isEmpty() && stack.size() >= 2) 
	    {
	    	op1 = stack.pop();
	    	op2 = stack.pop();
	    	long a = op2;
	    	long b = op1;
	    	long c;
	    	
		    if (ctx.getChild(1).getText().equals("/"))
			{
		    	if(op1 == 0)
			    {
		    		errorMessage += "Invalid Operation\n";
			    }
		    	else
		    	{
		    		c = a / b;
		    		if(c > Integer.MAX_VALUE || c < Integer.MIN_VALUE)
			    	{
			    		errorMessage += "Integer out of range\n";
			    	 }
			    	 else
			    	 {
			    		 stack.push(op2 / op1);
			    	 }
		    	}
			}
			else if(ctx.getChild(1).getText().equals("*"))
			{
				c = a * b;
	    		if(c > Integer.MAX_VALUE || c < Integer.MIN_VALUE)
		    	{
		    		errorMessage += "Integer out of range\n";
		    	 }
		    	 else
		    	 {
		    		 stack.push(op2 * op1);
		    	 }
			}
			else
			{
				if(op1 == 0)
			    {
	    		errorMessage += "Invalid Operation\n";
			    }
				else
				{
					c = a % b;
		    		if(c > Integer.MAX_VALUE || c < Integer.MIN_VALUE)
			    	{
			    		errorMessage += "Integer out of range\n";
			    	 }
			    	 else
			    	 {
			    		 stack.push(op2 % op1);
			    	 }		
				}
			}
		}
	    else if(stack.size() == 1)
	    	stack.pop();

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAddSub(@NotNull HelloParser.AddSubContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAddSub(@NotNull HelloParser.AddSubContext ctx) 
	{
		Integer op1;
	    Integer op2;

	    if (!stack.isEmpty() && stack.size() >= 2) 
	    {
	    	op1 = stack.pop();
	    	op2 = stack.pop();
	    	long a = op2;
	    	long b = op1;
	    	long c;
	    	
		    if (ctx.getChild(1).getText().equals("-"))
		    {
		    	c = a - b;
		    	if(c > Integer.MAX_VALUE || c < Integer.MIN_VALUE)
		    	{
		    		errorMessage += "Integer out of range\n";
		    	 }
		    	 else
		    	 {
		    		 stack.push(op2 - op1);
		    	 }
		    }
		    else
		    {
		    	 c = a + b;
		    	 if (c > Integer.MAX_VALUE  || c < Integer.MIN_VALUE)
		    	 {
		    		 errorMessage += "Integer out of range\n";
		    	 }
		    	 else
		    	 {
		    		 stack.push(op2 + op1);
		    	 }
		    }
	    }
	    else if(stack.size() == 1)
	    	stack.pop();

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnit(@NotNull HelloParser.UnitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnit(@NotNull HelloParser.UnitContext ctx) 
	{
		int i;
		try {
	        i = Integer.parseInt(ctx.getText());
	        stack.push(i);
	    } catch (NumberFormatException e) {
	        errorMessage += "Integer out of range\n";
	    }
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }
}