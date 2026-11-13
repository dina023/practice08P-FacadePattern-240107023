package task09;

// Subsystem 4: Logs book checkout and return transactions
public class LoanRecorder {
    public void recordLoan(String studentId, String isbn) {
        System.out.println("[LoanRecorder] Loan recorded: Student " + studentId + " borrowed ISBN " + isbn);
    }

    public void recordReturn(String studentId, String isbn) {
        System.out.println("[LoanRecorder] Return recorded: Student " + studentId + " returned ISBN " + isbn);
    }
}