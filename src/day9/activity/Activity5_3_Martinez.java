
package day9.activity;


public class Activity5_3_Martinez {
    public static void main(String[] args) {
        
            //Activity 5.3
        System.out.println("Activity 5.3");
        int aSequenceSum = 1;
        int commonDiff = 5;
        int initialNumber = 1;
        System.out.print(initialNumber);
        for (int i = 1; i<=4; i++){
            initialNumber += commonDiff;
            aSequenceSum += initialNumber;
            System.out.print(" + " + initialNumber);
            
        }
         
        System.out.println(" = "+ aSequenceSum);
    }
}
