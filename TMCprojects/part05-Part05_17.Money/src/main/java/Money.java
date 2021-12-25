
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
        Money newMoney = new Money(this.euros + addition.euros(), this.cents + addition.cents());
        return newMoney;
    }

    public Money minus(Money decreaser) {

        //Money newMoney = new Money(this.euros, this.cents);
        int euroDiff = euros - decreaser.euros();
        int centDiff = cents - decreaser.cents();
        int totalDiffInCents = euroDiff * 100 + centDiff;
        
        if (totalDiffInCents <= 0){
            return new Money(0,0);
        } else {
            int euroRtn = totalDiffInCents / 100;
            int centRtn = totalDiffInCents % 100;
            return new Money(euroRtn, centRtn);
        }
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }

        if (this.euros == compared.euros()) {
            if (this.cents < compared.cents()) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
