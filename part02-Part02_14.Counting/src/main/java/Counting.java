
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        int end = Integer.valueOf(scanner.nextLine());
        int start= 0;
        
        for(int i = start; i <= end; i++){
            System.out.println(i);
        }

    }
}
