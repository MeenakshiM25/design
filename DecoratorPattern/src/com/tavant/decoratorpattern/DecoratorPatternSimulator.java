package com.tavant.decoratorpattern;

import com.tavant.decoratorpattern.beverage.Beverage;
import com.tavant.decoratorpattern.beverage.impl.DarkRoast;
import com.tavant.decoratorpattern.beverage.impl.DeCaf;
import com.tavant.decoratorpattern.beverage.impl.Espresso;
import com.tavant.decoratorpattern.beverage.impl.HouseBlend;
import com.tavant.decoratorpattern.decorator.impl.Mocha;
import com.tavant.decoratorpattern.decorator.impl.Soy;
import com.tavant.decoratorpattern.decorator.impl.Whip;

/** Decorator pattern attaches additional responsibilities to object dynamically.
 * it provides flexible alternative to sub classing for extending functionality.Inheritance at the same time ,
 * composition both are involved in decorator pattern.Each decorator created is a type of beverage .
 * at the same time decorator contains beverage as a variable and it can add additional functionalities on top of it.**/
public class DecoratorPatternSimulator {
	public static void main(String[] args){
		Beverage darkRoast = new DarkRoast();
		System.out.println("Description: "+darkRoast.getDescription()+", Cost :"+darkRoast.cost()+"$");
		Beverage decaf = new DeCaf();
		System.out.println("Description: "+decaf.getDescription()+", Cost :"+decaf.cost()+"$");
		Beverage espresso = new Espresso();
		System.out.println("Description: "+espresso.getDescription()+", Cost :"+espresso.cost()+"$");
		Beverage houseBlend = new HouseBlend();
		System.out.println("Description: "+houseBlend.getDescription()+", Cost :"+houseBlend.cost()+"$");
		System.out.println(".........................................\n");
		Mocha mocha =new Mocha(darkRoast);
		Whip whip = new Whip(mocha);
		System.out.println("Description: "+whip.getDescription()+", Cost :"+whip.cost()+"$");
		System.out.println(".........................................\n");
		Mocha mocha1 =new Mocha(houseBlend);
		Soy soy  = new Soy(mocha1);
		System.out.println("Description: "+soy.getDescription()+", Cost :"+soy.cost()+"$");
		
	}
}
