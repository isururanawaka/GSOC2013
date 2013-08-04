package org.apache.synapse.xpath.expression;


public abstract class DefaultLogicalExpr extends DefaultTruthExpr{
    DefaultLogicalExpr(Expr lhs,
                       Expr rhs)
    {
        super( lhs,
                rhs );


    }
}
