
package bankaccount.app;


public class Customer {
    private String name;
    private String address;
    private BankAccount account;

    //to add new customer
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    
    public String getName() {
        return name;
    }

   
    public String getAddress() {
        return address;
    }

   //create bank account for a new user
    public void openAccount(int accountNumber, double initialBalance) {
        account = new BankAccount(accountNumber, initialBalance);
    }

    //close account
    public void closeAccount() {
        account = null;
    }

    
    //return the account
    public BankAccount getAccount() {
        return account;
    }
}
