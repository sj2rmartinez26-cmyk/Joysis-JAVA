public class Main {
    public static void main(String[] args) {
        // Create a Savings Account (3.5% interest rate)
        SavingsAccount savings = new SavingsAccount("SAV-1001", "Roland Martinez", 1000.0, 0.035);
        
        // Create a Checking Account ($500 overdraft limit)
        CheckingAccount checking = new CheckingAccount("CHK-2002", "Ronald Gay Cruz", 250.0, 500.0);

        // Display Initial Info
        savings.displayAccountInfo();
        checking.displayAccountInfo();

        System.out.println("\n--- Processing Transactions ---");
        
        // Savings actions
        savings.deposit(200.0);
        savings.withdraw(1500.0); // Should fail (insufficient funds)
        savings.withdraw(300.0);  // Should succeed
        
        System.out.println();

        // Checking actions
        checking.withdraw(400.0);  // Should succeed (uses overdraft, goes to -$150)
        checking.withdraw(400.0);  // Should fail (would exceed -$500 limit)
        checking.deposit(150.0);   // Should bring balance back to $0.0

        System.out.println("\n--- Final Account Status ---");
        savings.displayAccountInfo();
        checking.displayAccountInfo();
    }
}