
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Book)) {
            return false;
        }
        
        Book compareB = (Book) compared;
        
        if(this.name.equals(compareB.name)
                && this.publicationYear == compareB.publicationYear) {
            return true;
        }
        
        return false;
    }

}
