package com.tavant.strategypattern.duck.implementation;

import com.tavant.strategypattern.Duck;
import com.tavant.strategypattern.behaviour.implementation.FlyingWithWings;
import com.tavant.strategypattern.behaviour.implementation.Quack;

public class RedHeadDuck extends Duck{
	
	public RedHeadDuck(){
		setFlyingBehavior(new FlyingWithWings());
		setQuackBehavior(new Quack());
	}

	@Override
	public void display() {
		System.out.println("Looking like Red Head Duck!!!");
	}

}
