package task17;
public class WireTransferFacade {
    private final ComplianceScreener cs; private final ExchangeRateService fx;
    private final AccountService as; private final LedgerService ls;
    public WireTransferFacade(ComplianceScreener cs, ExchangeRateService fx, AccountService as, LedgerService ls) {
        this.cs = cs; this.fx = fx; this.as = as; this.ls = ls;
    }
    public boolean executeTransfer(String fromAcct, String toAcct, double amount, String targetCurrency) {
        if (!cs.passesCompliance(fromAcct, toAcct, amount)) { ls.recordEntry("REJECTED", fromAcct, toAcct, amount, targetCurrency); return false; }
        if (!as.debit(fromAcct, amount)) { ls.recordEntry("FAILED_FUNDS", fromAcct, toAcct, amount, targetCurrency); return false; }
        String srcCur = as.getCurrency(fromAcct);
        double converted = fx.convert(amount, srcCur, targetCurrency);
        if (!as.credit(toAcct, converted)) {
            as.refund(fromAcct, amount);
            ls.recordEntry("ABORTED_ROLLED_BACK", fromAcct, toAcct, amount, srcCur);
            return false;
        }
        ls.recordEntry("COMPLETED", fromAcct, toAcct, converted, targetCurrency);
        return true;
    }
}
