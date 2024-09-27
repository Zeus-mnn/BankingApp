package bankaccount.app;

import java.util.Scanner;

public class BankAccountApp {

    
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("Enter customer name (or 'exit' to quit):");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter customer address:");
            String address = scanner.nextLine();

            Customer customer = new Customer(name, address);
            bank.addCustomer(customer);

            while (true) {
                System.out.println("Choose an action (open/deposit/withdraw/exit):");
                String action = scanner.nextLine();

                if (action.equalsIgnoreCase("exit")) {
                    break;
                }

                switch (action.toLowerCase()) {
                    case "open":
                        System.out.println("Enter account number:");
                        int accountNumber = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter initial balance:");
                        double initialBalance = Double.parseDouble(scanner.nextLine());
                        customer.openAccount(accountNumber, initialBalance);
                        System.out.println("Account opened successfully.");
                        break;
                    case "deposit":
                        if (customer.getAccount() == null) {
                            System.out.println("No account exists. Please open an account first.");
                            break;
                        }
                        System.out.println("Enter deposit amount:");
                        double depositAmount = Double.parseDouble(scanner.nextLine());
                        customer.getAccount().deposit(depositAmount);
                        System.out.println("Deposit successful. New balance: " + customer.getAccount().getBalance());
                        break;
                    case "withdraw":
                        if (customer.getAccount() == null) {
                            System.out.println("No account exists. Please open an account first.");
                            break;
                        }
                        System.out.println("Enter withdrawal amount:");
                        double withdrawAmount = Double.parseDouble(scanner.nextLine());
                        if (customer.getAccount().withdraw(withdrawAmount)) {
                            System.out.println("Withdrawal successful. New balance: " + customer.getAccount().getBalance());
                        } else {
                            System.out.println("Insufficient funds.");
                        }
                        break;
                    default:
                        System.out.println("Invalid action. Please try again.");
                }
            }
        }

        System.out.println("Thank you for using the Bank Management System.");
        scanner.close();
    }
    
}
