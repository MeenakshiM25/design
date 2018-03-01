package com.tavant.facadepattern.hometheater;

public class CDPlayer {
	String songname ;
	public void on(){
		System.out.println("CD Player is turned ON");
	}
	public void play(String songname){
		this.songname = songname;
		System.out.println("Playing" +songname+ "with CD player");
	}
	public void stop(){
		System.out.println("Stop playing " +songname +"");
	}
	public void ejectDVD(){
		System.out.println("CD is ejected from CD player");
	}
	public void off(){
		System.out.println("CD player is turned Off");
	}

}
