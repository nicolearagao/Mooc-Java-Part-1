
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
public class Hold {
  
    private int maximumWeight;
    private ArrayList<Suitcase> listItems;
    private int currentWeight;
    private int numberSuitcases;
    
    public Hold(int max){
        this.maximumWeight = max;
        this.listItems = new ArrayList();
        this.currentWeight = 0;
        this.numberSuitcases = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() +this.currentWeight <= this.maximumWeight){
            this.listItems.add(suitcase);
            this.currentWeight = this.currentWeight + suitcase.totalWeight();
            this.numberSuitcases ++;
        }
    }
    public void printItems(){
        for (Suitcase i : this.listItems){
            System.out.println(i.printitems());
        }
    }
 
    @Override
    public String toString(){
        if(this.numberSuitcases == 1){
            return this.numberSuitcases + " suitcase (" +this.currentWeight +"kg)";
        }else{
           return this.numberSuitcases + " suitcases (" +this.currentWeight +"kg)";
        }
    }
}
