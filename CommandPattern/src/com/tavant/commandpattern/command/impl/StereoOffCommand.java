package com.tavant.commandpattern.command.impl;

import com.tavant.commandpattern.command.Command;
import com.tavant.commandpattern.reciever.Stereo;

public class StereoOffCommand implements Command {
	
	private Stereo stereo;
	
	public StereoOffCommand(Stereo stereo){
		this.stereo = stereo;
	}
	@Override
	public void execute() {
		stereo.Off();
	}
	@Override
	public void undo() {
		stereo.On();
	}

}
