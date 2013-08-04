package org.apache.synapse.xpath.expression;


public class DefaultMultiplyExpr extends DefaultMultiplicativeExpr{
   public  DefaultMultiplyExpr( Expr lhs,
                         Expr rhs )
    {
        super( lhs,
                rhs );
    }

    public String getOperator()
    {
        return "*";
    }

}
