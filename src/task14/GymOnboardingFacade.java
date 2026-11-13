package task14;
public class GymOnboardingFacade {
    private final ProfileRegistry pr; private final HealthScreening hs;
    private final LockerAssigner la; private final AccessCardIssuer ci;
    public GymOnboardingFacade(ProfileRegistry pr, HealthScreening hs, LockerAssigner la, AccessCardIssuer ci) {
        this.pr = pr; this.hs = hs; this.la = la; this.ci = ci;
    }
    public String registerNewMember(String name, int age, boolean medicalCleared) {
        if (!hs.isEligible(age, medicalCleared)) return "[Rejected] " + name + " ineligible (age 16+ & medical clearance required).";
        String id = pr.createProfile(name, age);
        return "Welcome " + name + "! ID: " + id + " | Locker #" + la.assignLocker() + " | Card: " + ci.issueRfidCard(id);
    }
}
