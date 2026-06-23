
package day5.activity;


public class Activity2_Martinez {
    public static void main(String[] args) {
        
    double income = 50000;
    double foodAllowance = 15000;
    double transportation = 2500;
    double rent = 4500;
    double utilityBill = 3500;
    
    double expenses = foodAllowance + transportation + rent + utilityBill;
       
    foodAllowance = (foodAllowance/income) * 100;
    transportation = (transportation/income) * 100;
    rent = (rent/income) * 100;
    utilityBill = (utilityBill/income) * 100;
   
   
        System.out.printf("Income: %.0f%n", income);
        System.out.printf("Food Allowamce: %.1f%%%n" , foodAllowance);
        System.out.printf("Transportation: %.1f%%%n" , transportation);
        System.out.printf("Rent: %.1f%%%n" , rent);
        System.out.printf("Utility Bill: %.1f%%%n" , utilityBill);
         System.out.printf("Remaining Balance: %.0f%n" , (income-expenses));
    }

    
    
}
