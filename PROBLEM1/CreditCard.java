public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money Limit, Money Money)
    {
        this.owner = newCardHolder;
        this.creditLimit = Limit;
        this.balance = Money;

    }

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
        if (balance.compareTo(creditLimit) < 0) {
            balance = balance + amount;
        } else {
            System.out.println("Charge denied: credit limit exceeded.");
        }
    }

    public void payment(Money amount)
    {
        balance = balance - amount;
    }
}
