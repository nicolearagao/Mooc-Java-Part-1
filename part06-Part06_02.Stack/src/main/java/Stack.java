
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicole
 */
public class Stack {
    private ArrayList<String> stack;
    
    public Stack(){
    this.stack = new ArrayList<>();
}
    
    public boolean isEmpty(){
        boolean isEmpty = true;
        for(String i : this.stack){
            if(i.isEmpty()){
                isEmpty = true;
            }else{
                isEmpty = false;
            }
        }
        return isEmpty;
    }
    
   public void add(String value){
       this.stack.add(value);
   }
   
   public ArrayList <String> values(){
       return stack;
   }
   
   public String take(){
       String take = this.stack.get(this.stack.size()-1);
       this.stack.remove(this.stack.size()-1);
       
       return take;
   }
}


            