
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.println("Give a number: (end with 0)");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 00) {
                break;
            } else {
                count = count + 1;
            }
        }
        System.out.println("Number of numbers: " + count);
    }
}
