package org.apache.synapse.xpath.expression;


public class DefaultXpathExpr implements XpathExpr {
    private Expr rootExpr;

    public DefaultXpathExpr(Expr rootExpr)
    {
        this.rootExpr = rootExpr;
    }

    public Expr getRootExpr()
    {
        return this.rootExpr;
    }

    public void setRootExpr(Expr rootExpr)
    {
        this.rootExpr = rootExpr;
    }

    public String toString()
    {
        return "[(DefaultXPath): " + getRootExpr() + "]";
    }

    public String getText()
    {
        return getRootExpr().getText();
    }
}
