
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
public class Suitcase {
   
    private ArrayList<Item> listItems ;
    private int maximumWeight;
    private int suitcaseWeight;
    private int numberItems;
    
    
    public Suitcase(int maximum){
        this.maximumWeight = maximum;
        this.listItems = new ArrayList<>();
        this.suitcaseWeight = 0;
        this.numberItems = 0;
        
    }
    
    public int getMaximumWeight(){
        return maximumWeight;
    }
    
    public void addItem(Item item){
    if(getMaximumWeight() >= this.suitcaseWeight + item.getWeight()){
        this.listItems.add(item);
        this.numberItems ++;
        this.suitcaseWeight = this.suitcaseWeight + item.getWeight();
    }
    }
    
 public Item printitems(){
     Item test = new Item();
     for(Item i : this.listItems){
         System.out.println(i);
         test = i;
     }
     return test;
 }
 
 public Item heaviestItem(){
     if(this.listItems.isEmpty()){
         return null;
     }
     Item theHeaviest = this.listItems.get(0);
     
     for(Item i : listItems){
         if(theHeaviest.getWeight() < i.getWeight()){
             theHeaviest = i;
         }
     }
     return theHeaviest;
 }
    
    public String toString(){
        if(this.listItems.isEmpty()){
            return "no items (" +this.suitcaseWeight +" kg)";
        }else if(this.numberItems == 1){
            return numberItems + " item (" +this.suitcaseWeight +" kg)";
        }else{
         return numberItems +" items " +"(" +this.suitcaseWeight +" kg)";   
        }
        
    }
    
    
    
    public int totalWeight(){
        return this.suitcaseWeight;
    }
    
}
