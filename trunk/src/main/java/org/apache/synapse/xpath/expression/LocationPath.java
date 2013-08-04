package org.apache.synapse.xpath.expression;

import java.util.List;


public interface LocationPath extends Expr{




    void addStep(Step step);


    List getSteps();


    boolean isAbsolute();









}
