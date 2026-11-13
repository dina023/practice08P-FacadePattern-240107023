package task08;

// Subsystem 1: Checks battery voltage and manages accessory power
public class Battery {
    public void checkVoltage() {
        System.out.println("[Battery] Voltage nominal at 12.6V.");
    }

    public void disconnectAccessories() {
        System.out.println("[Battery] Accessory power cut.");
    }
}