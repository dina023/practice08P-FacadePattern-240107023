package task11;
public class BoardingPassGenerator {
    public String generate(String bookingRef, String passengerInfo, String seat, String bagTag) {
        return "=== BOARDING PASS | REF: " + bookingRef + " ===\n"
             + "PASSENGER & FLIGHT: " + passengerInfo + "\n"
             + "SEAT: " + seat + " | BAGGAGE TAG: " + bagTag + "\n";
    }
}
