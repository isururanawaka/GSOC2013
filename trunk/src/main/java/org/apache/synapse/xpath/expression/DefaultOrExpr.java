package org.apache.synapse.xpath.expression;


public class DefaultOrExpr extends DefaultLogicalExpr{
   public  DefaultOrExpr(Expr lhs,
                  Expr rhs)
    {
        super( lhs,
                rhs );
    }

    public String getOperator()
    {
        return "or";
    }

    public String toString()
    {
        return "[(DefaultOrExpr): " + getLHS() + ", " + getRHS() + "]";
    }


}
