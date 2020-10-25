
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
public class Room {
    
    
    private ArrayList<Person> listPeople;
    
    public Room(){
        this.listPeople = new ArrayList<>();
    }
    
    public void add(Person person){
        this.listPeople.add(person);
    }
    
    /**
     *
     * @return
     */
    public boolean isEmpty(){
        
        if(this.listPeople.isEmpty()){
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return listPeople;
    }
    
    public Person shortest(){
        if (this.listPeople.isEmpty()){
            return null;
        }
        Person shortest = this.listPeople.get(0);
        
        for(Person x : this.listPeople){
            if(x.getHeight() < shortest.getHeight()){
                shortest = x;
            }
        }
        return shortest;
    }
    
    public Person take(){
       
       
       
       if(this.listPeople.isEmpty()){
           return null;
       }
        Person theShortest = shortest();
       this.listPeople.remove(theShortest);
       
       return theShortest;
    }
}
