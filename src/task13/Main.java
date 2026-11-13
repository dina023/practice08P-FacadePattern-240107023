package task13;
public class Main {
    public static void main(String[] args) {
        AtmFacade atm = new AtmFacade(new CardReader(), new PinAuthenticator(), new AccountLedger(), new CashDispenser(), new AuditLogger());
        atm.withdrawCash("4400-1111", 9999, 100.0);
        atm.withdrawCash("4400-1111", 1234, 200.0);
    }
}
