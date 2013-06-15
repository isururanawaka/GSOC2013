package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultGreaterThanExpr extends DefaultRelationalExpr {
  public  DefaultGreaterThanExpr( Expr lhs, Expr rhs )
    {
        super( lhs, rhs );
    }

    public String getOperator()
    {
        return ">";
    }

    protected boolean evaluateDoubleDouble( Double lhs, Double rhs )
    {
        return lhs.doubleValue() > rhs.doubleValue();
    }
}
