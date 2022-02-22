
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141204 (SVN rev 60)
//----------------------------------------------------

package com.pacheco.mee_3;

import java_cup.runtime.*;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.lang.Object;
import java.util.*;
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141204 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\002\003\000\002\002\004\000\002\003" +
    "\005\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\005\000\002\003\003\000" +
    "\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\023\000\006\004\007\012\005\001\002\000\020\002" +
    "\ufff9\005\ufff9\006\ufff9\007\ufff9\010\ufff9\011\ufff9\013\ufff9" +
    "\001\002\000\006\004\007\012\005\001\002\000\004\002" +
    "\023\001\002\000\020\002\ufff8\005\ufff8\006\ufff8\007\ufff8" +
    "\010\ufff8\011\ufff8\013\ufff8\001\002\000\016\002\001\005" +
    "\013\006\014\007\011\010\015\011\012\001\002\000\006" +
    "\004\007\012\005\001\002\000\006\004\007\012\005\001" +
    "\002\000\006\004\007\012\005\001\002\000\006\004\007" +
    "\012\005\001\002\000\006\004\007\012\005\001\002\000" +
    "\020\002\ufffc\005\ufffc\006\ufffc\007\ufffc\010\ufffc\011\012" +
    "\013\ufffc\001\002\000\020\002\ufffe\005\ufffe\006\ufffe\007" +
    "\011\010\015\011\012\013\ufffe\001\002\000\020\002\uffff" +
    "\005\uffff\006\uffff\007\011\010\015\011\012\013\uffff\001" +
    "\002\000\020\002\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb" +
    "\011\ufffb\013\ufffb\001\002\000\020\002\ufffd\005\ufffd\006" +
    "\ufffd\007\ufffd\010\ufffd\011\012\013\ufffd\001\002\000\004" +
    "\002\000\001\002\000\016\005\013\006\014\007\011\010" +
    "\015\011\012\013\025\001\002\000\020\002\ufffa\005\ufffa" +
    "\006\ufffa\007\ufffa\010\ufffa\011\ufffa\013\ufffa\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\023\000\010\002\005\003\007\004\003\001\001\000" +
    "\002\001\001\000\006\003\023\004\003\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\003" +
    "\021\004\003\001\001\000\006\003\020\004\003\001\001" +
    "\000\006\003\017\004\003\001\001\000\006\003\016\004" +
    "\003\001\001\000\006\003\015\004\003\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
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
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
//@@CUPDBG1

    ComplexSymbolFactory f = new ComplexSymbolFactory();
    symbolFactory = f;
    File file = new File(filename);
    FileInputStream fis = null;
    try {
        fis = new FileInputStream(file);
    } catch (IOException e) {
        e.printStackTrace();
    } 
    lexer = new Lexer(f,fis);
    symT = new HashMap<String,Integer>();

    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
//@@CUPDBG2
 return lexer.yylex(); 
    }

//@@CUPDBG0

    protected Lexer lexer;
    private HashMap<String, Integer> symT;
    private String filename;

    public Parser(String filename) {
        this.filename = filename;
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // S ::= EXP 
            {
              Object RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG3
 System.out.println("result: " + e); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= S EOF 
            {
              Object RESULT =null;
		Location start_valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location start_valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // EXP ::= EXP ADD EXP 
            {
              Object RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG4
 RESULT = (Double)e1 + (Double)e2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // EXP ::= EXP MINUS EXP 
            {
              Object RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG5
 RESULT = (Double)e1 - (Double)e2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // EXP ::= EXP MULT EXP 
            {
              Object RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG6
 RESULT = (Double)e1 * (Double)e2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // EXP ::= EXP DIV EXP 
            {
              Object RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG7
 RESULT = (Double)e1 / (Double)e2; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // EXP ::= EXP POW EXP 
            {
              Object RESULT =null;
		Location e1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location e1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location e2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location e2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG8
 RESULT = Math.pow((Double)e1, (Double)e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // EXP ::= O_BRACKET EXP C_BRACKET 
            {
              Object RESULT =null;
		Location exleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location exright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG9
 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // EXP ::= NUM 
            {
              Object RESULT =null;
		Location nxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location nxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG10
 RESULT = n; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NUM ::= NUMBER 
            {
              Object RESULT =null;
		Location nxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location nxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG11
 RESULT = n; System.out.println(n); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("NUM",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
