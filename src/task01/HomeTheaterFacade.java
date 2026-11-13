package task01;

// Facade: Simplifies home theater startup and shutdown into two high-level calls
public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final Projector projector;
    private final StreamingPlayer player;
    private final TheaterLights lights;

    public HomeTheaterFacade(Amplifier amplifier,
                             Projector projector,
                             StreamingPlayer player,
                             TheaterLights lights) {
        this.amplifier = amplifier;
        this.projector = projector;
        this.player = player;
        this.lights = lights;
    }

    // Coordinates every subsystem in the exact sequence needed to start a movie
    public void watchMovie(String movie) {
        System.out.println("=== Preparing Home Theater ===");
        lights.dim(15);
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setSurroundSound();
        amplifier.setVolume(65);
        player.on();
        player.play(movie);
    }

    // Safely reverses the startup sequence when the movie ends
    public void endMovie() {
        System.out.println("=== Shutting Down Home Theater ===");
        player.stop();
        player.off();
        amplifier.off();
        projector.off();
        lights.on();
    }
}