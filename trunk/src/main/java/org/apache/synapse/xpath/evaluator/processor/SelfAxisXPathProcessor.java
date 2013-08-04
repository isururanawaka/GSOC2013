package org.apache.synapse.xpath.evaluator.processor;


import org.apache.axiom.om.OMElement;
import org.apache.synapse.xpath.XMLReader.XMLEventRepresentation;
import org.apache.synapse.xpath.XMLReader.XMLReader;
import org.apache.synapse.xpath.evaluator.ResultBuilder;
import org.apache.synapse.xpath.evaluator.ResultCollector;
import org.apache.synapse.xpath.expression.DefaultAbsoluteLocationPath;
import org.apache.synapse.xpath.expression.DefaultNameStep;
import org.apache.synapse.xpath.expression.Step;
import org.apache.synapse.xpath.expression.XpathExpr;
import org.apache.synapse.xpath.util.PredicateProcessingUtil;
import org.apache.synapse.xpath.util.XPathProcessingConstants;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.util.List;

public class SelfAxisXPathProcessor extends ParentXPathProcessor implements XPathProcessor {
    private XMLReader xmlReader;
    private boolean capturingOn = false;
    private int capturingOnXMlDepth = 0;
    private String xpathQuery=null;
    private XpathExpr xpathExpr=null;
    private ResultBuilder resultBuilder =null;
    private ResultCollector resultCollector =null;
    private String checkingName=null;





    public SelfAxisXPathProcessor(XpathExpr xpathExpr, XMLReader xmlReader){
        super(xmlReader);
        this.xpathExpr = xpathExpr;
        this.xmlReader = xmlReader;
        resultBuilder = new ResultBuilder();
        resultCollector = new ResultCollector();
    }

    @Override
    public void xpathProcess(OMElement omElement) {
        xmlReader.setXMLStreamReader(omElement);
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) this.xpathExpr.getRootExpr();
        absoluteLocationPathProcess(locationPath);
    }

    public void xpathProcess(XMLStreamReader xmlStreamReader){
        xmlReader.setXMLStreamReader(xmlStreamReader);
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) this.xpathExpr.getRootExpr();
        absoluteLocationPathProcess(locationPath);
    }





    @Override
    public ResultCollector getResultCollector() {
        return resultCollector;
    }

    @Override
    public boolean evaluate(Step step, int index, int numSteps, int predicateType, PredicateProcessingUtil predicateProcessingUtil) throws XMLStreamException {

        DefaultNameStep defaultNameStep = (DefaultNameStep) step;
        String localName = defaultNameStep.getLocalName();
        if(numSteps ==((index+ XPathProcessingConstants.OFFSET_ONE)+XPathProcessingConstants.OFFSET_ONE)){
            checkingName = localName;
        }
       if(numSteps==(index+XPathProcessingConstants.OFFSET_ONE)){
           if(!(localName.equals(checkingName)||localName.equals(XPathProcessingConstants.ALL))){
               resultCollector.clearList();
               return false;
           }
           else{
               return true;
           }
       }

        while (xmlReader.hasNextEvent()){
            XMLEventRepresentation xmlEventRepresentation = xmlReader.getnextEvent();
            switch (xmlEventRepresentation.getType()) {
                case XMLStreamConstants.START_ELEMENT:
                    xmlReader.incrementstepCounter();
                    xmlReader.incrementDepth();
                    if (capturingOn && capturingOnXMlDepth == xmlReader.getXMLReadDepth()){
                        OMElement omElement = resultBuilder.sendToOutput();
                        resultCollector.addOMElement(omElement);
                        capturingOn = false;
                    }else if (capturingOn && capturingOnXMlDepth < xmlReader.getXMLReadDepth()) {
                        resultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
                        if (predicateType == PredicateProcessingUtil.EQUALPREDICATE || predicateType == PredicateProcessingUtil.NOTEQUALPREDICATE) {
                            if (xmlEventRepresentation.getLocalName().equals(predicateProcessingUtil.getLhs())) {
                                String value = xmlEventRepresentation.getNameValue();
                                String formattedString = "'" + value + "'";
                                if (predicateType == PredicateProcessingUtil.EQUALPREDICATE) {
                                    if (!formattedString.equals(predicateProcessingUtil.getRhs())) {
                                        resultBuilder.reset();
                                        capturingOn = false;
                                    }
                                } else if (predicateType == PredicateProcessingUtil.NOTEQUALPREDICATE) {
                                    if (formattedString.equals(predicateProcessingUtil.getRhs())) {
                                        resultBuilder.reset();
                                        capturingOn = false;
                                    }
                                }
                            }
                        }
                    }
                    if (xmlReader.getStepCounter() == XPathProcessingConstants.OFFSET_ONE && (index ==XPathProcessingConstants.COUNTER_ZERO)){
                        if (localName.equals(xmlEventRepresentation.getLocalName())) {
                            if (numSteps == XPathProcessingConstants.PARENT_EXIT_VALUE){  // ==1 make relative work
                                resultCollector.addOMElement(xmlReader.getOmElement());

                            }

                            return true;
                        } else {
                            return false;
                        }
                    } else if (xmlReader.getXMLReadDepth() == index + XPathProcessingConstants.OFFSET_ONE) {
                        if (localName.equals(xmlEventRepresentation.getLocalName())) {
                            if (predicateType == PredicateProcessingUtil.NOPREDICATE || predicateType == PredicateProcessingUtil.EQUALPREDICATE || predicateType == PredicateProcessingUtil.NOTEQUALPREDICATE) {
                                if ((numSteps-XPathProcessingConstants.OFFSET_ONE) == xmlReader.getXMLReadDepth()) {
                                    capturingOnXMlDepth = xmlReader.getXMLReadDepth();
                                    capturingOn = true;
                                    resultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
                                }
                            } else if (predicateType == PredicateProcessingUtil.NUMBERLITERALPREDICATE) {
                                xmlReader.incrementNumberLiteralCounter();
                                if (xmlReader.getNumberLiteralCounter() == predicateProcessingUtil.getValue()) {
                                    if ((numSteps-1) == xmlReader.getXMLReadDepth()) {
                                        capturingOnXMlDepth = xmlReader.getXMLReadDepth();
                                        capturingOn = true;
                                        resultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
                                    }
                                }
                            }
                            return true;
                        } else {

                            continue;
                        }
                    } else if (xmlReader.getXMLReadDepth() > index + XPathProcessingConstants.OFFSET_ONE) {
                        continue;
                    } else if (index > XPathProcessingConstants.COUNTER_ZERO && xmlReader.getXMLReadDepth() == index) {
                        return false;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    if (capturingOn && capturingOnXMlDepth == xmlReader.getXMLReadDepth()) {
                        OMElement omElement = resultBuilder.sendToOutput();
                        resultCollector.addOMElement(omElement);

                        capturingOn = false;
                    } else if (capturingOn && capturingOnXMlDepth < xmlReader.getXMLReadDepth()) {
                        resultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
                    }
                    xmlReader.decrementDepth();
                    if ((numSteps) - xmlReader.getXMLReadDepth() == XPathProcessingConstants.PARENT_EXIT_VALUE) {
                        xmlReader.resetNumberLiteralCounter();
                    }
                    break;
            }
        }
        return true;
    }

    public void stepMultiplexer(List<Step> stepList){
        int numsteps = stepList.size();
        boolean matched = false;
        for (int i = 0; i < stepList.size(); i++) {
            try {
                matched = stepSelection(stepList.get(i), i, numsteps);
                if (xmlReader.getXMLReadDepth() == (stepList.size()-XPathProcessingConstants.OFFSET_ONE)) {
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
}
