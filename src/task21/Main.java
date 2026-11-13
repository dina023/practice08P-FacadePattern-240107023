package task21;
public class Main {
    public static void main(String[] args) {
        EventLogisticsFacade ef = new EventLogisticsFacade(new EligibilityChecker(), new QuotaManager(), new WorkshopScheduler(), new ShuttleAllocator(), new BadgeGenerator());
        System.out.println(ef.registerAttendee("STU-01", "North", "Main", "AI-Systems"));
        System.out.println(ef.registerAttendee("STU-02", "North", "Main", "AI-Systems"));
        System.out.println(ef.registerAttendee("STU-03", "Main", "Main", "AI-Systems"));
    }
}
