package org.apache.synapse.xpath.util;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 6/5/13
 * Time: 10:54 AM
 * To change this template use File | Settings | File Templates.
 */
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
