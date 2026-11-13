package task11;
public class BaggageHandler {
    private static final double MAX_WEIGHT_KG = 23.0;
    public boolean isWithinLimit(double bagWeightKg) { return bagWeightKg >= 0 && bagWeightKg <= MAX_WEIGHT_KG; }
    public String tagBag(String bookingRef, double bagWeightKg) {
        String tag = "BAG-" + bookingRef + "-" + (int) (bagWeightKg * 10);
        System.out.println("[BaggageHandler] Tagged bag (" + bagWeightKg + " kg) with ID: " + tag);
        return tag;
    }
}
