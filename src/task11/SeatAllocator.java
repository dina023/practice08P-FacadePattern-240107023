package task11;
import java.util.*;
public class SeatAllocator {
    private final Queue<String> openSeats = new LinkedList<>(List.of("12A", "12B", "14F", "18C"));
    public String assignNextSeat() { return openSeats.poll(); }
}
