
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;

    }

    public boolean lessThan(Money compared) {
        if (this == compared) {
            return true;
        }

        Money comparedMoney = (Money) compared;

        if (this.euros < comparedMoney.euros) {
            return true;
        } else if (this.euros == comparedMoney.euros && this.cents < comparedMoney.cents) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        int euros = 0;
        int cents = 0;

        if (this.euros > decreaser.euros && this.cents == 0) {
            euros = (this.euros - 1) - decreaser.euros;
            cents = (this.cents + 100) - decreaser.cents;

        } else if (this.euros < decreaser.euros || (this.euros == decreaser.euros && this.cents < decreaser.cents)) {
            euros = 0;
            cents = 0;
        } else if (this.euros == decreaser.euros && this.cents > decreaser.cents) {
            euros = 0;
            cents = this.cents - decreaser.cents;
        } else {
            euros = this.euros - decreaser.euros;
            cents = this.cents - decreaser.cents;
        }
        
        Money newMoney = new Money(euros, cents);
        return newMoney;
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
