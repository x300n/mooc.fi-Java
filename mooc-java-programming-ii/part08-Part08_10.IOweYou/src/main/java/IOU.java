
import java.util.HashMap;


public class IOU {
    private HashMap<String,Double> hm;
    
    public IOU() {
        
        this.hm = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
            this.hm.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return hm.getOrDefault(toWhom, 0.0);
    }
    
}
