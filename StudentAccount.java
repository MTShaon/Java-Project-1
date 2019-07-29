
public class StudentAccount extends SavingsAccount {

      String institutionName;

    StudentAccount(String memberName, double accountBalance, double minimumBalance, double AmountLimit,String institutionName) {

        super(memberName, accountBalance, minimumBalance, AmountLimit);

        this.institutionName =institutionName;
    }
}
