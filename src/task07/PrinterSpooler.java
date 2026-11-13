package task07;

// Subsystem 4: Queues physical print jobs to the printer
public class PrinterSpooler {
    public void queuePrintJob(String formattedText) {
        System.out.println("[PrinterSpooler] Queued physical print job: \"" + formattedText + "\"");
    }
}