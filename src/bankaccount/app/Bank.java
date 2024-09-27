package bankaccount.app;

import java.util.ArrayList;
import java.util.List;

//manages customers and their accounts
public class Bank {
    private List<Customer> customers;
    private int numOfCustomers;

    //Initialize new Bank with customer list
    public Bank() {
        customers = new ArrayList<>();
        numOfCustomers = 0;
    }

    
    public void addCustomer(Customer customer) {
        customers.add(customer);
        numOfCustomers++;
    }

  
    public List<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }
}
