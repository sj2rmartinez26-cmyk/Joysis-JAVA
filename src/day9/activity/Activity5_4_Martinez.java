
package day9.activity;

import java.util.Scanner;

public class Activity5_4_Martinez {
    public static void main(String[] args) {
        System.out.println("Activity 5.4");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Initial Number: ");
        int initialNumber = input.nextInt();
        
        System.out.print("Enter Common Difference: ");
        int commonDiff = input.nextInt();
        
        System.out.print("Enter Number of Terms (N): ");
        int n = input.nextInt() - 1;
        
        int aSequenceSum = 1;
        long aSequenceProd = 1;
        
        System.out.print(initialNumber);
        for (int i = 1; i<=n; i++){
            initialNumber += commonDiff;
            aSequenceSum += initialNumber;
            System.out.print(" + " + initialNumber);
            
        }
         
        System.out.println(" = "+ aSequenceSum);
        int initialNum = 1;
        System.out.print(initialNum);
        for (int j = 1; j<=9; j++){
            
            initialNum += commonDiff;
            aSequenceProd *= initialNum;
            System.out.print(" * " + initialNum);
        }
        System.out.println(" = "+ aSequenceProd);
    }
}
