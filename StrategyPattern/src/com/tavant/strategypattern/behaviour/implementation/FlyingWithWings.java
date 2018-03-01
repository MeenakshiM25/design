package com.tavant.strategypattern.behaviour.implementation;

import com.tavant.strategypattern.behaviour.FlyingBehavior;

public class FlyingWithWings implements FlyingBehavior{

	@Override
	public void fly() {
		System.out.println("Flying with wings");
	}

}
