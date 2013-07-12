package org.apache.synapse.xpath.evaluator.processor;

import org.apache.axiom.om.OMElement;
import org.apache.synapse.xpath.XMLReader.XMLEventRepresentation;
import org.apache.synapse.xpath.XMLReader.XMLReader;
import org.apache.synapse.xpath.evaluator.ResultBuilder;
import org.apache.synapse.xpath.evaluator.ResultCollector;
import org.apache.synapse.xpath.expression.*;
import org.apache.synapse.xpath.util.PredicateProcessingUtil;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;


public class DefaultXPathProcessor extends ParentXPathProcessor implements XPathProcessor {

    private XMLReader xmlReader;
    private boolean capturingOn = false;
    private int capturingOnXMlDepth = 0;
    private XpathExpr xpathExpr = null;
    private ResultBuilder resultBuilder = null;
    private ResultCollector resultCollector = null;

    public DefaultXPathProcessor(XpathExpr xpathExpr, XMLReader xmlReader) {
        super(xmlReader);
        this.xpathExpr = xpathExpr;
        this.xmlReader = xmlReader;
        resultBuilder = new ResultBuilder();
        resultCollector = new ResultCollector();
    }


    //    public static void main(String[] args) {
//        File file = new File(".");
//        String filePath =null;
//        try {
//            filePath = file.getCanonicalPath();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            OMElement documentElement = new StAXOMBuilder(filePath+"/src/test/resources/reader.xml").getDocumentElement();
//            DefaultXPathProcessor processor = new DefaultXPathProcessor("/breakfast_menu/food/price");
//            processor.xpathProcess(documentElement);
//        } catch (XMLStreamException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//
//    }
    public void xpathProcess(OMElement omElement) {
        xmlReader.setXmlStreamReader(omElement);
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) this.xpathExpr.getRootExpr();
        absoluteLocationPathProcess(locationPath);
        }

    @Override
    public ResultCollector getResultCollector() {
        return resultCollector;
    }


    public boolean evaluate(Step step, int index, int numSteps, int predicateType, PredicateProcessingUtil predicateProcessingUtil) throws XMLStreamException {

        DefaultNameStep defaultNameStep = (DefaultNameStep) step;
        String localName = defaultNameStep.getLocalName();
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
                    if (xmlReader.getStepCounter() == 1 && index == 0) {
                        if (localName.equals(xmlEventRepresentation.getLocalName())) {
                            if (numSteps == 1) {
                                resultCollector.addOMElement(xmlReader.getOmElement());

                            }

                            return true;
                        } else {
                            return false;
                        }
                    } else if (xmlReader.getXMLReadDepth() == index + 1) {
                        if (localName.equals(xmlEventRepresentation.getLocalName())) {
                            if (predicateType == PredicateProcessingUtil.NOPREDICATE || predicateType == PredicateProcessingUtil.EQUALPREDICATE || predicateType == PredicateProcessingUtil.NOTEQUALPREDICATE) {
                                if (numSteps == xmlReader.getXMLReadDepth()) {
                                    capturingOnXMlDepth = xmlReader.getXMLReadDepth();
                                    capturingOn = true;
                                    resultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
                                }
                            } else if (predicateType == PredicateProcessingUtil.NUMBERLITERALPREDICATE) {
                                xmlReader.incrementNumberLiteralCounter();
                                if (xmlReader.getNumberLiteralCounter() == predicateProcessingUtil.getValue()) {
                                    if (numSteps == xmlReader.getXMLReadDepth()) {
                                        capturingOnXMlDepth = xmlReader.getXMLReadDepth();
                                        capturingOn = true;
                                        resultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
                                       // return true;
                                    }
                                }
                            }
                            if(index+1 ==numSteps){
                            continue;
                        }  else{
                            return true;
                        } }else {

                            continue;
                        }
                    } else if (xmlReader.getXMLReadDepth() > index + 1) {
                        continue;
                    } //else if (index > 0 && xmlReader.getXMLReadDepth() == index) {
                       // return false;
                   // }
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
                    if (numSteps - xmlReader.getXMLReadDepth() == 2) {
                        xmlReader.resetNumberLiteralCounter();
                        return true;
                    }
                    break;
            }
        }
        return true;
    }

}
