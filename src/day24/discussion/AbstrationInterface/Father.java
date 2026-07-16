/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day24.discussion.AbstrationInterface;

/**
 *
 * @author iwant
 */
public class Father implements Person{
    public void role(){
        System.out.println("I am a father. I provide "
                + "support and protect my family.");
    }

    @Override
    public void walk() {
        System.out.println("Walking ...");
       }

    @Override
    public void jump() {
        System.out.println("Jumping...");
        }
}
