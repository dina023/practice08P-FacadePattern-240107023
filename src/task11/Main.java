package task11;
public class Main {
    public static void main(String[] args) {
        AirportCheckInFacade checkIn = new AirportCheckInFacade(
                new TicketVerifier(), new SeatAllocator(), new BaggageHandler(), new BoardingPassGenerator());
        System.out.println(checkIn.completeCheckIn("KZ-8841", 26.5));
        System.out.println(checkIn.completeCheckIn("KZ-8841", 21.0));
    }
}
