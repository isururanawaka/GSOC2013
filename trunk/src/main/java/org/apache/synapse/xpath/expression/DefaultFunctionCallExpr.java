package org.apache.synapse.xpath.expression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 11:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultFunctionCallExpr implements FunctionCallExpr {
    private String prefix;
    private String functionName;
    private List parameters;

    public DefaultFunctionCallExpr(String prefix, String functionName)
    {
        this.prefix = prefix;
        this.functionName = functionName;
        this.parameters = new ArrayList();
    }

    public void addParameter(Expr parameter)
    {
        this.parameters.add(parameter);
    }


    public List getParameters()
    {
        return this.parameters;
    }

    public String getPrefix()
    {
        return this.prefix;
    }

    public String getFunctionName()
    {
        return this.functionName;
    }


    public String getText()
    {
        StringBuffer buf = new StringBuffer();
        String prefix = getPrefix();

        if (prefix != null &&
                prefix.length() > 0)
        {
            buf.append(prefix);
            buf.append(":");
        }

        buf.append(getFunctionName());
        buf.append("(");

        Iterator paramIter = getParameters().iterator();

        while (paramIter.hasNext()) {
            Expr eachParam = (Expr) paramIter.next();

            buf.append(eachParam.getText());

            if (paramIter.hasNext())
            {
                buf.append(", ");
            }
        }

        buf.append(")");

        return buf.toString();
    }



    public String toString()
    {
        String prefix = getPrefix();

        if (prefix == null)
        {
            return "[(DefaultFunctionCallExpr): " + getFunctionName() + "(" + getParameters() + ") ]";
        }

        return "[(DefaultFunctionCallExpr): " + getPrefix() + ":" + getFunctionName() + "(" + getParameters() + ") ]";
    }




}
