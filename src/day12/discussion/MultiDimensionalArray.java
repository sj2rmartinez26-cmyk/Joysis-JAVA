
package day12.discussion;


public class MultiDimensionalArray {
    public static void main(String[] args) {
        
        String[][] colors = {
            {"white", "yellow", "pink"},    //0
            {"black", "brown", "gray"},     //1
            {"green"}                       //2
        };
//        
//        System.out.println(colors[0].length);
//        for (int i = 0; i<colors.length; i++){
//            for (int j = 0; j<colors[i].length; j++){
//                System.out.println(colors[i][j]);
//            }
//            System.out.println("");
//        }
        
        for (String[] row:colors){
            for (String column:row){
                System.out.println(column);
            }
            System.out.println("");
        }
    
    }
    
    
 
}
//        String[][] planets = new String [rows][column];