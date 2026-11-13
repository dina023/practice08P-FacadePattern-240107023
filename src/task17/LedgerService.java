package task17;
public class LedgerService {
    public void recordEntry(String status, String from, String to, double amt, String cur) {
        System.out.printf("[LedgerService] [%s] %s -> %s : %.2f %s%n", status, from, to, amt, cur);
    }
}
