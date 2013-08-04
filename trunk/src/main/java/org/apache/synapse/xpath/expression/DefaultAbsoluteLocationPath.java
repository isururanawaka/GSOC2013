package org.apache.synapse.xpath.expression;

import java.util.Collections;
import java.util.List;


public class DefaultAbsoluteLocationPath extends DefaultLocationPath {


    public DefaultAbsoluteLocationPath()
    {

    }

    public String toString()
    {
        return "[(DefaultAbsoluteLocationPath): " + super.toString() + "]";
    }

    public boolean isAbsolute()
    {
        return true;
    }

    public String getText()
    {
        return "/" + super.getText();
    }




}
