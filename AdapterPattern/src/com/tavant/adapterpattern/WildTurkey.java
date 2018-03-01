package com.tavant.adapterpattern;

import com.tavant.adapterpattern.adaptee.Turkey;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("Gobble...");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying for shorter distance");
		
	}

}
