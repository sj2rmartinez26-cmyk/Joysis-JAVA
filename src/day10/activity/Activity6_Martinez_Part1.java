
package day10.activity;

import java.util.Scanner;
public class Activity6_Martinez_Part1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int product;
        
        
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        System.out.println("Multiplication Table of " + num);
        for(int i = 1; i<=10; i++){
            
            System.out.println(num + " * "+ i + " = " + num*i);
        }
        
        
    }
}
