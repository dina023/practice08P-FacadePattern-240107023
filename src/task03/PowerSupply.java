package task03;

// Subsystem 1: Manages electrical power delivery to the computer
public class PowerSupply {
    public void supplyPower() {
        System.out.println("[PowerSupply] Delivering stable power to motherboard.");
    }

    public void cutPower() {
        System.out.println("[PowerSupply] Power cut off.");
    }
}