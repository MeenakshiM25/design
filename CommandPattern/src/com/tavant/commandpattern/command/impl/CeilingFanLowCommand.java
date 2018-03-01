package com.tavant.commandpattern.command.impl;

import com.tavant.commandpattern.command.Command;
import com.tavant.commandpattern.reciever.CeilingFan;
import com.tavant.commandpattern.reciever.Speed;

public class CeilingFanLowCommand implements Command {
	private CeilingFan cielingFan;
	private Speed previousSpeed;
	

	@Override
	public void undo() {
		cielingFan.setPreviousSpeed(previousSpeed);
	}
	public CeilingFanLowCommand(CeilingFan cielingFan){
		this.cielingFan = cielingFan;
	}

	@Override
	public void execute() {
		this.previousSpeed = cielingFan.getSpeed();
		cielingFan.Low();	
	}

}
