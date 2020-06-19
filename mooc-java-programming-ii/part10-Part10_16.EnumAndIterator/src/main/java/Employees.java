
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xeon
 */
public class Employees {
    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(p -> employees.add(p));
    }
    
    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()) 
            System.out.println(iterator.next());
    }
    
    
    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        while(iterator.hasNext()) {
                Person p = iterator.next();
                if (p.getEducation() == education)
                    System.out.println(p);
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().getEducation() == education)
                iterator.remove();
        }
    }
    
    
    
    
}
