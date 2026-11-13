package task08;

// Subsystem 2: Pressurizes and shuts off the fuel delivery line
public class FuelPump {
    public void primeFuelLine() {
        System.out.println("[FuelPump] Fuel line pressurized.");
    }

    public void stopPump() {
        System.out.println("[FuelPump] Fuel delivery stopped.");
    }
}