package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 12:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultVariableReferenceExpr implements VariableReferenceExpr{
    private String prefix;
    private String localName;

  public  DefaultVariableReferenceExpr(String prefix,
                                 String variableName)
    {
        this.prefix       = prefix;
        this.localName = variableName;
    }

    public String getPrefix()
    {
        return this.prefix;
    }

    public String getVariableName()
    {
        return this.localName;
    }

    public String toString()
    {
        return "[(DefaultVariableReferenceExpr): " + getQName() + "]";
    }

    private String getQName() {
        if ( "".equals(prefix) )
        {
            return localName;
        }
        return prefix + ":" + localName;
    }

    public String getText()
    {
        return "$" + getQName();
    }



}
