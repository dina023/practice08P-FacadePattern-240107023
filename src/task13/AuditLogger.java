package task13;
public class AuditLogger {
    public void log(String card, double amount, boolean ok, String reason) {
        System.out.printf("[AuditLogger] [%s] Card %s | $%.2f | %s%n", ok ? "SUCCESS" : "REJECTED", card, amount, reason);
    }
}
