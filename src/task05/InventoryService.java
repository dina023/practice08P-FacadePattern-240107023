package task05;

// Subsystem 1: Handles stock reservation for store items
public class InventoryService {
    public void reserveStock(String itemId) {
        System.out.println("[InventoryService] Reserved 1 unit of item: " + itemId);
    }
}