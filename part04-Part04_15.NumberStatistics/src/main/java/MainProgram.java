
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        Statistics x= new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        int soma=0;
        int somaEven = 0;
        int somaOdd = 0;
        
       while(true){
         System.out.println("Enter numbers:"); 
         int z = Integer.valueOf(scanner.nextLine());
         
         if(z == -1){
             break;
         }
         
         x.addNumber(z);
         soma = x.sum();
         
         if(z % 2 == 0){
             even.addNumber(z);
             somaEven = even.sum();
             
         }else{
             odd.addNumber(z);
             somaOdd = odd.sum();
         }
         
       }
        System.out.println("Sum:" +soma);
        System.out.println("Sum of even numbers: " +somaEven);
        System.out.println("Sum of odd numbers: " +somaOdd);
        
        
        
        
        
    }
}
