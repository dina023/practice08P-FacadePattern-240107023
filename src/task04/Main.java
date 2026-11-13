package task04;

// Client: Switches room between night and morning modes via SmartRoomFacade
public class Main {
    public static void main(String[] args) {
        SmartRoomFacade room = new SmartRoomFacade(
                new CeilingLight(),
                new Thermostat(),
                new WindowBlinds(),
                new DoorLock()
        );

        room.activateNightMode();
        System.out.println();
        room.activateMorningMode();
    }
}