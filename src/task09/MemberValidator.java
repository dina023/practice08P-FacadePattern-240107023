package task09;

import java.util.Set;

// Subsystem 1: Tracks active student IDs eligible to borrow library materials
public class MemberValidator {
    private final Set<String> activeStudents = Set.of("STU-101", "STU-102", "STU-103");

    public boolean isActive(String studentId) {
        return activeStudents.contains(studentId);
    }
}