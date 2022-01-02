/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */
public class Container {
    private int currentAmount;
    
    public Container(){
        this.currentAmount = 0;
    }
    public int contains(){
        return this.currentAmount;
    }
    public void add (int amount){
        if (amount < 100 && currentAmount < 100 && amount > 0){
            this.currentAmount += amount;
        }
        if (currentAmount >= 100 || amount > 100){
            this.currentAmount = 100;
        }
        
    }
    public void set(int amount){
        this.currentAmount = amount;
    }
    public void remove(int amount){
        if (amount > currentAmount){
            this.currentAmount = 0;
        } else {
            this.currentAmount -= amount;
        }       
    }
    public String toString(){
        return this.currentAmount + "/100";
    }
}
