
public class Book implements Packable {
    
    private String author;
    private String bookName;
    private double weight;
    
    public Book(String author, String bookName, double weight) {
        
        this.author = author;
        this.bookName = bookName;
        this.weight = weight;
        
    }
    
    
    
    public double weight() {
        return this.weight;
    }
    
    public String toString() {
        return this.author + ": " + this.bookName;
    }
    
}
