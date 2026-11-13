package task07;

// Facade: Coordinates spell-checking, formatting, printing, and PDF exporting
public class DocumentFacade {
    private final SpellChecker spellChecker;
    private final PageFormatter formatter;
    private final PdfConverter pdfConverter;
    private final PrinterSpooler spooler;

    public DocumentFacade(SpellChecker spellChecker, PageFormatter formatter,
                          PdfConverter pdfConverter, PrinterSpooler spooler) {
        this.spellChecker = spellChecker;
        this.formatter = formatter;
        this.pdfConverter = pdfConverter;
        this.spooler = spooler;
    }

    // Checks spelling, applies A4 margins, and sends to physical printer
    public void printCleanDocument(String text) {
        System.out.println("=== Printing Clean Document ===");
        String clean = spellChecker.checkAndClean(text);
        String formatted = formatter.applyA4Margins(clean);
        spooler.queuePrintJob(formatted);
    }

    // Checks spelling, applies A4 margins, and exports as PDF bytes
    public void exportAsPdf(String text, String fileName) {
        System.out.println("=== Exporting PDF: " + fileName + " ===");
        String clean = spellChecker.checkAndClean(text);
        String formatted = formatter.applyA4Margins(clean);
        byte[] pdfBytes = pdfConverter.convertToPdf(formatted);
        System.out.println("[DocumentFacade] Saved " + fileName + " (" + pdfBytes.length + " bytes).");
    }
}