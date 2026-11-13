package task12;
public class Main {
    public static void main(String[] args) {
        DoorSensor door = new DoorSensor();
        WashingMachineFacade washer = new WashingMachineFacade(door, new WaterValve(), new DetergentDispenser(), new DrumMotor(), new DrainPump());
        washer.runQuickWash();
        door.closeDoor();
        washer.runQuickWash();
        washer.runHeavyWash();
    }
}
