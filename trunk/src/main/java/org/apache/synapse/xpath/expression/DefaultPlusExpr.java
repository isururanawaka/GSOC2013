package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 12:09 PM
 * To change this template use File | Settings | File Templates.
 */
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
