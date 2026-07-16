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
public class Child extends Person {
    @Override
    public void role(){
        System.out.println("I am a Child, I am the one being taken care of by my "
                + "parents and in the future I will take care of them too");
    }
}
