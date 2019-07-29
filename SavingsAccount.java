
public class SavingsAccount extends BankAccount{

      double Interest;

      double AmountLimit;

    SavingsAccount(String memberName, double accountBalance, double minimumBalance,double AmountLimit) {

        super(memberName, accountBalance, minimumBalance);

        this.AmountLimit = AmountLimit;
    }
   public double getBalanceWithInterest()
    {
        Interest = 12*(accountBalance*.05);

        accountBalance = accountBalance+ Interest;

        return accountBalance;
    }
    public void withdrow(double amount)
    {
        if ( accountBalance >amount && AmountLimit>=amount &&(accountBalance-amount) >= minimumBalance)
        {
            accountBalance = accountBalance - amount;
        }
        else
        {
            System.out.println("\nInsufficient Balance!!!Please Check Balance!!!");
        }
    }
}
