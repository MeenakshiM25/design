package com.tavant.strategypattern.behaviour.implementation;

import com.tavant.strategypattern.behaviour.FlyingBehavior;

public class FlyNoWay implements FlyingBehavior{

	@Override
	public void fly() {
		System.out.println("Can't Fly");
	}

}
