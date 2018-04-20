package com.tavant.state.impl;

import com.tavant.state.GumballMachine;
import com.tavant.state.State;

public class NoQuarterState implements State {

	GumballMachine gumballMachine;
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
      System.out.println("You inserted a quarter");
      this.gumballMachine.setState(this.gumballMachine.hasQuarterState);
	}

	@Override
	public void ejectQuarter() {
		System.out.println(" You havent inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but ther's no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You Need to Pay First");
	}

}
