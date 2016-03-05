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
	private String errorMessage;
	
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
			System.out.println(errorMessage);
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
		stack.push(Integer.parseInt(ctx.getText()));
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
		Integer op1 = stack.pop();
	    Integer op2 = stack.pop();
	    if (op1 == 0)
	    	errorMessage = "Error: '" + ctx.getText() + "' is invalid because 0 cannot be a divider.";
	    else {
	    	if (ctx.getChild(1).getText().equals("/"))
		    {
		      stack.push(op2 / op1);
		    }
		    else if(ctx.getChild(1).getText().equals("*"))
		    {
		      stack.push(op2 * op1);
		    }
		    else
		    {
		    	stack.push(op2 % op1);
		    }
	    }
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
		Integer op1 = stack.pop();
	    Integer op2 = stack.pop();
	    if (ctx.getChild(1).getText().equals("-"))
	    {
	      stack.push(op2 - op1);
	    }
	    else
	    {
	      stack.push(op1 + op2);
	    }
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
		stack.push(Integer.parseInt(ctx.getText()));
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