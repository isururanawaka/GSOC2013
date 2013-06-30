package org.apache.synapse.xpath.evaluator.processor;


import org.apache.axiom.om.OMElement;
import org.apache.synapse.xpath.XMLReader.XMLReader;
import org.apache.synapse.xpath.evaluator.ResultCollector;
import org.apache.synapse.xpath.expression.XpathExpr;

public class DescendantAxisXPathProcessor implements XPathProcessor {
    private XMLReader xmlReader;
    private boolean capturingOn = false;
    private int capturingOnXMlDepth = 0;
    private String xpathQuery=null;
    private XpathExpr xpathExpr=null;


    public DescendantAxisXPathProcessor(XpathExpr xpathExpr,XMLReader xmlReader){
        this.xpathExpr = xpathExpr;
        this.xmlReader = xmlReader;
    }

    @Override
    public void xpathProcess(OMElement omElement) {

    }

    @Override
    public ResultCollector getResultCollector() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
