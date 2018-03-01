package com.tavant.facadepattern.hometheater;

public class Amplifier {
	public void on(){
		System.out.println("Amplifier is turned ON");
	}
	public void setDVD(DVDPlayer dvdPlayer){
		System.out.println("Setting DVD");
	}
	public void setCD(CDPlayer cdPlayer){
		System.out.println("Setting CD");
	}
	public void setSurroundSound(){
		System.out.println("Setting surround sound");
	}
	public void setVolume(int volume){
		System.out.println("Setting Volume to "+volume+"  Decibels");
	}
	public void off(){
		System.out.println("Amplifier is turned Off");
	}

}
