package com.tavant.interpreter.expression.impl;

import com.tavant.interpreter.expression.Expression;

public class ThousandExpression extends Expression {

	public String one() {
		return "M";
	}
    
	public String two() {
		return "MM";
	}

	public String three() {
		return "MMM";
	}
	public String four() {
		return "MV";
	}

	public String five() {
		return "V";
	}
   

	public String six() {
		return "VM";
	}

	public String seven() {
		return "VMM";
	}

	public String eight() {
		return "VMMM";
	}
	public String nine() {
		return "MX";
	}

	public int multiplier() {
		return 1000;
	}

	

}
