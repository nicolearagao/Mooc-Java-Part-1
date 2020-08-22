
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(360);
        list.add(-1);
        list.add(10000);
        
        System.out.println("The numbers in the range[300, 100000]");
       printNumbersInRange(list, 300, 100000);
    
       }
    public static void printNumbersInRange(ArrayList<Integer>numbers, int lowerLimit, int upperLimit){
        for (Integer value : numbers){
            if(value >= lowerLimit && value <= upperLimit){
                System.out.println(value);
            }
        }
    }
    
}
