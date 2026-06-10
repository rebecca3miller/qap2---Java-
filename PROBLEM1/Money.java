public class Money {
// Created class Money so that it can be used in the CreditCard class.

    // The Money class has two private instance variables: dollars and cents.
    private long dollars;
    private int cents;

    // CONSTRUCTORS

    public Money(double amount) 
    {
        // Default constructor that initializes dollars and cents to 0.
        this.dollars = (long) amount;
        this.cents = (int) ((amount - this.dollars) * 100);
    }

    public Money(Money otherObject) 
    {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount)
    {
        Money result = new Money();

        result.dollars = this.dollars + otherAmount.dollars;
        result.cents = this.cents + otherAmount.cents;
        return result;
    }

    public Money subtract(Money otherAmount)
    {
        Money result = new Money();
        result.dollars = this.dollars - otherAmount.dollars;
        result.cents = this.cents - otherAmount.cents;
        return result;
    }

    public int compareTo(Money otherObject)
    {
        if (this.dollars > otherObject.dollars) {
            return 1;
        } else if (this.dollars < otherObject.dollars) {
            return -1;
        } else {
            if (this.cents > otherObject.cents) {
                return 1;
            } else if (this.cents < otherObject.cents) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public boolean equals(Money otherObject)
    {
        return (this.dollars == otherObject.dollars) && (this.cents == otherObject.cents);
    }

    public String toString()
    {
        return String.format("$%d.%02d", dollars, cents);
    }

}