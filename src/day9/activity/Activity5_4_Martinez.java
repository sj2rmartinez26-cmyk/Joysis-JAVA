
package day9.activity;


public class Activity5_4_Martinez {
    public static void main(String[] args) {
        System.out.println("Activity 5.4");
        int aSequenceSum = 1;
        long aSequenceProd = 1;
        int commonDiff = 5;
        int initialNumber = 1;
        System.out.print(initialNumber);
        for (int i = 1; i<=9; i++){
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
