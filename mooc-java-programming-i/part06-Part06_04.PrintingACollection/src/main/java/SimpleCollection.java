
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String line = "";
        
        if(this.elements.size() > 1) {
        line = "The collection "+this.name+
                " has "+this.elements.size()+" elements:" + "\n";
        } else {
         line = "The collection "+this.name+
                " has "+this.elements.size()+" element:" + "\n";           
        }

        if(this.elements.isEmpty()) {
             return "The collection "+this.name+" is empty.";
        } 
        
        for(String s: this.elements) {
            line += s + "\n";

        }   
        
        return line.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
    }
    
}
