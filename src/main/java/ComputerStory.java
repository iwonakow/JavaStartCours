public class ComputerStory {
    public static void main (String[]args) {
        ComputerFactory factory = new ComputerFactory();
        Computer computer1 = factory.create(" Intel i5", 8192);
        Computer computer2 = factory.create("AMD Ryzen 1700", 16384);

        ComputerUpgrade computerUpgrade = new ComputerUpgrade();
        computerUpgrade.addMemory(computer1, 4096);
        computer1.printInfo();
        computer2.printInfo();

    }
}
