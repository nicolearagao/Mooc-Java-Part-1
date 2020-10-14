
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            System.out.println("Give us name of things: ");
            String things = scanner.nextLine();
            
            if(things.isEmpty()){
                break;
            }
            items.add(new Item(things));
        }
        
        for(Item x: items){
            System.out.println(x.toString());
        }

    }
}
