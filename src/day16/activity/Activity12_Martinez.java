package day16.activity;

import java.util.Scanner;

public class Activity12_Martinez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SELECT AN ACTIVITY ===");
        System.out.println("[1] Check Parity (Odd/Even)");
        System.out.println("[2] Repeat Name 50 Times");
        System.out.println("[3] Get Square Root");
        System.out.println("[4] Get Power of a Number");
        System.out.println("[5] Print a Random Number (1-100)");
        System.out.println("[6] Get Area of a Circle");
        System.out.println("[7] Check Voter Eligibility");
        System.out.println("[8] Get Length of a Word");
        System.out.println("[9] Reverse a Word");
        System.out.println("[10] Print Full Details");
        System.out.print("Enter your choice (1-10): ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("---------------------------------");

        switch (choice) {
            case 1:
                System.out.print("Enter an integer: ");
                int parityNum = scanner.nextInt();
                System.out.println("Result: " + parity(parityNum));
                break;
                
            case 2:
                System.out.print("Enter name to repeat: ");
                String repeatName = scanner.nextLine();
                repeat(repeatName);
                break;
                
            case 3:
                System.out.print("Enter a number: ");
                int sqNum = scanner.nextInt();
                System.out.println("Square Root: " + squareRoot(sqNum));
                break;
                
            case 4:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                double exponent = scanner.nextDouble();
                System.out.println("Result: " + getPower(base, exponent));
                break;
                
            case 5:
                System.out.println("Random Number: " + randomNum());
                break;
                
            case 6:
                System.out.print("Enter circle radius: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of Circle: " + areaCircle(radius));
                break;
                
            case 7:
                System.out.print("Enter age: ");
                int voterAge = scanner.nextInt();
                System.out.println("Status: " + isVoter(voterAge));
                break;
                
            case 8:
                System.out.print("Enter a word: ");
                String lengthWord = scanner.nextLine();
                System.out.println("Word Length: " + wordLength(lengthWord));
                break;
                
            case 9:
                System.out.print("Enter a word to reverse: ");
                String revWord = scanner.nextLine();
                System.out.print("Reversed Word: ");
                wordReversed(revWord);
                break;
                
            case 10:
                System.out.print("Enter First Name: ");
                String fName = scanner.nextLine();
                System.out.print("Enter Middle Name: ");
                String mName = scanner.nextLine();
                System.out.print("Enter Last Name: ");
                String lName = scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                fullDetail(fName, mName, lName, age);
                break;
                
            default:
                System.out.println("Invalid choice! Please select between 1 and 10.");
                break;
        }
        
        scanner.close();
    }
    
    // parity
    public static String parity (int x){
        if (x % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }
    
    // print name 50 times
    public static void repeat (String name){
        for(int i = 0; i < 50; i++){
            System.out.println((i + 1) + " " + name);
        }
    }
    
    // Square Root of a number
    public static double squareRoot (int x){
        return Math.sqrt(x);
    }
    
    // Power of a number using base and exponent
    public static double getPower(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    // Print a Random Number from 1-100
    public static int randomNum(){
        return (int) (Math.random() * 100) + 1;
    }
    
    // area of a Circle using Radius
    public static double areaCircle(double x){
        return Math.PI * Math.pow(x, 2);
    }
    
    // Identify if a person is a voter
    public static String isVoter(int x){
        if (x >= 18){
            return "Voter";
        } else {
            return "Not Voter";
        }
    }
    
    // length of a certain word
    public static int wordLength(String word){
        return word.length();
    }
    
    // print word in reversed order
    public static void wordReversed(String word){
        for (int i = word.length() - 1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
        System.out.println("");
    }
    
    // Print Full Name and Age
    public static void fullDetail(String fName, String mName, String lName, int age){
        System.out.println("Full Name: " + fName + " " + mName + " " + lName + "\nAge: " + age);
    }
}