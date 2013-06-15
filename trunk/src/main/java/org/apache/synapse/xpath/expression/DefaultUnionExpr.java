package org.apache.synapse.xpath.expression;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 12:14 PM
 * To change this template use File | Settings | File Templates.
 */
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
