package org.apache.synapse.xpath.compiler.exception;

/**
 * Created by IntelliJ IDEA.
 * User: isuru
 * Date: 5/10/13
 * Time: 5:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class XPathParserException extends RuntimeException{
    public XPathParserException(String message, Throwable throwable){
        super(message,throwable);
    }

}
