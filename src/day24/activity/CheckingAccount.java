
import day24.activity.Transaction;






public class CheckingAccount extends Account implements Transaction {
    private double overdraftLimit; // maximum amount the account can go negative

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("=== Checking Account Info ===");
        System.out.println("Holder: " + accountHolder);
        System.out.println("Account #: " + accountNumber);
        System.out.println("Balance: $" + String.format("%.2f", balance));
        System.out.println("Overdraft Limit: $" + overdraftLimit);
        System.out.println("=============================");
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to Checking Account. New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            // Balance is allowed to go negative down to -overdraftLimit
            if (balance - amount >= -overdraftLimit) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + " from Checking Account. New Balance: $" + balance);
            } else {
                System.out.println("Withdrawal failed! Exceeds overdraft limit.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}