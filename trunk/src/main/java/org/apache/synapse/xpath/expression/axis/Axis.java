package org.apache.synapse.xpath.expression.axis;


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
