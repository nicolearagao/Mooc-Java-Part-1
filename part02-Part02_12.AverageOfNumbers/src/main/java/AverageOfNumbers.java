
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double number = 0;

        while (true) {
            System.out.println("Give a number: (0 to quit)");
            int x = Integer.valueOf(scanner.nextLine());

            if (x == 0) {
                break;
            } else {
                sum = sum + x;
                number = number + 1;
            }
        }
        double average = sum / number;
        System.out.println("Average of the numbers: " +average);
    }
}
0