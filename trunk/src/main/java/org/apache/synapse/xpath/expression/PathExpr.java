package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/9/13
 * Time: 2:28 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PathExpr extends Expr {


    Expr getFilterExpr();



    void setFilterExpr(Expr filterExpr);


    LocationPath getLocationPath();










}
