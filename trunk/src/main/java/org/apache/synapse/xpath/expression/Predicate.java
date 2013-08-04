package org.apache.synapse.xpath.expression;

import java.io.Serializable;


public interface Predicate extends Serializable {



    Expr getExpr();


    void setExpr(Expr expr);




    String getText();






}
