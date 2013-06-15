package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class DefaultLogicalExpr extends DefaultTruthExpr{
    DefaultLogicalExpr(Expr lhs,
                       Expr rhs)
    {
        super( lhs,
                rhs );


    }
}
