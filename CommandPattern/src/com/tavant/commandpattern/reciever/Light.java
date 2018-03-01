package com.tavant.commandpattern.reciever;

public class Light {
	private String name;
	public Light(String name) {
		this.name = name;
	}
	public void On(){
		System.out.println(name+" is ON");
	}
	public void Off(){
		System.out.println(name+" is OFF");
	}
}
