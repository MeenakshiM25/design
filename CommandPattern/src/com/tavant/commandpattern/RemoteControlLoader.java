package com.tavant.commandpattern;

import com.tavant.commandpattern.client.RemoteControl;
import com.tavant.commandpattern.command.Command;
import com.tavant.commandpattern.command.MacroCommand;
import com.tavant.commandpattern.command.impl.CeilingFanHighCommand;
import com.tavant.commandpattern.command.impl.CeilingFanLowCommand;
import com.tavant.commandpattern.command.impl.CeilingFanMediumCommand;
import com.tavant.commandpattern.command.impl.CeilingFanOffCommand;
import com.tavant.commandpattern.command.impl.DoorCloseCommand;
import com.tavant.commandpattern.command.impl.DoorOpenCommand;
import com.tavant.commandpattern.command.impl.LightOffCommand;
import com.tavant.commandpattern.command.impl.LightOnCommand;
import com.tavant.commandpattern.command.impl.StereoOffCommand;
import com.tavant.commandpattern.command.impl.StereoOnCommand;
import com.tavant.commandpattern.reciever.CeilingFan;
import com.tavant.commandpattern.reciever.Door;
import com.tavant.commandpattern.reciever.Light;
import com.tavant.commandpattern.reciever.Stereo;
/* Command Pattern-Here the Command object encapsulates different requests as object and pass it to invoker.
 * the Invoker class has no knowledge about how to service an incoming request but it passes the control to appropriate command object.
 * Command Object passes  the request to reciever that can take care of execution.
 * .hence Command objects provides decoupling between the invoker and the reciever objects that has to perform approriate action.**/
public class RemoteControlLoader {
	public static void main(String[] args){
		RemoteControl remoteControl = new RemoteControl();
		
		Light kitchenLight = new Light("Kitchen Light");
		Light livingRoomLight = new Light("Living Room Light");
		CeilingFan roomFan = new CeilingFan("Room Fan");
		Door frontDoor = new Door();
		Stereo stereo = new Stereo();
		
		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
		
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(roomFan);
		CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(roomFan);
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(roomFan);
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(roomFan);
		
		DoorOpenCommand frontDoorOpenCommand = new DoorOpenCommand(frontDoor);
		DoorCloseCommand frontDoorCloseCommand = new DoorCloseCommand(frontDoor);
		
		StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		/* No Command will be executed */
		remoteControl.onButtonPushed(0);
		remoteControl.offButtonPushed(0);
		remoteControl.onButtonPushed(1);
		remoteControl.offButtonPushed(1);
		
		remoteControl.setCommand(0, ceilingFanLowCommand, ceilingFanOffCommand);
		remoteControl.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);
		remoteControl.setCommand(2, ceilingFanHighCommand, ceilingFanOffCommand);
		remoteControl.setCommand(3, kitchenLightOnCommand, kitchenLightOffCommand);
		remoteControl.setCommand(4, livingRoomLightOnCommand, livingRoomLightOffCommand);
		remoteControl.setCommand(5, frontDoorOpenCommand, frontDoorCloseCommand);
		remoteControl.setCommand(6, stereoOnCommand, stereoOffCommand);
		
		remoteControl.onButtonPushed(0);
		remoteControl.offButtonPushed(0);
		remoteControl.undoButtonPushed();
		remoteControl.offButtonPushed(1);
		remoteControl.onButtonPushed(2);
		remoteControl.offButtonPushed(2);
		remoteControl.undoButtonPushed();
		remoteControl.onButtonPushed(3);
		remoteControl.offButtonPushed(3);
		remoteControl.undoButtonPushed();
		remoteControl.onButtonPushed(4);
		remoteControl.offButtonPushed(4);
		remoteControl.undoButtonPushed();
		remoteControl.onButtonPushed(5);
		remoteControl.offButtonPushed(5);
		remoteControl.undoButtonPushed();
		remoteControl.onButtonPushed(6);
		remoteControl.offButtonPushed(6);
		Command[] partyon = new Command[]{kitchenLightOnCommand,livingRoomLightOnCommand,ceilingFanHighCommand,stereoOnCommand};
 		MacroCommand partyOnCommand = new MacroCommand(partyon);
 		Command[] partyoff = new Command[]{kitchenLightOffCommand,livingRoomLightOffCommand,ceilingFanOffCommand,stereoOffCommand};
 		MacroCommand partyOffCommand = new MacroCommand(partyoff);
 		
 		remoteControl.setCommand(0, partyOnCommand, partyOffCommand);
 		
 		System.out.println("\n Executing Macro Command - party On\n");
 		remoteControl.onButtonPushed(0);
 		
 		System.out.println("\n Executing Macro Command - party Off\n");
 		remoteControl.offButtonPushed(0);
	}
}
