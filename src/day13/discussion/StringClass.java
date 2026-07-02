
package day13.discussion;

import java.util.Scanner;
public class StringClass {
    public static void main(String[] args) {
        int num = 10;
        
//        String word = "hello";
//        System.out.println(word.charAt(0));
//        
//        System.out.println("Enter Gender: ");
//        String gender = "Male";
//        char genderPrefix = gender.charAt(0);
//        System.out.println(genderPrefix);

//          String word = "Hello Java";
//          System.out.println(word.length());
//          
//          for (int i=0; i<word.length(); i++){
//              System.out.println(word.charAt(i));
//          }
//            String country = "Philippines";
//            System.out.println(country.toLowerCase());
//            System.out.println(country.toUpperCase());

//            String firstName = "Ronald Jay";
//            String lastName = " Mapagmahal";
//            
//            System.out.println(firstName.concat(lastName));
//            System.out.println(firstName + lastName);

//            String word = "pak";
//            String word2 = "pak";
//            
//            System.out.println(word.equals(word2));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you Sure that you want to exit? \n\t [Y] Yes \n \t [N] No");
            System.out.println("Enter your Choice");
            String choice = scanner.nextLine();
            
            if (choice.equalsIgnoreCase("Y")){
                System.out.println("Exiting...");
            }else if (choice.equalsIgnoreCase("N")) {
                System.out.println("Going Back to Main Menu");
            }else{
                System.out.println("invalid choice");
            }
            scanner.close();
            
            
    }
}
