package org.apache.synapse.xpath.expression;

import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/18/13
 * Time: 5:58 PM
 * To change this template use File | Settings | File Templates.
 */
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
