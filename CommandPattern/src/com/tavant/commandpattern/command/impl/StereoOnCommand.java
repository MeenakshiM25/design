package com.tavant.commandpattern.command.impl;

import com.tavant.commandpattern.command.Command;
import com.tavant.commandpattern.reciever.Stereo;

public class StereoOnCommand implements Command {
	
	private Stereo stereo;
	
	public StereoOnCommand(Stereo stereo){
		this.stereo = stereo;
	}
	@Override
	public void execute() {
		stereo.On();
		stereo.setCD();
		stereo.setVolume(18);
	}
	@Override
	public void undo() {
		stereo.Off();
	}

}
