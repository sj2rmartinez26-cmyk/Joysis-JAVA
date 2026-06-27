
package day8.discussion;
import java.util.Scanner;

public class VotersClassification {
    public static void main(String[] args) {
/*        Age: 0-12 -> Child
            Age 0-5 -> Specifically Toddler
            Age 6-12 -> Specifically Pre-Teen
          Age: 13-19 -> Teenager
            Age 13-15 -> Specifically Early-teen
            Age 16-19 -> Specifically Late-teen
          Age: 20-59 -> Adult
            Age 20-35 -> Specifically Young Adult
            Age 36-59 -> Specifically Middle-Age
          Age: 60-120 -> Senior Citizen
            Age 60-75 -> Specifically Young Senior
            Age 6-12 -> Specifically Elderly
*/ 

          Scanner input = new Scanner (System.in);
          System.out.println("Enter Age: ");
          int age = input.nextInt();
          
          if (age <= 12) {   // 0 - 12
            System.out.println("You are a child");
            if(age<=5){
                System.out.println("Specifically Toddler");
            }else {
                System.out.println("Specifically Pre-Teen");
            }
        } else if (age <= 19) { // 13 - 19
            System.out.println("You are teenager");
            if(age>=15){
                System.out.println("Specifically Early-teen ");
            }else {
                System.out.println("Specifically Late-teen");
            }
        } else if(age <= 59) { // 20 - 59
            System.out.println("You are an adult");
            if (age>=35){
                System.out.println("Specifically Young Adult");
            }else {
                System.out.println("Specifically Middle-Age");
            }
        } else if(age <= 120) { // 60 - 120
            System.out.println("You are senior citizen");
            if(age>=75){
                System.out.println("Specifically Young Senior");
            } else {
                System.out.println("Specifically Elderly");
            }
        } else {
            System.out.println("Invalid age entered.");
        }
          
    }
}
