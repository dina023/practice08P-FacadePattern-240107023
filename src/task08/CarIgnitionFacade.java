package task08;

// Facade: Coordinates vehicle startup and shutdown sequences
public class CarIgnitionFacade {
    private final Battery battery;
    private final FuelPump fuelPump;
    private final StarterMotor starterMotor;
    private final DashboardDisplay dashboard;

    public CarIgnitionFacade(Battery battery, FuelPump fuelPump,
                             StarterMotor starterMotor, DashboardDisplay dashboard) {
        this.battery = battery;
        this.fuelPump = fuelPump;
        this.starterMotor = starterMotor;
        this.dashboard = dashboard;
    }

    // Checks battery, primes fuel, cranks starter, and lights dashboard
    public void startEngine() {
        System.out.println("=== Starting Vehicle ===");
        battery.checkVoltage();
        fuelPump.primeFuelLine();
        starterMotor.crankEngine();
        dashboard.illuminateGauges();
    }

    // Stops fuel delivery, turns off gauges, and disconnects accessories
    public void stopEngine() {
        System.out.println("=== Stopping Vehicle ===");
        fuelPump.stopPump();
        dashboard.turnOffGauges();
        battery.disconnectAccessories();
    }
}