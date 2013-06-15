package org.apache.synapse.xpath.expression;

import org.apache.synapse.xpath.util.AxisUtil;
import org.apache.synapse.xpath.util.AxisUtil;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/18/13
 * Time: 5:55 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class DefaultLocationPath implements LocationPath {
    private List steps;

    /**
     * Create a new empty location path.
     */
  public  DefaultLocationPath()
    {
        this.steps = new LinkedList();
    }

    public void addStep(Step step)
    {
        getSteps().add(step);
    }

    public List getSteps()
    {
        return this.steps;
    }



    public String getText()
    {
        StringBuffer buf = new StringBuffer();
        Iterator stepIter = getSteps().iterator();
        while (stepIter.hasNext())
        {
            buf.append(((Step) stepIter.next()).getText());
            if (stepIter.hasNext())
            {
                buf.append("/");
            }
        }
        return buf.toString();
    }

    public String toString()
    {
        StringBuffer buf = new StringBuffer();
        Iterator stepIter = getSteps().iterator();
        while (stepIter.hasNext())
        {
            buf.append(stepIter.next().toString());
            if (stepIter.hasNext())
            {
                buf.append("/");
            }
        }
        return buf.toString();
    }

    public boolean isAbsolute()
    {
        return false;
    }



    private boolean isReverseAxis(Step step) {

        int axis = step.getAxis();
        return axis == AxisUtil.PRECEDING
                || axis == AxisUtil.PRECEDING_SIBLING
                || axis == AxisUtil.ANCESTOR
                || axis == AxisUtil.ANCESTOR_OR_SELF;
    }






}
