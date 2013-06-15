
grammar XPath1;
options {language = Java;
  backtrack=true;
  output    = AST;
  ASTLabelType=CommonTree; }

tokens {
    QNAME; STRING; NUMBER; VARREF; 
    OREXPR; ANDEXPR; UNIONEXPR; EQUEXPRESSION; 
    PREDICATE; FUNCALL;
    NAMED_AXIS_STEP; SIMPLE_AXIS_STEP; ABBREVIATED_AXIS_STEP;
    NAME_AXIS; ATTRIBUTE_AXIS;
    EXPRLIST;
    ANY_NODE; ANY_NAMESPACED_NODE;
    RELEXPRESSION;MULEXPRESSION ;
    UNARYEXPRESSION;
     LOCATION_PATH;
     QNAME_PREDICATE;
     RELATIVELOC;
     PREDI;
     FILTER;
     AXISSPEC;
     EXPRLIST;
    NameSpacedQNAME;

}

@header {
	package org.apache.synapse.xpath.compiler;


}

@lexer::header {
	package org.apache.synapse.xpath.compiler;


}





// ---------------- Parser Rules ---------------- //
xpath: locationPath;

locationPath 
    : relativeLocationPath
    | absoluteLocationPath
    ;
    
absoluteLocationPath
    :SingleAxisStep
    | SingleAxisStep relativeLocationPath     ->^(RELATIVELOC SingleAxisStep  relativeLocationPath)
    | abbreviatedAbsoluteLocationPath
    ;

abbreviatedAbsoluteLocationPath: RecursiveAxisStep relativeLocationPath  ->^(RecursiveAxisStep relativeLocationPath);

relativeLocationPath 
    : step 
       ((SingleAxisStep  relativeLocationPathrec)		->^(SingleAxisStep step relativeLocationPathrec)
       |(RecursiveAxisStep  relativeLocationPathrec)	->^(RecursiveAxisStep step relativeLocationPathrec)
       )
       |step
       ;

      relativeLocationPathrec :  relativeLocationPath;

step
    : namedAxisStep predicate		->^(QNAME_PREDICATE namedAxisStep  predicate)
    |namedAxisStep
    | abbreviatedAxisStep  predicate		->^(QNAME_PREDICATE abbreviatedAxisStep  predicate)
    abbreviatedAxisStep
    ;


abbreviatedAxisStep
    : AbbreviatedStep -> ^(ABBREVIATED_AXIS_STEP AbbreviatedStep);

namedAxisStep
    : axisSpecifier nodeTest -> ^(NAMED_AXIS_STEP  axisSpecifier nodeTest)
    |nodeTest
    ;

axisSpecifier
    : AxisName AxisNameSeparator -> ^(NAME_AXIS AxisName)
    | AbbreviatedAxisSpecifier -> ^(ATTRIBUTE_AXIS AbbreviatedAxisSpecifier)
    ;

nodeTest
	: nameTest 
	| NodeType LeftParenthesis RightParenthesis -> ^(ANY_NODE NodeType)
	| ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis  ->^( ProcessingInstruction LeftParenthesis StringLiteral RightParenthesis)
	; 

nameTest 
    : Star -> ^(ANY_NODE)
    | NCName Colon Star -> ^(ANY_NAMESPACED_NODE NCName)
    | qName
    ;

predicate
    : LeftSquareBracket predicateExpr RightSquareBracket -> ^(PREDICATE predicateExpr)
    ;

predicateExpr : expr;
    
functionCall
	: qName LeftParenthesis
	  expressionList? 
	  RightParenthesis -> ^(FUNCALL qName (^(EXPRLIST expressionList))?)
	;
	
expressionList
    : expr ( Comma exprrec )* -> ^(expr (^(Comma exprrec))*)
    ;
exprrec:expr;

pathExpr
    : locationPath
    | filterExpr simpleAxisStep  relativeLocationPath
    |filterExpr
    ;

simpleAxisStep
    : (SingleAxisStep			-> ^(SingleAxisStep)
    | RecursiveAxisStep 			-> ^( RecursiveAxisStep)
    )
    ;

filterExpr: primaryExpr predicate ->^(FILTER primaryExpr  predicate)
          |primaryExpr
          ;

primaryExpr
    : LeftParenthesis expr RightParenthesis
    | literal
    | functionCall
    ;

expr: orExpr;

orExpr: andExpr Or orExprrec  ->^(Or andExpr orExprrec)
      | andExpr
      ;

orExprrec :orExpr;
andExpr: equalityExpr And andExprrec ->^(And equalityExpr andExprrec)
       | equalityExpr
       ;

andExprrec :andExpr;


equalityExpr
    : relationalExpr EqualityOp equalityExprrec ->^(EqualityOp relationalExpr equalityExprrec)
    |relationalExpr
    ;

 equalityExprrec : equalityExpr;




relationalExpr: additiveExpr (RelationalOp additiveExprrec)* ->^( additiveExpr (^(RelationalOp additiveExprrec))*)
              ;
 additiveExprrec : additiveExpr;
                 
additiveExpr: multiplicativeExpr (MultiplicativeOP multiplicativeExprrec)* ->^(multiplicativeExpr (^(MultiplicativeOP multiplicativeExprrec))*);

multiplicativeExprrec : multiplicativeExpr  ;

multiplicativeExpr: unaryExpr (UnaryOp unaryExprrec)* ->^( unaryExpr (^(UnaryOp unaryExprrec))*);

unaryExprrec:unaryExpr;
                    
unaryExpr: unionExpr
         |'-' unaryExpr
         ;
               


unionExpr: pathExpr Pipe unionExprrec -> ^(Pipe pathExpr unionExprrec)
         |pathExpr
         ;

unionExprrec:unionExpr;


literal 
    : StringLiteral -> ^( StringLiteral)
    | numericLiteral -> ^( numericLiteral)
    | VariableReference -> ^( VariableReference)
    ;
    
numericLiteral: IntegerLiteral | DecimalLiteral | DoubleLiteral;

qName: NCName Colon  NCName 			-> ^(NameSpacedQNAME NCName NCName)
     |NCName 				-> ^(NCName)
     ;

// ---------------- Lexer Rules ---------------- //
SingleAxisStep: '/';   
RecursiveAxisStep: '//';

AxisNameSeparator: '::';
AbbreviatedAxisSpecifier: '@';

Star:      '*';
Colon:     ':';
Comma:     ',';
Pipe:      '|';


AbbreviatedStep : '.' | '..';

LeftParenthesis: '(';    	
RightParenthesis: ')';

LeftSquareBracket: '[';
RightSquareBracket: ']';

And	: 'and';
Or	: 'or';

AxisName
    :  'ancestor'  | 'ancestor-or-self'  | 'attribute' |
       'child'     | 'descendant'        | 'descendant-or-self' |
       'following' | 'following-sibling' | 'namespace' |
       'parent'    | 'preceding'         | 'preceding-sibling' |
       'self'
    ;

ProcessingInstruction:  'processing-instruction';

NodeType
	:  'comment' | 'text' | ProcessingInstruction | 'node';

Letter
    :  '\u0024' | '\u005f'|
       '\u0041'..'\u005a' | '\u0061'..'\u007a' | 
       '\u00c0'..'\u00d6' | '\u00d8'..'\u00f6' | 
       '\u00f8'..'\u00ff' | '\u0100'..'\u1fff' | 
       '\u3040'..'\u318f' | '\u3300'..'\u337f' | 
       '\u3400'..'\u3d2d' | '\u4e00'..'\u9fff' | 
       '\uf900'..'\ufaff'
    ;

IntegerLiteral :  ('0'..'9')+;
DecimalLiteral :  ('.' ('0'..'9')+)  | (('0'..'9')+ '.' '0'..'9'*);
DoubleLiteral  :  (('.' ('0'..'9')+) | (('0'..'9')+ ('.' '0'..'9'*)?)) ('e' | 'E') ('+' | '-')? ('0'..'9')+;

StringLiteral : '"' ~('"')* '"' | '\'' ~('\'')* '\'';

EqualityOp: '=' | '!=';
RelationalOp: '>' |'<' |'>=' |'<=' ;
MultiplicativeOP: '+'|'-';
UnaryOp:  '*'|'div' |'mod';


VariableReference: '$' NCName;

NCName : Letter (Letter | '0'..'9' | '.' | '-')*;

WS: (' '|'\t'|'\u000C') {skip();};

