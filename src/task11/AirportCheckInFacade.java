package task11;
public class AirportCheckInFacade {
    private final TicketVerifier ticketVerifier;
    private final SeatAllocator seatAllocator;
    private final BaggageHandler baggageHandler;
    private final BoardingPassGenerator passGenerator;
    public AirportCheckInFacade(TicketVerifier tv, SeatAllocator sa, BaggageHandler bh, BoardingPassGenerator pg) {
        this.ticketVerifier = tv; this.seatAllocator = sa; this.baggageHandler = bh; this.passGenerator = pg;
    }
    public String completeCheckIn(String bookingRef, double bagWeightKg) {
        if (!ticketVerifier.isValid(bookingRef)) return "[Check-In Failed] Invalid booking reference: " + bookingRef;
        if (!baggageHandler.isWithinLimit(bagWeightKg)) return "[Check-In Failed] Bag weight " + bagWeightKg + " kg exceeds 23.0 kg limit.";
        String seat = seatAllocator.assignNextSeat();
        if (seat == null) return "[Check-In Failed] Flight is completely full.";
        String bagTag = baggageHandler.tagBag(bookingRef, bagWeightKg);
        return passGenerator.generate(bookingRef, ticketVerifier.getPassengerFlightInfo(bookingRef), seat, bagTag);
    }
}
