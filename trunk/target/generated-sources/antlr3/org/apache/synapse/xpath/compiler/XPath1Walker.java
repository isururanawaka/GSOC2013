// $ANTLR 3.4 org/apache/synapse/xpath/compiler/XPath1Walker.g 2013-07-19 08:05:15

	package org.apache.synapse.xpath.compiler;
    import org.apache.synapse.xpath.expression.axis.*;
    import org.apache.synapse.xpath.expression.*;
    import org.apache.synapse.xpath.util.*;
    import java.util.List;
    import java.util.ArrayList;
    import javax.xml.namespace.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class XPath1Walker extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public XPath1Walker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public XPath1Walker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return XPath1Walker.tokenNames; }
    public String getGrammarFileName() { return "org/apache/synapse/xpath/compiler/XPath1Walker.g"; }



    // $ANTLR start "xpath"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:20:1: xpath returns [XpathExpr expr] : locationPath ;
    public final XpathExpr xpath() throws RecognitionException {
        XpathExpr expr = null;


        LocationPath locationPath1 =null;



         expr = null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:24:2: ( locationPath )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:24:2: locationPath
            {
            pushFollow(FOLLOW_locationPath_in_xpath57);
            locationPath1=locationPath();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = new DefaultXpathExpr(locationPath1);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "xpath"



    // $ANTLR start "locationPath"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:29:1: locationPath returns [LocationPath expr] : ( relativeLocationPath | absoluteLocationPath );
    public final LocationPath locationPath() throws RecognitionException {
        LocationPath expr = null;


        ArrayList<Step> relativeLocationPath2 =null;

        ArrayList<Step> absoluteLocationPath3 =null;



          expr =null ;
          ArrayList<Step> list=null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:34:5: ( relativeLocationPath | absoluteLocationPath )
            int alt1=2;
            switch ( input.LA(1) ) {
            case SingleAxisStep:
                {
                int LA1_1 = input.LA(2);

                if ( (synpred1_XPath1Walker()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
                }
                break;
            case RecursiveAxisStep:
                {
                int LA1_2 = input.LA(2);

                if ( (synpred1_XPath1Walker()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
                }
                break;
            case ABBREVIATED_AXIS_STEP:
            case ANY_NAMESPACED_NODE:
            case ANY_NODE:
            case NAMED_AXIS_STEP:
            case NCName:
            case NameSpacedQNAME:
            case ProcessingInstruction:
            case QNAME_PREDICATE:
            case Star:
                {
                alt1=1;
                }
                break;
            case RELATIVELOC:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:34:7: relativeLocationPath
                    {
                    pushFollow(FOLLOW_relativeLocationPath_in_locationPath84);
                    relativeLocationPath2=relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new DefaultRelativeLocationPath();
                                                                  list = relativeLocationPath2;
                                                                   if(list != null){
                                                                    for(Step step:list)
                                                                    expr.addStep(step);
                                                                    }
                                                                   }

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:42:7: absoluteLocationPath
                    {
                    pushFollow(FOLLOW_absoluteLocationPath_in_locationPath94);
                    absoluteLocationPath3=absoluteLocationPath();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new DefaultAbsoluteLocationPath();
                                                                list = absoluteLocationPath3;
                                                                if(list != null){
                                                                for(Step step:list){
                                                                expr.addStep(step);
                                                                 }
                                                                }}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "locationPath"



    // $ANTLR start "absoluteLocationPath"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:52:1: absoluteLocationPath returns [ArrayList<Step> list] : ( SingleAxisStep | ^( RELATIVELOC SingleAxisStep relativeLocationPath ) | ^( RecursiveAxisStep relativeLocationPath ) );
    public final ArrayList<Step> absoluteLocationPath() throws RecognitionException {
        ArrayList<Step> list = null;


        ArrayList<Step> relativeLocationPath4 =null;

        ArrayList<Step> relativeLocationPath5 =null;



        list = new ArrayList<Step>();
        ArrayList<Step> listtwo =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:57:2: ( SingleAxisStep | ^( RELATIVELOC SingleAxisStep relativeLocationPath ) | ^( RecursiveAxisStep relativeLocationPath ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case SingleAxisStep:
                {
                alt2=1;
                }
                break;
            case RELATIVELOC:
                {
                alt2=2;
                }
                break;
            case RecursiveAxisStep:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return list;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:57:2: SingleAxisStep
                    {
                    match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_absoluteLocationPath116); if (state.failed) return list;

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:58:2: ^( RELATIVELOC SingleAxisStep relativeLocationPath )
                    {
                    match(input,RELATIVELOC,FOLLOW_RELATIVELOC_in_absoluteLocationPath120); if (state.failed) return list;

                    match(input, Token.DOWN, null); if (state.failed) return list;
                    match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_absoluteLocationPath122); if (state.failed) return list;

                    pushFollow(FOLLOW_relativeLocationPath_in_absoluteLocationPath125);
                    relativeLocationPath4=relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return list;

                    if ( state.backtracking==0 ) {listtwo = relativeLocationPath4;
                                                              for(Step step:listtwo){
                                                                 list.add(step);
                                                              }

                                                              }

                    match(input, Token.UP, null); if (state.failed) return list;


                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:64:2: ^( RecursiveAxisStep relativeLocationPath )
                    {
                    match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_absoluteLocationPath131); if (state.failed) return list;

                    match(input, Token.DOWN, null); if (state.failed) return list;
                    pushFollow(FOLLOW_relativeLocationPath_in_absoluteLocationPath133);
                    relativeLocationPath5=relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return list;

                    if ( state.backtracking==0 ) {listtwo = relativeLocationPath5;
                                                                list.add(new DefaultAllNodeStep(new DescendantOrSelfAxis(AxisUtil.DESCENDANT_OR_SELF),new PredicateSet()));
                                                                for(Step step:listtwo){list.add(step);
                                                                                                          }}

                    match(input, Token.UP, null); if (state.failed) return list;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return list;
    }
    // $ANTLR end "absoluteLocationPath"



    // $ANTLR start "abbreviatedAbsoluteLocationPath"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:71:1: abbreviatedAbsoluteLocationPath : RecursiveAxisStep relativeLocationPath ;
    public final void abbreviatedAbsoluteLocationPath() throws RecognitionException {
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:71:32: ( RecursiveAxisStep relativeLocationPath )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:71:34: RecursiveAxisStep relativeLocationPath
            {
            match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_abbreviatedAbsoluteLocationPath144); if (state.failed) return ;

            pushFollow(FOLLOW_relativeLocationPath_in_abbreviatedAbsoluteLocationPath146);
            relativeLocationPath();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "abbreviatedAbsoluteLocationPath"



    // $ANTLR start "relativeLocationPath"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:75:1: relativeLocationPath returns [ArrayList<Step> list] : ( ^( SingleAxisStep step relativeLocationPathrec ) | ^( RecursiveAxisStep step relativeLocationPathrec ) | step );
    public final ArrayList<Step> relativeLocationPath() throws RecognitionException {
        ArrayList<Step> list = null;


        Step step6 =null;

        ArrayList<Step> relativeLocationPathrec7 =null;

        Step step8 =null;

        ArrayList<Step> relativeLocationPathrec9 =null;

        Step step10 =null;



        list = new ArrayList<Step>();

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:79:2: ( ^( SingleAxisStep step relativeLocationPathrec ) | ^( RecursiveAxisStep step relativeLocationPathrec ) | step )
            int alt3=3;
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
            case ABBREVIATED_AXIS_STEP:
            case ANY_NAMESPACED_NODE:
            case ANY_NODE:
            case NAMED_AXIS_STEP:
            case NCName:
            case NameSpacedQNAME:
            case ProcessingInstruction:
            case QNAME_PREDICATE:
            case Star:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return list;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:79:3: ^( SingleAxisStep step relativeLocationPathrec )
                    {
                    match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_relativeLocationPath165); if (state.failed) return list;

                    match(input, Token.DOWN, null); if (state.failed) return list;
                    pushFollow(FOLLOW_step_in_relativeLocationPath167);
                    step6=step();

                    state._fsp--;
                    if (state.failed) return list;

                    if ( state.backtracking==0 ) {list.add(step6);}

                    pushFollow(FOLLOW_relativeLocationPathrec_in_relativeLocationPath179);
                    relativeLocationPathrec7=relativeLocationPathrec();

                    state._fsp--;
                    if (state.failed) return list;

                    if ( state.backtracking==0 ) {List<Step> listone = relativeLocationPathrec7;
                                                for(Step stepone:listone){
                                                list.add(stepone);
                                                }
                                                }

                    match(input, Token.UP, null); if (state.failed) return list;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:86:3: ^( RecursiveAxisStep step relativeLocationPathrec )
                    {
                    match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_relativeLocationPath186); if (state.failed) return list;

                    match(input, Token.DOWN, null); if (state.failed) return list;
                    pushFollow(FOLLOW_step_in_relativeLocationPath188);
                    step8=step();

                    state._fsp--;
                    if (state.failed) return list;

                    if ( state.backtracking==0 ) {list.add(new DefaultAllNodeStep(new DescendantOrSelfAxis(AxisUtil.DESCENDANT_OR_SELF),new PredicateSet()));
                            list.add(step8);
                             }

                    pushFollow(FOLLOW_relativeLocationPathrec_in_relativeLocationPath201);
                    relativeLocationPathrec9=relativeLocationPathrec();

                    state._fsp--;
                    if (state.failed) return list;

                    if ( state.backtracking==0 ) {List<Step> listone = relativeLocationPathrec9;
                                                for(Step stepone:listone){
                                                list.add(stepone);
                                                }
                                                }

                    match(input, Token.UP, null); if (state.failed) return list;


                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:95:3: step
                    {
                    pushFollow(FOLLOW_step_in_relativeLocationPath207);
                    step10=step();

                    state._fsp--;
                    if (state.failed) return list;

                    if ( state.backtracking==0 ) {list.add(step10);
                         }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return list;
    }
    // $ANTLR end "relativeLocationPath"



    // $ANTLR start "relativeLocationPathrec"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:100:1: relativeLocationPathrec returns [ArrayList<Step> list] : relativeLocationPath ;
    public final ArrayList<Step> relativeLocationPathrec() throws RecognitionException {
        ArrayList<Step> list = null;


        ArrayList<Step> relativeLocationPath11 =null;



        list = null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:104:2: ( relativeLocationPath )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:104:2: relativeLocationPath
            {
            pushFollow(FOLLOW_relativeLocationPath_in_relativeLocationPathrec231);
            relativeLocationPath11=relativeLocationPath();

            state._fsp--;
            if (state.failed) return list;

            if ( state.backtracking==0 ) {list =relativeLocationPath11;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return list;
    }
    // $ANTLR end "relativeLocationPathrec"



    // $ANTLR start "step"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:109:1: step returns [Step step] : ( ^( QNAME_PREDICATE namedAxisStep predicate ) | namedAxisStep | ^( QNAME_PREDICATE abbreviatedAxisStep predicate ) | abbreviatedAxisStep );
    public final Step step() throws RecognitionException {
        Step step = null;


        NamedAxisStepUtil namedAxisStep12 =null;

        Predicate predicate13 =null;

        NamedAxisStepUtil namedAxisStep14 =null;

        Axis abbreviatedAxisStep15 =null;

        Predicate predicate16 =null;

        Axis abbreviatedAxisStep17 =null;



          step =null;
          NamedAxisStepUtil utiltemp =null;
           PredicateSet predi = new PredicateSet();
           Axis axis =null;
           String temp =null;
           QName qn=null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:118:3: ( ^( QNAME_PREDICATE namedAxisStep predicate ) | namedAxisStep | ^( QNAME_PREDICATE abbreviatedAxisStep predicate ) | abbreviatedAxisStep )
            int alt4=4;
            switch ( input.LA(1) ) {
            case QNAME_PREDICATE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case ANY_NAMESPACED_NODE:
                    case ANY_NODE:
                    case NAMED_AXIS_STEP:
                    case NCName:
                    case NameSpacedQNAME:
                    case ProcessingInstruction:
                    case Star:
                        {
                        alt4=1;
                        }
                        break;
                    case ABBREVIATED_AXIS_STEP:
                        {
                        alt4=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return step;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return step;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }

                }
                break;
            case ANY_NAMESPACED_NODE:
            case ANY_NODE:
            case NAMED_AXIS_STEP:
            case NCName:
            case NameSpacedQNAME:
            case ProcessingInstruction:
            case Star:
                {
                alt4=2;
                }
                break;
            case ABBREVIATED_AXIS_STEP:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return step;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:118:3: ^( QNAME_PREDICATE namedAxisStep predicate )
                    {
                    match(input,QNAME_PREDICATE,FOLLOW_QNAME_PREDICATE_in_step252); if (state.failed) return step;

                    match(input, Token.DOWN, null); if (state.failed) return step;
                    pushFollow(FOLLOW_namedAxisStep_in_step254);
                    namedAxisStep12=namedAxisStep();

                    state._fsp--;
                    if (state.failed) return step;

                    if ( state.backtracking==0 ) {
                                                       utiltemp = namedAxisStep12;
                                                       axis = utiltemp.getAxis();
                                                       qn = utiltemp.getQname();
                                                       temp = utiltemp.getValue();

                                                    if(axis == null){
                                                          axis = new ChildAxis(AxisUtil.CHILD,true);
                                                    }

                                                     if(temp==null){
                                                          step = new DefaultNameStep(axis,qn.getNamespaceURI(),qn.getLocalPart(),predi);
                                                     }
                                                     else if(temp.equals("comment")){
                                                              step = new DefaultCommentNodeStep(axis,predi);
                                                     }else if(temp.equals("text")){
                                                                 step = new DefaultTextNodeStep(axis,predi);
                                                     }else if(temp.equals("node")){
                                                             step = new DefaultAllNodeStep(axis,predi);
                                                     }else{
                                                            step = new DefaultProcessingInstructionNodeStep(axis,temp,predi);
                                                     }
                                                   }

                    pushFollow(FOLLOW_predicate_in_step294);
                    predicate13=predicate();

                    state._fsp--;
                    if (state.failed) return step;

                    if ( state.backtracking==0 ) {predi.addPredicate(predicate13);
                                                    }

                    match(input, Token.UP, null); if (state.failed) return step;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:146:2: namedAxisStep
                    {
                    pushFollow(FOLLOW_namedAxisStep_in_step365);
                    namedAxisStep14=namedAxisStep();

                    state._fsp--;
                    if (state.failed) return step;

                    if ( state.backtracking==0 ) {
                                                       utiltemp = namedAxisStep14;
                                                       axis = utiltemp.getAxis();
                                                       qn = utiltemp.getQname();
                                                       temp = utiltemp.getValue();

                                                    if(axis == null){
                                                          axis = new ChildAxis(AxisUtil.CHILD,true);
                                                    }

                                                     if(temp==null){
                                                          step = new DefaultNameStep(axis,qn.getNamespaceURI(),qn.getLocalPart(),predi);
                                                     }
                                                     else if(temp.equals("comment")){
                                                              step = new DefaultCommentNodeStep(axis,predi);
                                                     }else if(temp.equals("text")){
                                                                 step = new DefaultTextNodeStep(axis,predi);
                                                     }else if(temp.equals("node")){
                                                             step = new DefaultAllNodeStep(axis,predi);
                                                     }else{
                                                            step = new DefaultProcessingInstructionNodeStep(axis,temp,predi);
                                                     }
                                                   }

                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:169:2: ^( QNAME_PREDICATE abbreviatedAxisStep predicate )
                    {
                    match(input,QNAME_PREDICATE,FOLLOW_QNAME_PREDICATE_in_step372); if (state.failed) return step;

                    match(input, Token.DOWN, null); if (state.failed) return step;
                    pushFollow(FOLLOW_abbreviatedAxisStep_in_step374);
                    abbreviatedAxisStep15=abbreviatedAxisStep();

                    state._fsp--;
                    if (state.failed) return step;

                    if ( state.backtracking==0 ) {step = new DefaultAllNodeStep(abbreviatedAxisStep15,predi);
                                                  }

                    pushFollow(FOLLOW_predicate_in_step411);
                    predicate16=predicate();

                    state._fsp--;
                    if (state.failed) return step;

                    if ( state.backtracking==0 ) {predi.addPredicate(predicate16);
                                                 }

                    match(input, Token.UP, null); if (state.failed) return step;


                    }
                    break;
                case 4 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:176:5: abbreviatedAxisStep
                    {
                    pushFollow(FOLLOW_abbreviatedAxisStep_in_step453);
                    abbreviatedAxisStep17=abbreviatedAxisStep();

                    state._fsp--;
                    if (state.failed) return step;

                    if ( state.backtracking==0 ) {step = new DefaultAllNodeStep(abbreviatedAxisStep17,predi);
                                                  }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return step;
    }
    // $ANTLR end "step"



    // $ANTLR start "abbreviatedAxisStep"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:180:1: abbreviatedAxisStep returns [Axis axis] : ^( ABBREVIATED_AXIS_STEP a= AbbreviatedStep ) ;
    public final Axis abbreviatedAxisStep() throws RecognitionException {
        Axis axis = null;


        CommonTree a=null;


        axis = null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:184:2: ( ^( ABBREVIATED_AXIS_STEP a= AbbreviatedStep ) )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:184:3: ^( ABBREVIATED_AXIS_STEP a= AbbreviatedStep )
            {
            match(input,ABBREVIATED_AXIS_STEP,FOLLOW_ABBREVIATED_AXIS_STEP_in_abbreviatedAxisStep473); if (state.failed) return axis;

            match(input, Token.DOWN, null); if (state.failed) return axis;
            a=(CommonTree)match(input,AbbreviatedStep,FOLLOW_AbbreviatedStep_in_abbreviatedAxisStep479); if (state.failed) return axis;

            if ( state.backtracking==0 ) {if ((a!=null?a.getText():null).equals(".") )
                                                   {
                                                axis = new SelfAxis(AxisUtil.SELF);
                                                }
                                                else {
                                                axis = new DescendantOrSelfAxis(AxisUtil.DESCENDANT_OR_SELF);
                                                }
                                                }

            match(input, Token.UP, null); if (state.failed) return axis;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return axis;
    }
    // $ANTLR end "abbreviatedAxisStep"



    // $ANTLR start "namedAxisStep"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:196:1: namedAxisStep returns [NamedAxisStepUtil nameUtil] : ( ^( NAMED_AXIS_STEP axisSpecifier nodeTest ) | nodeTest );
    public final NamedAxisStepUtil namedAxisStep() throws RecognitionException {
        NamedAxisStepUtil nameUtil = null;


        Axis axisSpecifier18 =null;

        NamedAxisStepUtil nodeTest19 =null;

        NamedAxisStepUtil nodeTest20 =null;



        Axis axis = null;
        nameUtil = null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:201:2: ( ^( NAMED_AXIS_STEP axisSpecifier nodeTest ) | nodeTest )
            int alt5=2;
            switch ( input.LA(1) ) {
            case NAMED_AXIS_STEP:
                {
                alt5=1;
                }
                break;
            case ANY_NAMESPACED_NODE:
            case ANY_NODE:
            case NCName:
            case NameSpacedQNAME:
            case ProcessingInstruction:
            case Star:
                {
                alt5=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return nameUtil;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:201:3: ^( NAMED_AXIS_STEP axisSpecifier nodeTest )
                    {
                    match(input,NAMED_AXIS_STEP,FOLLOW_NAMED_AXIS_STEP_in_namedAxisStep537); if (state.failed) return nameUtil;

                    match(input, Token.DOWN, null); if (state.failed) return nameUtil;
                    pushFollow(FOLLOW_axisSpecifier_in_namedAxisStep540);
                    axisSpecifier18=axisSpecifier();

                    state._fsp--;
                    if (state.failed) return nameUtil;

                    if ( state.backtracking==0 ) {axis = axisSpecifier18;}

                    pushFollow(FOLLOW_nodeTest_in_namedAxisStep544);
                    nodeTest19=nodeTest();

                    state._fsp--;
                    if (state.failed) return nameUtil;

                    if ( state.backtracking==0 ) {nameUtil = nodeTest19;nameUtil.setAxis(axis);}

                    match(input, Token.UP, null); if (state.failed) return nameUtil;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:202:3: nodeTest
                    {
                    pushFollow(FOLLOW_nodeTest_in_namedAxisStep550);
                    nodeTest20=nodeTest();

                    state._fsp--;
                    if (state.failed) return nameUtil;

                    if ( state.backtracking==0 ) {nameUtil = nodeTest20;nameUtil.setAxis(axis);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return nameUtil;
    }
    // $ANTLR end "namedAxisStep"



    // $ANTLR start "axisSpecifier"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:205:1: axisSpecifier returns [Axis axisone] : ( ^( NAME_AXIS a= AxisName ) | ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier ) );
    public final Axis axisSpecifier() throws RecognitionException {
        Axis axisone = null;


        CommonTree a=null;


        axisone =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:209:2: ( ^( NAME_AXIS a= AxisName ) | ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case NAME_AXIS:
                {
                alt6=1;
                }
                break;
            case ATTRIBUTE_AXIS:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return axisone;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:209:2: ^( NAME_AXIS a= AxisName )
                    {
                    match(input,NAME_AXIS,FOLLOW_NAME_AXIS_in_axisSpecifier569); if (state.failed) return axisone;

                    match(input, Token.DOWN, null); if (state.failed) return axisone;
                    a=(CommonTree)match(input,AxisName,FOLLOW_AxisName_in_axisSpecifier573); if (state.failed) return axisone;

                    if ( state.backtracking==0 ) {axisone = AxisUtil.get((a!=null?a.getText():null));
                                  }

                    match(input, Token.UP, null); if (state.failed) return axisone;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:212:2: ^( ATTRIBUTE_AXIS AbbreviatedAxisSpecifier )
                    {
                    match(input,ATTRIBUTE_AXIS,FOLLOW_ATTRIBUTE_AXIS_in_axisSpecifier593); if (state.failed) return axisone;

                    match(input, Token.DOWN, null); if (state.failed) return axisone;
                    match(input,AbbreviatedAxisSpecifier,FOLLOW_AbbreviatedAxisSpecifier_in_axisSpecifier595); if (state.failed) return axisone;

                    if ( state.backtracking==0 ) {axisone = new AttributeAxis(AxisUtil.ATTRIBUTE);
                                }

                    match(input, Token.UP, null); if (state.failed) return axisone;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return axisone;
    }
    // $ANTLR end "axisSpecifier"



    // $ANTLR start "nodeTest"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:217:1: nodeTest returns [NamedAxisStepUtil stepUtil] : ( nameTest | ^( ANY_NODE a= NodeType ) | ^( ProcessingInstruction LeftParenthesis b= StringLiteral RightParenthesis ) );
    public final NamedAxisStepUtil nodeTest() throws RecognitionException {
        NamedAxisStepUtil stepUtil = null;


        CommonTree a=null;
        CommonTree b=null;
        QName nameTest21 =null;




        stepUtil = new NamedAxisStepUtil();

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:222:3: ( nameTest | ^( ANY_NODE a= NodeType ) | ^( ProcessingInstruction LeftParenthesis b= StringLiteral RightParenthesis ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case ANY_NAMESPACED_NODE:
            case NCName:
            case NameSpacedQNAME:
            case Star:
                {
                alt7=1;
                }
                break;
            case ANY_NODE:
                {
                alt7=2;
                }
                break;
            case ProcessingInstruction:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return stepUtil;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:222:3: nameTest
                    {
                    pushFollow(FOLLOW_nameTest_in_nodeTest627);
                    nameTest21=nameTest();

                    state._fsp--;
                    if (state.failed) return stepUtil;

                    if ( state.backtracking==0 ) {stepUtil.setQname(nameTest21);}

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:223:2: ^( ANY_NODE a= NodeType )
                    {
                    match(input,ANY_NODE,FOLLOW_ANY_NODE_in_nodeTest634); if (state.failed) return stepUtil;

                    match(input, Token.DOWN, null); if (state.failed) return stepUtil;
                    a=(CommonTree)match(input,NodeType,FOLLOW_NodeType_in_nodeTest639); if (state.failed) return stepUtil;

                    if ( state.backtracking==0 ) { if((a!=null?a.getText():null).equals("comment")){
                                                   stepUtil.setValue("comment");
                                               }
                                               else if((a!=null?a.getText():null).equals("node")){
                                                   stepUtil.setValue("node");
                                               }
                                               else if((a!=null?a.getText():null).equals("text")){
                                                   stepUtil.setValue("text");
                                               }   }

                    match(input, Token.UP, null); if (state.failed) return stepUtil;


                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:233:2: ^( ProcessingInstruction LeftParenthesis b= StringLiteral RightParenthesis )
                    {
                    match(input,ProcessingInstruction,FOLLOW_ProcessingInstruction_in_nodeTest664); if (state.failed) return stepUtil;

                    match(input, Token.DOWN, null); if (state.failed) return stepUtil;
                    match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_nodeTest666); if (state.failed) return stepUtil;

                    b=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_nodeTest670); if (state.failed) return stepUtil;

                    if ( state.backtracking==0 ) {stepUtil.setValue((b!=null?b.getText():null));}

                    match(input,RightParenthesis,FOLLOW_RightParenthesis_in_nodeTest673); if (state.failed) return stepUtil;

                    match(input, Token.UP, null); if (state.failed) return stepUtil;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return stepUtil;
    }
    // $ANTLR end "nodeTest"



    // $ANTLR start "nameTest"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:236:1: nameTest returns [QName qname] : ( ^( Star ) | ^( ANY_NAMESPACED_NODE b= NCName ) | qName );
    public final QName nameTest() throws RecognitionException {
        QName qname = null;


        CommonTree b=null;
        QName qName22 =null;



            qname =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:240:2: ( ^( Star ) | ^( ANY_NAMESPACED_NODE b= NCName ) | qName )
            int alt8=3;
            switch ( input.LA(1) ) {
            case Star:
                {
                alt8=1;
                }
                break;
            case ANY_NAMESPACED_NODE:
                {
                alt8=2;
                }
                break;
            case NCName:
            case NameSpacedQNAME:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return qname;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:240:2: ^( Star )
                    {
                    match(input,Star,FOLLOW_Star_in_nameTest692); if (state.failed) return qname;

                    if ( state.backtracking==0 ) {qname = new QName("","*");}

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return qname;
                        match(input, Token.UP, null); if (state.failed) return qname;
                    }


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:242:2: ^( ANY_NAMESPACED_NODE b= NCName )
                    {
                    match(input,ANY_NAMESPACED_NODE,FOLLOW_ANY_NAMESPACED_NODE_in_nameTest707); if (state.failed) return qname;

                    match(input, Token.DOWN, null); if (state.failed) return qname;
                    b=(CommonTree)match(input,NCName,FOLLOW_NCName_in_nameTest711); if (state.failed) return qname;

                    if ( state.backtracking==0 ) { qname = new QName((b!=null?b.getText():null),"*");}

                    match(input, Token.UP, null); if (state.failed) return qname;


                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:244:2: qName
                    {
                    pushFollow(FOLLOW_qName_in_nameTest725);
                    qName22=qName();

                    state._fsp--;
                    if (state.failed) return qname;

                    if ( state.backtracking==0 ) {qname = qName22;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return qname;
    }
    // $ANTLR end "nameTest"



    // $ANTLR start "predicate"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:249:2: predicate returns [Predicate expr] : ^( PREDICATE predicateExpr ) ;
    public final Predicate predicate() throws RecognitionException {
        Predicate expr = null;


        Expr predicateExpr23 =null;



         expr = null;
         
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:253:3: ( ^( PREDICATE predicateExpr ) )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:253:4: ^( PREDICATE predicateExpr )
            {
            match(input,PREDICATE,FOLLOW_PREDICATE_in_predicate757); if (state.failed) return expr;

            match(input, Token.DOWN, null); if (state.failed) return expr;
            pushFollow(FOLLOW_predicateExpr_in_predicate759);
            predicateExpr23=predicateExpr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = new DefaultPredicate(predicateExpr23);}

            match(input, Token.UP, null); if (state.failed) return expr;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "predicate"



    // $ANTLR start "predicateExpr"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:257:2: predicateExpr returns [Expr exprone] : expr ;
    public final Expr predicateExpr() throws RecognitionException {
        Expr exprone = null;


        Expr expr24 =null;



         exprone = null;
         
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:261:2: ( expr )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:261:4: expr
            {
            pushFollow(FOLLOW_expr_in_predicateExpr795);
            expr24=expr();

            state._fsp--;
            if (state.failed) return exprone;

            if ( state.backtracking==0 ) {exprone = expr24;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return exprone;
    }
    // $ANTLR end "predicateExpr"



    // $ANTLR start "functionCall"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:266:1: functionCall returns [FunctionCallExpr expr] : ^( FUNCALL qName ( ^( EXPRLIST expressionList ) )? ) ;
    public final FunctionCallExpr functionCall() throws RecognitionException {
        FunctionCallExpr expr = null;


        QName qName25 =null;

        List<Expr> expressionList26 =null;



        expr =null;
        QName qnameOne=null;


        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:273:2: ( ^( FUNCALL qName ( ^( EXPRLIST expressionList ) )? ) )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:273:4: ^( FUNCALL qName ( ^( EXPRLIST expressionList ) )? )
            {
            match(input,FUNCALL,FOLLOW_FUNCALL_in_functionCall830); if (state.failed) return expr;

            match(input, Token.DOWN, null); if (state.failed) return expr;
            pushFollow(FOLLOW_qName_in_functionCall832);
            qName25=qName();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {qnameOne=qName25;
            	                   expr = new DefaultFunctionCallExpr(qnameOne.getNamespaceURI(),qnameOne.getLocalPart());}

            // org/apache/synapse/xpath/compiler/XPath1Walker.g:275:111: ( ^( EXPRLIST expressionList ) )?
            int alt9=2;
            switch ( input.LA(1) ) {
                case EXPRLIST:
                    {
                    alt9=1;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:275:112: ^( EXPRLIST expressionList )
                    {
                    match(input,EXPRLIST,FOLLOW_EXPRLIST_in_functionCall855); if (state.failed) return expr;

                    match(input, Token.DOWN, null); if (state.failed) return expr;
                    pushFollow(FOLLOW_expressionList_in_functionCall857);
                    expressionList26=expressionList();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {
                    	                                                                  List<Expr> list = expressionList26;
                    	                                                                  for(Expr predi :list){
                    	                                                                  expr.addParameter(predi);
                    	                                                                  }

                    	                   }

                    match(input, Token.UP, null); if (state.failed) return expr;


                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return expr;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "functionCall"



    // $ANTLR start "expressionList"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:285:2: expressionList returns [List<Expr> list] : ^( expr ( ^( Comma exprrec ) )* ) ;
    public final List<Expr> expressionList() throws RecognitionException {
        List<Expr> list = null;


        Expr expr27 =null;

        Expr exprrec28 =null;



         list = new ArrayList();
         
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:289:2: ( ^( expr ( ^( Comma exprrec ) )* ) )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:289:3: ^( expr ( ^( Comma exprrec ) )* )
            {
            pushFollow(FOLLOW_expr_in_expressionList952);
            expr27=expr();

            state._fsp--;
            if (state.failed) return list;

            if ( state.backtracking==0 ) {list.add(expr27);}

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return list;
                // org/apache/synapse/xpath/compiler/XPath1Walker.g:289:34: ( ^( Comma exprrec ) )*
                loop10:
                do {
                    int alt10=2;
                    switch ( input.LA(1) ) {
                    case Comma:
                        {
                        alt10=1;
                        }
                        break;

                    }

                    switch (alt10) {
                	case 1 :
                	    // org/apache/synapse/xpath/compiler/XPath1Walker.g:289:35: ^( Comma exprrec )
                	    {
                	    match(input,Comma,FOLLOW_Comma_in_expressionList958); if (state.failed) return list;

                	    match(input, Token.DOWN, null); if (state.failed) return list;
                	    pushFollow(FOLLOW_exprrec_in_expressionList960);
                	    exprrec28=exprrec();

                	    state._fsp--;
                	    if (state.failed) return list;

                	    if ( state.backtracking==0 ) {list.add(exprrec28);}

                	    match(input, Token.UP, null); if (state.failed) return list;


                	    }
                	    break;

                	default :
                	    break loop10;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return list;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return list;
    }
    // $ANTLR end "expressionList"



    // $ANTLR start "exprrec"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:292:1: exprrec returns [Expr expr] : expr ;
    public final Expr exprrec() throws RecognitionException {
        Expr expr = null;


        Expr expr29 =null;



        expr =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:296:2: ( expr )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:296:2: expr
            {
            pushFollow(FOLLOW_expr_in_exprrec982);
            expr29=expr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = expr29;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "exprrec"



    // $ANTLR start "pathExpr"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:300:5: pathExpr returns [Expr expr] : ( locationPath | filterExpr simpleAxisStep relativeLocationPath | filterExpr );
    public final Expr pathExpr() throws RecognitionException {
        Expr expr = null;


        LocationPath locationPath30 =null;

        Expr filterExpr31 =null;

        String simpleAxisStep32 =null;

        ArrayList<Step> relativeLocationPath33 =null;

        Expr filterExpr34 =null;



                  expr =null;
                  Expr temp =null;
                  LocationPath tempone =null;
                  String value =null;
              
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:307:8: ( locationPath | filterExpr simpleAxisStep relativeLocationPath | filterExpr )
            int alt11=3;
            switch ( input.LA(1) ) {
            case ABBREVIATED_AXIS_STEP:
            case ANY_NAMESPACED_NODE:
            case ANY_NODE:
            case NAMED_AXIS_STEP:
            case NCName:
            case NameSpacedQNAME:
            case ProcessingInstruction:
            case QNAME_PREDICATE:
            case RELATIVELOC:
            case RecursiveAxisStep:
            case SingleAxisStep:
            case Star:
                {
                alt11=1;
                }
                break;
            case FILTER:
                {
                int LA11_13 = input.LA(2);

                if ( (synpred18_XPath1Walker()) ) {
                    alt11=2;
                }
                else if ( (true) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 13, input);

                    throw nvae;

                }
                }
                break;
            case LeftParenthesis:
                {
                int LA11_14 = input.LA(2);

                if ( (synpred18_XPath1Walker()) ) {
                    alt11=2;
                }
                else if ( (true) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 14, input);

                    throw nvae;

                }
                }
                break;
            case StringLiteral:
                {
                int LA11_15 = input.LA(2);

                if ( (synpred18_XPath1Walker()) ) {
                    alt11=2;
                }
                else if ( (true) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 15, input);

                    throw nvae;

                }
                }
                break;
            case IntegerLiteral:
                {
                int LA11_16 = input.LA(2);

                if ( (synpred18_XPath1Walker()) ) {
                    alt11=2;
                }
                else if ( (true) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 16, input);

                    throw nvae;

                }
                }
                break;
            case DecimalLiteral:
                {
                int LA11_17 = input.LA(2);

                if ( (synpred18_XPath1Walker()) ) {
                    alt11=2;
                }
                else if ( (true) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 17, input);

                    throw nvae;

                }
                }
                break;
            case DoubleLiteral:
                {
                int LA11_18 = input.LA(2);

                if ( (synpred18_XPath1Walker()) ) {
                    alt11=2;
                }
                else if ( (true) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 18, input);

                    throw nvae;

                }
                }
                break;
            case VariableReference:
                {
                int LA11_19 = input.LA(2);

                if ( (synpred18_XPath1Walker()) ) {
                    alt11=2;
                }
                else if ( (true) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 19, input);

                    throw nvae;

                }
                }
                break;
            case FUNCALL:
                {
                int LA11_20 = input.LA(2);

                if ( (synpred18_XPath1Walker()) ) {
                    alt11=2;
                }
                else if ( (true) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 20, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:307:9: locationPath
                    {
                    pushFollow(FOLLOW_locationPath_in_pathExpr1017);
                    locationPath30=locationPath();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new DefaultPathExpr(null,locationPath30);}

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:308:10: filterExpr simpleAxisStep relativeLocationPath
                    {
                    pushFollow(FOLLOW_filterExpr_in_pathExpr1031);
                    filterExpr31=filterExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {temp =filterExpr31;}

                    pushFollow(FOLLOW_simpleAxisStep_in_pathExpr1034);
                    simpleAxisStep32=simpleAxisStep();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {value = simpleAxisStep32;}

                    pushFollow(FOLLOW_relativeLocationPath_in_pathExpr1038);
                    relativeLocationPath33=relativeLocationPath();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {
                                  if(value.equals("/")){
                                       tempone = new DefaultRelativeLocationPath();
                                       List<Step> list = relativeLocationPath33;
                                       for(Step step:list){
                                       tempone.addStep(step);
                                       }
                                    expr = new DefaultPathExpr(temp,tempone);
                                  }else if(value.equals("//")){
                                       tempone = new DefaultRelativeLocationPath();
                                       List<Step> list = relativeLocationPath33;
                                       tempone.addStep(new DefaultAllNodeStep(new DescendantOrSelfAxis(AxisUtil.DESCENDANT_OR_SELF),new PredicateSet()));
                                       for(Step step:list){
                                       tempone.addStep(step);
                                       }
                                    expr = new DefaultPathExpr(temp,tempone);
                                  }
                           }

                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:326:10: filterExpr
                    {
                    pushFollow(FOLLOW_filterExpr_in_pathExpr1051);
                    filterExpr34=filterExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new DefaultPathExpr(filterExpr34,null);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "pathExpr"



    // $ANTLR start "simpleAxisStep"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:329:5: simpleAxisStep returns [String value] : ( ^( SingleAxisStep ) | ^( RecursiveAxisStep ) );
    public final String simpleAxisStep() throws RecognitionException {
        String value = null;



                value =null;
            
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:333:6: ( ^( SingleAxisStep ) | ^( RecursiveAxisStep ) )
            int alt12=2;
            switch ( input.LA(1) ) {
            case SingleAxisStep:
                {
                alt12=1;
                }
                break;
            case RecursiveAxisStep:
                {
                alt12=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:333:7: ^( SingleAxisStep )
                    {
                    match(input,SingleAxisStep,FOLLOW_SingleAxisStep_in_simpleAxisStep1094); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value ="/";}

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return value;
                        match(input, Token.UP, null); if (state.failed) return value;
                    }


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:334:8: ^( RecursiveAxisStep )
                    {
                    match(input,RecursiveAxisStep,FOLLOW_RecursiveAxisStep_in_simpleAxisStep1107); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = "//";}

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return value;
                        match(input, Token.UP, null); if (state.failed) return value;
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "simpleAxisStep"



    // $ANTLR start "filterExpr"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:337:3: filterExpr returns [Expr expr] : ( ^( FILTER primaryExpr predicate ) | primaryExpr );
    public final Expr filterExpr() throws RecognitionException {
        Expr expr = null;


        Expr primaryExpr35 =null;

        Predicate predicate36 =null;

        Expr primaryExpr37 =null;



                 expr =null;
                 Expr temp =null;
                 PredicateSet predica = new PredicateSet();

             
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:344:8: ( ^( FILTER primaryExpr predicate ) | primaryExpr )
            int alt13=2;
            switch ( input.LA(1) ) {
            case FILTER:
                {
                alt13=1;
                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case FUNCALL:
            case IntegerLiteral:
            case LeftParenthesis:
            case StringLiteral:
            case VariableReference:
                {
                alt13=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:344:10: ^( FILTER primaryExpr predicate )
                    {
                    match(input,FILTER,FOLLOW_FILTER_in_filterExpr1146); if (state.failed) return expr;

                    match(input, Token.DOWN, null); if (state.failed) return expr;
                    pushFollow(FOLLOW_primaryExpr_in_filterExpr1148);
                    primaryExpr35=primaryExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {temp =  primaryExpr35;}

                    pushFollow(FOLLOW_predicate_in_filterExpr1173);
                    predicate36=predicate();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {predica.addPredicate(predicate36);
                                    expr = new DefaultFilterExpr(temp,predica);}

                    match(input, Token.UP, null); if (state.failed) return expr;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:349:9: primaryExpr
                    {
                    pushFollow(FOLLOW_primaryExpr_in_filterExpr1201);
                    primaryExpr37=primaryExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new DefaultFilterExpr(primaryExpr37,predica);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "filterExpr"



    // $ANTLR start "primaryExpr"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:352:6: primaryExpr returns [Expr expro] : ( LeftParenthesis expr RightParenthesis | literal | functionCall );
    public final Expr primaryExpr() throws RecognitionException {
        Expr expro = null;


        Expr expr38 =null;

        Expr literal39 =null;

        FunctionCallExpr functionCall40 =null;



                    expro =null;
               
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:356:9: ( LeftParenthesis expr RightParenthesis | literal | functionCall )
            int alt14=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt14=1;
                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
            case StringLiteral:
            case VariableReference:
                {
                alt14=2;
                }
                break;
            case FUNCALL:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expro;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:356:11: LeftParenthesis expr RightParenthesis
                    {
                    match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_primaryExpr1245); if (state.failed) return expro;

                    pushFollow(FOLLOW_expr_in_primaryExpr1247);
                    expr38=expr();

                    state._fsp--;
                    if (state.failed) return expro;

                    if ( state.backtracking==0 ) {expro = expr38;}

                    match(input,RightParenthesis,FOLLOW_RightParenthesis_in_primaryExpr1277); if (state.failed) return expro;

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:359:12: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpr1290);
                    literal39=literal();

                    state._fsp--;
                    if (state.failed) return expro;

                    if ( state.backtracking==0 ) {expro = literal39;}

                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:360:12: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primaryExpr1305);
                    functionCall40=functionCall();

                    state._fsp--;
                    if (state.failed) return expro;

                    if ( state.backtracking==0 ) {expro = functionCall40;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expro;
    }
    // $ANTLR end "primaryExpr"



    // $ANTLR start "expr"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:366:2: expr returns [Expr expr] : orExpr ;
    public final Expr expr() throws RecognitionException {
        Expr expr = null;


        Expr orExpr41 =null;



         expr =null;
         
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:370:2: ( orExpr )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:370:4: orExpr
            {
            pushFollow(FOLLOW_orExpr_in_expr1358);
            orExpr41=orExpr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = orExpr41;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "expr"



    // $ANTLR start "orExpr"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:374:1: orExpr returns [Expr expr] : ( ^( Or andExpr orExprrec ) | andExpr );
    public final Expr orExpr() throws RecognitionException {
        Expr expr = null;


        Expr andExpr42 =null;

        Expr orExprrec43 =null;

        Expr andExpr44 =null;



            expr =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:378:2: ( ^( Or andExpr orExprrec ) | andExpr )
            int alt15=2;
            switch ( input.LA(1) ) {
            case Or:
                {
                alt15=1;
                }
                break;
            case ABBREVIATED_AXIS_STEP:
            case ANY_NAMESPACED_NODE:
            case ANY_NODE:
            case And:
            case DecimalLiteral:
            case DoubleLiteral:
            case EqualityOp:
            case FILTER:
            case FUNCALL:
            case IntegerLiteral:
            case LeftParenthesis:
            case NAMED_AXIS_STEP:
            case NCName:
            case NameSpacedQNAME:
            case Pipe:
            case ProcessingInstruction:
            case QNAME_PREDICATE:
            case RELATIVELOC:
            case RecursiveAxisStep:
            case SingleAxisStep:
            case Star:
            case StringLiteral:
            case VariableReference:
            case 62:
                {
                alt15=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:378:2: ^( Or andExpr orExprrec )
                    {
                    match(input,Or,FOLLOW_Or_in_orExpr1386); if (state.failed) return expr;

                    match(input, Token.DOWN, null); if (state.failed) return expr;
                    pushFollow(FOLLOW_andExpr_in_orExpr1388);
                    andExpr42=andExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    pushFollow(FOLLOW_orExprrec_in_orExpr1390);
                    orExprrec43=orExprrec();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new DefaultOrExpr(andExpr42,orExprrec43);}

                    match(input, Token.UP, null); if (state.failed) return expr;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:380:2: andExpr
                    {
                    pushFollow(FOLLOW_andExpr_in_orExpr1404);
                    andExpr44=andExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = andExpr44;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "orExpr"



    // $ANTLR start "orExprrec"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:383:1: orExprrec returns [Expr expr] : orExpr ;
    public final Expr orExprrec() throws RecognitionException {
        Expr expr = null;


        Expr orExpr45 =null;



        expr =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:387:3: ( orExpr )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:387:4: orExpr
            {
            pushFollow(FOLLOW_orExpr_in_orExprrec1424);
            orExpr45=orExpr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = orExpr45;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "orExprrec"



    // $ANTLR start "andExpr"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:390:1: andExpr returns [Expr expr] : ( ^( And equalityExpr andExprrec ) | equalityExpr );
    public final Expr andExpr() throws RecognitionException {
        Expr expr = null;


        Expr equalityExpr46 =null;

        Expr andExprrec47 =null;

        Expr equalityExpr48 =null;



        expr =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:394:2: ( ^( And equalityExpr andExprrec ) | equalityExpr )
            int alt16=2;
            switch ( input.LA(1) ) {
            case And:
                {
                alt16=1;
                }
                break;
            case ABBREVIATED_AXIS_STEP:
            case ANY_NAMESPACED_NODE:
            case ANY_NODE:
            case DecimalLiteral:
            case DoubleLiteral:
            case EqualityOp:
            case FILTER:
            case FUNCALL:
            case IntegerLiteral:
            case LeftParenthesis:
            case NAMED_AXIS_STEP:
            case NCName:
            case NameSpacedQNAME:
            case Pipe:
            case ProcessingInstruction:
            case QNAME_PREDICATE:
            case RELATIVELOC:
            case RecursiveAxisStep:
            case SingleAxisStep:
            case Star:
            case StringLiteral:
            case VariableReference:
            case 62:
                {
                alt16=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:394:3: ^( And equalityExpr andExprrec )
                    {
                    match(input,And,FOLLOW_And_in_andExpr1446); if (state.failed) return expr;

                    match(input, Token.DOWN, null); if (state.failed) return expr;
                    pushFollow(FOLLOW_equalityExpr_in_andExpr1448);
                    equalityExpr46=equalityExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    pushFollow(FOLLOW_andExprrec_in_andExpr1450);
                    andExprrec47=andExprrec();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new DefaultAndExpr(equalityExpr46,andExprrec47);}

                    match(input, Token.UP, null); if (state.failed) return expr;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:396:4: equalityExpr
                    {
                    pushFollow(FOLLOW_equalityExpr_in_andExpr1463);
                    equalityExpr48=equalityExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = equalityExpr48;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "andExpr"



    // $ANTLR start "andExprrec"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:399:1: andExprrec returns [Expr expr] : andExpr ;
    public final Expr andExprrec() throws RecognitionException {
        Expr expr = null;


        Expr andExpr49 =null;



        expr =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:403:2: ( andExpr )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:403:2: andExpr
            {
            pushFollow(FOLLOW_andExpr_in_andExprrec1483);
            andExpr49=andExpr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = andExpr49;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "andExprrec"



    // $ANTLR start "equalityExpr"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:407:1: equalityExpr returns [Expr expr] : ( ^(a= EqualityOp relationalExpr equalityExprrec ) | relationalExpr );
    public final Expr equalityExpr() throws RecognitionException {
        Expr expr = null;


        CommonTree a=null;
        Expr relationalExpr50 =null;

        Expr equalityExprrec51 =null;

        Expr relationalExpr52 =null;



        expr =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:411:2: ( ^(a= EqualityOp relationalExpr equalityExprrec ) | relationalExpr )
            int alt17=2;
            switch ( input.LA(1) ) {
            case EqualityOp:
                {
                alt17=1;
                }
                break;
            case ABBREVIATED_AXIS_STEP:
            case ANY_NAMESPACED_NODE:
            case ANY_NODE:
            case DecimalLiteral:
            case DoubleLiteral:
            case FILTER:
            case FUNCALL:
            case IntegerLiteral:
            case LeftParenthesis:
            case NAMED_AXIS_STEP:
            case NCName:
            case NameSpacedQNAME:
            case Pipe:
            case ProcessingInstruction:
            case QNAME_PREDICATE:
            case RELATIVELOC:
            case RecursiveAxisStep:
            case SingleAxisStep:
            case Star:
            case StringLiteral:
            case VariableReference:
            case 62:
                {
                alt17=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:411:4: ^(a= EqualityOp relationalExpr equalityExprrec )
                    {
                    a=(CommonTree)match(input,EqualityOp,FOLLOW_EqualityOp_in_equalityExpr1508); if (state.failed) return expr;

                    match(input, Token.DOWN, null); if (state.failed) return expr;
                    pushFollow(FOLLOW_relationalExpr_in_equalityExpr1510);
                    relationalExpr50=relationalExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    pushFollow(FOLLOW_equalityExprrec_in_equalityExpr1512);
                    equalityExprrec51=equalityExprrec();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {if((a!=null?a.getText():null).equals("=")){
                                                                       expr = new DefaultEqualsExpr(relationalExpr50,equalityExprrec51);
                                                                       }
                                                                       else{
                                                                       expr = new DefaultNotEqualsExpr(relationalExpr50,equalityExprrec51);
                                                                       }}

                    match(input, Token.UP, null); if (state.failed) return expr;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:418:4: relationalExpr
                    {
                    pushFollow(FOLLOW_relationalExpr_in_equalityExpr1570);
                    relationalExpr52=relationalExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = relationalExpr52;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "equalityExpr"



    // $ANTLR start "equalityExprrec"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:421:1: equalityExprrec returns [Expr expr] : equalityExpr ;
    public final Expr equalityExprrec() throws RecognitionException {
        Expr expr = null;


        Expr equalityExpr53 =null;



        expr =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:425:2: ( equalityExpr )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:425:2: equalityExpr
            {
            pushFollow(FOLLOW_equalityExpr_in_equalityExprrec1590);
            equalityExpr53=equalityExpr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = equalityExpr53;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "equalityExprrec"



    // $ANTLR start "relationalExpr"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:429:1: relationalExpr returns [Expr expr] : ^( additiveExpr ( ^(b= RelationalOp additiveExprrec ) )* ) ;
    public final Expr relationalExpr() throws RecognitionException {
        Expr expr = null;


        CommonTree b=null;
        Expr additiveExpr54 =null;

        Expr additiveExprrec55 =null;



        expr = null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:433:2: ( ^( additiveExpr ( ^(b= RelationalOp additiveExprrec ) )* ) )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:433:3: ^( additiveExpr ( ^(b= RelationalOp additiveExprrec ) )* )
            {
            pushFollow(FOLLOW_additiveExpr_in_relationalExpr1611);
            additiveExpr54=additiveExpr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr =additiveExpr54;}

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return expr;
                // org/apache/synapse/xpath/compiler/XPath1Walker.g:433:47: ( ^(b= RelationalOp additiveExprrec ) )*
                loop18:
                do {
                    int alt18=2;
                    switch ( input.LA(1) ) {
                    case RelationalOp:
                        {
                        alt18=1;
                        }
                        break;

                    }

                    switch (alt18) {
                	case 1 :
                	    // org/apache/synapse/xpath/compiler/XPath1Walker.g:433:48: ^(b= RelationalOp additiveExprrec )
                	    {
                	    b=(CommonTree)match(input,RelationalOp,FOLLOW_RelationalOp_in_relationalExpr1620); if (state.failed) return expr;

                	    match(input, Token.DOWN, null); if (state.failed) return expr;
                	    pushFollow(FOLLOW_additiveExprrec_in_relationalExpr1622);
                	    additiveExprrec55=additiveExprrec();

                	    state._fsp--;
                	    if (state.failed) return expr;

                	    if ( state.backtracking==0 ) {
                	                             if((b!=null?b.getText():null).equals("<")){
                	                             expr = new DefaultLessThanExpr(additiveExpr54,additiveExprrec55);

                	                             }else if((b!=null?b.getText():null).equals("<=")){
                	                                         expr = new DefaultLessThanEqualExpr(additiveExpr54,additiveExprrec55);

                	                             }else if((b!=null?b.getText():null).equals(">")){
                	                                  expr = new DefaultGreaterThanExpr(additiveExpr54,additiveExprrec55);

                	                             }else if((b!=null?b.getText():null).equals("=>")){
                	                                  expr = new DefaultGreaterThanEqualExpr(additiveExpr54,additiveExprrec55);
                	                             }




                	     }

                	    match(input, Token.UP, null); if (state.failed) return expr;


                	    }
                	    break;

                	default :
                	    break loop18;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return expr;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "relationalExpr"



    // $ANTLR start "additiveExprrec"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:452:1: additiveExprrec returns [Expr expr] : additiveExpr ;
    public final Expr additiveExprrec() throws RecognitionException {
        Expr expr = null;


        Expr additiveExpr56 =null;



        expr =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:456:2: ( additiveExpr )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:456:2: additiveExpr
            {
            pushFollow(FOLLOW_additiveExpr_in_additiveExprrec1643);
            additiveExpr56=additiveExpr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = additiveExpr56;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "additiveExprrec"



    // $ANTLR start "additiveExpr"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:459:1: additiveExpr returns [Expr expr] : ^( multiplicativeExpr ( ^(b= MultiplicativeOP multiplicativeExprrec ) )* ) ;
    public final Expr additiveExpr() throws RecognitionException {
        Expr expr = null;


        CommonTree b=null;
        Expr multiplicativeExpr57 =null;

        Expr multiplicativeExprrec58 =null;



        expr = null;


        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:464:2: ( ^( multiplicativeExpr ( ^(b= MultiplicativeOP multiplicativeExprrec ) )* ) )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:464:3: ^( multiplicativeExpr ( ^(b= MultiplicativeOP multiplicativeExprrec ) )* )
            {
            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr1663);
            multiplicativeExpr57=multiplicativeExpr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = multiplicativeExpr57; }

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return expr;
                // org/apache/synapse/xpath/compiler/XPath1Walker.g:464:61: ( ^(b= MultiplicativeOP multiplicativeExprrec ) )*
                loop19:
                do {
                    int alt19=2;
                    switch ( input.LA(1) ) {
                    case MultiplicativeOP:
                        {
                        alt19=1;
                        }
                        break;

                    }

                    switch (alt19) {
                	case 1 :
                	    // org/apache/synapse/xpath/compiler/XPath1Walker.g:464:62: ^(b= MultiplicativeOP multiplicativeExprrec )
                	    {
                	    b=(CommonTree)match(input,MultiplicativeOP,FOLLOW_MultiplicativeOP_in_additiveExpr1672); if (state.failed) return expr;

                	    match(input, Token.DOWN, null); if (state.failed) return expr;
                	    pushFollow(FOLLOW_multiplicativeExprrec_in_additiveExpr1674);
                	    multiplicativeExprrec58=multiplicativeExprrec();

                	    state._fsp--;
                	    if (state.failed) return expr;

                	    if ( state.backtracking==0 ) {
                	                                                           if((b!=null?b.getText():null).equals("+")){
                	                                                                   expr = new DefaultPlusExpr(multiplicativeExpr57,multiplicativeExprrec58);
                	                                                           }else{
                	                                                               expr = new DefaultMinusExpr(multiplicativeExpr57,multiplicativeExprrec58);
                	                                                           }






                	     }

                	    match(input, Token.UP, null); if (state.failed) return expr;


                	    }
                	    break;

                	default :
                	    break loop19;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return expr;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "additiveExpr"



    // $ANTLR start "multiplicativeExprrec"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:478:1: multiplicativeExprrec returns [Expr expr] : multiplicativeExpr ;
    public final Expr multiplicativeExprrec() throws RecognitionException {
        Expr expr = null;


        Expr multiplicativeExpr59 =null;



        expr =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:482:2: ( multiplicativeExpr )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:482:3: multiplicativeExpr
            {
            pushFollow(FOLLOW_multiplicativeExpr_in_multiplicativeExprrec1696);
            multiplicativeExpr59=multiplicativeExpr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = multiplicativeExpr59;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "multiplicativeExprrec"



    // $ANTLR start "multiplicativeExpr"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:487:2: multiplicativeExpr returns [Expr expr] : ^( unaryExpr ( ^(b= UnaryOp unaryExprrec ) )* ) ;
    public final Expr multiplicativeExpr() throws RecognitionException {
        Expr expr = null;


        CommonTree b=null;
        Expr unaryExpr60 =null;

        Expr unaryExprrec61 =null;



         expr = null;

         
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:492:2: ( ^( unaryExpr ( ^(b= UnaryOp unaryExprrec ) )* ) )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:492:3: ^( unaryExpr ( ^(b= UnaryOp unaryExprrec ) )* )
            {
            pushFollow(FOLLOW_unaryExpr_in_multiplicativeExpr1722);
            unaryExpr60=unaryExpr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = unaryExpr60;}

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return expr;
                // org/apache/synapse/xpath/compiler/XPath1Walker.g:492:43: ( ^(b= UnaryOp unaryExprrec ) )*
                loop20:
                do {
                    int alt20=2;
                    switch ( input.LA(1) ) {
                    case UnaryOp:
                        {
                        alt20=1;
                        }
                        break;

                    }

                    switch (alt20) {
                	case 1 :
                	    // org/apache/synapse/xpath/compiler/XPath1Walker.g:492:44: ^(b= UnaryOp unaryExprrec )
                	    {
                	    b=(CommonTree)match(input,UnaryOp,FOLLOW_UnaryOp_in_multiplicativeExpr1731); if (state.failed) return expr;

                	    match(input, Token.DOWN, null); if (state.failed) return expr;
                	    pushFollow(FOLLOW_unaryExprrec_in_multiplicativeExpr1733);
                	    unaryExprrec61=unaryExprrec();

                	    state._fsp--;
                	    if (state.failed) return expr;

                	    if ( state.backtracking==0 ) {
                	                           if((b!=null?b.getText():null).equals("*")){
                	                              expr = new DefaultMultiplyExpr(unaryExpr60,unaryExprrec61);
                	                           }else if((b!=null?b.getText():null).equals("mod")){
                	                                 expr = new DefaultModExpr(unaryExpr60,unaryExprrec61);
                	                           }else if((b!=null?b.getText():null).equals("div")){
                	                                 expr = new DefaultDivExpr(unaryExpr60,unaryExprrec61);
                	                           }
                	     }

                	    match(input, Token.UP, null); if (state.failed) return expr;


                	    }
                	    break;

                	default :
                	    break loop20;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return expr;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "multiplicativeExpr"



    // $ANTLR start "unaryExprrec"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:503:1: unaryExprrec returns [Expr expr] : unaryExpr ;
    public final Expr unaryExprrec() throws RecognitionException {
        Expr expr = null;


        Expr unaryExpr62 =null;



        expr =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:507:2: ( unaryExpr )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:507:2: unaryExpr
            {
            pushFollow(FOLLOW_unaryExpr_in_unaryExprrec1755);
            unaryExpr62=unaryExpr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = unaryExpr62;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "unaryExprrec"



    // $ANTLR start "unaryExpr"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:510:2: unaryExpr returns [Expr expr] : ( unionExpr | '-' unaryExpr );
    public final Expr unaryExpr() throws RecognitionException {
        Expr expr = null;


        Expr unionExpr63 =null;



          expr =null;
            Expr temp =null;
         
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:515:4: ( unionExpr | '-' unaryExpr )
            int alt21=2;
            switch ( input.LA(1) ) {
            case ABBREVIATED_AXIS_STEP:
            case ANY_NAMESPACED_NODE:
            case ANY_NODE:
            case DecimalLiteral:
            case DoubleLiteral:
            case FILTER:
            case FUNCALL:
            case IntegerLiteral:
            case LeftParenthesis:
            case NAMED_AXIS_STEP:
            case NCName:
            case NameSpacedQNAME:
            case Pipe:
            case ProcessingInstruction:
            case QNAME_PREDICATE:
            case RELATIVELOC:
            case RecursiveAxisStep:
            case SingleAxisStep:
            case Star:
            case StringLiteral:
            case VariableReference:
                {
                alt21=1;
                }
                break;
            case 62:
                {
                alt21=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:515:5: unionExpr
                    {
                    pushFollow(FOLLOW_unionExpr_in_unaryExpr1778);
                    unionExpr63=unionExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new DefaultUnaryExpr(unionExpr63);}

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:516:5: '-' unaryExpr
                    {
                    match(input,62,FOLLOW_62_in_unaryExpr1787); if (state.failed) return expr;

                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr1789);
                    unaryExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "unaryExpr"



    // $ANTLR start "unionExpr"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:519:4: unionExpr returns [Expr expr] : ( ^( Pipe pathExpr unionExprrec ) | pathExpr );
    public final Expr unionExpr() throws RecognitionException {
        Expr expr = null;


        Expr pathExpr64 =null;

        Expr unionExprrec65 =null;

        Expr pathExpr66 =null;



           expr =null;
           
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:523:5: ( ^( Pipe pathExpr unionExprrec ) | pathExpr )
            int alt22=2;
            switch ( input.LA(1) ) {
            case Pipe:
                {
                alt22=1;
                }
                break;
            case ABBREVIATED_AXIS_STEP:
            case ANY_NAMESPACED_NODE:
            case ANY_NODE:
            case DecimalLiteral:
            case DoubleLiteral:
            case FILTER:
            case FUNCALL:
            case IntegerLiteral:
            case LeftParenthesis:
            case NAMED_AXIS_STEP:
            case NCName:
            case NameSpacedQNAME:
            case ProcessingInstruction:
            case QNAME_PREDICATE:
            case RELATIVELOC:
            case RecursiveAxisStep:
            case SingleAxisStep:
            case Star:
            case StringLiteral:
            case VariableReference:
                {
                alt22=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:523:6: ^( Pipe pathExpr unionExprrec )
                    {
                    match(input,Pipe,FOLLOW_Pipe_in_unionExpr1819); if (state.failed) return expr;

                    match(input, Token.DOWN, null); if (state.failed) return expr;
                    pushFollow(FOLLOW_pathExpr_in_unionExpr1821);
                    pathExpr64=pathExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    pushFollow(FOLLOW_unionExprrec_in_unionExpr1823);
                    unionExprrec65=unionExprrec();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new DefaultUnionExpr(pathExpr64,unionExprrec65);}

                    match(input, Token.UP, null); if (state.failed) return expr;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:524:6: pathExpr
                    {
                    pushFollow(FOLLOW_pathExpr_in_unionExpr1832);
                    pathExpr66=pathExpr();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = pathExpr66;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "unionExpr"



    // $ANTLR start "unionExprrec"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:527:3: unionExprrec returns [Expr expr] : unionExpr ;
    public final Expr unionExprrec() throws RecognitionException {
        Expr expr = null;


        Expr unionExpr67 =null;



        expr =null;

        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:531:2: ( unionExpr )
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:531:2: unionExpr
            {
            pushFollow(FOLLOW_unionExpr_in_unionExprrec1856);
            unionExpr67=unionExpr();

            state._fsp--;
            if (state.failed) return expr;

            if ( state.backtracking==0 ) {expr = unionExpr67;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "unionExprrec"



    // $ANTLR start "literal"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:534:4: literal returns [Expr expr] : ( ^(a= StringLiteral ) | ^( numericLiteral ) | ^(b= VariableReference ) );
    public final Expr literal() throws RecognitionException {
        Expr expr = null;


        CommonTree a=null;
        CommonTree b=null;
        Double numericLiteral68 =null;



           expr =null;
           
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:538:5: ( ^(a= StringLiteral ) | ^( numericLiteral ) | ^(b= VariableReference ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt23=1;
                }
                break;
            case DecimalLiteral:
            case DoubleLiteral:
            case IntegerLiteral:
                {
                alt23=2;
                }
                break;
            case VariableReference:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:538:6: ^(a= StringLiteral )
                    {
                    a=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal1888); if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new DefaultLiteralExpr((a!=null?a.getText():null));}

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return expr;
                        match(input, Token.UP, null); if (state.failed) return expr;
                    }


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:539:7: ^( numericLiteral )
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal1900);
                    numericLiteral68=numericLiteral();

                    state._fsp--;
                    if (state.failed) return expr;

                    if ( state.backtracking==0 ) {expr = new DefaultNumberExpr(numericLiteral68);}

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return expr;
                        match(input, Token.UP, null); if (state.failed) return expr;
                    }


                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:540:8: ^(b= VariableReference )
                    {
                    b=(CommonTree)match(input,VariableReference,FOLLOW_VariableReference_in_literal1916); if (state.failed) return expr;

                    if ( state.backtracking==0 ) { String c =(b!=null?b.getText():null).substring(1);
                            expr = new DefaultVariableReferenceExpr("",c);}

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return expr;
                        match(input, Token.UP, null); if (state.failed) return expr;
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expr;
    }
    // $ANTLR end "literal"



    // $ANTLR start "numericLiteral"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:544:3: numericLiteral returns [Double valueone] : (a= IntegerLiteral |b= DecimalLiteral |c= DoubleLiteral );
    public final Double numericLiteral() throws RecognitionException {
        Double valueone = null;


        CommonTree a=null;
        CommonTree b=null;
        CommonTree c=null;


          String value =null;
          valueone =null;
          
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:550:6: (a= IntegerLiteral |b= DecimalLiteral |c= DoubleLiteral )
            int alt24=3;
            switch ( input.LA(1) ) {
            case IntegerLiteral:
                {
                alt24=1;
                }
                break;
            case DecimalLiteral:
                {
                alt24=2;
                }
                break;
            case DoubleLiteral:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return valueone;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:550:8: a= IntegerLiteral
                    {
                    a=(CommonTree)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_numericLiteral1953); if (state.failed) return valueone;

                    if ( state.backtracking==0 ) {value = (a!=null?a.getText():null);valueone = Double.parseDouble(value);}

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:551:7: b= DecimalLiteral
                    {
                    b=(CommonTree)match(input,DecimalLiteral,FOLLOW_DecimalLiteral_in_numericLiteral1967); if (state.failed) return valueone;

                    if ( state.backtracking==0 ) {value = (b!=null?b.getText():null);valueone = Double.parseDouble(value);}

                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:552:7: c= DoubleLiteral
                    {
                    c=(CommonTree)match(input,DoubleLiteral,FOLLOW_DoubleLiteral_in_numericLiteral1981); if (state.failed) return valueone;

                    if ( state.backtracking==0 ) {value = (c!=null?c.getText():null);valueone = Double.parseDouble(value);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return valueone;
    }
    // $ANTLR end "numericLiteral"



    // $ANTLR start "qName"
    // org/apache/synapse/xpath/compiler/XPath1Walker.g:555:2: qName returns [QName name] : ( ^( NameSpacedQNAME a= NCName b= NCName ) | ^(c= NCName ) );
    public final QName qName() throws RecognitionException {
        QName name = null;


        CommonTree a=null;
        CommonTree b=null;
        CommonTree c=null;


         name =null;
         
        try {
            // org/apache/synapse/xpath/compiler/XPath1Walker.g:559:2: ( ^( NameSpacedQNAME a= NCName b= NCName ) | ^(c= NCName ) )
            int alt25=2;
            switch ( input.LA(1) ) {
            case NameSpacedQNAME:
                {
                alt25=1;
                }
                break;
            case NCName:
                {
                alt25=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return name;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:559:3: ^( NameSpacedQNAME a= NCName b= NCName )
                    {
                    match(input,NameSpacedQNAME,FOLLOW_NameSpacedQNAME_in_qName2010); if (state.failed) return name;

                    match(input, Token.DOWN, null); if (state.failed) return name;
                    a=(CommonTree)match(input,NCName,FOLLOW_NCName_in_qName2015); if (state.failed) return name;

                    b=(CommonTree)match(input,NCName,FOLLOW_NCName_in_qName2019); if (state.failed) return name;

                    if ( state.backtracking==0 ) {  name = new QName((a!=null?a.getText():null),(b!=null?b.getText():null));}

                    match(input, Token.UP, null); if (state.failed) return name;


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1Walker.g:560:3: ^(c= NCName )
                    {
                    c=(CommonTree)match(input,NCName,FOLLOW_NCName_in_qName2029); if (state.failed) return name;

                    if ( state.backtracking==0 ) {name = new QName("",(c!=null?c.getText():null));}

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return name;
                        match(input, Token.UP, null); if (state.failed) return name;
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "qName"

    // $ANTLR start synpred1_XPath1Walker
    public final void synpred1_XPath1Walker_fragment() throws RecognitionException {
        // org/apache/synapse/xpath/compiler/XPath1Walker.g:34:7: ( relativeLocationPath )
        // org/apache/synapse/xpath/compiler/XPath1Walker.g:34:7: relativeLocationPath
        {
        pushFollow(FOLLOW_relativeLocationPath_in_synpred1_XPath1Walker84);
        relativeLocationPath();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_XPath1Walker

    // $ANTLR start synpred18_XPath1Walker
    public final void synpred18_XPath1Walker_fragment() throws RecognitionException {
        // org/apache/synapse/xpath/compiler/XPath1Walker.g:308:10: ( filterExpr simpleAxisStep relativeLocationPath )
        // org/apache/synapse/xpath/compiler/XPath1Walker.g:308:10: filterExpr simpleAxisStep relativeLocationPath
        {
        pushFollow(FOLLOW_filterExpr_in_synpred18_XPath1Walker1031);
        filterExpr();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_simpleAxisStep_in_synpred18_XPath1Walker1034);
        simpleAxisStep();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_relativeLocationPath_in_synpred18_XPath1Walker1038);
        relativeLocationPath();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred18_XPath1Walker

    // Delegated rules

    public final boolean synpred1_XPath1Walker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_XPath1Walker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_XPath1Walker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_XPath1Walker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_locationPath_in_xpath57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeLocationPath_in_locationPath84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_absoluteLocationPath_in_locationPath94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SingleAxisStep_in_absoluteLocationPath116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELATIVELOC_in_absoluteLocationPath120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SingleAxisStep_in_absoluteLocationPath122 = new BitSet(new long[]{0x0060940A800000D0L});
    public static final BitSet FOLLOW_relativeLocationPath_in_absoluteLocationPath125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_absoluteLocationPath131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relativeLocationPath_in_absoluteLocationPath133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_abbreviatedAbsoluteLocationPath144 = new BitSet(new long[]{0x0060940A800000D0L});
    public static final BitSet FOLLOW_relativeLocationPath_in_abbreviatedAbsoluteLocationPath146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SingleAxisStep_in_relativeLocationPath165 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_step_in_relativeLocationPath167 = new BitSet(new long[]{0x0060940A800000D0L});
    public static final BitSet FOLLOW_relativeLocationPathrec_in_relativeLocationPath179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_relativeLocationPath186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_step_in_relativeLocationPath188 = new BitSet(new long[]{0x0060940A800000D0L});
    public static final BitSet FOLLOW_relativeLocationPathrec_in_relativeLocationPath201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_step_in_relativeLocationPath207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativeLocationPath_in_relativeLocationPathrec231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QNAME_PREDICATE_in_step252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_namedAxisStep_in_step254 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_predicate_in_step294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_namedAxisStep_in_step365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QNAME_PREDICATE_in_step372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_abbreviatedAxisStep_in_step374 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_predicate_in_step411 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_abbreviatedAxisStep_in_step453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABBREVIATED_AXIS_STEP_in_abbreviatedAxisStep473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AbbreviatedStep_in_abbreviatedAxisStep479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMED_AXIS_STEP_in_namedAxisStep537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_axisSpecifier_in_namedAxisStep540 = new BitSet(new long[]{0x0040040A000000C0L});
    public static final BitSet FOLLOW_nodeTest_in_namedAxisStep544 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_nodeTest_in_namedAxisStep550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_AXIS_in_axisSpecifier569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AxisName_in_axisSpecifier573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATTRIBUTE_AXIS_in_axisSpecifier593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AbbreviatedAxisSpecifier_in_axisSpecifier595 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_NODE_in_nodeTest634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NodeType_in_nodeTest639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ProcessingInstruction_in_nodeTest664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LeftParenthesis_in_nodeTest666 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_nodeTest670 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_nodeTest673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Star_in_nameTest692 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ANY_NAMESPACED_NODE_in_nameTest707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NCName_in_nameTest711 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_qName_in_nameTest725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREDICATE_in_predicate757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_predicateExpr_in_predicate759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_predicateExpr795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCALL_in_functionCall830 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qName_in_functionCall832 = new BitSet(new long[]{0x0000000000100008L});
    public static final BitSet FOLLOW_EXPRLIST_in_functionCall855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_functionCall857 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_expressionList952 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Comma_in_expressionList958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprrec_in_expressionList960 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_exprrec982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_locationPath_in_pathExpr1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterExpr_in_pathExpr1031 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_simpleAxisStep_in_pathExpr1034 = new BitSet(new long[]{0x0060940A800000D0L});
    public static final BitSet FOLLOW_relativeLocationPath_in_pathExpr1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterExpr_in_pathExpr1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SingleAxisStep_in_simpleAxisStep1094 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RecursiveAxisStep_in_simpleAxisStep1107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FILTER_in_filterExpr1146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr1148 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_predicate_in_filterExpr1173 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_primaryExpr1245 = new BitSet(new long[]{0x50E0B64A85E610D0L});
    public static final BitSet FOLLOW_expr_in_primaryExpr1247 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_primaryExpr1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_expr1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_orExpr1386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1388 = new BitSet(new long[]{0x50E0B64A85E610D0L});
    public static final BitSet FOLLOW_orExprrec_in_orExpr1390 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_orExprrec1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_And_in_andExpr1446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalityExpr_in_andExpr1448 = new BitSet(new long[]{0x50E0B60A85E610D0L});
    public static final BitSet FOLLOW_andExprrec_in_andExpr1450 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_equalityExpr_in_andExpr1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_andExprrec1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualityOp_in_equalityExpr1508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr1510 = new BitSet(new long[]{0x50E0B60A85E600D0L});
    public static final BitSet FOLLOW_equalityExprrec_in_equalityExpr1512 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_equalityExprrec1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_relationalExpr1611 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RelationalOp_in_relationalExpr1620 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_additiveExprrec_in_relationalExpr1622 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_additiveExpr_in_additiveExprrec1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr1663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MultiplicativeOP_in_additiveExpr1672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_multiplicativeExprrec_in_additiveExpr1674 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_multiplicativeExprrec1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_multiplicativeExpr1722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnaryOp_in_multiplicativeExpr1731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_unaryExprrec_in_multiplicativeExpr1733 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExprrec1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unionExpr_in_unaryExpr1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_unaryExpr1787 = new BitSet(new long[]{0x50E0B60A85C600D0L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Pipe_in_unionExpr1819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pathExpr_in_unionExpr1821 = new BitSet(new long[]{0x10E0B60A85C600D0L});
    public static final BitSet FOLLOW_unionExprrec_in_unionExpr1823 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pathExpr_in_unionExpr1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unionExpr_in_unionExprrec1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal1888 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericLiteral_in_literal1900 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VariableReference_in_literal1916 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IntegerLiteral_in_numericLiteral1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DecimalLiteral_in_numericLiteral1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleLiteral_in_numericLiteral1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NameSpacedQNAME_in_qName2010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NCName_in_qName2015 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NCName_in_qName2019 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NCName_in_qName2029 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relativeLocationPath_in_synpred1_XPath1Walker84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterExpr_in_synpred18_XPath1Walker1031 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_simpleAxisStep_in_synpred18_XPath1Walker1034 = new BitSet(new long[]{0x0060940A800000D0L});
    public static final BitSet FOLLOW_relativeLocationPath_in_synpred18_XPath1Walker1038 = new BitSet(new long[]{0x0000000000000002L});

}