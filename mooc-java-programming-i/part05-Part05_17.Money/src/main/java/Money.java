
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
        
        int euroAdd = euros+addition.euros();
        int centAdd = cents+addition.cents();
        
        return new Money(euroAdd, centAdd);
    }
    
    public boolean lessThan(Money compared) {
       if (this.euros < compared.euros()) {
            return true;
        } else if (this.euros > compared.euros) {
            return false;
        } else {
            return this.cents < compared.cents;
        }
    }
    
    public Money minus(Money decreaser) {
        int euroDiff = euros-decreaser.euros();
        int centDiff = cents-decreaser.cents();
        int totalDiffInCents = euroDiff*100 + centDiff;
        
        if(totalDiffInCents <= 0){
            return new Money(0,0);
        }else{
            int eurosRtn = totalDiffInCents/100;
            int centRtn = totalDiffInCents%100;
            return new Money(eurosRtn, centRtn);
        }

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
