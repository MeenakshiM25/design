package com.tavant.templatepattern.template.impl;

import com.tavant.templatepattern.template.CaffieneBeverage;

public class Tea extends CaffieneBeverage{

	@Override
	public void brew() {
		System.out.println("Steep tea bag in boiling water");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding few  lemon drops");
	}

}
