package com.tavant.commandpattern.reciever;

public class CeilingFan {
	private Speed speed;
	private String name;
	
	public CeilingFan(String name){
		this.setName(name);
	}
    public void High(){
    	speed = Speed.HIGH;
    	System.out.println(name +"speed set High");
    }
    
    public void Medium(){
    	speed = Speed.MEDIUM;
    	System.out.println(name +"speed set Medium");
    }
    
    public void Low(){
    	speed = Speed.LOW;
    	System.out.println(name +"speed set Low");
    }
    
    public void Off(){
    	speed = Speed.ZERO;
    	System.out.println(name +"switched Off");
    }

	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed(Speed speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPreviousSpeed(Speed previousSpeed){
		if(previousSpeed.equals(Speed.HIGH)){
			High();
		}else if (previousSpeed.equals(Speed.MEDIUM)){
			Medium();
		}else if (previousSpeed.equals(Speed.LOW)){
			Low();
		}else if (previousSpeed.equals(Speed.ZERO)){
			Off();
		}
	}
	
    
}
