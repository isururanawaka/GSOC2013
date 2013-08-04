package org.apache.synapse.xpath.expression;


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
