package org.apache.synapse.xpath.evaluator;


import org.apache.axiom.om.OMElement;

import java.util.LinkedList;
import java.util.List;

public class ResultCollector {

private static List<OMElement> omElementList = new LinkedList<OMElement>();



 public static void addOMElement(OMElement omElement){
     omElementList.add(omElement);

 }


  public static  List<OMElement> getOmElementList(){
      return omElementList;
  }

  public static void clearList(){
      omElementList.clear();
  }














}
