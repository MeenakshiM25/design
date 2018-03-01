package com.tavant.decoratorpattern.beverage.impl;

import com.tavant.decoratorpattern.beverage.Beverage;


public class DarkRoast extends Beverage {

	@Override
	public double cost() {
		return 1.05;
	}
	@Override
	public String getDescription() {
		return "Dark Roast";
	}
	
}
