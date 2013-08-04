package org.apache.synapse.xpath.expression;

import org.apache.synapse.xpath.expression.axis.Axis;


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
