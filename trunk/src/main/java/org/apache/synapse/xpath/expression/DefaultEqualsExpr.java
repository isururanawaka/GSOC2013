package org.apache.synapse.xpath.expression;


public class DefaultEqualsExpr extends DefaultEqualityExpr {
   public  DefaultEqualsExpr( Expr lhs, Expr rhs )
    {
        super( lhs, rhs );
    }

    public String getOperator()
    {
        return "=";
    }

    public String toString()
    {
        return "[(DefaultEqualsExpr): " + getLHS() + ", " + getRHS() + "]";
    }

    protected boolean evaluateObjectObject( Object lhs, Object rhs )
    {
        if( eitherIsNumber( lhs, rhs ) )
        {

            Double left = (Double) lhs;
            Double right = (Double) rhs;

            return left.doubleValue() == right.doubleValue();

        }
        return lhs.equals( rhs );
    }

}
