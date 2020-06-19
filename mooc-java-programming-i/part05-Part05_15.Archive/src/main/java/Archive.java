/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xeon
 */
public class Archive {
    
    private String id;
    private String name;
    
    public Archive(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public boolean equals(Object c) {
        
        if(this == c)
            return true;
       
        if(!(c instanceof Archive))
            return false;
        
        Archive d = (Archive) c;
        
        if(this.id.equals(d.id))
            return true;
        return false;
    }
    
    public String toString(){
        return this.id + ": " + this.name;
    }
    
}
