package com.tavant.factorypattern.ingredient.factory.impl;

import com.tavant.factorypattern.ingredient.Cheese;
import com.tavant.factorypattern.ingredient.Clams;
import com.tavant.factorypattern.ingredient.Dough;
import com.tavant.factorypattern.ingredient.Pepperoni;
import com.tavant.factorypattern.ingredient.Sauce;
import com.tavant.factorypattern.ingredient.Veggies;
import com.tavant.factorypattern.ingredient.factory.PizzaIngredientFactory;
import com.tavant.factorypattern.ingredient.impl.BlackOlives;
import com.tavant.factorypattern.ingredient.impl.FrozenClams;
import com.tavant.factorypattern.ingredient.impl.MozzarellaCheese;
import com.tavant.factorypattern.ingredient.impl.PlumTomatoSauce;
import com.tavant.factorypattern.ingredient.impl.SlicedPepperoni;
import com.tavant.factorypattern.ingredient.impl.Spinach;
import com.tavant.factorypattern.ingredient.impl.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Clams createClams() {
		return new FrozenClams();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new BlackOlives(),new Spinach()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

}
