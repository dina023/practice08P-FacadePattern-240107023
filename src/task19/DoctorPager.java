package task19;
public class DoctorPager {
    public String pageSpecialist(String p) { return "CRITICAL".equals(p) ? "Dr. Sabina (ICU)" : "Dr. Elena (ER)"; }
}
