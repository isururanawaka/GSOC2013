package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 11:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultAndExpr extends DefaultLogicalExpr{
   public  DefaultAndExpr(Expr lhs,
                   Expr rhs)
    {
        super( lhs,
                rhs );
    }

    public String getOperator()
    {
        return "and";
    }

    public String toString()
    {
        return "[(DefaultAndExpr): " + getLHS() + ", " + getRHS() + "]";
    }


}
