
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

    public Money plus(Money addition){
        Money newMoney = new Money(this.euros+addition.euros(), this.cents+addition.cents()); // create a new Money object that has the correct worth

        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared){
        if (this.euros < compared.euros()){
            return true;
        }
        if(this.euros == compared.euros()){
            if (this.cents < compared.cents()){
                return true;
            }
        }
        return false;
    }

    public Money minus(Money decreaser){
        int newEuro = this.euros-decreaser.euros(), newCent = this.cents-decreaser.cents();
        if (newEuro < 0){
            return new Money(0, 0);
        }

        if(newCent < 0){
            newCent = 100 + (newCent);
            newEuro -= 1;
        }
        // return the new Money object
        return new Money(newEuro, newCent);
    }
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
