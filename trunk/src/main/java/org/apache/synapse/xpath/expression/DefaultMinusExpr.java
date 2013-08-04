package org.apache.synapse.xpath.expression;


public class DefaultMinusExpr extends DefaultAdditiveExpr{
  public  DefaultMinusExpr(Expr lhs,
                     Expr rhs)
    {
        super( lhs,
                rhs );
    }

    public String getOperator()
    {
        return "-";
    }
}
