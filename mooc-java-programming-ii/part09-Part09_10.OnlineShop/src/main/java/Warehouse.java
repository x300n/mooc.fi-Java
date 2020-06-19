import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> stock;
    private Map<String, Integer> products;
    
    public Warehouse() {     
        this.products = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    
    public void addProduct(String product, int price, int stock) {
        this.stock.put(product, stock);
        this.products.put(product, price);
    }
    
    public int price(String product) {
        if(products.containsKey(product)) {
            return products.get(product);
        }
        return -99;
    }
    
    public int stock(String product) {
        if(stock.containsKey(product)) {
            return stock.get(product);
        } 
        return 0;
    }
    
    public boolean take(String product) {
        if(stock.containsKey(product)) {
            
            int stockValue = stock.get(product);
            stockValue -= 1;

            if(stockValue >= 0) {
                stock.put(product, stockValue);
                return true;
            }
        } 
        return false;
    }
    
    public Set<String> products() {
        Set<String> pSet = this.products.keySet();
        
        return pSet;
    }
    
}
