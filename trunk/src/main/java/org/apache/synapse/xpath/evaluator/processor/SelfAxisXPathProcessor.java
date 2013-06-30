package org.apache.synapse.xpath.evaluator.processor;


import org.apache.axiom.om.OMElement;
import org.apache.synapse.xpath.XMLReader.XMLReader;
import org.apache.synapse.xpath.evaluator.ResultCollector;
import org.apache.synapse.xpath.expression.DefaultAbsoluteLocationPath;
import org.apache.synapse.xpath.expression.Step;
import org.apache.synapse.xpath.expression.XpathExpr;
import org.apache.synapse.xpath.util.PredicateProcessingUtil;

import javax.xml.stream.XMLStreamException;

public class SelfAxisXPathProcessor extends ParentXPathProcessor implements XPathProcessor {
    private XMLReader xmlReader;
    private boolean capturingOn = false;
    private int capturingOnXMlDepth = 0;
    private String xpathQuery=null;
    private XpathExpr xpathExpr=null;




    public SelfAxisXPathProcessor(XpathExpr xpathExpr, XMLReader xmlReader){
        super(xmlReader);
        this.xpathExpr = xpathExpr;
        this.xmlReader = xmlReader;
    }

    @Override
    public void xpathProcess(OMElement omElement) {
        xmlReader.setXmlStreamReader(omElement);
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) this.xpathExpr.getRootExpr();
        absoluteLocationPathProcess(locationPath);
    }

    @Override
    public ResultCollector getResultCollector() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean evaluate(Step step, int index, int numSteps, int predicateType, PredicateProcessingUtil predicateProcessingUtil) throws XMLStreamException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
