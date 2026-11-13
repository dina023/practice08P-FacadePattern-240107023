package task17;
import java.util.*;
public class AccountService {
    private final Map<String, Double> bal = new HashMap<>(Map.of("ACC-101", 5000.0, "ACC-202", 1200.0, "ACC-FROZEN", 300.0));
    private final Map<String, String> cur = Map.of("ACC-101", "USD", "ACC-202", "EUR", "ACC-FROZEN", "EUR");
    private final Set<String> frozen = Set.of("ACC-FROZEN");
    public String getCurrency(String a) { return cur.getOrDefault(a, "USD"); }
    public boolean debit(String a, double amt) {
        if (bal.getOrDefault(a, 0.0) < amt) return false;
        bal.put(a, bal.get(a) - amt); System.out.println("[AccountService] Debited " + amt + " from " + a); return true;
    }
    public boolean credit(String a, double amt) {
        if (!bal.containsKey(a) || frozen.contains(a)) { System.out.println("[AccountService] Destination frozen/invalid: " + a); return false; }
        bal.put(a, bal.get(a) + amt); System.out.println("[AccountService] Credited " + amt + " to " + a); return true;
    }
    public void refund(String a, double amt) { bal.put(a, bal.get(a) + amt); System.out.println("[AccountService] Refunded " + amt + " back to " + a); }
}
