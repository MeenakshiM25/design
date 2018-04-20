package com.tavant.interpreter.expression;

import com.tavant.interpreter.context.Context;

public abstract class Expression {

    public void interpret(Context context)
    {
      if (context.getInput().length() == 0) 
        return;

      if (context.getInput().startsWith(nine()))
      {
        context.setOutput(context.getOutput() + (9 * multiplier()));
        context.setInput(context.getInput().substring(2));
      }
      else if (context.getInput().startsWith(two()))
      {
        context.setOutput(context.getOutput() + (2 * multiplier()));
        context.setInput(context.getInput().substring(2));
      }
      else if (context.getInput().startsWith(three()))
      {
        context.setOutput(context.getOutput() + (3 * multiplier()));
        context.setInput(context.getInput().substring(2));
      }
      else if (context.getInput().startsWith(four()))
      {
        context.setOutput(context.getOutput() + (4 * multiplier()));
        context.setInput(context.getInput().substring(2));
      }
      else if (context.getInput().startsWith(five()))
      {
        context.setOutput(context.getOutput() + (5 * multiplier()));
        context.setInput( context.getInput().substring(1));
      }
      else if (context.getInput().startsWith(six()))
      {
        context.setOutput(context.getOutput() + (6 * multiplier()));
        context.setInput( context.getInput().substring(1));
      }
      else if (context.getInput().startsWith(seven()))
      {
        context.setOutput(context.getOutput() + (7 * multiplier()));
        context.setInput( context.getInput().substring(1));
      }
      else if (context.getInput().startsWith(eight()))
      {
        context.setOutput(context.getOutput() + (8 * multiplier()));
        context.setInput( context.getInput().substring(1));
      }

      while (context.getInput().startsWith(one()))
      {
        context.setOutput(context.getOutput() + (1 * multiplier()));
        context.setInput(context.getInput().substring(1));
      }
    }

    public abstract String one();
    public abstract String two();
    public abstract String three();
    public abstract String four();
    public abstract String five();
    public abstract String six();
    public abstract String seven();
    public abstract String eight();
    public abstract String nine();
    public abstract int multiplier();
	
}