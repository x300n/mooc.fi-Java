
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> car = new HashMap<>();
    
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if(!car.containsKey(licensePlate)) {
            car.put(licensePlate, owner);
            return true;
        } 
        
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        if(!car.containsKey(licensePlate)) {
            
            return null;
        }
        return car.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if(!car.containsKey(licensePlate))
            return false;
        
        this.car.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates(){
        for(LicensePlate l: car.keySet()) {
            System.out.println(l);
        }
        
    }
    
    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();
        
        for(LicensePlate l: car.keySet()) {
            if(!printed.contains(car.get(l))) {
                printed.add(car.get(l));
                System.out.println(car.get(l));
            }
        }
        
        
        
    }
}
