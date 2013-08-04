package org.apache.synapse.xpath.expression;

import org.apache.synapse.xpath.expression.axis.Axis;


public class DefaultTextNodeStep extends DefaultStep {
    public DefaultTextNodeStep(Axis axis, PredicateSet predicateSet )
    {
        super( axis, predicateSet );
    }



    public String getText()
    {
        return getAxisName() + "::text()" + super.getText();
    }
}
