package task20;
public class MicrogridFacade {
    private final SolarPanelArray solar; private final BatteryBank battery; private final ExternalGrid grid;
    private final LoadController lc; private final TelemetryLogger tl;
    public MicrogridFacade(SolarPanelArray s, BatteryBank b, ExternalGrid g, LoadController lc, TelemetryLogger tl) {
        this.solar = s; this.battery = b; this.grid = g; this.lc = lc; this.tl = tl;
    }
    public EnergySummary balancePower(double demandKw) {
        double rem = demandKw;
        double fromSolar = solar.drawPower(rem); rem -= fromSolar;
        double fromBat = battery.discharge(rem); rem -= fromBat;
        double fromGrid = grid.importPower(rem); rem -= fromGrid;
        boolean shed = rem > 0.001;
        if (shed) { lc.shedNonEssentialCircuits(rem); tl.log("Deficit event: " + rem + " kW"); }
        else { tl.log("Demand balanced: " + demandKw + " kW"); }
        return new EnergySummary(demandKw, fromSolar, fromBat, fromGrid, rem, shed);
    }
}
