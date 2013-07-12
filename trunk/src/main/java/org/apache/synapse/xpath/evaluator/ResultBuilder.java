package org.apache.synapse.xpath.evaluator;

import org.apache.axiom.om.*;
import org.apache.synapse.xpath.XMLReader.XMLEventRepresentation;
import org.apache.synapse.xpath.util.AttributeUtil;
import org.apache.synapse.xpath.util.NameSpaceUtil;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ResultBuilder {

  private  OMElement rootElement;
  private   OMElement previouseElement;
  private  OMElement latestParent;
  private  int initialDepth;
    private int maxdepth=0;
  private  int previouseDepth;
  private  int counter=0;
  private List<OMElement> parentStack = new ArrayList<OMElement>();


  public  void createOM(XMLEventRepresentation xmlEventRepresentation,int depth){

      if(xmlEventRepresentation.getType()== XMLStreamConstants.START_ELEMENT){
          counter++;
          OMElement omElement =null;
      if(counter==1){
          initialDepth=depth;
          previouseDepth =depth;
          rootElement = buildOM(xmlEventRepresentation);
          previouseElement = rootElement;
          latestParent =rootElement;
          maxdepth =depth;
      }
      if(counter>1){
           if(depth==previouseDepth+1){
             omElement = buildOM(xmlEventRepresentation);
             previouseElement.addChild(omElement);
               latestParent = previouseElement;
               previouseDepth =depth;
               previouseElement = omElement;
               if(maxdepth<depth){
               parentStack.add(latestParent);
               maxdepth =depth;
               }
           }else if(previouseDepth==depth){
               omElement = buildOM(xmlEventRepresentation);
               latestParent.addChild(omElement);
               previouseElement=omElement;
           }else if(previouseDepth>depth){
               int diffrence = previouseDepth-depth;
               OMElement temp = parentStack.get((parentStack.size()-diffrence)-1);
               omElement =buildOM(xmlEventRepresentation);
               temp.addChild(omElement);
               int pos =(parentStack.size()-diffrence)-1;
               parentStack.remove((parentStack.size()-diffrence)-1);

               parentStack.add(pos,temp);
               latestParent =temp;
               previouseElement = omElement;
               previouseDepth =depth;

           }

      }
      }
  }

    public  OMElement sendToOutput(){
        OMElement omElement =rootElement;
        rootElement=null;
        counter=0;
        initialDepth=0;
        previouseElement=null;
        latestParent=null;
        previouseDepth=0;
        maxdepth=0;
        parentStack.clear();
        return  omElement;
    }
        public  void reset(){
            rootElement=null;
            counter=0;
            initialDepth=0;
            previouseElement=null;
            latestParent=null;
            previouseDepth=0;
            maxdepth=0;
            parentStack.clear();
        }


    private  OMElement buildOM(XMLEventRepresentation xmlEventRepresentation){
       OMFactory factory = OMAbstractFactory.getOMFactory();
       String localName = xmlEventRepresentation.getLocalName();
       String value = xmlEventRepresentation.getNameValue();
       String prefix = xmlEventRepresentation.getPrefix();
       Map<String,AttributeUtil> attributeMap    = xmlEventRepresentation.getAttributeMap();
       Map<String,NameSpaceUtil> namespaceMap    = xmlEventRepresentation.getNamespaceMap();
       String uri = xmlEventRepresentation.getUri();
        OMElement omElement=null;
        if(prefix != null){
       QName qName = new QName(uri,localName,prefix);
      omElement =  factory.createOMElement(qName);
        } else{
            if(uri==null){
            omElement = factory.createOMElement(localName,"",prefix);
            } else{
                omElement = factory.createOMElement(localName,uri,prefix);
            }
        }
       omElement.setText(value);
        if(attributeMap.size()>0){
       for(String key :attributeMap.keySet()){
           AttributeUtil attributeUtil = attributeMap.get(key);
           OMNamespace omNamespace =null;
           if(attributeUtil.getNameSpace()==null && attributeUtil.getPrefix()==null){
                   omNamespace = null;
           } else if(attributeUtil.getNameSpace()==null && attributeUtil.getPrefix()!=null){
              omNamespace= factory.createOMNamespace("",attributeUtil.getPrefix());
           }else if (attributeUtil.getNameSpace()!=null && attributeUtil.getPrefix()!=null){
             omNamespace=  factory.createOMNamespace(attributeUtil.getNameSpace(),"");
           }

           OMAttribute omAttribute = factory.createOMAttribute(attributeUtil.getLocalname(),omNamespace,attributeUtil.getValue());
           omElement.addAttribute(omAttribute);
       }
        }
        if(namespaceMap.size()>0){
        for(String key:namespaceMap.keySet()){
           NameSpaceUtil nameSpaceUtil = namespaceMap.get(key);
            OMNamespace omNamespace = factory.createOMNamespace(nameSpaceUtil.getUri(),nameSpaceUtil.getPrefix());
            omElement.declareNamespace(omNamespace);
        }
        }
     return omElement;

    }



}
