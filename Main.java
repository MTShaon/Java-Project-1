
//import java.util.Scanner;
import javax.swing.*;
public class Main {
    public static void main(String[] args)
    {

        String k = JOptionPane.showInputDialog("Enter your name");
        String s = JOptionPane.showInputDialog(" 1. for SavingsAccount\n 2. for CurrentAccount\n 3. for StudentAccount");

        int x = Integer.parseInt(s);

        switch (x) {
            case 1: {

                SavingsAccount Account2 = new SavingsAccount(k  , 500, 1000, 2000);
                Account2.Display();
                do {
                    String L = JOptionPane.showInputDialog("Enter your option. \n\n 1. for Deposit. \n 2. for Withdraw. \n 3. for Display balance. \n 0. for exit.");
                    int y = Integer.parseInt(L);
                    switch (y) {
                        case 1: {
                            String A = JOptionPane.showInputDialog("Enter Deposit Amount: ");
                            Double Amount = Double.parseDouble(A);
                            Account2.deposit(Amount);
                            break;
                        }
                        case 2: {
                            String A = JOptionPane.showInputDialog("Enter Withdraw Amount: ");
                            Double Amount = Double.parseDouble(A);
                            Account2.withdrow(Amount);
                            break;
                        }
                        case 3: {
                            System.out.println("Balance: " + Account2.accountBalance);
                            break;
                        }
                        case 0: {
                            break;
                        }
                    }

                }while(true);
            }

            case 2:
            {   String p = JOptionPane.showInputDialog("Enter tradeLicenseNumber:");
                CurrentAccount Account1 = new CurrentAccount(k,1000,1000,p);
                Account1.Display();
                do {
                    String L = JOptionPane.showInputDialog("Enter your option. \n\n 1. for Deposit. \n 2. for Withdraw. \n 3. for Display balance. \n 0. for exit.");
                    int y = Integer.parseInt(L);
                    switch (y) {
                        case 1: {
                            String A = JOptionPane.showInputDialog("Enter Deposit Amount: ");
                            Double Amount = Double.parseDouble(A);
                            Account1.deposit(Amount);
                            break;
                        }
                        case 2: {
                            String A = JOptionPane.showInputDialog("Enter Withdraw Amount: ");
                            Double Amount = Double.parseDouble(A);
                            Account1.withdrow(Amount);
                            break;
                        }
                        case 3: {
                            System.out.println("Balance: " + Account1.accountBalance);
                            break;
                        }
                        case 0: {
                            break;
                        }
                    }
                    Account1.Display();
                    System.out.println("TradeLicense Number: "+Account1.tradeLicenseNumber);


                }while(true);
            }
            case 3:
            {
                String h = JOptionPane.showInputDialog("Institution Name: ");
                StudentAccount Account3 = new StudentAccount(k,200,200,5000,h);
                Account3.Display();
                do {
                    String L = JOptionPane.showInputDialog("Enter your option. \n\n 1. for Deposit. \n 2. for Withdraw. \n 3. for Display balance. \n 0. for exit.");
                    int y = Integer.parseInt(L);
                    switch (y) {
                        case 1: {
                            String A = JOptionPane.showInputDialog("Enter Deposit Amount: ");
                            Double Amount = Double.parseDouble(A);
                            Account3.deposit(Amount);
                            break;
                        }
                        case 2: {
                            String A = JOptionPane.showInputDialog("Enter Withdraw Amount: ");
                            double Amount = Double.parseDouble(A);
                            Account3.withdrow(Amount);
                            break;
                        }
                        case 3: {
                            System.out.println("Balance: " + Account3.accountBalance);
                            break;
                        }
                        case 0: {
                            break;
                        }
                    }
                    Account3.Display();
                    System.out.println("Institution Name: "+Account3.institutionName);
                }while(true);
            }
        }
    }
}
