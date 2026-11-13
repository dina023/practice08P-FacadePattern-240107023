package task10;

// Subsystem 2: Processes guest stay charges
public class BillingService {
    public void chargeStay(String guestName, double totalAmount) {
        System.out.printf("[BillingService] Charged %s $%.2f for hotel stay.%n", guestName, totalAmount);
    }
}