package com.tavant.facadepattern.hometheater;

public class Projector {
	public void on(){
		System.out.println("Projector is turned ON");
	}
	public void off(){
		System.out.println("Projector is turned Off");
	}
	public void wideScreenMode(){
		System.out.println("Projector mode changed to widescreen mode");
	}
}
