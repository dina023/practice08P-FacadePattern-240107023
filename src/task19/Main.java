package task19;
public class Main {
    public static void main(String[] args) {
        EmergencyAdmissionFacade er = new EmergencyAdmissionFacade(new VitalsMonitor(), new TriageClassifier(), new BedAllocator(), new PharmacyDispenser(), new DoctorPager());
        System.out.println(er.admitPatient("Patient A", 145, 78, 39.2));
        System.out.println(er.admitPatient("Patient B", 150, 80, 40.3));
    }
}
