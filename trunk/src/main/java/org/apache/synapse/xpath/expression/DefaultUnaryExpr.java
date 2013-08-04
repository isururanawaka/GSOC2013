package org.apache.synapse.xpath.expression;


public class DefaultUnaryExpr implements UnaryExpr{
    private Expr expr;

   public  DefaultUnaryExpr(Expr expr)
    {
        this.expr = expr;
    }

    public Expr getExpr()
    {
        return this.expr;
    }

    public String toString()
    {
        return "[(DefaultUnaryExpr): " + getExpr() + "]";
    }

    public String getText()
    {
        return "-(" + getExpr().getText() + ")";
    }


}
