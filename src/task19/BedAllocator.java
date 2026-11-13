package task19;
public class BedAllocator {
    private int icu = 1, er = 5, ward = 10;
    public String allocateBed(String p) {
        if ("CRITICAL".equals(p)) return icu > 0 ? "ICU-0" + (icu--) : "MONITORED-ER-0" + (er--);
        if ("URGENT".equals(p)) return "ER-BAY-0" + (er--);
        return "WARD-0" + (ward--);
    }
}
