
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> list = new ArrayList<>();
        list.add("Nicole");
        list.add("Hercules");
        list.add("Rita");
        list.add("Joao");
        list.add("Fabio");
        
        System.out.println(list);
        removeLast(list);
        System.out.println(list);
        
    }

    public static void removeLast(ArrayList<String> strings) {
   int i = strings.size() -1;
    if (strings.size()== 0){
        return;
       }
    strings.remove(i);
    }
}
