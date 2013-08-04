package org.apache.synapse.xpath.expression;

import org.apache.synapse.xpath.expression.axis.Axis;


public class DefaultCommentNodeStep extends DefaultStep{

    public DefaultCommentNodeStep(Axis axis, PredicateSet predicateSet)
    {
        super( axis, predicateSet );
    }

    public String toString()
    {
        return "[(DefaultCommentNodeStep): " + getAxis() + "]";
    }

    public String getText()
    {
        return getAxisName() + "::comment()";
    }



}
