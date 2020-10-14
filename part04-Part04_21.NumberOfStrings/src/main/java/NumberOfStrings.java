
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList <String> words = new ArrayList<>();
        
        while(true){
            String word = scanner.nextLine();
            
            if(word.equals("end")){
                break;
            }
            
            words.add(word);
        }
        
        int size = words.size();
        
        System.out.println(size);
    }
}
