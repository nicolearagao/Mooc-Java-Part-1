
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;

        while (true) {
            System.out.println("Give a number: (0 to quit)");
            int x = Integer.valueOf(scanner.nextLine());

            if (x == 0) {
                break;
            } else {
                sum = sum + x;
                numbers = numbers + 1;

            }
        }

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Number of numbers: " + numbers);
    }
}
