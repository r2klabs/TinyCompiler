// Generated from tiny.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tinyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tinyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tinyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(tinyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(tinyParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(tinyParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(tinyParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyParser#read_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(tinyParser.Read_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(tinyParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(tinyParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(tinyParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(tinyParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(tinyParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(tinyParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(tinyParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link tinyParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(tinyParser.IdentContext ctx);
}