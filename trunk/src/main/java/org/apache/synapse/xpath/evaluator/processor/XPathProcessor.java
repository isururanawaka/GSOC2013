package org.apache.synapse.xpath.evaluator.processor;


import org.apache.axiom.om.OMElement;
import org.apache.synapse.xpath.evaluator.ResultCollector;

public interface XPathProcessor {

    public void xpathProcess(OMElement omElement);
    public ResultCollector getResultCollector();
}
