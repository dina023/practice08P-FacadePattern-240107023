package task19;
public class EmergencyAdmissionFacade {
    private final VitalsMonitor vm; private final TriageClassifier tc; private final BedAllocator ba;
    private final PharmacyDispenser pd; private final DoctorPager dp;
    public EmergencyAdmissionFacade(VitalsMonitor vm, TriageClassifier tc, BedAllocator ba, PharmacyDispenser pd, DoctorPager dp) {
        this.vm = vm; this.tc = tc; this.ba = ba; this.pd = pd; this.dp = dp;
    }
    public AdmissionRecord admitPatient(String patientName, int heartRate, int systolicBp, double tempC) {
        vm.recordVitals(patientName, heartRate, systolicBp, tempC);
        String priority = tc.classify(heartRate, systolicBp, tempC);
        String bed = ba.allocateBed(priority);
        String warning = ("CRITICAL".equals(priority) && bed.startsWith("MONITORED-ER")) ? "WARNING: ICU full, assigned monitored ER bay" : "None";
        return new AdmissionRecord(patientName, priority, bed, pd.preOrderMedication(priority), dp.pageSpecialist(priority), warning);
    }
}
