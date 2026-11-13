package task03;

// Facade: Coordinates computer startup and shutdown sequences
public class ComputerFacade {
    private final PowerSupply powerSupply;
    private final BIOS bios;
    private final HardDrive hardDrive;
    private final OperatingSystem os;

    public ComputerFacade(PowerSupply powerSupply, BIOS bios, HardDrive hardDrive, OperatingSystem os) {
        this.powerSupply = powerSupply;
        this.bios = bios;
        this.hardDrive = hardDrive;
        this.os = os;
    }

    // Boots hardware and loads OS in strict sequence
    public void startComputer() {
        System.out.println("=== Starting Computer ===");
        powerSupply.supplyPower();
        bios.runPostDiagnostics();
        hardDrive.spinUpAndReadBootSector();
        os.loadKernel();
    }

    // Safely shuts down OS and cuts hardware power
    public void shutDownComputer() {
        System.out.println("=== Shutting Down Computer ===");
        os.shutdown();
        hardDrive.parkHeads();
        powerSupply.cutPower();
    }
}