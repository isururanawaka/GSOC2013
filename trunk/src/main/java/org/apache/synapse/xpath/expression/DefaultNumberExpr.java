package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 12:07 PM
 * To change this template use File | Settings | File Templates.
 */
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
