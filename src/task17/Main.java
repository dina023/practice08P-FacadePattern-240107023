package task17;
public class Main {
    public static void main(String[] args) {
        WireTransferFacade wire = new WireTransferFacade(new ComplianceScreener(), new ExchangeRateService(), new AccountService(), new LedgerService());
        wire.executeTransfer("ACC-101", "ACC-202", 1000.0, "EUR");
        wire.executeTransfer("ACC-101", "ACC-FROZEN", 500.0, "EUR");
    }
}
