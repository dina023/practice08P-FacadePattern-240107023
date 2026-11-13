package task11;
import java.util.Map;
public class TicketVerifier {
    private final Map<String, String> validBookings = Map.of(
            "KZ-8841", "Timur Akhmetov | Flight KC-901 (ALA -> LHR)",
            "KZ-5520", "Sara Nurlan | Flight KC-405 (NQZ -> FRA)"
    );
    public boolean isValid(String bookingRef) { return validBookings.containsKey(bookingRef); }
    public String getPassengerFlightInfo(String bookingRef) { return validBookings.get(bookingRef); }
}
