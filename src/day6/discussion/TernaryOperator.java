    
package day6.discussion;


public class TernaryOperator {
    public static void main(String[] args) {
        
        //syntax
        //(condition) ? true block : false block;
        //check if the number is + or -
//        int num = -1;
//        String result = (num > 0) ? "Positive" : "Negative";
//        System.out.println(result);
        
        //Fever or normal temperature
        
        float temp = 38.5f;
        String tempResult = temp >= 38.5 ? "Fever" : "Normal Temp";
        
        System.out.println(tempResult);
        
        int num = -1;
        String result = (num == 0) ? "Neutral"
                : (num > 0) ? "Positive"
                : (num > 100) ? "Number is Greater than 100"
                : "Negative";
                
        System.out.println(result);
    }
}
