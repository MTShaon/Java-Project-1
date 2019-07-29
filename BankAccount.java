public class BankAccount {

    String memberName;

    String accountNumber;

    double accountBalance;

    double  minimumBalance;

    BankAccount(String memberName,double accountBalance,double  minimumBalance)
    {
        this.memberName = memberName;
        this.accountBalance = accountBalance;
        this.minimumBalance = minimumBalance;
        accountNumber = 10000 + (int)(Math.random()*89999) + "";
    }
   void deposit(double amount)
    {
        accountBalance = accountBalance+amount;
    }

    public void withdrow(double amount)
    {
        if (amount < accountBalance && (accountBalance-amount) >= minimumBalance )
        {
            accountBalance = accountBalance - amount;
        }
        else
        {
            System.out.println("\nInsufficient Balance!!!Please Check Balance!!!");
        }
    }

    public double getBalance()
    {
        return accountBalance ;
    }
    public void Display()
    {
        System.out.println("Member Name: "+memberName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Balance: "+accountBalance);
        System.out.println("Minimum Balance: "+minimumBalance);

    }

}
