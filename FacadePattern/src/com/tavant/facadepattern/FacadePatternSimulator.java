package com.tavant.facadepattern;

import com.tavant.facadepattern.hometheater.Amplifier;
import com.tavant.facadepattern.hometheater.CDPlayer;
import com.tavant.facadepattern.hometheater.DVDPlayer;
import com.tavant.facadepattern.hometheater.HomeTheaterFacade;
import com.tavant.facadepattern.hometheater.PopCornPopper;
import com.tavant.facadepattern.hometheater.Projector;
import com.tavant.facadepattern.hometheater.Screen;
import com.tavant.facadepattern.hometheater.TheaterLights;
/**Facade pattern simplifies an interface.It provides a unified interface to a set of interfaces in a subsystem.
 * It defines a higher level interface making it easy for the subsystem to be used.However the subsystem can be accessed independently if needed.
 * Also uses Principle of least Knowledge which says talk only to your immediate neighbors**/
public class FacadePatternSimulator {
 public static void main(String[] args){
	 HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(), new DVDPlayer(), new CDPlayer(),
			 new PopCornPopper(), new Projector(), new Screen(), new TheaterLights());
	 homeTheaterFacade.watchMovie("Dragon Warriors");
	 System.out.println("..............................");
	 homeTheaterFacade.endMovie();
	 homeTheaterFacade.playSong("kk");
	 System.out.println("..............................");
	 homeTheaterFacade.endSong();
 }
}
