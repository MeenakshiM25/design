package com.tavant.iterator.menu;

import java.util.Iterator;

//import com.tavant.iterator.Iterator;
import com.tavant.iterator.impl.DinerMenuIterator;

public class DinerMenu implements Menu {
	MenuItem[] menuItems;
	int numberOfItems = 0;
	static final int MAX_ITEMS = 6;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Veg BLT", "Veg BLT with lettuce and tomato on whole wheat", true, 2.99);
		addItem("Soup of day", "Soup of day with side of potato salad", false, 3.29);
		addItem("Hot dog", "hot dog with relish,onions,topped with cheese", false, 3.09);

	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	public void addItem(String name, String description,boolean vegetarian, double price) {
		if(numberOfItems >= MAX_ITEMS) {
			System.out.println("Menu is full");
		} else {
			menuItems[numberOfItems] = new MenuItem(name,description,vegetarian,price);
			numberOfItems +=1;
		}
	}
	
	public Iterator createIterator(){
		return new DinerMenuIterator(menuItems);
	}
}
