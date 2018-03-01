package com.tavant.factorypattern.pizza;
import com.tavant.factorypattern.ingredient.Cheese;
import com.tavant.factorypattern.ingredient.Clams;
import com.tavant.factorypattern.ingredient.Dough;
import com.tavant.factorypattern.ingredient.Pepperoni;
import com.tavant.factorypattern.ingredient.Sauce;
import com.tavant.factorypattern.ingredient.Veggies;


public abstract class Pizza {
	protected String name;
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	/*ArrayList<String> toppings = new ArrayList<String>();
	void prepare(){
		System.out.println("Preparing "+ name);
		System.out.println("Tossing dough");
		System.out.println("Adding sauce and toppings");
		for(String topping : toppings){
			System.out.println(" "+ topping);
		}
	}*/
	public abstract void prepare();
	public void bake(){
		System.out.println("Baking pizza at 350 for 25 mins");
	}
	public void cut(){
		System.out.println("Cutting Pizza into diagnal slices");
	}
	public void box(){
		System.out.println("Place Pizza in Pizza store box");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}
