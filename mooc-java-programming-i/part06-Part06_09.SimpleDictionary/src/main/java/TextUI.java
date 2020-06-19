
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xeon
 */
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    
    
    public void start(){
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if(command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                
                dict.add(word, translation);
                continue;
            } else if(command.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                
                if(dict.translate(word) == null) {
                    System.out.println("Word "+word+" was not found");
                } else {
                    System.out.println("Translation: " + dict.translate(word));
                }
                
                continue; 
            }
            
            System.out.println("Unknown command");
        }
        
        
    }
    
}
