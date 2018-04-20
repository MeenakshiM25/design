package com.tavant.state.impl;

import java.util.Random;

import com.tavant.state.GumballMachine;
import com.tavant.state.State;

public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You cant insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		this.gumballMachine.setState(this.gumballMachine.noQuarterState);
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned the crank");
		int winner = randomWinner.nextInt(10);
		if (winner == 0 && gumballMachine.getCount() > 1) {
			this.gumballMachine.setState(this.gumballMachine.winnerState);
		} else {
			this.gumballMachine.setState(this.gumballMachine.soldState);
		}
	}

	@Override
	public void dispense() {
		System.out.println("No Gumball Dispensed");
	}

}
