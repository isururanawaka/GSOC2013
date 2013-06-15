package org.apache.synapse.xpath.expression;

import org.apache.synapse.xpath.expression.axis.Axis;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/18/13
 * Time: 6:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultAllNodeStep extends DefaultStep {

    public DefaultAllNodeStep(Axis axis, PredicateSet predicateSet)
    {
        super( axis, predicateSet );
    }

    public String toString()
    {
        return "[(DefaultAllNodeStep): " + getAxisName() + "]";
    }

    public String getText()
    {
        return getAxisName() + "::node()" + super.getText();
    }




}
