
public class Literacy {
    private String country;
    private int year;
    private String gender;
    private double rank;
    
    public Literacy(String country, int year, String gender, double rank) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.rank = rank;
    }

    public double getRank() {
        return rank;
    }
    
    public String toString(){
        return country+" ("+year+"), "+gender+", "+rank;
    }
    
}
