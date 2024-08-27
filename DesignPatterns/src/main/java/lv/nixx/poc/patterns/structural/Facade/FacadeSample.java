package lv.nixx.poc.patterns.structural.Facade;

// Сложные подсистемы которыми нужно управлять в определенной последовательности
class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void setInput(String input) {
        System.out.println("Projector input set to: " + input);
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}

class Screen {
    public void down() {
        System.out.println("Screen is DOWN");
    }

    public void up() {
        System.out.println("Screen is UP");
    }
}

class SoundSystem {
    public void on() {
        System.out.println("Sound system is ON");
    }

    public void setVolume(int level) {
        System.out.println("Sound system volume set to: " + level);
    }

    public void off() {
        System.out.println("Sound system is OFF");
    }
}

// Фасад
class HomeTheaterFacade {
    private final DVDPlayer dvdPlayer;
    private final Projector projector;
    private final Screen screen;
    private final SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Screen screen, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        screen.down();
        projector.on();
        projector.setInput("DVD Player");
        soundSystem.on();
        soundSystem.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        screen.up();
    }
}

public class FacadeSample {

    public static void main(String[] args) {

        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, screen, soundSystem);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }

}

