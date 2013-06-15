package org.apache.synapse.xpath.expression.axis;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/9/13
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Axis {
    private int value;

    /**
     * Constructor.
     *
     * @param axisValue
     */
    public Axis(int axisValue) {
        this.value = axisValue;
    }

    /**
     * Gets the axis value.
     *
     * @return the axis value
     */
    public int value() {
        return this.value;
    }

}
