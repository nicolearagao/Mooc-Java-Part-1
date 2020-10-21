
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {

            System.out.println("Identifier?(empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name?(empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Archive single= new Archive(name, identifier);
           if(archives.contains(single)){
               
           }else{
               archives.add(single);
           }
           
            
        }
        System.out.println("==Items==");
        for (Archive i : archives) {
        System.out.println(i.toString());
        }
    }
}
