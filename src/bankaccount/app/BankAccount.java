
package bankaccount.app;

public class BankAccount {
    private int accountNumber;
    private double balance;

   //creates the bank account with given Acc number and initial balance
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    //returns bank account
    public double getBalance() {
        return balance;
    }

  //deposit given amount
    public void deposit(double amount) {
        balance += amount;
    }

    //withdraws specified amoun given thy have those fees
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}