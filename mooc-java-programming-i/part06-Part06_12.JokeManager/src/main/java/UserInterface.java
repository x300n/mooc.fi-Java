
import java.util.Scanner;


public class UserInterface {
    
    private Scanner scanner;
    private JokeManager jm;

    public UserInterface(JokeManager jm, Scanner scanner) {
        this.scanner = scanner;
        this.jm = jm;
    }
    
    
    
    public void start(){
        System.out.println("What a joke!");
        
        while (true) {
    
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();


            if (command.equals("X")) {
                break;
            }
            
            switch (command) {
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    jm.addJoke(joke);
                    break;
                case "2":
                    System.out.println("Drawing a joke.");
                    System.out.println(jm.drawJoke());
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    jm.printJokes();
                    break;
                default:
                    break;
            }
        }
    }
 }

