package org.apache.synapse.xpath.expression;


public abstract class DefaultMultiplicativeExpr extends DefaultArithExpr{
    DefaultMultiplicativeExpr(Expr lhs,
                              Expr rhs)
    {
        super( lhs,
                rhs );
    }

    public String toString()
    {
        return "[(DefaultMultiplicativeExpr): " + getLHS() + ", " + getRHS() + "]";
    }
}
