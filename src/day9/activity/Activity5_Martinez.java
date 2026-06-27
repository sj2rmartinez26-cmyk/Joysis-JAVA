
package day9.activity;




import java.util.Scanner;

public class Activity5_Martinez {
    public static void main(String[] args) {
        
        //Activity 5.1
        Scanner input = new Scanner(System.in);
        
        System.out.println("Activity 5.1");
        System.out.print("Enter Number: ");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
            System.out.println("i = "+ i + ", sum = " + sum);
        }
        System.out.println("Final Sum: " + sum);
        
        
        
    }
}
