package org.apache.synapse.xpath.util;


public class AttributeUtil {

    private String prefix;
    private String localname;
    private String value;
    private String  nameSpace;

    public AttributeUtil(String prefix,String localname,String value,String nameSpace){
        this.localname =localname;
        this.prefix = prefix;
        this.value = value;
        this.nameSpace= nameSpace;

    }

    public String getPrefix() {
        return prefix;
    }

    public String getLocalname() {
        return localname;
    }

    public String getValue() {
        return value;
    }

    public String getNameSpace() {
        return nameSpace;
    }
}
