
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try ( Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                String info = reader.nextLine();

                String[] parts = info.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                String year;
                if (age > 1 || age < 1) {
                    year = " years";
                } else {
                    year = " year";
                }

                System.out.println(name + "," + " age: " + age + year);
            }

        } catch (Exception e) {

        }

    }
}
