
package day10.activity;


public class Activity6_Martinez_Part2 {
    public static void main(String[] args) {
        for (int i = 1; i<=12; i++){
            System.out.println("Multiplication Table of " + i);
            for (int j = 1; j<=10; j++){
                
                System.out.println(i + " * " + j + " = " + (i*j) );
            }
            System.out.println("\n");
        }
    }
}
