
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        SimpleDictionary book = new SimpleDictionary();
        TextUI novoTeste = new TextUI(scan, book);
        book.add("one", "yksi");
        book.add("two", "kaksi");
        
       novoTeste.start();
       
        
    }
}
