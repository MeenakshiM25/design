package com.tavant.interpreter;
import java.util.ArrayList;
import java.util.Iterator;

import com.tavant.interpreter.context.Context;
import com.tavant.interpreter.expression.Expression;
import com.tavant.interpreter.expression.impl.HundredExpression;
import com.tavant.interpreter.expression.impl.OneExpression;
import com.tavant.interpreter.expression.impl.TenExpression;
import com.tavant.interpreter.expression.impl.ThousandExpression;


/** interpret a language.define its grammatical representation and use the same to intrepret a language to another form **/
public class MainInterpreter {
	public static void main(String[] args) {
		
//	      String roman = "MCMXXVIII";
		String roman = "MXDCCCLXXIX";
	      Context context = new Context(roman);

	      // Build the 'parse tree' 
	      ArrayList<Expression> tree = new ArrayList<Expression>();
	      tree.add(new ThousandExpression());
	      tree.add(new HundredExpression());
	      tree.add(new TenExpression());
	      tree.add(new OneExpression());

	      // Interpret 
	      for (Iterator it = tree.iterator(); it.hasNext();)
	      {
	    	  Expression exp = (Expression)it.next();
	    	  exp.interpret(context);
	      }

	      System.out.println(roman + " = " + Integer.toString(context.getOutput()));
	}
}







