import java.util.ArrayList;


public class Stack {
    
    private ArrayList<String> str ;
    
    public Stack() {
        this.str = new ArrayList<>();
    }

    
    public boolean isEmpty(){
        return this.str.isEmpty();    
    }
    
    public void add(String value){
        this.str.add(value);
    }
    
    public ArrayList<String> values(){   
        return this.str;
    }
    
    public String take() {
        int size = this.str.size();
        String helper = this.str.get(size - 1);
        this.str.remove(size - 1);
        
        return helper;
    }
}
