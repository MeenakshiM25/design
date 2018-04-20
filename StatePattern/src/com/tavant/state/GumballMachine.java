package com.tavant.state;

import com.tavant.state.impl.HasQuarterState;
import com.tavant.state.impl.NoQuarterState;
import com.tavant.state.impl.SoldOutState;
import com.tavant.state.impl.SoldState;
import com.tavant.state.impl.WinnerState;

public class GumballMachine {
	public State noQuarterState;
	public State hasQuarterState;
	public State soldState;
	public State soldOutState;

	State state = soldOutState;
	private int count = 0;
	public State winnerState;

	public GumballMachine(int numberOfGumballs) {
		this.soldOutState = new SoldOutState(this);
		this.soldState = new SoldState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.winnerState = new WinnerState(this);
		this.count = numberOfGumballs;
		if (numberOfGumballs > 0) {
			this.state = noQuarterState;
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void insertQuarter() {
		this.state.insertQuarter();
	}

	public void ejectQuarter() {
		this.state.ejectQuarter();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void turnCrank() {
		this.state.turnCrank();
		this.state.dispense();
	}

	public void releaseBall() {
		System.out.println("A Gumball comes rolling out the slot");
		if (count != 0) {
			count = count - 1;
		}
	}
	
	
	@Override
	public String toString() {
		return "Current state"+this.state;
	}

}
