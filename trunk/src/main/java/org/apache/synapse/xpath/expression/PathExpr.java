package org.apache.synapse.xpath.expression;


public interface PathExpr extends Expr {


    Expr getFilterExpr();



    void setFilterExpr(Expr filterExpr);


    LocationPath getLocationPath();










}
