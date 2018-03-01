package com.tavant.templatepattern.template.impl;

import com.tavant.templatepattern.template.CaffieneBeverage;

public class Coffee extends CaffieneBeverage{

	@Override
	public void brew() {
		System.out.println("Brew some  coffe powder");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

}
