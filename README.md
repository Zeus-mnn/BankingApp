# BankingApp

This is a simple Java application that simulates a basic bank management system/banking app. It allows users to create customers, open accounts, make deposits, and withdraw money.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (like IntelliJ IDEA, Eclipse, or NetBeans) or a text editor and command line interface. I used NetBeans 22.

## Project Structure

The project consists of four Java files:

1. `Bank.java`: Represents the bank and manages customers
2. `Customer.java`: Represents a bank customer
3. `BankAccount.java`: Represents a bank account
4. `BankAccountApp.java`: Contains the main method and user interface

## How to Run the Code

### Using an IDE

1. Create a new Java project in your IDE.
2. Create four new Java classes named `Bank`, `Customer`, `BankAccount`, and `BankAccountApp`.
3. Copy and paste the provided code into each respective file.
4. Run the `Main` class.

### Using Command Line

1. Save each class in a separate file with the `.java` extension (e.g., `Bank.java`, `Customer.java`, `BankAccount.java`, and `BankAccountApp.java`).
2. Open a terminal or command prompt and navigate to the directory containing the Java files.
3. Compile the Java files using the following command:
   ```
   javac Bank.java Customer.java BankAccount.java BankAccountApp.java
   ```
4. Run the compiled program using:
   ```
   java BankAccountApp
   ```

## Using the Application

1. When prompted, enter a customer name or type 'exit' to quit the program.
2. If you entered a customer name, you'll be asked to provide an address for the customer.
3. You can then perform the following actions for each customer:
   - `open`: Open a new account (you'll be asked for an account number and initial balance)
   - `deposit`: Make a deposit into the account
   - `withdraw`: Withdraw money from the account
   - `exit`: Finish operations for the current customer and return to the main menu
4. The program will continue to run until you type 'exit' at the customer name prompt.

## Note

This is a simple console application for demonstration purposes. It does not include error handling for all possible scenarios and does not persist data between runs.
Enjoy!!!
