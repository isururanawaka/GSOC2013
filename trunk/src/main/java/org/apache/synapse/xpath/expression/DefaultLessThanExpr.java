package org.apache.synapse.xpath.expression;


public class DefaultLessThanExpr extends DefaultRelationalExpr{
    public DefaultLessThanExpr( Expr lhs, Expr rhs )
    {
        super( lhs, rhs );
    }

    public String getOperator()
    {
        return "<";
    }

    protected boolean evaluateDoubleDouble( Double lhs, Double rhs )
    {
        return lhs.doubleValue() < rhs.doubleValue();
    }
}
