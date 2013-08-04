package org.apache.synapse.xpath.evaluator;


import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;

import java.util.LinkedList;
import java.util.List;

public class ResultCollector {

private  List<OMElement> omElementList = new LinkedList<OMElement>();
private List<OMAttribute> omAttributeList = new LinkedList<OMAttribute>();



 public  void addOMElement(OMElement omElement){
     omElementList.add(omElement);

 }

    public List<OMAttribute> getOmAttributeList() {
        return omAttributeList;
    }

    public void addOmAttribute(OMAttribute omAttribute) {
        this.omAttributeList.add(omAttribute);
    }

    public   List<OMElement> getOmElementList(){
      return omElementList;
  }

  public  void clearList(){
      omElementList.clear();
      omAttributeList.clear();
  }














}
