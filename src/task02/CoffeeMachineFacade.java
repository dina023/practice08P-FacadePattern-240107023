package task02;

public class CoffeeMachineFacade {
    private final WaterHeater waterHeater;
    private final CoffeeGrinder grinder;
    private final BrewUnit brewUnit;
    private final CupDispenser cupDispenser;

    public CoffeeMachineFacade(WaterHeater waterHeater,
                               CoffeeGrinder grinder,
                               BrewUnit brewUnit,
                               CupDispenser cupDispenser) {
        this.waterHeater = waterHeater;
        this.grinder = grinder;
        this.brewUnit = brewUnit;
        this.cupDispenser = cupDispenser;
    }

    // Fine grind, 92°C, 25s brew
    public void brewEspresso() {
        System.out.println("=== Brewing Espresso ===");
        cupDispenser.dispenseCup();
        waterHeater.heatWater(92);
        grinder.grindBeans("fine");
        brewUnit.brew(25);
        System.out.println("[CoffeeMachine] Espresso is ready!\n");
    }

    // Medium grind, 95°C, 40s brew + extra hot water
    public void brewAmericano() {
        System.out.println("=== Brewing Americano ===");
        cupDispenser.dispenseCup();
        waterHeater.heatWater(95);
        grinder.grindBeans("medium");
        brewUnit.brew(40);
        waterHeater.dispenseHotWater(100);
        System.out.println("[CoffeeMachine] Americano is ready!\n");
    }
}