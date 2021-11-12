/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        //this.accountHolder = accountHolder;
        this.balance = openingBalance;
    }

    public String toString() {
            return "The card has a balance of " + this.balance + " euros";      
    }

    public void eatAffordably() {
        double price = 2.60;
        if (this.balance >= price) {
            this.balance -= price;
        } else {
            System.out.println("Not enough balance.");
        }
    }

    public void eatHeartily() {
        double price = 4.60;
        if (this.balance >= price) {
            this.balance -= price;
        } else {
            System.out.println("Not enough balance.");
        }

    }

    public void addMoney(double amount) {

        if (this.balance < 150 && amount > 0) {
            this.balance += amount;
        }
        if (this.balance > 150) {
            this.balance = 150;
        }
    }

}
