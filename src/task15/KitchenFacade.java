package task15;
public class KitchenFacade {
    private final IngredientStock stock; private final GrillStation grill; private final SaladStation salad;
    private final PlatingCounter plating; private final WaiterCallSystem waiter;
    public KitchenFacade(IngredientStock st, GrillStation gr, SaladStation sa, PlatingCounter pl, WaiterCallSystem wc) {
        this.stock = st; this.grill = gr; this.salad = sa; this.plating = pl; this.waiter = wc;
    }
    public boolean prepareComboMeal(String mainDish, String sideSalad, int tableNumber) {
        if (!stock.hasIngredients(mainDish, sideSalad)) { System.out.println("[Kitchen] Out of stock: " + mainDish + " + " + sideSalad); return false; }
        stock.consume(mainDish, sideSalad); grill.cookMain(mainDish); salad.prepareSalad(sideSalad);
        plating.plateCombo(mainDish, sideSalad); waiter.notifyServer(tableNumber); return true;
    }
}
