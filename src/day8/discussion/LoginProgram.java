
package day8.discussion;

import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        //User login program
        String username = "admin";
        String password = "admin123";
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter username: "); // Ask user for username
        String loginUsername =  input.nextLine(); // Read user input and stores it to loginUsername variable
        System.out.print("Enter password: "); // Ask user for password
        String loginPassword = input.nextLine(); // Read user input and stores it to loginPassword variable
        
        
        //Check if both username and password match the predefined 
        
        if((loginUsername.equals(username) && loginPassword.equals(password))){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Failed");
        }
        input.close();
    }
    
    
}
