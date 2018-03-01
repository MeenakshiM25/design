package com.tavant.commandpattern.command.impl;

import com.tavant.commandpattern.command.Command;
import com.tavant.commandpattern.reciever.Light;

public class LightOffCommand implements Command {
	
	private Light light;
	
	public LightOffCommand(Light light){
		this.light = light;
	}
	@Override
	public void execute() {
		light.Off();
	}
	@Override
	public void undo() {
		light.On();
	}

}
