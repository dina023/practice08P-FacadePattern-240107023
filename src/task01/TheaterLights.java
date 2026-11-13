package task01;

// Subsystem 4: Controls room lighting brightness
public class TheaterLights {
    public void dim(int level) {
        System.out.println("[TheaterLights] Dimming lights to " + level + "%.");
    }

    public void on() {
        System.out.println("[TheaterLights] Lights restored to 100%.");
    }
}