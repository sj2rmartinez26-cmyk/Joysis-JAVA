
import day24.activity.Transaction;




public class SavingsAccount extends Account implements Transaction {
    private double interestRate; // e.g., 0.03 for 3%

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("=== Savings Account Info ===");
        System.out.println("Holder: " + accountHolder);
        System.out.println("Account #: " + accountNumber);
        System.out.println("Balance: $" + String.format("%.2f", balance));
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.println("============================");
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to Savings Account. New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + " from Savings Account. New Balance: $" + balance);
            } else {
                System.out.println("Withdrawal failed! Insufficient funds in Savings.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}