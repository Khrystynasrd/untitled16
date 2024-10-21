import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Details a1 = new Details("LX", "Lexus", 2020, "black", 200000, 16, 40);
        Box a2 = new Box(2, 4, 3);
        Transmission a4 = new Transmission(6, "Manual");

        Contain cont = new Contain(6,"Manual",true);
        cont.getAutomatic();



        // System.out.println(a1.getFullInfo());
        // System.out.println("cost per full tank"+a1.priceforafulltank(10));
        // double volume = a2.volume();
        //System.out.println(volume);
        System.out.println("Which transmission?");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println(a4.gearsinfo(i));





    }
}