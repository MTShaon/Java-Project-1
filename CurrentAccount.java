
public class CurrentAccount extends BankAccount {

    String tradeLicenseNumber;

    CurrentAccount(String memberName, double accountBalance, double minimumBalance,String tradeLicenseNumber) {

        super(memberName, accountBalance, minimumBalance);

        this.tradeLicenseNumber = tradeLicenseNumber;
    }

}
