package com.tavant.commandpattern.command.impl;

import com.tavant.commandpattern.command.Command;
import com.tavant.commandpattern.reciever.Door;

public class DoorCloseCommand implements Command {
	
	private Door door;
	
	public DoorCloseCommand(Door door){
		this.door = door;
	}
	@Override
	public void execute() {
		door.close();
	}
	@Override
	public void undo() {
		door.open();
	}

}
