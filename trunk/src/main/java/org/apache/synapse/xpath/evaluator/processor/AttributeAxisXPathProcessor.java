package org.apache.synapse.xpath.evaluator.processor;


import org.apache.axiom.om.OMAttribute;
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
import java.util.ArrayList;
import java.util.List;

public class AttributeAxisXPathProcessor extends ParentXPathProcessor implements XPathProcessor {
    private XMLReader xmlReader;
    private XpathExpr xpathExpr = null;
    private ResultBuilder resultBuilder = null;
    private ResultCollector resultCollector = null;
    private String checkingName;
    private boolean checkingNamenullexecuted=false;


    public AttributeAxisXPathProcessor(XpathExpr xpathExpr, XMLReader xmlReader) {
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
    public ResultCollector getResultCollector() {
        return resultCollector;
    }

    @Override
    public void xpathProcess(XMLStreamReader xmlStreamReader) {
        xmlReader.setXMLStreamReader(xmlStreamReader);
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) this.xpathExpr.getRootExpr();
        absoluteLocationPathProcess(locationPath);
    }

    @Override
    public boolean evaluate(Step step, int index, int numSteps, int predicateType, PredicateProcessingUtil predicateProcessingUtil) throws XMLStreamException {
        DefaultNameStep defaultNameStep = (DefaultNameStep) step;
        String localName = defaultNameStep.getLocalName();
        if (index + XPathProcessingConstants.OFFSET_ONE == numSteps) {
            checkingName = localName;
            if(!checkingName.equals(XPathProcessingConstants.ALL) && checkingNamenullexecuted){
                reformatOMAttribute();
                checkingNamenullexecuted=false;
            }
            return true;
        }
        while (xmlReader.hasNextEvent()) {
            XMLEventRepresentation xmlEventRepresentation = xmlReader.getnextEvent();
            switch (xmlEventRepresentation.getType()) {
                case XMLStreamConstants.START_ELEMENT:
                    xmlReader.incrementstepCounter();
                    xmlReader.incrementDepth();

                    if (xmlReader.getXMLReadDepth() == index + XPathProcessingConstants.OFFSET_ONE ) {
                        if (localName.equals(xmlEventRepresentation.getLocalName())) {
                            if (predicateType == PredicateProcessingUtil.NOPREDICATE || predicateType == PredicateProcessingUtil.EQUALPREDICATE || predicateType == PredicateProcessingUtil.NOTEQUALPREDICATE) {
                                if (numSteps -XPathProcessingConstants.OFFSET_ONE == xmlReader.getXMLReadDepth()) {

                                    addToList(resultBuilder.createOMAttribute(xmlEventRepresentation));
                                    resultBuilder.clearOMAttributeList();
                                }
                            }
                            if (index + XPathProcessingConstants.OFFSET_ONE == (numSteps - XPathProcessingConstants.OFFSET_ONE )) {
                                continue;
                            } else {
                                return true;
                            }

                        } else {

                            continue;
                        }
                    } else if (xmlReader.getXMLReadDepth() > index + XPathProcessingConstants.OFFSET_ONE ) {
                        continue;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:

                    xmlReader.decrementDepth();
                    if ((numSteps - XPathProcessingConstants.OFFSET_ONE ) - xmlReader.getXMLReadDepth() == XPathProcessingConstants.PARENT_EXIT_VALUE) {
                        return true;
                    }
                    break;
            }
        }
        return true;
    }


    private void addToList(List<OMAttribute> omAttributeList) {
        if(omAttributeList.size()>XPathProcessingConstants.COUNTER_ZERO){
            if(checkingName == null){
                checkingNamenullexecuted=true;
                for(OMAttribute omAttribute:omAttributeList){
                    resultCollector.addOmAttribute(omAttribute);
                }
            }
           else if( checkingName.equals(XPathProcessingConstants.ALL)){
                for(OMAttribute omAttribute:omAttributeList){
                    resultCollector.addOmAttribute(omAttribute);
                }
            } else if(!checkingName.equals(XPathProcessingConstants.ALL) ){
                for(OMAttribute omAttribute:omAttributeList){
                    if(omAttribute.getLocalName().equals(checkingName)){
                        resultCollector.addOmAttribute(omAttribute);
                    }
                }
            }






        }


    }
     private void reformatOMAttribute(){
         List<OMAttribute> templist = new ArrayList<OMAttribute>();
         List<OMAttribute> list = resultCollector.getOmAttributeList();
         templist.addAll(list);
         OMAttribute temp=null;
         for(OMAttribute omAttribute:list){
             if(!omAttribute.getLocalName().equals(checkingName)){
                templist.remove(omAttribute);
             }
         }
         list.clear();
         list.addAll(templist);
     }

}
