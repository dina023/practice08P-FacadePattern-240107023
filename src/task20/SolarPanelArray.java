package task20;
public class SolarPanelArray {
    private double outputKw;
    public SolarPanelArray(double outputKw) { this.outputKw = outputKw; }
    public double drawPower(double req) { double s = Math.min(outputKw, req); outputKw -= s; return s; }
}
