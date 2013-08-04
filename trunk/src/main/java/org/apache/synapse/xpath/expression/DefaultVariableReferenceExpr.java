package org.apache.synapse.xpath.expression;


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
