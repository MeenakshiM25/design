package com.tavant.iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;

//import com.tavant.iterator.Iterator;
import com.tavant.iterator.impl.DinerMenuIterator;
import com.tavant.iterator.impl.PanCakeIterator;

public class PancakeHouseMenu implements Menu{
	ArrayList menuItems;

	
	public PancakeHouseMenu(){
		menuItems = new ArrayList();
		addItem("Waffles","Waffles with blueberries or strawberries",true,3.59);
		addItem("Regular Pan cake", "Reg Pancake breakfast with eggs", false, 2.99);
		addItem("Blueberry Pan cake", "Pancake made with blueberries", true, 3.49);
		
	}
	public ArrayList getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(ArrayList menuItems) {
		this.menuItems = menuItems;
	}
    
	public void addItem(String name,String description,boolean vegetarian,double price){
		MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
		menuItems.add(menuItem);
	}
	
	public Iterator createIterator(){
//		return new PanCakeIterator(menuItems);
		return menuItems.iterator();
	}

}
