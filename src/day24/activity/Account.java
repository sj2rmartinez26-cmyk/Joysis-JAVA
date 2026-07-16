

public abstract class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    // Constructor to initialize common fields
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayAccountInfo();

    // Getter for balance (handy for subclass transaction logic)
    public double getBalance() {
        return balance;
    }
}