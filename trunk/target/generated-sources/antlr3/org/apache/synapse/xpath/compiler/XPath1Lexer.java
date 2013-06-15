// $ANTLR 3.4 org/apache/synapse/xpath/compiler/XPath1.g 2013-06-15 10:20:39

	package org.apache.synapse.xpath.compiler;




import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class XPath1Lexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public XPath1Lexer() {} 
    public XPath1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public XPath1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "org/apache/synapse/xpath/compiler/XPath1.g"; }

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:13:7: ( '-' )
            // org/apache/synapse/xpath/compiler/XPath1.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "SingleAxisStep"
    public final void mSingleAxisStep() throws RecognitionException {
        try {
            int _type = SingleAxisStep;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:205:15: ( '/' )
            // org/apache/synapse/xpath/compiler/XPath1.g:205:17: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SingleAxisStep"

    // $ANTLR start "RecursiveAxisStep"
    public final void mRecursiveAxisStep() throws RecognitionException {
        try {
            int _type = RecursiveAxisStep;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:206:18: ( '//' )
            // org/apache/synapse/xpath/compiler/XPath1.g:206:20: '//'
            {
            match("//"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RecursiveAxisStep"

    // $ANTLR start "AxisNameSeparator"
    public final void mAxisNameSeparator() throws RecognitionException {
        try {
            int _type = AxisNameSeparator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:208:18: ( '::' )
            // org/apache/synapse/xpath/compiler/XPath1.g:208:20: '::'
            {
            match("::"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AxisNameSeparator"

    // $ANTLR start "AbbreviatedAxisSpecifier"
    public final void mAbbreviatedAxisSpecifier() throws RecognitionException {
        try {
            int _type = AbbreviatedAxisSpecifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:209:25: ( '@' )
            // org/apache/synapse/xpath/compiler/XPath1.g:209:27: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AbbreviatedAxisSpecifier"

    // $ANTLR start "Star"
    public final void mStar() throws RecognitionException {
        try {
            int _type = Star;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:211:5: ( '*' )
            // org/apache/synapse/xpath/compiler/XPath1.g:211:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Star"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:212:6: ( ':' )
            // org/apache/synapse/xpath/compiler/XPath1.g:212:12: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:213:6: ( ',' )
            // org/apache/synapse/xpath/compiler/XPath1.g:213:12: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Pipe"
    public final void mPipe() throws RecognitionException {
        try {
            int _type = Pipe;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:214:5: ( '|' )
            // org/apache/synapse/xpath/compiler/XPath1.g:214:12: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Pipe"

    // $ANTLR start "AbbreviatedStep"
    public final void mAbbreviatedStep() throws RecognitionException {
        try {
            int _type = AbbreviatedStep;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:217:17: ( '.' | '..' )
            int alt1=2;
            switch ( input.LA(1) ) {
            case '.':
                {
                switch ( input.LA(2) ) {
                case '.':
                    {
                    alt1=2;
                    }
                    break;
                default:
                    alt1=1;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:217:19: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:217:25: '..'
                    {
                    match(".."); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AbbreviatedStep"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:219:16: ( '(' )
            // org/apache/synapse/xpath/compiler/XPath1.g:219:18: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:220:17: ( ')' )
            // org/apache/synapse/xpath/compiler/XPath1.g:220:19: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:222:18: ( '[' )
            // org/apache/synapse/xpath/compiler/XPath1.g:222:20: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:223:19: ( ']' )
            // org/apache/synapse/xpath/compiler/XPath1.g:223:21: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:225:5: ( 'and' )
            // org/apache/synapse/xpath/compiler/XPath1.g:225:7: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:226:4: ( 'or' )
            // org/apache/synapse/xpath/compiler/XPath1.g:226:6: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "AxisName"
    public final void mAxisName() throws RecognitionException {
        try {
            int _type = AxisName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:229:5: ( 'ancestor' | 'ancestor-or-self' | 'attribute' | 'child' | 'descendant' | 'descendant-or-self' | 'following' | 'following-sibling' | 'namespace' | 'parent' | 'preceding' | 'preceding-sibling' | 'self' )
            int alt2=13;
            switch ( input.LA(1) ) {
            case 'a':
                {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    switch ( input.LA(3) ) {
                    case 'c':
                        {
                        switch ( input.LA(4) ) {
                        case 'e':
                            {
                            switch ( input.LA(5) ) {
                            case 's':
                                {
                                switch ( input.LA(6) ) {
                                case 't':
                                    {
                                    switch ( input.LA(7) ) {
                                    case 'o':
                                        {
                                        switch ( input.LA(8) ) {
                                        case 'r':
                                            {
                                            switch ( input.LA(9) ) {
                                            case '-':
                                                {
                                                alt2=2;
                                                }
                                                break;
                                            default:
                                                alt2=1;
                                            }

                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 2, 30, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 26, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 22, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 18, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 14, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 8, input);

                        throw nvae;

                    }

                    }
                    break;
                case 't':
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }

                }
                break;
            case 'c':
                {
                alt2=4;
                }
                break;
            case 'd':
                {
                switch ( input.LA(2) ) {
                case 'e':
                    {
                    switch ( input.LA(3) ) {
                    case 's':
                        {
                        switch ( input.LA(4) ) {
                        case 'c':
                            {
                            switch ( input.LA(5) ) {
                            case 'e':
                                {
                                switch ( input.LA(6) ) {
                                case 'n':
                                    {
                                    switch ( input.LA(7) ) {
                                    case 'd':
                                        {
                                        switch ( input.LA(8) ) {
                                        case 'a':
                                            {
                                            switch ( input.LA(9) ) {
                                            case 'n':
                                                {
                                                switch ( input.LA(10) ) {
                                                case 't':
                                                    {
                                                    switch ( input.LA(11) ) {
                                                    case '-':
                                                        {
                                                        alt2=6;
                                                        }
                                                        break;
                                                    default:
                                                        alt2=5;
                                                    }

                                                    }
                                                    break;
                                                default:
                                                    NoViableAltException nvae =
                                                        new NoViableAltException("", 2, 40, input);

                                                    throw nvae;

                                                }

                                                }
                                                break;
                                            default:
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 2, 35, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 2, 31, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 27, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 23, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 19, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 15, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 10, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }

                }
                break;
            case 'f':
                {
                switch ( input.LA(2) ) {
                case 'o':
                    {
                    switch ( input.LA(3) ) {
                    case 'l':
                        {
                        switch ( input.LA(4) ) {
                        case 'l':
                            {
                            switch ( input.LA(5) ) {
                            case 'o':
                                {
                                switch ( input.LA(6) ) {
                                case 'w':
                                    {
                                    switch ( input.LA(7) ) {
                                    case 'i':
                                        {
                                        switch ( input.LA(8) ) {
                                        case 'n':
                                            {
                                            switch ( input.LA(9) ) {
                                            case 'g':
                                                {
                                                switch ( input.LA(10) ) {
                                                case '-':
                                                    {
                                                    alt2=8;
                                                    }
                                                    break;
                                                default:
                                                    alt2=7;
                                                }

                                                }
                                                break;
                                            default:
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 2, 36, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 2, 32, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 28, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 24, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 20, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 16, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 11, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;

                }

                }
                break;
            case 'n':
                {
                alt2=9;
                }
                break;
            case 'p':
                {
                switch ( input.LA(2) ) {
                case 'a':
                    {
                    alt2=10;
                    }
                    break;
                case 'r':
                    {
                    switch ( input.LA(3) ) {
                    case 'e':
                        {
                        switch ( input.LA(4) ) {
                        case 'c':
                            {
                            switch ( input.LA(5) ) {
                            case 'e':
                                {
                                switch ( input.LA(6) ) {
                                case 'd':
                                    {
                                    switch ( input.LA(7) ) {
                                    case 'i':
                                        {
                                        switch ( input.LA(8) ) {
                                        case 'n':
                                            {
                                            switch ( input.LA(9) ) {
                                            case 'g':
                                                {
                                                switch ( input.LA(10) ) {
                                                case '-':
                                                    {
                                                    alt2=12;
                                                    }
                                                    break;
                                                default:
                                                    alt2=11;
                                                }

                                                }
                                                break;
                                            default:
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 2, 37, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 2, 33, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 29, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 25, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 21, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 17, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 13, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 6, input);

                    throw nvae;

                }

                }
                break;
            case 's':
                {
                alt2=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:229:8: 'ancestor'
                    {
                    match("ancestor"); 



                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:229:22: 'ancestor-or-self'
                    {
                    match("ancestor-or-self"); 



                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:229:44: 'attribute'
                    {
                    match("attribute"); 



                    }
                    break;
                case 4 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:230:8: 'child'
                    {
                    match("child"); 



                    }
                    break;
                case 5 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:230:22: 'descendant'
                    {
                    match("descendant"); 



                    }
                    break;
                case 6 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:230:44: 'descendant-or-self'
                    {
                    match("descendant-or-self"); 



                    }
                    break;
                case 7 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:231:8: 'following'
                    {
                    match("following"); 



                    }
                    break;
                case 8 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:231:22: 'following-sibling'
                    {
                    match("following-sibling"); 



                    }
                    break;
                case 9 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:231:44: 'namespace'
                    {
                    match("namespace"); 



                    }
                    break;
                case 10 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:232:8: 'parent'
                    {
                    match("parent"); 



                    }
                    break;
                case 11 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:232:22: 'preceding'
                    {
                    match("preceding"); 



                    }
                    break;
                case 12 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:232:44: 'preceding-sibling'
                    {
                    match("preceding-sibling"); 



                    }
                    break;
                case 13 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:233:8: 'self'
                    {
                    match("self"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AxisName"

    // $ANTLR start "ProcessingInstruction"
    public final void mProcessingInstruction() throws RecognitionException {
        try {
            int _type = ProcessingInstruction;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:236:22: ( 'processing-instruction' )
            // org/apache/synapse/xpath/compiler/XPath1.g:236:25: 'processing-instruction'
            {
            match("processing-instruction"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ProcessingInstruction"

    // $ANTLR start "NodeType"
    public final void mNodeType() throws RecognitionException {
        try {
            int _type = NodeType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:239:2: ( 'comment' | 'text' | ProcessingInstruction | 'node' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 'c':
                {
                alt3=1;
                }
                break;
            case 't':
                {
                alt3=2;
                }
                break;
            case 'p':
                {
                alt3=3;
                }
                break;
            case 'n':
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:239:5: 'comment'
                    {
                    match("comment"); 



                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:239:17: 'text'
                    {
                    match("text"); 



                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:239:26: ProcessingInstruction
                    {
                    mProcessingInstruction(); 


                    }
                    break;
                case 4 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:239:50: 'node'
                    {
                    match("node"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NodeType"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            int _type = Letter;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:242:5: ( '\\u0024' | '\\u005f' | '\\u0041' .. '\\u005a' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // org/apache/synapse/xpath/compiler/XPath1.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "IntegerLiteral"
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            int _type = IntegerLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:251:16: ( ( '0' .. '9' )+ )
            // org/apache/synapse/xpath/compiler/XPath1.g:251:19: ( '0' .. '9' )+
            {
            // org/apache/synapse/xpath/compiler/XPath1.g:251:19: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt4=1;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // org/apache/synapse/xpath/compiler/XPath1.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IntegerLiteral"

    // $ANTLR start "DecimalLiteral"
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:252:16: ( ( '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case '.':
                {
                alt8=1;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:252:19: ( '.' ( '0' .. '9' )+ )
                    {
                    // org/apache/synapse/xpath/compiler/XPath1.g:252:19: ( '.' ( '0' .. '9' )+ )
                    // org/apache/synapse/xpath/compiler/XPath1.g:252:20: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // org/apache/synapse/xpath/compiler/XPath1.g:252:24: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt5=1;
                            }
                            break;

                        }

                        switch (alt5) {
                    	case 1 :
                    	    // org/apache/synapse/xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:252:40: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
                    {
                    // org/apache/synapse/xpath/compiler/XPath1.g:252:40: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
                    // org/apache/synapse/xpath/compiler/XPath1.g:252:41: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // org/apache/synapse/xpath/compiler/XPath1.g:252:41: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt6=1;
                            }
                            break;

                        }

                        switch (alt6) {
                    	case 1 :
                    	    // org/apache/synapse/xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    match('.'); 

                    // org/apache/synapse/xpath/compiler/XPath1.g:252:57: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt7=1;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // org/apache/synapse/xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DecimalLiteral"

    // $ANTLR start "DoubleLiteral"
    public final void mDoubleLiteral() throws RecognitionException {
        try {
            int _type = DoubleLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:253:16: ( ( ( '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ) ) ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // org/apache/synapse/xpath/compiler/XPath1.g:253:19: ( ( '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ) ) ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            // org/apache/synapse/xpath/compiler/XPath1.g:253:19: ( ( '.' ( '0' .. '9' )+ ) | ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case '.':
                {
                alt13=1;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:253:20: ( '.' ( '0' .. '9' )+ )
                    {
                    // org/apache/synapse/xpath/compiler/XPath1.g:253:20: ( '.' ( '0' .. '9' )+ )
                    // org/apache/synapse/xpath/compiler/XPath1.g:253:21: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // org/apache/synapse/xpath/compiler/XPath1.g:253:25: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt9=1;
                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // org/apache/synapse/xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:253:40: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? )
                    {
                    // org/apache/synapse/xpath/compiler/XPath1.g:253:40: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? )
                    // org/apache/synapse/xpath/compiler/XPath1.g:253:41: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )?
                    {
                    // org/apache/synapse/xpath/compiler/XPath1.g:253:41: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt10=1;
                            }
                            break;

                        }

                        switch (alt10) {
                    	case 1 :
                    	    // org/apache/synapse/xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    // org/apache/synapse/xpath/compiler/XPath1.g:253:53: ( '.' ( '0' .. '9' )* )?
                    int alt12=2;
                    switch ( input.LA(1) ) {
                        case '.':
                            {
                            alt12=1;
                            }
                            break;
                    }

                    switch (alt12) {
                        case 1 :
                            // org/apache/synapse/xpath/compiler/XPath1.g:253:54: '.' ( '0' .. '9' )*
                            {
                            match('.'); 

                            // org/apache/synapse/xpath/compiler/XPath1.g:253:58: ( '0' .. '9' )*
                            loop11:
                            do {
                                int alt11=2;
                                switch ( input.LA(1) ) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    {
                                    alt11=1;
                                    }
                                    break;

                                }

                                switch (alt11) {
                            	case 1 :
                            	    // org/apache/synapse/xpath/compiler/XPath1.g:
                            	    {
                            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                            	        input.consume();
                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        recover(mse);
                            	        throw mse;
                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop11;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // org/apache/synapse/xpath/compiler/XPath1.g:253:84: ( '+' | '-' )?
            int alt14=2;
            switch ( input.LA(1) ) {
                case '+':
                case '-':
                    {
                    alt14=1;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // org/apache/synapse/xpath/compiler/XPath1.g:253:97: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt15=1;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // org/apache/synapse/xpath/compiler/XPath1.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DoubleLiteral"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:255:15: ( '\"' (~ ( '\"' ) )* '\"' | '\\'' (~ ( '\\'' ) )* '\\'' )
            int alt18=2;
            switch ( input.LA(1) ) {
            case '\"':
                {
                alt18=1;
                }
                break;
            case '\'':
                {
                alt18=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:255:17: '\"' (~ ( '\"' ) )* '\"'
                    {
                    match('\"'); 

                    // org/apache/synapse/xpath/compiler/XPath1.g:255:21: (~ ( '\"' ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0 >= '\u0000' && LA16_0 <= '!')||(LA16_0 >= '#' && LA16_0 <= '\uFFFF')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // org/apache/synapse/xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    match('\"'); 

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:255:35: '\\'' (~ ( '\\'' ) )* '\\''
                    {
                    match('\''); 

                    // org/apache/synapse/xpath/compiler/XPath1.g:255:40: (~ ( '\\'' ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0 >= '\u0000' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '\uFFFF')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // org/apache/synapse/xpath/compiler/XPath1.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "EqualityOp"
    public final void mEqualityOp() throws RecognitionException {
        try {
            int _type = EqualityOp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:257:11: ( '=' | '!=' )
            int alt19=2;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt19=1;
                }
                break;
            case '!':
                {
                alt19=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:257:13: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:257:19: '!='
                    {
                    match("!="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EqualityOp"

    // $ANTLR start "RelationalOp"
    public final void mRelationalOp() throws RecognitionException {
        try {
            int _type = RelationalOp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:258:13: ( '>' | '<' | '>=' | '<=' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case '>':
                {
                switch ( input.LA(2) ) {
                case '=':
                    {
                    alt20=3;
                    }
                    break;
                default:
                    alt20=1;
                }

                }
                break;
            case '<':
                {
                switch ( input.LA(2) ) {
                case '=':
                    {
                    alt20=4;
                    }
                    break;
                default:
                    alt20=2;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:258:15: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:258:20: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:258:25: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 4 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:258:31: '<='
                    {
                    match("<="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RelationalOp"

    // $ANTLR start "MultiplicativeOP"
    public final void mMultiplicativeOP() throws RecognitionException {
        try {
            int _type = MultiplicativeOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:259:17: ( '+' | '-' )
            // org/apache/synapse/xpath/compiler/XPath1.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MultiplicativeOP"

    // $ANTLR start "UnaryOp"
    public final void mUnaryOp() throws RecognitionException {
        try {
            int _type = UnaryOp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:260:8: ( '*' | 'div' | 'mod' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt21=1;
                }
                break;
            case 'd':
                {
                alt21=2;
                }
                break;
            case 'm':
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:260:11: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:260:15: 'div'
                    {
                    match("div"); 



                    }
                    break;
                case 3 :
                    // org/apache/synapse/xpath/compiler/XPath1.g:260:22: 'mod'
                    {
                    match("mod"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UnaryOp"

    // $ANTLR start "VariableReference"
    public final void mVariableReference() throws RecognitionException {
        try {
            int _type = VariableReference;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:263:18: ( '$' NCName )
            // org/apache/synapse/xpath/compiler/XPath1.g:263:20: '$' NCName
            {
            match('$'); 

            mNCName(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VariableReference"

    // $ANTLR start "NCName"
    public final void mNCName() throws RecognitionException {
        try {
            int _type = NCName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:265:8: ( Letter ( Letter | '0' .. '9' | '.' | '-' )* )
            // org/apache/synapse/xpath/compiler/XPath1.g:265:10: Letter ( Letter | '0' .. '9' | '.' | '-' )*
            {
            mLetter(); 


            // org/apache/synapse/xpath/compiler/XPath1.g:265:17: ( Letter | '0' .. '9' | '.' | '-' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='$'||(LA22_0 >= '-' && LA22_0 <= '.')||(LA22_0 >= '0' && LA22_0 <= '9')||(LA22_0 >= 'A' && LA22_0 <= 'Z')||LA22_0=='_'||(LA22_0 >= 'a' && LA22_0 <= 'z')||(LA22_0 >= '\u00C0' && LA22_0 <= '\u00D6')||(LA22_0 >= '\u00D8' && LA22_0 <= '\u00F6')||(LA22_0 >= '\u00F8' && LA22_0 <= '\u1FFF')||(LA22_0 >= '\u3040' && LA22_0 <= '\u318F')||(LA22_0 >= '\u3300' && LA22_0 <= '\u337F')||(LA22_0 >= '\u3400' && LA22_0 <= '\u3D2D')||(LA22_0 >= '\u4E00' && LA22_0 <= '\u9FFF')||(LA22_0 >= '\uF900' && LA22_0 <= '\uFAFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // org/apache/synapse/xpath/compiler/XPath1.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NCName"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/synapse/xpath/compiler/XPath1.g:267:3: ( ( ' ' | '\\t' | '\\u000C' ) )
            // org/apache/synapse/xpath/compiler/XPath1.g:267:5: ( ' ' | '\\t' | '\\u000C' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // org/apache/synapse/xpath/compiler/XPath1.g:1:8: ( T__62 | SingleAxisStep | RecursiveAxisStep | AxisNameSeparator | AbbreviatedAxisSpecifier | Star | Colon | Comma | Pipe | AbbreviatedStep | LeftParenthesis | RightParenthesis | LeftSquareBracket | RightSquareBracket | And | Or | AxisName | ProcessingInstruction | NodeType | Letter | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | EqualityOp | RelationalOp | MultiplicativeOP | UnaryOp | VariableReference | NCName | WS )
        int alt23=31;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:10: T__62
                {
                mT__62(); 


                }
                break;
            case 2 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:16: SingleAxisStep
                {
                mSingleAxisStep(); 


                }
                break;
            case 3 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:31: RecursiveAxisStep
                {
                mRecursiveAxisStep(); 


                }
                break;
            case 4 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:49: AxisNameSeparator
                {
                mAxisNameSeparator(); 


                }
                break;
            case 5 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:67: AbbreviatedAxisSpecifier
                {
                mAbbreviatedAxisSpecifier(); 


                }
                break;
            case 6 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:92: Star
                {
                mStar(); 


                }
                break;
            case 7 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:97: Colon
                {
                mColon(); 


                }
                break;
            case 8 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:103: Comma
                {
                mComma(); 


                }
                break;
            case 9 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:109: Pipe
                {
                mPipe(); 


                }
                break;
            case 10 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:114: AbbreviatedStep
                {
                mAbbreviatedStep(); 


                }
                break;
            case 11 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:130: LeftParenthesis
                {
                mLeftParenthesis(); 


                }
                break;
            case 12 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:146: RightParenthesis
                {
                mRightParenthesis(); 


                }
                break;
            case 13 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:163: LeftSquareBracket
                {
                mLeftSquareBracket(); 


                }
                break;
            case 14 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:181: RightSquareBracket
                {
                mRightSquareBracket(); 


                }
                break;
            case 15 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:200: And
                {
                mAnd(); 


                }
                break;
            case 16 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:204: Or
                {
                mOr(); 


                }
                break;
            case 17 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:207: AxisName
                {
                mAxisName(); 


                }
                break;
            case 18 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:216: ProcessingInstruction
                {
                mProcessingInstruction(); 


                }
                break;
            case 19 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:238: NodeType
                {
                mNodeType(); 


                }
                break;
            case 20 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:247: Letter
                {
                mLetter(); 


                }
                break;
            case 21 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:254: IntegerLiteral
                {
                mIntegerLiteral(); 


                }
                break;
            case 22 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:269: DecimalLiteral
                {
                mDecimalLiteral(); 


                }
                break;
            case 23 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:284: DoubleLiteral
                {
                mDoubleLiteral(); 


                }
                break;
            case 24 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:298: StringLiteral
                {
                mStringLiteral(); 


                }
                break;
            case 25 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:312: EqualityOp
                {
                mEqualityOp(); 


                }
                break;
            case 26 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:323: RelationalOp
                {
                mRelationalOp(); 


                }
                break;
            case 27 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:336: MultiplicativeOP
                {
                mMultiplicativeOP(); 


                }
                break;
            case 28 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:353: UnaryOp
                {
                mUnaryOp(); 


                }
                break;
            case 29 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:361: VariableReference
                {
                mVariableReference(); 


                }
                break;
            case 30 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:379: NCName
                {
                mNCName(); 


                }
                break;
            case 31 :
                // org/apache/synapse/xpath/compiler/XPath1.g:1:386: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\2\uffff\1\41\1\43\4\uffff\1\45\4\uffff\12\51\1\70\4\uffff\2\51"+
        "\10\uffff\1\74\2\52\2\uffff\1\100\14\52\1\uffff\1\74\1\uffff\1\117"+
        "\1\uffff\1\121\2\52\1\uffff\3\52\1\127\10\52\1\127\1\74\1\uffff"+
        "\1\117\1\uffff\5\52\1\uffff\2\52\1\147\3\52\1\153\1\147\2\52\1\153"+
        "\4\52\1\uffff\3\52\1\uffff\6\52\1\153\4\52\1\147\5\52\1\153\7\52"+
        "\1\153\1\52\3\153\2\52\1\153\34\52\1\153\5\52\2\153\1\52\1\153\4"+
        "\52\1\u00b8\1\uffff";
    static final String DFA23_eofS =
        "\u00b9\uffff";
    static final String DFA23_minS =
        "\1\11\1\uffff\1\57\1\72\4\uffff\1\60\4\uffff\12\44\1\56\4\uffff"+
        "\2\44\10\uffff\1\60\1\143\1\164\2\uffff\1\44\1\151\1\155\1\163\1"+
        "\166\1\154\1\155\1\144\1\162\1\145\1\154\1\170\1\144\1\uffff\1\60"+
        "\1\uffff\1\44\1\uffff\1\44\1\145\1\162\1\uffff\1\154\1\155\1\143"+
        "\1\44\1\154\3\145\2\143\1\146\1\164\1\44\1\60\1\uffff\1\44\1\uffff"+
        "\1\163\1\151\1\144\2\145\1\uffff\1\157\1\163\1\44\1\156\2\145\2"+
        "\44\1\164\1\142\1\44\2\156\1\167\1\160\1\uffff\1\164\1\144\1\163"+
        "\1\uffff\1\157\1\165\1\164\1\144\1\151\1\141\1\44\1\151\1\163\1"+
        "\162\1\164\1\44\1\141\1\156\1\143\1\156\1\151\1\44\1\145\1\156\1"+
        "\147\1\145\1\147\1\156\1\157\1\44\1\164\3\44\1\147\1\162\1\44\2"+
        "\163\2\55\1\157\3\151\1\163\1\162\2\142\1\156\1\145\1\55\2\154\1"+
        "\163\1\154\1\163\2\151\1\164\1\146\1\145\2\156\1\162\1\44\1\154"+
        "\2\147\1\165\1\146\2\44\1\143\1\44\1\164\1\151\1\157\1\156\1\44"+
        "\1\uffff";
    static final String DFA23_maxS =
        "\1\ufaff\1\uffff\1\57\1\72\4\uffff\1\71\4\uffff\12\ufaff\1\145\4"+
        "\uffff\2\ufaff\10\uffff\1\145\1\144\1\164\2\uffff\1\ufaff\1\151"+
        "\1\155\1\163\1\166\1\154\1\155\1\144\1\162\1\157\1\154\1\170\1\144"+
        "\1\uffff\1\145\1\uffff\1\ufaff\1\uffff\1\ufaff\1\145\1\162\1\uffff"+
        "\1\154\1\155\1\143\1\ufaff\1\154\3\145\2\143\1\146\1\164\1\ufaff"+
        "\1\145\1\uffff\1\ufaff\1\uffff\1\163\1\151\1\144\2\145\1\uffff\1"+
        "\157\1\163\1\ufaff\1\156\2\145\2\ufaff\1\164\1\142\1\ufaff\2\156"+
        "\1\167\1\160\1\uffff\1\164\1\144\1\163\1\uffff\1\157\1\165\1\164"+
        "\1\144\1\151\1\141\1\ufaff\1\151\1\163\1\162\1\164\1\ufaff\1\141"+
        "\1\156\1\143\1\156\1\151\1\ufaff\1\145\1\156\1\147\1\145\1\147\1"+
        "\156\1\157\1\ufaff\1\164\3\ufaff\1\147\1\162\1\ufaff\2\163\2\55"+
        "\1\157\3\151\1\163\1\162\2\142\1\156\1\145\1\55\2\154\1\163\1\154"+
        "\1\163\2\151\1\164\1\146\1\145\2\156\1\162\1\ufaff\1\154\2\147\1"+
        "\165\1\146\2\ufaff\1\143\1\ufaff\1\164\1\151\1\157\1\156\1\ufaff"+
        "\1\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\1\6\1\10\1\11\1\uffff\1\13\1\14\1\15\1"+
        "\16\13\uffff\1\30\1\31\1\32\1\33\2\uffff\1\37\1\1\1\3\1\2\1\4\1"+
        "\7\1\6\1\12\3\uffff\1\24\1\36\15\uffff\1\25\1\uffff\1\27\1\uffff"+
        "\1\26\3\uffff\1\20\16\uffff\1\35\1\uffff\1\17\5\uffff\1\34\17\uffff"+
        "\1\23\3\uffff\1\21\114\uffff\1\22";
    static final String DFA23_specialS =
        "\u00b9\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\36\2\uffff\1\36\23\uffff\1\36\1\31\1\30\1\uffff\1\34\2\uffff"+
            "\1\30\1\11\1\12\1\5\1\33\1\6\1\1\1\10\1\2\12\27\1\3\1\uffff"+
            "\1\32\1\31\1\32\1\uffff\1\4\32\35\1\13\1\uffff\1\14\1\uffff"+
            "\1\35\1\uffff\1\15\1\35\1\17\1\20\1\35\1\21\6\35\1\26\1\22\1"+
            "\16\1\23\2\35\1\24\1\25\6\35\1\uffff\1\7\103\uffff\27\35\1\uffff"+
            "\37\35\1\uffff\u1f08\35\u1040\uffff\u0150\35\u0170\uffff\u0080"+
            "\35\u0080\uffff\u092e\35\u10d2\uffff\u5200\35\u5900\uffff\u0200"+
            "\35",
            "",
            "\1\40",
            "\1\42",
            "",
            "",
            "",
            "",
            "\12\46",
            "",
            "",
            "",
            "",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\15\52\1\47\5\52\1\50\6\52\105\uffff\27\52\1\uffff\37"+
            "\52\1\uffff\u1f08\52\u1040\uffff\u0150\52\u0170\uffff\u0080"+
            "\52\u0080\uffff\u092e\52\u10d2\uffff\u5200\52\u5900\uffff\u0200"+
            "\52",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\21\52\1\53\10\52\105\uffff\27\52\1\uffff\37\52\1\uffff"+
            "\u1f08\52\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff"+
            "\u092e\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\7\52\1\54\6\52\1\55\13\52\105\uffff\27\52\1\uffff\37"+
            "\52\1\uffff\u1f08\52\u1040\uffff\u0150\52\u0170\uffff\u0080"+
            "\52\u0080\uffff\u092e\52\u10d2\uffff\u5200\52\u5900\uffff\u0200"+
            "\52",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\4\52\1\56\3\52\1\57\21\52\105\uffff\27\52\1\uffff\37"+
            "\52\1\uffff\u1f08\52\u1040\uffff\u0150\52\u0170\uffff\u0080"+
            "\52\u0080\uffff\u092e\52\u10d2\uffff\u5200\52\u5900\uffff\u0200"+
            "\52",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\16\52\1\60\13\52\105\uffff\27\52\1\uffff\37\52\1\uffff"+
            "\u1f08\52\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff"+
            "\u092e\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\1\61\15\52\1\62\13\52\105\uffff\27\52\1\uffff\37\52"+
            "\1\uffff\u1f08\52\u1040\uffff\u0150\52\u0170\uffff\u0080\52"+
            "\u0080\uffff\u092e\52\u10d2\uffff\u5200\52\u5900\uffff\u0200"+
            "\52",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\1\63\20\52\1\64\10\52\105\uffff\27\52\1\uffff\37\52"+
            "\1\uffff\u1f08\52\u1040\uffff\u0150\52\u0170\uffff\u0080\52"+
            "\u0080\uffff\u092e\52\u10d2\uffff\u5200\52\u5900\uffff\u0200"+
            "\52",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\4\52\1\65\25\52\105\uffff\27\52\1\uffff\37\52\1\uffff"+
            "\u1f08\52\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff"+
            "\u092e\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\4\52\1\66\25\52\105\uffff\27\52\1\uffff\37\52\1\uffff"+
            "\u1f08\52\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff"+
            "\u092e\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\16\52\1\67\13\52\105\uffff\27\52\1\uffff\37\52\1\uffff"+
            "\u1f08\52\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff"+
            "\u092e\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\71\1\uffff\12\27\13\uffff\1\72\37\uffff\1\72",
            "",
            "",
            "",
            "",
            "\1\73\10\uffff\2\52\1\uffff\12\52\7\uffff\32\73\4\uffff\1\73"+
            "\1\uffff\32\73\105\uffff\27\73\1\uffff\37\73\1\uffff\u1f08\73"+
            "\u1040\uffff\u0150\73\u0170\uffff\u0080\73\u0080\uffff\u092e"+
            "\73\u10d2\uffff\u5200\73\u5900\uffff\u0200\73",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\46\13\uffff\1\72\37\uffff\1\72",
            "\1\76\1\75",
            "\1\77",
            "",
            "",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111\11\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\12\116\13\uffff\1\72\37\uffff\1\72",
            "",
            "\1\120\10\uffff\2\120\1\uffff\12\120\7\uffff\32\120\4\uffff"+
            "\1\120\1\uffff\32\120\105\uffff\27\120\1\uffff\37\120\1\uffff"+
            "\u1f08\120\u1040\uffff\u0150\120\u0170\uffff\u0080\120\u0080"+
            "\uffff\u092e\120\u10d2\uffff\u5200\120\u5900\uffff\u0200\120",
            "",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\12\116\13\uffff\1\72\37\uffff\1\72",
            "",
            "\1\120\10\uffff\2\120\1\uffff\12\120\7\uffff\32\120\4\uffff"+
            "\1\120\1\uffff\32\120\105\uffff\27\120\1\uffff\37\120\1\uffff"+
            "\u1f08\120\u1040\uffff\u0150\120\u0170\uffff\u0080\120\u0080"+
            "\uffff\u092e\120\u10d2\uffff\u5200\120\u5900\uffff\u0200\120",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\154",
            "\1\155",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\52\10\uffff\1\u0084\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff"+
            "\1\52\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08"+
            "\52\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\u008c",
            "\1\52\10\uffff\1\u008d\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff"+
            "\1\52\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08"+
            "\52\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\52\10\uffff\1\u008e\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff"+
            "\1\52\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08"+
            "\52\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\u008f",
            "\1\u0090",
            "\1\52\10\uffff\1\u0091\1\52\1\uffff\12\52\7\uffff\32\52\4\uffff"+
            "\1\52\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08"+
            "\52\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\u00b3",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\52\10\uffff\2\52\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52"+
            "\1\uffff\32\52\105\uffff\27\52\1\uffff\37\52\1\uffff\u1f08\52"+
            "\u1040\uffff\u0150\52\u0170\uffff\u0080\52\u0080\uffff\u092e"+
            "\52\u10d2\uffff\u5200\52\u5900\uffff\u0200\52",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__62 | SingleAxisStep | RecursiveAxisStep | AxisNameSeparator | AbbreviatedAxisSpecifier | Star | Colon | Comma | Pipe | AbbreviatedStep | LeftParenthesis | RightParenthesis | LeftSquareBracket | RightSquareBracket | And | Or | AxisName | ProcessingInstruction | NodeType | Letter | IntegerLiteral | DecimalLiteral | DoubleLiteral | StringLiteral | EqualityOp | RelationalOp | MultiplicativeOP | UnaryOp | VariableReference | NCName | WS );";
        }
    }
 

}