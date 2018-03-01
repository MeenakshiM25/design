package com.tavant.facadepattern.hometheater;

public class DVDPlayer {
	String movieName ;
	public void on(){
		System.out.println("DVD is turned ON");
	}
	public void play(String movieName){
		this.movieName = movieName;
		System.out.println("Playing"+movieName+"");
	}
	public void stop(){
		System.out.println(" Stop playing "+movieName+"");
	}
	public void ejectDVD(){
		System.out.println("CD  ejected from DVD player");
	}
	public void off(){
		System.out.println("DVD player is turned Off");
	}

}
