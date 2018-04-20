package com.tavant.state.impl;

import com.tavant.state.GumballMachine;
import com.tavant.state.State;

public class WinnerState implements State {

	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertQuarter() {
   
	}

	@Override
	public void ejectQuarter() {

	}

	@Override
	public void turnCrank() {

	}

	@Override
	public void dispense() {
		System.out.println("You are a winner.you et 2 dumballs for ur quarter");
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() == 0){
			gumballMachine.setState(gumballMachine.soldOutState);
		}else{
			gumballMachine.releaseBall();
			if(gumballMachine.getCount() >0){
				gumballMachine.setState(gumballMachine.noQuarterState);
			}else{
				System.out.println("Oops out of gumballs");
				gumballMachine.setState(gumballMachine.soldOutState);
			}
		}
	}

}
