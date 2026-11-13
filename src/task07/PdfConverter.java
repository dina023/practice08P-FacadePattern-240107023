package task07;

// Subsystem 3: Converts formatted text into PDF byte data
public class PdfConverter {
    public byte[] convertToPdf(String formattedText) {
        System.out.println("[PdfConverter] Encoding document into PDF byte stream.");
        return formattedText.getBytes();
    }
}