package com.tavant.state;

/** State Pattern allows Objects behavior to change when the 
 * state changes.object appears to change its class.goes well with the strategy pattern**/
public class Test {
public static void main(String[] args){
	GumballMachine gm = new GumballMachine(5);
	
	System.out.println(gm);
	
	gm.insertQuarter();
	gm.turnCrank();
	System.out.println(gm);
	gm.insertQuarter();
	gm.ejectQuarter();
	gm.turnCrank();
	System.out.println(gm);
	gm.insertQuarter();
	gm.turnCrank();
	gm.insertQuarter();
	gm.turnCrank();
	gm.ejectQuarter();
	System.out.println(gm);
	gm.insertQuarter();
	gm.insertQuarter();
	gm.turnCrank();
	gm.insertQuarter();
	gm.turnCrank();
	gm.insertQuarter();
	gm.insertQuarter();
	System.out.println(gm);
}
}
