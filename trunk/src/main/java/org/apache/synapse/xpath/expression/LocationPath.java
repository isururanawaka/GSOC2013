package org.apache.synapse.xpath.expression;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/9/13
 * Time: 2:26 PM
 * To change this template use File | Settings | File Templates.
 */
public interface LocationPath extends Expr{




    void addStep(Step step);


    List getSteps();


    boolean isAbsolute();









}
