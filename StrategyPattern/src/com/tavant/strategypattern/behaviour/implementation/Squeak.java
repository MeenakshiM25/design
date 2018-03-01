package com.tavant.strategypattern.behaviour.implementation;

import com.tavant.strategypattern.behaviour.QuackBehavior;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeak....");
	}

}
