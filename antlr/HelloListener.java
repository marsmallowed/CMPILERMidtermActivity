package antlr;
// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull HelloParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull HelloParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull HelloParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull HelloParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(@NotNull HelloParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(@NotNull HelloParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(@NotNull HelloParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(@NotNull HelloParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull HelloParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull HelloParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(@NotNull HelloParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(@NotNull HelloParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(@NotNull HelloParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(@NotNull HelloParser.Expr2Context ctx);
}