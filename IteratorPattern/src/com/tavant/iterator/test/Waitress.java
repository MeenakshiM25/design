package com.tavant.iterator.test;

import java.util.Iterator;

//import com.tavant.iterator.Iterator;
import com.tavant.iterator.menu.DinerMenu;
import com.tavant.iterator.menu.Menu;
import com.tavant.iterator.menu.MenuItem;
import com.tavant.iterator.menu.PancakeHouseMenu;
/** Provides a way to sequentially access an aggregate object without going through its underlying implementation **/
public class Waitress {
	public static void main(String[] args) {
		new Waitress().printMenu();
	}

	/*
	 * private void printMenu() { PancakeHouseMenu pancakeMenu = new
	 * PancakeHouseMenu(); ArrayList<MenuItem> breakfastItems =
	 * pancakeMenu.getMenuItems(); DinerMenu dinerMenu = new DinerMenu();
	 * MenuItem[] lunchItems = dinerMenu.getMenuItems(); for(int i=0;i
	 * <breakfastItems.size();i++){ MenuItem menu = breakfastItems.get(i);
	 * System.out.println(menu.getName()+ " "+menu.getDescription() + " "+
	 * menu.getPrice()); }
	 * 
	 * for(int i=0;i < lunchItems.length;i ++) { MenuItem item = lunchItems[i];
	 * System.out.println(item.getName()+ " "+item.getDescription() + " "+
	 * item.getPrice()); }
	 * 
	 * }
	 */

	private void printMenu() {
		Menu pancakeMenu = new PancakeHouseMenu();
		Iterator breakfastIterator = pancakeMenu.createIterator();
		System.out.println("----------Printing breakfast menu-----------");
		printMenu(breakfastIterator);
		Menu dinerMenu = new DinerMenu();
		Iterator lunchIterator = dinerMenu.createIterator();
		System.out.println("----------Printing lunch menu----------------");
		printMenu(lunchIterator);

	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menu = (MenuItem) iterator.next();
			System.out.println(menu.getName() + " " + menu.getDescription() + " " + menu.getPrice());
		}
	}
}
