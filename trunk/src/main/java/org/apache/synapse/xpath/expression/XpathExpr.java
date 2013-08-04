package org.apache.synapse.xpath.expression;

import java.io.Serializable;
import java.util.List;


public interface XpathExpr extends Serializable {





    Expr getRootExpr();



    void setRootExpr(Expr rootExpr);


    String getText();


















}
