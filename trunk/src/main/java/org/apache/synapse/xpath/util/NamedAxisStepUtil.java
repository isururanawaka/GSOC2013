package org.apache.synapse.xpath.util;

import org.apache.synapse.xpath.expression.axis.Axis;

import javax.xml.namespace.QName;

/**
 * Created by IntelliJ IDEA.
 * User: isuru
 * Date: 5/5/13
 * Time: 7:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class NamedAxisStepUtil {

    private String value;
    private Axis axis;
    private QName qname;

    public Axis getAxis() {
        return axis;
    }

    public QName getQname() {
        return qname;
    }

    public void setQname(QName qname) {
        this.qname = qname;
    }

    public void setAxis(Axis axis) {
        this.axis = axis;

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
