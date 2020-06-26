/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xeon
 */
public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> r;

    public AverageSensor () {
        this.sensors = new ArrayList<Sensor>();
        this.r = new ArrayList<Integer>();
    }
    
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        
        for(Sensor s: sensors) {
            if(!s.isOn())
                return false;
        }
        
        return true;
    
    }

    @Override
    public void setOn() {
        for(Sensor s: sensors) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor s: sensors) {
            s.setOff();
        }
        
    }

    @Override
    public int read() {
        if(sensors.isEmpty() || !isOn())
            throw new IllegalStateException("No sensors are detected.");
        
        int avg = (int) sensors.stream().mapToInt(i -> i.read()).average().getAsDouble();
        this.r.add(avg);
        return avg;
    }
    
    public List<Integer> readings() {
  
        return this.r;
    }
    
    
    
    
}
