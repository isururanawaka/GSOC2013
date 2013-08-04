package org.apache.synapse.xpath.expression;

import java.util.Iterator;
import java.util.List;


public abstract class DefaultEqualityExpr extends DefaultTruthExpr{
    DefaultEqualityExpr( Expr lhs, Expr rhs )
    {
        super( lhs, rhs );
    }

    public String toString()
    {
        return "[(DefaultEqualityExpr): " + getLHS() + ", " + getRHS() + "]";
    }








    protected abstract boolean evaluateObjectObject( Object lhs, Object rhs );
}
