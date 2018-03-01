package com.tavant.strategypattern;

import com.tavant.strategypattern.behaviour.FlyingBehavior;
import com.tavant.strategypattern.behaviour.QuackBehavior;

public abstract class Duck {
	/** Ducks has different flying and quack behaviors .
	 Since those behaviors are changing,different classes are created for their behaviors and kept as attributes .
	 These behaviors are injected at run time dynamically. **/
	private FlyingBehavior flyingBehavior;
	private QuackBehavior quackBehavior;
	public FlyingBehavior getFlyingBehavior() {
		return flyingBehavior;
	}
	public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
		this.flyingBehavior = flyingBehavior;
	}
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly(){
		flyingBehavior.fly();
	}
	
	/** All Ducks has this behavior **/
	public void swim(){
		System.out.println("All Ducks can swim.....");
	}
	/** Each Duck has different display, but for sure has this attribute **/
	public abstract void display();
}
