
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            int power = x * x;
            if (x < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            if (x == 0) {
                break;
            } else {
                System.out.println(power);
            }
        }

    }
}
