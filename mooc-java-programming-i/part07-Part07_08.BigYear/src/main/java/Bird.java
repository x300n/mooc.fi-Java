
public class Bird {
    
    private String name;
    private String nameLatin;
    private int observations;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public String getNameLatin() {
        return nameLatin;
    }

    public void setObservations(int observations) {
        this.observations += observations;
    }
    
    
    
    public String toString() {
        
        return this.name + "("+ nameLatin +"): " +observations+ " observations";

    }
    
}
