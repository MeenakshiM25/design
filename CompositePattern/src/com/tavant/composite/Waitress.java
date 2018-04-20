package com.tavant.composite;

import java.util.Iterator;

import com.tavant.composite.menu.MenuComponent;

public class Waitress {
 MenuComponent allMenus;
 
 public Waitress(MenuComponent allMenus){
	 this.allMenus = allMenus;
 }
 // print using default iterator provided by java.util
 public void print(){
	 allMenus.print();
 }
 
 
 public void printvegetarianMenu() {
	 Iterator iterator = allMenus.createIterator();
	 System.out.println("\n Veetarian Menu \n");
	 while (iterator.hasNext()) {
		 MenuComponent menuComponent = (MenuComponent)iterator.next();
		 try{
			 if(menuComponent.isVegetarian()) {
				 menuComponent.print();
			 }
		 }catch(UnsupportedOperationException e){
			 
		 }
	 }
 }
 
 
}
