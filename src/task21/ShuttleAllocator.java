package task21;
import java.util.*;
public class ShuttleAllocator {
    private final Map<String, Integer> routes = new HashMap<>(Map.of("North->Main", 1));
    public boolean reserveRoundTrip(String home, String event) {
        String r = home + "->" + event; int s = routes.getOrDefault(r, 0); if (s <= 0) return false;
        routes.put(r, s - 1); return true;
    }
}
