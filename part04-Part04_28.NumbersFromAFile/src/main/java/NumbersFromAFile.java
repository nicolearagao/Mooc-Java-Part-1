
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        
        String file = scanner.nextLine();
        
        int lowerBound = Integer.valueOf(scanner.nextLine());
        
        int upperBound = Integer.valueOf(scanner.nextLine());

        try ( Scanner reader = new Scanner(Paths.get(file))) {
            int total = 0;
            while (reader.hasNextLine()) {
                int x = Integer.valueOf(reader.nextLine());
                list.add(x);

            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= lowerBound && list.get(i) <= upperBound) {
                    total = total + 1;
                }
            }
            System.out.println("Numbers: " +total);
        } catch (Exception e) {

        }
    }
}
