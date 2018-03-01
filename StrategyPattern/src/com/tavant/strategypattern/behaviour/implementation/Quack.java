package com.tavant.strategypattern.behaviour.implementation;

import com.tavant.strategypattern.behaviour.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quacking");
	}

}
