package task19;
public class VitalsMonitor {
    public void recordVitals(String name, int hr, int bp, double temp) {
        System.out.printf("[VitalsMonitor] %s: HR=%d, BP=%d, Temp=%.1fC%n", name, hr, bp, temp);
    }
}
