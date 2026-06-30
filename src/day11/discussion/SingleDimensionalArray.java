
package day11.discussion;
import java.util.Scanner;

public class SingleDimensionalArray {
    
    public static void main(String[] args) {
        
        int[] ages = {24, 43, 35, 18, 28, 25};
        

        
        
        String[] names = {"Michael", "Kent", "Les", "Ray"};
        
        
        
//        System.out.println(names.length -1);
        
        
//        
//        for (int i = 0; i < names.length; i++){
//            System.out.println(names[i]);
//        }
//        
//        for (String name : names){
//            System.out.println(name);
//            System.out.println("For Loop");
//            for (int i = 0; i < ages.length; i++){
//            System.out.println("Age: " + ages[i]);
//            
//            
//            }
//            
//            System.out.println("\nFor each loop");
//                
//                for(int age:ages){
//                    System.out.println("Age: "+ age);
//                }
            
        Scanner scanner = new Scanner(System.in);
        
        String[] anime = new String[10];
        
        for (int i = 0; i< 10; i++){
            System.out.print("Enter Anime Tittle: ");
            anime[i] = scanner.nextLine();
        }
        
        System.out.println("\n Anime you Entered: ");
        for(String title:anime){
            System.out.println(title);
        }
        
    }
    }

