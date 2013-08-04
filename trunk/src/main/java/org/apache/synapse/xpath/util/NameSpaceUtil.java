package org.apache.synapse.xpath.util;


public class NameSpaceUtil {

    private String prefix;
    private String uri;

    public NameSpaceUtil(String prefix,String uri){
        this.prefix = prefix;
        this.uri =uri;

    }

    public String getPrefix() {
        return prefix;
    }

    public String getUri() {
        return uri;
    }
}
