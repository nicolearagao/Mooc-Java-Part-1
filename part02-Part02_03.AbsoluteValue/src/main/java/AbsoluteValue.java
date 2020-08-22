
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int x = Integer.valueOf(scanner.nextLine());
        
        int condition1= x * -1;
        
        if ( x < 0){
            System.out.println(condition1);
        }else{
            System.out.println(x);
        }
        

    }
}
