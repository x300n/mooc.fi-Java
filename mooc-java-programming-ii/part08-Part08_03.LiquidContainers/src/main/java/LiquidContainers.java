
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstStorage = 0;
        int secondStorage = 0;
        String command = "";
        int amount = 0;
        

        while (true) {
            System.out.println("First: "+firstStorage+"/100\n" +
                             "Second: "+secondStorage+"/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            command = parts[0];
            amount = Integer.valueOf(parts[1]);
            
            if(amount > 0) {
                
                if(command.equals("add")) {    
                    if(amount >= 100 || (amount + firstStorage) >= 100)
                        firstStorage = 100;
                    else
                        firstStorage += amount;
                }

                if(command.equals("move")) {
                    if(amount >= firstStorage) {
                        if((secondStorage + firstStorage) >= 100) {
                            secondStorage = 100;
                        } else {
                            secondStorage += firstStorage;
                            firstStorage = 0;
                        }
                    } else {
                        if((secondStorage + amount) >= 100) {
                            secondStorage = 100;
                        } else {
                            secondStorage += amount;
                            firstStorage -= secondStorage;
                        }
                    }
                    
                }

                if(command.equals("remove")) {
                    if(amount >= secondStorage || (secondStorage - amount) < 0) {
                        secondStorage = 0;
                    } else {
                        secondStorage -= amount;
                    }
                }
            }
            
            System.out.println("");
        }
    }

}
