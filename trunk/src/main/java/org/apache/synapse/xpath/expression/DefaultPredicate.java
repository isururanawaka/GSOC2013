package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 12:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultPredicate implements Predicate{
    private Expr expr;

    public DefaultPredicate(Expr expr)
    {
       this.expr =expr;
    }

    public Expr getExpr()
    {
        return this.expr;
    }

    public void setExpr(Expr expr)
    {
        this.expr = expr;
    }

    public String getText()
    {
        return "[" + getExpr().getText() + "]";
    }

    public String toString()
    {
        return "[(DefaultPredicate): " + getExpr() + "]";
    }


}
