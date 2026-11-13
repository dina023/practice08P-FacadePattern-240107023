package task01;

// Subsystem 3: Handles digital movie playback
public class StreamingPlayer {
    public void on() {
        System.out.println("[StreamingPlayer] Ready.");
    }

    public void play(String movie) {
        System.out.println("[StreamingPlayer] Now playing: \"" + movie + "\"");
    }

    public void stop() {
        System.out.println("[StreamingPlayer] Playback stopped.");
    }

    public void off() {
        System.out.println("[StreamingPlayer] Powered off.");
    }
}