package task17;
import java.util.Set;
public class ComplianceScreener {
    private final Set<String> blocked = Set.of("ACC-999");
    public boolean passesCompliance(String from, String to, double amt) { return amt > 0 && !blocked.contains(from) && !blocked.contains(to); }
}
