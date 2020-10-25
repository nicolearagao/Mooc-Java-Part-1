
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;
    private int numberOfElements;
    
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
        this.numberOfElements = 0;
    }

    public void add(String element) {
        this.elements.add(element);
        this.numberOfElements ++;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public int getNumberOfElements(){
        return this.numberOfElements;
    }
    
    @Override
    public String toString(){
       String answer = "The collection " +this.name; 
       String number ="";
       
       
       if(this.numberOfElements == 1){
           number = " element:";
       }else{
           number = " elements:";
       }
        if(elements.isEmpty()){
           return answer +" is empty.";
       } 
        String whoThere = "";
        
        for(String collection : elements){
            if(elements.size()== 1){
               whoThere = elements.get(0); 
               break;
            }
            whoThere = whoThere + collection + "\n";
        }
        
        return answer +" has " +this.numberOfElements +number +"\n"
                +whoThere;
    }
    
}
