
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xeon
 */
public class ChangeHistory {
    
    private ArrayList<Double> changeHistory;
    
    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    
    }
    
    public void add(double status) {
        this.changeHistory.add(status);
    }
    
    public void clear() {
        this.changeHistory.clear();
    }
    
    public double maxValue() {
        if(changeHistory.isEmpty())
            return 0;
        
        
        
        double max = 0.0;
        
        for(double m: changeHistory) {
            if(max < m) {
                max = m;
            }
        }
        return max;
    }
    
    public double minValue() {
        
        if(changeHistory.isEmpty()) {
            return 0;
        }

        double min = changeHistory.get(0);
        
        for(double m: changeHistory) {
            if(min > m) {
                min = m;
            }
        }
        
        return min;
    }
    
    public double average() {
        
        if(changeHistory.isEmpty())
            return 0;
        double sum = 0.0;
        
        for(double m: changeHistory) {
            sum += m;
        }
        return sum/(1.0*changeHistory.size());
    }
    
    public String toString() {
        return this.changeHistory.toString();
    }
    
    
}
