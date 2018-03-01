package com.tavant.factorypattern.pizza.impl;

import com.tavant.factorypattern.ingredient.factory.PizzaIngredientFactory;
import com.tavant.factorypattern.pizza.Pizza;

public class PepperoniPizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory){
		setName("Pepperoni Pizza");
		this.ingredientFactory = pizzaIngredientFactory;
	}

	@Override
	public	void prepare() {
		System.out.println("***********Peparing "+name+"  ******************");
		ingredientFactory.createDough();
		ingredientFactory.createSauce();
		ingredientFactory.createCheese();
		ingredientFactory.createPepperoni();
	}
}
