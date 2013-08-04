package org.apache.synapse.xpath.evaluator.processor;


import org.apache.axiom.om.OMElement;
import org.apache.synapse.xpath.evaluator.ResultCollector;

import javax.xml.stream.XMLStreamReader;

public interface XPathProcessor {

    public void xpathProcess(OMElement omElement);
    public ResultCollector getResultCollector();
    public void xpathProcess(XMLStreamReader xmlStreamReader);

}
