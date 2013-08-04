package org.apache.synapse.xpath.expression.axis;


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
