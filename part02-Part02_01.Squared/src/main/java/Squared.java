
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int x = Integer.valueOf(scanner.nextLine());
        int square = x * x;
        
        System.out.println(square);

    }
}
