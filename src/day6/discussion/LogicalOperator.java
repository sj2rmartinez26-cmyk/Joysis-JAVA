
package day6.discussion;


public class LogicalOperator {
    public static void main(String[] args) {
        
        //Cinema logic
        boolean hasTicket = true;
        boolean hasVacinationCard = true;
        boolean isSeniorCitizen = false;
        boolean isStudent = true;
        boolean isLoggedIn = true;
        
        //may ticket -> pwede pumasok
        System.out.println("Allowed to Enter Cinema: " + (hasTicket && hasVacinationCard));
        //may ticket (student or senior citizen) -> discounted
        System.out.println("Eligible for Discount: " + (isStudent || isSeniorCitizen));
        //hindi nakalogged in sa app ->
        System.out.println("Cannot Reserve Sit: " + !isLoggedIn);
        
        
        
        
        
        
        //logical &&
//        int num = 100;
//        int num2 = 200;
//        //                 true          false
//        boolean result = num < num2 && num > num2;
        
//        System.out.println(result);
    }
    /*  &&          Result
            T   T       T
            T   F       F
            F   T       F
            F   F       F
        */
        
        /* ||           Result
            T   T       T
            T   F       T
            F   T       T
            F   F       F
        */
}
