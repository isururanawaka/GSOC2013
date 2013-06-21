package org.apache.synapse.xpath.query.xpathevaluationtest;


import junit.framework.Assert;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.synapse.xpath.evaluator.ResultCollector;
import org.apache.synapse.xpath.evaluator.XPathProcessor;
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

    XPathProcessor processor = new XPathProcessor();
    String   xpathquery = "/breakfast_menu/food";
    processor.xpathProcess(getOMElement(),xpathquery);
    List<OMElement> omElementList = ResultCollector.getOmElementList();
   // ResultCollector.clearList();
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
    ResultCollector.clearList();
    }


    @Test
   public void threeStepQuery(){
        XPathProcessor processor = new XPathProcessor();
        String   xpathquery = "/breakfast_menu/food/name";
        processor.xpathProcess(getOMElement(),xpathquery);
        List<OMElement> omElementList = ResultCollector.getOmElementList();
        Assert.assertEquals(2,omElementList.size());
         OMElement omElementOne = omElementList.get(0);
        Assert.assertTrue(omElementOne.getText().equals("Belgian Waffles"));
        OMElement omElementTwo = omElementList.get(1);
        Assert.assertTrue(omElementTwo.getText().equals("Strawberry Belgian Waffles"));
        ResultCollector.clearList();

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