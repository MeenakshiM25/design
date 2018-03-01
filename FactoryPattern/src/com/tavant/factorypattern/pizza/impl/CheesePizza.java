package com.tavant.factorypattern.pizza.impl;

import com.tavant.factorypattern.ingredient.factory.PizzaIngredientFactory;
import com.tavant.factorypattern.pizza.Pizza;

public class CheesePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
	    setName("Cheese and Sauce Pizza");
		this.ingredientFactory = pizzaIngredientFactory;
	}

	@Override
	public	void prepare() {
		System.out.println("***********Peparing "+name+"  ******************");
		ingredientFactory.createDough();
		ingredientFactory.createSauce();
		ingredientFactory.createCheese();
	}

}
