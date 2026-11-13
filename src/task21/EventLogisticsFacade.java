package task21;
public class EventLogisticsFacade {
    private final EligibilityChecker ec; private final QuotaManager qm; private final WorkshopScheduler ws;
    private final ShuttleAllocator sa; private final BadgeGenerator bg;
    public EventLogisticsFacade(EligibilityChecker ec, QuotaManager qm, WorkshopScheduler ws, ShuttleAllocator sa, BadgeGenerator bg) {
        this.ec = ec; this.qm = qm; this.ws = ws; this.sa = sa; this.bg = bg;
    }
    public RegistrationResult registerAttendee(String studentId, String homeCampus, String eventCampus, String track) {
        if (!ec.isEligible(studentId)) return new RegistrationResult(false, studentId, track, "N/A", "NONE", "Ineligible");
        if (!qm.reserveWorkshopSeat(track)) return new RegistrationResult(false, studentId, track, "N/A", "NONE", "Track full");
        String shuttle = "Local (No Shuttle)";
        if (!homeCampus.equalsIgnoreCase(eventCampus)) {
            if (!sa.reserveRoundTrip(homeCampus, eventCampus)) {
                qm.releaseWorkshopSeat(track);
                return new RegistrationResult(false, studentId, track, "FULL", "NONE", "Shuttle full; workshop seat released");
            }
            shuttle = "Confirmed (" + homeCampus + "->" + eventCampus + ")";
        }
        return new RegistrationResult(true, studentId, track, shuttle, bg.generate(studentId, ws.getRoom(eventCampus, track)), "Confirmed");
    }
}
