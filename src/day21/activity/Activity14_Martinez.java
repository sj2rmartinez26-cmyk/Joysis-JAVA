package day21.activity;

import java.util.Scanner;

public class Activity14_Martinez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== User Account Registration ===");
        
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter Middle Name (Press Enter if none): ");
        String middleName = scanner.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        
        String email = "";
        while (true) {
            System.out.print("Enter Email (e.g., name@example.com): ");
            email = scanner.nextLine();
            if (UserAccount.isValidEmail(email)) {
                break;
            }
            System.out.println("Invalid email format. Please try again.\n");
        }
        
        String password = "";
        while (true) {
            System.out.print("Enter Password (Min 8 chars, 1 uppercase, 1 lowercase, 1 digit): ");
            password = scanner.nextLine();
            if (UserAccount.isValidPassword(password)) {
                break;
            }
            System.out.println("Weak password. Ensure it meets all criteria.\n");
        }
        
        UserAccount account = new UserAccount(firstName, middleName, lastName, address, email, password);
        
        System.out.println("\n==================================");
        System.out.println("   ACCOUNT CREATED SUCCESSFULLY   ");
        System.out.println("==================================");
        System.out.println("Full Name : " + account.getFullName());
        System.out.println("Email     : " + account.getEmail());
        System.out.println("Address   : " + account.getAddress());
        System.out.println("==================================");
        
        scanner.close();
    }
}