/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xeon
 */
public class Fitbyte {
    
    private int age = 0;
    private int rhr = 0;
    
    public Fitbyte(int age, int rhr) {
        this.age = age;
        this.rhr = rhr;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        
        return (mhr(this.age) - this.rhr) * (percentageOfMaximum) + rhr;
    }
    public double mhr(int age){
        
        return 206.3 - (0.711 * this.age);
    }
    

    
}
