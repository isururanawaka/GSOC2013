package org.apache.synapse.xpath.query.objectmodeltest;

import antlr.RecognitionException;
import junit.framework.Assert;
import org.apache.synapse.xpath.compiler.XPathCompiler;
import org.apache.synapse.xpath.compiler.exception.XPathParserException;
import org.apache.synapse.xpath.expression.DefaultAbsoluteLocationPath;
import org.apache.synapse.xpath.expression.DefaultNameStep;
import org.apache.synapse.xpath.expression.Step;
import org.apache.synapse.xpath.expression.XpathExpr;
import org.apache.synapse.xpath.expression.axis.*;
import org.junit.Test;

import javax.xml.soap.Name;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: isuru
 * Date: 5/11/13
 * Time: 7:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class SelectingQueryNodesAxisTestCase {

    @Test
    public void testchild() throws RecognitionException, XPathParserException {
        XpathExpr expr = XPathCompiler.parse("/book/child::data");
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) expr.getRootExpr();
        List<Step> list = locationPath.getSteps();
        int count = 0;
        for (Step step : list) {
            if (((DefaultNameStep) step).getLocalName().equals("book")) {
                count++;
            } else if (((DefaultNameStep) step).getLocalName().equals("data")) {
                count++;
            }
        }
        Assert.assertEquals(count, 2);
        Assert.assertEquals(list.size(), 2);
    }

    @Test
    public void testattribute() throws RecognitionException, XPathParserException {
        XpathExpr expr = XPathCompiler.parse("/book/attribute::lang");
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) expr.getRootExpr();
        List<Step> list = locationPath.getSteps();
        int count = 0;
        for (Step step : list) {
            if (((DefaultNameStep) step).getLocalName().equals("book")) {
                count++;
            } else if (((DefaultNameStep) step).getLocalName().equals("lang")) {
                count++;
                Assert.assertTrue(((DefaultNameStep) step).getIterableAxis() instanceof AttributeAxis);
            }
        }
        Assert.assertEquals(count, 2);
        Assert.assertEquals(list.size(), 2);
    }


    @Test
    public void testdescendant() throws RecognitionException, XPathParserException {
        XpathExpr expr = XPathCompiler.parse("/book/descendant::data");
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) expr.getRootExpr();
        List<Step> list = locationPath.getSteps();
        int count = 0;
        for (Step step : list) {
            if (((DefaultNameStep) step).getLocalName().equals("book")) {
                count++;
            } else if (((DefaultNameStep) step).getLocalName().equals("data")) {
                count++;
                Assert.assertTrue(((DefaultNameStep) step).getIterableAxis() instanceof DescendantAxis);
            }
        }
        Assert.assertEquals(count, 2);
        Assert.assertEquals(list.size(), 2);
    }



     @Test
    public void testdescendantorself() throws RecognitionException, XPathParserException {
        XpathExpr expr = XPathCompiler.parse("/book/descendant-or-self::data");
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) expr.getRootExpr();
        List<Step> list = locationPath.getSteps();
        int count = 0;
        for (Step step : list) {
            if (((DefaultNameStep) step).getLocalName().equals("book")) {
                count++;
            } else if (((DefaultNameStep) step).getLocalName().equals("data")) {
                count++;
                Assert.assertTrue(((DefaultNameStep) step).getIterableAxis() instanceof DescendantOrSelfAxis);
            }
        }
        Assert.assertEquals(count, 2);
        Assert.assertEquals(list.size(), 2);
    }

   @Test
    public void testfollowing() throws RecognitionException, XPathParserException {
        XpathExpr expr = XPathCompiler.parse("/book/following::data");
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) expr.getRootExpr();
        List<Step> list = locationPath.getSteps();
        int count = 0;
        for (Step step : list) {
            if (((DefaultNameStep) step).getLocalName().equals("book")) {
                count++;
            } else if (((DefaultNameStep) step).getLocalName().equals("data")) {
                count++;
                Assert.assertTrue(((DefaultNameStep) step).getIterableAxis() instanceof FollowingAxis);
            }
        }
        Assert.assertEquals(count, 2);
        Assert.assertEquals(list.size(), 2);
    }

    @Test
    public void testfollowingsibling() throws RecognitionException, XPathParserException {
        XpathExpr expr = XPathCompiler.parse("/book/following-sibling::data");
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) expr.getRootExpr();
        List<Step> list = locationPath.getSteps();
        int count = 0;
        for (Step step : list) {
            if (((DefaultNameStep) step).getLocalName().equals("book")) {
                count++;
            } else if (((DefaultNameStep) step).getLocalName().equals("data")) {
                count++;
                Assert.assertTrue(((DefaultNameStep) step).getIterableAxis() instanceof FollowingSiblingAxis);
            }
        }
        Assert.assertEquals(count, 2);
        Assert.assertEquals(list.size(), 2);
    }
   @Test
    public void testnamespace() throws RecognitionException, XPathParserException {
        XpathExpr expr = XPathCompiler.parse("/book/namespace::data");
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) expr.getRootExpr();
        List<Step> list = locationPath.getSteps();
        int count = 0;
        for (Step step : list) {
            if (((DefaultNameStep) step).getLocalName().equals("book")) {
                count++;
            } else if (((DefaultNameStep) step).getLocalName().equals("data")) {
                count++;
                Assert.assertTrue(((DefaultNameStep) step).getIterableAxis() instanceof NamespaceAxis);
            }
        }
        Assert.assertEquals(count, 2);
        Assert.assertEquals(list.size(), 2);
    }
    @Test
    public void testself() throws RecognitionException, XPathParserException {
        XpathExpr expr = XPathCompiler.parse("/book/self::data");
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) expr.getRootExpr();
        List<Step> list = locationPath.getSteps();
        int count = 0;
        for (Step step : list) {
            if (((DefaultNameStep) step).getLocalName().equals("book")) {
                count++;
            } else if (((DefaultNameStep) step).getLocalName().equals("data")) {
                count++;
                Assert.assertTrue(((DefaultNameStep) step).getIterableAxis() instanceof SelfAxis);
            }
        }
        Assert.assertEquals(count, 2);
        Assert.assertEquals(list.size(), 2);
    }



}
