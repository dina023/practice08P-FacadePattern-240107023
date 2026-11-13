package task20;
public class Main {
    public static void main(String[] args) {
        MicrogridFacade mg = new MicrogridFacade(new SolarPanelArray(30.0), new BatteryBank(45.0), new ExternalGrid(20.0), new LoadController(), new TelemetryLogger());
        System.out.println(mg.balancePower(50.0));
        System.out.println(mg.balancePower(40.0));
    }
}
