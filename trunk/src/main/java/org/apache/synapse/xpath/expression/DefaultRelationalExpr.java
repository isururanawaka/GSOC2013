package org.apache.synapse.xpath.expression;

import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 12:11 PM
 * To change this template use File | Settings | File Templates.
 */
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

