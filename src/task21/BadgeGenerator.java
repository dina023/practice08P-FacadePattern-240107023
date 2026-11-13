package task21;
public class BadgeGenerator {
    private int seq = 500;
    public String generate(String id, String room) { return "BADGE-" + (++seq) + " [" + id + " @ " + room + "]"; }
}
