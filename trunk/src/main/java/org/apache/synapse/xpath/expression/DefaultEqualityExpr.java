package org.apache.synapse.xpath.expression;

import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 11:47 AM
 * To change this template use File | Settings | File Templates.
 */
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
