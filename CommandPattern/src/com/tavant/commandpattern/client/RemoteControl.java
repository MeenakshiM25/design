package com.tavant.commandpattern.client;

import com.tavant.commandpattern.command.Command;
import com.tavant.commandpattern.command.NoCommand;
/*Invoker*/
public class RemoteControl {
	Command[] onCommands;
	Command[] offComands;
	Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offComands = new Command[7];
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offComands[i] = noCommand;
		}
		undoCommand = new NoCommand();
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offComands[slot] = offCommand;
	}

	public void onButtonPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonPushed(int slot) {
		offComands[slot].execute();
		undoCommand = offComands[slot];
	}
	
	public void undoButtonPushed(){
		System.out.println("\nUndo Button Pressed\n");
		undoCommand.undo();
	}
}
