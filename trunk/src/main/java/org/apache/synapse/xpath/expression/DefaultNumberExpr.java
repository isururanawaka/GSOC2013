package org.apache.synapse.xpath.expression;


public class DefaultNumberExpr implements NumberExpr {
    private Double number;

  public  DefaultNumberExpr( Double number )
    {
        this.number = number;
    }

    public Number getNumber()
    {
        return this.number;
    }

    public String toString()
    {
        return "[(DefaultNumberExpr): " + getNumber() + "]";
    }

    public String getText()
    {
        return getNumber().toString();
    }



}
