
package day15.activity;


public class Activity11_Martinez {
     public static void main(String[] args) {
        System.out.println("Lotto Numbers: ");
        
        int[] lottoNumbers = new int[6];
        
        for (int i = 0; i < 6; i++) {
            int randomNumber = (int) (Math.random() * 58) + 1;
            
          
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (lottoNumbers[j] == randomNumber) {
                    isDuplicate = true;
                    break; 
                }
            }
            
            
            if (isDuplicate) {
                i--; 
            } else {
                lottoNumbers[i] = randomNumber;
                System.out.println("[" + (i + 1) + "]: " + randomNumber);
            }
        }
    }
    
}
