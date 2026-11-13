package task10;

import java.util.*;

// Subsystem 1: Tracks available room numbers by type and nightly rates
public class RoomAvailability {
    private final Map<String, Queue<Integer>> availableRooms = new HashMap<>();
    private final Map<Integer, String> occupiedRoomTypes = new HashMap<>();
    private final Map<String, Double> nightlyRates = Map.of(
            "SINGLE", 80.0,
            "DOUBLE", 130.0,
            "SUITE", 260.0
    );

    public RoomAvailability() {
        availableRooms.put("SINGLE", new LinkedList<>(List.of(101, 102)));
        availableRooms.put("DOUBLE", new LinkedList<>(List.of(201, 202)));
        availableRooms.put("SUITE", new LinkedList<>(List.of(301)));
    }

    public int allocateRoom(String roomType) {
        Queue<Integer> rooms = availableRooms.get(roomType.toUpperCase());
        if (rooms == null || rooms.isEmpty()) {
            return -1;
        }
        int roomNumber = rooms.poll();
        occupiedRoomTypes.put(roomNumber, roomType.toUpperCase());
        return roomNumber;
    }

    public double getNightlyRate(String roomType) {
        return nightlyRates.getOrDefault(roomType.toUpperCase(), 0.0);
    }

    public void releaseRoom(int roomNumber) {
        String type = occupiedRoomTypes.remove(roomNumber);
        if (type != null) {
            availableRooms.get(type).offer(roomNumber);
            System.out.println("[RoomAvailability] Room " + roomNumber + " (" + type + ") returned to inventory.");
        }
    }
}