
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        

        PaymentCard annesCard = new PaymentCard(10);

        unicafeExactum.setAffordableMeals(6);
        
        System.out.println(annesCard.balance());
        System.out.println(unicafeExactum.getAffordableMeals());
        
        
      
    }
}

 