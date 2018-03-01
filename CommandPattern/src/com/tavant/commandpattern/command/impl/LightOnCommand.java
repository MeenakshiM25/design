package com.tavant.commandpattern.command.impl;

import com.tavant.commandpattern.command.Command;
import com.tavant.commandpattern.reciever.Light;

public class LightOnCommand implements Command {
	
	private Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}
	@Override
	public void execute() {
		light.On();
	}
	@Override
	public void undo() {
		light.Off();
	}

}
