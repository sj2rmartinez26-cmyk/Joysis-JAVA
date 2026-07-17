/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.discussion.enumeration;

/**
 *
 * @author iwant
 */
public enum Day {
    
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    
}
class Printer{
    public static void main(String[] args) {
        for(Day day : Day.values()){
            System.out.println(day);
        }
    }
}