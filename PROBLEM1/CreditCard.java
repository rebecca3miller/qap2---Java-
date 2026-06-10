public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit, Money money)
    {
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = money;
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
            balance = balance.add(amount);
        } else {
            System.out.println("Charge denied: credit limit exceeded.");
        }
    }

    public void payment(Money amount)
    {
        balance = balance.subtract(amount);
    }
}
