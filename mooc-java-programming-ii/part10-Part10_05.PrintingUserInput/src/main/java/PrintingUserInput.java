
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<>();
        while(true) {
            String s = scanner.nextLine();
            
            if(s.equals("")) {
                break;
            }
            
            
            lst.add(s);
            
    
        }
        
        lst.forEach(s -> System.out.println(s));
    }
}
