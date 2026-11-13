package task08;

// Client: Demonstrates a complete drive cycle through CarIgnitionFacade
public class Main {
    public static void main(String[] args) {
        CarIgnitionFacade car = new CarIgnitionFacade(
                new Battery(),
                new FuelPump(),
                new StarterMotor(),
                new DashboardDisplay()
        );

        car.startEngine();
        System.out.println("\n... Driving to destination ...\n");
        car.stopEngine();
    }
}