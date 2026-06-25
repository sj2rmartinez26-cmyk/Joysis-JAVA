
package day7.discussion;


public class ConditionalStatement {
    public static void main(String[] args) {
//        int num = -1;
//        String result = (num == 0) ? "Neutral"
//                : (num > 0) ? "Positive"
//                : (num > 100) ? "Number is Greater than 100"
//                : "Negative";
        
        
        //simple if / if-else / if-else-if ladder
        int num = 0;
        String numberType;
        
        if (num > 0) {
            numberType = "Positive";
        }else if(num<0) {
            numberType = "Negative";
        }else {
            numberType = "Neutral";
        }
        System.out.println(numberType);
        
        
        
        float temp = 38.5f;
        String tempResult;
        
        if(temp>=38.5){
            tempResult = "Fever";
        }else{
            tempResult = "Normal";
        }
        System.out.println(tempResult);
    }
}
