package task15;
public class Main {
    public static void main(String[] args) {
        KitchenFacade kitchen = new KitchenFacade(new IngredientStock(), new GrillStation(), new SaladStation(), new PlatingCounter(), new WaiterCallSystem());
        kitchen.prepareComboMeal("Grilled Salmon", "Greek Salad", 4);
        kitchen.prepareComboMeal("Grilled Salmon", "Caesar Salad", 7);
    }
}
