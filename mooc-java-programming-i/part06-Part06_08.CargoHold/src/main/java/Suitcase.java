
import java.util.ArrayList;

public class Suitcase {
    
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if(totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }
    
    public void printItems() {
        for(Item i: items) {
            System.out.println(i);
        }
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for(Item i: items) {
            if(heaviest.getWeight() < i.getWeight()) {
                heaviest = i;
            }    
        }
        
        return heaviest;
    }
    
    public int totalWeight() {
        int totalItemWeight = 0;
        
        for(Item i: items) {
            totalItemWeight += i.getWeight();
        }
        return totalItemWeight;
    }

    public String toString(){
        int totalItemWeight = totalWeight();

        if(items.size() == 0) {
            return "no items (0 kg)";
        } else if(items.size() == 1) {
            return items.size() + " item (" 
                    + totalItemWeight + " kg)";
        }
        
        return items.size() + " items (" + totalItemWeight + " kg)";
    }
}
