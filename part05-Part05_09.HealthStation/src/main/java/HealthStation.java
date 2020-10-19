 
public class HealthStation {
    private int numberWeighings = 0;
    
    public HealthStation(){
        this.numberWeighings =0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
       this.numberWeighings = this.numberWeighings +1;
        return person.getWeight() ;
        
       
    }
    
    public void feed(Person person){
     person.setWeight(person.getWeight()+1);
      
    }
   public int weighings(){
      return this.numberWeighings;
   }

}

