package org.apache.synapse.xpath.expression;

import org.apache.synapse.xpath.expression.axis.Axis;
import org.apache.synapse.xpath.util.AxisUtil;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/18/13
 * Time: 6:26 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class DefaultStep implements Step{
    private Axis axis;
    private PredicateSet predicates;


    public DefaultStep(Axis axis, PredicateSet predicates)
    {
        this.axis = axis;
        this.predicates = predicates;
    }

    public void addPredicate(Predicate predicate)
    {
        this.predicates.addPredicate(predicate);
    }

    public List getPredicates()
    {
        return this.predicates.getPredicates();
    }

    public PredicateSet getPredicateSet()
    {
        return this.predicates;
    }

    public int getAxis()
    {
        //return this.axis.value();
        return 3;
    }

    public Axis getIterableAxis()
    {
        return this.axis;
    }

    public String getAxisName()
    {
        return AxisUtil.lookup(getAxis());
    }

    public String getText()
    {
        return this.predicates.getText();
    }

    public String toString()
    {
        return getIterableAxis() + " " + super.toString();
    }








}
