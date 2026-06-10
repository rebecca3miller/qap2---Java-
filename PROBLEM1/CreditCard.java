public class CreditCard {

    // Private instance variables.
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // constructor.
    public CreditCard(Person newCardHolder, Money limit, Money money)
    {
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = money;
    }

    // getter method.
    public Money getBalance()
    {
        return balance;
    }

    public Money getCreditLimit()
    {
        return creditLimit;
    }

    public String getPersonals()
    {
        return owner.toString();
    }

    public void charge(Money amount)
    {
        Money newBalance = balance.add(amount);

        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount)
    {
        balance = balance.subtract(amount);
    }
}
