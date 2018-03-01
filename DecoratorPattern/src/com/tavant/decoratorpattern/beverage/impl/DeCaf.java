package com.tavant.decoratorpattern.beverage.impl;

import com.tavant.decoratorpattern.beverage.Beverage;


public class DeCaf extends Beverage {

	@Override
	public double cost() {
		return 1.19;
	}
	
	@Override
	public String getDescription() {
		return "De Caf";
	}
}
