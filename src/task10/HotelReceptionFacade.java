package task10;

// Facade: Coordinates hotel guest check-in and check-out workflows
public class HotelReceptionFacade {
    private final RoomAvailability roomAvailability;
    private final BillingService billingService;
    private final KeyCardEncoder keyCardEncoder;
    private final HousekeepingNotifier housekeeping;

    public HotelReceptionFacade(RoomAvailability roomAvailability, BillingService billingService,
                                KeyCardEncoder keyCardEncoder, HousekeepingNotifier housekeeping) {
        this.roomAvailability = roomAvailability;
        this.billingService = billingService;
        this.keyCardEncoder = keyCardEncoder;
        this.housekeeping = housekeeping;
    }

    // Assigns an open room, bills total stay, encodes key card, and returns room number (or -1 if none available)
    public int checkInGuest(String guestName, String roomType, int nights) {
        int roomNumber = roomAvailability.allocateRoom(roomType);
        if (roomNumber == -1) {
            System.out.println("[Reception] No " + roomType + " rooms available for " + guestName + ".");
            return -1;
        }
        double total = roomAvailability.getNightlyRate(roomType) * nights;
        billingService.chargeStay(guestName, total);
        keyCardEncoder.encodeCard(roomNumber, guestName);
        System.out.println("[Reception] " + guestName + " checked into Room " + roomNumber + ".\n");
        return roomNumber;
    }

    // Releases the room and notifies housekeeping
    public void checkOutGuest(int roomNumber) {
        System.out.println("=== Checking Out Room " + roomNumber + " ===");
        roomAvailability.releaseRoom(roomNumber);
        housekeeping.alertCleaning(roomNumber);
    }
}