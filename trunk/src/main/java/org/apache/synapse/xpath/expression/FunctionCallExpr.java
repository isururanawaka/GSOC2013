package org.apache.synapse.xpath.expression;

import java.util.List;


public interface FunctionCallExpr extends Expr{


    public String getPrefix();


    public String getFunctionName();


    public void addParameter(Expr parameter);


    public List getParameters();




}
