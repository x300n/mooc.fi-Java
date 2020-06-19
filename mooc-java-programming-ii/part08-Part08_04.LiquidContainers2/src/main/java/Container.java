public class Container {
    private int size;

    public Container() {
        this.size = 0;
    }
    
    public void add(int amount) { 
        if(amount > 0) {
            size += amount;
            if(size > 100) {
                size = 100;
            }
        }
    }
    
    public void remove(int amount) {
        size -= amount;
        if(size < 0) {
            size = 0;
        }
    }
    public int contains() {
        return this.size;
    }
    
    public String toString() {
        return this.size + "/100";
    }
    
}