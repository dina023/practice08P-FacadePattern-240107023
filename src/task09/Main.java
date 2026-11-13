package task09;

// Client: Tests valid and rejected book checkouts and returns via LibraryCheckoutFacade
public class Main {
    public static void main(String[] args) {
        LibraryCheckoutFacade library = new LibraryCheckoutFacade(
                new MemberValidator(),
                new CatalogService(),
                new FineCalculator(),
                new LoanRecorder()
        );

        library.borrowBook("STU-102", "978-0134685991"); // Declined: unpaid fine
        library.borrowBook("STU-999", "978-0134685991"); // Declined: inactive student
        library.borrowBook("STU-101", "978-0134685991"); // Approved
        library.borrowBook("STU-103", "978-0134685991"); // Declined: book checked out
        library.returnBook("STU-101", "978-0134685991"); // Returned
        library.borrowBook("STU-103", "978-0134685991"); // Approved now
    }
}