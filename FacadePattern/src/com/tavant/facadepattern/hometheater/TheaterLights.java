package com.tavant.facadepattern.hometheater;

public class TheaterLights {
	public void on(){
		System.out.println("Theater lights turned ON");
	}
	public void dim(int percentage){
		System.out.println("Theater lights are dimmed off by "+percentage+"%");
	}
}
