package com.tavant.decoratorpattern.decorator.impl;

import com.tavant.decoratorpattern.beverage.Beverage;
import com.tavant.decoratorpattern.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

}
