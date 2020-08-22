
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negative = 0;

        while (true) {
            System.out.println("Give a number: (0 to exit)");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            if (number < 0) {
                negative = negative + 1;
            } else {
                continue;
            }
        }
        System.out.println("Number of negative numbers: " + negative);
    }
}
