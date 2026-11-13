package task04;

// Facade: Automates evening and morning room configurations
public class SmartRoomFacade {
    private final CeilingLight light;
    private final Thermostat thermostat;
    private final WindowBlinds blinds;
    private final DoorLock doorLock;

    public SmartRoomFacade(CeilingLight light, Thermostat thermostat, WindowBlinds blinds, DoorLock doorLock) {
        this.light = light;
        this.thermostat = thermostat;
        this.blinds = blinds;
        this.doorLock = doorLock;
    }

    // Night mode: lights off, blinds closed, door locked, thermostat at 19°C
    public void activateNightMode() {
        System.out.println("=== Activating Night Mode ===");
        light.turnOff();
        blinds.close();
        doorLock.lock();
        thermostat.setTemperature(19);
    }

    // Morning mode: blinds open, lights on, thermostat at 22°C
    public void activateMorningMode() {
        System.out.println("=== Activating Morning Mode ===");
        blinds.open();
        light.turnOn();
        thermostat.setTemperature(22);
    }
}