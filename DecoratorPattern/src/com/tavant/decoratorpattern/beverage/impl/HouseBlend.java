package com.tavant.decoratorpattern.beverage.impl;

import com.tavant.decoratorpattern.beverage.Beverage ;

public class HouseBlend extends Beverage {

	@Override
	public double cost() {
		return 0.89;
	}

	@Override
	public String getDescription() {
		return "House Blend Coffee";
	}
}
