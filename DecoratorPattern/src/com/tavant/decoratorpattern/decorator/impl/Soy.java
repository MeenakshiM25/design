package com.tavant.decoratorpattern.decorator.impl;

import com.tavant.decoratorpattern.beverage.Beverage;
import com.tavant.decoratorpattern.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}

	

}
