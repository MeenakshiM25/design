package com.tavant.commandpattern.reciever;

public enum Speed {
	HIGH("High"), MEDIUM("Medium"), LOW("Low"),ZERO("zero");
	String speed;

	Speed(String speed) {
		this.speed = speed;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
}
