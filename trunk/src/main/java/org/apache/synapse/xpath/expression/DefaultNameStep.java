package org.apache.synapse.xpath.expression;

import org.apache.synapse.xpath.expression.axis.Axis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isuru
 * Date: 4/19/13
 * Time: 11:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultNameStep extends DefaultStep implements NameStep {


    private String prefix;


    private String localName;


    private boolean matchesAnyName;


    private boolean hasPrefix;

    /**
     * Constructor.
     *
     * @param axis  the axis to work through
     * @param prefix  the name prefix
     * @param localName  the local name
     * @param predicateSet  the set of predicates
     */
    public DefaultNameStep(Axis axis,
                           String prefix,
                           String localName,
                           PredicateSet predicateSet) {
        super(axis, predicateSet);

        this.prefix = prefix;
        this.localName = localName;
        this.matchesAnyName = "*".equals(localName);
        this.hasPrefix = (this.prefix != null && this.prefix.length() > 0);
    }


    public String getPrefix() {
        return this.prefix;
    }


    public String getLocalName() {
        return this.localName;
    }


    public boolean isMatchesAnyName() {
        return matchesAnyName;
    }


    public String getText() {
        StringBuffer buf = new StringBuffer(64);
        buf.append(getAxisName()).append("::");
        if (getPrefix() != null && getPrefix().length() > 0) {
            buf.append(getPrefix()).append(':');
        }
        return buf.append(getLocalName()).append(super.getText()).toString();
    }


    private boolean hasNamespace(String uri) {
        return (uri != null && uri.length() > 0);
    }


    protected boolean matchesNamespaceURIs(String uri1, String uri2) {
        if (uri1 == uri2) {
            return true;
        }
        if (uri1 == null) {
            return (uri2.length() == 0);
        }
        if (uri2 == null) {
            return (uri1.length() == 0);
        }
        return uri1.equals(uri2);
    }

    public String toString() {
        String prefix = getPrefix();
        String qName = "".equals(prefix) ? getLocalName() : getPrefix() + ":" + getLocalName();
        return "[(DefaultNameStep): " +  qName +  "]";
    }

}
