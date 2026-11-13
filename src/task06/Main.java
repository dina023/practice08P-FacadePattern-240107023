package task06;

// Client: Executes morning and night aquarium routines via AquariumFacade
public class Main {
    public static void main(String[] args) {
        AquariumFacade aquarium = new AquariumFacade(
                new WaterFilter(),
                new AquariumHeater(),
                new AutoFeeder(),
                new LedHoodLight()
        );

        aquarium.runMorningRoutine();
        System.out.println();
        aquarium.prepareForNight();
    }
}