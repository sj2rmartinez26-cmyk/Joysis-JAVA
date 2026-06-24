
package day6.activity;


public class Activity3_Martinez {
    public static void main(String[] args) {
        // number 2
        int age = 20;
        boolean hasValidID = true;
        
        
        System.out.println("Access Granted: " + (age >= 18 && hasValidID));
        
        
        //number 3
        boolean isWeekend = true;
        boolean isHoliday = false;
        
        System.out.println("No classes today: " + (isWeekend || isHoliday));
        
        
        //number4
        
        int score = 85;
        
        String status = (score >= 75) ? "Passed" : "Failed";
        System.out.println("Result: " + status);
        
        //number 5
        
        int num = 10, num2 = 25;
        
        String outcome = (num > num2) ? "The Larger number is: " + num : "The Larger Number is :" + num2; 
        
        System.out.println(outcome);
        
        //strech activity
        int number = 21;
        
        String parity = (number%2 == 0) ? "Even" : "Odd";
        
        System.out.println("Parity: " + parity);
    }
    
}
