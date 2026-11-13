package task05;

// Subsystem 2: Processes customer payments
public class PaymentProcessor {
    public void charge(double amount) {
        System.out.printf("[PaymentProcessor] Charged customer $%.2f%n", amount);
    }
}