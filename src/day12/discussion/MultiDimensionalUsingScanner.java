
package day12.discussion;

import java.util.Scanner;
public class MultiDimensionalUsingScanner {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] numbers = new int[2][5];
        for (int i = 0; i<numbers.length; i++){
            for (int j = 0; j<numbers[i].length; j++){
                System.out.println("Enter a Number: [" + i + "][" + j + "]:" );
                 numbers[i][j] = scanner.nextInt();
            }
            
        }
        System.out.println("\n Printing All the number: ");
        for (int[] row:numbers){
            for (int column:row){
                System.out.println(column);
            }
            System.out.println("");
        }
        
        
        
        
    }
    
}
