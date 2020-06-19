
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        LicensePlate li4 = new LicensePlate("D", "B WQ-4331");
        
        String owner1 = "Arto";
        String owner2 = "Sarto";
        String owner3 = "Farto";
        
        VehicleRegistry car = new VehicleRegistry();
        car.add(li1, owner1);
        car.add(li2, owner2);
        car.add(li3, owner3);
        car.add(li4, owner1);
        
        car.printLicensePlates();
        car.printOwners();
        
    }
}
