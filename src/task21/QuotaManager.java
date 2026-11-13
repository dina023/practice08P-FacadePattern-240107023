package task21;
import java.util.*;
public class QuotaManager {
    private final Map<String, Integer> seats = new HashMap<>(Map.of("AI-Systems", 2));
    public boolean reserveWorkshopSeat(String track) {
        int s = seats.getOrDefault(track, 0); if (s <= 0) return false;
        seats.put(track, s - 1); return true;
    }
    public void releaseWorkshopSeat(String track) {
        seats.put(track, seats.getOrDefault(track, 0) + 1);
        System.out.println("[QuotaManager] Released workshop seat back to " + track);
    }
}
