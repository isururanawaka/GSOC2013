package org.apache.synapse.xpath.expression;


public interface BinaryExpr extends  Expr {



    /**
     * Returns the left-hand side of the binary expression.
     *
     * @return the left hand side expression
     */
    Expr getLHS();


    /**
     * Returns the right-hand side of the binary expression.
     *
     * @return the right-hand side expression
     */
    Expr getRHS();

    /**
     * Returns the operator for the binary expression such as "+" or
     * "div".
     *
     * @return the operator for the expression
     */
    String getOperator();











}
