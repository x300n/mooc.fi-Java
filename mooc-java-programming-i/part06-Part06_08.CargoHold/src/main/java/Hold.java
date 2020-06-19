import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        
        int totalWeight = 0;
        
        for(Suitcase s: suitcases){
            totalWeight += s.totalWeight();
        }
        
        if(totalWeight + suitcase.totalWeight() <= maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public void printItems(){
        for(Suitcase s: suitcases) {
            s.printItems();
        }
    }
    
    public String toString() {
        int totalWeight = 0;
        
        for(Suitcase s: suitcases){
            totalWeight += s.totalWeight();
        }
        
        return suitcases.size() + " suitcases (" 
                + totalWeight + " kg)";
        
    }
    
}
