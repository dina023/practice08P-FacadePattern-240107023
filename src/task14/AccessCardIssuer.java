package task14;
public class AccessCardIssuer {
    private int seq = 7000;
    public String issueRfidCard(String memberId) { return "RFID-" + (++seq) + "-" + memberId; }
}
