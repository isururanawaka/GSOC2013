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

public class PredicateLessQueryTestCase {



@Test
public void twoStepQueryTest(){


    String   xpathquery = "/breakfast_menu/food";
    XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
    OMElement omElementone = getOMElement();
    double starttime = System.currentTimeMillis();
    xPathProcessor.xpathProcess(omElementone);

    ResultCollector resultCollector = xPathProcessor.getResultCollector();
    List<OMElement> omElementList = resultCollector.getOmElementList();
   // ResultCollector.clearList();
    double  endTime =System.currentTimeMillis();
    System.out.println(endTime -starttime);
    Assert.assertEquals(2,omElementList.size());
    OMElement parentone = omElementList.get(0);
    OMElement parenttwo = omElementList.get(1);
    Assert.assertTrue("food".equals(parentone.getLocalName()));
    Iterator iteratorone = parentone.getChildElements();
    int count=0;
    while(iteratorone.hasNext()){
       count++;
        OMElement omElement =(OMElement)iteratorone.next();
        if(count==1){
        if(omElement.getLocalName().equals("name")) {
            Assert.assertTrue("Belgian Waffles".equals(omElement.getText()));
        }} else{
            if(omElement.getLocalName().equals("price")) {
                Assert.assertTrue("$5.95".equals(omElement.getText()));
            }
        }
        }
    Iterator iteratortwo = parenttwo.getChildElements();
    int counttwo=0;
    while(iteratortwo.hasNext()){
        counttwo++;
        OMElement omElement =(OMElement)iteratortwo.next();
        if(counttwo==1){
            if(omElement.getLocalName().equals("name")) {
                Assert.assertTrue("Strawberry Belgian Waffles".equals(omElement.getText()));
            }} else{
            if(omElement.getLocalName().equals("price")) {
                Assert.assertTrue("$7.95".equals(omElement.getText()));
            }
        }
    }

    }


    @Test
   public void threeStepQuery(){

        String   xpathquery = "/breakfast_menu/food/name";
        double starttime = System.currentTimeMillis();
        OMElement omElementone = getOMElement();
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
         xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(2,omElementList.size());
         OMElement omElementOne = omElementList.get(0);
        Assert.assertTrue(omElementOne.getText().equals("Belgian Waffles"));
        OMElement omElementTwo = omElementList.get(1);
        Assert.assertTrue(omElementTwo.getText().equals("Strawberry Belgian Waffles"));


   }



private OMElement getOMElement(){
    File file = new File(".");
    String filePath =null;
    try {
        filePath = file.getCanonicalPath();
    } catch (IOException e) {
        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
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