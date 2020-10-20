
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;

    }

    public void setAffordableMeals(int affordableMeals) {
        this.affordableMeals = affordableMeals;
    }

    public void setHeartyMeals(int heartyMeals) {
        this.heartyMeals = heartyMeals;
    }

    public int getAffordableMeals() {
        return affordableMeals;
    }

    public int getHeartyMeals() {
        return heartyMeals;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money = this.money + sum;
        }

    }

    public double eatAffordably(double payment) {

        if (payment >= 2.50) {
           this.money = this.money + 2.50;
           this.affordableMeals = this.affordableMeals +1;
            
            return payment - 2.50;

        } else {
            return payment;
        }

    }

    public double eatHeartily(double payment) {

        if (payment < 4.30) {
            this.money = this.money;
            
            return payment;
        } else {
            this.heartyMeals = this.heartyMeals +1;
            this.money = this.money + 4.30;
             
            return payment - 4.30;
        }

    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() < 2.50) {

            return false;
        }else{
          this.affordableMeals = this.affordableMeals +1;
         card.takeMoney(2.50);
        return true;  
        
        }
        
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() < 4.30) {
            return false;
        }else{
         this.heartyMeals = this.heartyMeals +1;
        card.takeMoney(4.30);
        return true;
        }
        
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals+ ", number of sold hearty meals: " + heartyMeals;
    }
}
