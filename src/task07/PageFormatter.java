package task07;

// Subsystem 2: Applies standard A4 document margins
public class PageFormatter {
    public String applyA4Margins(String text) {
        System.out.println("[PageFormatter] Applying standard A4 margins (25mm).");
        return "[A4-FORMATTED] " + text;
    }
}