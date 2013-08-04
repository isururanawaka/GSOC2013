package org.apache.synapse.xpath.expression;

import java.util.*;


public class DefaultUnionExpr extends DefaultBinaryExpr {
    public DefaultUnionExpr(Expr lhs,
                            Expr rhs)
    {
        super( lhs,
                rhs );
    }

    public String getOperator()
    {
        return "|";
    }

    public String toString()
    {
        return "[(DefaultUnionExpr): " + getLHS() + ", " + getRHS() + "]";
    }


}
