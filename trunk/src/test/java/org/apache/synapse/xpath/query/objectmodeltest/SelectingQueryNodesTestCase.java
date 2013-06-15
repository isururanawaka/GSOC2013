package org.apache.synapse.xpath.query.objectmodeltest;

import antlr.RecognitionException;
import junit.framework.Assert;
import org.apache.synapse.xpath.compiler.XPathCompiler;
import org.apache.synapse.xpath.compiler.exception.XPathParserException;
import org.apache.synapse.xpath.expression.*;
import org.junit.Test;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: isuru
 * Date: 5/6/13
 * Time: 9:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class SelectingQueryNodesTestCase {


    @Test
    public void testPath() throws RecognitionException, XPathParserException {
        XpathExpr expr = XPathCompiler.parse("/book/data");
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
    public void testPathone() throws RecognitionException, XPathParserException {
        XpathExpr expr = XPathCompiler.parse("//book/data");
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) expr.getRootExpr();
        List<Step> list = locationPath.getSteps();
        int count = 0;
        for (Step step : list) {
            if (step instanceof DefaultNameStep) {
                if (((DefaultNameStep) step).getLocalName().equals("book")) {
                    count++;
                } else if (((DefaultNameStep) step).getLocalName().equals("data")) {
                    count++;
                }
            } else if (step instanceof DefaultAllNodeStep) {
                count++;
            }
        }
        Assert.assertEquals(count, 3);
        Assert.assertEquals(list.size(), 3);
    }


    @Test
    public void testPathtwo() throws RecognitionException, XPathParserException {
        XpathExpr expr = XPathCompiler.parse("/book/data[1]");
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) expr.getRootExpr();
        List<Step> list = locationPath.getSteps();
        int count = 0;
        for (Step step : list) {
            if (step instanceof DefaultNameStep) {
                if (((DefaultNameStep) step).getLocalName().equals("book")) {
                    count++;
                } else if (((DefaultNameStep) step).getLocalName().equals("data")) {
                    count++;
                    List<Predicate> listpredi = ((DefaultNameStep) step).getPredicates();
                    Assert.assertEquals(listpredi.size(), 1);
                    for (Predicate set : listpredi) {

                        DefaultPredicate one = (DefaultPredicate) set;
                        Assert.assertTrue(one.getExpr() instanceof DefaultUnaryExpr);
                        DefaultUnaryExpr defaultUnaryExpr = ((DefaultUnaryExpr) one.getExpr());
                        Assert.assertTrue(defaultUnaryExpr.getExpr() instanceof DefaultPathExpr);
                        DefaultPathExpr defaultPathExpr = (DefaultPathExpr) defaultUnaryExpr.getExpr();
                        DefaultFilterExpr defaultFilterExpr = (DefaultFilterExpr) defaultPathExpr.getFilterExpr();

                        DefaultNumberExpr numExpr = (DefaultNumberExpr) defaultFilterExpr.getExpr();
                        Assert.assertEquals(numExpr.getNumber(), 1.0);

                    }


                }
            }
        }
        Assert.assertEquals(count, 2);
        Assert.assertEquals(list.size(), 2);
    }

    @Test
    public void testPaththree() throws RecognitionException, XPathParserException {
        XpathExpr expr = XPathCompiler.parse("/book/data[price=30]");
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) expr.getRootExpr();
        List<Step> list = locationPath.getSteps();
        int count = 0;
        for (Step step : list) {
            if (step instanceof DefaultNameStep) {
                if (((DefaultNameStep) step).getLocalName().equals("book")) {
                    count++;
                } else if (((DefaultNameStep) step).getLocalName().equals("data")) {
                    count++;
                    List<Predicate> listpredi = ((DefaultNameStep) step).getPredicates();
                    Assert.assertEquals(listpredi.size(), 1);
                    for (Predicate set : listpredi) {

                        DefaultPredicate one = (DefaultPredicate) set;
                        Assert.assertTrue(one.getExpr() instanceof DefaultEqualsExpr);
                        DefaultEqualsExpr defaultEqualsExpr = ((DefaultEqualsExpr) one.getExpr());
                        Expr lhs = defaultEqualsExpr.getLHS();
                        Expr rhs = defaultEqualsExpr.getRHS();

                        Assert.assertTrue(((DefaultUnaryExpr) lhs).getExpr() instanceof DefaultPathExpr);
                        DefaultPathExpr defaultPathExpr = (DefaultPathExpr) ((((DefaultUnaryExpr) lhs)).getExpr());
                        DefaultRelativeLocationPath defaultRelativeLocationPath = (DefaultRelativeLocationPath) defaultPathExpr.getLocationPath();
                        List<Step> steplist = defaultRelativeLocationPath.getSteps();
                        Assert.assertEquals(steplist.size(), 1);
                        for (Step stepone : steplist) {
                            Assert.assertTrue(stepone instanceof DefaultNameStep);
                            Assert.assertEquals(((DefaultNameStep) stepone).getLocalName(), "price");

                        }

                        Assert.assertTrue(((DefaultUnaryExpr) rhs).getExpr() instanceof DefaultPathExpr);
                        DefaultPathExpr defaultPathExprone = (DefaultPathExpr) ((((DefaultUnaryExpr) rhs)).getExpr());
                        DefaultFilterExpr defaultFilterExpr = (DefaultFilterExpr) defaultPathExprone.getFilterExpr();
                        DefaultNumberExpr defaultNumberExpr = (DefaultNumberExpr) defaultFilterExpr.getExpr();
                        Assert.assertEquals(defaultNumberExpr.getNumber(), 30.0);


                    }


                }
            }
        }
        Assert.assertEquals(count, 2);
        Assert.assertEquals(list.size(), 2);
    }

    @Test
    public void testPathfour() throws RecognitionException, XPathParserException {
        XpathExpr expr = XPathCompiler.parse("/book/data[price!=30]");
        DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) expr.getRootExpr();
        List<Step> list = locationPath.getSteps();
        int count = 0;
        for (Step step : list) {
            if (step instanceof DefaultNameStep) {
                if (((DefaultNameStep) step).getLocalName().equals("book")) {
                    count++;
                } else if (((DefaultNameStep) step).getLocalName().equals("data")) {
                    count++;
                    List<Predicate> listpredi = ((DefaultNameStep) step).getPredicates();
                    Assert.assertEquals(listpredi.size(), 1);
                    for (Predicate set : listpredi) {

                        DefaultPredicate one = (DefaultPredicate) set;
                        Assert.assertTrue(one.getExpr() instanceof DefaultNotEqualsExpr);
                        DefaultNotEqualsExpr defaultEqualsExpr = ((DefaultNotEqualsExpr) one.getExpr());
                        Expr lhs = defaultEqualsExpr.getLHS();
                        Expr rhs = defaultEqualsExpr.getRHS();

                        Assert.assertTrue(((DefaultUnaryExpr) lhs).getExpr() instanceof DefaultPathExpr);
                        DefaultPathExpr defaultPathExpr = (DefaultPathExpr) ((((DefaultUnaryExpr) lhs)).getExpr());
                        DefaultRelativeLocationPath defaultRelativeLocationPath = (DefaultRelativeLocationPath) defaultPathExpr.getLocationPath();
                        List<Step> steplist = defaultRelativeLocationPath.getSteps();
                        Assert.assertEquals(steplist.size(), 1);
                        for (Step stepone : steplist) {
                            Assert.assertTrue(stepone instanceof DefaultNameStep);
                            Assert.assertEquals(((DefaultNameStep) stepone).getLocalName(), "price");

                        }

                        Assert.assertTrue(((DefaultUnaryExpr) rhs).getExpr() instanceof DefaultPathExpr);
                        DefaultPathExpr defaultPathExprone = (DefaultPathExpr) ((((DefaultUnaryExpr) rhs)).getExpr());
                        DefaultFilterExpr defaultFilterExpr = (DefaultFilterExpr) defaultPathExprone.getFilterExpr();
                        DefaultNumberExpr defaultNumberExpr = (DefaultNumberExpr) defaultFilterExpr.getExpr();
                        Assert.assertEquals(defaultNumberExpr.getNumber(), 30.0);


                    }


                }
            }
        }
        Assert.assertEquals(count, 2);
        Assert.assertEquals(list.size(), 2);
    }

}
