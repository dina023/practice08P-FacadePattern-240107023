package task01;

// Client: Plays two movies in sequence via HomeTheaterFacade
public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Projector projector = new Projector();
        StreamingPlayer player = new StreamingPlayer();
        TheaterLights lights = new TheaterLights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, projector, player, lights);

        // Movie Session 1
        homeTheater.watchMovie("The Java Chronicles");
        System.out.println();
        homeTheater.endMovie();

        System.out.println("\n----------------------------------------\n");

        // Movie Session 2
        homeTheater.watchMovie("Design Patterns: The Sequel");
        System.out.println();
        homeTheater.endMovie();
    }
}