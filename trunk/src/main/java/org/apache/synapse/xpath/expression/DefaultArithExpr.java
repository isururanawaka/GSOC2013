package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 11:45 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class DefaultArithExpr extends DefaultBinaryExpr{
    DefaultArithExpr(Expr lhs,
                     Expr rhs)
    {
        super( lhs,
                rhs );
    }

    public String toString()
    {
        return "[(DefaultArithExpr): " + getLHS() + ", " + getRHS() + "]";
    }
}
