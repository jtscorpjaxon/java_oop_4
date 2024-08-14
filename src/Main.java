//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computers computer = new Computers("1TB", "Ryzen 7", "16GB");
        computer.print();
        PC pcComputer = new PC("1TB", "Ryzen 7", "16GB", "Katta shaffof","Suyuq");
        pcComputer.print();
        Laptop laptopComputer = new Laptop("1TB", "Ryzen 7", "16GB", "Asus", 1.5f, "45W","14","Diskret");
        laptopComputer.LaptopInfo();

        Subwoofer subwoofer = new Subwoofer("Sony", 1500, 21000000, "kochma", 4);
        subwoofer.printInfo();
        Loudspeaker loudspeaker = new Loudspeaker("Sony", 1500, 21000000, "ustunli");
        loudspeaker.printInfo();

        Lor lor = new Lor(1,"Olimjon","Otloringolog",5,"o'rta","a`lo","a'lo");
        lor.printInfo();
        Xirurg xirurg = new Xirurg(2,"Olimjon","Xirurg",5,"neyroxirurg");
        xirurg.printInfo();

    }
}