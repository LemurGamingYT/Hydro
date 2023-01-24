package core.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HydroParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HydroVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HydroParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HydroParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HydroParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(HydroParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(HydroParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignments(HydroParser.AssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#funcassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncassignment(HydroParser.FuncassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#varassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarassignment(HydroParser.VarassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#clsassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClsassign(HydroParser.ClsassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(HydroParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#define_blocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_blocks(HydroParser.Define_blocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#getattribs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetattribs(HydroParser.GetattribsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#attrassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrassign(HydroParser.AttrassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(HydroParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#conditional_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_stmt(HydroParser.Conditional_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(HydroParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(HydroParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(HydroParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#conditional_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_block(HydroParser.Conditional_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(HydroParser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(HydroParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#type_conversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_conversion(HydroParser.Type_conversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(HydroParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HydroParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HydroParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(HydroParser.AtomContext ctx);
}