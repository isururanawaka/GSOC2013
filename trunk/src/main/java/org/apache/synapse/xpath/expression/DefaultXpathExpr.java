package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/18/13
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
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
