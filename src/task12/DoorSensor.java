package task12;
public class DoorSensor {
    private boolean closed;
    public void closeDoor() { this.closed = true; System.out.println("[DoorSensor] Washer door closed and latched."); }
    public void openDoor() { this.closed = false; System.out.println("[DoorSensor] Washer door opened."); }
    public boolean isClosed() { return closed; }
}
