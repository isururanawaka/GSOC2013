package org.apache.synapse.xpath.expression;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/13/13
 * Time: 7:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class PredicateSet implements Serializable {

    private static final long serialVersionUID = -7166491740228977853L;

    private List predicates;


    public PredicateSet()
    {
        this.predicates = Collections.EMPTY_LIST;
    }


    public void addPredicate(Predicate predicate)
    {
        if ( this.predicates == Collections.EMPTY_LIST )
        {
            this.predicates = new ArrayList();
        }

        this.predicates.add( predicate );
    }


    public List getPredicates()
    {
        return this.predicates;
    }





    public String getText()
    {
        StringBuffer buf = new StringBuffer();

        Iterator  predIter = this.predicates.iterator();
        Predicate eachPred = null;

        while ( predIter.hasNext() )
        {
            eachPred = (Predicate) predIter.next();
            buf.append( eachPred.getText() );
        }

        return buf.toString();
    }
}

