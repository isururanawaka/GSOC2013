package org.apache.synapse.xpath.expression;

import org.apache.synapse.xpath.expression.axis.Axis;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
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
