
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
        
    private HashMap<String, ArrayList<String>> storageUnit;

    public StorageFacility() {
        this.storageUnit = new HashMap<>();
    }
    
    
    
    
    public void add(String unit, String item) {       
        if(!storageUnit.containsKey(unit)) {
            storageUnit.put(unit, new ArrayList<>());
            storageUnit.get(unit).add(item);
        } else {
            storageUnit.get(unit).add(item);
        }
    }
    
    public ArrayList<String> contents(String unit) {
        if(!storageUnit.containsKey(unit)) {
            return new ArrayList<>();
        }
        
        return storageUnit.get(unit);
    }
    
    public void remove(String unit, String item) {
        this.storageUnit.get(unit).remove(item);
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        
        for(String k: storageUnit.keySet()) {
            if(storageUnit.get(k).size() > 0) 
                units.add(k);
        }
        
        return units;
        
    }
    
    
    
}
