package org.apache.synapse.xpath.evaluator;


import org.apache.synapse.xpath.XMLReader.XMLReader;
import org.apache.synapse.xpath.compiler.XPathCompiler;
import org.apache.synapse.xpath.evaluator.processor.*;
import org.apache.synapse.xpath.expression.DefaultAbsoluteLocationPath;
import org.apache.synapse.xpath.expression.DefaultNameStep;
import org.apache.synapse.xpath.expression.Step;
import org.apache.synapse.xpath.expression.XpathExpr;
import org.apache.synapse.xpath.expression.axis.*;

import java.util.List;


public class XPathProcessorFactory {


 public static XPathProcessor  getXPathProcessor(String xpathquery){

    XpathExpr xPathExpr = XPathCompiler.parse(xpathquery);
    Axis axis = getAxis(xPathExpr);
    if(axis instanceof ChildAxis && ((ChildAxis)axis).isNotAxisSpecifier()){
         return new DefaultXPathProcessor(xPathExpr, XMLReader.getInstance());
    }else if(axis instanceof AttributeAxis){
        return  new AttributeAxisXPathProcessor(xPathExpr,XMLReader.getInstance());
    } else if(axis instanceof  ChildAxis && !((ChildAxis)axis).isNotAxisSpecifier()){
         return new ChildAxisXPathProcessor(xPathExpr,XMLReader.getInstance());
    }else if(axis instanceof DescendantAxis){
         return  new DescendantAxisXPathProcessor(xPathExpr,XMLReader.getInstance());
    }else if(axis instanceof DescendantOrSelfAxis){
          return  new DescendantOrSelfAxisXPathProcessor(xPathExpr,XMLReader.getInstance());
    }else if(axis instanceof FollowingAxis){
           return  new FollowingAxisXPathProcessor(xPathExpr,XMLReader.getInstance());
    }else if(axis instanceof  FollowingSiblingAxis){
           return new FollowingSiblingAxisXPathProcessor(xPathExpr,XMLReader.getInstance());
    }else if(axis instanceof NamespaceAxis){
           return  new NameSpaceAxisXPathProcessor(xPathExpr,XMLReader.getInstance());
    } else if(axis instanceof  SelfAxis){
           return  new SelfAxisXPathProcessor(xPathExpr,XMLReader.getInstance());
    }

   return null;
 }


  private static Axis getAxis(XpathExpr xpathExpr){
       Axis axis =null;
      DefaultAbsoluteLocationPath locationPath = (DefaultAbsoluteLocationPath) xpathExpr.getRootExpr();
      List<Step> stepList =locationPath.getSteps();
      int numSteps = stepList.size();
      //check only for last step initially
      Step step =  stepList.get(numSteps-1);
      if(step instanceof DefaultNameStep){
          DefaultNameStep defaultNameStep = (DefaultNameStep)step;
          axis = defaultNameStep.getIterableAxis();

      }
      return axis;

  }













}
