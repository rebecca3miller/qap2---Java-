public class Money {
// Created class Money so that it can be used in the CreditCard class.

    // The Money class has two private instance variables: dollars and cents.
    private long dollars;
    private int cents;

    // CONSTRUCTORS

    public Money(double amount) 
    {
        // Default constructor that initializes dollars and cents to 0.
        this.dollars = 0;
        this.cents = 0;
    }

    public Money(Money otherObject) 
    {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money(Money otherAmount)
    {
        return(otherAmount.dollars + otherAmount.cents);
    }

    public Money(Money otherAmount)
    {
        return(otherAmount.dollars - otherAmount.cents);
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

}