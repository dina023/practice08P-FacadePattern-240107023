package task20;
public class BatteryBank {
    private double chargeKwh;
    public BatteryBank(double chargeKwh) { this.chargeKwh = chargeKwh; }
    public double discharge(double req) {
        double usable = Math.max(0.0, chargeKwh - 20.0); // 20% reserve of 100 kWh
        double s = Math.min(usable, req); chargeKwh -= s; return s;
    }
}
