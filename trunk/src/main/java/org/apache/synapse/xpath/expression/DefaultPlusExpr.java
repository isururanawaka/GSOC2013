package org.apache.synapse.xpath.expression;


public class DefaultPlusExpr extends DefaultAdditiveExpr{
   public DefaultPlusExpr(Expr lhs,
                    Expr rhs)
    {
        super( lhs,
                rhs );
    }

    public String getOperator()
    {
        return "+";
    }


}
