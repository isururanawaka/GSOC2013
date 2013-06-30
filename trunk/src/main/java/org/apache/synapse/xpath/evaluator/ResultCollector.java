package org.apache.synapse.xpath.evaluator;


import org.apache.axiom.om.OMElement;

import java.util.LinkedList;
import java.util.List;

public class ResultCollector {

private  List<OMElement> omElementList = new LinkedList<OMElement>();



 public  void addOMElement(OMElement omElement){
     omElementList.add(omElement);

 }


  public   List<OMElement> getOmElementList(){
      return omElementList;
  }

  public  void clearList(){
      omElementList.clear();
  }














}
