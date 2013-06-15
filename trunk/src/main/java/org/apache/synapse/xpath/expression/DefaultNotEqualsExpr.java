package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 12:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultNotEqualsExpr extends DefaultEqualityExpr{
  public   DefaultNotEqualsExpr( Expr lhs, Expr rhs )
    {
        super( lhs, rhs );
    }

    public String getOperator()
    {
        return "!=";
    }

    public String toString()
    {
        return "[(DefaultNotEqualsExpr): " + getLHS() + ", " + getRHS() + "]";
    }

    protected boolean evaluateObjectObject( Object lhs, Object rhs )
    {
        if( eitherIsNumber( lhs, rhs ) )
        {


            Double left = (Double) lhs;
            Double right = (Double) rhs;

            return left.doubleValue() != right.doubleValue();

        }
        return !lhs.equals( rhs );
    }

}
