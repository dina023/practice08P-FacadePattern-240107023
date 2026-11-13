package task01;

// Subsystem 2: Controls video projection and screen input
public class Projector {
    public void on() {
        System.out.println("[Projector] Warming up lamp.");
    }

    public void wideScreenMode() {
        System.out.println("[Projector] Aspect ratio set to 16:9 widescreen.");
    }

    public void off() {
        System.out.println("[Projector] Cooling down and shutting off.");
    }
}