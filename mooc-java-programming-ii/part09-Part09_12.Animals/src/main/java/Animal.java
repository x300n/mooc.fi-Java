public abstract class Animal {
    private String name;
    
    public Animal(String newName){
        name = newName;
    }
    public void eat(){
        System.out.println(name + " eats");
    }
    public void sleep(){
        System.out.println(name + " sleeps");
        
    }
    public String getName(){
        return name;
    }
}