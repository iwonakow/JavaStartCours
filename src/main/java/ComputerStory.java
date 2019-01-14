public class ComputerStory {
    public static void main (String[]args) {

        Computer computer1 = new Computer(" Intel i5", 8192);
        Computer computer2 = new Computer("AMD Ryzen 1700", 16384);

        ComputerUpgrade computerUpgrade = new ComputerUpgrade();
        computerUpgrade.addMemory(computer1, 4096);
        computer1.printInfo();
        computer2.printInfo();

    }
}
