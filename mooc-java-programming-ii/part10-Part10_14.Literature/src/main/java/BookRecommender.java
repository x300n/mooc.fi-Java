/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xeon
 */
public class BookRecommender {
    
    private String name;
    private int age;

    public BookRecommender(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name+" (recommended for "+age+" year olds or older)"; 
    }
    
    
    
}
