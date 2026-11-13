package task07;

// Client: Prints and exports a document through DocumentFacade
public class Main {
    public static void main(String[] args) {
        DocumentFacade docFacade = new DocumentFacade(
                new SpellChecker(),
                new PageFormatter(),
                new PdfConverter(),
                new PrinterSpooler()
        );

        docFacade.printCleanDocument("  Facade Pattern Lab Report  ");
        System.out.println();
        docFacade.exportAsPdf("  Facade Pattern Lab Report  ", "LabReport.pdf");
    }
}