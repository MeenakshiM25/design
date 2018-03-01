package com.tavant.factorypattern;

import com.tavant.factorypattern.ingredient.factory.PizzaStore;
import com.tavant.factorypattern.ingredient.factory.impl.ChicagoPizzaStore;
import com.tavant.factorypattern.ingredient.factory.impl.NYPizzaStore;
import com.tavant.factorypattern.pizza.PizzaTypeEnum;

public class FactoryPatternSimulator {
	public static void main(String[] args){
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore nyPizzaStore = new NYPizzaStore();
		chicagoStore.orderPizza(PizzaTypeEnum.CHEESE);
		nyPizzaStore.orderPizza(PizzaTypeEnum.CLAM);
		nyPizzaStore.orderPizza(PizzaTypeEnum.VEGGIE);
		chicagoStore.orderPizza(PizzaTypeEnum.PEPPERONI);
	}
}
