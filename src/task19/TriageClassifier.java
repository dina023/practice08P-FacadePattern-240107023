package task19;
public class TriageClassifier {
    public String classify(int hr, int bp, double temp) {
        if (hr > 130 || bp < 85 || temp >= 40.0) return "CRITICAL";
        if (hr > 105 || bp > 150 || temp >= 38.5) return "URGENT";
        return "STANDARD";
    }
}
