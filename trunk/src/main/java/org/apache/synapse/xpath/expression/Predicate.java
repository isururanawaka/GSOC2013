package org.apache.synapse.xpath.expression;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/9/13
 * Time: 2:29 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Predicate extends Serializable {



    Expr getExpr();


    void setExpr(Expr expr);




    String getText();






}
