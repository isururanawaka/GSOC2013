package org.apache.synapse.xpath.query.xpathevaluationtest;


import junit.framework.Assert;
import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.synapse.xpath.evaluator.ResultCollector;
import org.apache.synapse.xpath.evaluator.XPathProcessorFactory;
import org.apache.synapse.xpath.evaluator.processor.XPathProcessor;
import org.junit.Test;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class XPathAxisTestCase {



    @Test
    public void absoluteandSelfAxisTestCase(){
        String   xpathquery = "/breakfast_menu/food/self::food";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        OMElement omElementone = getOMElement();
        double starttime = System.currentTimeMillis();
        xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(2, omElementList.size());
        OMElement parent = omElementList.get(0);
        Iterator iterator = parent.getChildElements();
        while(iterator.hasNext()){
            OMElement omElement= (OMElement)iterator.next();
            if(omElement.getLocalName().equals("name")){
                Assert.assertTrue(omElement.getText().equals("Belgian Waffles"));
            } else if(omElement.getLocalName().equals("price")){
                Assert.assertTrue(omElement.getText().equals("$5.95"));
            }

        }
        OMElement parenttwo = omElementList.get(1);
        Iterator iteratortwo = parenttwo.getChildElements();
        while(iteratortwo.hasNext()){
            OMElement omElement= (OMElement)iteratortwo.next();
            if(omElement.getLocalName().equals("name")){
                Assert.assertTrue(omElement.getText().equals("Strawberry Belgian Waffles"));
            } else if(omElement.getLocalName().equals("price")){
                Assert.assertTrue(omElement.getText().equals("$7.95"));
            }

        }
    }

    @Test
    public void absoluteandChildAxisTestCase(){
        String   xpathquery = "/breakfast_menu/food/child::*";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        OMElement omElementone = getOMElement();
        double starttime = System.currentTimeMillis();
        xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(4, omElementList.size());

    }

    @Test
    public void absoluteandDesecndantAxisTestCase(){
        String   xpathquery = "/breakfast_menu/descendant::*";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        OMElement omElementone = getOMElement();
        double starttime = System.currentTimeMillis();
        xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(9, omElementList.size());

    }



    @Test
    public void absoluteandDesecndantOrSelfAxisTestCase(){
        String   xpathquery = "/breakfast_menu/food/descendant-or-self::*";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        OMElement omElementone = getOMElement();
        double starttime = System.currentTimeMillis();
        xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(6, omElementList.size());

    }

    @Test
    public void absoluteandFollowingAxisTestCase(){
        String   xpathquery = "/breakfast_menu/food/name/following::*";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        OMElement omElementone = getOMElement();
        double starttime = System.currentTimeMillis();
        xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(7, omElementList.size());

    }

    @Test
    public void absoluteandFollowingAxisTestCaseTwo(){
        String   xpathquery = "/breakfast_menu/food/name/following::name";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        OMElement omElementone = getOMElement();
        double starttime = System.currentTimeMillis();
        xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(2, omElementList.size());

    }
    @Test
    public void absoluteandFollowingSiblingAxisTestCaseTwo(){
        String   xpathquery = "/breakfast_menu/food/name/following-sibling::*";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        OMElement omElementone = getOMElement();
        double starttime = System.currentTimeMillis();
        xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(2, omElementList.size());

    }
    @Test
    public void absoluteandFollowingSiblingAxisTestCaseThree(){
        String   xpathquery = "/breakfast_menu/food/price/following-sibling::*";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        OMElement omElementone = getOMElement();
        double starttime = System.currentTimeMillis();
        xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(0, omElementList.size());

    }
    @Test
    public void absoluteandFollowingSiblingAxisTestCasefour(){
        String   xpathquery = "/breakfast_menu/food/following-sibling::*";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        OMElement omElementone = getOMElement();
        double starttime = System.currentTimeMillis();
        xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(2, omElementList.size());

    }
    @Test
    public void absoluteandFollowingSiblingAxisTestCasefive(){
        String   xpathquery = "/breakfast_menu/food/following-sibling::drink";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        OMElement omElementone = getOMElement();
        double starttime = System.currentTimeMillis();
        xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(1, omElementList.size());

    }
    @Test
    public void absoluteandFollowingSiblingAxisTestCasesix(){
        String   xpathquery = "/breakfast_menu/food/name/following-sibling::coin";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        OMElement omElementone = getOMElement();
        double starttime = System.currentTimeMillis();
        xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMElement> omElementList = resultCollector.getOmElementList();
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(0, omElementList.size());

    }

    @Test
    public void absoluteandattributeTestCase(){
        String   xpathquery = "/breakfast_menu/food/attribute::item";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        OMElement omElementone = getOMElement();
        double starttime = System.currentTimeMillis();
        xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMAttribute> omAttributeList = resultCollector.getOmAttributeList() ;
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(1, omAttributeList.size());

    }
    @Test
    public void absoluteandattributeTestCaseOne(){
        String   xpathquery = "/breakfast_menu/food/attribute::*";
        XPathProcessor xPathProcessor = XPathProcessorFactory.getXPathProcessor(xpathquery);
        OMElement omElementone = getOMElement();
        double starttime = System.currentTimeMillis();
        xPathProcessor.xpathProcess(omElementone);
        ResultCollector resultCollector = xPathProcessor.getResultCollector();
        List<OMAttribute> omAttributeList = resultCollector.getOmAttributeList() ;
        double  endTime =System.currentTimeMillis();
        System.out.println(endTime -starttime);
        Assert.assertEquals(2, omAttributeList.size());

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
