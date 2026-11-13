package task02;

public class WaterHeater {
    public void heatWater(int celsius) {
        System.out.println("[WaterHeater] Heating water to " + celsius + "°C.");
    }

    public void dispenseHotWater(int ml) {
        System.out.println("[WaterHeater] Adding " + ml + "ml of extra hot water.");
    }
}