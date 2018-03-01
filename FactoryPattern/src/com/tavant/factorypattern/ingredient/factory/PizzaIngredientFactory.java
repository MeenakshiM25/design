package com.tavant.factorypattern.ingredient.factory;

import com.tavant.factorypattern.ingredient.Cheese;
import com.tavant.factorypattern.ingredient.Clams;
import com.tavant.factorypattern.ingredient.Dough;
import com.tavant.factorypattern.ingredient.Pepperoni;
import com.tavant.factorypattern.ingredient.Sauce;
import com.tavant.factorypattern.ingredient.Veggies;
/* this is a abstract factory.it provides an interface for creating family of related objects without specifying their concrete implementations.the factory implementations will be injected as variables inside classes.hence composition is prefered while cretaing objects using this pattern*/
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Clams createClams();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
}
