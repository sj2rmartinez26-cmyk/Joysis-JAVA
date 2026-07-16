/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day24.activity;

/**
 *
 * @author iwant
 */
public interface Transaction {
    
    void deposit(double amount);
    void withdraw(double amount);
    
}
