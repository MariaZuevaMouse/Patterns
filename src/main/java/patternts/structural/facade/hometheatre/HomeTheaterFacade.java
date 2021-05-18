package patternts.structural.facade.hometheatre;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amp,
                           Tuner tuner,
                           DvdPlayer dvdPlayer,
                           CdPlayer cdPlayer,
                           Projector projector,
                           TheaterLights lights,
                           Screen screen,
                           PopcornPopper popcornPopper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void  watchMovie(String movie){
        System.out.println("\n Get ready to matching a movie ...");
        popcornPopper.on();
        popcornPopper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvdPlayer);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println(" \n Shutting movie theatre down ...");
        popcornPopper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    public void listenToCd(String cdTitle){
        System.out.println("\n Get ready for an audio CD ... ");
        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cdPlayer);
        amp.setStereoSound();
        cdPlayer.on();
        cdPlayer.play(cdTitle);
    }

    public void endCD(){
        System.out.println("\n Shutting down CD ...");
        amp.off();
        amp.setCd(cdPlayer);
        cdPlayer.eject();
        cdPlayer.off();
    }

    public void listenToRadio(double frequency){
        System.out.println("\n Turning in the airwaves ...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void endRadio(){
        System.out.println("\n Shutting down the tuner ...");
        tuner.off();
        amp.off();
    }
}
