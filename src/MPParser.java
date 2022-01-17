
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Mon Jan 17 17:39:20 CET 2022
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.10k generated parser.
  * @version Mon Jan 17 17:39:20 CET 2022
  */
public class MPParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MPParser() {super();}

  /** Constructor which sets the default scanner. */
  public MPParser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\047\000\002\003\006\000\002\002\004\000\002\004" +
    "\006\000\002\005\004\000\002\005\003\000\002\007\005" +
    "\000\002\011\005\000\002\011\003\000\002\012\004\000" +
    "\002\013\004\000\002\013\002\000\002\014\005\000\002" +
    "\010\003\000\002\010\003\000\002\010\003\000\002\006" +
    "\004\000\002\006\003\000\002\015\012\000\002\015\006" +
    "\000\002\015\007\000\002\015\007\000\002\015\003\000" +
    "\002\017\005\000\002\017\005\000\002\017\003\000\002" +
    "\022\005\000\002\022\005\000\002\022\003\000\002\023" +
    "\003\000\002\023\003\000\002\023\005\000\002\016\004" +
    "\000\002\024\004\000\002\024\002\000\002\025\005\000" +
    "\002\020\005\000\002\020\003\000\002\021\005\000\002" +
    "\021\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\004\004\005\001\002\000\004\002\122\001" +
    "\002\000\004\016\006\001\002\000\004\017\007\001\002" +
    "\000\004\020\011\001\002\000\004\002\001\001\002\000" +
    "\010\024\012\025\017\026\015\001\002\000\004\005\ufff5" +
    "\001\002\000\022\005\042\007\036\011\033\012\043\020" +
    "\011\024\012\025\017\026\015\001\002\000\004\005\021" +
    "\001\002\000\004\005\ufff3\001\002\000\022\005\ufffd\007" +
    "\ufffd\011\ufffd\012\ufffd\020\ufffd\024\ufffd\025\ufffd\026\ufffd" +
    "\001\002\000\004\005\ufff4\001\002\000\006\022\ufffa\023" +
    "\ufffa\001\002\000\010\014\ufff7\022\ufff7\023\ufff7\001\002" +
    "\000\006\022\024\023\023\001\002\000\004\005\021\001" +
    "\002\000\022\005\ufffc\007\ufffc\011\ufffc\012\ufffc\020\ufffc" +
    "\024\ufffc\025\ufffc\026\ufffc\001\002\000\006\022\ufffb\023" +
    "\ufffb\001\002\000\010\014\027\022\ufff9\023\ufff9\001\002" +
    "\000\004\006\031\001\002\000\010\014\ufff8\022\ufff8\023" +
    "\ufff8\001\002\000\004\015\032\001\002\000\010\014\ufff6" +
    "\022\ufff6\023\ufff6\001\002\000\004\016\113\001\002\000" +
    "\004\013\110\001\002\000\016\005\uffec\007\uffec\011\uffec" +
    "\012\uffec\020\uffec\021\uffec\001\002\000\004\016\101\001" +
    "\002\000\016\005\042\007\036\011\033\012\043\020\011" +
    "\021\100\001\002\000\022\005\ufffe\007\ufffe\011\ufffe\012" +
    "\ufffe\020\ufffe\024\ufffe\025\ufffe\026\ufffe\001\002\000\016" +
    "\005\ufff1\007\ufff1\011\ufff1\012\ufff1\020\ufff1\021\ufff1\001" +
    "\002\000\026\013\uffe0\014\uffe0\015\uffe0\017\uffe0\022\uffe0" +
    "\023\uffe0\027\uffe0\030\uffe0\031\uffe0\032\uffe0\001\002\000" +
    "\004\016\044\001\002\000\010\005\042\006\045\016\051" +
    "\001\002\000\022\015\uffe4\017\uffe4\022\uffe4\023\uffe4\027" +
    "\uffe4\030\uffe4\031\uffe4\032\uffe4\001\002\000\022\015\uffe6" +
    "\017\uffe6\022\uffe6\023\uffe6\027\uffe6\030\uffe6\031\uffe6\032" +
    "\uffe6\001\002\000\022\015\uffe9\017\uffe9\022\uffe9\023\uffe9" +
    "\027\063\030\064\031\uffe9\032\uffe9\001\002\000\022\015" +
    "\uffe5\017\uffe5\022\uffe5\023\uffe5\027\uffe5\030\uffe5\031\uffe5" +
    "\032\uffe5\001\002\000\010\005\042\006\045\016\051\001" +
    "\002\000\012\017\uffdb\023\uffdb\031\061\032\060\001\002" +
    "\000\006\017\055\023\054\001\002\000\010\005\042\006" +
    "\045\016\051\001\002\000\004\022\056\001\002\000\016" +
    "\005\uffed\007\uffed\011\uffed\012\uffed\020\uffed\021\uffed\001" +
    "\002\000\012\017\uffdc\023\uffdc\031\061\032\060\001\002" +
    "\000\010\005\042\006\045\016\051\001\002\000\010\005" +
    "\042\006\045\016\051\001\002\000\022\015\uffeb\017\uffeb" +
    "\022\uffeb\023\uffeb\027\063\030\064\031\uffeb\032\uffeb\001" +
    "\002\000\010\005\042\006\045\016\051\001\002\000\010" +
    "\005\042\006\045\016\051\001\002\000\022\015\uffe7\017" +
    "\uffe7\022\uffe7\023\uffe7\027\uffe7\030\uffe7\031\uffe7\032\uffe7" +
    "\001\002\000\022\015\uffe8\017\uffe8\022\uffe8\023\uffe8\027" +
    "\uffe8\030\uffe8\031\uffe8\032\uffe8\001\002\000\022\015\uffea" +
    "\017\uffea\022\uffea\023\uffea\027\063\030\064\031\uffea\032" +
    "\uffea\001\002\000\010\017\071\031\061\032\060\001\002" +
    "\000\022\015\uffe3\017\uffe3\022\uffe3\023\uffe3\027\uffe3\030" +
    "\uffe3\031\uffe3\032\uffe3\001\002\000\026\013\uffe2\014\073" +
    "\015\uffe2\017\uffe2\022\uffe2\023\uffe2\027\uffe2\030\uffe2\031" +
    "\uffe2\032\uffe2\001\002\000\010\005\042\006\045\016\051" +
    "\001\002\000\026\013\uffe1\014\uffe1\015\uffe1\017\uffe1\022" +
    "\uffe1\023\uffe1\027\uffe1\030\uffe1\031\uffe1\032\uffe1\001\002" +
    "\000\010\015\076\031\061\032\060\001\002\000\026\013" +
    "\uffdf\014\uffdf\015\uffdf\017\uffdf\022\uffdf\023\uffdf\027\uffdf" +
    "\030\uffdf\031\uffdf\032\uffdf\001\002\000\016\005\ufff2\007" +
    "\ufff2\011\ufff2\012\ufff2\020\ufff2\021\ufff2\001\002\000\020" +
    "\002\uffff\005\uffff\007\uffff\011\uffff\012\uffff\020\uffff\021" +
    "\uffff\001\002\000\010\024\012\025\017\026\015\001\002" +
    "\000\004\005\103\001\002\000\004\010\104\001\002\000" +
    "\004\005\105\001\002\000\004\017\106\001\002\000\014" +
    "\005\042\007\036\011\033\012\043\020\011\001\002\000" +
    "\016\005\ufff0\007\ufff0\011\ufff0\012\ufff0\020\ufff0\021\ufff0" +
    "\001\002\000\010\005\042\006\045\016\051\001\002\000" +
    "\010\022\112\031\061\032\060\001\002\000\016\005\uffef" +
    "\007\uffef\011\uffef\012\uffef\020\uffef\021\uffef\001\002\000" +
    "\004\005\042\001\002\000\006\017\uffdd\023\uffdd\001\002" +
    "\000\006\017\117\023\116\001\002\000\004\005\042\001" +
    "\002\000\004\022\120\001\002\000\016\005\uffee\007\uffee" +
    "\011\uffee\012\uffee\020\uffee\021\uffee\001\002\000\006\017" +
    "\uffde\023\uffde\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\004\003\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\007\001\001" +
    "\000\002\001\001\000\010\005\012\007\015\010\013\001" +
    "\001\000\002\001\001\000\016\004\034\006\036\007\037" +
    "\010\013\015\040\016\033\001\001\000\006\011\021\012" +
    "\017\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\013\025\001\001\000" +
    "\002\001\001\000\004\012\024\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\014\027\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\004\034\015\076\016\033\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\024\071\001" +
    "\001\000\002\001\001\000\014\016\047\017\051\021\052" +
    "\022\046\023\045\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\012\016\047" +
    "\017\067\022\046\023\045\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\016\047\017\056\022\046\023\045" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\016\047\022\066\023\045\001\001\000\010" +
    "\016\047\022\061\023\045\001\001\000\002\001\001\000" +
    "\006\016\047\023\065\001\001\000\006\016\047\023\064" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\025\073" +
    "\001\001\000\012\016\047\017\074\022\046\023\045\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\101\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\004\034\015\106\016\033\001" +
    "\001\000\002\001\001\000\012\016\047\017\110\022\046" +
    "\023\045\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\016\113\020\114\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\016\120\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MPParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MPParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MPParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



   public static void main( String[] args )
   {
      try
	  {
		   FileReader file = new FileReader( args[0] );
		   Scanner scanner = new MPLexer( file );
		   MPParser parser = new MPParser( scanner );
		   parser.parse();
	  }
	  catch( Exception e )
	  {
		   System.out.println(e);
	  }
   }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$MPParser$actions {
  private final MPParser parser;

  /** Constructor */
  CUP$MPParser$actions(MPParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$MPParser$do_action(
    int                        CUP$MPParser$act_num,
    java_cup.runtime.lr_parser CUP$MPParser$parser,
    java.util.Stack            CUP$MPParser$stack,
    int                        CUP$MPParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MPParser$result;

      /* select the action based on the action number */
      switch (CUP$MPParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // ExpressionList ::= Expression 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 39." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*ExpressionList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // ExpressionList ::= ExpressionList COMMA Expression 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 38." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(15/*ExpressionList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // VarList ::= Variable 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 37." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*VarList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // VarList ::= VarList COMMA Variable 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 36." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(14/*VarList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Index ::= LSQUARE Expression RSQUARE 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 35." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(19/*Index*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // IndexList ::= 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 34." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(18/*IndexList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // IndexList ::= IndexList Index 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 33." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(18/*IndexList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // Variable ::= ID IndexList 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 32." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(12/*Variable*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // Factor ::= LROUND Expression RROUND 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 31." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(17/*Factor*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // Factor ::= CONST 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 30." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(17/*Factor*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // Factor ::= Variable 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 29." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(17/*Factor*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // Term ::= Factor 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 28." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // Term ::= Term DIV Factor 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 27." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // Term ::= Term MUL Factor 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 26." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(16/*Term*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Expression ::= Term 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 25." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Expression ::= Expression SUB Term 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 24." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Expression ::= Expression ADD Term 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 23." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(13/*Expression*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Statement ::= Block 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 22." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Statement ::= WRITE LROUND ExpressionList RROUND SEMICOLON 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 21." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-4)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Statement ::= READ LROUND VarList RROUND SEMICOLON 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 20." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-4)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Statement ::= Variable ASSIGN Expression SEMICOLON 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 19." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Statement ::= FOR LROUND Type ID IN ID RROUND Statement 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 18." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(11/*Statement*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-7)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // StatementList ::= Statement 
            {
              Object RESULT = null;
		
              System.out.println( "Izvrsena je redukcija po smeni 16." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // StatementList ::= StatementList Statement 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 15." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(4/*StatementList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Type ::= REAL 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 14." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Type ::= CHAR 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 13." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Type ::= INTEGER 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 12." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(6/*Type*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Dimension ::= LSQUARE CONST RSQUARE 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 11." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(10/*Dimension*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DimList ::= 
            {
              Object RESULT = null;
		
              System.out.println( "Izvrsena je redukcija po smeni 10." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*DimList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DimList ::= DimList Dimension 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 9." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(9/*DimList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Name ::= ID DimList 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 8." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(8/*Name*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NameList ::= Name 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 7." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NameList ::= NameList COMMA Name 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 6." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(7/*NameList*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // VarDecl ::= Type NameList SEMICOLON 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 5." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(5/*VarDecl*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-2)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // VarSection ::= VarDecl 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 4." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*VarSection*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // VarSection ::= VarSection VarDecl 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 3." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(3/*VarSection*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Block ::= LCURLY VarSection StatementList RCURLY 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 2." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(2/*Block*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).value;
		RESULT = start_val;
              CUP$MPParser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-1)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$MPParser$parser.done_parsing();
          return CUP$MPParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Program ::= MAIN LROUND RROUND Block 
            {
              Object RESULT = null;
		
               System.out.println( "Izvrsena je redukcija po smeni 1." );
            
              CUP$MPParser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-3)).left, ((java_cup.runtime.Symbol)CUP$MPParser$stack.elementAt(CUP$MPParser$top-0)).right, RESULT);
            }
          return CUP$MPParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

