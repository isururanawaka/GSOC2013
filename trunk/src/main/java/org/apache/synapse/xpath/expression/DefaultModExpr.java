package org.apache.synapse.xpath.expression;


public class DefaultModExpr extends DefaultMultiplicativeExpr {
   public  DefaultModExpr( Expr lhs,
                    Expr rhs )
    {
        super( lhs,
                rhs );
    }

    public String getOperator()
    {
        return "mod";
    }
}
