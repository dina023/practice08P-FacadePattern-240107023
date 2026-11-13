package task03;

// Subsystem 4: Loads and halts the OS kernel
public class OperatingSystem {
    public void loadKernel() {
        System.out.println("[OperatingSystem] Loading OS kernel and user desktop.");
    }

    public void shutdown() {
        System.out.println("[OperatingSystem] Closing programs and halting kernel.");
    }
}