
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        
        while (true) {
            System.out.println("First: "+firstContainer.contains()+"/100");
            System.out.println("Second: "+secondContainer.contains()+"/100");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
             String[] parts = input.split(" ");
             
            try {
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                
                if(command.equals("add") && amount > 0) {
                    firstContainer.add(amount);
                    
                } else if(command.equals("move") && amount > 0) {
                    int helper = firstContainer.contains();         
                    firstContainer.remove(amount);

                    if(firstContainer.contains() > 0) {
                        secondContainer.add(amount);
                        
                    } else if (firstContainer.contains() == 0) {
                        secondContainer.add(helper);
                    }            
                } else if(command.equals("remove") && amount > 0) {  
                    secondContainer.remove(amount);
                }       
                
            } catch(Exception e) {
                continue;
            }
            

        }
    }

}
