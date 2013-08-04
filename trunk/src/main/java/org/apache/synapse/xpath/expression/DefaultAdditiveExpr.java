package org.apache.synapse.xpath.expression;


public abstract  class DefaultAdditiveExpr implements BinaryExpr {


    private Expr lhs;
    private Expr rhs;

  public  DefaultAdditiveExpr(Expr lhs, Expr rhs)
    {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public Expr getLHS()
    {
        return this.lhs;
    }

    public Expr getRHS()
    {
        return this.rhs;
    }

    public void setLHS(Expr lhs)
    {
        this.lhs = lhs;
    }

    public void setRHS(Expr rhs)
    {
        this.rhs = rhs;
    }

    public abstract String getOperator();

    public String getText()
    {
        return "(" + getLHS().getText() + " " + getOperator() + " " + getRHS().getText() +")";
    }



    public String toString()
    {
        return "[(" + getClass().getName() + "): " + getLHS() + ", " + getRHS() + "]";
    }








}
