package task13;
import java.util.Set;
public class CardReader {
    private final Set<String> validCards = Set.of("4400-1111", "4400-2222");
    public boolean readCard(String cardNumber) { return validCards.contains(cardNumber); }
}
