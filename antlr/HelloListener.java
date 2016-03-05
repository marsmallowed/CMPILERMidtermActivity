// Generated from Hello.g4 by ANTLR 4.4

	package antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull HelloParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull HelloParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivMod(@NotNull HelloParser.MultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivMod(@NotNull HelloParser.MultDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(@NotNull HelloParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(@NotNull HelloParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unit}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnit(@NotNull HelloParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unit}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnit(@NotNull HelloParser.UnitContext ctx);
}