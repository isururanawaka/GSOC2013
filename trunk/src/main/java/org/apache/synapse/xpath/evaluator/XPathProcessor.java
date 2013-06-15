package org.apache.synapse.xpath.evaluator;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.synapse.xpath.XMLReader.XMLEventRepresentation;
import org.apache.synapse.xpath.XMLReader.XMLReader;
import org.apache.synapse.xpath.compiler.XPathCompiler;
import org.apache.synapse.xpath.expression.*;
import org.apache.synapse.xpath.util.PredicateProcessingUtil;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 5/19/13
 * Time: 7:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class XPathProcessor {

    private XMLReader xmlReader;
    private boolean capturingOn = false;
    private int capturingOnXMlDepth = 0;


    public XPathProcessor() {
        xmlReader = XMLReader.getInstance();

    }


    public static void main(String[] args) {
        try {
            OMElement documentElement = new StAXOMBuilder("/home/isuru/Documents/streaming2/streaming-xpath/trunk/src/objectmodeltest/resources/reader.xml").getDocumentElement();
            XPathProcessor processor = new XPathProcessor();
         String   xpathquery = "/breakfast_menu/food[price!='$7.95']";
            processor.xpathProcess(documentElement,xpathquery);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


    public void xpathProcess(OMElement omElement,String xpathquery){

        xmlReader.setXmlStreamReader(omElement);
        XpathExpr expr = XPathCompiler.parse(xpathquery);
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) expr.getRootExpr();
        absoluteLocationPathProcess(locationPath);
    }


    public void absoluteLocationPathProcess(DefaultAbsoluteLocationPath defaultAbsoluteLocationPath) {
        List<Step> list = defaultAbsoluteLocationPath.getSteps();
        int numsteps = list.size();
        boolean matched = false;
        for (int i = 0; i < list.size(); i++) {
            try {
                matched = stepSelection(list.get(i), i, numsteps);
                //  System.out.println(matched);
                if (xmlReader.getXMLReadDepth() == list.size()) {
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
        boolean matched = false;
        if (step instanceof DefaultNameStep) {
            DefaultNameStep defaultNameStep = (DefaultNameStep) step;
            String localName = defaultNameStep.getLocalName();
            List list = defaultNameStep.getPredicates();
            if (list.size() > 0) {
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

    private boolean evaluate(Step step, int index, int numSteps, int predicateType, PredicateProcessingUtil predicateProcessingUtil) throws XMLStreamException {

        DefaultNameStep defaultNameStep = (DefaultNameStep) step;
        String localName = defaultNameStep.getLocalName();
        while (xmlReader.hasNextEvent()) {
            XMLEventRepresentation xmlEventRepresentation = xmlReader.getnextEvent();
            switch (xmlEventRepresentation.getType()) {
                case XMLStreamConstants.START_ELEMENT:
                    xmlReader.incrementstepCounter();
                    xmlReader.incrementDepth();
                    if (capturingOn && capturingOnXMlDepth == xmlReader.getXMLReadDepth()) {
                        OMElement omElement = ResultBuilder.sendToOutput();
                        System.out.println(omElement.toString());
                        capturingOn = false;
                    } else if (capturingOn && capturingOnXMlDepth < xmlReader.getXMLReadDepth()){
                        ResultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
                        if(xmlEventRepresentation.getLocalName().equals(predicateProcessingUtil.getLhs())){
                               String value = xmlEventRepresentation.getNameValue();
                               String formattedString = "'"+value+"'";
                             if(predicateType==PredicateProcessingUtil.EQUALPREDICATE){
                               if(!formattedString.equals(predicateProcessingUtil.getRhs())){
                                    ResultBuilder.reset();
                                   capturingOn=false;
                               }
                             }else if(predicateType == PredicateProcessingUtil.NOTEQUALPREDICATE){
                                 if(formattedString.equals(predicateProcessingUtil.getRhs())){
                                     ResultBuilder.reset();
                                     capturingOn=false;
                                 }
                             }
                        }

                    }
                    if (xmlReader.getStepCounter() == 1 && index == 0) {
                        if (localName.equals(xmlEventRepresentation.getLocalName())) {
                            //  System.out.println(localName);
                            return true;
                        } else {
                            return false;
                        }

                    } else if (xmlReader.getXMLReadDepth() == index + 1) {
                        if (localName.equals(xmlEventRepresentation.getLocalName())) {
                            if(predicateType==PredicateProcessingUtil.NOPREDICATE || predicateType==PredicateProcessingUtil.EQUALPREDICATE || predicateType==PredicateProcessingUtil.NOTEQUALPREDICATE){
                            if (numSteps == xmlReader.getXMLReadDepth()){
                                capturingOnXMlDepth = xmlReader.getXMLReadDepth();
                                capturingOn = true;
                                //   System.out.println(localName);
                                ResultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
                            }
                            }else if(predicateType==PredicateProcessingUtil.NUMBERLITERALPREDICATE){
                                xmlReader.incrementNumberLiteralCounter();
                                    if (xmlReader.getNumberLiteralCounter() == predicateProcessingUtil.getValue()) {
                                    if (numSteps == xmlReader.getXMLReadDepth()) {
                                        capturingOnXMlDepth = xmlReader.getXMLReadDepth();
                                        capturingOn = true;
                                        //System.out.println(localName);
                                        ResultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
                                    }

                                }
                            }
                            return true;
                        } else {

                            continue;
                        }


                    } else if (xmlReader.getXMLReadDepth() > index + 1) {
                        continue;
                    } else if (index > 0 && xmlReader.getXMLReadDepth() == index) {
                        return false;
                    }


                    break;
                case XMLStreamConstants.END_ELEMENT:
                    if (capturingOn && capturingOnXMlDepth == xmlReader.getXMLReadDepth()) {
                        OMElement omElement = ResultBuilder.sendToOutput();
                        System.out.println(omElement.toString());
                        capturingOn = false;
                    } else if (capturingOn && capturingOnXMlDepth < xmlReader.getXMLReadDepth()) {
                        ResultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
                    }
                    xmlReader.decrementDepth();
                    if (numSteps - xmlReader.getXMLReadDepth() == 2) {
                        xmlReader.resetNumberLiteralCounter();
                    }

                    break;


            }


        }
        return true;
    }


    private PredicateProcessingUtil predicateProcessing(List predicateList) {
        PredicateProcessingUtil predicateProcessingUtil = new PredicateProcessingUtil();
        DefaultPredicate defaultPredicate = (DefaultPredicate) predicateList.get(0);

        if (defaultPredicate.getExpr() instanceof DefaultUnaryExpr) {
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




}