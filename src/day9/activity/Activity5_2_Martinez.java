
package day9.activity;



import java.util.Scanner;

public class Activity5_2_Martinez {
    public static void main(String[] args) {
          //Activity 5.2
          System.out.println("Activity 5.2");
          Scanner input = new Scanner(System.in);
          System.out.print("Enter Number: ");
        int n = input.nextInt();
        int product = 1;
        
        for (int i = 1; i<=n; i++){
            product *= i;
            System.out.println("i= " + i + ", product = " + product);
        }
        System.out.println("Final Product: " + product);
    }
}
