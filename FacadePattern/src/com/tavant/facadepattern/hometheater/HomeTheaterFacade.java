package com.tavant.facadepattern.hometheater;

public class HomeTheaterFacade {
	
	Amplifier amplifier;
	DVDPlayer dvdPlayer;
	CDPlayer cdPlayer;
	PopCornPopper popCornPopper;
	Projector projector;
	Screen screen;
	TheaterLights theaterlight;
	
	public HomeTheaterFacade(Amplifier amplifier,DVDPlayer dvdPlayer,CDPlayer cdPlayer,
			PopCornPopper popCornPopper,Projector projector,Screen screen,TheaterLights theaterlight){
		this.amplifier = amplifier;
		this.dvdPlayer = dvdPlayer;
		this.cdPlayer = cdPlayer;
		this.popCornPopper = popCornPopper;
		this.projector = projector;
		this.screen = screen;
		this.theaterlight = theaterlight;
	}
	public void watchMovie(String movieName){
		System.out.println("//////////////////Getting ready to watch a movie//////////////////");
		popCornPopper.on();
		popCornPopper.pop();
		theaterlight.dim(5);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amplifier.on();
		amplifier.setDVD(dvdPlayer);
		amplifier.setSurroundSound();
		amplifier.setVolume(20);
		dvdPlayer.on();
		dvdPlayer.play(movieName);
	}
	public void endMovie(){
		System.out.println("//////////////////Shutting movie theater down////////////////////");
		popCornPopper.off();
		theaterlight.on();
		screen.up();
		projector.off();
		amplifier.off();
		dvdPlayer.stop();
		dvdPlayer.off();
	}
	public void playSong(String songName){
		System.out.println("//////////////////Getting ready for playing  music///////////////////");
		popCornPopper.on();
		popCornPopper.pop();
		theaterlight.dim(5);
		amplifier.on();
		amplifier.setCD(cdPlayer);
		amplifier.setSurroundSound();
		amplifier.setVolume(30);
		cdPlayer.on();
		cdPlayer.play(songName);
	}
	public void endSong(){
		System.out.println("//////////////////Shutting music system down/////////////////////");
		popCornPopper.off();
		theaterlight.on();
		amplifier.off();
		cdPlayer.stop();
		cdPlayer.off();
	}
}
