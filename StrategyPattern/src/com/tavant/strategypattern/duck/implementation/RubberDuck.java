package com.tavant.strategypattern.duck.implementation;

import com.tavant.strategypattern.Duck;
import com.tavant.strategypattern.behaviour.implementation.FlyNoWay;
import com.tavant.strategypattern.behaviour.implementation.Squeak;

public class RubberDuck extends Duck {
	
	public RubberDuck(){
		setFlyingBehavior(new FlyNoWay());
		setQuackBehavior(new Squeak());
	}
	@Override
	public void display() {
		System.out.println("Looking like a Rubber Duck");
		
	}

}
