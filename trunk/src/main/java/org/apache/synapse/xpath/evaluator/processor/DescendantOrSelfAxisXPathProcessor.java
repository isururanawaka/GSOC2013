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
import java.util.Iterator;

public class DescendantOrSelfAxisXPathProcessor extends ParentXPathProcessor implements XPathProcessor {
    private XMLReader xmlReader;
    private boolean capturingOn = false;
    private int capturingOnXMlDepth = 0;
    private XpathExpr xpathExpr=null;
    private ResultBuilder resultBuilder =null;
    private ResultCollector resultCollector =null;
    private String checkingName;
    private String bufferedName;
    private int counter=0;
    private boolean twostep=false;


    public DescendantOrSelfAxisXPathProcessor(XpathExpr xpathExpr,XMLReader xmlReader){
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
    @Override
    public void xpathProcess(XMLStreamReader xmlStreamReader) {
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
        if(index+ XPathProcessingConstants.OFFSET_ONE==numSteps){
            checkingName = localName;
            counter++;
            if(counter==1&& !(checkingName.equals(bufferedName)||checkingName.equals(XPathProcessingConstants.ALL))){
                resultBuilder.reset();
                capturingOn=false;
            }
        }
        if((index+XPathProcessingConstants.OFFSET_ONE)== (numSteps-XPathProcessingConstants.OFFSET_ONE)){
            bufferedName = localName;
        }
        while (xmlReader.hasNextEvent()){
            XMLEventRepresentation xmlEventRepresentation = xmlReader.getnextEvent();
            switch (xmlEventRepresentation.getType()) {
                case XMLStreamConstants.START_ELEMENT:
                    xmlReader.incrementstepCounter();
                    xmlReader.incrementDepth();
                    if (capturingOn && capturingOnXMlDepth == xmlReader.getXMLReadDepth()){
                        OMElement omElement = resultBuilder.sendToOutput();
                        addDescendant(omElement);
                        capturingOn = false;
                    }else if (capturingOn && capturingOnXMlDepth < xmlReader.getXMLReadDepth()){
                        resultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
               }
                    if (xmlReader.getXMLReadDepth() >= index + XPathProcessingConstants.OFFSET_ONE) {
                        if (localName.equals(xmlEventRepresentation.getLocalName())){
                            if (predicateType == PredicateProcessingUtil.NOPREDICATE || predicateType == PredicateProcessingUtil.EQUALPREDICATE || predicateType == PredicateProcessingUtil.NOTEQUALPREDICATE) {
                                if ((numSteps-XPathProcessingConstants.OFFSET_ONE) <= xmlReader.getXMLReadDepth()){
                                    capturingOnXMlDepth = xmlReader.getXMLReadDepth();
                                    capturingOn = true;
                                    resultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
                                }
                            }
                            if(index+XPathProcessingConstants.OFFSET_ONE ==numSteps){
                                continue;
                            }  else{
                                return true;
                            }

                        }else if(checkingName !=null && checkingName.equals(XPathProcessingConstants.ALL) && localName.equals(xmlEventRepresentation.getLocalName()) ){
                            if (predicateType == PredicateProcessingUtil.NOPREDICATE ) {
                                if ((numSteps-XPathProcessingConstants.OFFSET_ONE) == xmlReader.getXMLReadDepth() && !capturingOn) {
                                    capturingOnXMlDepth = xmlReader.getXMLReadDepth();
                                    capturingOn = true;
                                    resultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
                                    continue;
                                }
                            }
                        }


                        else {

                            continue;
                        }
                    } else if (xmlReader.getXMLReadDepth() > index + XPathProcessingConstants.OFFSET_ONE) {
                        continue;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    if (capturingOn && capturingOnXMlDepth == xmlReader.getXMLReadDepth()) {
                        OMElement omElement = resultBuilder.sendToOutput();
                        addDescendant(omElement);

                        capturingOn = false;
                    } else if (capturingOn && capturingOnXMlDepth < xmlReader.getXMLReadDepth()) {
                        resultBuilder.createOM(xmlEventRepresentation, xmlReader.getXMLReadDepth());
                    }
                    xmlReader.decrementDepth();
                    if ((numSteps) - xmlReader.getXMLReadDepth() == XPathProcessingConstants.PARENT_EXIT_VALUE) {
                        return true;
                    }
                    break;
            }
        }
        return true;

    }
    private void addDescendant(OMElement omElement){
        Iterator iterator = omElement.getDescendants(true);
        if(checkingName.equals(XPathProcessingConstants.ALL)){
            while(iterator.hasNext()){
                Object object =iterator.next();
                if(object instanceof OMElement){
                    resultCollector.addOMElement((OMElement)object);
                }
            }
        }else{
            resultCollector.addOMElement(omElement);
        }
    }


}
