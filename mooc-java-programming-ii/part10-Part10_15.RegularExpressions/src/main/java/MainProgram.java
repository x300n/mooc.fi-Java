
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        
        Checker o = new Checker();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        
        if(o.timeOfDay(str) || o.isDayOfWeek(str)) {
            System.out.println("The form is correct.");
            
        } else {
            System.out.println("The form is incorrect");
        }
    }
}
