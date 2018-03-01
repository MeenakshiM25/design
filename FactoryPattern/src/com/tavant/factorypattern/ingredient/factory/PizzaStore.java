package com.tavant.factorypattern.ingredient.factory;

import com.tavant.factorypattern.pizza.Pizza;
import com.tavant.factorypattern.pizza.PizzaTypeEnum;
/*this is factory pattern.here the abstract createPizza() is the factory method which creates an interface for creating objects but lets the subclasses handle the creation logic.this pattern uses inheritance for object creation */
public abstract class PizzaStore {
	
	protected abstract Pizza createPizza(PizzaTypeEnum type);
	
	
	public Pizza orderPizza(PizzaTypeEnum type){
		Pizza pizza  = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	};
}
