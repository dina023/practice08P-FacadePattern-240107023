package task13;
import java.util.*;
public class AccountLedger {
    private final Map<String, Double> balances = new HashMap<>(Map.of("4400-1111", 500.0, "4400-2222", 2500.0));
    public boolean hasSufficientFunds(String cardNumber, double amount) { return balances.getOrDefault(cardNumber, 0.0) >= amount; }
    public void debit(String cardNumber, double amount) { balances.put(cardNumber, balances.get(cardNumber) - amount); }
}
