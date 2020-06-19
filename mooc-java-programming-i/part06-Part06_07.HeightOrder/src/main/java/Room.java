import java.util.ArrayList;
public class Room {
    
    private ArrayList<Person> persons;

    public Room() {
    
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if(this.persons.isEmpty()) {
            return null;
        }
        
        Person returnShortest = this.persons.get(0);
        
        for(Person p: this.persons) {
            if(returnShortest.getHeight() > p.getHeight()) {
                returnShortest = p;
            }
        }
        
        return returnShortest; 
    }
    
    public Person take() {
        if(this.persons.isEmpty()){
            return null;
        }
        Person shortest = this.shortest();
        this.persons.remove(shortest);
        
        return shortest;
        
    }
    
    
}
