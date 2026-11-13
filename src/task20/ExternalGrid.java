package task20;
public class ExternalGrid {
    private final double capKw;
    public ExternalGrid(double capKw) { this.capKw = capKw; }
    public double importPower(double req) { return Math.min(capKw, req); }
}
