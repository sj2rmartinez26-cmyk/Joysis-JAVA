/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9.activity;

/**
 *
 * @author iwant
 */
public class Activity5_2_Martinez {
    public static void main(String[] args) {
          //Activity 5.2
          System.out.println("Activity 5.2");
        int product = 1;
        
        for (int i = 1; i<=5; i++){
            product *= i;
            System.out.println("i= " + i + ", product = " + product);
        }
    }
}
