package org.apache.synapse.xpath.expression;


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
