
package day9.activity;
import java.util.Scanner;


public class Activity5_3_Martinez {
    public static void main(String[] args) {
        
            //Activity 5.3
        System.out.println("Activity 5.3");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Initial Number: ");
        int initialNumber = input.nextInt();
        
        System.out.print("Enter Common Difference: ");
        int commonDiff = input.nextInt();
        
        System.out.print("Enter Number of Terms (N): ");
        int n = input.nextInt() - 1;
        
        int aSequenceSum = 1;

        System.out.print(initialNumber);
        for (int i = 1; i<=n; i++){
            initialNumber += commonDiff;
            aSequenceSum += initialNumber;
            System.out.print(" + " + initialNumber);
            
        }
         
        System.out.println(" = "+ aSequenceSum);
    }
}
