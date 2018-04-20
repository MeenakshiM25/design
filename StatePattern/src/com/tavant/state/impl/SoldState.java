package com.tavant.state.impl;

import com.tavant.state.GumballMachine;
import com.tavant.state.State;

public class SoldState implements State {

	GumballMachine gumballMachine;
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait .We are already giving you gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry You already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesnt give you another gumball");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() >0){
			gumballMachine.setState(gumballMachine.noQuarterState);
		}else{
			System.out.println("Oops out of gumballs");
			gumballMachine.setState(gumballMachine.soldOutState);
		}
	}

}
