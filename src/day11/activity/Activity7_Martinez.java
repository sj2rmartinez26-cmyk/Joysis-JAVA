
package day11.activity;

import java.util.Scanner;
public class Activity7_Martinez {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Enter 5 Numbers");
        for (int i = 0; i<5; i++){
            
            System.out.print("Number " + (i+1) +": ");
            num[i] = scanner.nextInt();
            
        }
        int lowest = num[0];
        int highest = num[0];
        int sum = 0;
        int count = 0;
        System.out.println("\nThe Numbers You've Entered are: ");
        for (int number:num){
            System.out.println("Index " + count +" : "+ number);
            if (number>highest){
                highest = number;
            }
            if (number<lowest){
                lowest = number;
            }
            sum = sum + number;
            count++;
        }
        double average = sum/5;
        System.out.println("\nThe Summation of all the Numbers is: " + sum);
        System.out.println("The Average of all the Number is : " + average );
        
        
        System.out.println("\nStretch Goal");
        System.out.println("The Highest Value Number is :"+ highest);
        System.out.println("The Lowest Value Number is :"+ lowest);
    }
    
}
