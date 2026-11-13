package task13;
public class AtmFacade {
    private final CardReader cr; private final PinAuthenticator pa; private final AccountLedger al;
    private final CashDispenser cd; private final AuditLogger log;
    public AtmFacade(CardReader cr, PinAuthenticator pa, AccountLedger al, CashDispenser cd, AuditLogger log) {
        this.cr = cr; this.pa = pa; this.al = al; this.cd = cd; this.log = log;
    }
    public boolean withdrawCash(String cardNumber, int pin, double amount) {
        if (!cr.readCard(cardNumber)) { log.log(cardNumber, amount, false, "Unrecognized card"); return false; }
        if (!pa.verifyPin(cardNumber, pin)) { log.log(cardNumber, amount, false, "Invalid PIN"); return false; }
        if (!al.hasSufficientFunds(cardNumber, amount)) { log.log(cardNumber, amount, false, "Insufficient funds"); return false; }
        if (!cd.hasCash(amount)) { log.log(cardNumber, amount, false, "ATM out of cash"); return false; }
        al.debit(cardNumber, amount); cd.dispense(amount); log.log(cardNumber, amount, true, "Completed"); return true;
    }
}
