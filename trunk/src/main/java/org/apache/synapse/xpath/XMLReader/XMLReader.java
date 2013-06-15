package org.apache.synapse.xpath.XMLReader;

import org.apache.axiom.om.OMElement;
import org.apache.synapse.xpath.util.AttributeUtil;
import org.apache.synapse.xpath.util.NameSpaceUtil;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;


public class XMLReader {

    private XMLStreamReader xmlStreamReader;
    private static  XMLReader xmlReader =null;
    private int stepCounter;
    private int xmlReadDepth=0;
    private int numberLiteralCounter=0;


//    private XMLReader(String fileName) {
//        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
//        try {
//            xmlStreamReader = xmlInputFactory.createXMLStreamReader(new FileReader(fileName));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

      private XMLReader(){


      }
    public static XMLReader getInstance(){
        if(xmlReader ==null){
            xmlReader = new XMLReader();
        }
        return xmlReader;
    }

    public int getNumberLiteralCounter(){
        return numberLiteralCounter;
    }
    public void incrementNumberLiteralCounter(){
        numberLiteralCounter++;
    }

    public void resetNumberLiteralCounter(){
        numberLiteralCounter=0;
    }



    public void initstepCounter(){
        stepCounter =0;
    }
    public void incrementDepth(){
        xmlReadDepth++;
    }
    public void decrementDepth(){
        xmlReadDepth--;
    }
    public int getXMLReadDepth(){
          return xmlReadDepth;
    }

    public void incrementstepCounter(){
        stepCounter++;
    }
    public int getStepCounter(){
        return stepCounter;
    }


    public boolean hasNextEvent() throws XMLStreamException {
       return xmlStreamReader.hasNext();
    }

    public XMLEventRepresentation getnextEvent() throws XMLStreamException {
        return processReading();
    }
    public void setXmlStreamReader(OMElement omElement){
     xmlStreamReader = omElement.getXMLStreamReader();
    }

    private XMLEventRepresentation processReading() throws XMLStreamException {



        if (xmlStreamReader.hasNext()) {
            XMLEventRepresentation xmlEventRepresentation = new XMLEventRepresentation();
            switch (xmlStreamReader.getEventType()) {

                case XMLStreamConstants.START_ELEMENT:
                    xmlEventRepresentation.setType(XMLStreamConstants.START_ELEMENT);
                    //System.out.print("<");
                    fillName(xmlStreamReader, xmlEventRepresentation);
                    fillNamespaces(xmlStreamReader, xmlEventRepresentation);
                    fillAttributes(xmlStreamReader, xmlEventRepresentation);
                     fillElementValue(xmlStreamReader,xmlEventRepresentation);
                    // System.out.print(">");
                     return  xmlEventRepresentation;


                case XMLStreamConstants.END_ELEMENT:
                    //  System.out.print("</");
                    xmlEventRepresentation.setType(XMLStreamConstants.END_ELEMENT);
                    fillName(xmlStreamReader, xmlEventRepresentation);
                    //  System.out.print(">");
                    break;

                case XMLStreamConstants.SPACE:

                case XMLStreamConstants.CHARACTERS:
                    int start = xmlStreamReader.getTextStart();
                    int length = xmlStreamReader.getTextLength();
//                System.out.print(new String(xmlStreamReader.getTextCharacters(),
//                        start,
//                        length));
                    xmlEventRepresentation.setType(XMLStreamConstants.CHARACTERS);
                    xmlEventRepresentation.setNameValue(new String(xmlStreamReader.getTextCharacters(), start, length));
                    break;

                case XMLStreamConstants.PROCESSING_INSTRUCTION:
                    // System.out.print("<?");
                    if (xmlStreamReader.hasText()) {
                        System.out.print(xmlStreamReader.getText());
                        xmlEventRepresentation.setNameValue(xmlStreamReader.getText());
                    }
                    xmlEventRepresentation.setType(XMLStreamConstants.PROCESSING_INSTRUCTION);
                    // System.out.print("?>");
                    break;

                case XMLStreamConstants.CDATA:
                    System.out.print("<![CDATA[");
                    start = xmlStreamReader.getTextStart();
                    length = xmlStreamReader.getTextLength();
                    System.out.print(new String(xmlStreamReader.getTextCharacters(),
                            start,
                            length));
                    System.out.print("]]>");

                    xmlEventRepresentation.setType(XMLStreamConstants.CDATA);
                    xmlEventRepresentation.setNameValue(new String(xmlStreamReader.getTextCharacters(), start, length));
                    break;

                case XMLStreamConstants.COMMENT:
                  //  System.out.print("<!--");
                    if (xmlStreamReader.hasText()) {
//                        System.out.print(xmlStreamReader.getText());
//                        System.out.print("-->");

                        xmlEventRepresentation.setNameValue(xmlStreamReader.getText());
                    }
                    xmlEventRepresentation.setType(XMLStreamConstants.COMMENT);
                    break;

                case XMLStreamConstants.ENTITY_REFERENCE:
                  //  System.out.print(xmlStreamReader.getLocalName() + "=");
                    if (xmlStreamReader.hasText()) {
                       // System.out.print("[" + xmlStreamReader.getText() + "]");

                        xmlEventRepresentation.setNameValue(xmlStreamReader.getText());
                    }
                    xmlEventRepresentation.setType(XMLStreamConstants.ENTITY_REFERENCE);
                    break;


                case XMLStreamConstants.START_DOCUMENT:
                    xmlEventRepresentation.setType(XMLStreamConstants.START_DOCUMENT);
//                    System.out.print("<?xml");
//                    System.out.print(" version='" + xmlStreamReader.getVersion() + "'");
                    xmlEventRepresentation.setVersion(xmlStreamReader.getVersion());
                  //  System.out.print(" encoding='" + xmlStreamReader.getCharacterEncodingScheme() + "'");
                    xmlEventRepresentation.setCharacterEncoding(xmlStreamReader.getCharacterEncodingScheme());
                    if (xmlStreamReader.isStandalone()) {
                      //  System.out.print(" standalone='yes'");
                        xmlEventRepresentation.setStandalone(true);
                    } else
                       // System.out.print(" standalone='no'");
                   // System.out.print("?>");
                    break;

            }


            xmlStreamReader.next();
         return xmlEventRepresentation;
        }

      return null;
    }

    private static XMLEventRepresentation fillName(XMLStreamReader xmlr, XMLEventRepresentation xmlEventRepresentation) {
        if (xmlr.hasName()) {
            String prefix = xmlr.getPrefix();
            String uri = xmlr.getNamespaceURI();
            String localName = xmlr.getLocalName();
            xmlEventRepresentation.setPrefix(prefix);
            xmlEventRepresentation.setUri(uri);
            xmlEventRepresentation.setLocalName(localName);
//            fillName(prefix, uri, localName);
        }
        return xmlEventRepresentation;
    }

//    private static void fillName(String prefix,
//                                 String uri,
//                                 String localName) {
//        if (uri != null && !("".equals(uri)) ) System.out.print("['"+uri+"']:");
//        if (prefix != null) System.out.print(prefix+":");
//        if (localName != null) System.out.print(localName);
//    }

    private static void fillAttributes(XMLStreamReader xmlr, XMLEventRepresentation xmlEventRepresentation) {
        Map<String, AttributeUtil> map = new HashMap<String, AttributeUtil>();
        for (int i = 0; i < xmlr.getAttributeCount(); i++) {
            fillAttribute(xmlr, i, map);
        }
        xmlEventRepresentation.setAttributeMap(map);
    }

    private static void fillAttribute(XMLStreamReader xmlr, int index, Map<String, AttributeUtil> map) {
        String prefix = xmlr.getAttributePrefix(index);
        String namespace = xmlr.getAttributeNamespace(index);
        String localName = xmlr.getAttributeLocalName(index);
        String value = xmlr.getAttributeValue(index);
        map.put(localName, new AttributeUtil(prefix,localName,value,namespace));

        // System.out.print(" ");
        // fillName(prefix, namespace, localName);
        // System.out.print("='"+value+"'");
    }

    private static void fillNamespaces(XMLStreamReader xmlr, XMLEventRepresentation xmlEventRepresentation) {
        Map<String, NameSpaceUtil> map = new HashMap<String, NameSpaceUtil>();
        for (int i = 0; i < xmlr.getNamespaceCount(); i++) {
            fillNamespace(xmlr, i, map);
        }
        xmlEventRepresentation.setNamespaceMap(map);
    }

    private static void fillNamespace(XMLStreamReader xmlr, int index, Map<String, NameSpaceUtil> map) {
        String prefix = xmlr.getNamespacePrefix(index);


        String uri = xmlr.getNamespaceURI(index);
        String urione = uri + "|" + String.valueOf(index);


        map.put(urione, new NameSpaceUtil(prefix,uri));
    }

    private static void fillElementValue(XMLStreamReader xmlr, XMLEventRepresentation xmlEventRepresentation) throws XMLStreamException {
        xmlr.next();
        while(xmlr.hasNext()&& xmlr.getEventType()==XMLStreamConstants.CHARACTERS){
            int start = xmlr.getTextStart();
            int length = xmlr.getTextLength();
//                System.out.print(new String(xmlStreamReader.getTextCharacters(),
//                        start,
//                        length));

           String value = new String(xmlr.getTextCharacters(), start, length);
            if(value.equals("\n\t")){

            }else if(value.equals("\n\t\t")){

            }else{
                xmlEventRepresentation.setNameValue(value);
            }



            xmlr.next();

        }



    }

}
