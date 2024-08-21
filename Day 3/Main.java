// Example usage of the BankAccount class
public class Main {
    public static void main(String[] args) {
        // Creating a new BankAccount object
        BankAccount myAccount = new BankAccount("123456789", 1000.0);

        // Accessing the account number (read-only)
        System.out.println("Account Number: " + myAccount.getAccountNumber());

        // Depositing money into the account
        myAccount.deposit(500.0);

        // Withdrawing money from the account
        myAccount.withdraw(200.0);

        // Checking the balance
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
