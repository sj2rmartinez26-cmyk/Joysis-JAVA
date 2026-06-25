
package day7.discussion;

import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
        //instantiation / create object of scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = input.nextLine(); // string input
        
        System.out.print("Enter Age: ");
        int age = input.nextInt();
        
        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();
        
        
        //output input by user
        
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: "+ salary);
        
    }
}
