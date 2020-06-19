
import java.util.ArrayList;


public class OneItemBox extends Box {
    
    private ArrayList<Item> items;
    
    public OneItemBox() {
        this.items = new ArrayList<>();
        
    }

    
    
    
    
    @Override
    public void add(Item item) {
       if(this.items.isEmpty())
           this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        for(Item i: items) {
            if(i.equals(item)) {
                return true;
            }
        }
        
        return false;
    }
    
    
    
    
}
