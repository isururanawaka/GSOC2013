package org.apache.synapse.xpath.query.xpathevaluationtest;


import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.synapse.xpath.evaluator.XPathProcessor;
import org.junit.Test;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public class PredicateLessQueryTestCase {



@Test
public void oneStepQueryTest(){



}












private OMElement getOMElement(){

OMElement omElement=null;
    try {
         omElement = new StAXOMBuilder("/home/isuru/Documents/streaming2/streaming-xpath/trunk/src/objectmodeltest/resources/reader.xml").getDocumentElement();

    } catch (XMLStreamException e) {
        e.printStackTrace();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    return omElement;
}

}