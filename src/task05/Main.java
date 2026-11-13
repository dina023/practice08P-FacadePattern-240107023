package task05;

// Client: Places two store orders through OrderFacade
public class Main {
    public static void main(String[] args) {
        OrderFacade store = new OrderFacade(
                new InventoryService(),
                new PaymentProcessor(),
                new ShippingService()
        );

        store.placeOrder("LAPTOP-001", 1299.99, "123 Abay Ave, Almaty");
        store.placeOrder("MOUSE-204", 45.50, "45 Dostyk St, Astana");
    }
}