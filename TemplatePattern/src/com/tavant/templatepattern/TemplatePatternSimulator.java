package com.tavant.templatepattern;


import com.tavant.templatepattern.template.impl.Coffee;
import com.tavant.templatepattern.template.impl.CoffeeWithHook;
import com.tavant.templatepattern.template.impl.Tea;
import com.tavant.templatepattern.template.impl.TeaWithHook;
/** Caffiene Beverage's prepareRecipe() is template method.Template pattern defines the skeleton of algorithm ,
 * deferring implementation of some steps to the sub classes.So subclasses can redefine certain steps without 
 * changing the structure of algorithm.abstracts methods are required to be implemented by subclasses while hooks are optionally defined by subclasses.
 * High level components are not dependent on low level components (following a principle Don't call us,we'll call you).Arrays.sort() example of teamplate method*/
public class TemplatePatternSimulator {
	public static void main(String[] args){
		System.out.println("-------------------Making Coffee--------------------");
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();
		System.out.println("-------------------Making Tea-----------------------");
		Tea tea = new Tea();
		tea.prepareRecipe();
		System.out.println("-------------------Making Coffee--------------------");
		CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
		coffeeWithHook.prepareRecipe();
		System.out.println("-------------------Making Tea-----------------------");
		TeaWithHook teaWithHook = new TeaWithHook();
		teaWithHook.prepareRecipe();
	}
}
