package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
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
