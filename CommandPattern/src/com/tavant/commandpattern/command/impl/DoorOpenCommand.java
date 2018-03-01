package com.tavant.commandpattern.command.impl;

import com.tavant.commandpattern.command.Command;
import com.tavant.commandpattern.reciever.Door;

public class DoorOpenCommand implements Command {
	
	private Door door;
	
	public DoorOpenCommand(Door door){
		this.door = door;
	}
	@Override
	public void execute() {
		door.open();
	}
	@Override
	public void undo() {
		door.close();
	}

}
