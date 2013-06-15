package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultLiteralExpr implements LiteralExpr {
    private String literal;

  public   DefaultLiteralExpr(String literal)
    {
        this.literal = literal;
    }

    public String getLiteral()
    {
        return this.literal;
    }

    public String toString()
    {
        return "[(DefaultLiteralExpr): " + getLiteral() + "]";
    }

    public String getText()
    {

        if (literal.indexOf('"') == -1 ) {
            return "\"" + getLiteral() + "\"";
        }
        else { // Not possible for string literal to contain both " and '
            return "'" + getLiteral() + "'";
        }

    }

}
