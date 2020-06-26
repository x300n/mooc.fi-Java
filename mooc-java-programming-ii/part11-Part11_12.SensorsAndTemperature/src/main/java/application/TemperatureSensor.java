/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author xeon
 */
public class TemperatureSensor implements Sensor {
    
    
    private boolean op;
    
    public TemperatureSensor() {
        this.op = false;
    }
    
    

    @Override
    public boolean isOn() {
        
        return this.op;
        
    }

    @Override
    public void setOn() {
        this.op = true;
    }

    @Override
    public void setOff() {
        this.op = false;
    }

    @Override
    public int read() {
        
        if(isOn()) {
            int n = new Random().nextInt(61) - 30;
            return n;
        } else {
            throw new IllegalStateException("Sensor is off");
        }
        
    }
    
    
    
}
