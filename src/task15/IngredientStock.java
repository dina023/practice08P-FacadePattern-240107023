package task15;
import java.util.*;
public class IngredientStock {
    private final Map<String, Integer> stock = new HashMap<>(Map.of("Grilled Salmon", 1, "Greek Salad", 1, "Caesar Salad", 3));
    public boolean hasIngredients(String mainDish, String sideSalad) { return stock.getOrDefault(mainDish, 0) > 0 && stock.getOrDefault(sideSalad, 0) > 0; }
    public void consume(String mainDish, String sideSalad) { stock.put(mainDish, stock.get(mainDish) - 1); stock.put(sideSalad, stock.get(sideSalad) - 1); }
}
