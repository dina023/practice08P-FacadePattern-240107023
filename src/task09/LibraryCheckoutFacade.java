package task09;

// Facade: Validates member status, fines, and book availability before issuing loans
public class LibraryCheckoutFacade {
    private final MemberValidator memberValidator;
    private final CatalogService catalogService;
    private final FineCalculator fineCalculator;
    private final LoanRecorder loanRecorder;

    public LibraryCheckoutFacade(MemberValidator memberValidator, CatalogService catalogService,
                                 FineCalculator fineCalculator, LoanRecorder loanRecorder) {
        this.memberValidator = memberValidator;
        this.catalogService = catalogService;
        this.fineCalculator = fineCalculator;
        this.loanRecorder = loanRecorder;
    }

    // Borrows a book only if student is active, owes zero fines, and copy is available
    public boolean borrowBook(String studentId, String isbn) {
        if (!memberValidator.isActive(studentId)) {
            System.out.println("[Checkout Declined] Student " + studentId + " is not an active member.");
            return false;
        }
        double fine = fineCalculator.getUnpaidFine(studentId);
        if (fine > 0.0) {
            System.out.printf("[Checkout Declined] Student %s has unpaid fines of $%.2f.%n", studentId, fine);
            return false;
        }
        if (!catalogService.isAvailable(isbn)) {
            System.out.println("[Checkout Declined] Book ISBN " + isbn + " is currently unavailable.");
            return false;
        }

        catalogService.setAvailability(isbn, false);
        loanRecorder.recordLoan(studentId, isbn);
        return true;
    }

    // Restores book availability and logs the return
    public void returnBook(String studentId, String isbn) {
        catalogService.setAvailability(isbn, true);
        loanRecorder.recordReturn(studentId, isbn);
    }
}