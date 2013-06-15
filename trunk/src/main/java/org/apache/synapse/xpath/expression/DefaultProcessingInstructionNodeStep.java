package org.apache.synapse.xpath.expression;

import org.apache.synapse.xpath.expression.axis.Axis;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/27/13
 * Time: 12:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultProcessingInstructionNodeStep extends DefaultStep  {
    private String name;

    public DefaultProcessingInstructionNodeStep(Axis axis,
                                                String name,
                                                PredicateSet predicateSet)
    {
        super( axis, predicateSet );

        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public String getText()
    {
        StringBuffer buf = new StringBuffer();
        buf.append(getAxisName());
        buf.append("::processing-instruction(");
        String name = getName();
        if (name != null && name.length() != 0)
        {
            buf.append("'");
            buf.append(name);
            buf.append("'");
        }
        buf.append(")");
        buf.append(super.getText());
        return buf.toString();
    }


}
