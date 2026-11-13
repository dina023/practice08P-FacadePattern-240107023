package task12;
public class WashingMachineFacade {
    private final DoorSensor doorSensor; private final WaterValve waterValve;
    private final DetergentDispenser dispenser; private final DrumMotor drumMotor; private final DrainPump drainPump;
    public WashingMachineFacade(DoorSensor ds, WaterValve wv, DetergentDispenser dd, DrumMotor dm, DrainPump dp) {
        this.doorSensor = ds; this.waterValve = wv; this.dispenser = dd; this.drumMotor = dm; this.drainPump = dp;
    }
    public void runQuickWash() {
        if (!doorSensor.isClosed()) { System.out.println("[WashingMachine] ERROR: Door is open!"); return; }
        System.out.println("=== Starting Quick Wash ===");
        waterValve.fillWater("cold"); dispenser.dispense("standard"); drumMotor.spin(15, "gentle"); drainPump.drainWater();
    }
    public void runHeavyWash() {
        if (!doorSensor.isClosed()) { System.out.println("[WashingMachine] ERROR: Door is open!"); return; }
        System.out.println("=== Starting Heavy Wash ===");
        waterValve.fillWater("warm"); dispenser.dispense("extra"); drumMotor.spin(45, "high-speed"); drainPump.drainWater();
    }
}
