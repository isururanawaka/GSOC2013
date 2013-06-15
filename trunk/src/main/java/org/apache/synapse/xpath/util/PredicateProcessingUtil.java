package org.apache.synapse.xpath.util;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 6/3/13
 * Time: 7:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class PredicateProcessingUtil {
    public static final int NUMBERLITERALPREDICATE=1;
    public static final int EQUALPREDICATE=2;
    public static final int NOTEQUALPREDICATE=3;
    public static final int NOPREDICATE=0;


    private int type;
    private double value;
    private  String lhs;
    private String rhs;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getLhs() {
        return lhs;
    }

    public void setLhs(String lhs) {
        this.lhs = lhs;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getRhs() {
        return rhs;
    }

    public void setRhs(String rhs) {
        this.rhs = rhs;
    }
}
