package task13;
import java.util.Map;
public class PinAuthenticator {
    private final Map<String, Integer> cardPins = Map.of("4400-1111", 1234, "4400-2222", 9876);
    public boolean verifyPin(String cardNumber, int pin) { return cardPins.getOrDefault(cardNumber, -1) == pin; }
}
