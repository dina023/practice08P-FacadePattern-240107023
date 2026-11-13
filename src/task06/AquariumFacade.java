package task06;

// Facade: Orchestrates daily morning and night routines for the aquarium
public class AquariumFacade {
    private final WaterFilter filter;
    private final AquariumHeater heater;
    private final AutoFeeder feeder;
    private final LedHoodLight light;

    public AquariumFacade(WaterFilter filter, AquariumHeater heater, AutoFeeder feeder, LedHoodLight light) {
        this.filter = filter;
        this.heater = heater;
        this.feeder = feeder;
        this.light = light;
    }

    // Morning routine: daylight LEDs, 25.5°C water, filter cycle, and feeding
    public void runMorningRoutine() {
        System.out.println("=== Aquarium Morning Routine ===");
        light.setDaylightMode();
        heater.regulateTemperature(25.5);
        filter.cycleFilter();
        feeder.dispenseFood();
    }

    // Night routine: lower temperature to 24.0°C, filter cycle, and moonlight LEDs
    public void prepareForNight() {
        System.out.println("=== Aquarium Night Preparation ===");
        heater.regulateTemperature(24.0);
        filter.cycleFilter();
        light.setMoonlightMode();
    }
}