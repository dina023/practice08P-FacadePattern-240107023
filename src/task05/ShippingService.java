package task05;

// Subsystem 3: Generates delivery shipping labels
public class ShippingService {
    public void generateLabel(String itemId, String address) {
        System.out.println("[ShippingService] Generated shipping label for " + itemId + " -> " + address);
    }
}