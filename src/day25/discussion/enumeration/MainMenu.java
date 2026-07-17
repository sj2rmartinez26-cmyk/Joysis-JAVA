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
public class MainMenu {
    enum Month{
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER,
        OCTOBER, NOVEMBER, DECEMBER
    }
    
    public static void main(String[] args) {
        Month currentMonth = Month.JANUARY;
        
        switch(currentMonth){
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                    System.out.println("Winter Season");
                    break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("Spring Season");
                    break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("Summer Season");
                    break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("Fall Season");
                    break;
            default: System.out.println("Invalid Month");
        }
    }
}
