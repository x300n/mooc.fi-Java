
import java.util.ArrayList;


public class Box implements Packable {
    
    private double weight;
    private ArrayList<Packable> items;
    
    public Box(double weight) {
        this.weight = weight;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable b) {
        if(b.weight() <= this.weight) {
            items.add(b);
            this.weight -= b.weight();
        }
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for(Packable i: items) {
            weight += i.weight();
        }
        
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
