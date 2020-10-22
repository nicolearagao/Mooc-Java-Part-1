
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(16,50);
        Money b = new Money(18,50);
        
       
        
        
       Money c = a.minus(b);
       
        System.out.println(c);
    }
}
