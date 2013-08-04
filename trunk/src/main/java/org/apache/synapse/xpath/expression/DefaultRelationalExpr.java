package org.apache.synapse.xpath.expression;

import java.util.Iterator;
import java.util.List;


public abstract class DefaultRelationalExpr extends DefaultTruthExpr{
    DefaultRelationalExpr( Expr lhs, Expr rhs )
    {
        super( lhs, rhs );
    }

    public String toString()
    {
        return "[(DefaultRelationalExpr): " + getLHS() + ", " + getRHS() + "]";
    }





    protected abstract boolean evaluateDoubleDouble( Double lhs, Double rhs );
}

