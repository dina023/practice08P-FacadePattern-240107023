package task08;

// Subsystem 4: Illuminates and turns off instrument cluster gauges
public class DashboardDisplay {
    public void illuminateGauges() {
        System.out.println("[DashboardDisplay] Speedometer, RPM, and fuel gauges illuminated.");
    }

    public void turnOffGauges() {
        System.out.println("[DashboardDisplay] Dashboard display powered off.");
    }
}