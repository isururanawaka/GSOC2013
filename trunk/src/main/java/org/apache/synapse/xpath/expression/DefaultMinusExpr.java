package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 11:52 AM
 * To change this template use File | Settings | File Templates.
 */
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
