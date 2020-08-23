
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");

            int oldest = Integer.valueOf(pieces[1]);
           for(int i= 0; i < pieces.length; i++) {
                if (answer < oldest) {
                    answer = oldest;
                }
            }
        }

        System.out.println(answer);
    }
}
