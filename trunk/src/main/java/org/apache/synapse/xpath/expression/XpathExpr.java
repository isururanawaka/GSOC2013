package org.apache.synapse.xpath.expression;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/9/13
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
public interface XpathExpr extends Serializable {





    Expr getRootExpr();



    void setRootExpr(Expr rootExpr);


    String getText();


















}
