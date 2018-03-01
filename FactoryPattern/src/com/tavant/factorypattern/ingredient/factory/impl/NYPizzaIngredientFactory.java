package com.tavant.factorypattern.ingredient.factory.impl;

import com.tavant.factorypattern.ingredient.Cheese;
import com.tavant.factorypattern.ingredient.Clams;
import com.tavant.factorypattern.ingredient.Dough;
import com.tavant.factorypattern.ingredient.Pepperoni;
import com.tavant.factorypattern.ingredient.Sauce;
import com.tavant.factorypattern.ingredient.Veggies;
import com.tavant.factorypattern.ingredient.factory.PizzaIngredientFactory;
import com.tavant.factorypattern.ingredient.impl.FreshClams;
import com.tavant.factorypattern.ingredient.impl.Garlic;
import com.tavant.factorypattern.ingredient.impl.MarinaraSauce;
import com.tavant.factorypattern.ingredient.impl.Mushroom;
import com.tavant.factorypattern.ingredient.impl.Onion;
import com.tavant.factorypattern.ingredient.impl.RedPepper;
import com.tavant.factorypattern.ingredient.impl.ReggianoCheese;
import com.tavant.factorypattern.ingredient.impl.SlicedPepperoni;
import com.tavant.factorypattern.ingredient.impl.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

}
