package com.tavant.templatepattern.template;

public abstract class CaffieneBeverage {
 public void prepareRecipe(){
	 boilWater();
	 brew();
	 pouringIntoCup();
	 addCondiments();
	 
 }

public  void pouringIntoCup() {
	System.out.println("Pouring the beverage contents into cup");
}

public abstract void brew() ;

public  void boilWater() {
	System.out.println("Hot Water is boiled");
}

public abstract void addCondiments() ;
 
}
