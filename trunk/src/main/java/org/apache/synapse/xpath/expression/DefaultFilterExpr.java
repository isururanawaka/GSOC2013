package org.apache.synapse.xpath.expression;

import java.util.ArrayList;
import java.util.List;


public class DefaultFilterExpr implements FilterExpr{
    private Expr expr;
    private PredicateSet predicates;

    public DefaultFilterExpr(PredicateSet predicateSet)
    {
        this.predicates = predicateSet;
    }

    public DefaultFilterExpr(Expr expr, PredicateSet predicateSet)
    {
        this.expr       = expr;
        this.predicates = predicateSet;
    }

    public void addPredicate(Predicate predicate)
    {
        this.predicates.addPredicate( predicate );
    }

    public List getPredicates()
    {
        return this.predicates.getPredicates();
    }

    public PredicateSet getPredicateSet()
    {
        return this.predicates;
    }

    public Expr getExpr()
    {
        return this.expr;
    }

    public String toString()
    {
        return "[(DefaultFilterExpr): expr: " + expr + " predicates: " + predicates + " ]";
    }

    public String getText()
    {
        String text = "";
        if ( this.expr != null )
        {
            text = this.expr.getText();
        }
        text += predicates.getText();
        return text;
    }



    /** Returns true if the current filter matches at least one of the context nodes
     */



}
