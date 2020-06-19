
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;
    
    public TodoList() {
    
        this.tasks = new ArrayList<>();
    
    }
    public void add(String task){
        tasks.add(task); 
    }
    
    public void print(){
        
        tasks.forEach((task) -> {
            System.out.println((tasks.indexOf(task)+1)+": "+task);
        });
    }
    
    public void remove(int number){
        if(number <= tasks.size() - 1){
            tasks.remove(tasks.indexOf(tasks.get(number - 1)));
        }
    }
    
    
}