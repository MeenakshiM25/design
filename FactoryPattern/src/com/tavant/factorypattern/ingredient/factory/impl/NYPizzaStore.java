package com.tavant.factorypattern.ingredient.factory.impl;

import com.tavant.factorypattern.ingredient.factory.PizzaIngredientFactory;
import com.tavant.factorypattern.ingredient.factory.PizzaStore;
import com.tavant.factorypattern.pizza.Pizza;
import com.tavant.factorypattern.pizza.PizzaTypeEnum;
import com.tavant.factorypattern.pizza.impl.CheesePizza;
import com.tavant.factorypattern.pizza.impl.ClamPizza;
import com.tavant.factorypattern.pizza.impl.PepperoniPizza;
import com.tavant.factorypattern.pizza.impl.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
	private PizzaIngredientFactory ingredientFactory;
	public NYPizzaStore(){
		ingredientFactory = new NYPizzaIngredientFactory();
	}
	@Override
	protected Pizza createPizza(PizzaTypeEnum type) {
		Pizza pizza = null;
		if(type.equals(PizzaTypeEnum.CHEESE)){
			pizza = new CheesePizza(ingredientFactory);
		}else if(type.equals(PizzaTypeEnum.CLAM)){
			pizza = new ClamPizza(ingredientFactory);
		}else if (type.equals(PizzaTypeEnum.PEPPERONI)){
			pizza = new PepperoniPizza(ingredientFactory);
		}else if(type.equals(PizzaTypeEnum.VEGGIE)){
			pizza = new VeggiePizza(ingredientFactory);
		}
		return pizza;
	}

}
