package com.tavant.adapterpattern.adapter;

import com.tavant.adapterpattern.adaptee.Turkey;
import com.tavant.adapterpattern.target.Duck;
/* Adapter pattern converts an interface of one class(adaptee -turkey ) to interface of another class(target - duck) that the client expects.
 * Makes it possible for classes with incompatible interfaces to interact .
 * This class is a object adapter which implements a target interface and composes a adaptee thereby delegating the incoming requests to it.
 * Class adapter extends both target and adaptee (uses multiple inheritance),which is not possible in java.
 * EnumerationIterator is another example of adapter pattern that is used for converting enumerations to iterators */ 
public class TurkeyAdapter implements Duck {
	
	private Turkey turkey;
	
	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		turkey.fly();
	}

}
