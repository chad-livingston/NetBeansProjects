/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */
public class Fitbyte {
    //private int age;
    private double restingHeartRate;
    private double maxHeartRate;
    public Fitbyte(int age, int restingHeartRate){
        this.maxHeartRate = 206.3 - (0.711 * age);
        this.restingHeartRate = restingHeartRate;
    }
    public double targetHeartRate(double percentageOfMaximum){
        double targetHeartRate = (maxHeartRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
        return targetHeartRate;
    }
}
