package org.apache.synapse.xpath.expression;

import java.io.Serializable;
import java.util.List;


public interface Predicated extends Serializable {





    void addPredicate(Predicate predicate);



    List getPredicates();



    PredicateSet getPredicateSet();


















}
