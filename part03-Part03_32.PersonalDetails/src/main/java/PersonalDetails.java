
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int sum = 0;
         int number = 0;
         int length = 0;
         String name = "";
         
         while(true){
             String input = scanner.nextLine();
             
             if(input.equals("")){
                 break;
             }
             String [] pieces = input.split(",");
             
             int longest = pieces[0].length();
             
            for(int i= 0; i < pieces.length; i++){
                sum = sum + Integer.valueOf(pieces[1]);
                number ++;
                if(length < longest){
                    length = longest;
                    name = pieces[0];
                }
                
                
            }
         }
         System.out.println("Longest name: " +name);
         System.out.println("Average of the birth years: " +((1.0 * sum) / number));

    }
}
