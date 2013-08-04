package org.apache.synapse.xpath.expression;


public class DefaultDivExpr extends DefaultMultiplicativeExpr{
  public  DefaultDivExpr(Expr lhs,
                   Expr rhs)
    {
        super( lhs,
                rhs );
    }

    public String getOperator()
    {
        return "div";
    }


}
