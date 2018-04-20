package com.tavant.composite.menu.impl;

import java.util.ArrayList;
import java.util.Iterator;

import com.tavant.composite.menu.MenuComponent;
import com.tavant.composite.menu.iterator.CompositeIterator;

public class Menu extends MenuComponent {
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
 
	Iterator iterator = null;
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public MenuComponent getChild(int i) {
		return (MenuComponent) menuComponents.get(i);
	}
	
	
	 public void print(){
		System.out.println(getName() + "  ----"+ getDescription());
		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()){
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			menuComponent.print();
		}
	}
	 
	 public Iterator createIterator(){
		 if(iterator == null){
			 iterator = new CompositeIterator(menuComponents.iterator());
		 }
		return iterator;
		 
	 }
}
