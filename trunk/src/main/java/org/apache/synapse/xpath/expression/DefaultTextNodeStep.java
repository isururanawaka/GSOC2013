package org.apache.synapse.xpath.expression;

import org.apache.synapse.xpath.expression.axis.Axis;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 12:12 PM
 * To change this template use File | Settings | File Templates.
 */
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
