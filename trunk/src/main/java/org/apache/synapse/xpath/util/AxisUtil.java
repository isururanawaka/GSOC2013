package org.apache.synapse.xpath.util;

import org.apache.synapse.xpath.expression.axis.*;


public class AxisUtil {


        private AxisUtil() {}


        public final static int INVALID_AXIS       =  0;


        public final static int CHILD              =  1;


        public final static int DESCENDANT         =  2;


        public final static int PARENT             =  3;


        public final static int ANCESTOR           =  4;


        public final static int FOLLOWING_SIBLING  =  5;


        public final static int PRECEDING_SIBLING  =  6;


        public final static int FOLLOWING          =  7;


        public final static int PRECEDING          =  8;


        public final static int ATTRIBUTE          =  9;


        public final static int NAMESPACE          = 10;


        public final static int SELF               = 11;


        public final static int DESCENDANT_OR_SELF = 12;


        public final static int ANCESTOR_OR_SELF   = 13;


        public static String lookup(int axisNum)
        {
            switch ( axisNum )
            {
                case CHILD:
                    return "child";

                case DESCENDANT:
                    return "descendant";

                case PARENT:
                    return "parent";

                case ANCESTOR:
                    return "ancestor";

                case FOLLOWING_SIBLING:
                    return "following-sibling";

                case PRECEDING_SIBLING:
                    return "preceding-sibling";

                case FOLLOWING:
                    return "following";

                case PRECEDING:
                    return "preceding";

                case ATTRIBUTE:
                    return "attribute";

                case NAMESPACE:
                    return "namespace";

                case SELF:
                    return "self";

                case DESCENDANT_OR_SELF:
                    return "descendant-or-self";

                case ANCESTOR_OR_SELF:
                    return "ancestor-or-self";
            }

             return null;
        }


        public static int lookup(String axisName)
        {


            if ( "child".equals( axisName ) )
            {
                return CHILD;
            }

            if ( "descendant".equals( axisName ) )
            {
                return DESCENDANT;
            }

            if ( "parent".equals( axisName ) )
            {
                return PARENT;
            }

            if ( "ancestor".equals( axisName ) )
            {
                return ANCESTOR;
            }

            if ( "following-sibling".equals( axisName ) )
            {
                return FOLLOWING_SIBLING;
            }

            if ( "preceding-sibling".equals( axisName ) )
            {
                return PRECEDING_SIBLING;
            }

            if ( "following".equals( axisName ) )
            {
                return FOLLOWING;
            }

            if ( "preceding".equals( axisName ) )
            {
                return PRECEDING;
            }

            if ( "attribute".equals( axisName ) )
            {
                return ATTRIBUTE;
            }

            if ( "namespace".equals( axisName ) )
            {
                return NAMESPACE;
            }

            if ( "self".equals( axisName ) )
            {
                return SELF;
            }

            if ( "descendant-or-self".equals( axisName ) )
            {
                return DESCENDANT_OR_SELF;
            }

            if ( "ancestor-or-self".equals( axisName ) )
            {
                return ANCESTOR_OR_SELF;
            }

            return INVALID_AXIS;
        }

    public  static Axis get(String axisName){

        if ( "child".equals( axisName ) )
        {
            return new ChildAxis(CHILD);
        }

        if ( "descendant".equals( axisName ) )
        {
            return new DescendantAxis(DESCENDANT);
        }

        if ( "parent".equals( axisName ) )
        {
            return new ParentAxis(PARENT);
        }

        if ( "ancestor".equals( axisName ) )
        {
            return new AncestorAxis(ANCESTOR);
        }

        if ( "following-sibling".equals( axisName ) )
        {
            return new FollowingSiblingAxis(FOLLOWING_SIBLING);
        }

        if ( "preceding-sibling".equals( axisName ) )
        {
            return new PrecedingSiblingAxis(PRECEDING_SIBLING);
        }

        if ( "following".equals( axisName ) )
        {
            return new FollowingAxis(FOLLOWING);
        }

        if ( "preceding".equals( axisName ) )
        {
            return new PrecedingAxis(PRECEDING);
        }

        if ( "attribute".equals( axisName ) )
        {
            return new AttributeAxis(ATTRIBUTE);
        }

        if ( "namespace".equals( axisName ) )
        {
            return new NamespaceAxis(NAMESPACE);
        }

        if ( "self".equals( axisName ) )
        {
            return new SelfAxis(SELF);
        }

        if ( "descendant-or-self".equals( axisName ) )
        {
            return new DescendantOrSelfAxis(DESCENDANT_OR_SELF);
        }

        if ( "ancestor-or-self".equals( axisName ) )
        {
            return new AncestorOrSelfAxis(ANCESTOR_OR_SELF);
        }
        return null;
    }

}
