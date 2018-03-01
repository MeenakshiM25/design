package com.tavant.factorypattern.pizza;

public enum PizzaTypeEnum {
	CHEESE("cheese"), CLAM("clam"), PEPPERONI("Pepperoni"), VEGGIE("Veggie");
	PizzaTypeEnum(String value){
		this.value = value;
	}
	String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
