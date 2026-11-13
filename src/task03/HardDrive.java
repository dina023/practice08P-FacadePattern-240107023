package task03;

// Subsystem 3: Handles disk spin-up, boot sector reading, and safe shutdown
public class HardDrive {
    public void spinUpAndReadBootSector() {
        System.out.println("[HardDrive] Spinning up disk and reading boot sector.");
    }

    public void parkHeads() {
        System.out.println("[HardDrive] Parking read/write heads safely.");
    }
}