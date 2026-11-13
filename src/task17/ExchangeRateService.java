package task17;
import java.util.Map;
public class ExchangeRateService {
    private final Map<String, Double> rates = Map.of("USD->EUR", 0.92, "EUR->USD", 1.09);
    public double convert(double amt, String from, String to) { return amt * rates.getOrDefault(from + "->" + to, 1.0); }
}
