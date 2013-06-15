package org.apache.synapse.xpath.expression;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 12:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultPathExpr implements PathExpr{
    private Expr filterExpr;
    private LocationPath locationPath;

   public  DefaultPathExpr(Expr filterExpr,
                    LocationPath locationPath){
        this.filterExpr = filterExpr;
        this.locationPath = locationPath;
    }

    public Expr getFilterExpr() {
        return this.filterExpr;
    }


    public void setFilterExpr(Expr filterExpr) {
        this.filterExpr = filterExpr;
    }


    public LocationPath getLocationPath() {
        return this.locationPath;
    }


    public String toString() {
        if (getLocationPath() != null) {
            return "[(DefaultPathExpr): " + getFilterExpr() + ", " + getLocationPath() + "]";
        }

        return "[(DefaultPathExpr): " + getFilterExpr() + "]";
    }


    public String getText() {
        StringBuffer buf = new StringBuffer();

        if (getFilterExpr() != null) {
            buf.append(getFilterExpr().getText());
        }

        if (getLocationPath() != null) {
            if (!getLocationPath().getSteps().isEmpty()) buf.append("/");
            buf.append(getLocationPath().getText());
        }

        return buf.toString();
    }





}
