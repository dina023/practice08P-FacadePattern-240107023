package task02;

public class Main {
    public static void main(String[] args) {
        CoffeeMachineFacade coffeeMachine = new CoffeeMachineFacade(
                new WaterHeater(),
                new CoffeeGrinder(),
                new BrewUnit(),
                new CupDispenser()
        );

        coffeeMachine.brewEspresso();
        coffeeMachine.brewAmericano();
    }
}