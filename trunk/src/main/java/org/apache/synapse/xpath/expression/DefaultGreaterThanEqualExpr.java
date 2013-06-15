package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultGreaterThanEqualExpr extends DefaultRelationalExpr {

  public  DefaultGreaterThanEqualExpr( Expr lhs, Expr rhs )
    {
        super( lhs, rhs );
    }

    public String getOperator()
    {
        return ">=";
    }

    protected boolean evaluateDoubleDouble( Double lhs, Double rhs )
    {
        return lhs.compareTo( rhs ) >= 0;
    }
}
