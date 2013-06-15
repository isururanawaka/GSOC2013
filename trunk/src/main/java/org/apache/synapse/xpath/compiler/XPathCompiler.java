package org.apache.synapse.xpath.compiler;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.apache.synapse.xpath.compiler.exception.XPathParserException;
import org.apache.synapse.xpath.expression.XpathExpr;

/**
 * Created by IntelliJ IDEA.
 * User: isuru
 * Date: 5/10/13
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class XPathCompiler {


        public static XpathExpr parse(String source) throws XPathParserException {
        try {
            XPath1Lexer lexer = new XPath1Lexer();
            lexer.setCharStream(new ANTLRStringStream(source));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            XPath1Parser parser = new XPath1Parser(tokens);

              XPath1Parser.xpath_return r = parser.xpath();
            CommonTree t = (CommonTree) r.getTree();

            CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
            nodes.setTokenStream(tokens);
            XPath1Walker walker = new XPath1Walker(nodes);
            return walker.xpath();
        } catch (Throwable e) {
            throw new XPathParserException(e.getMessage(), e);
        }
    }

}
