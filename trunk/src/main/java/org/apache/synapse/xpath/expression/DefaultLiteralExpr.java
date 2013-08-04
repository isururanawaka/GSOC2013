package org.apache.synapse.xpath.expression;


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
