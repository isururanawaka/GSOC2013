package org.apache.synapse.xpath.query.xpathevaluationtest;

import junit.framework.Assert;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.synapse.xpath.evaluator.XPathProcessorFactory;
import org.apache.synapse.xpath.evaluator.processor.DefaultXPathProcessor;
import org.apache.synapse.xpath.evaluator.ResultCollector;
import org.apache.synapse.xpath.evaluator.processor.XPathProcessor;
import org.junit.Test;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;


public class PredicateEqualityOPQueryTestCase {


    @Test
    public void equalityPredicateQueryTestCase(){
        String   xpathquery = "/breakfast_menu/food[name='Belgian Waffles']";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        xPathProcessor.xpathProcess(getOMElement());
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        Assert.assertEquals(1,omElementList.size());
        OMElement parent = omElementList.get(0);
        Iterator iterator = parent.getChildElements();
        while(iterator.hasNext()){
           OMElement omElement= (OMElement)iterator.next();
            if(omElement.getLocalName().equals("name")){
                Assert.assertTrue(omElement.getText().equals("Belgian Waffles"));
            }

        }

    }

    @Test
    public void notEqualityPredicateQueryTestCase(){

        String   xpathquery = "/breakfast_menu/food[name!='Belgian Waffles']";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        xPathProcessor.xpathProcess(getOMElement());
         ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        Assert.assertEquals(1,omElementList.size());
        OMElement parent = omElementList.get(0);
        Iterator iterator = parent.getChildElements();
        while(iterator.hasNext()){
            OMElement omElement= (OMElement)iterator.next();
            if(omElement.getLocalName().equals("name")){
                Assert.assertTrue(omElement.getText().equals("Strawberry Belgian Waffles"));
            }

        }

    }



    private OMElement getOMElement(){
        File file = new File(".");
        String filePath =null;
        try {
            filePath = file.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }

        OMElement omElement=null;
        try {
            omElement = new StAXOMBuilder(filePath+"/src/test/resources/reader.xml").getDocumentElement();

        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return omElement;
    }





}
