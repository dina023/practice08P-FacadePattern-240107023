package task09;

import java.util.Map;

// Subsystem 3: Tracks unpaid fine balances per student ID
public class FineCalculator {
    private final Map<String, Double> unpaidFines = Map.of(
            "STU-101", 0.0,
            "STU-102", 15.50,
            "STU-103", 0.0
    );

    public double getUnpaidFine(String studentId) {
        return unpaidFines.getOrDefault(studentId, 0.0);
    }
}