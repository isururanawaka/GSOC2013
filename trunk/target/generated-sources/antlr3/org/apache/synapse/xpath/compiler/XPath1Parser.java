// $ANTLR 3.4 org/apache/synapse/xpath/compiler/XPath1.g 2013-06-15 10:20:38

	package org.apache.synapse.xpath.compiler;




import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class XPath1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABBREVIATED_AXIS_STEP", "ANDEXPR", "ANY_NAMESPACED_NODE", "ANY_NODE", "ATTRIBUTE_AXIS", "AXISSPEC", "AbbreviatedAxisSpecifier", "AbbreviatedStep", "And", "AxisName", "AxisNameSeparator", "Colon", "Comma", "DecimalLiteral", "DoubleLiteral", "EQUEXPRESSION", "EXPRLIST", "EqualityOp", "FILTER", "FUNCALL", "IntegerLiteral", "LOCATION_PATH", "LeftParenthesis", "LeftSquareBracket", "Letter", "MULEXPRESSION", "MultiplicativeOP", "NAMED_AXIS_STEP", "NAME_AXIS", "NCName", "NUMBER", "NameSpacedQNAME", "NodeType", "OREXPR", "Or", "PREDI", "PREDICATE", "Pipe", "ProcessingInstruction", "QNAME", "QNAME_PREDICATE", "RELATIVELOC", "RELEXPRESSION", "RecursiveAxisStep", "RelationalOp", "RightParenthesis", "RightSquareBracket", "SIMPLE_AXIS_STEP", "STRING", "SingleAxisStep", "Star", "StringLiteral", "UNARYEXPRESSION", "UNIONEXPR", "UnaryOp", "VARREF", "VariableReference", "WS", "'-'"
    };

    public static final int EOF=-1;
    public static final int T__62=62;
    public static final int ABBREVIATED_AXIS_STEP=4;
    public static final int ANDEXPR=5;
    public static final int ANY_NAMESPACED_NODE=6;
    public static final int ANY_NODE=7;
    public static final int ATTRIBUTE_AXIS=8;
    public static final int AXISSPEC=9;
    public static final int AbbreviatedAxisSpecifier=10;
    public static final int AbbreviatedStep=11;
    public static final int And=12;
    public static final int AxisName=13;
    public static final int AxisNameSeparator=14;
    public static final int Colon=15;
    public static final int Comma=16;
    public static final int DecimalLiteral=17;
    public static final int DoubleLiteral=18;
    public static final int EQUEXPRESSION=19;
    public static final int EXPRLIST=20;
    public static final int EqualityOp=21;
    public static final int FILTER=22;
    public static final int FUNCALL=23;
    public static final int IntegerLiteral=24;
    public static final int LOCATION_PATH=25;
    public static final int LeftParenthesis=26;
    public static final int LeftSquareBracket=27;
    public static final int Letter=28;
    public static final int MULEXPRESSION=29;
    public static final int MultiplicativeOP=30;
    public static final int NAMED_AXIS_STEP=31;
    public static final int NAME_AXIS=32;
    public static final int NCName=33;
    public static final int NUMBER=34;
    public static final int NameSpacedQNAME=35;
    public static final int NodeType=36;
    public static final int OREXPR=37;
    public static final int Or=38;
    public static final int PREDI=39;
    public static final int PREDICATE=40;
    public static final int Pipe=41;
    public static final int ProcessingInstruction=42;
    public static final int QNAME=43;
    public static final int QNAME_PREDICATE=44;
    public static final int RELATIVELOC=45;
    public static final int RELEXPRESSION=46;
    public static final int RecursiveAxisStep=47;
    public static final int RelationalOp=48;
    public static final int RightParenthesis=49;
    public static final int RightSquareBracket=50;
    public static final int SIMPLE_AXIS_STEP=51;
    public static final int STRING=52;
    public static final int SingleAxisStep=53;
    public static final int Star=54;
    public static final int StringLiteral=55;
    public static final int UNARYEXPRESSION=56;
    public static final int UNIONEXPR=57;
    public static final int UnaryOp=58;
    public static final int VARREF=59;
    public static final int VariableReference=60;
    public static final int WS=61;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public XPath1Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public XPath1Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return XPath1Parser.tokenNames; }
    public String getGrammarFileName() { return "org/apache/synapse/xpath/compiler/XPath1.g"; }


    public static class xpath_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xpath"
    // org/apache/synapse/xpath/compiler/XPath1.g:46:1: xpath : locationPath ;
    public final XPath1Parser.xpath_return xpath() throws RecognitionException {
        XPath1Parser.xpath_return retval = new XPath1Parser.xpath_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.locationPath_return locationPath1 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:46:6: ( locationPath )
            // org/apache/synapse/xpath/compiler/XPath1.g:46:8: locationPath
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_locationPath_in_xpath236);
            locationPath1=locationPath();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, locationPath1.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "xpath"


    public static class locationPath_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "locationPath"
    // org/apache/synapse/xpath/compiler/XPath1.g:48:1: locationPath : ( relativeLocationPath | absoluteLocationPath );
    public final XPath1Parser.locationPath_return locationPath() throws RecognitionException {
        XPath1Parser.locationPath_return retval = new XPath1Parser.locationPath_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.relativeLocationPath_return relativeLocationPath2 =null;

        XPath1Parser.absoluteLocationPath_return absoluteLocationPath3 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:49:5: ( relativeLocationPath | absoluteLocationPath )
            int alt1=2;
            switch ( input.LA(1) ) {
            case AbbreviatedAxisSpecifier:
            case AbbreviatedStep:
            case AxisName:
            case NCName:
            case NodeType:
            case ProcessingInstruction:
            case Star:
                {
                alt1=1;
                }
                break;
            case RecursiveAxisStep:
            case SingleAxisStep:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:49:7: relativeLocationPath
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_relativeLocationPath_in_locationPath249);
                    relativeLocationPath2=relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relativeLocationPath2.getTree());

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:50:7: absoluteLocationPath
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_absoluteLocationPath_in_locationPath257);
                    absoluteLocationPath3=absoluteLocationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, absoluteLocationPath3.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "locationPath"


    public static class absoluteLocationPath_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "absoluteLocationPath"
    // org/apache/synapse/xpath/compiler/XPath1.g:53:1: absoluteLocationPath : ( SingleAxisStep | SingleAxisStep relativeLocationPath -> ^( RELATIVELOC SingleAxisStep relativeLocationPath ) | abbreviatedAbsoluteLocationPath );
    public final XPath1Parser.absoluteLocationPath_return absoluteLocationPath() throws RecognitionException {
        XPath1Parser.absoluteLocationPath_return retval = new XPath1Parser.absoluteLocationPath_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SingleAxisStep4=null;
        Token SingleAxisStep5=null;
        XPath1Parser.relativeLocationPath_return relativeLocationPath6 =null;

        XPath1Parser.abbreviatedAbsoluteLocationPath_return abbreviatedAbsoluteLocationPath7 =null;


        CommonTree SingleAxisStep4_tree=null;
        CommonTree SingleAxisStep5_tree=null;
        RewriteRuleTokenStream stream_SingleAxisStep=new RewriteRuleTokenStream(adaptor,"token SingleAxisStep");
        RewriteRuleSubtreeStream stream_relativeLocationPath=new RewriteRuleSubtreeStream(adaptor,"rule relativeLocationPath");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:54:5: ( SingleAxisStep | SingleAxisStep relativeLocationPath -> ^( RELATIVELOC SingleAxisStep relativeLocationPath ) | abbreviatedAbsoluteLocationPath )
            int alt2=3;
            switch ( input.LA(1) ) {
            case SingleAxisStep:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case And:
                case Comma:
                case EqualityOp:
                case MultiplicativeOP:
                case Or:
                case Pipe:
                case RelationalOp:
                case RightParenthesis:
                case RightSquareBracket:
                case UnaryOp:
                    {
                    alt2=1;
                    }
                    break;
                case AbbreviatedAxisSpecifier:
                case AbbreviatedStep:
                case AxisName:
                case NCName:
                case NodeType:
                case ProcessingInstruction:
                case Star:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }

                }
                break;
            case RecursiveAxisStep:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:54:6: SingleAxisStep
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    SingleAxisStep4=(Token)match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_absoluteLocationPath277); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SingleAxisStep4_tree = 
                    (CommonTree)adaptor.create(SingleAxisStep4)
                    ;
                    adaptor.addChild(root_0, SingleAxisStep4_tree);
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:55:7: SingleAxisStep relativeLocationPath
                    {
                    SingleAxisStep5=(Token)match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_absoluteLocationPath285); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SingleAxisStep.add(SingleAxisStep5);


                    pushFollow(FOLLOW_relativeLocationPath_in_absoluteLocationPath287);
                    relativeLocationPath6=relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relativeLocationPath.add(relativeLocationPath6.getTree());

                    // AST REWRITE
                    // elements: relativeLocationPath, SingleAxisStep
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 55:47: -> ^( RELATIVELOC SingleAxisStep relativeLocationPath )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:55:49: ^( RELATIVELOC SingleAxisStep relativeLocationPath )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(RELATIVELOC, "RELATIVELOC")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_SingleAxisStep.nextNode()
                        );

                        adaptor.addChild(root_1, stream_relativeLocationPath.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:56:7: abbreviatedAbsoluteLocationPath
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_abbreviatedAbsoluteLocationPath_in_absoluteLocationPath309);
                    abbreviatedAbsoluteLocationPath7=abbreviatedAbsoluteLocationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abbreviatedAbsoluteLocationPath7.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "absoluteLocationPath"


    public static class abbreviatedAbsoluteLocationPath_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "abbreviatedAbsoluteLocationPath"
    // org/apache/synapse/xpath/compiler/XPath1.g:59:1: abbreviatedAbsoluteLocationPath : RecursiveAxisStep relativeLocationPath -> ^( RecursiveAxisStep relativeLocationPath ) ;
    public final XPath1Parser.abbreviatedAbsoluteLocationPath_return abbreviatedAbsoluteLocationPath() throws RecognitionException {
        XPath1Parser.abbreviatedAbsoluteLocationPath_return retval = new XPath1Parser.abbreviatedAbsoluteLocationPath_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RecursiveAxisStep8=null;
        XPath1Parser.relativeLocationPath_return relativeLocationPath9 =null;


        CommonTree RecursiveAxisStep8_tree=null;
        RewriteRuleTokenStream stream_RecursiveAxisStep=new RewriteRuleTokenStream(adaptor,"token RecursiveAxisStep");
        RewriteRuleSubtreeStream stream_relativeLocationPath=new RewriteRuleSubtreeStream(adaptor,"rule relativeLocationPath");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:59:32: ( RecursiveAxisStep relativeLocationPath -> ^( RecursiveAxisStep relativeLocationPath ) )
            // org/apache/synapse/xpath/compiler/XPath1.g:59:34: RecursiveAxisStep relativeLocationPath
            {
            RecursiveAxisStep8=(Token)match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_abbreviatedAbsoluteLocationPath321); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RecursiveAxisStep.add(RecursiveAxisStep8);


            pushFollow(FOLLOW_relativeLocationPath_in_abbreviatedAbsoluteLocationPath323);
            relativeLocationPath9=relativeLocationPath();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_relativeLocationPath.add(relativeLocationPath9.getTree());

            // AST REWRITE
            // elements: RecursiveAxisStep, relativeLocationPath
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 59:74: -> ^( RecursiveAxisStep relativeLocationPath )
            {
                // org/apache/synapse/xpath/compiler/XPath1.g:59:76: ^( RecursiveAxisStep relativeLocationPath )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_RecursiveAxisStep.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_relativeLocationPath.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "abbreviatedAbsoluteLocationPath"


    public static class relativeLocationPath_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relativeLocationPath"
    // org/apache/synapse/xpath/compiler/XPath1.g:61:1: relativeLocationPath : ( step ( ( SingleAxisStep relativeLocationPathrec ) -> ^( SingleAxisStep step relativeLocationPathrec ) | ( RecursiveAxisStep relativeLocationPathrec ) -> ^( RecursiveAxisStep step relativeLocationPathrec ) ) | step );
    public final XPath1Parser.relativeLocationPath_return relativeLocationPath() throws RecognitionException {
        XPath1Parser.relativeLocationPath_return retval = new XPath1Parser.relativeLocationPath_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SingleAxisStep11=null;
        Token RecursiveAxisStep13=null;
        XPath1Parser.step_return step10 =null;

        XPath1Parser.relativeLocationPathrec_return relativeLocationPathrec12 =null;

        XPath1Parser.relativeLocationPathrec_return relativeLocationPathrec14 =null;

        XPath1Parser.step_return step15 =null;


        CommonTree SingleAxisStep11_tree=null;
        CommonTree RecursiveAxisStep13_tree=null;
        RewriteRuleTokenStream stream_SingleAxisStep=new RewriteRuleTokenStream(adaptor,"token SingleAxisStep");
        RewriteRuleTokenStream stream_RecursiveAxisStep=new RewriteRuleTokenStream(adaptor,"token RecursiveAxisStep");
        RewriteRuleSubtreeStream stream_relativeLocationPathrec=new RewriteRuleSubtreeStream(adaptor,"rule relativeLocationPathrec");
        RewriteRuleSubtreeStream stream_step=new RewriteRuleSubtreeStream(adaptor,"rule step");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:62:5: ( step ( ( SingleAxisStep relativeLocationPathrec ) -> ^( SingleAxisStep step relativeLocationPathrec ) | ( RecursiveAxisStep relativeLocationPathrec ) -> ^( RecursiveAxisStep step relativeLocationPathrec ) ) | step )
            int alt4=2;
            switch ( input.LA(1) ) {
            case AxisName:
                {
                int LA4_1 = input.LA(2);

                if ( (synpred5_XPath1()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
                }
                break;
            case AbbreviatedAxisSpecifier:
                {
                int LA4_2 = input.LA(2);

                if ( (synpred5_XPath1()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
                }
                break;
            case Star:
                {
                int LA4_3 = input.LA(2);

                if ( (synpred5_XPath1()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;

                }
                }
                break;
            case NCName:
                {
                int LA4_4 = input.LA(2);

                if ( (synpred5_XPath1()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;

                }
                }
                break;
            case NodeType:
                {
                int LA4_5 = input.LA(2);

                if ( (synpred5_XPath1()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;

                }
                }
                break;
            case ProcessingInstruction:
                {
                int LA4_6 = input.LA(2);

                if ( (synpred5_XPath1()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 6, input);

                    throw nvae;

                }
                }
                break;
            case AbbreviatedStep:
                {
                int LA4_7 = input.LA(2);

                if ( (synpred5_XPath1()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 7, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:62:7: step ( ( SingleAxisStep relativeLocationPathrec ) -> ^( SingleAxisStep step relativeLocationPathrec ) | ( RecursiveAxisStep relativeLocationPathrec ) -> ^( RecursiveAxisStep step relativeLocationPathrec ) )
                    {
                    pushFollow(FOLLOW_step_in_relativeLocationPath344);
                    step10=step();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_step.add(step10.getTree());

                    // org/apache/synapse/xpath/compiler/XPath1.g:63:8: ( ( SingleAxisStep relativeLocationPathrec ) -> ^( SingleAxisStep step relativeLocationPathrec ) | ( RecursiveAxisStep relativeLocationPathrec ) -> ^( RecursiveAxisStep step relativeLocationPathrec ) )
                    int alt3=2;
                    switch ( input.LA(1) ) {
                    case SingleAxisStep:
                        {
                        alt3=1;
                        }
                        break;
                    case RecursiveAxisStep:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;

                    }

                    switch (alt3) {
                        case 1 :
                            // org/apache/synapse/xpath/compiler/XPath1.g:63:9: ( SingleAxisStep relativeLocationPathrec )
                            {
                            // org/apache/synapse/xpath/compiler/XPath1.g:63:9: ( SingleAxisStep relativeLocationPathrec )
                            // org/apache/synapse/xpath/compiler/XPath1.g:63:10: SingleAxisStep relativeLocationPathrec
                            {
                            SingleAxisStep11=(Token)match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_relativeLocationPath356); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SingleAxisStep.add(SingleAxisStep11);


                            pushFollow(FOLLOW_relativeLocationPathrec_in_relativeLocationPath359);
                            relativeLocationPathrec12=relativeLocationPathrec();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_relativeLocationPathrec.add(relativeLocationPathrec12.getTree());

                            }


                            // AST REWRITE
                            // elements: relativeLocationPathrec, step, SingleAxisStep
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 63:52: -> ^( SingleAxisStep step relativeLocationPathrec )
                            {
                                // org/apache/synapse/xpath/compiler/XPath1.g:63:54: ^( SingleAxisStep step relativeLocationPathrec )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(
                                stream_SingleAxisStep.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_step.nextTree());

                                adaptor.addChild(root_1, stream_relativeLocationPathrec.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 2 :
                            // org/apache/synapse/xpath/compiler/XPath1.g:64:9: ( RecursiveAxisStep relativeLocationPathrec )
                            {
                            // org/apache/synapse/xpath/compiler/XPath1.g:64:9: ( RecursiveAxisStep relativeLocationPathrec )
                            // org/apache/synapse/xpath/compiler/XPath1.g:64:10: RecursiveAxisStep relativeLocationPathrec
                            {
                            RecursiveAxisStep13=(Token)match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_relativeLocationPath381); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RecursiveAxisStep.add(RecursiveAxisStep13);


                            pushFollow(FOLLOW_relativeLocationPathrec_in_relativeLocationPath384);
                            relativeLocationPathrec14=relativeLocationPathrec();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_relativeLocationPathrec.add(relativeLocationPathrec14.getTree());

                            }


                            // AST REWRITE
                            // elements: relativeLocationPathrec, RecursiveAxisStep, step
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 64:54: -> ^( RecursiveAxisStep step relativeLocationPathrec )
                            {
                                // org/apache/synapse/xpath/compiler/XPath1.g:64:56: ^( RecursiveAxisStep step relativeLocationPathrec )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(
                                stream_RecursiveAxisStep.nextNode()
                                , root_1);

                                adaptor.addChild(root_1, stream_step.nextTree());

                                adaptor.addChild(root_1, stream_relativeLocationPathrec.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:66:9: step
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_step_in_relativeLocationPath413);
                    step15=step();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, step15.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relativeLocationPath"


    public static class relativeLocationPathrec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relativeLocationPathrec"
    // org/apache/synapse/xpath/compiler/XPath1.g:69:7: relativeLocationPathrec : relativeLocationPath ;
    public final XPath1Parser.relativeLocationPathrec_return relativeLocationPathrec() throws RecognitionException {
        XPath1Parser.relativeLocationPathrec_return retval = new XPath1Parser.relativeLocationPathrec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.relativeLocationPath_return relativeLocationPath16 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:69:31: ( relativeLocationPath )
            // org/apache/synapse/xpath/compiler/XPath1.g:69:34: relativeLocationPath
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relativeLocationPath_in_relativeLocationPathrec436);
            relativeLocationPath16=relativeLocationPath();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relativeLocationPath16.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relativeLocationPathrec"


    public static class step_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "step"
    // org/apache/synapse/xpath/compiler/XPath1.g:71:1: step : ( namedAxisStep predicate -> ^( QNAME_PREDICATE namedAxisStep predicate ) | namedAxisStep | abbreviatedAxisStep predicate -> ^( QNAME_PREDICATE abbreviatedAxisStep predicate ) abbreviatedAxisStep );
    public final XPath1Parser.step_return step() throws RecognitionException {
        XPath1Parser.step_return retval = new XPath1Parser.step_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.namedAxisStep_return namedAxisStep17 =null;

        XPath1Parser.predicate_return predicate18 =null;

        XPath1Parser.namedAxisStep_return namedAxisStep19 =null;

        XPath1Parser.abbreviatedAxisStep_return abbreviatedAxisStep20 =null;

        XPath1Parser.predicate_return predicate21 =null;


        RewriteRuleSubtreeStream stream_abbreviatedAxisStep=new RewriteRuleSubtreeStream(adaptor,"rule abbreviatedAxisStep");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        RewriteRuleSubtreeStream stream_namedAxisStep=new RewriteRuleSubtreeStream(adaptor,"rule namedAxisStep");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:72:5: ( namedAxisStep predicate -> ^( QNAME_PREDICATE namedAxisStep predicate ) | namedAxisStep | abbreviatedAxisStep predicate -> ^( QNAME_PREDICATE abbreviatedAxisStep predicate ) abbreviatedAxisStep )
            int alt5=3;
            switch ( input.LA(1) ) {
            case AxisName:
                {
                switch ( input.LA(2) ) {
                case AxisNameSeparator:
                    {
                    switch ( input.LA(3) ) {
                    case Star:
                        {
                        switch ( input.LA(4) ) {
                        case LeftSquareBracket:
                            {
                            alt5=1;
                            }
                            break;
                        case EOF:
                        case And:
                        case Comma:
                        case EqualityOp:
                        case MultiplicativeOP:
                        case Or:
                        case Pipe:
                        case RecursiveAxisStep:
                        case RelationalOp:
                        case RightParenthesis:
                        case RightSquareBracket:
                        case SingleAxisStep:
                        case UnaryOp:
                            {
                            alt5=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 9, input);

                            throw nvae;

                        }

                        }
                        break;
                    case NCName:
                        {
                        switch ( input.LA(4) ) {
                        case Colon:
                            {
                            switch ( input.LA(5) ) {
                            case Star:
                                {
                                switch ( input.LA(6) ) {
                                case LeftSquareBracket:
                                    {
                                    alt5=1;
                                    }
                                    break;
                                case EOF:
                                case And:
                                case Comma:
                                case EqualityOp:
                                case MultiplicativeOP:
                                case Or:
                                case Pipe:
                                case RecursiveAxisStep:
                                case RelationalOp:
                                case RightParenthesis:
                                case RightSquareBracket:
                                case SingleAxisStep:
                                case UnaryOp:
                                    {
                                    alt5=2;
                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 25, input);

                                    throw nvae;

                                }

                                }
                                break;
                            case NCName:
                                {
                                switch ( input.LA(6) ) {
                                case LeftSquareBracket:
                                    {
                                    alt5=1;
                                    }
                                    break;
                                case EOF:
                                case And:
                                case Comma:
                                case EqualityOp:
                                case MultiplicativeOP:
                                case Or:
                                case Pipe:
                                case RecursiveAxisStep:
                                case RelationalOp:
                                case RightParenthesis:
                                case RightSquareBracket:
                                case SingleAxisStep:
                                case UnaryOp:
                                    {
                                    alt5=2;
                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 26, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 18, input);

                                throw nvae;

                            }

                            }
                            break;
                        case LeftSquareBracket:
                            {
                            alt5=1;
                            }
                            break;
                        case EOF:
                        case And:
                        case Comma:
                        case EqualityOp:
                        case MultiplicativeOP:
                        case Or:
                        case Pipe:
                        case RecursiveAxisStep:
                        case RelationalOp:
                        case RightParenthesis:
                        case RightSquareBracket:
                        case SingleAxisStep:
                        case UnaryOp:
                            {
                            alt5=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 10, input);

                            throw nvae;

                        }

                        }
                        break;
                    case NodeType:
                        {
                        switch ( input.LA(4) ) {
                        case LeftParenthesis:
                            {
                            switch ( input.LA(5) ) {
                            case RightParenthesis:
                                {
                                switch ( input.LA(6) ) {
                                case LeftSquareBracket:
                                    {
                                    alt5=1;
                                    }
                                    break;
                                case EOF:
                                case And:
                                case Comma:
                                case EqualityOp:
                                case MultiplicativeOP:
                                case Or:
                                case Pipe:
                                case RecursiveAxisStep:
                                case RelationalOp:
                                case RightParenthesis:
                                case RightSquareBracket:
                                case SingleAxisStep:
                                case UnaryOp:
                                    {
                                    alt5=2;
                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 27, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 19, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 11, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ProcessingInstruction:
                        {
                        switch ( input.LA(4) ) {
                        case LeftParenthesis:
                            {
                            switch ( input.LA(5) ) {
                            case StringLiteral:
                                {
                                switch ( input.LA(6) ) {
                                case RightParenthesis:
                                    {
                                    switch ( input.LA(7) ) {
                                    case LeftSquareBracket:
                                        {
                                        alt5=1;
                                        }
                                        break;
                                    case EOF:
                                    case And:
                                    case Comma:
                                    case EqualityOp:
                                    case MultiplicativeOP:
                                    case Or:
                                    case Pipe:
                                    case RecursiveAxisStep:
                                    case RelationalOp:
                                    case RightParenthesis:
                                    case RightSquareBracket:
                                    case SingleAxisStep:
                                    case UnaryOp:
                                        {
                                        alt5=2;
                                        }
                                        break;
                                    default:
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 30, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 28, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 20, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 12, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 8, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }

                }
                break;
            case AbbreviatedAxisSpecifier:
                {
                switch ( input.LA(2) ) {
                case Star:
                    {
                    switch ( input.LA(3) ) {
                    case LeftSquareBracket:
                        {
                        alt5=1;
                        }
                        break;
                    case EOF:
                    case And:
                    case Comma:
                    case EqualityOp:
                    case MultiplicativeOP:
                    case Or:
                    case Pipe:
                    case RecursiveAxisStep:
                    case RelationalOp:
                    case RightParenthesis:
                    case RightSquareBracket:
                    case SingleAxisStep:
                    case UnaryOp:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 9, input);

                        throw nvae;

                    }

                    }
                    break;
                case NCName:
                    {
                    switch ( input.LA(3) ) {
                    case Colon:
                        {
                        switch ( input.LA(4) ) {
                        case Star:
                            {
                            switch ( input.LA(5) ) {
                            case LeftSquareBracket:
                                {
                                alt5=1;
                                }
                                break;
                            case EOF:
                            case And:
                            case Comma:
                            case EqualityOp:
                            case MultiplicativeOP:
                            case Or:
                            case Pipe:
                            case RecursiveAxisStep:
                            case RelationalOp:
                            case RightParenthesis:
                            case RightSquareBracket:
                            case SingleAxisStep:
                            case UnaryOp:
                                {
                                alt5=2;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 25, input);

                                throw nvae;

                            }

                            }
                            break;
                        case NCName:
                            {
                            switch ( input.LA(5) ) {
                            case LeftSquareBracket:
                                {
                                alt5=1;
                                }
                                break;
                            case EOF:
                            case And:
                            case Comma:
                            case EqualityOp:
                            case MultiplicativeOP:
                            case Or:
                            case Pipe:
                            case RecursiveAxisStep:
                            case RelationalOp:
                            case RightParenthesis:
                            case RightSquareBracket:
                            case SingleAxisStep:
                            case UnaryOp:
                                {
                                alt5=2;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 26, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 18, input);

                            throw nvae;

                        }

                        }
                        break;
                    case LeftSquareBracket:
                        {
                        alt5=1;
                        }
                        break;
                    case EOF:
                    case And:
                    case Comma:
                    case EqualityOp:
                    case MultiplicativeOP:
                    case Or:
                    case Pipe:
                    case RecursiveAxisStep:
                    case RelationalOp:
                    case RightParenthesis:
                    case RightSquareBracket:
                    case SingleAxisStep:
                    case UnaryOp:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 10, input);

                        throw nvae;

                    }

                    }
                    break;
                case NodeType:
                    {
                    switch ( input.LA(3) ) {
                    case LeftParenthesis:
                        {
                        switch ( input.LA(4) ) {
                        case RightParenthesis:
                            {
                            switch ( input.LA(5) ) {
                            case LeftSquareBracket:
                                {
                                alt5=1;
                                }
                                break;
                            case EOF:
                            case And:
                            case Comma:
                            case EqualityOp:
                            case MultiplicativeOP:
                            case Or:
                            case Pipe:
                            case RecursiveAxisStep:
                            case RelationalOp:
                            case RightParenthesis:
                            case RightSquareBracket:
                            case SingleAxisStep:
                            case UnaryOp:
                                {
                                alt5=2;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 27, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 19, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 11, input);

                        throw nvae;

                    }

                    }
                    break;
                case ProcessingInstruction:
                    {
                    switch ( input.LA(3) ) {
                    case LeftParenthesis:
                        {
                        switch ( input.LA(4) ) {
                        case StringLiteral:
                            {
                            switch ( input.LA(5) ) {
                            case RightParenthesis:
                                {
                                switch ( input.LA(6) ) {
                                case LeftSquareBracket:
                                    {
                                    alt5=1;
                                    }
                                    break;
                                case EOF:
                                case And:
                                case Comma:
                                case EqualityOp:
                                case MultiplicativeOP:
                                case Or:
                                case Pipe:
                                case RecursiveAxisStep:
                                case RelationalOp:
                                case RightParenthesis:
                                case RightSquareBracket:
                                case SingleAxisStep:
                                case UnaryOp:
                                    {
                                    alt5=2;
                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 30, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 28, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 20, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 12, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }

                }
                break;
            case Star:
                {
                switch ( input.LA(2) ) {
                case LeftSquareBracket:
                    {
                    alt5=1;
                    }
                    break;
                case EOF:
                case And:
                case Comma:
                case EqualityOp:
                case MultiplicativeOP:
                case Or:
                case Pipe:
                case RecursiveAxisStep:
                case RelationalOp:
                case RightParenthesis:
                case RightSquareBracket:
                case SingleAxisStep:
                case UnaryOp:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }

                }
                break;
            case NCName:
                {
                switch ( input.LA(2) ) {
                case Colon:
                    {
                    switch ( input.LA(3) ) {
                    case Star:
                        {
                        switch ( input.LA(4) ) {
                        case LeftSquareBracket:
                            {
                            alt5=1;
                            }
                            break;
                        case EOF:
                        case And:
                        case Comma:
                        case EqualityOp:
                        case MultiplicativeOP:
                        case Or:
                        case Pipe:
                        case RecursiveAxisStep:
                        case RelationalOp:
                        case RightParenthesis:
                        case RightSquareBracket:
                        case SingleAxisStep:
                        case UnaryOp:
                            {
                            alt5=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 21, input);

                            throw nvae;

                        }

                        }
                        break;
                    case NCName:
                        {
                        switch ( input.LA(4) ) {
                        case LeftSquareBracket:
                            {
                            alt5=1;
                            }
                            break;
                        case EOF:
                        case And:
                        case Comma:
                        case EqualityOp:
                        case MultiplicativeOP:
                        case Or:
                        case Pipe:
                        case RecursiveAxisStep:
                        case RelationalOp:
                        case RightParenthesis:
                        case RightSquareBracket:
                        case SingleAxisStep:
                        case UnaryOp:
                            {
                            alt5=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 22, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 15, input);

                        throw nvae;

                    }

                    }
                    break;
                case LeftSquareBracket:
                    {
                    alt5=1;
                    }
                    break;
                case EOF:
                case And:
                case Comma:
                case EqualityOp:
                case MultiplicativeOP:
                case Or:
                case Pipe:
                case RecursiveAxisStep:
                case RelationalOp:
                case RightParenthesis:
                case RightSquareBracket:
                case SingleAxisStep:
                case UnaryOp:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;

                }

                }
                break;
            case NodeType:
                {
                switch ( input.LA(2) ) {
                case LeftParenthesis:
                    {
                    switch ( input.LA(3) ) {
                    case RightParenthesis:
                        {
                        switch ( input.LA(4) ) {
                        case LeftSquareBracket:
                            {
                            alt5=1;
                            }
                            break;
                        case EOF:
                        case And:
                        case Comma:
                        case EqualityOp:
                        case MultiplicativeOP:
                        case Or:
                        case Pipe:
                        case RecursiveAxisStep:
                        case RelationalOp:
                        case RightParenthesis:
                        case RightSquareBracket:
                        case SingleAxisStep:
                        case UnaryOp:
                            {
                            alt5=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 23, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 16, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 5, input);

                    throw nvae;

                }

                }
                break;
            case ProcessingInstruction:
                {
                switch ( input.LA(2) ) {
                case LeftParenthesis:
                    {
                    switch ( input.LA(3) ) {
                    case StringLiteral:
                        {
                        switch ( input.LA(4) ) {
                        case RightParenthesis:
                            {
                            switch ( input.LA(5) ) {
                            case LeftSquareBracket:
                                {
                                alt5=1;
                                }
                                break;
                            case EOF:
                            case And:
                            case Comma:
                            case EqualityOp:
                            case MultiplicativeOP:
                            case Or:
                            case Pipe:
                            case RecursiveAxisStep:
                            case RelationalOp:
                            case RightParenthesis:
                            case RightSquareBracket:
                            case SingleAxisStep:
                            case UnaryOp:
                                {
                                alt5=2;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 29, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 24, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 17, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 6, input);

                    throw nvae;

                }

                }
                break;
            case AbbreviatedStep:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:72:7: namedAxisStep predicate
                    {
                    pushFollow(FOLLOW_namedAxisStep_in_step448);
                    namedAxisStep17=namedAxisStep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_namedAxisStep.add(namedAxisStep17.getTree());

                    pushFollow(FOLLOW_predicate_in_step450);
                    predicate18=predicate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_predicate.add(predicate18.getTree());

                    // AST REWRITE
                    // elements: namedAxisStep, predicate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 72:32: -> ^( QNAME_PREDICATE namedAxisStep predicate )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:72:34: ^( QNAME_PREDICATE namedAxisStep predicate )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(QNAME_PREDICATE, "QNAME_PREDICATE")
                        , root_1);

                        adaptor.addChild(root_1, stream_namedAxisStep.nextTree());

                        adaptor.addChild(root_1, stream_predicate.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:73:6: namedAxisStep
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_namedAxisStep_in_step468);
                    namedAxisStep19=namedAxisStep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedAxisStep19.getTree());

                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:74:7: abbreviatedAxisStep predicate
                    {
                    pushFollow(FOLLOW_abbreviatedAxisStep_in_step476);
                    abbreviatedAxisStep20=abbreviatedAxisStep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_abbreviatedAxisStep.add(abbreviatedAxisStep20.getTree());

                    pushFollow(FOLLOW_predicate_in_step479);
                    predicate21=predicate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_predicate.add(predicate21.getTree());

                    // AST REWRITE
                    // elements: abbreviatedAxisStep, abbreviatedAxisStep, predicate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 74:39: -> ^( QNAME_PREDICATE abbreviatedAxisStep predicate ) abbreviatedAxisStep
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:74:41: ^( QNAME_PREDICATE abbreviatedAxisStep predicate )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(QNAME_PREDICATE, "QNAME_PREDICATE")
                        , root_1);

                        adaptor.addChild(root_1, stream_abbreviatedAxisStep.nextTree());

                        adaptor.addChild(root_1, stream_predicate.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                        adaptor.addChild(root_0, stream_abbreviatedAxisStep.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "step"


    public static class abbreviatedAxisStep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "abbreviatedAxisStep"
    // org/apache/synapse/xpath/compiler/XPath1.g:79:1: abbreviatedAxisStep : AbbreviatedStep -> ^( ABBREVIATED_AXIS_STEP AbbreviatedStep ) ;
    public final XPath1Parser.abbreviatedAxisStep_return abbreviatedAxisStep() throws RecognitionException {
        XPath1Parser.abbreviatedAxisStep_return retval = new XPath1Parser.abbreviatedAxisStep_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AbbreviatedStep22=null;

        CommonTree AbbreviatedStep22_tree=null;
        RewriteRuleTokenStream stream_AbbreviatedStep=new RewriteRuleTokenStream(adaptor,"token AbbreviatedStep");

        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:80:5: ( AbbreviatedStep -> ^( ABBREVIATED_AXIS_STEP AbbreviatedStep ) )
            // org/apache/synapse/xpath/compiler/XPath1.g:80:7: AbbreviatedStep
            {
            AbbreviatedStep22=(Token)match(input,AbbreviatedStep,FOLLOW_AbbreviatedStep_in_abbreviatedAxisStep514); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AbbreviatedStep.add(AbbreviatedStep22);


            // AST REWRITE
            // elements: AbbreviatedStep
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 80:23: -> ^( ABBREVIATED_AXIS_STEP AbbreviatedStep )
            {
                // org/apache/synapse/xpath/compiler/XPath1.g:80:26: ^( ABBREVIATED_AXIS_STEP AbbreviatedStep )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ABBREVIATED_AXIS_STEP, "ABBREVIATED_AXIS_STEP")
                , root_1);

                adaptor.addChild(root_1, 
                stream_AbbreviatedStep.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "abbreviatedAxisStep"


    public static class namedAxisStep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namedAxisStep"
    // org/apache/synapse/xpath/compiler/XPath1.g:82:1: namedAxisStep : ( axisSpecifier nodeTest -> ^( NAMED_AXIS_STEP axisSpecifier nodeTest ) | nodeTest );
    public final XPath1Parser.namedAxisStep_return namedAxisStep() throws RecognitionException {
        XPath1Parser.namedAxisStep_return retval = new XPath1Parser.namedAxisStep_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.axisSpecifier_return axisSpecifier23 =null;

        XPath1Parser.nodeTest_return nodeTest24 =null;

        XPath1Parser.nodeTest_return nodeTest25 =null;


        RewriteRuleSubtreeStream stream_nodeTest=new RewriteRuleSubtreeStream(adaptor,"rule nodeTest");
        RewriteRuleSubtreeStream stream_axisSpecifier=new RewriteRuleSubtreeStream(adaptor,"rule axisSpecifier");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:83:5: ( axisSpecifier nodeTest -> ^( NAMED_AXIS_STEP axisSpecifier nodeTest ) | nodeTest )
            int alt6=2;
            switch ( input.LA(1) ) {
            case AbbreviatedAxisSpecifier:
            case AxisName:
                {
                alt6=1;
                }
                break;
            case NCName:
            case NodeType:
            case ProcessingInstruction:
            case Star:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:83:7: axisSpecifier nodeTest
                    {
                    pushFollow(FOLLOW_axisSpecifier_in_namedAxisStep534);
                    axisSpecifier23=axisSpecifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_axisSpecifier.add(axisSpecifier23.getTree());

                    pushFollow(FOLLOW_nodeTest_in_namedAxisStep536);
                    nodeTest24=nodeTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nodeTest.add(nodeTest24.getTree());

                    // AST REWRITE
                    // elements: axisSpecifier, nodeTest
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:30: -> ^( NAMED_AXIS_STEP axisSpecifier nodeTest )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:83:33: ^( NAMED_AXIS_STEP axisSpecifier nodeTest )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NAMED_AXIS_STEP, "NAMED_AXIS_STEP")
                        , root_1);

                        adaptor.addChild(root_1, stream_axisSpecifier.nextTree());

                        adaptor.addChild(root_1, stream_nodeTest.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:84:6: nodeTest
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_nodeTest_in_namedAxisStep554);
                    nodeTest25=nodeTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeTest25.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namedAxisStep"


    public static class axisSpecifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "axisSpecifier"
    // org/apache/synapse/xpath/compiler/XPath1.g:87:1: axisSpecifier : ( AxisName AxisNameSeparator -> ^( NAME_AXIS AxisName ) | AbbreviatedAxisSpecifier -> ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier ) );
    public final XPath1Parser.axisSpecifier_return axisSpecifier() throws RecognitionException {
        XPath1Parser.axisSpecifier_return retval = new XPath1Parser.axisSpecifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AxisName26=null;
        Token AxisNameSeparator27=null;
        Token AbbreviatedAxisSpecifier28=null;

        CommonTree AxisName26_tree=null;
        CommonTree AxisNameSeparator27_tree=null;
        CommonTree AbbreviatedAxisSpecifier28_tree=null;
        RewriteRuleTokenStream stream_AxisName=new RewriteRuleTokenStream(adaptor,"token AxisName");
        RewriteRuleTokenStream stream_AxisNameSeparator=new RewriteRuleTokenStream(adaptor,"token AxisNameSeparator");
        RewriteRuleTokenStream stream_AbbreviatedAxisSpecifier=new RewriteRuleTokenStream(adaptor,"token AbbreviatedAxisSpecifier");

        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:88:5: ( AxisName AxisNameSeparator -> ^( NAME_AXIS AxisName ) | AbbreviatedAxisSpecifier -> ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier ) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case AxisName:
                {
                alt7=1;
                }
                break;
            case AbbreviatedAxisSpecifier:
                {
                alt7=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:88:7: AxisName AxisNameSeparator
                    {
                    AxisName26=(Token)match(input,AxisName,FOLLOW_AxisName_in_axisSpecifier571); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AxisName.add(AxisName26);


                    AxisNameSeparator27=(Token)match(input,AxisNameSeparator,FOLLOW_AxisNameSeparator_in_axisSpecifier573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AxisNameSeparator.add(AxisNameSeparator27);


                    // AST REWRITE
                    // elements: AxisName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 88:34: -> ^( NAME_AXIS AxisName )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:88:37: ^( NAME_AXIS AxisName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NAME_AXIS, "NAME_AXIS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_AxisName.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:89:7: AbbreviatedAxisSpecifier
                    {
                    AbbreviatedAxisSpecifier28=(Token)match(input,AbbreviatedAxisSpecifier,FOLLOW_AbbreviatedAxisSpecifier_in_axisSpecifier589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AbbreviatedAxisSpecifier.add(AbbreviatedAxisSpecifier28);


                    // AST REWRITE
                    // elements: AbbreviatedAxisSpecifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 89:32: -> ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:89:35: ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ATTRIBUTE_AXIS, "ATTRIBUTE_AXIS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_AbbreviatedAxisSpecifier.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "axisSpecifier"


    public static class nodeTest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nodeTest"
    // org/apache/synapse/xpath/compiler/XPath1.g:92:1: nodeTest : ( nameTest | NodeType LeftParenthesis RightParenthesis -> ^( ANY_NODE NodeType ) | ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis -> ^( ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis ) );
    public final XPath1Parser.nodeTest_return nodeTest() throws RecognitionException {
        XPath1Parser.nodeTest_return retval = new XPath1Parser.nodeTest_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NodeType30=null;
        Token LeftParenthesis31=null;
        Token RightParenthesis32=null;
        Token ProcessingInstruction33=null;
        Token LeftParenthesis34=null;
        Token StringLiteral35=null;
        Token RightParenthesis36=null;
        XPath1Parser.nameTest_return nameTest29 =null;


        CommonTree NodeType30_tree=null;
        CommonTree LeftParenthesis31_tree=null;
        CommonTree RightParenthesis32_tree=null;
        CommonTree ProcessingInstruction33_tree=null;
        CommonTree LeftParenthesis34_tree=null;
        CommonTree StringLiteral35_tree=null;
        CommonTree RightParenthesis36_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_LeftParenthesis=new RewriteRuleTokenStream(adaptor,"token LeftParenthesis");
        RewriteRuleTokenStream stream_NodeType=new RewriteRuleTokenStream(adaptor,"token NodeType");
        RewriteRuleTokenStream stream_RightParenthesis=new RewriteRuleTokenStream(adaptor,"token RightParenthesis");
        RewriteRuleTokenStream stream_ProcessingInstruction=new RewriteRuleTokenStream(adaptor,"token ProcessingInstruction");

        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:93:2: ( nameTest | NodeType LeftParenthesis RightParenthesis -> ^( ANY_NODE NodeType ) | ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis -> ^( ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case NCName:
            case Star:
                {
                alt8=1;
                }
                break;
            case NodeType:
                {
                alt8=2;
                }
                break;
            case ProcessingInstruction:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:93:4: nameTest
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_nameTest_in_nodeTest611);
                    nameTest29=nameTest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameTest29.getTree());

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:94:4: NodeType LeftParenthesis RightParenthesis
                    {
                    NodeType30=(Token)match(input,NodeType,FOLLOW_NodeType_in_nodeTest617); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NodeType.add(NodeType30);


                    LeftParenthesis31=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_nodeTest619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LeftParenthesis.add(LeftParenthesis31);


                    RightParenthesis32=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_nodeTest621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RightParenthesis.add(RightParenthesis32);


                    // AST REWRITE
                    // elements: NodeType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 94:46: -> ^( ANY_NODE NodeType )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:94:49: ^( ANY_NODE NodeType )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ANY_NODE, "ANY_NODE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NodeType.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:95:4: ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis
                    {
                    ProcessingInstruction33=(Token)match(input,ProcessingInstruction,FOLLOW_ProcessingInstruction_in_nodeTest634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ProcessingInstruction.add(ProcessingInstruction33);


                    LeftParenthesis34=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_nodeTest636); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LeftParenthesis.add(LeftParenthesis34);


                    StringLiteral35=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_nodeTest638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral35);


                    RightParenthesis36=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_nodeTest640); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RightParenthesis.add(RightParenthesis36);


                    // AST REWRITE
                    // elements: LeftParenthesis, ProcessingInstruction, StringLiteral, RightParenthesis
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 95:74: -> ^( ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:95:76: ^( ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ProcessingInstruction.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_LeftParenthesis.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_StringLiteral.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_RightParenthesis.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nodeTest"


    public static class nameTest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nameTest"
    // org/apache/synapse/xpath/compiler/XPath1.g:98:1: nameTest : ( Star -> ^( ANY_NODE ) | NCName Colon Star -> ^( ANY_NAMESPACED_NODE NCName ) | qName );
    public final XPath1Parser.nameTest_return nameTest() throws RecognitionException {
        XPath1Parser.nameTest_return retval = new XPath1Parser.nameTest_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Star37=null;
        Token NCName38=null;
        Token Colon39=null;
        Token Star40=null;
        XPath1Parser.qName_return qName41 =null;


        CommonTree Star37_tree=null;
        CommonTree NCName38_tree=null;
        CommonTree Colon39_tree=null;
        CommonTree Star40_tree=null;
        RewriteRuleTokenStream stream_NCName=new RewriteRuleTokenStream(adaptor,"token NCName");
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
        RewriteRuleTokenStream stream_Star=new RewriteRuleTokenStream(adaptor,"token Star");

        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:99:5: ( Star -> ^( ANY_NODE ) | NCName Colon Star -> ^( ANY_NAMESPACED_NODE NCName ) | qName )
            int alt9=3;
            switch ( input.LA(1) ) {
            case Star:
                {
                alt9=1;
                }
                break;
            case NCName:
                {
                switch ( input.LA(2) ) {
                case Colon:
                    {
                    switch ( input.LA(3) ) {
                    case Star:
                        {
                        alt9=2;
                        }
                        break;
                    case NCName:
                        {
                        alt9=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case EOF:
                case And:
                case Comma:
                case EqualityOp:
                case LeftSquareBracket:
                case MultiplicativeOP:
                case Or:
                case Pipe:
                case RecursiveAxisStep:
                case RelationalOp:
                case RightParenthesis:
                case RightSquareBracket:
                case SingleAxisStep:
                case UnaryOp:
                    {
                    alt9=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:99:7: Star
                    {
                    Star37=(Token)match(input,Star,FOLLOW_Star_in_nameTest669); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Star.add(Star37);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 99:12: -> ^( ANY_NODE )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:99:15: ^( ANY_NODE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ANY_NODE, "ANY_NODE")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:100:7: NCName Colon Star
                    {
                    NCName38=(Token)match(input,NCName,FOLLOW_NCName_in_nameTest683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NCName.add(NCName38);


                    Colon39=(Token)match(input,Colon,FOLLOW_Colon_in_nameTest685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Colon.add(Colon39);


                    Star40=(Token)match(input,Star,FOLLOW_Star_in_nameTest687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Star.add(Star40);


                    // AST REWRITE
                    // elements: NCName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 100:25: -> ^( ANY_NAMESPACED_NODE NCName )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:100:28: ^( ANY_NAMESPACED_NODE NCName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ANY_NAMESPACED_NODE, "ANY_NAMESPACED_NODE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NCName.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:101:7: qName
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_qName_in_nameTest703);
                    qName41=qName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qName41.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nameTest"


    public static class predicate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicate"
    // org/apache/synapse/xpath/compiler/XPath1.g:104:1: predicate : LeftSquareBracket predicateExpr RightSquareBracket -> ^( PREDICATE predicateExpr ) ;
    public final XPath1Parser.predicate_return predicate() throws RecognitionException {
        XPath1Parser.predicate_return retval = new XPath1Parser.predicate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LeftSquareBracket42=null;
        Token RightSquareBracket44=null;
        XPath1Parser.predicateExpr_return predicateExpr43 =null;


        CommonTree LeftSquareBracket42_tree=null;
        CommonTree RightSquareBracket44_tree=null;
        RewriteRuleTokenStream stream_RightSquareBracket=new RewriteRuleTokenStream(adaptor,"token RightSquareBracket");
        RewriteRuleTokenStream stream_LeftSquareBracket=new RewriteRuleTokenStream(adaptor,"token LeftSquareBracket");
        RewriteRuleSubtreeStream stream_predicateExpr=new RewriteRuleSubtreeStream(adaptor,"rule predicateExpr");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:105:5: ( LeftSquareBracket predicateExpr RightSquareBracket -> ^( PREDICATE predicateExpr ) )
            // org/apache/synapse/xpath/compiler/XPath1.g:105:7: LeftSquareBracket predicateExpr RightSquareBracket
            {
            LeftSquareBracket42=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_predicate720); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LeftSquareBracket.add(LeftSquareBracket42);


            pushFollow(FOLLOW_predicateExpr_in_predicate722);
            predicateExpr43=predicateExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_predicateExpr.add(predicateExpr43.getTree());

            RightSquareBracket44=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_predicate724); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RightSquareBracket.add(RightSquareBracket44);


            // AST REWRITE
            // elements: predicateExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 105:58: -> ^( PREDICATE predicateExpr )
            {
                // org/apache/synapse/xpath/compiler/XPath1.g:105:61: ^( PREDICATE predicateExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PREDICATE, "PREDICATE")
                , root_1);

                adaptor.addChild(root_1, stream_predicateExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "predicate"


    public static class predicateExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predicateExpr"
    // org/apache/synapse/xpath/compiler/XPath1.g:108:1: predicateExpr : expr ;
    public final XPath1Parser.predicateExpr_return predicateExpr() throws RecognitionException {
        XPath1Parser.predicateExpr_return retval = new XPath1Parser.predicateExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.expr_return expr45 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:108:15: ( expr )
            // org/apache/synapse/xpath/compiler/XPath1.g:108:17: expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_predicateExpr745);
            expr45=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr45.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "predicateExpr"


    public static class functionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCall"
    // org/apache/synapse/xpath/compiler/XPath1.g:110:1: functionCall : qName LeftParenthesis ( expressionList )? RightParenthesis -> ^( FUNCALL qName ( ^( EXPRLIST expressionList ) )? ) ;
    public final XPath1Parser.functionCall_return functionCall() throws RecognitionException {
        XPath1Parser.functionCall_return retval = new XPath1Parser.functionCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LeftParenthesis47=null;
        Token RightParenthesis49=null;
        XPath1Parser.qName_return qName46 =null;

        XPath1Parser.expressionList_return expressionList48 =null;


        CommonTree LeftParenthesis47_tree=null;
        CommonTree RightParenthesis49_tree=null;
        RewriteRuleTokenStream stream_LeftParenthesis=new RewriteRuleTokenStream(adaptor,"token LeftParenthesis");
        RewriteRuleTokenStream stream_RightParenthesis=new RewriteRuleTokenStream(adaptor,"token RightParenthesis");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_qName=new RewriteRuleSubtreeStream(adaptor,"rule qName");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:111:2: ( qName LeftParenthesis ( expressionList )? RightParenthesis -> ^( FUNCALL qName ( ^( EXPRLIST expressionList ) )? ) )
            // org/apache/synapse/xpath/compiler/XPath1.g:111:4: qName LeftParenthesis ( expressionList )? RightParenthesis
            {
            pushFollow(FOLLOW_qName_in_functionCall758);
            qName46=qName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qName.add(qName46.getTree());

            LeftParenthesis47=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_functionCall760); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LeftParenthesis.add(LeftParenthesis47);


            // org/apache/synapse/xpath/compiler/XPath1.g:112:4: ( expressionList )?
            int alt10=2;
            switch ( input.LA(1) ) {
                case AbbreviatedAxisSpecifier:
                case AbbreviatedStep:
                case AxisName:
                case DecimalLiteral:
                case DoubleLiteral:
                case IntegerLiteral:
                case LeftParenthesis:
                case NCName:
                case NodeType:
                case ProcessingInstruction:
                case RecursiveAxisStep:
                case SingleAxisStep:
                case Star:
                case StringLiteral:
                case VariableReference:
                case 62:
                    {
                    alt10=1;
                    }
                    break;
            }

            switch (alt10) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:112:4: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_functionCall765);
                    expressionList48=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(expressionList48.getTree());

                    }
                    break;

            }


            RightParenthesis49=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_functionCall772); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RightParenthesis.add(RightParenthesis49);


            // AST REWRITE
            // elements: expressionList, qName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 113:21: -> ^( FUNCALL qName ( ^( EXPRLIST expressionList ) )? )
            {
                // org/apache/synapse/xpath/compiler/XPath1.g:113:24: ^( FUNCALL qName ( ^( EXPRLIST expressionList ) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, stream_qName.nextTree());

                // org/apache/synapse/xpath/compiler/XPath1.g:113:40: ( ^( EXPRLIST expressionList ) )?
                if ( stream_expressionList.hasNext() ) {
                    // org/apache/synapse/xpath/compiler/XPath1.g:113:41: ^( EXPRLIST expressionList )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(EXPRLIST, "EXPRLIST")
                    , root_2);

                    adaptor.addChild(root_2, stream_expressionList.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_expressionList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionCall"


    public static class expressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionList"
    // org/apache/synapse/xpath/compiler/XPath1.g:116:1: expressionList : expr ( Comma exprrec )* -> ^( expr ( ^( Comma exprrec ) )* ) ;
    public final XPath1Parser.expressionList_return expressionList() throws RecognitionException {
        XPath1Parser.expressionList_return retval = new XPath1Parser.expressionList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Comma51=null;
        XPath1Parser.expr_return expr50 =null;

        XPath1Parser.exprrec_return exprrec52 =null;


        CommonTree Comma51_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_exprrec=new RewriteRuleSubtreeStream(adaptor,"rule exprrec");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:117:5: ( expr ( Comma exprrec )* -> ^( expr ( ^( Comma exprrec ) )* ) )
            // org/apache/synapse/xpath/compiler/XPath1.g:117:7: expr ( Comma exprrec )*
            {
            pushFollow(FOLLOW_expr_in_expressionList804);
            expr50=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr50.getTree());

            // org/apache/synapse/xpath/compiler/XPath1.g:117:12: ( Comma exprrec )*
            loop11:
            do {
                int alt11=2;
                switch ( input.LA(1) ) {
                case Comma:
                    {
                    alt11=1;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // org/apache/synapse/xpath/compiler/XPath1.g:117:14: Comma exprrec
            	    {
            	    Comma51=(Token)match(input,Comma,FOLLOW_Comma_in_expressionList808); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Comma.add(Comma51);


            	    pushFollow(FOLLOW_exprrec_in_expressionList810);
            	    exprrec52=exprrec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprrec.add(exprrec52.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // AST REWRITE
            // elements: exprrec, Comma, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 117:31: -> ^( expr ( ^( Comma exprrec ) )* )
            {
                // org/apache/synapse/xpath/compiler/XPath1.g:117:34: ^( expr ( ^( Comma exprrec ) )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_expr.nextNode(), root_1);

                // org/apache/synapse/xpath/compiler/XPath1.g:117:41: ( ^( Comma exprrec ) )*
                while ( stream_exprrec.hasNext()||stream_Comma.hasNext() ) {
                    // org/apache/synapse/xpath/compiler/XPath1.g:117:42: ^( Comma exprrec )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    stream_Comma.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_exprrec.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_exprrec.reset();
                stream_Comma.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionList"


    public static class exprrec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprrec"
    // org/apache/synapse/xpath/compiler/XPath1.g:119:1: exprrec : expr ;
    public final XPath1Parser.exprrec_return exprrec() throws RecognitionException {
        XPath1Parser.exprrec_return retval = new XPath1Parser.exprrec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.expr_return expr53 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:119:8: ( expr )
            // org/apache/synapse/xpath/compiler/XPath1.g:119:9: expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprrec838);
            expr53=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr53.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exprrec"


    public static class pathExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathExpr"
    // org/apache/synapse/xpath/compiler/XPath1.g:121:1: pathExpr : ( locationPath | filterExpr simpleAxisStep relativeLocationPath | filterExpr );
    public final XPath1Parser.pathExpr_return pathExpr() throws RecognitionException {
        XPath1Parser.pathExpr_return retval = new XPath1Parser.pathExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.locationPath_return locationPath54 =null;

        XPath1Parser.filterExpr_return filterExpr55 =null;

        XPath1Parser.simpleAxisStep_return simpleAxisStep56 =null;

        XPath1Parser.relativeLocationPath_return relativeLocationPath57 =null;

        XPath1Parser.filterExpr_return filterExpr58 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:122:5: ( locationPath | filterExpr simpleAxisStep relativeLocationPath | filterExpr )
            int alt12=3;
            switch ( input.LA(1) ) {
            case AbbreviatedAxisSpecifier:
            case AbbreviatedStep:
            case AxisName:
            case NodeType:
            case ProcessingInstruction:
            case RecursiveAxisStep:
            case SingleAxisStep:
            case Star:
                {
                alt12=1;
                }
                break;
            case NCName:
                {
                int LA12_4 = input.LA(2);

                if ( (synpred16_XPath1()) ) {
                    alt12=1;
                }
                else if ( (synpred17_XPath1()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;

                }
                }
                break;
            case LeftParenthesis:
                {
                int LA12_10 = input.LA(2);

                if ( (synpred17_XPath1()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 10, input);

                    throw nvae;

                }
                }
                break;
            case StringLiteral:
                {
                int LA12_11 = input.LA(2);

                if ( (synpred17_XPath1()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 11, input);

                    throw nvae;

                }
                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
                {
                int LA12_12 = input.LA(2);

                if ( (synpred17_XPath1()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 12, input);

                    throw nvae;

                }
                }
                break;
            case VariableReference:
                {
                int LA12_13 = input.LA(2);

                if ( (synpred17_XPath1()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 13, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:122:7: locationPath
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_locationPath_in_pathExpr850);
                    locationPath54=locationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, locationPath54.getTree());

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:123:7: filterExpr simpleAxisStep relativeLocationPath
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_filterExpr_in_pathExpr858);
                    filterExpr55=filterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, filterExpr55.getTree());

                    pushFollow(FOLLOW_simpleAxisStep_in_pathExpr860);
                    simpleAxisStep56=simpleAxisStep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleAxisStep56.getTree());

                    pushFollow(FOLLOW_relativeLocationPath_in_pathExpr863);
                    relativeLocationPath57=relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relativeLocationPath57.getTree());

                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:124:6: filterExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_filterExpr_in_pathExpr870);
                    filterExpr58=filterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, filterExpr58.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathExpr"


    public static class simpleAxisStep_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleAxisStep"
    // org/apache/synapse/xpath/compiler/XPath1.g:127:1: simpleAxisStep : ( SingleAxisStep -> ^( SingleAxisStep ) | RecursiveAxisStep -> ^( RecursiveAxisStep ) ) ;
    public final XPath1Parser.simpleAxisStep_return simpleAxisStep() throws RecognitionException {
        XPath1Parser.simpleAxisStep_return retval = new XPath1Parser.simpleAxisStep_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SingleAxisStep59=null;
        Token RecursiveAxisStep60=null;

        CommonTree SingleAxisStep59_tree=null;
        CommonTree RecursiveAxisStep60_tree=null;
        RewriteRuleTokenStream stream_SingleAxisStep=new RewriteRuleTokenStream(adaptor,"token SingleAxisStep");
        RewriteRuleTokenStream stream_RecursiveAxisStep=new RewriteRuleTokenStream(adaptor,"token RecursiveAxisStep");

        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:128:5: ( ( SingleAxisStep -> ^( SingleAxisStep ) | RecursiveAxisStep -> ^( RecursiveAxisStep ) ) )
            // org/apache/synapse/xpath/compiler/XPath1.g:128:7: ( SingleAxisStep -> ^( SingleAxisStep ) | RecursiveAxisStep -> ^( RecursiveAxisStep ) )
            {
            // org/apache/synapse/xpath/compiler/XPath1.g:128:7: ( SingleAxisStep -> ^( SingleAxisStep ) | RecursiveAxisStep -> ^( RecursiveAxisStep ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case SingleAxisStep:
                {
                alt13=1;
                }
                break;
            case RecursiveAxisStep:
                {
                alt13=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:128:8: SingleAxisStep
                    {
                    SingleAxisStep59=(Token)match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_simpleAxisStep888); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SingleAxisStep.add(SingleAxisStep59);


                    // AST REWRITE
                    // elements: SingleAxisStep
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 128:25: -> ^( SingleAxisStep )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:128:28: ^( SingleAxisStep )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_SingleAxisStep.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:129:7: RecursiveAxisStep
                    {
                    RecursiveAxisStep60=(Token)match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_simpleAxisStep904); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RecursiveAxisStep.add(RecursiveAxisStep60);


                    // AST REWRITE
                    // elements: RecursiveAxisStep
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 129:28: -> ^( RecursiveAxisStep )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:129:31: ^( RecursiveAxisStep )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_RecursiveAxisStep.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simpleAxisStep"


    public static class filterExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "filterExpr"
    // org/apache/synapse/xpath/compiler/XPath1.g:133:1: filterExpr : ( primaryExpr predicate -> ^( FILTER primaryExpr predicate ) | primaryExpr );
    public final XPath1Parser.filterExpr_return filterExpr() throws RecognitionException {
        XPath1Parser.filterExpr_return retval = new XPath1Parser.filterExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.primaryExpr_return primaryExpr61 =null;

        XPath1Parser.predicate_return predicate62 =null;

        XPath1Parser.primaryExpr_return primaryExpr63 =null;


        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        RewriteRuleSubtreeStream stream_primaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpr");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:133:11: ( primaryExpr predicate -> ^( FILTER primaryExpr predicate ) | primaryExpr )
            int alt14=2;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                int LA14_1 = input.LA(2);

                if ( (synpred19_XPath1()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
                }
                break;
            case StringLiteral:
                {
                int LA14_2 = input.LA(2);

                if ( (synpred19_XPath1()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;

                }
                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
                {
                int LA14_3 = input.LA(2);

                if ( (synpred19_XPath1()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;

                }
                }
                break;
            case VariableReference:
                {
                int LA14_4 = input.LA(2);

                if ( (synpred19_XPath1()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 4, input);

                    throw nvae;

                }
                }
                break;
            case NCName:
                {
                int LA14_5 = input.LA(2);

                if ( (synpred19_XPath1()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:133:13: primaryExpr predicate
                    {
                    pushFollow(FOLLOW_primaryExpr_in_filterExpr932);
                    primaryExpr61=primaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpr.add(primaryExpr61.getTree());

                    pushFollow(FOLLOW_predicate_in_filterExpr934);
                    predicate62=predicate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_predicate.add(predicate62.getTree());

                    // AST REWRITE
                    // elements: predicate, primaryExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 133:35: -> ^( FILTER primaryExpr predicate )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:133:37: ^( FILTER primaryExpr predicate )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FILTER, "FILTER")
                        , root_1);

                        adaptor.addChild(root_1, stream_primaryExpr.nextTree());

                        adaptor.addChild(root_1, stream_predicate.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:134:12: primaryExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_primaryExpr_in_filterExpr957);
                    primaryExpr63=primaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpr63.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "filterExpr"


    public static class primaryExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primaryExpr"
    // org/apache/synapse/xpath/compiler/XPath1.g:137:1: primaryExpr : ( LeftParenthesis expr RightParenthesis | literal | functionCall );
    public final XPath1Parser.primaryExpr_return primaryExpr() throws RecognitionException {
        XPath1Parser.primaryExpr_return retval = new XPath1Parser.primaryExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LeftParenthesis64=null;
        Token RightParenthesis66=null;
        XPath1Parser.expr_return expr65 =null;

        XPath1Parser.literal_return literal67 =null;

        XPath1Parser.functionCall_return functionCall68 =null;


        CommonTree LeftParenthesis64_tree=null;
        CommonTree RightParenthesis66_tree=null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:138:5: ( LeftParenthesis expr RightParenthesis | literal | functionCall )
            int alt15=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt15=1;
                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
            case StringLiteral:
            case VariableReference:
                {
                alt15=2;
                }
                break;
            case NCName:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:138:7: LeftParenthesis expr RightParenthesis
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LeftParenthesis64=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_primaryExpr980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LeftParenthesis64_tree = 
                    (CommonTree)adaptor.create(LeftParenthesis64)
                    ;
                    adaptor.addChild(root_0, LeftParenthesis64_tree);
                    }

                    pushFollow(FOLLOW_expr_in_primaryExpr982);
                    expr65=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr65.getTree());

                    RightParenthesis66=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_primaryExpr984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RightParenthesis66_tree = 
                    (CommonTree)adaptor.create(RightParenthesis66)
                    ;
                    adaptor.addChild(root_0, RightParenthesis66_tree);
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:139:7: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_primaryExpr992);
                    literal67=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal67.getTree());

                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:140:7: functionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_functionCall_in_primaryExpr1000);
                    functionCall68=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall68.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primaryExpr"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // org/apache/synapse/xpath/compiler/XPath1.g:143:1: expr : orExpr ;
    public final XPath1Parser.expr_return expr() throws RecognitionException {
        XPath1Parser.expr_return retval = new XPath1Parser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.orExpr_return orExpr69 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:143:5: ( orExpr )
            // org/apache/synapse/xpath/compiler/XPath1.g:143:7: orExpr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_orExpr_in_expr1012);
            orExpr69=orExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, orExpr69.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class orExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orExpr"
    // org/apache/synapse/xpath/compiler/XPath1.g:145:1: orExpr : ( andExpr Or orExprrec -> ^( Or andExpr orExprrec ) | andExpr );
    public final XPath1Parser.orExpr_return orExpr() throws RecognitionException {
        XPath1Parser.orExpr_return retval = new XPath1Parser.orExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Or71=null;
        XPath1Parser.andExpr_return andExpr70 =null;

        XPath1Parser.orExprrec_return orExprrec72 =null;

        XPath1Parser.andExpr_return andExpr73 =null;


        CommonTree Or71_tree=null;
        RewriteRuleTokenStream stream_Or=new RewriteRuleTokenStream(adaptor,"token Or");
        RewriteRuleSubtreeStream stream_andExpr=new RewriteRuleSubtreeStream(adaptor,"rule andExpr");
        RewriteRuleSubtreeStream stream_orExprrec=new RewriteRuleSubtreeStream(adaptor,"rule orExprrec");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:145:7: ( andExpr Or orExprrec -> ^( Or andExpr orExprrec ) | andExpr )
            int alt16=2;
            switch ( input.LA(1) ) {
            case AxisName:
                {
                int LA16_1 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
                }
                break;
            case AbbreviatedAxisSpecifier:
                {
                int LA16_2 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;

                }
                }
                break;
            case Star:
                {
                int LA16_3 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;

                }
                }
                break;
            case NCName:
                {
                int LA16_4 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;

                }
                }
                break;
            case NodeType:
                {
                int LA16_5 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 5, input);

                    throw nvae;

                }
                }
                break;
            case ProcessingInstruction:
                {
                int LA16_6 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 6, input);

                    throw nvae;

                }
                }
                break;
            case AbbreviatedStep:
                {
                int LA16_7 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 7, input);

                    throw nvae;

                }
                }
                break;
            case SingleAxisStep:
                {
                int LA16_8 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 8, input);

                    throw nvae;

                }
                }
                break;
            case RecursiveAxisStep:
                {
                int LA16_9 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 9, input);

                    throw nvae;

                }
                }
                break;
            case LeftParenthesis:
                {
                int LA16_10 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 10, input);

                    throw nvae;

                }
                }
                break;
            case StringLiteral:
                {
                int LA16_11 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 11, input);

                    throw nvae;

                }
                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
                {
                int LA16_12 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 12, input);

                    throw nvae;

                }
                }
                break;
            case VariableReference:
                {
                int LA16_13 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 13, input);

                    throw nvae;

                }
                }
                break;
            case 62:
                {
                int LA16_14 = input.LA(2);

                if ( (synpred22_XPath1()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 14, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:145:9: andExpr Or orExprrec
                    {
                    pushFollow(FOLLOW_andExpr_in_orExpr1019);
                    andExpr70=andExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_andExpr.add(andExpr70.getTree());

                    Or71=(Token)match(input,Or,FOLLOW_Or_in_orExpr1021); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Or.add(Or71);


                    pushFollow(FOLLOW_orExprrec_in_orExpr1023);
                    orExprrec72=orExprrec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_orExprrec.add(orExprrec72.getTree());

                    // AST REWRITE
                    // elements: Or, andExpr, orExprrec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 145:31: -> ^( Or andExpr orExprrec )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:145:33: ^( Or andExpr orExprrec )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_Or.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_andExpr.nextTree());

                        adaptor.addChild(root_1, stream_orExprrec.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:146:9: andExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_andExpr_in_orExpr1043);
                    andExpr73=andExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr73.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orExpr"


    public static class orExprrec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orExprrec"
    // org/apache/synapse/xpath/compiler/XPath1.g:149:1: orExprrec : orExpr ;
    public final XPath1Parser.orExprrec_return orExprrec() throws RecognitionException {
        XPath1Parser.orExprrec_return retval = new XPath1Parser.orExprrec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.orExpr_return orExpr74 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:149:11: ( orExpr )
            // org/apache/synapse/xpath/compiler/XPath1.g:149:12: orExpr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_orExpr_in_orExprrec1057);
            orExpr74=orExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, orExpr74.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orExprrec"


    public static class andExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andExpr"
    // org/apache/synapse/xpath/compiler/XPath1.g:150:1: andExpr : ( equalityExpr And andExprrec -> ^( And equalityExpr andExprrec ) | equalityExpr );
    public final XPath1Parser.andExpr_return andExpr() throws RecognitionException {
        XPath1Parser.andExpr_return retval = new XPath1Parser.andExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token And76=null;
        XPath1Parser.equalityExpr_return equalityExpr75 =null;

        XPath1Parser.andExprrec_return andExprrec77 =null;

        XPath1Parser.equalityExpr_return equalityExpr78 =null;


        CommonTree And76_tree=null;
        RewriteRuleTokenStream stream_And=new RewriteRuleTokenStream(adaptor,"token And");
        RewriteRuleSubtreeStream stream_andExprrec=new RewriteRuleSubtreeStream(adaptor,"rule andExprrec");
        RewriteRuleSubtreeStream stream_equalityExpr=new RewriteRuleSubtreeStream(adaptor,"rule equalityExpr");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:150:8: ( equalityExpr And andExprrec -> ^( And equalityExpr andExprrec ) | equalityExpr )
            int alt17=2;
            switch ( input.LA(1) ) {
            case AxisName:
                {
                int LA17_1 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }
                }
                break;
            case AbbreviatedAxisSpecifier:
                {
                int LA17_2 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;

                }
                }
                break;
            case Star:
                {
                int LA17_3 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;

                }
                }
                break;
            case NCName:
                {
                int LA17_4 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 4, input);

                    throw nvae;

                }
                }
                break;
            case NodeType:
                {
                int LA17_5 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 5, input);

                    throw nvae;

                }
                }
                break;
            case ProcessingInstruction:
                {
                int LA17_6 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 6, input);

                    throw nvae;

                }
                }
                break;
            case AbbreviatedStep:
                {
                int LA17_7 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 7, input);

                    throw nvae;

                }
                }
                break;
            case SingleAxisStep:
                {
                int LA17_8 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 8, input);

                    throw nvae;

                }
                }
                break;
            case RecursiveAxisStep:
                {
                int LA17_9 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 9, input);

                    throw nvae;

                }
                }
                break;
            case LeftParenthesis:
                {
                int LA17_10 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 10, input);

                    throw nvae;

                }
                }
                break;
            case StringLiteral:
                {
                int LA17_11 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 11, input);

                    throw nvae;

                }
                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
                {
                int LA17_12 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 12, input);

                    throw nvae;

                }
                }
                break;
            case VariableReference:
                {
                int LA17_13 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 13, input);

                    throw nvae;

                }
                }
                break;
            case 62:
                {
                int LA17_14 = input.LA(2);

                if ( (synpred23_XPath1()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 14, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:150:10: equalityExpr And andExprrec
                    {
                    pushFollow(FOLLOW_equalityExpr_in_andExpr1063);
                    equalityExpr75=equalityExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_equalityExpr.add(equalityExpr75.getTree());

                    And76=(Token)match(input,And,FOLLOW_And_in_andExpr1065); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_And.add(And76);


                    pushFollow(FOLLOW_andExprrec_in_andExpr1067);
                    andExprrec77=andExprrec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_andExprrec.add(andExprrec77.getTree());

                    // AST REWRITE
                    // elements: And, equalityExpr, andExprrec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 150:38: -> ^( And equalityExpr andExprrec )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:150:40: ^( And equalityExpr andExprrec )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_And.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_equalityExpr.nextTree());

                        adaptor.addChild(root_1, stream_andExprrec.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:151:10: equalityExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_equalityExpr_in_andExpr1087);
                    equalityExpr78=equalityExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr78.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "andExpr"


    public static class andExprrec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andExprrec"
    // org/apache/synapse/xpath/compiler/XPath1.g:154:1: andExprrec : andExpr ;
    public final XPath1Parser.andExprrec_return andExprrec() throws RecognitionException {
        XPath1Parser.andExprrec_return retval = new XPath1Parser.andExprrec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.andExpr_return andExpr79 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:154:12: ( andExpr )
            // org/apache/synapse/xpath/compiler/XPath1.g:154:13: andExpr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_andExpr_in_andExprrec1102);
            andExpr79=andExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr79.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "andExprrec"


    public static class equalityExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpr"
    // org/apache/synapse/xpath/compiler/XPath1.g:157:1: equalityExpr : ( relationalExpr EqualityOp equalityExprrec -> ^( EqualityOp relationalExpr equalityExprrec ) | relationalExpr );
    public final XPath1Parser.equalityExpr_return equalityExpr() throws RecognitionException {
        XPath1Parser.equalityExpr_return retval = new XPath1Parser.equalityExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EqualityOp81=null;
        XPath1Parser.relationalExpr_return relationalExpr80 =null;

        XPath1Parser.equalityExprrec_return equalityExprrec82 =null;

        XPath1Parser.relationalExpr_return relationalExpr83 =null;


        CommonTree EqualityOp81_tree=null;
        RewriteRuleTokenStream stream_EqualityOp=new RewriteRuleTokenStream(adaptor,"token EqualityOp");
        RewriteRuleSubtreeStream stream_equalityExprrec=new RewriteRuleSubtreeStream(adaptor,"rule equalityExprrec");
        RewriteRuleSubtreeStream stream_relationalExpr=new RewriteRuleSubtreeStream(adaptor,"rule relationalExpr");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:158:5: ( relationalExpr EqualityOp equalityExprrec -> ^( EqualityOp relationalExpr equalityExprrec ) | relationalExpr )
            int alt18=2;
            switch ( input.LA(1) ) {
            case AxisName:
                {
                int LA18_1 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
                }
                break;
            case AbbreviatedAxisSpecifier:
                {
                int LA18_2 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;

                }
                }
                break;
            case Star:
                {
                int LA18_3 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    throw nvae;

                }
                }
                break;
            case NCName:
                {
                int LA18_4 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 4, input);

                    throw nvae;

                }
                }
                break;
            case NodeType:
                {
                int LA18_5 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 5, input);

                    throw nvae;

                }
                }
                break;
            case ProcessingInstruction:
                {
                int LA18_6 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 6, input);

                    throw nvae;

                }
                }
                break;
            case AbbreviatedStep:
                {
                int LA18_7 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 7, input);

                    throw nvae;

                }
                }
                break;
            case SingleAxisStep:
                {
                int LA18_8 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 8, input);

                    throw nvae;

                }
                }
                break;
            case RecursiveAxisStep:
                {
                int LA18_9 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 9, input);

                    throw nvae;

                }
                }
                break;
            case LeftParenthesis:
                {
                int LA18_10 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 10, input);

                    throw nvae;

                }
                }
                break;
            case StringLiteral:
                {
                int LA18_11 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 11, input);

                    throw nvae;

                }
                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
                {
                int LA18_12 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 12, input);

                    throw nvae;

                }
                }
                break;
            case VariableReference:
                {
                int LA18_13 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 13, input);

                    throw nvae;

                }
                }
                break;
            case 62:
                {
                int LA18_14 = input.LA(2);

                if ( (synpred24_XPath1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 14, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:158:7: relationalExpr EqualityOp equalityExprrec
                    {
                    pushFollow(FOLLOW_relationalExpr_in_equalityExpr1115);
                    relationalExpr80=relationalExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relationalExpr.add(relationalExpr80.getTree());

                    EqualityOp81=(Token)match(input,EqualityOp,FOLLOW_EqualityOp_in_equalityExpr1117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EqualityOp.add(EqualityOp81);


                    pushFollow(FOLLOW_equalityExprrec_in_equalityExpr1119);
                    equalityExprrec82=equalityExprrec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_equalityExprrec.add(equalityExprrec82.getTree());

                    // AST REWRITE
                    // elements: relationalExpr, equalityExprrec, EqualityOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 158:49: -> ^( EqualityOp relationalExpr equalityExprrec )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:158:51: ^( EqualityOp relationalExpr equalityExprrec )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_EqualityOp.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_relationalExpr.nextTree());

                        adaptor.addChild(root_1, stream_equalityExprrec.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:159:6: relationalExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_relationalExpr_in_equalityExpr1135);
                    relationalExpr83=relationalExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr83.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equalityExpr"


    public static class equalityExprrec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExprrec"
    // org/apache/synapse/xpath/compiler/XPath1.g:162:2: equalityExprrec : equalityExpr ;
    public final XPath1Parser.equalityExprrec_return equalityExprrec() throws RecognitionException {
        XPath1Parser.equalityExprrec_return retval = new XPath1Parser.equalityExprrec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.equalityExpr_return equalityExpr84 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:162:18: ( equalityExpr )
            // org/apache/synapse/xpath/compiler/XPath1.g:162:20: equalityExpr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equalityExpr_in_equalityExprrec1149);
            equalityExpr84=equalityExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr84.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equalityExprrec"


    public static class relationalExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalExpr"
    // org/apache/synapse/xpath/compiler/XPath1.g:167:1: relationalExpr : additiveExpr ( RelationalOp additiveExprrec )* -> ^( additiveExpr ( ^( RelationalOp additiveExprrec ) )* ) ;
    public final XPath1Parser.relationalExpr_return relationalExpr() throws RecognitionException {
        XPath1Parser.relationalExpr_return retval = new XPath1Parser.relationalExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RelationalOp86=null;
        XPath1Parser.additiveExpr_return additiveExpr85 =null;

        XPath1Parser.additiveExprrec_return additiveExprrec87 =null;


        CommonTree RelationalOp86_tree=null;
        RewriteRuleTokenStream stream_RelationalOp=new RewriteRuleTokenStream(adaptor,"token RelationalOp");
        RewriteRuleSubtreeStream stream_additiveExprrec=new RewriteRuleSubtreeStream(adaptor,"rule additiveExprrec");
        RewriteRuleSubtreeStream stream_additiveExpr=new RewriteRuleSubtreeStream(adaptor,"rule additiveExpr");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:167:15: ( additiveExpr ( RelationalOp additiveExprrec )* -> ^( additiveExpr ( ^( RelationalOp additiveExprrec ) )* ) )
            // org/apache/synapse/xpath/compiler/XPath1.g:167:17: additiveExpr ( RelationalOp additiveExprrec )*
            {
            pushFollow(FOLLOW_additiveExpr_in_relationalExpr1159);
            additiveExpr85=additiveExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_additiveExpr.add(additiveExpr85.getTree());

            // org/apache/synapse/xpath/compiler/XPath1.g:167:30: ( RelationalOp additiveExprrec )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case RelationalOp:
                    {
                    alt19=1;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // org/apache/synapse/xpath/compiler/XPath1.g:167:31: RelationalOp additiveExprrec
            	    {
            	    RelationalOp86=(Token)match(input,RelationalOp,FOLLOW_RelationalOp_in_relationalExpr1162); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RelationalOp.add(RelationalOp86);


            	    pushFollow(FOLLOW_additiveExprrec_in_relationalExpr1164);
            	    additiveExprrec87=additiveExprrec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_additiveExprrec.add(additiveExprrec87.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // AST REWRITE
            // elements: additiveExprrec, additiveExpr, RelationalOp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 167:62: -> ^( additiveExpr ( ^( RelationalOp additiveExprrec ) )* )
            {
                // org/apache/synapse/xpath/compiler/XPath1.g:167:64: ^( additiveExpr ( ^( RelationalOp additiveExprrec ) )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_additiveExpr.nextNode(), root_1);

                // org/apache/synapse/xpath/compiler/XPath1.g:167:80: ( ^( RelationalOp additiveExprrec ) )*
                while ( stream_additiveExprrec.hasNext()||stream_RelationalOp.hasNext() ) {
                    // org/apache/synapse/xpath/compiler/XPath1.g:167:81: ^( RelationalOp additiveExprrec )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    stream_RelationalOp.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_additiveExprrec.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_additiveExprrec.reset();
                stream_RelationalOp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relationalExpr"


    public static class additiveExprrec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additiveExprrec"
    // org/apache/synapse/xpath/compiler/XPath1.g:169:2: additiveExprrec : additiveExpr ;
    public final XPath1Parser.additiveExprrec_return additiveExprrec() throws RecognitionException {
        XPath1Parser.additiveExprrec_return retval = new XPath1Parser.additiveExprrec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.additiveExpr_return additiveExpr88 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:169:18: ( additiveExpr )
            // org/apache/synapse/xpath/compiler/XPath1.g:169:20: additiveExpr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_additiveExpr_in_additiveExprrec1204);
            additiveExpr88=additiveExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpr88.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additiveExprrec"


    public static class additiveExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additiveExpr"
    // org/apache/synapse/xpath/compiler/XPath1.g:171:1: additiveExpr : multiplicativeExpr ( MultiplicativeOP multiplicativeExprrec )* -> ^( multiplicativeExpr ( ^( MultiplicativeOP multiplicativeExprrec ) )* ) ;
    public final XPath1Parser.additiveExpr_return additiveExpr() throws RecognitionException {
        XPath1Parser.additiveExpr_return retval = new XPath1Parser.additiveExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MultiplicativeOP90=null;
        XPath1Parser.multiplicativeExpr_return multiplicativeExpr89 =null;

        XPath1Parser.multiplicativeExprrec_return multiplicativeExprrec91 =null;


        CommonTree MultiplicativeOP90_tree=null;
        RewriteRuleTokenStream stream_MultiplicativeOP=new RewriteRuleTokenStream(adaptor,"token MultiplicativeOP");
        RewriteRuleSubtreeStream stream_multiplicativeExprrec=new RewriteRuleSubtreeStream(adaptor,"rule multiplicativeExprrec");
        RewriteRuleSubtreeStream stream_multiplicativeExpr=new RewriteRuleSubtreeStream(adaptor,"rule multiplicativeExpr");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:171:13: ( multiplicativeExpr ( MultiplicativeOP multiplicativeExprrec )* -> ^( multiplicativeExpr ( ^( MultiplicativeOP multiplicativeExprrec ) )* ) )
            // org/apache/synapse/xpath/compiler/XPath1.g:171:15: multiplicativeExpr ( MultiplicativeOP multiplicativeExprrec )*
            {
            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr1228);
            multiplicativeExpr89=multiplicativeExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multiplicativeExpr.add(multiplicativeExpr89.getTree());

            // org/apache/synapse/xpath/compiler/XPath1.g:171:34: ( MultiplicativeOP multiplicativeExprrec )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case MultiplicativeOP:
                    {
                    alt20=1;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // org/apache/synapse/xpath/compiler/XPath1.g:171:35: MultiplicativeOP multiplicativeExprrec
            	    {
            	    MultiplicativeOP90=(Token)match(input,MultiplicativeOP,FOLLOW_MultiplicativeOP_in_additiveExpr1231); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_MultiplicativeOP.add(MultiplicativeOP90);


            	    pushFollow(FOLLOW_multiplicativeExprrec_in_additiveExpr1233);
            	    multiplicativeExprrec91=multiplicativeExprrec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_multiplicativeExprrec.add(multiplicativeExprrec91.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // AST REWRITE
            // elements: multiplicativeExprrec, multiplicativeExpr, MultiplicativeOP
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 171:76: -> ^( multiplicativeExpr ( ^( MultiplicativeOP multiplicativeExprrec ) )* )
            {
                // org/apache/synapse/xpath/compiler/XPath1.g:171:78: ^( multiplicativeExpr ( ^( MultiplicativeOP multiplicativeExprrec ) )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_multiplicativeExpr.nextNode(), root_1);

                // org/apache/synapse/xpath/compiler/XPath1.g:171:99: ( ^( MultiplicativeOP multiplicativeExprrec ) )*
                while ( stream_multiplicativeExprrec.hasNext()||stream_MultiplicativeOP.hasNext() ) {
                    // org/apache/synapse/xpath/compiler/XPath1.g:171:100: ^( MultiplicativeOP multiplicativeExprrec )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    stream_MultiplicativeOP.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_multiplicativeExprrec.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_multiplicativeExprrec.reset();
                stream_MultiplicativeOP.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additiveExpr"


    public static class multiplicativeExprrec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicativeExprrec"
    // org/apache/synapse/xpath/compiler/XPath1.g:173:1: multiplicativeExprrec : multiplicativeExpr ;
    public final XPath1Parser.multiplicativeExprrec_return multiplicativeExprrec() throws RecognitionException {
        XPath1Parser.multiplicativeExprrec_return retval = new XPath1Parser.multiplicativeExprrec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.multiplicativeExpr_return multiplicativeExpr92 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:173:23: ( multiplicativeExpr )
            // org/apache/synapse/xpath/compiler/XPath1.g:173:25: multiplicativeExpr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multiplicativeExpr_in_multiplicativeExprrec1257);
            multiplicativeExpr92=multiplicativeExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpr92.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExprrec"


    public static class multiplicativeExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicativeExpr"
    // org/apache/synapse/xpath/compiler/XPath1.g:175:1: multiplicativeExpr : unaryExpr ( UnaryOp unaryExprrec )* -> ^( unaryExpr ( ^( UnaryOp unaryExprrec ) )* ) ;
    public final XPath1Parser.multiplicativeExpr_return multiplicativeExpr() throws RecognitionException {
        XPath1Parser.multiplicativeExpr_return retval = new XPath1Parser.multiplicativeExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token UnaryOp94=null;
        XPath1Parser.unaryExpr_return unaryExpr93 =null;

        XPath1Parser.unaryExprrec_return unaryExprrec95 =null;


        CommonTree UnaryOp94_tree=null;
        RewriteRuleTokenStream stream_UnaryOp=new RewriteRuleTokenStream(adaptor,"token UnaryOp");
        RewriteRuleSubtreeStream stream_unaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpr");
        RewriteRuleSubtreeStream stream_unaryExprrec=new RewriteRuleSubtreeStream(adaptor,"rule unaryExprrec");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:175:19: ( unaryExpr ( UnaryOp unaryExprrec )* -> ^( unaryExpr ( ^( UnaryOp unaryExprrec ) )* ) )
            // org/apache/synapse/xpath/compiler/XPath1.g:175:21: unaryExpr ( UnaryOp unaryExprrec )*
            {
            pushFollow(FOLLOW_unaryExpr_in_multiplicativeExpr1266);
            unaryExpr93=unaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpr.add(unaryExpr93.getTree());

            // org/apache/synapse/xpath/compiler/XPath1.g:175:31: ( UnaryOp unaryExprrec )*
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case UnaryOp:
                    {
                    alt21=1;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // org/apache/synapse/xpath/compiler/XPath1.g:175:32: UnaryOp unaryExprrec
            	    {
            	    UnaryOp94=(Token)match(input,UnaryOp,FOLLOW_UnaryOp_in_multiplicativeExpr1269); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_UnaryOp.add(UnaryOp94);


            	    pushFollow(FOLLOW_unaryExprrec_in_multiplicativeExpr1271);
            	    unaryExprrec95=unaryExprrec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_unaryExprrec.add(unaryExprrec95.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // AST REWRITE
            // elements: unaryExpr, UnaryOp, unaryExprrec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 175:55: -> ^( unaryExpr ( ^( UnaryOp unaryExprrec ) )* )
            {
                // org/apache/synapse/xpath/compiler/XPath1.g:175:57: ^( unaryExpr ( ^( UnaryOp unaryExprrec ) )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_unaryExpr.nextNode(), root_1);

                // org/apache/synapse/xpath/compiler/XPath1.g:175:70: ( ^( UnaryOp unaryExprrec ) )*
                while ( stream_UnaryOp.hasNext()||stream_unaryExprrec.hasNext() ) {
                    // org/apache/synapse/xpath/compiler/XPath1.g:175:71: ^( UnaryOp unaryExprrec )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    stream_UnaryOp.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_unaryExprrec.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_UnaryOp.reset();
                stream_unaryExprrec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpr"


    public static class unaryExprrec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExprrec"
    // org/apache/synapse/xpath/compiler/XPath1.g:177:1: unaryExprrec : unaryExpr ;
    public final XPath1Parser.unaryExprrec_return unaryExprrec() throws RecognitionException {
        XPath1Parser.unaryExprrec_return retval = new XPath1Parser.unaryExprrec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.unaryExpr_return unaryExpr96 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:177:13: ( unaryExpr )
            // org/apache/synapse/xpath/compiler/XPath1.g:177:14: unaryExpr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unaryExpr_in_unaryExprrec1294);
            unaryExpr96=unaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr96.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryExprrec"


    public static class unaryExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpr"
    // org/apache/synapse/xpath/compiler/XPath1.g:179:1: unaryExpr : ( unionExpr | '-' unaryExpr );
    public final XPath1Parser.unaryExpr_return unaryExpr() throws RecognitionException {
        XPath1Parser.unaryExpr_return retval = new XPath1Parser.unaryExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal98=null;
        XPath1Parser.unionExpr_return unionExpr97 =null;

        XPath1Parser.unaryExpr_return unaryExpr99 =null;


        CommonTree char_literal98_tree=null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:179:10: ( unionExpr | '-' unaryExpr )
            int alt22=2;
            switch ( input.LA(1) ) {
            case AbbreviatedAxisSpecifier:
            case AbbreviatedStep:
            case AxisName:
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
            case LeftParenthesis:
            case NCName:
            case NodeType:
            case ProcessingInstruction:
            case RecursiveAxisStep:
            case SingleAxisStep:
            case Star:
            case StringLiteral:
            case VariableReference:
                {
                alt22=1;
                }
                break;
            case 62:
                {
                alt22=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:179:12: unionExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unionExpr_in_unaryExpr1321);
                    unionExpr97=unionExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unionExpr97.getTree());

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:180:11: '-' unaryExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal98=(Token)match(input,62,FOLLOW_62_in_unaryExpr1333); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal98_tree = 
                    (CommonTree)adaptor.create(char_literal98)
                    ;
                    adaptor.addChild(root_0, char_literal98_tree);
                    }

                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr1335);
                    unaryExpr99=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr99.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryExpr"


    public static class unionExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unionExpr"
    // org/apache/synapse/xpath/compiler/XPath1.g:185:1: unionExpr : ( pathExpr Pipe unionExprrec -> ^( Pipe pathExpr unionExprrec ) | pathExpr );
    public final XPath1Parser.unionExpr_return unionExpr() throws RecognitionException {
        XPath1Parser.unionExpr_return retval = new XPath1Parser.unionExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Pipe101=null;
        XPath1Parser.pathExpr_return pathExpr100 =null;

        XPath1Parser.unionExprrec_return unionExprrec102 =null;

        XPath1Parser.pathExpr_return pathExpr103 =null;


        CommonTree Pipe101_tree=null;
        RewriteRuleTokenStream stream_Pipe=new RewriteRuleTokenStream(adaptor,"token Pipe");
        RewriteRuleSubtreeStream stream_pathExpr=new RewriteRuleSubtreeStream(adaptor,"rule pathExpr");
        RewriteRuleSubtreeStream stream_unionExprrec=new RewriteRuleSubtreeStream(adaptor,"rule unionExprrec");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:185:10: ( pathExpr Pipe unionExprrec -> ^( Pipe pathExpr unionExprrec ) | pathExpr )
            int alt23=2;
            switch ( input.LA(1) ) {
            case AxisName:
                {
                int LA23_1 = input.LA(2);

                if ( (synpred29_XPath1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
                }
                break;
            case AbbreviatedAxisSpecifier:
                {
                int LA23_2 = input.LA(2);

                if ( (synpred29_XPath1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;

                }
                }
                break;
            case Star:
                {
                int LA23_3 = input.LA(2);

                if ( (synpred29_XPath1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;

                }
                }
                break;
            case NCName:
                {
                int LA23_4 = input.LA(2);

                if ( (synpred29_XPath1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 4, input);

                    throw nvae;

                }
                }
                break;
            case NodeType:
                {
                int LA23_5 = input.LA(2);

                if ( (synpred29_XPath1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 5, input);

                    throw nvae;

                }
                }
                break;
            case ProcessingInstruction:
                {
                int LA23_6 = input.LA(2);

                if ( (synpred29_XPath1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 6, input);

                    throw nvae;

                }
                }
                break;
            case AbbreviatedStep:
                {
                int LA23_7 = input.LA(2);

                if ( (synpred29_XPath1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 7, input);

                    throw nvae;

                }
                }
                break;
            case SingleAxisStep:
                {
                int LA23_8 = input.LA(2);

                if ( (synpred29_XPath1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 8, input);

                    throw nvae;

                }
                }
                break;
            case RecursiveAxisStep:
                {
                int LA23_9 = input.LA(2);

                if ( (synpred29_XPath1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 9, input);

                    throw nvae;

                }
                }
                break;
            case LeftParenthesis:
                {
                int LA23_10 = input.LA(2);

                if ( (synpred29_XPath1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 10, input);

                    throw nvae;

                }
                }
                break;
            case StringLiteral:
                {
                int LA23_11 = input.LA(2);

                if ( (synpred29_XPath1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 11, input);

                    throw nvae;

                }
                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
                {
                int LA23_12 = input.LA(2);

                if ( (synpred29_XPath1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 12, input);

                    throw nvae;

                }
                }
                break;
            case VariableReference:
                {
                int LA23_13 = input.LA(2);

                if ( (synpred29_XPath1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 13, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:185:12: pathExpr Pipe unionExprrec
                    {
                    pushFollow(FOLLOW_pathExpr_in_unionExpr1369);
                    pathExpr100=pathExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pathExpr.add(pathExpr100.getTree());

                    Pipe101=(Token)match(input,Pipe,FOLLOW_Pipe_in_unionExpr1371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Pipe.add(Pipe101);


                    pushFollow(FOLLOW_unionExprrec_in_unionExpr1373);
                    unionExprrec102=unionExprrec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unionExprrec.add(unionExprrec102.getTree());

                    // AST REWRITE
                    // elements: pathExpr, unionExprrec, Pipe
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 185:39: -> ^( Pipe pathExpr unionExprrec )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:185:42: ^( Pipe pathExpr unionExprrec )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_Pipe.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_pathExpr.nextTree());

                        adaptor.addChild(root_1, stream_unionExprrec.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:186:11: pathExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_pathExpr_in_unionExpr1395);
                    pathExpr103=pathExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pathExpr103.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unionExpr"


    public static class unionExprrec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unionExprrec"
    // org/apache/synapse/xpath/compiler/XPath1.g:189:1: unionExprrec : unionExpr ;
    public final XPath1Parser.unionExprrec_return unionExprrec() throws RecognitionException {
        XPath1Parser.unionExprrec_return retval = new XPath1Parser.unionExprrec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        XPath1Parser.unionExpr_return unionExpr104 =null;



        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:189:13: ( unionExpr )
            // org/apache/synapse/xpath/compiler/XPath1.g:189:14: unionExpr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unionExpr_in_unionExprrec1411);
            unionExpr104=unionExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unionExpr104.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unionExprrec"


    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // org/apache/synapse/xpath/compiler/XPath1.g:192:1: literal : ( StringLiteral -> ^( StringLiteral ) | numericLiteral -> ^( numericLiteral ) | VariableReference -> ^( VariableReference ) );
    public final XPath1Parser.literal_return literal() throws RecognitionException {
        XPath1Parser.literal_return retval = new XPath1Parser.literal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StringLiteral105=null;
        Token VariableReference107=null;
        XPath1Parser.numericLiteral_return numericLiteral106 =null;


        CommonTree StringLiteral105_tree=null;
        CommonTree VariableReference107_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_VariableReference=new RewriteRuleTokenStream(adaptor,"token VariableReference");
        RewriteRuleSubtreeStream stream_numericLiteral=new RewriteRuleSubtreeStream(adaptor,"rule numericLiteral");
        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:193:5: ( StringLiteral -> ^( StringLiteral ) | numericLiteral -> ^( numericLiteral ) | VariableReference -> ^( VariableReference ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt24=1;
                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
                {
                alt24=2;
                }
                break;
            case VariableReference:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:193:7: StringLiteral
                    {
                    StringLiteral105=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal1425); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral105);


                    // AST REWRITE
                    // elements: StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 193:21: -> ^( StringLiteral )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:193:24: ^( StringLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_StringLiteral.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:194:7: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal1440);
                    numericLiteral106=numericLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numericLiteral.add(numericLiteral106.getTree());

                    // AST REWRITE
                    // elements: numericLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 194:22: -> ^( numericLiteral )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:194:25: ^( numericLiteral )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_numericLiteral.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:195:7: VariableReference
                    {
                    VariableReference107=(Token)match(input,VariableReference,FOLLOW_VariableReference_in_literal1455); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VariableReference.add(VariableReference107);


                    // AST REWRITE
                    // elements: VariableReference
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 195:25: -> ^( VariableReference )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:195:28: ^( VariableReference )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_VariableReference.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class numericLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericLiteral"
    // org/apache/synapse/xpath/compiler/XPath1.g:198:1: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final XPath1Parser.numericLiteral_return numericLiteral() throws RecognitionException {
        XPath1Parser.numericLiteral_return retval = new XPath1Parser.numericLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set108=null;

        CommonTree set108_tree=null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:198:15: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
            // org/apache/synapse/xpath/compiler/XPath1.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set108=(Token)input.LT(1);

            if ( (input.LA(1) >= DecimalLiteral && input.LA(1) <= DoubleLiteral)||input.LA(1)==IntegerLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set108)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numericLiteral"


    public static class qName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qName"
    // org/apache/synapse/xpath/compiler/XPath1.g:200:1: qName : ( NCName Colon NCName -> ^( NameSpacedQNAME NCName NCName ) | NCName -> ^( NCName ) );
    public final XPath1Parser.qName_return qName() throws RecognitionException {
        XPath1Parser.qName_return retval = new XPath1Parser.qName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NCName109=null;
        Token Colon110=null;
        Token NCName111=null;
        Token NCName112=null;

        CommonTree NCName109_tree=null;
        CommonTree Colon110_tree=null;
        CommonTree NCName111_tree=null;
        CommonTree NCName112_tree=null;
        RewriteRuleTokenStream stream_NCName=new RewriteRuleTokenStream(adaptor,"token NCName");
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");

        try {
            // org/apache/synapse/xpath/compiler/XPath1.g:200:6: ( NCName Colon NCName -> ^( NameSpacedQNAME NCName NCName ) | NCName -> ^( NCName ) )
            int alt25=2;
            switch ( input.LA(1) ) {
            case NCName:
                {
                switch ( input.LA(2) ) {
                case Colon:
                    {
                    alt25=1;
                    }
                    break;
                case EOF:
                case And:
                case Comma:
                case EqualityOp:
                case LeftParenthesis:
                case LeftSquareBracket:
                case MultiplicativeOP:
                case Or:
                case Pipe:
                case RecursiveAxisStep:
                case RelationalOp:
                case RightParenthesis:
                case RightSquareBracket:
                case SingleAxisStep:
                case UnaryOp:
                    {
                    alt25=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:200:8: NCName Colon NCName
                    {
                    NCName109=(Token)match(input,NCName,FOLLOW_NCName_in_qName1493); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NCName.add(NCName109);


                    Colon110=(Token)match(input,Colon,FOLLOW_Colon_in_qName1495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Colon.add(Colon110);


                    NCName111=(Token)match(input,NCName,FOLLOW_NCName_in_qName1498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NCName.add(NCName111);


                    // AST REWRITE
                    // elements: NCName, NCName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 200:32: -> ^( NameSpacedQNAME NCName NCName )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:200:35: ^( NameSpacedQNAME NCName NCName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NameSpacedQNAME, "NameSpacedQNAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NCName.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_NCName.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:201:7: NCName
                    {
                    NCName112=(Token)match(input,NCName,FOLLOW_NCName_in_qName1519); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NCName.add(NCName112);


                    // AST REWRITE
                    // elements: NCName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 201:18: -> ^( NCName )
                    {
                        // org/apache/synapse/xpath/compiler/XPath1.g:201:21: ^( NCName )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_NCName.nextNode()
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "qName"

    // $ANTLR start synpred5_XPath1
    public final void synpred5_XPath1_fragment() throws RecognitionException {
        // org/apache/synapse/xpath/compiler/XPath1.g:62:7: ( step ( ( SingleAxisStep relativeLocationPathrec ) | ( RecursiveAxisStep relativeLocationPathrec ) ) )
        // org/apache/synapse/xpath/compiler/XPath1.g:62:7: step ( ( SingleAxisStep relativeLocationPathrec ) | ( RecursiveAxisStep relativeLocationPathrec ) )
        {
        pushFollow(FOLLOW_step_in_synpred5_XPath1344);
        step();

        state._fsp--;
        if (state.failed) return ;

        // org/apache/synapse/xpath/compiler/XPath1.g:63:8: ( ( SingleAxisStep relativeLocationPathrec ) | ( RecursiveAxisStep relativeLocationPathrec ) )
        int alt26=2;
        switch ( input.LA(1) ) {
        case SingleAxisStep:
            {
            alt26=1;
            }
            break;
        case RecursiveAxisStep:
            {
            alt26=2;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 26, 0, input);

            throw nvae;

        }

        switch (alt26) {
            case 1 :
                // org/apache/synapse/xpath/compiler/XPath1.g:63:9: ( SingleAxisStep relativeLocationPathrec )
                {
                // org/apache/synapse/xpath/compiler/XPath1.g:63:9: ( SingleAxisStep relativeLocationPathrec )
                // org/apache/synapse/xpath/compiler/XPath1.g:63:10: SingleAxisStep relativeLocationPathrec
                {
                match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_synpred5_XPath1356); if (state.failed) return ;

                pushFollow(FOLLOW_relativeLocationPathrec_in_synpred5_XPath1359);
                relativeLocationPathrec();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // org/apache/synapse/xpath/compiler/XPath1.g:64:9: ( RecursiveAxisStep relativeLocationPathrec )
                {
                // org/apache/synapse/xpath/compiler/XPath1.g:64:9: ( RecursiveAxisStep relativeLocationPathrec )
                // org/apache/synapse/xpath/compiler/XPath1.g:64:10: RecursiveAxisStep relativeLocationPathrec
                {
                match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_synpred5_XPath1381); if (state.failed) return ;

                pushFollow(FOLLOW_relativeLocationPathrec_in_synpred5_XPath1384);
                relativeLocationPathrec();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }


        }

    }
    // $ANTLR end synpred5_XPath1

    // $ANTLR start synpred16_XPath1
    public final void synpred16_XPath1_fragment() throws RecognitionException {
        // org/apache/synapse/xpath/compiler/XPath1.g:122:7: ( locationPath )
        // org/apache/synapse/xpath/compiler/XPath1.g:122:7: locationPath
        {
        pushFollow(FOLLOW_locationPath_in_synpred16_XPath1850);
        locationPath();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_XPath1

    // $ANTLR start synpred17_XPath1
    public final void synpred17_XPath1_fragment() throws RecognitionException {
        // org/apache/synapse/xpath/compiler/XPath1.g:123:7: ( filterExpr simpleAxisStep relativeLocationPath )
        // org/apache/synapse/xpath/compiler/XPath1.g:123:7: filterExpr simpleAxisStep relativeLocationPath
        {
        pushFollow(FOLLOW_filterExpr_in_synpred17_XPath1858);
        filterExpr();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_simpleAxisStep_in_synpred17_XPath1860);
        simpleAxisStep();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_relativeLocationPath_in_synpred17_XPath1863);
        relativeLocationPath();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_XPath1

    // $ANTLR start synpred19_XPath1
    public final void synpred19_XPath1_fragment() throws RecognitionException {
        // org/apache/synapse/xpath/compiler/XPath1.g:133:13: ( primaryExpr predicate )
        // org/apache/synapse/xpath/compiler/XPath1.g:133:13: primaryExpr predicate
        {
        pushFollow(FOLLOW_primaryExpr_in_synpred19_XPath1932);
        primaryExpr();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_predicate_in_synpred19_XPath1934);
        predicate();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred19_XPath1

    // $ANTLR start synpred22_XPath1
    public final void synpred22_XPath1_fragment() throws RecognitionException {
        // org/apache/synapse/xpath/compiler/XPath1.g:145:9: ( andExpr Or orExprrec )
        // org/apache/synapse/xpath/compiler/XPath1.g:145:9: andExpr Or orExprrec
        {
        pushFollow(FOLLOW_andExpr_in_synpred22_XPath11019);
        andExpr();

        state._fsp--;
        if (state.failed) return ;

        match(input,Or,FOLLOW_Or_in_synpred22_XPath11021); if (state.failed) return ;

        pushFollow(FOLLOW_orExprrec_in_synpred22_XPath11023);
        orExprrec();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_XPath1

    // $ANTLR start synpred23_XPath1
    public final void synpred23_XPath1_fragment() throws RecognitionException {
        // org/apache/synapse/xpath/compiler/XPath1.g:150:10: ( equalityExpr And andExprrec )
        // org/apache/synapse/xpath/compiler/XPath1.g:150:10: equalityExpr And andExprrec
        {
        pushFollow(FOLLOW_equalityExpr_in_synpred23_XPath11063);
        equalityExpr();

        state._fsp--;
        if (state.failed) return ;

        match(input,And,FOLLOW_And_in_synpred23_XPath11065); if (state.failed) return ;

        pushFollow(FOLLOW_andExprrec_in_synpred23_XPath11067);
        andExprrec();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred23_XPath1

    // $ANTLR start synpred24_XPath1
    public final void synpred24_XPath1_fragment() throws RecognitionException {
        // org/apache/synapse/xpath/compiler/XPath1.g:158:7: ( relationalExpr EqualityOp equalityExprrec )
        // org/apache/synapse/xpath/compiler/XPath1.g:158:7: relationalExpr EqualityOp equalityExprrec
        {
        pushFollow(FOLLOW_relationalExpr_in_synpred24_XPath11115);
        relationalExpr();

        state._fsp--;
        if (state.failed) return ;

        match(input,EqualityOp,FOLLOW_EqualityOp_in_synpred24_XPath11117); if (state.failed) return ;

        pushFollow(FOLLOW_equalityExprrec_in_synpred24_XPath11119);
        equalityExprrec();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_XPath1

    // $ANTLR start synpred29_XPath1
    public final void synpred29_XPath1_fragment() throws RecognitionException {
        // org/apache/synapse/xpath/compiler/XPath1.g:185:12: ( pathExpr Pipe unionExprrec )
        // org/apache/synapse/xpath/compiler/XPath1.g:185:12: pathExpr Pipe unionExprrec
        {
        pushFollow(FOLLOW_pathExpr_in_synpred29_XPath11369);
        pathExpr();

        state._fsp--;
        if (state.failed) return ;

        match(input,Pipe,FOLLOW_Pipe_in_synpred29_XPath11371); if (state.failed) return ;

        pushFollow(FOLLOW_unionExprrec_in_synpred29_XPath11373);
        unionExprrec();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred29_XPath1

    // Delegated rules

    public final boolean synpred23_XPath1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_XPath1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_XPath1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_XPath1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_XPath1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_XPath1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_XPath1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_XPath1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_XPath1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_XPath1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_XPath1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_XPath1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_XPath1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_XPath1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_XPath1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_XPath1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_locationPath_in_xpath236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeLocationPath_in_locationPath249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_absoluteLocationPath_in_locationPath257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SingleAxisStep_in_absoluteLocationPath277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SingleAxisStep_in_absoluteLocationPath285 = new BitSet(new long[]{0x0040041200002C00L});
    public static final BitSet FOLLOW_relativeLocationPath_in_absoluteLocationPath287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbreviatedAbsoluteLocationPath_in_absoluteLocationPath309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_abbreviatedAbsoluteLocationPath321 = new BitSet(new long[]{0x0040041200002C00L});
    public static final BitSet FOLLOW_relativeLocationPath_in_abbreviatedAbsoluteLocationPath323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_step_in_relativeLocationPath344 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_SingleAxisStep_in_relativeLocationPath356 = new BitSet(new long[]{0x0040041200002C00L});
    public static final BitSet FOLLOW_relativeLocationPathrec_in_relativeLocationPath359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_relativeLocationPath381 = new BitSet(new long[]{0x0040041200002C00L});
    public static final BitSet FOLLOW_relativeLocationPathrec_in_relativeLocationPath384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_step_in_relativeLocationPath413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeLocationPath_in_relativeLocationPathrec436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedAxisStep_in_step448 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_predicate_in_step450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedAxisStep_in_step468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbreviatedAxisStep_in_step476 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_predicate_in_step479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AbbreviatedStep_in_abbreviatedAxisStep514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_axisSpecifier_in_namedAxisStep534 = new BitSet(new long[]{0x0040041200000000L});
    public static final BitSet FOLLOW_nodeTest_in_namedAxisStep536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nodeTest_in_namedAxisStep554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AxisName_in_axisSpecifier571 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_AxisNameSeparator_in_axisSpecifier573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AbbreviatedAxisSpecifier_in_axisSpecifier589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NodeType_in_nodeTest617 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_nodeTest619 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_nodeTest621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ProcessingInstruction_in_nodeTest634 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_nodeTest636 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_nodeTest638 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_nodeTest640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Star_in_nameTest669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_nameTest683 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Colon_in_nameTest685 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Star_in_nameTest687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_nameTest703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_predicate720 = new BitSet(new long[]{0x50E0841205062C00L});
    public static final BitSet FOLLOW_predicateExpr_in_predicate722 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_predicate724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_predicateExpr745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_functionCall758 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_functionCall760 = new BitSet(new long[]{0x50E2841205062C00L});
    public static final BitSet FOLLOW_expressionList_in_functionCall765 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_functionCall772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expressionList804 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_Comma_in_expressionList808 = new BitSet(new long[]{0x50E0841205062C00L});
    public static final BitSet FOLLOW_exprrec_in_expressionList810 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_expr_in_exprrec838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_locationPath_in_pathExpr850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterExpr_in_pathExpr858 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_simpleAxisStep_in_pathExpr860 = new BitSet(new long[]{0x0040041200002C00L});
    public static final BitSet FOLLOW_relativeLocationPath_in_pathExpr863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterExpr_in_pathExpr870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SingleAxisStep_in_simpleAxisStep888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_simpleAxisStep904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr932 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_predicate_in_filterExpr934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_primaryExpr980 = new BitSet(new long[]{0x50E0841205062C00L});
    public static final BitSet FOLLOW_expr_in_primaryExpr982 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_primaryExpr984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_expr1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1019 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Or_in_orExpr1021 = new BitSet(new long[]{0x50E0841205062C00L});
    public static final BitSet FOLLOW_orExprrec_in_orExpr1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_orExprrec1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_andExpr1063 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_And_in_andExpr1065 = new BitSet(new long[]{0x50E0841205062C00L});
    public static final BitSet FOLLOW_andExprrec_in_andExpr1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_andExpr1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_andExprrec1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr1115 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EqualityOp_in_equalityExpr1117 = new BitSet(new long[]{0x50E0841205062C00L});
    public static final BitSet FOLLOW_equalityExprrec_in_equalityExpr1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_equalityExprrec1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_relationalExpr1159 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_RelationalOp_in_relationalExpr1162 = new BitSet(new long[]{0x50E0841205062C00L});
    public static final BitSet FOLLOW_additiveExprrec_in_relationalExpr1164 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_additiveExprrec1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr1228 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_MultiplicativeOP_in_additiveExpr1231 = new BitSet(new long[]{0x50E0841205062C00L});
    public static final BitSet FOLLOW_multiplicativeExprrec_in_additiveExpr1233 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_multiplicativeExprrec1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_multiplicativeExpr1266 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_UnaryOp_in_multiplicativeExpr1269 = new BitSet(new long[]{0x50E0841205062C00L});
    public static final BitSet FOLLOW_unaryExprrec_in_multiplicativeExpr1271 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExprrec1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unionExpr_in_unaryExpr1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_unaryExpr1333 = new BitSet(new long[]{0x50E0841205062C00L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_unionExpr1369 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Pipe_in_unionExpr1371 = new BitSet(new long[]{0x10E0841205062C00L});
    public static final BitSet FOLLOW_unionExprrec_in_unionExpr1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_unionExpr1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unionExpr_in_unionExprrec1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VariableReference_in_literal1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_qName1493 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_Colon_in_qName1495 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NCName_in_qName1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_qName1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_step_in_synpred5_XPath1344 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_SingleAxisStep_in_synpred5_XPath1356 = new BitSet(new long[]{0x0040041200002C00L});
    public static final BitSet FOLLOW_relativeLocationPathrec_in_synpred5_XPath1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_synpred5_XPath1381 = new BitSet(new long[]{0x0040041200002C00L});
    public static final BitSet FOLLOW_relativeLocationPathrec_in_synpred5_XPath1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_locationPath_in_synpred16_XPath1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterExpr_in_synpred17_XPath1858 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_simpleAxisStep_in_synpred17_XPath1860 = new BitSet(new long[]{0x0040041200002C00L});
    public static final BitSet FOLLOW_relativeLocationPath_in_synpred17_XPath1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_synpred19_XPath1932 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_predicate_in_synpred19_XPath1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_synpred22_XPath11019 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Or_in_synpred22_XPath11021 = new BitSet(new long[]{0x50E0841205062C00L});
    public static final BitSet FOLLOW_orExprrec_in_synpred22_XPath11023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_synpred23_XPath11063 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_And_in_synpred23_XPath11065 = new BitSet(new long[]{0x50E0841205062C00L});
    public static final BitSet FOLLOW_andExprrec_in_synpred23_XPath11067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpr_in_synpred24_XPath11115 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EqualityOp_in_synpred24_XPath11117 = new BitSet(new long[]{0x50E0841205062C00L});
    public static final BitSet FOLLOW_equalityExprrec_in_synpred24_XPath11119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_synpred29_XPath11369 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Pipe_in_synpred29_XPath11371 = new BitSet(new long[]{0x10E0841205062C00L});
    public static final BitSet FOLLOW_unionExprrec_in_synpred29_XPath11373 = new BitSet(new long[]{0x0000000000000002L});

}