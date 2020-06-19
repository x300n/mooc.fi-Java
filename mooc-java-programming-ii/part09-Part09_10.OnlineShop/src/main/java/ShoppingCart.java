
import java.util.*;


public class ShoppingCart {
    
    private Map<String, Item> cart;
    
    public ShoppingCart () {
        this.cart = new HashMap<>();
    }
    
    
    public void add(String product, int price) {
       Item i = new Item(product, 1, price);
       if(cart.containsKey(product)) {
           cart.get(product).increaseQuantity();
       } else {
           this.cart.put(product, i);
       }
    }
    
    public int price() {
        
        int price = 0;
        for(Item i: cart.values()) {
            price += i.price();
        }
        return price;
    }
    
    public void print() {
        for(Item i: cart.values()) {
            System.out.println(i);
        } 
    } 
    
}
