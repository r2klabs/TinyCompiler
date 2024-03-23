import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class extends the tinyBaseListener created by ANTLR4. The bulk of my compiler
 * is built into this class file.
 */

public class MyListener extends  tinyBaseListener{

    @Override
    public void enterAssign_stmt(tinyParser.Assign_stmtContext ctx) {
        // TODO Auto-generated method stub
        super.enterAssign_stmt(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub
        super.enterEveryRule(ctx);
        
        String className = ctx.getClass().getSimpleName();
        String ruleName = className.replace("Context", "");
        System.out.println("Rule name: "+ruleName);

        int numChildren = ctx.getChildCount();
        System.out.println("Number of Children is: "+numChildren);

        String child = ctx.getChild(0).getText();
        System.out.println(child +" ");
        
    }

    @Override
    public void enterExpr(tinyParser.ExprContext ctx) {
        // TODO Auto-generated method stub
        super.enterExpr(ctx);
        String child0 = ctx.getChild(0).getText();
        System.out.println("Expression Context: " + child0);

    }

    @Override
    public void enterExpr_list(tinyParser.Expr_listContext ctx) {
        // TODO Auto-generated method stub
        super.enterExpr_list(ctx);
    }

    @Override
    public void enterFactor(tinyParser.FactorContext ctx) {
        // TODO Auto-generated method stub
        super.enterFactor(ctx);
    }

    @Override
    public void enterId_list(tinyParser.Id_listContext ctx) {
        // TODO Auto-generated method stub
        super.enterId_list(ctx);
    }

    @Override
    public void enterIdent(tinyParser.IdentContext ctx) {
        // TODO Auto-generated method stub
        super.enterIdent(ctx);
    }

    @Override
    public void enterInteger(tinyParser.IntegerContext ctx) {
        // TODO Auto-generated method stub
        super.enterInteger(ctx);
    }

    @Override
    public void enterOp(tinyParser.OpContext ctx) {
        // TODO Auto-generated method stub
        super.enterOp(ctx);
    }

    @Override
    public void enterProgram(tinyParser.ProgramContext ctx) {
        // TODO Auto-generated method stub
        super.enterProgram(ctx);
    }

    @Override
    public void enterRead_stmt(tinyParser.Read_stmtContext ctx) {
        // TODO Auto-generated method stub
        super.enterRead_stmt(ctx);
    }

    @Override
    public void enterStmt(tinyParser.StmtContext ctx) {
        // TODO Auto-generated method stub
        super.enterStmt(ctx);
    }

    @Override
    public void enterStmt_list(tinyParser.Stmt_listContext ctx) {
        // TODO Auto-generated method stub
        super.enterStmt_list(ctx);
    }

    @Override
    public void enterWrite_stmt(tinyParser.Write_stmtContext ctx) {
        // TODO Auto-generated method stub
        super.enterWrite_stmt(ctx);
    }

    @Override
    public void exitAssign_stmt(tinyParser.Assign_stmtContext ctx) {
        // TODO Auto-generated method stub
        super.exitAssign_stmt(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub
        super.exitEveryRule(ctx);
    }

    @Override
    public void exitExpr(tinyParser.ExprContext ctx) {
        // TODO Auto-generated method stub
        super.exitExpr(ctx);
    }

    @Override
    public void exitExpr_list(tinyParser.Expr_listContext ctx) {
        // TODO Auto-generated method stub
        super.exitExpr_list(ctx);
    }

    @Override
    public void exitFactor(tinyParser.FactorContext ctx) {
        // TODO Auto-generated method stub
        super.exitFactor(ctx);
    }

    @Override
    public void exitId_list(tinyParser.Id_listContext ctx) {
        // TODO Auto-generated method stub
        super.exitId_list(ctx);
    }

    @Override
    public void exitIdent(tinyParser.IdentContext ctx) {
        // TODO Auto-generated method stub
        super.exitIdent(ctx);
    }

    @Override
    public void exitInteger(tinyParser.IntegerContext ctx) {
        // TODO Auto-generated method stub
        super.exitInteger(ctx);
    }

    @Override
    public void exitOp(tinyParser.OpContext ctx) {
        // TODO Auto-generated method stub
        super.exitOp(ctx);
    }

    @Override
    public void exitProgram(tinyParser.ProgramContext ctx) {
        // TODO Auto-generated method stub
        super.exitProgram(ctx);
    }

    @Override
    public void exitRead_stmt(tinyParser.Read_stmtContext ctx) {
        // TODO Auto-generated method stub
        super.exitRead_stmt(ctx);
    }

    @Override
    public void exitStmt(tinyParser.StmtContext ctx) {
        // TODO Auto-generated method stub
        super.exitStmt(ctx);
    }

    @Override
    public void exitStmt_list(tinyParser.Stmt_listContext ctx) {
        // TODO Auto-generated method stub
        super.exitStmt_list(ctx);
    }

    @Override
    public void exitWrite_stmt(tinyParser.Write_stmtContext ctx) {
        // TODO Auto-generated method stub
        super.exitWrite_stmt(ctx);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub
        super.visitErrorNode(node);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub
        super.visitTerminal(node);
    }


    


}//end MyListener

