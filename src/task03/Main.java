package task03;

// Client: Boots and shuts down the computer through ComputerFacade
public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade(
                new PowerSupply(),
                new BIOS(),
                new HardDrive(),
                new OperatingSystem()
        );

        computer.startComputer();
        System.out.println();
        computer.shutDownComputer();
    }
}