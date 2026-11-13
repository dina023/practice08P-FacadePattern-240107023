package task13;
public class CashDispenser {
    private double cashReserve = 1000.0;
    public boolean hasCash(double amount) { return amount > 0 && cashReserve >= amount; }
    public void dispense(double amount) { cashReserve -= amount; System.out.printf("[CashDispenser] Dispensed $%.2f%n", amount); }
}
