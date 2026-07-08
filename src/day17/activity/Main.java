/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day17.activity;

import day17.activity.Motorcycle;

/**
 *
 * @author iwant
 */
public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.brand = "Honda";
        motorcycle.color = "Red";
        motorcycle.displacement = 150;
        motorcycle.weightInGrams = 113000;
        motorcycle.drive();
        motorcycle.race();
        motorcycle.stroll();
        
        System.out.println("Brand: " + motorcycle.brand);
        System.out.println("Color: " + motorcycle.color);
        System.out.println("Displacement: " + motorcycle.displacement + "cc");
        System.out.println("Weight in grams: " + motorcycle.weightInGrams + "g");
        
        Motorcycle motorcycle2 = new Motorcycle();
        motorcycle2.brand = "Yamaha";
        motorcycle2.color = "Black";
        motorcycle2.displacement = 155;
        motorcycle2.weightInGrams = 121000;
        motorcycle2.drive();
        
        Motorcycle motorcycle3 = new Motorcycle();
        motorcycle3.brand = "Suzuki";
        motorcycle3.color = "Blue";
        motorcycle3.displacement = 125;
        motorcycle3.weightInGrams = 93000;
    }
}
