package com.tavant.composite;

import com.tavant.composite.menu.MenuComponent;
import com.tavant.composite.menu.impl.Menu;
import com.tavant.composite.menu.impl.MenuItem;
/** Composite creates tree like structures to represent part whole hierarchies 
 * enabling clients to treat the individual and composite objects uniformly.
 * Uses transparency as design principle as client .whether composite or
 *  leaf node becomes transparent to client .
 *  Simplifies client calls as client need not 
 *  worry whether its making call to leaf or node**/
public class TestMenu {
 public static void main(String[] args){
	 MenuComponent panCakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
	 MenuComponent dinerMenu = new Menu("DINER MENU","Lunch");
	 MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
	 MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert Of course");
	 
	 MenuComponent allMenus = new Menu("ALL MENUS","All Menus Combined");
	 
	 allMenus.add(panCakeHouseMenu);
	 allMenus.add(dinerMenu);
	 allMenus.add(cafeMenu);
     
	 dinerMenu.add(new MenuItem("Pasta","Spaghetti with marinara sauce",true,3.89));
     dinerMenu.add(dessertMenu);
     
     dessertMenu.add(new MenuItem("Apple Pie","Apple Pie topped with vanilla icecream",true,1.59));
     
     Waitress waitress = new Waitress(allMenus);
     waitress.print();
     waitress.printvegetarianMenu();
 }
}
