package com.tavant.commandpattern.reciever;

public class Stereo {
	
	public void On(){
		System.out.println("Stereo is ON");
	}
	

	public void Off(){
		System.out.println("Stereo is Off");
	}
	

	public void setCD(){
		System.out.println("CD is placed ");
	}
	
	public void setVolume(int value){
		System.out.println("Volume set to "+value+"decibels" );
	}
}
