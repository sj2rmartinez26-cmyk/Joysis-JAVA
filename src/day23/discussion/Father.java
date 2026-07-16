/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day23.discussion;

/**
 *
 * @author iwant
 */
public class Father extends Person {
    /* @Override annotation tells the compiler that this
        method is overriding the method from parent.
    */
    @Override
    public void role(){
        System.out.println("I am a Father, I provide Money and Protection for my Family");
    }
}
