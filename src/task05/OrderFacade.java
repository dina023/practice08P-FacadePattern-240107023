package task05;

// Facade: Coordinates inventory, payment, and shipping into a single order call
public class OrderFacade {
    private final InventoryService inventory;
    private final PaymentProcessor payment;
    private final ShippingService shipping;

    public OrderFacade(InventoryService inventory, PaymentProcessor payment, ShippingService shipping) {
        this.inventory = inventory;
        this.payment = payment;
        this.shipping = shipping;
    }

    // Reserves stock, charges customer, and creates shipping label
    public void placeOrder(String itemId, double amount, String address) {
        System.out.println("=== Placing Order for " + itemId + " ===");
        inventory.reserveStock(itemId);
        payment.charge(amount);
        shipping.generateLabel(itemId, address);
        System.out.println("[OrderFacade] Order completed!\n");
    }
}