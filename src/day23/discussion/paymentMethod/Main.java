/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day23.discussion.paymentMethod;

/**
 *
 * @author iwant
 */
public class Main {
    public static void main(String[] args) {
        Payment gcash = new GCashPayment();
        Payment creditCard = new CreditCardPayment();
        Payment cashPayment = new CashPayment();
        
        gcash.pay(500);
        creditCard.pay(1500);
        cashPayment.pay(200);
    }
}
