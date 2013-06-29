package org.apache.synapse.xpath.expression.axis;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/9/13
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChildAxis extends Axis{
    private boolean notAxisSpecifier=false;
    /**
     * Constructor.
     *
     * @param axisValue
     *
     */
    public ChildAxis(int axisValue) {
        super(axisValue);
    }
    public ChildAxis(int axisValue,boolean axisSepcifier) {
        this(axisValue);
        this.notAxisSpecifier=axisSepcifier;
    }

    public boolean isNotAxisSpecifier(){
        return  notAxisSpecifier;
    }
}
