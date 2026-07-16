/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day24.discussion;

/**
 *
 * @author iwant
 */
public class Function {
    public void jump(){}
    
    public void jump(int noOfJump){}
    
    public void jump(double height){}
    
    public void jump(String animation){}
    
    public void jump(int noOfJump, double height){}
    
    public void jump(int noOfJump, double height, String animation){}
    
    public void jump(double height, String animation, int noOfJump){}
    public static void main(String[] args) {
        
    
    Function f = new Function();
    f.jump(10);
    }
}
