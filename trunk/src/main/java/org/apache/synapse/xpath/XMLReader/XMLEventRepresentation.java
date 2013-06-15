package org.apache.synapse.xpath.XMLReader;


import org.apache.synapse.xpath.util.AttributeUtil;
import org.apache.synapse.xpath.util.NameSpaceUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 5/17/13
 * Time: 11:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class XMLEventRepresentation{

 private String nameValue;
 private int type;
 private String  prefix;
 private String uri;
 private String localName;
 private String version;
 private String characterEncoding;
 private boolean standalone =false;
 private Map<String,AttributeUtil> attributeMap = new HashMap<String, AttributeUtil>();
 private Map<String,NameSpaceUtil> namespaceMap = new HashMap<String, NameSpaceUtil>();

 public XMLEventRepresentation(String namevalue,int type,String prefix,String uri,String localName,String version,String characterEncoding,Map<String,AttributeUtil> attributeMap
 ,Map<String,NameSpaceUtil> namespaceMap){
     this.nameValue = namevalue;
     this.type = type;
     this.prefix =prefix;
     this.uri = uri;
     this.localName = localName;
     this.attributeMap = attributeMap;
     this.namespaceMap = namespaceMap;
     this.version = version;
     this.characterEncoding = characterEncoding;

 }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCharacterEncoding() {
        return characterEncoding;
    }

    public void setCharacterEncoding(String characterEncoding) {
        this.characterEncoding = characterEncoding;
    }

    public XMLEventRepresentation(){

    }

    public int getType() {
        return type;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public void setAttributeMap(Map<String, AttributeUtil> attributeMap) {
        this.attributeMap = attributeMap;
    }

    public void setNamespaceMap(Map<String, NameSpaceUtil> namespaceMap) {
        this.namespaceMap = namespaceMap;
    }

    public String getPrefix() {

        return prefix;
    }

    public String getUri() {
        return uri;
    }

    public String getLocalName() {
        return localName;
    }

    public Map<String, AttributeUtil> getAttributeMap() {
        return attributeMap;
    }

    public Map<String, NameSpaceUtil> getNamespaceMap() {
        return namespaceMap;
    }

    public String getNameValue() {

        return nameValue;
    }

    public boolean isStandalone() {
        return standalone;
    }

    public void setStandalone(boolean standalone) {
        this.standalone = standalone;
    }
}
