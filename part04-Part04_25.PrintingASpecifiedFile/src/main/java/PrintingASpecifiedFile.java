
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(name))){
          while(reader.hasNextLine()){
              String word = reader.nextLine();
              System.out.println(word);
          }  
        }
      catch(Exception e){
          
      }
}
}
