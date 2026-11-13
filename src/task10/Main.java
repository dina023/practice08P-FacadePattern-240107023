package task10;

// Client: Demonstrates hotel check-in, full capacity handling, and check-out
public class Main {
    public static void main(String[] args) {
        HotelReceptionFacade reception = new HotelReceptionFacade(
                new RoomAvailability(),
                new BillingService(),
                new KeyCardEncoder(),
                new HousekeepingNotifier()
        );

        int room1 = reception.checkInGuest("Amina Kassymova", "SUITE", 3);
        reception.checkInGuest("Daniyar Serikov", "SUITE", 2); // Returns -1 (no suites left)
        reception.checkOutGuest(room1);
        reception.checkInGuest("Daniyar Serikov", "SUITE", 2); // Now succeeds
    }
}