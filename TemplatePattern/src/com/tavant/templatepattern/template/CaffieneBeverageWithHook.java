package com.tavant.templatepattern.template;
/**Hooks are default method implementations provided by super classes.
 * Subclasses have the ability to override the methods providing their own implementations **/
public abstract class CaffieneBeverageWithHook {

 public void prepareRecipe(){
	 boilWater();
	 brew();
	 pouringIntoCup();
	 if(customerWantsCondiments()){
		 addCondiments();
	 } 
 }

public  void boilWater() {
	System.out.println("Hot Water is boiled");
}
public abstract void brew() ;

public  void pouringIntoCup() {
	System.out.println("Pouring the beverage contents into cup");
}

public abstract void addCondiments() ;
 
public boolean customerWantsCondiments(){
	return true;
	
}
}
