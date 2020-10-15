
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.

        try ( Scanner reader = new Scanner(Paths.get(file))) {
            System.out.println("");
            System.out.println("Enter names, an empty line quits.");
            while (true) {
                
                String name = scanner.nextLine();

                while (reader.hasNextLine()) {

                    String word = reader.nextLine();
                    list.add(word);
                }

                if (name.isEmpty()) {
                    break;
                }
                ;
                if (list.contains(name)) {
                    System.out.println("The name is on the list.");
                } else {
                    System.out.println("The name is not on the list.");
                }
            }
        } catch (Exception e) {

        }

        System.out.println("Thank you!");
    }
}
