
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift:");
        int gift = Integer.valueOf(scan.nextLine());

        double tax1 = (100 + (gift - 5000) * 0.08);
        double tax2 = (1700 + (gift - 25000) * 0.10);
        double tax3 = (4700 + (gift - 55000) * 0.12);
        double tax4 = (22100 + (gift - 200000) * 0.15);
        double tax5 = (142100 + (gift - 1000000) * 0.17);

        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift >= 5000 && gift < 25000) {
            System.out.println("Tax: " + tax1);
        } else if (gift >= 25000 && gift < 55000) {
            System.out.println("Tax: " + tax2);
        } else if (gift >= 55000 && gift < 200000) {
            System.out.println("Tax: " + tax3);
        } else if (gift >= 200000 && gift < 1000000) {
            System.out.println("Tax: " + tax4);
        } else if (gift >= 1000000) {
            System.out.println("Tax: " + tax5);
        }

    }
}
