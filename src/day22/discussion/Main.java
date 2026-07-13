/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day22.discussion;

/**
 *
 * @author iwant
 */
public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("Roland", "roland123@gmail.com", "roland123", "Admin");
        System.out.println(admin.getRoleInfo());
    
        StandardUser user = new StandardUser("Ronald", "ronaldgay123@gmail.com", "ronaldgay", "Standard User");
        System.out.println(user.getRoleInfo());
        
        System.out.println("Company Name: " + user.getCompanyName() );
        
    
    
    }
}
