package com.tavant.composite.menu.impl;

import java.util.Iterator;

import com.tavant.composite.menu.MenuComponent;
import com.tavant.composite.menu.iterator.NullIterator;

public class MenuItem  extends MenuComponent{
 
	String name;
	String description;
	boolean vegetarian;
	double price;
	
	public MenuItem (String name,String description,boolean vegetarian,double price){
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}
	
	public void print() {
		System.out.println(getName() + "  ");
		if(isVegetarian()){
			System.out.print("(v)");
		}
		System.out.print(" "+getDescription()+ " ----"+ getPrice()+ "\n");
	}
	
	@Override
	public Iterator createIterator() {
		return new NullIterator(); // iterator that does nothing
	}
}
