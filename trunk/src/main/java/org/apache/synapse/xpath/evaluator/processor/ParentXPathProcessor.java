package org.apache.synapse.xpath.evaluator.processor;


import org.apache.synapse.xpath.XMLReader.XMLReader;
import org.apache.synapse.xpath.expression.*;

import org.apache.synapse.xpath.util.PredicateProcessingUtil;

import javax.xml.stream.XMLStreamException;
import java.util.List;



public abstract class ParentXPathProcessor{
    private XMLReader xmlReader =null;

    public void absoluteLocationPathProcess(DefaultAbsoluteLocationPath defaultAbsoluteLocationPath) {
        List<Step> list = defaultAbsoluteLocationPath.getSteps();

        stepMultiplexer(list);

    }

    public ParentXPathProcessor(XMLReader xmlReader){
          this.xmlReader =xmlReader;
    }

    public void stepMultiplexer(List<Step> stepList){
        int numsteps = stepList.size();
        boolean matched = false;
        for (int i = 0; i < stepList.size(); i++) {
            try {
                matched = stepSelection(stepList.get(i), i, numsteps);
                if (xmlReader.getXMLReadDepth() == (stepList.size())) {
                    i = 0;
                }
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
            if (!matched) {
                System.out.println("not matched");
                break;
            }
        }
    }

    public boolean stepSelection(Step step, int index, int numSteps) throws XMLStreamException {
        if (step instanceof DefaultNameStep){
            DefaultNameStep defaultNameStep = (DefaultNameStep) step;
            List list = defaultNameStep.getPredicates();
            if (list.size() > 0){
                PredicateProcessingUtil predicateProcessingUtil = predicateProcessing(list);
                if (predicateProcessingUtil.getType() == PredicateProcessingUtil.NUMBERLITERALPREDICATE){
                    return evaluate(defaultNameStep, index, numSteps, PredicateProcessingUtil.NUMBERLITERALPREDICATE, predicateProcessingUtil);
                } else if(predicateProcessingUtil.getType()==PredicateProcessingUtil.EQUALPREDICATE){
                    return evaluate(defaultNameStep,index,numSteps,PredicateProcessingUtil.EQUALPREDICATE,predicateProcessingUtil);
                }else if(predicateProcessingUtil.getType()==PredicateProcessingUtil.NOTEQUALPREDICATE){
                    return evaluate(defaultNameStep,index,numSteps,PredicateProcessingUtil.NOTEQUALPREDICATE,predicateProcessingUtil);
                }
            } else if (list.size() == 0) {
                return evaluate(defaultNameStep, index, numSteps, PredicateProcessingUtil.NOPREDICATE, null);
            }
        } else if (step instanceof DefaultAllNodeStep) {

        } else if (step instanceof DefaultTextNodeStep) {

        } else if (step instanceof DefaultProcessingInstructionNodeStep) {

        } else if (step instanceof DefaultCommentNodeStep) {
        }
        return true;
    }

    public PredicateProcessingUtil predicateProcessing(List predicateList) {
        PredicateProcessingUtil predicateProcessingUtil = new PredicateProcessingUtil();
        DefaultPredicate defaultPredicate = (DefaultPredicate) predicateList.get(0);

        if (defaultPredicate.getExpr() instanceof DefaultUnaryExpr){
            DefaultUnaryExpr defaultUnaryExpr = (DefaultUnaryExpr) defaultPredicate.getExpr();
            if (defaultUnaryExpr.getExpr() instanceof DefaultPathExpr) {
                DefaultPathExpr defaultPathExpr = (DefaultPathExpr) defaultUnaryExpr.getExpr();
                if (defaultPathExpr.getFilterExpr() instanceof DefaultFilterExpr) {
                    DefaultFilterExpr defaultFilterExpr = (DefaultFilterExpr) defaultPathExpr.getFilterExpr();
                    if (defaultFilterExpr.getExpr() instanceof DefaultNumberExpr) {
                        DefaultNumberExpr defaultNumberExpr = (DefaultNumberExpr) defaultFilterExpr.getExpr();
                        Number number = defaultNumberExpr.getNumber();
                        predicateProcessingUtil.setType(PredicateProcessingUtil.NUMBERLITERALPREDICATE);
                        predicateProcessingUtil.setValue(number.intValue());
                    }
                }
            }
        } else if(defaultPredicate.getExpr() instanceof DefaultEqualsExpr){
            DefaultEqualsExpr defaultEqualsExpr =  (DefaultEqualsExpr)defaultPredicate.getExpr();
            Expr leftExpr = defaultEqualsExpr.getLHS();
            Expr rightExpr = defaultEqualsExpr.getRHS();
            predicateProcessingUtil.setType(PredicateProcessingUtil.EQUALPREDICATE);
            if(leftExpr instanceof DefaultUnaryExpr){
                DefaultUnaryExpr defaultUnaryExpr= (DefaultUnaryExpr)leftExpr;
                if(defaultUnaryExpr.getExpr() instanceof DefaultPathExpr){
                    DefaultPathExpr defaultPathExpr = (DefaultPathExpr)defaultUnaryExpr.getExpr();
                    if(defaultPathExpr.getLocationPath() instanceof DefaultRelativeLocationPath){
                        DefaultRelativeLocationPath defaultRelativeLocationPath = (DefaultRelativeLocationPath)defaultPathExpr.getLocationPath();
                        List list = defaultRelativeLocationPath.getSteps();
                        if(list.size()==1){
                            DefaultNameStep step= (DefaultNameStep)list.get(0);
                            predicateProcessingUtil.setLhs(step.getLocalName());
                        }
                    }
                }
            }if (rightExpr instanceof DefaultUnaryExpr) {
                DefaultUnaryExpr defaultUnaryExpr = (DefaultUnaryExpr) rightExpr;
                if (defaultUnaryExpr.getExpr() instanceof DefaultPathExpr) {
                    DefaultPathExpr defaultPathExpr = (DefaultPathExpr) defaultUnaryExpr.getExpr();
                    if (defaultPathExpr.getFilterExpr() instanceof DefaultFilterExpr) {
                        DefaultFilterExpr defaultFilterExpr = (DefaultFilterExpr) defaultPathExpr.getFilterExpr();
                        if (defaultFilterExpr.getExpr() instanceof DefaultLiteralExpr) {
                            DefaultLiteralExpr defaultLiteralExpr = (DefaultLiteralExpr) defaultFilterExpr.getExpr();
                            String value = defaultLiteralExpr.getLiteral();
                            predicateProcessingUtil.setRhs(value);
                        }
                    }
                }




            }
        }
        else if(defaultPredicate.getExpr() instanceof DefaultNotEqualsExpr){
            DefaultNotEqualsExpr defaultNotEqualsExpr =  (DefaultNotEqualsExpr)defaultPredicate.getExpr();
            Expr leftExpr = defaultNotEqualsExpr.getLHS();
            Expr rightExpr = defaultNotEqualsExpr.getRHS();
            predicateProcessingUtil.setType(PredicateProcessingUtil.NOTEQUALPREDICATE);
            if(leftExpr instanceof DefaultUnaryExpr){
                DefaultUnaryExpr defaultUnaryExpr= (DefaultUnaryExpr)leftExpr;
                if(defaultUnaryExpr.getExpr() instanceof DefaultPathExpr){
                    DefaultPathExpr defaultPathExpr = (DefaultPathExpr)defaultUnaryExpr.getExpr();
                    if(defaultPathExpr.getLocationPath() instanceof DefaultRelativeLocationPath){
                        DefaultRelativeLocationPath defaultRelativeLocationPath = (DefaultRelativeLocationPath)defaultPathExpr.getLocationPath();
                        List list = defaultRelativeLocationPath.getSteps();
                        if(list.size()==1){
                            DefaultNameStep step= (DefaultNameStep)list.get(0);
                            predicateProcessingUtil.setLhs(step.getLocalName());
                        }
                    }
                }
            }if (rightExpr instanceof DefaultUnaryExpr) {
                DefaultUnaryExpr defaultUnaryExpr = (DefaultUnaryExpr) rightExpr;
                if (defaultUnaryExpr.getExpr() instanceof DefaultPathExpr) {
                    DefaultPathExpr defaultPathExpr = (DefaultPathExpr) defaultUnaryExpr.getExpr();
                    if (defaultPathExpr.getFilterExpr() instanceof DefaultFilterExpr) {
                        DefaultFilterExpr defaultFilterExpr = (DefaultFilterExpr) defaultPathExpr.getFilterExpr();
                        if (defaultFilterExpr.getExpr() instanceof DefaultLiteralExpr) {
                            DefaultLiteralExpr defaultLiteralExpr = (DefaultLiteralExpr) defaultFilterExpr.getExpr();
                            String value = defaultLiteralExpr.getLiteral();
                            predicateProcessingUtil.setRhs(value);
                        }
                    }
                }




            }
        }

        return predicateProcessingUtil;
    }
   public abstract  boolean evaluate(Step step, int index, int numSteps, int predicateType, PredicateProcessingUtil predicateProcessingUtil) throws XMLStreamException;

}
