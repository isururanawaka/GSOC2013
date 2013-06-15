tree grammar XPath1Walker;

options {
    backtrack=true;
    tokenVocab=XPath1;
    ASTLabelType=CommonTree;
}

@header {
	package org.apache.synapse.xpath.compiler;
    import org.apache.synapse.xpath.expression.axis.*;
    import org.apache.synapse.xpath.expression.*;
    import org.apache.synapse.xpath.util.*;
    import java.util.List;
    import java.util.ArrayList;
    import javax.xml.namespace.*;
}


xpath returns[XpathExpr  expr]
@init{
 $expr = null;
}
:locationPath  {$expr = new DefaultXpathExpr($locationPath.expr);}
;



locationPath  returns [LocationPath expr]
@init{
  $expr=null ;
  ArrayList<Step> list=null;
}
    : relativeLocationPath{$expr = new DefaultRelativeLocationPath();
                                              list = $relativeLocationPath.list;
                                               if(list != null){
                                                for(Step step:list)
                                                $expr.addStep(step);
                                                }
                                               }

    | absoluteLocationPath{$expr = new DefaultAbsoluteLocationPath();
                                            list = $absoluteLocationPath.list;
                                            if(list != null){
                                            for(Step step:list){
                                            $expr.addStep(step);
                                             }
                                            }}
    ;


absoluteLocationPath returns [ArrayList<Step> list]
@init{
$list = new ArrayList<Step>();
ArrayList<Step> listtwo =null;
}
:SingleAxisStep
|^(RELATIVELOC SingleAxisStep  relativeLocationPath{listtwo = $relativeLocationPath.list;
                                          for(Step step:listtwo){
                                             $list.add(step);
                                          }

                                          })
|^(RecursiveAxisStep relativeLocationPath{listtwo = $relativeLocationPath.list;
                                            $list.add(new DefaultAllNodeStep(new DescendantOrSelfAxis(AxisUtil.DESCENDANT_OR_SELF),new PredicateSet()));
                                            for(Step step:listtwo){$list.add(step);
                                                                                      }})
;


abbreviatedAbsoluteLocationPath: RecursiveAxisStep relativeLocationPath;



relativeLocationPath returns [ArrayList<Step> list]
@init{
$list = new ArrayList<Step>();
}
 :^(SingleAxisStep step
       {$list.add($step.step);}
 relativeLocationPathrec{List<Step> listone = $relativeLocationPathrec.list;
                            for(Step stepone:listone){
                            $list.add(stepone);
                            }
                            })
 |^(RecursiveAxisStep step
        {$list.add(new DefaultAllNodeStep(new DescendantOrSelfAxis(AxisUtil.DESCENDANT_OR_SELF),new PredicateSet()));
        $list.add($step.step);
         }
 relativeLocationPathrec{List<Step> listone = $relativeLocationPathrec.list;
                            for(Step stepone:listone){
                            $list.add(stepone);
                            }
                            })
 |step
     {$list.add($step.step);
     }
 ;

relativeLocationPathrec returns [ArrayList<Step> list]
@init{
$list = null;
}
:relativeLocationPath{$list =$relativeLocationPath.list;}
;



step returns [Step step]
@init{
  $step=null;
  NamedAxisStepUtil utiltemp =null;
   PredicateSet predi = new PredicateSet();
   Axis axis =null;
   String temp =null;
   QName qn=null;
}
: ^(QNAME_PREDICATE namedAxisStep
                              {
                                   utiltemp = $namedAxisStep.nameUtil;
                                   axis = utiltemp.getAxis();
                                   qn = utiltemp.getQname();
                                   temp = utiltemp.getValue();

                                if(axis == null){
                                      axis = new ChildAxis(AxisUtil.CHILD);
                                }

                                 if(temp==null){
                                      $step = new DefaultNameStep(axis,qn.getNamespaceURI(),qn.getLocalPart(),predi);
                                 }
                                 else if(temp.equals("comment")){
                                          $step = new DefaultCommentNodeStep(axis,predi);
                                 }else if(temp.equals("text")){
                                             $step = new DefaultTextNodeStep(axis,predi);
                                 }else if(temp.equals("node")){
                                         $step = new DefaultAllNodeStep(axis,predi);
                                 }else{
                                        $step = new DefaultProcessingInstructionNodeStep(axis,temp,predi);
                                 }
                               }
      predicate
                                {predi.addPredicate($predicate.expr);
                                }
                                )
|namedAxisStep  {
                                   utiltemp = $namedAxisStep.nameUtil;
                                   axis = utiltemp.getAxis();
                                   qn = utiltemp.getQname();
                                   temp = utiltemp.getValue();

                                if(axis == null){
                                      axis = new ChildAxis(AxisUtil.CHILD);
                                }

                                 if(temp==null){
                                      $step = new DefaultNameStep(axis,qn.getNamespaceURI(),qn.getLocalPart(),predi);
                                 }
                                 else if(temp.equals("comment")){
                                          $step = new DefaultCommentNodeStep(axis,predi);
                                 }else if(temp.equals("text")){
                                             $step = new DefaultTextNodeStep(axis,predi);
                                 }else if(temp.equals("node")){
                                         $step = new DefaultAllNodeStep(axis,predi);
                                 }else{
                                        $step = new DefaultProcessingInstructionNodeStep(axis,temp,predi);
                                 }
                               }
|^(QNAME_PREDICATE abbreviatedAxisStep
                              {$step = new DefaultAllNodeStep($abbreviatedAxisStep.axis,predi);
                              }
   predicate
                             {predi.addPredicate($predicate.expr);
                             }
   )
   |abbreviatedAxisStep {$step = new DefaultAllNodeStep($abbreviatedAxisStep.axis,predi);
                              }
;

abbreviatedAxisStep returns [Axis axis]
@init{
$axis = null;
}
 :^(ABBREVIATED_AXIS_STEP  a =AbbreviatedStep
                                   {if ($a.text.equals(".") )
                                       {
                                    $axis = new SelfAxis(AxisUtil.SELF);
                                    }
                                    else {
                                    $axis = new DescendantOrSelfAxis(AxisUtil.DESCENDANT_OR_SELF);
                                    }
                                    })
 ;


namedAxisStep returns [NamedAxisStepUtil nameUtil]
@init{
Axis axis = null;
$nameUtil = null;
}
 :^(NAMED_AXIS_STEP  axisSpecifier {axis = $axisSpecifier.axisone;} nodeTest{$nameUtil = $nodeTest.stepUtil;$nameUtil.setAxis(axis);})
 |nodeTest{$nameUtil = $nodeTest.stepUtil;$nameUtil.setAxis(axis);}
 ;

axisSpecifier returns [Axis axisone]
@init{
$axisone =null;
}
:^(NAME_AXIS a=AxisName
             {$axisone = AxisUtil.get($a.text);
              })
|^(ATTRIBUTE_AXIS AbbreviatedAxisSpecifier
            {$axisone = new AttributeAxis(AxisUtil.ATTRIBUTE);
            })
;

nodeTest returns [NamedAxisStepUtil  stepUtil]
@init{

$stepUtil = new NamedAxisStepUtil();
}
: nameTest  {$stepUtil.setQname($nameTest.qname);}
|^(ANY_NODE a =NodeType
                 { if($a.text.equals("comment")){
                               $stepUtil.setValue("comment");
                           }
                           else if($a.text.equals("node")){
                               $stepUtil.setValue("node");
                           }
                           else if($a.text.equals("text")){
                               $stepUtil.setValue("text");
                           }   })
|^( ProcessingInstruction LeftParenthesis b=StringLiteral {$stepUtil.setValue($b.text);}RightParenthesis)
;

nameTest  returns [QName qname]
@init{
    $qname =null;
}
:^(ANY_NODE
        {$qname= new QName("","*");})
|^(ANY_NAMESPACED_NODE b=NCName
        { $qname = new QName($b.text,"*");})
|qName
        {$qname = $qName.name;}
;


 predicate returns [Predicate expr]
 @init{
 $expr = null;
 }
  :^(PREDICATE predicateExpr
           {$expr = new DefaultPredicate($predicateExpr.exprone);})
  ;

 predicateExpr returns [Expr exprone]
 @init{
 $exprone = null;
 }
 : expr
          {$exprone = $expr.expr;}
 ;


functionCall  returns [FunctionCallExpr expr]
@init{
$expr =null;
QName qnameOne=null;

}

	: ^(FUNCALL qName
	                {qnameOne=$qName.name;
	                   $expr = new DefaultFunctionCallExpr(qnameOne.getNamespaceURI(),qnameOne.getLocalPart());} (^(EXPRLIST expressionList
	                                                                   {
	                                                                  List<Expr> list = $expressionList.list;
	                                                                  for(Expr predi :list){
	                                                                  $expr.addParameter(predi);
	                                                                  }

	                   }))?)
	;

 expressionList returns [List<Expr> list]
 @init{
 $list = new ArrayList();
 }
 :^(expr {list.add($expr.expr);} (^(Comma exprrec{list.add($exprrec.expr);}))*)
 ;

exprrec returns [Expr expr]
@init{
$expr =null;
}
:expr{$expr = $expr.expr;}
;


    pathExpr returns [Expr expr]
      @init{
          $expr =null;
          Expr temp =null;
          LocationPath tempone =null;
          String value =null;
      }
       :locationPath  {$expr = new DefaultPathExpr(null,$locationPath.expr);}
       | filterExpr {temp =$filterExpr.expr;}simpleAxisStep{value = $simpleAxisStep.value;}  relativeLocationPath {
              if(value.equals("/")){
                   tempone = new DefaultRelativeLocationPath();
                   List<Step> list = $relativeLocationPath.list;
                   for(Step step:list){
                   tempone.addStep(step);
                   }
                $expr = new DefaultPathExpr(temp,tempone);
              }else if(value.equals("//")){
                   tempone = new DefaultRelativeLocationPath();
                   List<Step> list = $relativeLocationPath.list;
                   tempone.addStep(new DefaultAllNodeStep(new DescendantOrSelfAxis(AxisUtil.DESCENDANT_OR_SELF),new PredicateSet()));
                   for(Step step:list){
                   tempone.addStep(step);
                   }
                $expr = new DefaultPathExpr(temp,tempone);
              }
       }
        |filterExpr   {$expr = new DefaultPathExpr($filterExpr.expr,null);}
        ;

    simpleAxisStep returns [String value]
    @init{
        $value =null;
    }
     :^( SingleAxisStep{$value ="/";})
     | ^( RecursiveAxisStep{$value = "//";})
     ;

  filterExpr returns [Expr expr]
     @init{
         $expr =null;
         Expr temp =null;
         PredicateSet predica = new PredicateSet();

     }
       : ^(FILTER primaryExpr
          {temp =  $primaryExpr.expro;}
           predicate
               {predica.addPredicate($predicate.expr);
                $expr = new DefaultFilterExpr(temp,predica);})
       |primaryExpr{$expr = new DefaultFilterExpr($primaryExpr.expro,predica);}
       ;

     primaryExpr returns[Expr expro]
       @init{
            $expro =null;
       }
        : LeftParenthesis expr
             {$expro = $expr.expr;}
             RightParenthesis
         | literal {$expro = $literal.expr;}
         | functionCall
                   {$expro = $functionCall.expr;}
         ;



 expr  returns [Expr expr]
 @init{
 $expr =null;
 }
 : orExpr
        {$expr = $orExpr.expr;}
 ;

orExpr returns [Expr expr]
@init{
    $expr =null;
}
:^(Or andExpr orExprrec
        {$expr = new DefaultOrExpr($andExpr.expr,$orExprrec.expr);})
|andExpr {$expr = $andExpr.expr;}
;

orExprrec returns [Expr expr]
@init{
$expr =null;
}
  :orExpr {$expr = $orExpr.expr;}
  ;

andExpr returns [Expr expr]
@init{
$expr =null;
}
 :^(And equalityExpr andExprrec
     {$expr = new DefaultAndExpr($equalityExpr.expr,$andExprrec.expr);})
 | equalityExpr  {$expr = $equalityExpr.expr;}
 ;

andExprrec returns [Expr expr]
@init{
$expr =null;
}
:andExpr {$expr = $andExpr.expr;}
;


equalityExpr returns [Expr expr]
@init{
$expr =null;
}
 : ^(a =EqualityOp relationalExpr equalityExprrec
                                                  {if($a.text.equals("=")){
                                                   $expr = new DefaultEqualsExpr($relationalExpr.expr,$equalityExprrec.expr);
                                                   }
                                                   else{
                                                   $expr = new DefaultNotEqualsExpr($relationalExpr.expr,$equalityExprrec.expr);
                                                   }})
  |relationalExpr {$expr = $relationalExpr.expr;}
  ;

equalityExprrec returns [Expr expr]
@init{
$expr =null;
}
:equalityExpr{$expr = $equalityExpr.expr;}
;


relationalExpr returns [Expr expr]
@init{
$expr = null;
}
 :^( additiveExpr{$expr =$additiveExpr.expr;} (^(b = RelationalOp additiveExprrec {
                         if($b.text.equals("<")){
                         $expr = new DefaultLessThanExpr($additiveExpr.expr,$additiveExprrec.expr);

                         }else if($b.text.equals("<=")){
                                     $expr = new DefaultLessThanEqualExpr($additiveExpr.expr,$additiveExprrec.expr);

                         }else if($b.text.equals(">")){
                              $expr = new DefaultGreaterThanExpr($additiveExpr.expr,$additiveExprrec.expr);

                         }else if($b.text.equals("=>")){
                              $expr = new DefaultGreaterThanEqualExpr($additiveExpr.expr,$additiveExprrec.expr);
                         }




 }))*);

additiveExprrec returns [Expr expr]
@init{
$expr =null;
}
:additiveExpr {$expr = $additiveExpr.expr;}
;

additiveExpr returns [Expr expr]
@init{
$expr = null;

}
 :^(multiplicativeExpr {$expr = $multiplicativeExpr.expr; } (^(b =MultiplicativeOP multiplicativeExprrec{
                                                       if($b.text.equals("+")){
                                                               $expr = new DefaultPlusExpr($multiplicativeExpr.expr,$multiplicativeExprrec.expr);
                                                       }else{
                                                           $expr = new DefaultMinusExpr($multiplicativeExpr.expr,$multiplicativeExprrec.expr);
                                                       }






 }))*)
 ;
multiplicativeExprrec returns [Expr expr]
@init{
$expr =null;
}
 :multiplicativeExpr {$expr = $multiplicativeExpr.expr;}
 ;



 multiplicativeExpr returns [Expr expr]
 @init{
 $expr = null;

 }
 :^( unaryExpr {$expr = $unaryExpr.expr;} (^(b =UnaryOp unaryExprrec{
                       if($b.text.equals("*")){
                          $expr = new DefaultMultiplyExpr($unaryExpr.expr,$unaryExprrec.expr);
                       }else if($b.text.equals("mod")){
                             $expr = new DefaultModExpr($unaryExpr.expr,$unaryExprrec.expr);
                       }else if($b.text.equals("div")){
                             $expr = new DefaultDivExpr($unaryExpr.expr,$unaryExprrec.expr);
                       }
 }))*)
 ;

unaryExprrec returns [Expr expr]
@init{
$expr =null;
}
:unaryExpr {$expr = $unaryExpr.expr;}
;

 unaryExpr returns [Expr expr]
 @init{
  $expr =null;
    Expr temp =null;
 }
   :unionExpr  {$expr = new DefaultUnaryExpr($unionExpr.expr);}
   |'-' unaryExpr
   ;

   unionExpr returns [Expr expr]
   @init{
   $expr =null;
   }
    :^(Pipe pathExpr unionExprrec{$expr = new DefaultUnionExpr($pathExpr.expr,$unionExprrec.expr);})
    |pathExpr {$expr = $pathExpr.expr;}
    ;

  unionExprrec returns [Expr expr]
@init{
$expr =null;
}
:unionExpr{$expr = $unionExpr.expr;}
;

   literal returns [Expr expr]
   @init{
   $expr =null;
   }
    :^( a =StringLiteral{$expr = new DefaultLiteralExpr($a.text);})
    | ^( numericLiteral{$expr = new DefaultNumberExpr($numericLiteral.valueone);})
    |  ^( b =VariableReference { String c =$b.text.substring(1);
        $expr = new DefaultVariableReferenceExpr("",c);})
    ;

  numericLiteral returns [Double valueone]
  @init{
  String value =null;
  $valueone =null;
  }

     : a =IntegerLiteral {value = $a.text;$valueone = Double.parseDouble(value);}
     |b = DecimalLiteral  {value = $b.text;$valueone = Double.parseDouble(value);}
     |c= DoubleLiteral   {value = $c.text;$valueone = Double.parseDouble(value);}
     ;

 qName returns [QName name]
 @init{
 $name =null;
 }
 :^(NameSpacedQNAME a =NCName b=NCName{  $name = new QName($a.text,$b.text);})
 |^( c=NCName{$name = new QName("",$c.text);})
 ;
