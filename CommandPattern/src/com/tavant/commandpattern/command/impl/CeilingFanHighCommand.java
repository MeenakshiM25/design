package com.tavant.commandpattern.command.impl;

import com.tavant.commandpattern.command.Command;
import com.tavant.commandpattern.reciever.CeilingFan;
import com.tavant.commandpattern.reciever.Speed;

public class CeilingFanHighCommand implements Command {
	private CeilingFan cielingFan;
	private Speed previousSpeed;
	
	public CeilingFanHighCommand(CeilingFan cielingFan){
		this.cielingFan = cielingFan;
	}

	@Override
	public void execute() {
		this.previousSpeed = cielingFan.getSpeed();
		cielingFan.High();
	}

	@Override
	public void undo() {
		cielingFan.setPreviousSpeed(previousSpeed);
	}

	public Speed getPreviousSpeed() {
		return previousSpeed;
	}

	public void setPreviousSpeed(Speed previousSpeed) {
		this.previousSpeed = previousSpeed;
	}

}
