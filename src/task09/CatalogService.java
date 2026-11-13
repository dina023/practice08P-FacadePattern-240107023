package task09;

import java.util.HashMap;
import java.util.Map;

// Subsystem 2: Tracks book copy availability by ISBN
public class CatalogService {
    private final Map<String, Boolean> bookAvailability = new HashMap<>();

    public CatalogService() {
        bookAvailability.put("978-0134685991", true);  // Effective Java
        bookAvailability.put("978-0596007126", true);  // Head First Design Patterns
        bookAvailability.put("978-0132350884", false); // Clean Code (already checked out)
    }

    public boolean isAvailable(String isbn) {
        return bookAvailability.getOrDefault(isbn, false);
    }

    public void setAvailability(String isbn, boolean available) {
        if (bookAvailability.containsKey(isbn)) {
            bookAvailability.put(isbn, available);
        }
    }
}