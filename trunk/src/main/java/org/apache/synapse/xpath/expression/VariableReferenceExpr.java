package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/9/13
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
public interface VariableReferenceExpr extends Expr {






    public String getPrefix();


    public String getVariableName();






}
