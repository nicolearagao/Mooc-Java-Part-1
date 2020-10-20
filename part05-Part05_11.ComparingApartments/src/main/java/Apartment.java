
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares < compared.squares){
            return false;
        }
        return true;
    }
    
    public int priceCalculate(){
        int price = this.squares * this.princePerSquare;
        return price;
    }
    
    public int priceDifference(Apartment compared){
       if(this.priceCalculate() < compared.priceCalculate()){
           return compared.priceCalculate() - this.priceCalculate();
       }else{
           return this.priceCalculate() - compared.priceCalculate();
       }
       

           
       }
    public boolean moreExpensiveThan(Apartment compared){
        if(this.priceCalculate() > compared.priceCalculate()){
            return true;
        }
     return false;
    }
    

}
